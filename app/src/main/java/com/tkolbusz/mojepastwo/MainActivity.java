package com.tkolbusz.mojepastwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.tkolbusz.mojepastwo.base.BaseView;
import com.tkolbusz.mojepastwo.base.IMainDisplay;
import com.tkolbusz.mojepastwo.list.SearchView;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainDisplay {
    private RecyclerView companiesListView;
    private ViewGroup container;
    private List<? extends BaseView> viewCache = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.container = new FrameLayout(this);
        setContentView(this.container);
        displayDefaultView();
    }

    private void displayDefaultView() {
        displayView(SearchView.class);
    }

    @Override
    public void displayError(Throwable error) {
        displayError(error.getMessage());
    }

    @Override
    public void displayError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void displayToastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public <T extends BaseView> T displayView(Class<T> viewClass) {
        T baseView = null;
        for (BaseView cachedBaseView : viewCache) {
            if (cachedBaseView.getClass() == viewClass) {
                baseView = ((T) cachedBaseView);
                break;
            }
        }
        if (baseView == null) {
            try {
                baseView = viewClass.getConstructor(IMainDisplay.class).newInstance(this);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(viewClass.getSimpleName() + " has no constructor with IMainDisplay as parameter");
            }
        }
        container.removeAllViewsInLayout();
        container.addView(baseView);
        return baseView;
    }
}

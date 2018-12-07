package com.tkolbusz.mojepastwo.base;

import android.content.Context;

import com.tkolbusz.mojepastwo.di.ApplicationComponent;

public interface IMainDisplay {
    void displayError(Throwable error);
    void displayError(String errorMessage);
    void displayToastMessage(String message);
    Context getContext();

    ApplicationComponent getComponent();

    <T extends BaseView> T displayView(Class<T> view);

    void dismiss();
}

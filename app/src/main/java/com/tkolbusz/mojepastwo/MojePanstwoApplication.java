package com.tkolbusz.mojepastwo;

import android.app.Application;
import android.content.Context;

import com.tkolbusz.mojepastwo.di.ApplicationComponent;
import com.tkolbusz.mojepastwo.di.DaggerApplicationComponent;

public class MojePanstwoApplication extends Application {
    private ApplicationComponent applicationComponent;

    public static ApplicationComponent getComponent(Context context) {
        return ((MojePanstwoApplication) context.getApplicationContext()).applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.create();
    }
}

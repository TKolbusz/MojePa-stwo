package com.tkolbusz.mojepastwo.base;

import android.content.Context;

public interface IMainDisplay {
    void displayError(Throwable error);
    void displayError(String errorMessage);
    void displayToastMessage(String message);
    Context getContext();

    <T extends BaseView> T displayView(Class<T> view);
}

package com.tkolbusz.mojepastwo.base;

import android.widget.FrameLayout;

import androidx.annotation.StringRes;

import org.jetbrains.annotations.NotNull;


public class BaseView extends FrameLayout {
    private final IMainDisplay mainDisplay;
    private Controller controller;

    public BaseView(@NotNull IMainDisplay mainDisplay) {
        super(mainDisplay.getContext());
        this.mainDisplay = mainDisplay;
    }

    protected String getString(@StringRes int res,Object... formatArgs){
        return getContext().getString(res,formatArgs);
    }

    protected IMainDisplay getMainDisplay() {
        return mainDisplay;
    }

    protected void setController(Controller controller) {
        this.controller = controller;
        controller.setView(this);
    }

    public void onDestroy() {
        if (controller != null) controller.setView(null);
    }

    //#region delegated methods
    protected void displayError(Throwable error){
        mainDisplay.displayError(error);
    }
    protected void displayError(String errorMessage){
        mainDisplay.displayError(errorMessage);
    }
    protected void displayToastMessage(String message){
        mainDisplay.displayToastMessage(message);
    }

    protected void dismiss() {
        mainDisplay.dismiss();
    }
    //#endregion


}

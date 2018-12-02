package com.tkolbusz.mojepastwo.base;

import org.jetbrains.annotations.Nullable;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class Controller<T extends BaseView> {
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Nullable
    private T view;

    protected void onViewInjected() {

    }

    protected T getView() {
        return view;
    }

    public void setView(@Nullable T view) {
        if (view != null) {
            if (this.view == null) {
                this.view = view;
                onViewInjected();
            }
        } else {
            compositeDisposable.clear();
            this.view = null;
        }
    }

    protected void registerDisposable(Disposable disposable) {
        compositeDisposable.add(disposable);
    }
}

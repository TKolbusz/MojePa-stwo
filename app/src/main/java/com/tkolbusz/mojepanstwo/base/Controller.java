package com.tkolbusz.mojepanstwo.base;

import org.jetbrains.annotations.Nullable;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class Controller<V> {
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Nullable
    private V view;

    protected void onViewInjected() {

    }

    protected V getView() {
        return view;
    }

    public void setView(@Nullable V view) {
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

package com.tkolbusz.domain.command;

import com.tkolbusz.domain.threading.IPostExecutionThread;
import com.tkolbusz.domain.threading.IThreadExecutor;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;

public abstract class Command<Result, Params> {
    private final IThreadExecutor threadExecutor;
    private final IPostExecutionThread postExecutionThread;
    private final boolean debug;
    private long startTime = 0;

    public Command(CommandData commandData) {
        this.threadExecutor = commandData.getThreadExecutor();
        this.postExecutionThread = commandData.getPostExecutionThread();
        this.debug = commandData.isDebug();
    }

    protected abstract Observable<Result> buildObservable(Params params);

    public Observable<Result> apply(Params params) {
        Observable<Result> resultObservable = buildObservable(params).subscribeOn(threadExecutor.getScheduler()).observeOn(postExecutionThread.getScheduler());
        if (debug) return resultObservable.compose(debugInfo());
        else return resultObservable;
    }

    private ObservableTransformer<Result, Result> debugInfo() {
        return upstream -> upstream.doOnSubscribe(__ -> startTime = System.currentTimeMillis()).doOnTerminate(() -> {
            long timeDiff = System.currentTimeMillis() - startTime;
            System.out.println(getClass().getSimpleName() + " took " + timeDiff + " ms");
        });
    }
}
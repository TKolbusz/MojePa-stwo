package com.tkolbusz.mojepanstwo.di;

import com.tkolbusz.data.BuildConfig;
import com.tkolbusz.data.threading.AsyncExecutor;
import com.tkolbusz.data.threading.DelayExecutor;
import com.tkolbusz.data.threading.MainThread;
import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.threading.IPostExecutionThread;
import com.tkolbusz.domain.threading.IThreadExecutor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Singleton
    @Provides
    IPostExecutionThread postExecutionThread() {
        return new MainThread();
    }

    public static final String ASYNC_EXECUTOR = "AsyncExecutor";
    public static final String DELAY_EXECUTOR = "DelayExecutor";

    @Named(ASYNC_EXECUTOR)
    @Singleton
    @Provides
    IThreadExecutor asyncExecutor() {
        return new AsyncExecutor();
    }

    @Named(DELAY_EXECUTOR)
    @Singleton
    @Provides
    IThreadExecutor delayExecutor() {
        return new DelayExecutor();
    }


    @Provides
    CommandData commandData(@Named(ASYNC_EXECUTOR) IThreadExecutor threadExecutor, IPostExecutionThread postExecutionThread) {
        return new CommandData(
                threadExecutor,
                postExecutionThread,
                BuildConfig.DEBUG
        );
    }
}

package com.tkolbusz.mojepastwo.di;

import com.tkolbusz.data.BuildConfig;
import com.tkolbusz.data.threading.AsyncExecutor;
import com.tkolbusz.data.threading.MainThread;
import com.tkolbusz.domain.command.CommandData;
import com.tkolbusz.domain.threading.IPostExecutionThread;
import com.tkolbusz.domain.threading.IThreadExecutor;

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

    @Singleton
    @Provides
    IThreadExecutor threadExecutor() {
        return new AsyncExecutor();
    }


    @Provides
    CommandData commandData(IThreadExecutor threadExecutor, IPostExecutionThread postExecutionThread) {
        return new CommandData(
                threadExecutor,
                postExecutionThread,
                BuildConfig.DEBUG
        );
    }
}

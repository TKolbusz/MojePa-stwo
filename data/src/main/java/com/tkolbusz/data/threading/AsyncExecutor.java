package com.tkolbusz.data.threading;

import com.tkolbusz.domain.threading.IThreadExecutor;

import java.util.concurrent.Executors;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class AsyncExecutor implements IThreadExecutor {
    @Override
    public Scheduler getScheduler() {
        return Schedulers.from(Executors.newFixedThreadPool(5));
    }
}

package com.tkolbusz.data.threading;

import com.tkolbusz.domain.threading.IThreadExecutor;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class DelayExecutor implements IThreadExecutor {
    @Override
    public Scheduler getScheduler() {
        return Schedulers.newThread();
    }
}

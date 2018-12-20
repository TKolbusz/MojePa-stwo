package com.tkolbusz.domain.threading;

import io.reactivex.Scheduler;

public interface IThreadExecutor {
    Scheduler getScheduler();
}
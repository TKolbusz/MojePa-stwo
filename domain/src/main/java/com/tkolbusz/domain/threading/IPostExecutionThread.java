package com.tkolbusz.domain.threading;

import io.reactivex.Scheduler;

public interface IPostExecutionThread {
    Scheduler getScheduler();
}

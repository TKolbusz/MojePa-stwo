package com.tkolbusz.domain.command;

import com.tkolbusz.domain.threading.IPostExecutionThread;
import com.tkolbusz.domain.threading.IThreadExecutor;

/**
 * data class to wrap basic dependencies for {@link Command}
 */
public class CommandData {
    private final IThreadExecutor threadExecutor;
    private final IPostExecutionThread postExecutionThread;
    private final boolean debug;

    public CommandData(IThreadExecutor threadExecutor, IPostExecutionThread postExecutionThread, boolean debug) {
        this.threadExecutor = threadExecutor;
        this.postExecutionThread = postExecutionThread;
        this.debug = debug;
    }

    public IPostExecutionThread getPostExecutionThread() {
        return postExecutionThread;
    }

    public IThreadExecutor getThreadExecutor() {
        return threadExecutor;
    }

    public boolean isDebug() {
        return debug;
    }
}

package org.junit.runners.model;

/* JADX INFO: loaded from: classes13.dex */
public interface RunnerScheduler {
    void finished();

    void schedule(Runnable runnable);
}

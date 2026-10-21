package com.huawei.hms.feature.tasks.listener;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class a<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f50569a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnFinishListener<TResult> f50570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f50571c;

    /* JADX INFO: renamed from: com.huawei.hms.feature.tasks.listener.a$a, reason: collision with other inner class name */
    public class RunnableC0228a implements Runnable {
        public RunnableC0228a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this.f50569a) {
                a.this.f50570b.onFinish();
            }
        }
    }

    public a(Executor executor, OnFinishListener<TResult> onFinishListener) {
        this.f50570b = onFinishListener;
        this.f50571c = executor;
    }

    public void a() {
        Executor executor;
        synchronized (this.f50569a) {
            try {
                OnFinishListener<TResult> onFinishListener = this.f50570b;
                if (onFinishListener == null) {
                    return;
                }
                if (!onFinishListener.needNotify() || (executor = this.f50571c) == null) {
                    return;
                }
                executor.execute(new RunnableC0228a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

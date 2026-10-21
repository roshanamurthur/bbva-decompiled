package com.huawei.hms.feature.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f50556a = new ExecutorC0227a();

    /* JADX INFO: renamed from: com.huawei.hms.feature.tasks.a$a, reason: collision with other inner class name */
    public static final class ExecutorC0227a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f50557a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f50557a.post(runnable);
        }
    }
}

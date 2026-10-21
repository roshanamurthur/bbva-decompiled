package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import uf.i;
import uf.r;
import uf.t;
import uf.u;
import uf.x;
import uf.y;
import uf.z;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseExecutors {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements Executor {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE;

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            $VALUES = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor directExecutor() {
        return a.INSTANCE;
    }

    public static Executor newLimitedConcurrencyExecutor(Executor executor, int i10) {
        return new r(executor, i10);
    }

    public static ExecutorService newLimitedConcurrencyExecutorService(ExecutorService executorService, int i10) {
        return new t(executorService, i10);
    }

    public static ScheduledExecutorService newLimitedConcurrencyScheduledExecutorService(ExecutorService executorService, int i10) {
        return new i(newLimitedConcurrencyExecutorService(executorService, i10), ExecutorsRegistrar.f47685d.get());
    }

    public static PausableExecutor newPausableExecutor(Executor executor) {
        return new u(executor);
    }

    public static PausableExecutorService newPausableExecutorService(ExecutorService executorService) {
        return new x(executorService);
    }

    public static PausableScheduledExecutorService newPausableScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return new y(newPausableExecutorService(scheduledExecutorService), ExecutorsRegistrar.f47685d.get());
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new z(executor);
    }
}

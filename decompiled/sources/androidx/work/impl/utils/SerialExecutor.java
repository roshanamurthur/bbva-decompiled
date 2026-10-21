package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class SerialExecutor implements Executor {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Executor f24627q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile Runnable f24629s0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayDeque<a> f24626p0 = new ArrayDeque<>();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f24628r0 = new Object();

    public static class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SerialExecutor f24630p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Runnable f24631q0;

        public a(@NonNull SerialExecutor serialExecutor, @NonNull Runnable runnable) {
            this.f24630p0 = serialExecutor;
            this.f24631q0 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SerialExecutor serialExecutor = this.f24630p0;
            try {
                this.f24631q0.run();
            } finally {
                serialExecutor.a();
            }
        }
    }

    public SerialExecutor(@NonNull Executor executor) {
        this.f24627q0 = executor;
    }

    public final void a() {
        synchronized (this.f24628r0) {
            try {
                a aVarPoll = this.f24626p0.poll();
                this.f24629s0 = aVarPoll;
                if (aVarPoll != null) {
                    this.f24627q0.execute(this.f24629s0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        synchronized (this.f24628r0) {
            try {
                this.f24626p0.add(new a(this, runnable));
                if (this.f24629s0 == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @VisibleForTesting
    public Executor getDelegatedExecutor() {
        return this.f24627q0;
    }

    public boolean hasPendingTasks() {
        boolean z10;
        synchronized (this.f24628r0) {
            z10 = !this.f24626p0.isEmpty();
        }
        return z10;
    }
}

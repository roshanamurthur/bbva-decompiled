package mj;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: HandlerScheduler.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends Scheduler {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Handler f83478r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f83479s0;

    /* JADX INFO: renamed from: mj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class C0467a extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f83480p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f83481q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f83482r0;

        public C0467a(Handler handler, boolean z10) {
            this.f83480p0 = handler;
            this.f83481q0 = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f83482r0 = true;
            this.f83480p0.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f83482r0;
        }

        @Override // io.reactivex.Scheduler.Worker
        @SuppressLint({"NewApi"})
        public final Disposable schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f83482r0) {
                return Disposables.disposed();
            }
            Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
            Handler handler = this.f83480p0;
            b bVar = new b(handler, runnableOnSchedule);
            Message messageObtain = Message.obtain(handler, bVar);
            messageObtain.obj = this;
            if (this.f83481q0) {
                messageObtain.setAsynchronous(true);
            }
            this.f83480p0.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f83482r0) {
                return bVar;
            }
            this.f83480p0.removeCallbacks(bVar);
            return Disposables.disposed();
        }
    }

    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class b implements Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f83483p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Runnable f83484q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f83485r0;

        public b(Handler handler, Runnable runnable) {
            this.f83483p0 = handler;
            this.f83484q0 = runnable;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f83483p0.removeCallbacks(this);
            this.f83485r0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f83485r0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f83484q0.run();
            } catch (Throwable th2) {
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public a(Handler handler, boolean z10) {
        this.f83478r0 = handler;
        this.f83479s0 = z10;
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker createWorker() {
        return new C0467a(this.f83478r0, this.f83479s0);
    }

    @Override // io.reactivex.Scheduler
    @SuppressLint({"NewApi"})
    public final Disposable scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        Handler handler = this.f83478r0;
        b bVar = new b(handler, runnableOnSchedule);
        Message messageObtain = Message.obtain(handler, bVar);
        if (this.f83479s0) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return bVar;
    }
}

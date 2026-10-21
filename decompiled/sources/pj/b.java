package pj;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import rj.d;

/* JADX INFO: compiled from: HandlerScheduler.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends Scheduler {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Handler f92683q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f92684r0;

    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class a extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f92685p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f92686q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f92687r0;

        public a(Handler handler, boolean z10) {
            this.f92685p0 = handler;
            this.f92686q0 = z10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f92687r0 = true;
            this.f92685p0.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f92687r0;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @SuppressLint({"NewApi"})
        public final Disposable schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f92687r0) {
                return d.a();
            }
            Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
            Handler handler = this.f92685p0;
            RunnableC0480b runnableC0480b = new RunnableC0480b(handler, runnableOnSchedule);
            Message messageObtain = Message.obtain(handler, runnableC0480b);
            messageObtain.obj = this;
            if (this.f92686q0) {
                messageObtain.setAsynchronous(true);
            }
            this.f92685p0.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f92687r0) {
                return runnableC0480b;
            }
            this.f92685p0.removeCallbacks(runnableC0480b);
            return d.a();
        }
    }

    /* JADX INFO: renamed from: pj.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class RunnableC0480b implements Runnable, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f92688p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Runnable f92689q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f92690r0;

        public RunnableC0480b(Handler handler, Runnable runnable) {
            this.f92688p0 = handler;
            this.f92689q0 = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f92688p0.removeCallbacks(this);
            this.f92690r0 = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f92690r0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f92689q0.run();
            } catch (Throwable th2) {
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public b(Handler handler, boolean z10) {
        this.f92683q0 = handler;
        this.f92684r0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Scheduler.Worker createWorker() {
        return new a(this.f92683q0, this.f92684r0);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @SuppressLint({"NewApi"})
    public final Disposable scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        Handler handler = this.f92683q0;
        RunnableC0480b runnableC0480b = new RunnableC0480b(handler, runnableOnSchedule);
        Message messageObtain = Message.obtain(handler, runnableC0480b);
        if (this.f92684r0) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
        return runnableC0480b;
    }
}

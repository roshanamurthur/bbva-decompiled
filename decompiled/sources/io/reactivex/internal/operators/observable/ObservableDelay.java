package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDelay<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72284p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f72285q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f72286r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f72287s0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72288p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72289q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f72290r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler.Worker f72291s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f72292t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72293u0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableDelay$a$a, reason: collision with other inner class name */
        public final class RunnableC0341a implements Runnable {
            public RunnableC0341a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f72288p0.onComplete();
                } finally {
                    aVar.f72291s0.dispose();
                }
            }
        }

        public final class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Throwable f72295p0;

            public b(Throwable th2) {
                this.f72295p0 = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f72288p0.onError(this.f72295p0);
                } finally {
                    aVar.f72291s0.dispose();
                }
            }
        }

        public final class c implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final T f72297p0;

            public c(T t10) {
                this.f72297p0 = t10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f72288p0.onNext(this.f72297p0);
            }
        }

        public a(Observer<? super T> observer, long j10, TimeUnit timeUnit, Scheduler.Worker worker, boolean z10) {
            this.f72288p0 = observer;
            this.f72289q0 = j10;
            this.f72290r0 = timeUnit;
            this.f72291s0 = worker;
            this.f72292t0 = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72293u0.dispose();
            this.f72291s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72291s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72291s0.schedule(new RunnableC0341a(), this.f72289q0, this.f72290r0);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72291s0.schedule(new b(th2), this.f72292t0 ? this.f72289q0 : 0L, this.f72290r0);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72291s0.schedule(new c(t10), this.f72289q0, this.f72290r0);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72293u0, disposable)) {
                this.f72293u0 = disposable;
                this.f72288p0.onSubscribe(this);
            }
        }
    }

    public ObservableDelay(ObservableSource<T> observableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(observableSource);
        this.f72284p0 = j10;
        this.f72285q0 = timeUnit;
        this.f72286r0 = scheduler;
        this.f72287s0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(this.f72287s0 ? observer : new SerializedObserver(observer), this.f72284p0, this.f72285q0, this.f72286r0.createWorker(), this.f72287s0));
    }
}

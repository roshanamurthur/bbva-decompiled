package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMergeWithCompletable<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f76874p0;

    public static final class a<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76875p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f76876q0 = new AtomicReference<>();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final C0412a f76877r0 = new C0412a(this);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicThrowable f76878s0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f76879t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f76880u0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableMergeWithCompletable$a$a, reason: collision with other inner class name */
        public static final class C0412a extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?> f76881p0;

            public C0412a(a<?> aVar) {
                this.f76881p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?> aVar = this.f76881p0;
                aVar.f76880u0 = true;
                if (aVar.f76879t0) {
                    HalfSerializer.onComplete(aVar.f76875p0, aVar, aVar.f76878s0);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?> aVar = this.f76881p0;
                DisposableHelper.dispose(aVar.f76876q0);
                HalfSerializer.onError(aVar.f76875p0, th2, aVar, aVar.f76878s0);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super T> observer) {
            this.f76875p0 = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this.f76876q0);
            DisposableHelper.dispose(this.f76877r0);
            this.f76878s0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f76876q0.get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76879t0 = true;
            if (this.f76880u0) {
                HalfSerializer.onComplete(this.f76875p0, this, this.f76878s0);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f76877r0);
            HalfSerializer.onError(this.f76875p0, th2, this, this.f76878s0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            HalfSerializer.onNext(this.f76875p0, t10, this, this.f76878s0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f76876q0, disposable);
        }
    }

    public ObservableMergeWithCompletable(Observable<T> observable, CompletableSource completableSource) {
        super(observable);
        this.f76874p0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        this.source.subscribe(aVar);
        this.f76874p0.subscribe(aVar.f76877r0);
    }
}

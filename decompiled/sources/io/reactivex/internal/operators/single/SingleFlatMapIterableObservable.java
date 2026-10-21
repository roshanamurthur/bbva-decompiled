package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapIterableObservable<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73497p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Iterable<? extends R>> f73498q0;

    public static final class a<T, R> extends BasicIntQueueDisposable<R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f73499p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends R>> f73500q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f73501r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile Iterator<? extends R> f73502s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f73503t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f73504u0;

        public a(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f73499p0 = observer;
            this.f73500q0 = function;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f73502s0 = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73503t0 = true;
            this.f73501r0.dispose();
            this.f73501r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73503t0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f73502s0 == null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73501r0 = DisposableHelper.DISPOSED;
            this.f73499p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73501r0, disposable)) {
                this.f73501r0 = disposable;
                this.f73499p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            Observer<? super R> observer = this.f73499p0;
            try {
                Iterator<? extends R> it = this.f73500q0.apply(t10).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                if (this.f73504u0) {
                    this.f73502s0 = it;
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.f73503t0) {
                    try {
                        observer.onNext(it.next());
                        if (this.f73503t0) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                observer.onComplete();
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            observer.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        observer.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                this.f73499p0.onError(th4);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final R poll() throws Exception {
            Iterator<? extends R> it = this.f73502s0;
            if (it == null) {
                return null;
            }
            R r3 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f73502s0 = null;
            }
            return r3;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f73504u0 = true;
            return 2;
        }
    }

    public SingleFlatMapIterableObservable(SingleSource<T> singleSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f73497p0 = singleSource;
        this.f73498q0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.f73497p0.subscribe(new a(observer, this.f73498q0));
    }
}

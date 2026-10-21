package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapIterableObservable<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77766p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Iterable<? extends R>> f77767q0;

    public static final class a<T, R> extends BasicIntQueueDisposable<R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f77768p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends R>> f77769q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77770r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile Iterator<? extends R> f77771s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f77772t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f77773u0;

        public a(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f77768p0 = observer;
            this.f77769q0 = function;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f77771s0 = null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77772t0 = true;
            this.f77770r0.dispose();
            this.f77770r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77772t0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f77771s0 == null;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77770r0 = DisposableHelper.DISPOSED;
            this.f77768p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77770r0, disposable)) {
                this.f77770r0 = disposable;
                this.f77768p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            Observer<? super R> observer = this.f77768p0;
            try {
                Iterator<? extends R> it = this.f77769q0.apply(t10).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                if (this.f77773u0) {
                    this.f77771s0 = it;
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.f77772t0) {
                    try {
                        observer.onNext(it.next());
                        if (this.f77772t0) {
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
                this.f77768p0.onError(th4);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final R poll() {
            Iterator<? extends R> it = this.f77771s0;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f77771s0 = null;
            }
            return next;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f77773u0 = true;
            return 2;
        }
    }

    public SingleFlatMapIterableObservable(SingleSource<T> singleSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f77766p0 = singleSource;
        this.f77767q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.f77766p0.subscribe(new a(observer, this.f77767q0));
    }
}

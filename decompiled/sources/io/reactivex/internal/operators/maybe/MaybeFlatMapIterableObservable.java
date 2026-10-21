package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapIterableObservable<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71639p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Iterable<? extends R>> f71640q0;

    public static final class a<T, R> extends BasicQueueDisposable<R> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f71641p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends R>> f71642q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71643r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile Iterator<? extends R> f71644s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f71645t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f71646u0;

        public a(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f71641p0 = observer;
            this.f71642q0 = function;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f71644s0 = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71645t0 = true;
            this.f71643r0.dispose();
            this.f71643r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71645t0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f71644s0 == null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71641p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71643r0 = DisposableHelper.DISPOSED;
            this.f71641p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71643r0, disposable)) {
                this.f71643r0 = disposable;
                this.f71641p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            Observer<? super R> observer = this.f71641p0;
            try {
                Iterator<? extends R> it = this.f71642q0.apply(t10).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                this.f71644s0 = it;
                if (this.f71646u0) {
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.f71645t0) {
                    try {
                        observer.onNext(it.next());
                        if (this.f71645t0) {
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
                observer.onError(th4);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final R poll() throws Exception {
            Iterator<? extends R> it = this.f71644s0;
            if (it == null) {
                return null;
            }
            R r3 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f71644s0 = null;
            }
            return r3;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f71646u0 = true;
            return 2;
        }
    }

    public MaybeFlatMapIterableObservable(MaybeSource<T> maybeSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f71639p0 = maybeSource;
        this.f71640q0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.f71639p0.subscribe(new a(observer, this.f71640q0));
    }
}

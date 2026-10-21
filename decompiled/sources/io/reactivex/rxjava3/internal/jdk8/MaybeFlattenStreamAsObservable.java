package io.reactivex.rxjava3.internal.jdk8;

import androidx.appcompat.app.r;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlattenStreamAsObservable<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Maybe<T> f74069p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Stream<? extends R>> f74070q0;

    public static final class a<T, R> extends BasicIntQueueDisposable<R> implements MaybeObserver<T>, SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f74071p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Stream<? extends R>> f74072q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f74073r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile Iterator<? extends R> f74074s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public AutoCloseable f74075t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f74076u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f74077w0;

        public a(Observer<? super R> observer, Function<? super T, ? extends Stream<? extends R>> function) {
            this.f74071p0 = observer;
            this.f74072q0 = function;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.f74071p0;
            Iterator<? extends R> it = this.f74074s0;
            int iAddAndGet = 1;
            while (true) {
                if (this.v0) {
                    clear();
                } else if (this.f74077w0) {
                    observer.onNext(null);
                    observer.onComplete();
                } else {
                    try {
                        R next = it.next();
                        if (!this.v0) {
                            observer.onNext(next);
                            if (!this.v0) {
                                try {
                                    boolean zHasNext = it.hasNext();
                                    if (!this.v0 && !zHasNext) {
                                        observer.onComplete();
                                        this.v0 = true;
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    observer.onError(th2);
                                    this.v0 = true;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        observer.onError(th3);
                        this.v0 = true;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f74074s0 = null;
            AutoCloseable autoCloseable = this.f74075t0;
            this.f74075t0 = null;
            if (autoCloseable != null) {
                try {
                    autoCloseable.close();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
            this.f74073r0.dispose();
            if (this.f74077w0) {
                return;
            }
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<? extends R> it = this.f74074s0;
            if (it == null) {
                return true;
            }
            if (!this.f74076u0 || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74071p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(@NonNull Throwable th2) {
            this.f74071p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(@NonNull Disposable disposable) {
            if (DisposableHelper.validate(this.f74073r0, disposable)) {
                this.f74073r0 = disposable;
                this.f74071p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(@NonNull T t10) {
            try {
                Stream<? extends R> streamApply = this.f74072q0.apply(t10);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                Stream streamC = r.c(streamApply);
                Iterator<? extends R> it = streamC.iterator();
                if (it.hasNext()) {
                    this.f74074s0 = it;
                    this.f74075t0 = streamC;
                    a();
                } else {
                    this.f74071p0.onComplete();
                    try {
                        streamC.close();
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(th2);
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f74071p0.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final R poll() throws Throwable {
            Iterator<? extends R> it = this.f74074s0;
            if (it == null) {
                return null;
            }
            if (!this.f74076u0) {
                this.f74076u0 = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            return it.next();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f74077w0 = true;
            return 2;
        }
    }

    public MaybeFlattenStreamAsObservable(Maybe<T> maybe, Function<? super T, ? extends Stream<? extends R>> function) {
        this.f74069p0 = maybe;
        this.f74070q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(@NonNull Observer<? super R> observer) {
        this.f74069p0.subscribe(new a(observer, this.f74070q0));
    }
}

package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromStream<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Stream<T> f74112p0;

    public static final class a<T> implements QueueDisposable<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f74113p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator<T> f74114q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public AutoCloseable f74115r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f74116s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74117t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f74118u0;

        public a(Observer<? super T> observer, Iterator<T> it, AutoCloseable autoCloseable) {
            this.f74113p0 = observer;
            this.f74114q0 = it;
            this.f74115r0 = autoCloseable;
        }

        public final void a() {
            if (this.f74118u0) {
                return;
            }
            Iterator<T> it = this.f74114q0;
            Observer<? super T> observer = this.f74113p0;
            while (!this.f74116s0) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator.next returned a null value");
                    if (!this.f74116s0) {
                        observer.onNext(next);
                        if (!this.f74116s0) {
                            try {
                                if (!it.hasNext()) {
                                    observer.onComplete();
                                    this.f74116s0 = true;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                observer.onError(th2);
                                this.f74116s0 = true;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    observer.onError(th3);
                    this.f74116s0 = true;
                }
            }
            clear();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f74114q0 = null;
            AutoCloseable autoCloseable = this.f74115r0;
            this.f74115r0 = null;
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
            this.f74116s0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74116s0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<T> it = this.f74114q0;
            if (it == null) {
                return true;
            }
            if (!this.f74117t0 || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(@NonNull T t10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            Iterator<T> it = this.f74114q0;
            if (it == null) {
                return null;
            }
            if (!this.f74117t0) {
                this.f74117t0 = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            T next = this.f74114q0.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f74118u0 = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(@NonNull T t10, @NonNull T t11) {
            throw new UnsupportedOperationException();
        }
    }

    public ObservableFromStream(Stream<T> stream) {
        this.f74112p0 = stream;
    }

    public static <T> void subscribeStream(Observer<? super T> observer, Stream<T> stream) {
        try {
            Iterator it = stream.iterator();
            if (it.hasNext()) {
                a aVar = new a(observer, it, stream);
                observer.onSubscribe(aVar);
                aVar.a();
            } else {
                EmptyDisposable.complete(observer);
                try {
                    stream.close();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptyDisposable.error(th3, observer);
            try {
                stream.close();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        subscribeStream(observer, this.f74112p0);
    }
}

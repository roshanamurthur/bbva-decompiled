package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends ObservableSource<B>> f72099p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<U> f72100q0;

    public static final class a<T, U extends Collection<? super T>, B> extends DisposableObserver<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, U, B> f72101q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f72102r0;

        public a(b<T, U, B> bVar) {
            this.f72101q0 = bVar;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72102r0) {
                return;
            }
            this.f72102r0 = true;
            this.f72101q0.a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72102r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72102r0 = true;
                this.f72101q0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(B b10) {
            if (this.f72102r0) {
                return;
            }
            this.f72102r0 = true;
            dispose();
            this.f72101q0.a();
        }
    }

    public static final class b<T, U extends Collection<? super T>, B> extends QueueDrainObserver<T, U, U> implements Disposable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<U> f72103q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Callable<? extends ObservableSource<B>> f72104r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72105s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72106t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public U f72107u0;

        public b(SerializedObserver serializedObserver, Callable callable, Callable callable2) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f72106t0 = new AtomicReference<>();
            this.f72103q0 = callable;
            this.f72104r0 = callable2;
        }

        public final void a() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.f72103q0.call(), "The buffer supplied is null");
                try {
                    ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72104r0.call(), "The boundary ObservableSource supplied is null");
                    a aVar = new a(this);
                    if (DisposableHelper.replace(this.f72106t0, aVar)) {
                        synchronized (this) {
                            try {
                                U u3 = this.f72107u0;
                                if (u3 == null) {
                                    return;
                                }
                                this.f72107u0 = u2;
                                observableSource.subscribe(aVar);
                                fastPathEmit(u3, false, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.cancelled = true;
                    this.f72105s0.dispose();
                    this.downstream.onError(th3);
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                dispose();
                this.downstream.onError(th4);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void accept(Observer observer, Object obj) {
            this.downstream.onNext((Collection) obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.f72105s0.dispose();
            DisposableHelper.dispose(this.f72106t0);
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            synchronized (this) {
                try {
                    U u2 = this.f72107u0;
                    if (u2 == null) {
                        return;
                    }
                    this.f72107u0 = null;
                    this.queue.offer(u2);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            dispose();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.f72107u0;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72105s0, disposable)) {
                this.f72105s0 = disposable;
                Observer<? super V> observer = this.downstream;
                try {
                    this.f72107u0 = (U) ObjectHelper.requireNonNull(this.f72103q0.call(), "The buffer supplied is null");
                    try {
                        ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72104r0.call(), "The boundary ObservableSource supplied is null");
                        a aVar = new a(this);
                        this.f72106t0.set(aVar);
                        observer.onSubscribe(this);
                        if (this.cancelled) {
                            return;
                        }
                        observableSource.subscribe(aVar);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.cancelled = true;
                        disposable.dispose();
                        EmptyDisposable.error(th2, observer);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.cancelled = true;
                    disposable.dispose();
                    EmptyDisposable.error(th3, observer);
                }
            }
        }
    }

    public ObservableBufferBoundarySupplier(ObservableSource<T> observableSource, Callable<? extends ObservableSource<B>> callable, Callable<U> callable2) {
        super(observableSource);
        this.f72099p0 = callable;
        this.f72100q0 = callable2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new b(new SerializedObserver(observer), this.f72100q0, this.f72099p0));
    }
}

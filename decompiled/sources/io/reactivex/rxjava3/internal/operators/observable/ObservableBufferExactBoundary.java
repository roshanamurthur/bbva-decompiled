package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.QueueDrainObserver;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableBufferExactBoundary<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<B> f76363p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<U> f76364q0;

    public static final class a<T, U extends Collection<? super T>, B> extends DisposableObserver<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, U, B> f76365q0;

        public a(b<T, U, B> bVar) {
            this.f76365q0 = bVar;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76365q0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76365q0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(B b10) {
            this.f76365q0.a();
        }
    }

    public static final class b<T, U extends Collection<? super T>, B> extends QueueDrainObserver<T, U, U> implements Disposable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Supplier<U> f76366q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<B> f76367r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f76368s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public a f76369t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public U f76370u0;

        public b(SerializedObserver serializedObserver, Supplier supplier, ObservableSource observableSource) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f76366q0 = supplier;
            this.f76367r0 = observableSource;
        }

        public final void a() {
            try {
                U u2 = this.f76366q0.get();
                Objects.requireNonNull(u2, "The buffer supplied is null");
                U u3 = u2;
                synchronized (this) {
                    try {
                        U u6 = this.f76370u0;
                        if (u6 == null) {
                            return;
                        }
                        this.f76370u0 = u3;
                        fastPathEmit(u6, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                dispose();
                this.downstream.onError(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.observers.QueueDrainObserver, io.reactivex.rxjava3.internal.util.ObservableQueueDrain
        public final void accept(Observer observer, Object obj) {
            this.downstream.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.f76369t0.dispose();
            this.f76368s0.dispose();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            synchronized (this) {
                try {
                    U u2 = this.f76370u0;
                    if (u2 == null) {
                        return;
                    }
                    this.f76370u0 = null;
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

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            dispose();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.f76370u0;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76368s0, disposable)) {
                this.f76368s0 = disposable;
                try {
                    U u2 = this.f76366q0.get();
                    Objects.requireNonNull(u2, "The buffer supplied is null");
                    this.f76370u0 = u2;
                    a aVar = new a(this);
                    this.f76369t0 = aVar;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    this.f76367r0.subscribe(aVar);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                }
            }
        }
    }

    public ObservableBufferExactBoundary(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Supplier<U> supplier) {
        super(observableSource);
        this.f76363p0 = observableSource2;
        this.f76364q0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new b(new SerializedObserver(observer), this.f76364q0, this.f76363p0));
    }
}

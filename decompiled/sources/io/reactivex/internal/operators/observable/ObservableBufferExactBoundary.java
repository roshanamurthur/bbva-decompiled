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
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableBufferExactBoundary<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<B> f72108p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<U> f72109q0;

    public static final class a<T, U extends Collection<? super T>, B> extends DisposableObserver<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, U, B> f72110q0;

        public a(b<T, U, B> bVar) {
            this.f72110q0 = bVar;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72110q0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72110q0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(B b10) {
            this.f72110q0.a();
        }
    }

    public static final class b<T, U extends Collection<? super T>, B> extends QueueDrainObserver<T, U, U> implements Disposable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Callable<U> f72111q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ObservableSource<B> f72112r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72113s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public a f72114t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public U f72115u0;

        public b(SerializedObserver serializedObserver, Callable callable, ObservableSource observableSource) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f72111q0 = callable;
            this.f72112r0 = observableSource;
        }

        public final void a() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.f72111q0.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u3 = this.f72115u0;
                        if (u3 == null) {
                            return;
                        }
                        this.f72115u0 = u2;
                        fastPathEmit(u3, false, this);
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
            this.f72114t0.dispose();
            this.f72113s0.dispose();
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
                    U u2 = this.f72115u0;
                    if (u2 == null) {
                        return;
                    }
                    this.f72115u0 = null;
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
                    U u2 = this.f72115u0;
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
            if (DisposableHelper.validate(this.f72113s0, disposable)) {
                this.f72113s0 = disposable;
                try {
                    this.f72115u0 = (U) ObjectHelper.requireNonNull(this.f72111q0.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.f72114t0 = aVar;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    this.f72112r0.subscribe(aVar);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    disposable.dispose();
                    EmptyDisposable.error(th2, this.downstream);
                }
            }
        }
    }

    public ObservableBufferExactBoundary(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Callable<U> callable) {
        super(observableSource);
        this.f72108p0 = observableSource2;
        this.f72109q0 = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        this.source.subscribe(new b(new SerializedObserver(observer), this.f72109q0, this.f72108p0));
    }
}

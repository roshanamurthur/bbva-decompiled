package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.BasicQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromIterable<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<? extends T> f76728p0;

    public static final class a<T> extends BasicQueueDisposable<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76729p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Iterator<? extends T> f76730q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f76731r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76732s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f76733t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f76734u0;

        public a(Observer<? super T> observer, Iterator<? extends T> it) {
            this.f76729p0 = observer;
            this.f76730q0 = it;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f76733t0 = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76731r0 = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76731r0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f76733t0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            if (this.f76733t0) {
                return null;
            }
            boolean z10 = this.f76734u0;
            Iterator<? extends T> it = this.f76730q0;
            if (!z10) {
                this.f76734u0 = true;
            } else if (!it.hasNext()) {
                this.f76733t0 = true;
                return null;
            }
            T next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f76732s0 = true;
            return 1;
        }
    }

    public ObservableFromIterable(Iterable<? extends T> iterable) {
        this.f76728p0 = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            Iterator<? extends T> it = this.f76728p0.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(observer);
                    return;
                }
                a aVar = new a(observer, it);
                observer.onSubscribe(aVar);
                if (aVar.f76732s0) {
                    return;
                }
                while (!aVar.f76731r0) {
                    try {
                        T next = aVar.f76730q0.next();
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        aVar.f76729p0.onNext(next);
                        if (aVar.f76731r0) {
                            return;
                        }
                        try {
                            if (!aVar.f76730q0.hasNext()) {
                                if (aVar.f76731r0) {
                                    return;
                                }
                                aVar.f76729p0.onComplete();
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            aVar.f76729p0.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        aVar.f76729p0.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                EmptyDisposable.error(th4, observer);
            }
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            EmptyDisposable.error(th5, observer);
        }
    }
}

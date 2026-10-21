package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromIterable<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<? extends T> f72444p0;

    public static final class a<T> extends BasicQueueDisposable<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72445p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Iterator<? extends T> f72446q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f72447r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72448s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72449t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f72450u0;

        public a(Observer<? super T> observer, Iterator<? extends T> it) {
            this.f72445p0 = observer;
            this.f72446q0 = it;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f72449t0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72447r0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72447r0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f72449t0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            if (this.f72449t0) {
                return null;
            }
            boolean z10 = this.f72450u0;
            Iterator<? extends T> it = this.f72446q0;
            if (!z10) {
                this.f72450u0 = true;
            } else if (!it.hasNext()) {
                this.f72449t0 = true;
                return null;
            }
            return (T) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f72448s0 = true;
            return 1;
        }
    }

    public ObservableFromIterable(Iterable<? extends T> iterable) {
        this.f72444p0 = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            Iterator<? extends T> it = this.f72444p0.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(observer);
                    return;
                }
                a aVar = new a(observer, it);
                observer.onSubscribe(aVar);
                if (aVar.f72448s0) {
                    return;
                }
                while (!aVar.f72447r0) {
                    try {
                        aVar.f72445p0.onNext(ObjectHelper.requireNonNull(aVar.f72446q0.next(), "The iterator returned a null value"));
                        if (aVar.f72447r0) {
                            return;
                        }
                        try {
                            if (!aVar.f72446q0.hasNext()) {
                                if (aVar.f72447r0) {
                                    return;
                                }
                                aVar.f72445p0.onComplete();
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            aVar.f72445p0.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        aVar.f72445p0.onError(th3);
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

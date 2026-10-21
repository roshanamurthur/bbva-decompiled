package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCreate<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableOnSubscribe<T> f72251p0;

    public static final class a<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72252p0;

        public a(Observer<? super T> observer) {
            this.f72252p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f72252p0.onComplete();
            } finally {
                DisposableHelper.dispose(this);
            }
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th2) {
            if (tryOnError(th2)) {
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t10) {
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f72252p0.onNext(t10);
            }
        }

        @Override // io.reactivex.ObservableEmitter
        public final ObservableEmitter<T> serialize() {
            return new b(this);
        }

        @Override // io.reactivex.ObservableEmitter
        public final void setCancellable(Cancellable cancellable) {
            DisposableHelper.set(this, new CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.ObservableEmitter
        public final void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }

        @Override // io.reactivex.ObservableEmitter
        public final boolean tryOnError(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f72252p0.onError(th2);
                return true;
            } finally {
                DisposableHelper.dispose(this);
            }
        }
    }

    public ObservableCreate(ObservableOnSubscribe<T> observableOnSubscribe) {
        this.f72251p0 = observableOnSubscribe;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        try {
            this.f72251p0.subscribe(aVar);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            aVar.onError(th2);
        }
    }

    public static final class b<T> extends AtomicInteger implements ObservableEmitter<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ObservableEmitter<T> f72253p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f72254q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f72255r0 = new SpscLinkedArrayQueue<>(16);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f72256s0;

        public b(ObservableEmitter<T> observableEmitter) {
            this.f72253p0 = observableEmitter;
        }

        public final void a() {
            ObservableEmitter<T> observableEmitter = this.f72253p0;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f72255r0;
            AtomicThrowable atomicThrowable = this.f72254q0;
            int iAddAndGet = 1;
            while (!observableEmitter.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    spscLinkedArrayQueue.clear();
                    observableEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z10 = this.f72256s0;
                T tPoll = spscLinkedArrayQueue.poll();
                boolean z11 = tPoll == null;
                if (z10 && z11) {
                    observableEmitter.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observableEmitter.onNext(tPoll);
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72253p0.isDisposed();
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (this.f72253p0.isDisposed() || this.f72256s0) {
                return;
            }
            this.f72256s0 = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th2) {
            if (tryOnError(th2)) {
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t10) {
            if (this.f72253p0.isDisposed() || this.f72256s0) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f72253p0.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f72255r0;
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(t10);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        @Override // io.reactivex.ObservableEmitter
        public final void setCancellable(Cancellable cancellable) {
            this.f72253p0.setCancellable(cancellable);
        }

        @Override // io.reactivex.ObservableEmitter
        public final void setDisposable(Disposable disposable) {
            this.f72253p0.setDisposable(disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            return this.f72253p0.toString();
        }

        @Override // io.reactivex.ObservableEmitter
        public final boolean tryOnError(Throwable th2) {
            if (!this.f72253p0.isDisposed() && !this.f72256s0) {
                if (th2 == null) {
                    th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f72254q0.addThrowable(th2)) {
                    this.f72256s0 = true;
                    if (getAndIncrement() == 0) {
                        a();
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.ObservableEmitter
        public final ObservableEmitter<T> serialize() {
            return this;
        }
    }
}

package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCreate<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableOnSubscribe<T> f76532p0;

    public static final class a<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76533p0;

        public a(Observer<? super T> observer) {
            this.f76533p0 = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter, io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f76533p0.onComplete();
            } finally {
                DisposableHelper.dispose(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onError(Throwable th2) {
            if (tryOnError(th2)) {
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t10) {
            if (t10 == null) {
                onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f76533p0.onNext(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final ObservableEmitter<T> serialize() {
            return new b(this);
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final void setCancellable(Cancellable cancellable) {
            DisposableHelper.set(this, new CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final boolean tryOnError(Throwable th2) {
            if (th2 == null) {
                th2 = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f76533p0.onError(th2);
                return true;
            } finally {
                DisposableHelper.dispose(this);
            }
        }
    }

    public ObservableCreate(ObservableOnSubscribe<T> observableOnSubscribe) {
        this.f76532p0 = observableOnSubscribe;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer);
        observer.onSubscribe(aVar);
        try {
            this.f76532p0.subscribe(aVar);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            aVar.onError(th2);
        }
    }

    public static final class b<T> extends AtomicInteger implements ObservableEmitter<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ObservableEmitter<T> f76534p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f76535q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f76536r0 = new SpscLinkedArrayQueue<>(16);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f76537s0;

        public b(ObservableEmitter<T> observableEmitter) {
            this.f76534p0 = observableEmitter;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a() {
            ObservableEmitter<T> observableEmitter = this.f76534p0;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f76536r0;
            AtomicThrowable atomicThrowable = this.f76535q0;
            int iAddAndGet = 1;
            while (!observableEmitter.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    spscLinkedArrayQueue.clear();
                    atomicThrowable.tryTerminateConsumer(observableEmitter);
                    return;
                }
                boolean z10 = this.f76537s0;
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

        @Override // io.reactivex.rxjava3.core.ObservableEmitter, io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76534p0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            if (this.f76537s0 || this.f76534p0.isDisposed()) {
                return;
            }
            this.f76537s0 = true;
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onError(Throwable th2) {
            if (tryOnError(th2)) {
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t10) {
            if (this.f76537s0 || this.f76534p0.isDisposed()) {
                return;
            }
            if (t10 == null) {
                onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f76534p0.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f76536r0;
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(t10);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            a();
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final void setCancellable(Cancellable cancellable) {
            this.f76534p0.setCancellable(cancellable);
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final void setDisposable(Disposable disposable) {
            this.f76534p0.setDisposable(disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            return this.f76534p0.toString();
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final boolean tryOnError(Throwable th2) {
            if (!this.f76537s0 && !this.f76534p0.isDisposed()) {
                if (th2 == null) {
                    th2 = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
                }
                if (this.f76535q0.tryAddThrowable(th2)) {
                    this.f76537s0 = true;
                    if (getAndIncrement() == 0) {
                        a();
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.rxjava3.core.ObservableEmitter
        public final ObservableEmitter<T> serialize() {
            return this;
        }
    }
}

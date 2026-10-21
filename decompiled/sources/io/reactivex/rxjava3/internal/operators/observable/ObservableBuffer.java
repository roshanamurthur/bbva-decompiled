package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f76333p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f76334q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Supplier<U> f76335r0;

    public static final class a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f76336p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f76337q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Supplier<U> f76338r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public U f76339s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f76340t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f76341u0;

        public a(Observer<? super U> observer, int i10, Supplier<U> supplier) {
            this.f76336p0 = observer;
            this.f76337q0 = i10;
            this.f76338r0 = supplier;
        }

        public final boolean a() {
            try {
                U u2 = this.f76338r0.get();
                Objects.requireNonNull(u2, "Empty buffer supplied");
                this.f76339s0 = u2;
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76339s0 = null;
                Disposable disposable = this.f76341u0;
                Observer<? super U> observer = this.f76336p0;
                if (disposable == null) {
                    EmptyDisposable.error(th2, observer);
                    return false;
                }
                disposable.dispose();
                observer.onError(th2);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76341u0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76341u0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            U u2 = this.f76339s0;
            if (u2 != null) {
                this.f76339s0 = null;
                boolean zIsEmpty = u2.isEmpty();
                Observer<? super U> observer = this.f76336p0;
                if (!zIsEmpty) {
                    observer.onNext(u2);
                }
                observer.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76339s0 = null;
            this.f76336p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            U u2 = this.f76339s0;
            if (u2 != null) {
                u2.add(t10);
                int i10 = this.f76340t0 + 1;
                this.f76340t0 = i10;
                if (i10 >= this.f76337q0) {
                    this.f76336p0.onNext(u2);
                    this.f76340t0 = 0;
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76341u0, disposable)) {
                this.f76341u0 = disposable;
                this.f76336p0.onSubscribe(this);
            }
        }
    }

    public static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f76342p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f76343q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f76344r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Supplier<U> f76345s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f76346t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ArrayDeque<U> f76347u0 = new ArrayDeque<>();
        public long v0;

        public b(Observer<? super U> observer, int i10, int i11, Supplier<U> supplier) {
            this.f76342p0 = observer;
            this.f76343q0 = i10;
            this.f76344r0 = i11;
            this.f76345s0 = supplier;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76346t0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76346t0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            while (true) {
                ArrayDeque<U> arrayDeque = this.f76347u0;
                boolean zIsEmpty = arrayDeque.isEmpty();
                Observer<? super U> observer = this.f76342p0;
                if (zIsEmpty) {
                    observer.onComplete();
                    return;
                }
                observer.onNext(arrayDeque.poll());
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76347u0.clear();
            this.f76342p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            long j10 = this.v0;
            this.v0 = 1 + j10;
            long j11 = j10 % ((long) this.f76344r0);
            Observer<? super U> observer = this.f76342p0;
            ArrayDeque<U> arrayDeque = this.f76347u0;
            if (j11 == 0) {
                try {
                    arrayDeque.offer((U) ((Collection) ExceptionHelper.nullCheck(this.f76345s0.get(), "The bufferSupplier returned a null Collection.")));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    arrayDeque.clear();
                    this.f76346t0.dispose();
                    observer.onError(th2);
                    return;
                }
            }
            Iterator<U> it = arrayDeque.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.f76343q0 <= next.size()) {
                    it.remove();
                    observer.onNext(next);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76346t0, disposable)) {
                this.f76346t0 = disposable;
                this.f76342p0.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(ObservableSource<T> observableSource, int i10, int i11, Supplier<U> supplier) {
        super(observableSource);
        this.f76333p0 = i10;
        this.f76334q0 = i11;
        this.f76335r0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        Supplier<U> supplier = this.f76335r0;
        int i10 = this.f76334q0;
        int i11 = this.f76333p0;
        if (i10 != i11) {
            this.source.subscribe(new b(observer, i11, i10, supplier));
            return;
        }
        a aVar = new a(observer, i11, supplier);
        if (aVar.a()) {
            this.source.subscribe(aVar);
        }
    }
}

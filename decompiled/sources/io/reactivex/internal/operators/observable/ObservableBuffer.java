package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f72069p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f72070q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Callable<U> f72071r0;

    public static final class a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f72072p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f72073q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Callable<U> f72074r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public U f72075s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f72076t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72077u0;

        public a(Observer<? super U> observer, int i10, Callable<U> callable) {
            this.f72072p0 = observer;
            this.f72073q0 = i10;
            this.f72074r0 = callable;
        }

        public final boolean a() {
            try {
                this.f72075s0 = (U) ObjectHelper.requireNonNull(this.f72074r0.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72075s0 = null;
                Disposable disposable = this.f72077u0;
                Observer<? super U> observer = this.f72072p0;
                if (disposable == null) {
                    EmptyDisposable.error(th2, observer);
                    return false;
                }
                disposable.dispose();
                observer.onError(th2);
                return false;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72077u0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72077u0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u2 = this.f72075s0;
            if (u2 != null) {
                this.f72075s0 = null;
                boolean zIsEmpty = u2.isEmpty();
                Observer<? super U> observer = this.f72072p0;
                if (!zIsEmpty) {
                    observer.onNext(u2);
                }
                observer.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72075s0 = null;
            this.f72072p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            U u2 = this.f72075s0;
            if (u2 != null) {
                u2.add(t10);
                int i10 = this.f72076t0 + 1;
                this.f72076t0 = i10;
                if (i10 >= this.f72073q0) {
                    this.f72072p0.onNext(u2);
                    this.f72076t0 = 0;
                    a();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72077u0, disposable)) {
                this.f72077u0 = disposable;
                this.f72072p0.onSubscribe(this);
            }
        }
    }

    public static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f72078p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f72079q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f72080r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Callable<U> f72081s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f72082t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ArrayDeque<U> f72083u0 = new ArrayDeque<>();
        public long v0;

        public b(Observer<? super U> observer, int i10, int i11, Callable<U> callable) {
            this.f72078p0 = observer;
            this.f72079q0 = i10;
            this.f72080r0 = i11;
            this.f72081s0 = callable;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72082t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72082t0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            while (true) {
                ArrayDeque<U> arrayDeque = this.f72083u0;
                boolean zIsEmpty = arrayDeque.isEmpty();
                Observer<? super U> observer = this.f72078p0;
                if (zIsEmpty) {
                    observer.onComplete();
                    return;
                }
                observer.onNext(arrayDeque.poll());
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72083u0.clear();
            this.f72078p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            long j10 = this.v0;
            this.v0 = 1 + j10;
            long j11 = j10 % ((long) this.f72080r0);
            Observer<? super U> observer = this.f72078p0;
            ArrayDeque<U> arrayDeque = this.f72083u0;
            if (j11 == 0) {
                try {
                    arrayDeque.offer((U) ((Collection) ObjectHelper.requireNonNull(this.f72081s0.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
                } catch (Throwable th2) {
                    arrayDeque.clear();
                    this.f72082t0.dispose();
                    observer.onError(th2);
                    return;
                }
            }
            Iterator<U> it = arrayDeque.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.f72079q0 <= next.size()) {
                    it.remove();
                    observer.onNext(next);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72082t0, disposable)) {
                this.f72082t0 = disposable;
                this.f72078p0.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(ObservableSource<T> observableSource, int i10, int i11, Callable<U> callable) {
        super(observableSource);
        this.f72069p0 = i10;
        this.f72070q0 = i11;
        this.f72071r0 = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        Callable<U> callable = this.f72071r0;
        int i10 = this.f72070q0;
        int i11 = this.f72069p0;
        if (i10 != i11) {
            this.source.subscribe(new b(observer, i11, i10, callable));
            return;
        }
        a aVar = new a(observer, i11, callable);
        if (aVar.a()) {
            this.source.subscribe(aVar);
        }
    }
}

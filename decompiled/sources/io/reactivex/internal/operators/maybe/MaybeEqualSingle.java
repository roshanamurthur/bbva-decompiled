package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeEqualSingle<T> extends Single<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T> f71600p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T> f71601q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f71602r0;

    public static final class a<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f71603p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T> f71604q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final b<T> f71605r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f71606s0;

        public a(SingleObserver<? super Boolean> singleObserver, BiPredicate<? super T, ? super T> biPredicate) {
            super(2);
            this.f71603p0 = singleObserver;
            this.f71606s0 = biPredicate;
            this.f71604q0 = new b<>(this);
            this.f71605r0 = new b<>(this);
        }

        public final void a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f71604q0.f71608q0;
                Object obj2 = this.f71605r0.f71608q0;
                SingleObserver<? super Boolean> singleObserver = this.f71603p0;
                if (obj == null || obj2 == null) {
                    singleObserver.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    singleObserver.onSuccess(Boolean.valueOf(this.f71606s0.test(obj, obj2)));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleObserver.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            b<T> bVar = this.f71604q0;
            bVar.getClass();
            DisposableHelper.dispose(bVar);
            b<T> bVar2 = this.f71605r0;
            bVar2.getClass();
            DisposableHelper.dispose(bVar2);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f71604q0.get());
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f71607p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f71608q0;

        public b(a<T> aVar) {
            this.f71607p0 = aVar;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71607p0.a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            a<T> aVar = this.f71607p0;
            if (aVar.getAndSet(0) <= 0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            b<T> bVar = aVar.f71604q0;
            if (this == bVar) {
                b<T> bVar2 = aVar.f71605r0;
                bVar2.getClass();
                DisposableHelper.dispose(bVar2);
            } else {
                bVar.getClass();
                DisposableHelper.dispose(bVar);
            }
            aVar.f71603p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71608q0 = t10;
            this.f71607p0.a();
        }
    }

    public MaybeEqualSingle(MaybeSource<? extends T> maybeSource, MaybeSource<? extends T> maybeSource2, BiPredicate<? super T, ? super T> biPredicate) {
        this.f71600p0 = maybeSource;
        this.f71601q0 = maybeSource2;
        this.f71602r0 = biPredicate;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        a aVar = new a(singleObserver, this.f71602r0);
        singleObserver.onSubscribe(aVar);
        this.f71600p0.subscribe(aVar.f71604q0);
        this.f71601q0.subscribe(aVar.f71605r0);
    }
}

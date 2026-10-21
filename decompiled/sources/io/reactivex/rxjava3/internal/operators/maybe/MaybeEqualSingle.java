package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeEqualSingle<T> extends Single<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T> f75845p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T> f75846q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f75847r0;

    public static final class a<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f75848p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T> f75849q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final b<T> f75850r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f75851s0;

        public a(SingleObserver<? super Boolean> singleObserver, BiPredicate<? super T, ? super T> biPredicate) {
            super(2);
            this.f75848p0 = singleObserver;
            this.f75851s0 = biPredicate;
            this.f75849q0 = new b<>(this);
            this.f75850r0 = new b<>(this);
        }

        public final void a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f75849q0.f75853q0;
                Object obj2 = this.f75850r0.f75853q0;
                SingleObserver<? super Boolean> singleObserver = this.f75848p0;
                if (obj == null || obj2 == null) {
                    singleObserver.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    singleObserver.onSuccess(Boolean.valueOf(this.f75851s0.test(obj, obj2)));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    singleObserver.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            b<T> bVar = this.f75849q0;
            bVar.getClass();
            DisposableHelper.dispose(bVar);
            b<T> bVar2 = this.f75850r0;
            bVar2.getClass();
            DisposableHelper.dispose(bVar2);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f75849q0.get());
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f75852p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f75853q0;

        public b(a<T> aVar) {
            this.f75852p0 = aVar;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75852p0.a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            a<T> aVar = this.f75852p0;
            if (aVar.getAndSet(0) <= 0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            b<T> bVar = aVar.f75849q0;
            if (this == bVar) {
                b<T> bVar2 = aVar.f75850r0;
                bVar2.getClass();
                DisposableHelper.dispose(bVar2);
            } else {
                bVar.getClass();
                DisposableHelper.dispose(bVar);
            }
            aVar.f75848p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75853q0 = t10;
            this.f75852p0.a();
        }
    }

    public MaybeEqualSingle(MaybeSource<? extends T> maybeSource, MaybeSource<? extends T> maybeSource2, BiPredicate<? super T, ? super T> biPredicate) {
        this.f75845p0 = maybeSource;
        this.f75846q0 = maybeSource2;
        this.f75847r0 = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        a aVar = new a(singleObserver, this.f75847r0);
        singleObserver.onSubscribe(aVar);
        this.f75845p0.subscribe(aVar.f75849q0);
        this.f75846q0.subscribe(aVar.f75850r0);
    }
}

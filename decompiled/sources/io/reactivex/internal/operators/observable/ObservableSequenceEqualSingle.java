package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<? extends T> f72839p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<? extends T> f72840q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super T, ? super T> f72841r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f72842s0;

    public static final class a<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Boolean> f72843p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super T, ? super T> f72844q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final ArrayCompositeDisposable f72845r0 = new ArrayCompositeDisposable(2);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ObservableSource<? extends T> f72846s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ObservableSource<? extends T> f72847t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final b<T>[] f72848u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public T f72849w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public T f72850x0;

        public a(SingleObserver<? super Boolean> singleObserver, int i10, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.f72843p0 = singleObserver;
            this.f72846s0 = observableSource;
            this.f72847t0 = observableSource2;
            this.f72844q0 = biPredicate;
            this.f72848u0 = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
        }

        public final void a() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T>[] bVarArr = this.f72848u0;
            b<T> bVar = bVarArr[0];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = bVar.f72852q0;
            b<T> bVar2 = bVarArr[1];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = bVar2.f72852q0;
            int iAddAndGet = 1;
            while (!this.v0) {
                boolean z10 = bVar.f72854s0;
                if (z10 && (th3 = bVar.f72855t0) != null) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f72843p0.onError(th3);
                    return;
                }
                boolean z11 = bVar2.f72854s0;
                if (z11 && (th2 = bVar2.f72855t0) != null) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f72843p0.onError(th2);
                    return;
                }
                if (this.f72849w0 == null) {
                    this.f72849w0 = spscLinkedArrayQueue.poll();
                }
                boolean z12 = this.f72849w0 == null;
                if (this.f72850x0 == null) {
                    this.f72850x0 = spscLinkedArrayQueue2.poll();
                }
                T t10 = this.f72850x0;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.f72843p0.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    this.v0 = true;
                    spscLinkedArrayQueue.clear();
                    spscLinkedArrayQueue2.clear();
                    this.f72843p0.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.f72844q0.test(this.f72849w0, t10)) {
                            this.v0 = true;
                            spscLinkedArrayQueue.clear();
                            spscLinkedArrayQueue2.clear();
                            this.f72843p0.onSuccess(Boolean.FALSE);
                            return;
                        }
                        this.f72849w0 = null;
                        this.f72850x0 = null;
                    } catch (Throwable th4) {
                        Exceptions.throwIfFatal(th4);
                        this.v0 = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.f72843p0.onError(th4);
                        return;
                    }
                }
                if (z12 || z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            this.f72845r0.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f72848u0;
                bVarArr[0].f72852q0.clear();
                bVarArr[1].f72852q0.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0;
        }
    }

    public static final class b<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f72851p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f72852q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f72853r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f72854s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Throwable f72855t0;

        public b(a<T> aVar, int i10, int i11) {
            this.f72851p0 = aVar;
            this.f72853r0 = i10;
            this.f72852q0 = new SpscLinkedArrayQueue<>(i11);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72854s0 = true;
            this.f72851p0.a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72855t0 = th2;
            this.f72854s0 = true;
            this.f72851p0.a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72852q0.offer(t10);
            this.f72851p0.a();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f72851p0.f72845r0.setResource(this.f72853r0, disposable);
        }
    }

    public ObservableSequenceEqualSingle(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        this.f72839p0 = observableSource;
        this.f72840q0 = observableSource2;
        this.f72841r0 = biPredicate;
        this.f72842s0 = i10;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableSequenceEqual(this.f72839p0, this.f72840q0, this.f72841r0, this.f72842s0));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        a aVar = new a(singleObserver, this.f72842s0, this.f72839p0, this.f72840q0, this.f72841r0);
        singleObserver.onSubscribe(aVar);
        b<T>[] bVarArr = aVar.f72848u0;
        aVar.f72846s0.subscribe(bVarArr[0]);
        aVar.f72847t0.subscribe(bVarArr[1]);
    }
}

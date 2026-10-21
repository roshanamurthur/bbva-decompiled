package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.observables.GroupedObservable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableGroupBy<T, K, V> extends io.reactivex.rxjava3.internal.operators.observable.a<T, GroupedObservable<K, V>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends K> f76750p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends V> f76751q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f76752r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f76753s0;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final Object f76754x0 = new Object();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super GroupedObservable<K, V>> f76755p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends K> f76756q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends V> f76757r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f76758s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f76759t0;
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicBoolean f76761w0 = new AtomicBoolean();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ConcurrentHashMap f76760u0 = new ConcurrentHashMap();

        public GroupByObserver(Observer<? super GroupedObservable<K, V>> observer, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10) {
            this.f76755p0 = observer;
            this.f76756q0 = function;
            this.f76757r0 = function2;
            this.f76758s0 = i10;
            this.f76759t0 = z10;
            lazySet(1);
        }

        public void cancel(K k10) {
            if (k10 == null) {
                k10 = (K) f76754x0;
            }
            this.f76760u0.remove(k10);
            if (decrementAndGet() == 0) {
                this.v0.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.f76761w0.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.v0.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f76761w0.get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            ConcurrentHashMap concurrentHashMap = this.f76760u0;
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b<T, K> bVar = ((a) it.next()).f76762q0;
                bVar.f76767t0 = true;
                bVar.a();
            }
            this.f76755p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f76760u0.values());
            this.f76760u0.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b<T, K> bVar = ((a) it.next()).f76762q0;
                bVar.f76768u0 = th2;
                bVar.f76767t0 = true;
                bVar.a();
            }
            this.f76755p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t10) {
            boolean z10;
            Observer<? super GroupedObservable<K, V>> observer = this.f76755p0;
            try {
                K kApply = this.f76756q0.apply(t10);
                Object obj = kApply != null ? kApply : f76754x0;
                ConcurrentHashMap concurrentHashMap = this.f76760u0;
                a aVar = (a) concurrentHashMap.get(obj);
                if (aVar != null) {
                    z10 = false;
                } else {
                    if (this.f76761w0.get()) {
                        return;
                    }
                    a aVar2 = new a(kApply, new b(this.f76758s0, this, kApply, this.f76759t0));
                    concurrentHashMap.put(obj, aVar2);
                    getAndIncrement();
                    z10 = true;
                    aVar = aVar2;
                }
                try {
                    b<T, K> bVar = aVar.f76762q0;
                    V vApply = this.f76757r0.apply(t10);
                    Objects.requireNonNull(vApply, "The value supplied is null");
                    bVar.f76764q0.offer(vApply);
                    bVar.a();
                    if (z10) {
                        observer.onNext(aVar);
                        AtomicInteger atomicInteger = bVar.f76770x0;
                        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 2)) {
                            cancel(kApply);
                            b<T, K> bVar2 = aVar.f76762q0;
                            bVar2.f76767t0 = true;
                            bVar2.a();
                        }
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.v0.dispose();
                    if (z10) {
                        observer.onNext(aVar);
                    }
                    onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.v0.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f76755p0.onSubscribe(this);
            }
        }
    }

    public static final class a<K, T> extends GroupedObservable<K, T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, K> f76762q0;

        public a(K k10, b<T, K> bVar) {
            super(k10);
            this.f76762q0 = bVar;
        }

        @Override // io.reactivex.rxjava3.core.Observable
        public final void subscribeActual(Observer<? super T> observer) {
            this.f76762q0.subscribe(observer);
        }
    }

    public static final class b<T, K> extends AtomicInteger implements Disposable, ObservableSource<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final K f76763p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f76764q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final GroupByObserver<?, K, T> f76765r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f76766s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f76767t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Throwable f76768u0;
        public final AtomicBoolean v0 = new AtomicBoolean();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicReference<Observer<? super T>> f76769w0 = new AtomicReference<>();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicInteger f76770x0 = new AtomicInteger();

        public b(int i10, GroupByObserver<?, K, T> groupByObserver, K k10, boolean z10) {
            this.f76764q0 = new SpscLinkedArrayQueue<>(i10);
            this.f76765r0 = groupByObserver;
            this.f76763p0 = k10;
            this.f76766s0 = z10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f76764q0;
            boolean z10 = this.f76766s0;
            Observer<? super T> observer = this.f76769w0.get();
            int iAddAndGet = 1;
            while (true) {
                if (observer != null) {
                    while (true) {
                        boolean z11 = this.f76767t0;
                        T tPoll = spscLinkedArrayQueue.poll();
                        boolean z12 = tPoll == null;
                        boolean z13 = this.v0.get();
                        SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.f76764q0;
                        AtomicReference<Observer<? super T>> atomicReference = this.f76769w0;
                        if (z13) {
                            spscLinkedArrayQueue2.clear();
                            atomicReference.lazySet(null);
                            if ((this.f76770x0.get() & 2) == 0) {
                                this.f76765r0.cancel(this.f76763p0);
                                return;
                            }
                            return;
                        }
                        if (z11) {
                            if (!z10) {
                                Throwable th2 = this.f76768u0;
                                if (th2 != null) {
                                    spscLinkedArrayQueue2.clear();
                                    atomicReference.lazySet(null);
                                    observer.onError(th2);
                                    return;
                                } else if (z12) {
                                    atomicReference.lazySet(null);
                                    observer.onComplete();
                                    return;
                                }
                            } else if (z12) {
                                Throwable th3 = this.f76768u0;
                                atomicReference.lazySet(null);
                                if (th3 != null) {
                                    observer.onError(th3);
                                    return;
                                } else {
                                    observer.onComplete();
                                    return;
                                }
                            }
                        }
                        if (z12) {
                            break;
                        } else {
                            observer.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (observer == null) {
                    observer = this.f76769w0.get();
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.v0.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f76769w0.lazySet(null);
                if ((this.f76770x0.get() & 2) == 0) {
                    this.f76765r0.cancel(this.f76763p0);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0.get();
        }

        @Override // io.reactivex.rxjava3.core.ObservableSource
        public final void subscribe(Observer<? super T> observer) {
            AtomicInteger atomicInteger;
            int i10;
            do {
                atomicInteger = this.f76770x0;
                i10 = atomicInteger.get();
                if ((i10 & 1) != 0) {
                    EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), observer);
                    return;
                }
            } while (!atomicInteger.compareAndSet(i10, i10 | 1));
            observer.onSubscribe(this);
            AtomicReference<Observer<? super T>> atomicReference = this.f76769w0;
            atomicReference.lazySet(observer);
            if (this.v0.get()) {
                atomicReference.lazySet(null);
            } else {
                a();
            }
        }
    }

    public ObservableGroupBy(ObservableSource<T> observableSource, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10) {
        super(observableSource);
        this.f76750p0 = function;
        this.f76751q0 = function2;
        this.f76752r0 = i10;
        this.f76753s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super GroupedObservable<K, V>> observer) {
        this.source.subscribe(new GroupByObserver(observer, this.f76750p0, this.f76751q0, this.f76752r0, this.f76753s0));
    }
}

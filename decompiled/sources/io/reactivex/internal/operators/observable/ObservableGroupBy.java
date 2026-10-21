package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.observables.GroupedObservable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableGroupBy<T, K, V> extends io.reactivex.internal.operators.observable.a<T, GroupedObservable<K, V>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends K> f72464p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends V> f72465q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f72466r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f72467s0;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final Object f72468x0 = new Object();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super GroupedObservable<K, V>> f72469p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends K> f72470q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends V> f72471r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f72472s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f72473t0;
        public Disposable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicBoolean f72475w0 = new AtomicBoolean();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ConcurrentHashMap f72474u0 = new ConcurrentHashMap();

        public GroupByObserver(Observer<? super GroupedObservable<K, V>> observer, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10) {
            this.f72469p0 = observer;
            this.f72470q0 = function;
            this.f72471r0 = function2;
            this.f72472s0 = i10;
            this.f72473t0 = z10;
            lazySet(1);
        }

        public void cancel(K k10) {
            if (k10 == null) {
                k10 = (K) f72468x0;
            }
            this.f72474u0.remove(k10);
            if (decrementAndGet() == 0) {
                this.v0.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f72475w0.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.v0.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f72475w0.get();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f72474u0.values());
            this.f72474u0.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b<T, K> bVar = ((a) it.next()).f72476q0;
                bVar.f72481t0 = true;
                bVar.a();
            }
            this.f72469p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f72474u0.values());
            this.f72474u0.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b<T, K> bVar = ((a) it.next()).f72476q0;
                bVar.f72482u0 = th2;
                bVar.f72481t0 = true;
                bVar.a();
            }
            this.f72469p0.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t10) {
            try {
                K kApply = this.f72470q0.apply(t10);
                Object obj = kApply != null ? kApply : f72468x0;
                ConcurrentHashMap concurrentHashMap = this.f72474u0;
                a aVar = (a) concurrentHashMap.get(obj);
                if (aVar == null) {
                    if (this.f72475w0.get()) {
                        return;
                    }
                    a aVar2 = new a(kApply, new b(this.f72472s0, this, kApply, this.f72473t0));
                    concurrentHashMap.put(obj, aVar2);
                    getAndIncrement();
                    this.f72469p0.onNext(aVar2);
                    aVar = aVar2;
                }
                try {
                    Object objRequireNonNull = ObjectHelper.requireNonNull(this.f72471r0.apply(t10), "The value supplied is null");
                    b<T, K> bVar = aVar.f72476q0;
                    bVar.f72478q0.offer((T) objRequireNonNull);
                    bVar.a();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.v0.dispose();
                    onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.v0.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.v0, disposable)) {
                this.v0 = disposable;
                this.f72469p0.onSubscribe(this);
            }
        }
    }

    public static final class a<K, T> extends GroupedObservable<K, T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, K> f72476q0;

        public a(K k10, b<T, K> bVar) {
            super(k10);
            this.f72476q0 = bVar;
        }

        @Override // io.reactivex.Observable
        public final void subscribeActual(Observer<? super T> observer) {
            this.f72476q0.subscribe(observer);
        }
    }

    public static final class b<T, K> extends AtomicInteger implements Disposable, ObservableSource<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final K f72477p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f72478q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final GroupByObserver<?, K, T> f72479r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f72480s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f72481t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Throwable f72482u0;
        public final AtomicBoolean v0 = new AtomicBoolean();

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final AtomicBoolean f72483w0 = new AtomicBoolean();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final AtomicReference<Observer<? super T>> f72484x0 = new AtomicReference<>();

        public b(int i10, GroupByObserver<?, K, T> groupByObserver, K k10, boolean z10) {
            this.f72478q0 = new SpscLinkedArrayQueue<>(i10);
            this.f72479r0 = groupByObserver;
            this.f72477p0 = k10;
            this.f72480s0 = z10;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f72478q0;
            boolean z10 = this.f72480s0;
            Observer<? super T> observer = this.f72484x0.get();
            int iAddAndGet = 1;
            while (true) {
                if (observer != null) {
                    while (true) {
                        boolean z11 = this.f72481t0;
                        T tPoll = spscLinkedArrayQueue.poll();
                        boolean z12 = tPoll == null;
                        boolean z13 = this.v0.get();
                        SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.f72478q0;
                        AtomicReference<Observer<? super T>> atomicReference = this.f72484x0;
                        if (z13) {
                            spscLinkedArrayQueue2.clear();
                            this.f72479r0.cancel(this.f72477p0);
                            atomicReference.lazySet(null);
                            return;
                        }
                        if (z11) {
                            if (!z10) {
                                Throwable th2 = this.f72482u0;
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
                                Throwable th3 = this.f72482u0;
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
                    observer = this.f72484x0.get();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.v0.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f72484x0.lazySet(null);
                this.f72479r0.cancel(this.f72477p0);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.v0.get();
        }

        @Override // io.reactivex.ObservableSource
        public final void subscribe(Observer<? super T> observer) {
            if (!this.f72483w0.compareAndSet(false, true)) {
                EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), observer);
                return;
            }
            observer.onSubscribe(this);
            AtomicReference<Observer<? super T>> atomicReference = this.f72484x0;
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
        this.f72464p0 = function;
        this.f72465q0 = function2;
        this.f72466r0 = i10;
        this.f72467s0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super GroupedObservable<K, V>> observer) {
        this.source.subscribe(new GroupByObserver(observer, this.f72464p0, this.f72465q0, this.f72466r0, this.f72467s0));
    }
}

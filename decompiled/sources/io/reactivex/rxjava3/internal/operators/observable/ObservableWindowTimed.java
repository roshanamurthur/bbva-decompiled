package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWindowTimed<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Observable<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77393p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f77394q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f77395r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f77396s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final long f77397t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f77398u0;
    public final boolean v0;

    public static abstract class a<T> extends AtomicInteger implements Observer<T>, Disposable {
        public volatile boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Observable<T>> f77399p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f77401r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f77402s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f77403t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f77404u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Throwable f77405w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Disposable f77406x0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MpscLinkedQueue f77400q0 = new MpscLinkedQueue();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final AtomicBoolean f77407y0 = new AtomicBoolean();
        public final AtomicInteger F0 = new AtomicInteger(1);

        public a(Observer<? super Observable<T>> observer, long j10, TimeUnit timeUnit, int i10) {
            this.f77399p0 = observer;
            this.f77401r0 = j10;
            this.f77402s0 = timeUnit;
            this.f77403t0 = i10;
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public final void d() {
            if (this.F0.decrementAndGet() == 0) {
                a();
                this.f77406x0.dispose();
                this.E0 = true;
                c();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77407y0.compareAndSet(false, true)) {
                d();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77407y0.get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.v0 = true;
            c();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77405w0 = th2;
            this.v0 = true;
            c();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f77400q0.offer(t10);
            c();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77406x0, disposable)) {
                this.f77406x0 = disposable;
                this.f77399p0.onSubscribe(this);
                b();
            }
        }

        public void run() {
            d();
        }
    }

    public static final class b<T> extends a<T> implements Runnable {
        public final Scheduler G0;
        public final boolean H0;
        public final long I0;
        public final Scheduler.Worker J0;
        public long K0;
        public UnicastSubject<T> L0;
        public final SequentialDisposable M0;

        public static final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final b<?> f77408p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final long f77409q0;

            public a(b<?> bVar, long j10) {
                this.f77408p0 = bVar;
                this.f77409q0 = j10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b<?> bVar = this.f77408p0;
                bVar.f77400q0.offer(this);
                bVar.c();
            }
        }

        public b(int i10, long j10, long j11, Observer observer, Scheduler scheduler, TimeUnit timeUnit, boolean z10) {
            super(observer, j10, timeUnit, i10);
            this.G0 = scheduler;
            this.I0 = j11;
            this.H0 = z10;
            if (z10) {
                this.J0 = scheduler.createWorker();
            } else {
                this.J0 = null;
            }
            this.M0 = new SequentialDisposable();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a
        public final void a() {
            this.M0.dispose();
            Scheduler.Worker worker = this.J0;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a
        public final void b() {
            if (this.f77407y0.get()) {
                return;
            }
            this.f77404u0 = 1L;
            this.F0.getAndIncrement();
            UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.f77403t0, this);
            this.L0 = unicastSubjectCreate;
            io.reactivex.rxjava3.internal.operators.observable.b bVar = new io.reactivex.rxjava3.internal.operators.observable.b(unicastSubjectCreate);
            this.f77399p0.onNext(bVar);
            a aVar = new a(this, 1L);
            boolean z10 = this.H0;
            SequentialDisposable sequentialDisposable = this.M0;
            if (z10) {
                Scheduler.Worker worker = this.J0;
                long j10 = this.f77401r0;
                sequentialDisposable.replace(worker.schedulePeriodically(aVar, j10, j10, this.f77402s0));
            } else {
                Scheduler scheduler = this.G0;
                long j11 = this.f77401r0;
                sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(aVar, j11, j11, this.f77402s0));
            }
            if (bVar.d()) {
                this.L0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            MpscLinkedQueue mpscLinkedQueue = this.f77400q0;
            Observer<? super Observable<T>> observer = this.f77399p0;
            UnicastSubject<T> unicastSubjectE = this.L0;
            int iAddAndGet = 1;
            while (true) {
                if (this.E0) {
                    mpscLinkedQueue.clear();
                    unicastSubjectE = null;
                    this.L0 = null;
                } else {
                    boolean z10 = this.v0;
                    T tPoll = mpscLinkedQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f77405w0;
                        if (th2 != null) {
                            if (unicastSubjectE != null) {
                                unicastSubjectE.onError(th2);
                            }
                            observer.onError(th2);
                        } else {
                            if (unicastSubjectE != null) {
                                unicastSubjectE.onComplete();
                            }
                            observer.onComplete();
                        }
                        a();
                        this.E0 = true;
                    } else if (!z11) {
                        if (tPoll instanceof a) {
                            if (((a) tPoll).f77409q0 == this.f77404u0 || !this.H0) {
                                this.K0 = 0L;
                                unicastSubjectE = e(unicastSubjectE);
                            }
                        } else if (unicastSubjectE != null) {
                            unicastSubjectE.onNext(tPoll);
                            long j10 = this.K0 + 1;
                            if (j10 == this.I0) {
                                this.K0 = 0L;
                                unicastSubjectE = e(unicastSubjectE);
                            } else {
                                this.K0 = j10;
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public final UnicastSubject<T> e(UnicastSubject<T> unicastSubject) {
            if (unicastSubject != null) {
                unicastSubject.onComplete();
                unicastSubject = null;
            }
            if (this.f77407y0.get()) {
                a();
            } else {
                long j10 = this.f77404u0 + 1;
                this.f77404u0 = j10;
                this.F0.getAndIncrement();
                unicastSubject = UnicastSubject.create(this.f77403t0, this);
                this.L0 = unicastSubject;
                io.reactivex.rxjava3.internal.operators.observable.b bVar = new io.reactivex.rxjava3.internal.operators.observable.b(unicastSubject);
                this.f77399p0.onNext(bVar);
                if (this.H0) {
                    Scheduler.Worker worker = this.J0;
                    a aVar = new a(this, j10);
                    long j11 = this.f77401r0;
                    this.M0.update(worker.schedulePeriodically(aVar, j11, j11, this.f77402s0));
                }
                if (bVar.d()) {
                    unicastSubject.onComplete();
                }
            }
            return unicastSubject;
        }
    }

    public static final class c<T> extends a<T> implements Runnable {
        public static final Object K0 = new Object();
        public final Scheduler G0;
        public UnicastSubject<T> H0;
        public final SequentialDisposable I0;
        public final a J0;

        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.this.d();
            }
        }

        public c(Observer<? super Observable<T>> observer, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
            super(observer, j10, timeUnit, i10);
            this.G0 = scheduler;
            this.I0 = new SequentialDisposable();
            this.J0 = new a();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a
        public final void a() {
            this.I0.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a
        public final void b() {
            if (this.f77407y0.get()) {
                return;
            }
            this.F0.getAndIncrement();
            UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.f77403t0, this.J0);
            this.H0 = unicastSubjectCreate;
            this.f77404u0 = 1L;
            io.reactivex.rxjava3.internal.operators.observable.b bVar = new io.reactivex.rxjava3.internal.operators.observable.b(unicastSubjectCreate);
            this.f77399p0.onNext(bVar);
            Scheduler scheduler = this.G0;
            long j10 = this.f77401r0;
            this.I0.replace(scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f77402s0));
            if (bVar.d()) {
                this.H0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            MpscLinkedQueue mpscLinkedQueue = this.f77400q0;
            Observer<? super Observable<T>> observer = this.f77399p0;
            UnicastSubject<T> unicastSubjectCreate = this.H0;
            int iAddAndGet = 1;
            while (true) {
                if (this.E0) {
                    mpscLinkedQueue.clear();
                    this.H0 = null;
                    unicastSubjectCreate = null;
                } else {
                    boolean z10 = this.v0;
                    T tPoll = mpscLinkedQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f77405w0;
                        if (th2 != null) {
                            if (unicastSubjectCreate != null) {
                                unicastSubjectCreate.onError(th2);
                            }
                            observer.onError(th2);
                        } else {
                            if (unicastSubjectCreate != null) {
                                unicastSubjectCreate.onComplete();
                            }
                            observer.onComplete();
                        }
                        a();
                        this.E0 = true;
                    } else if (!z11) {
                        if (tPoll == K0) {
                            if (unicastSubjectCreate != null) {
                                unicastSubjectCreate.onComplete();
                                this.H0 = null;
                                unicastSubjectCreate = null;
                            }
                            if (this.f77407y0.get()) {
                                this.I0.dispose();
                            } else {
                                this.f77404u0++;
                                this.F0.getAndIncrement();
                                unicastSubjectCreate = UnicastSubject.create(this.f77403t0, this.J0);
                                this.H0 = unicastSubjectCreate;
                                io.reactivex.rxjava3.internal.operators.observable.b bVar = new io.reactivex.rxjava3.internal.operators.observable.b(unicastSubjectCreate);
                                observer.onNext(bVar);
                                if (bVar.d()) {
                                    unicastSubjectCreate.onComplete();
                                }
                            }
                        } else if (unicastSubjectCreate != null) {
                            unicastSubjectCreate.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a, java.lang.Runnable
        public final void run() {
            this.f77400q0.offer(K0);
            c();
        }
    }

    public static final class d<T> extends a<T> implements Runnable {
        public static final Object J0 = new Object();
        public static final Object K0 = new Object();
        public final long G0;
        public final Scheduler.Worker H0;
        public final LinkedList I0;

        public static final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final d<?> f77411p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final boolean f77412q0;

            public a(d<?> dVar, boolean z10) {
                this.f77411p0 = dVar;
                this.f77412q0 = z10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                d<?> dVar = this.f77411p0;
                dVar.f77400q0.offer(this.f77412q0 ? d.J0 : d.K0);
                dVar.c();
            }
        }

        public d(Observer<? super Observable<T>> observer, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker, int i10) {
            super(observer, j10, timeUnit, i10);
            this.G0 = j11;
            this.H0 = worker;
            this.I0 = new LinkedList();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a
        public final void a() {
            this.H0.dispose();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a
        public final void b() {
            if (this.f77407y0.get()) {
                return;
            }
            this.f77404u0 = 1L;
            this.F0.getAndIncrement();
            UnicastSubject unicastSubjectCreate = UnicastSubject.create(this.f77403t0, this);
            LinkedList linkedList = this.I0;
            linkedList.add(unicastSubjectCreate);
            io.reactivex.rxjava3.internal.operators.observable.b bVar = new io.reactivex.rxjava3.internal.operators.observable.b(unicastSubjectCreate);
            this.f77399p0.onNext(bVar);
            this.H0.schedule(new a(this, false), this.f77401r0, this.f77402s0);
            Scheduler.Worker worker = this.H0;
            a aVar = new a(this, true);
            long j10 = this.G0;
            worker.schedulePeriodically(aVar, j10, j10, this.f77402s0);
            if (bVar.d()) {
                unicastSubjectCreate.onComplete();
                linkedList.remove(unicastSubjectCreate);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableWindowTimed.a
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            MpscLinkedQueue mpscLinkedQueue = this.f77400q0;
            Observer<? super Observable<T>> observer = this.f77399p0;
            LinkedList linkedList = this.I0;
            int iAddAndGet = 1;
            while (true) {
                if (this.E0) {
                    mpscLinkedQueue.clear();
                    linkedList.clear();
                } else {
                    boolean z10 = this.v0;
                    T tPoll = mpscLinkedQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f77405w0;
                        if (th2 != null) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                ((UnicastSubject) it.next()).onError(th2);
                            }
                            observer.onError(th2);
                        } else {
                            Iterator it2 = linkedList.iterator();
                            while (it2.hasNext()) {
                                ((UnicastSubject) it2.next()).onComplete();
                            }
                            observer.onComplete();
                        }
                        a();
                        this.E0 = true;
                    } else if (!z11) {
                        if (tPoll == J0) {
                            if (!this.f77407y0.get()) {
                                this.f77404u0++;
                                this.F0.getAndIncrement();
                                UnicastSubject unicastSubjectCreate = UnicastSubject.create(this.f77403t0, this);
                                linkedList.add(unicastSubjectCreate);
                                io.reactivex.rxjava3.internal.operators.observable.b bVar = new io.reactivex.rxjava3.internal.operators.observable.b(unicastSubjectCreate);
                                observer.onNext(bVar);
                                this.H0.schedule(new a(this, false), this.f77401r0, this.f77402s0);
                                if (bVar.d()) {
                                    unicastSubjectCreate.onComplete();
                                }
                            }
                        } else if (tPoll != K0) {
                            Iterator it3 = linkedList.iterator();
                            while (it3.hasNext()) {
                                ((UnicastSubject) it3.next()).onNext(tPoll);
                            }
                        } else if (!linkedList.isEmpty()) {
                            ((UnicastSubject) linkedList.remove(0)).onComplete();
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public ObservableWindowTimed(Observable<T> observable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, long j12, int i10, boolean z10) {
        super(observable);
        this.f77393p0 = j10;
        this.f77394q0 = j11;
        this.f77395r0 = timeUnit;
        this.f77396s0 = scheduler;
        this.f77397t0 = j12;
        this.f77398u0 = i10;
        this.v0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        if (this.f77393p0 != this.f77394q0) {
            this.source.subscribe(new d(observer, this.f77393p0, this.f77394q0, this.f77395r0, this.f77396s0.createWorker(), this.f77398u0));
            return;
        }
        if (this.f77397t0 == Long.MAX_VALUE) {
            this.source.subscribe(new c(observer, this.f77393p0, this.f77395r0, this.f77396s0, this.f77398u0));
            return;
        }
        ObservableSource<T> observableSource = this.source;
        long j10 = this.f77393p0;
        TimeUnit timeUnit = this.f77395r0;
        observableSource.subscribe(new b(this.f77398u0, j10, this.f77397t0, observer, this.f77396s0, timeUnit, this.v0));
    }
}

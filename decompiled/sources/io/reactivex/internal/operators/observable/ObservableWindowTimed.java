package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableWindowTimed<T> extends io.reactivex.internal.operators.observable.a<T, Observable<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f73129p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f73130q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f73131r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f73132s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final long f73133t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f73134u0;
    public final boolean v0;

    public static final class a<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
        public Disposable E0;
        public UnicastSubject<T> F0;
        public volatile boolean G0;
        public final SequentialDisposable H0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73135q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f73136r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f73137s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f73138t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f73139u0;
        public final long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Scheduler.Worker f73140w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public long f73141x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public long f73142y0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$a$a, reason: collision with other inner class name */
        public static final class RunnableC0354a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final long f73143p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<?> f73144q0;

            public RunnableC0354a(long j10, a<?> aVar) {
                this.f73143p0 = j10;
                this.f73144q0 = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a<?> aVar = this.f73144q0;
                if (((QueueDrainObserver) aVar).cancelled) {
                    aVar.G0 = true;
                } else {
                    ((QueueDrainObserver) aVar).queue.offer(this);
                }
                if (aVar.enter()) {
                    aVar.c();
                }
            }
        }

        public a(int i10, long j10, long j11, SerializedObserver serializedObserver, Scheduler scheduler, TimeUnit timeUnit, boolean z10) {
            super(serializedObserver, new MpscLinkedQueue());
            this.H0 = new SequentialDisposable();
            this.f73135q0 = j10;
            this.f73136r0 = timeUnit;
            this.f73137s0 = scheduler;
            this.f73138t0 = i10;
            this.v0 = j11;
            this.f73139u0 = z10;
            if (z10) {
                this.f73140w0 = scheduler.createWorker();
            } else {
                this.f73140w0 = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
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
        public final void c() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.F0;
            int iLeave = 1;
            while (!this.G0) {
                boolean z10 = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC0354a;
                if (z10 && (z11 || z12)) {
                    this.F0 = null;
                    mpscLinkedQueue.clear();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        unicastSubject.onError(th2);
                    } else {
                        unicastSubject.onComplete();
                    }
                    DisposableHelper.dispose(this.H0);
                    Scheduler.Worker worker = this.f73140w0;
                    if (worker != null) {
                        worker.dispose();
                        return;
                    }
                    return;
                }
                if (z11) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z12) {
                    RunnableC0354a runnableC0354a = (RunnableC0354a) objPoll;
                    if (!this.f73139u0 || this.f73142y0 == runnableC0354a.f73143p0) {
                        unicastSubject.onComplete();
                        this.f73141x0 = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.f73138t0);
                        this.F0 = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                    long j10 = this.f73141x0 + 1;
                    if (j10 >= this.v0) {
                        this.f73142y0++;
                        this.f73141x0 = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.f73138t0);
                        this.F0 = unicastSubject;
                        this.downstream.onNext(unicastSubject);
                        if (this.f73139u0) {
                            Disposable disposable = this.H0.get();
                            disposable.dispose();
                            Scheduler.Worker worker2 = this.f73140w0;
                            RunnableC0354a runnableC0354a2 = new RunnableC0354a(this.f73142y0, this);
                            long j11 = this.f73135q0;
                            Disposable disposableSchedulePeriodically = worker2.schedulePeriodically(runnableC0354a2, j11, j11, this.f73136r0);
                            if (!this.H0.compareAndSet(disposable, disposableSchedulePeriodically)) {
                                disposableSchedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.f73141x0 = j10;
                    }
                }
            }
            this.E0.dispose();
            mpscLinkedQueue.clear();
            DisposableHelper.dispose(this.H0);
            Scheduler.Worker worker3 = this.f73140w0;
            if (worker3 != null) {
                worker3.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                c();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                c();
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.G0) {
                return;
            }
            if (fastEnter()) {
                UnicastSubject<T> unicastSubject = this.F0;
                unicastSubject.onNext(t10);
                long j10 = this.f73141x0 + 1;
                if (j10 >= this.v0) {
                    this.f73142y0++;
                    this.f73141x0 = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.f73138t0);
                    this.F0 = unicastSubjectCreate;
                    this.downstream.onNext(unicastSubjectCreate);
                    if (this.f73139u0) {
                        this.H0.get().dispose();
                        Scheduler.Worker worker = this.f73140w0;
                        RunnableC0354a runnableC0354a = new RunnableC0354a(this.f73142y0, this);
                        long j11 = this.f73135q0;
                        DisposableHelper.replace(this.H0, worker.schedulePeriodically(runnableC0354a, j11, j11, this.f73136r0));
                    }
                } else {
                    this.f73141x0 = j10;
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t10));
                if (!enter()) {
                    return;
                }
            }
            c();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            Disposable disposableSchedulePeriodicallyDirect;
            if (DisposableHelper.validate(this.E0, disposable)) {
                this.E0 = disposable;
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.f73138t0);
                this.F0 = unicastSubjectCreate;
                observer.onNext(unicastSubjectCreate);
                RunnableC0354a runnableC0354a = new RunnableC0354a(this.f73142y0, this);
                if (this.f73139u0) {
                    Scheduler.Worker worker = this.f73140w0;
                    long j10 = this.f73135q0;
                    disposableSchedulePeriodicallyDirect = worker.schedulePeriodically(runnableC0354a, j10, j10, this.f73136r0);
                } else {
                    Scheduler scheduler = this.f73137s0;
                    long j11 = this.f73135q0;
                    disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(runnableC0354a, j11, j11, this.f73136r0);
                }
                this.H0.replace(disposableSchedulePeriodicallyDirect);
            }
        }
    }

    public static final class b<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final Object f73145y0 = new Object();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73146q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f73147r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f73148s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f73149t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f73150u0;
        public UnicastSubject<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final SequentialDisposable f73151w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f73152x0;

        public b(SerializedObserver serializedObserver, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f73151w0 = new SequentialDisposable();
            this.f73146q0 = j10;
            this.f73147r0 = timeUnit;
            this.f73148s0 = scheduler;
            this.f73149t0 = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
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
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.v0;
            int iLeave = 1;
            while (true) {
                boolean z10 = this.f73152x0;
                boolean z11 = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                Object obj = f73145y0;
                if (z11 && (objPoll == null || objPoll == obj)) {
                    break;
                }
                if (objPoll == null) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll == obj) {
                    unicastSubject.onComplete();
                    if (z10) {
                        this.f73150u0.dispose();
                    } else {
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.f73149t0);
                        this.v0 = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                }
            }
            this.v0 = null;
            mpscLinkedQueue.clear();
            Throwable th2 = this.error;
            if (th2 != null) {
                unicastSubject.onError(th2);
            } else {
                unicastSubject.onComplete();
            }
            this.f73151w0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                a();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                a();
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f73152x0) {
                return;
            }
            if (fastEnter()) {
                this.v0.onNext(t10);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t10));
                if (!enter()) {
                    return;
                }
            }
            a();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73150u0, disposable)) {
                this.f73150u0 = disposable;
                this.v0 = UnicastSubject.create(this.f73149t0);
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                observer.onNext(this.v0);
                if (this.cancelled) {
                    return;
                }
                Scheduler scheduler = this.f73148s0;
                long j10 = this.f73146q0;
                this.f73151w0.replace(scheduler.schedulePeriodicallyDirect(this, j10, j10, this.f73147r0));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            if (this.cancelled) {
                this.f73152x0 = true;
            }
            this.queue.offer((U) f73145y0);
            if (enter()) {
                a();
            }
        }
    }

    public static final class c<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73153q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f73154r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final TimeUnit f73155s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Scheduler.Worker f73156t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f73157u0;
        public final LinkedList v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Disposable f73158w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f73159x0;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final UnicastSubject<T> f73160p0;

            public a(UnicastSubject<T> unicastSubject) {
                this.f73160p0 = unicastSubject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.this.a(this.f73160p0);
            }
        }

        public static final class b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnicastSubject<T> f73162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f73163b;

            public b(UnicastSubject<T> unicastSubject, boolean z10) {
                this.f73162a = unicastSubject;
                this.f73163b = z10;
            }
        }

        public c(SerializedObserver serializedObserver, long j10, long j11, TimeUnit timeUnit, Scheduler.Worker worker, int i10) {
            super(serializedObserver, new MpscLinkedQueue());
            this.f73153q0 = j10;
            this.f73154r0 = j11;
            this.f73155s0 = timeUnit;
            this.f73156t0 = worker;
            this.f73157u0 = i10;
            this.v0 = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(UnicastSubject<T> unicastSubject) {
            this.queue.offer((U) new b(unicastSubject, false));
            if (enter()) {
                b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void b() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            LinkedList linkedList = this.v0;
            int iLeave = 1;
            while (!this.f73159x0) {
                boolean z10 = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    mpscLinkedQueue.clear();
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            ((UnicastSubject) it.next()).onError(th2);
                        }
                    } else {
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            ((UnicastSubject) it2.next()).onComplete();
                        }
                    }
                    linkedList.clear();
                    this.f73156t0.dispose();
                    return;
                }
                if (z11) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f73163b) {
                        linkedList.remove(bVar.f73162a);
                        bVar.f73162a.onComplete();
                        if (linkedList.isEmpty() && this.cancelled) {
                            this.f73159x0 = true;
                        }
                    } else if (!this.cancelled) {
                        UnicastSubject unicastSubjectCreate = UnicastSubject.create(this.f73157u0);
                        linkedList.add(unicastSubjectCreate);
                        observer.onNext(unicastSubjectCreate);
                        this.f73156t0.schedule(new a(unicastSubjectCreate), this.f73153q0, this.f73155s0);
                    }
                } else {
                    Iterator it3 = linkedList.iterator();
                    while (it3.hasNext()) {
                        ((UnicastSubject) it3.next()).onNext(objPoll);
                    }
                }
            }
            this.f73158w0.dispose();
            mpscLinkedQueue.clear();
            linkedList.clear();
            this.f73156t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                b();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (enter()) {
                b();
            }
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (fastEnter()) {
                Iterator it = this.v0.iterator();
                while (it.hasNext()) {
                    ((UnicastSubject) it.next()).onNext(t10);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) t10);
                if (!enter()) {
                    return;
                }
            }
            b();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73158w0, disposable)) {
                this.f73158w0 = disposable;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject unicastSubjectCreate = UnicastSubject.create(this.f73157u0);
                this.v0.add(unicastSubjectCreate);
                this.downstream.onNext(unicastSubjectCreate);
                this.f73156t0.schedule(new a(unicastSubjectCreate), this.f73153q0, this.f73155s0);
                Scheduler.Worker worker = this.f73156t0;
                long j10 = this.f73154r0;
                worker.schedulePeriodically(this, j10, j10, this.f73155s0);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            Object bVar = new b(UnicastSubject.create(this.f73157u0), true);
            if (!this.cancelled) {
                this.queue.offer((U) bVar);
            }
            if (enter()) {
                b();
            }
        }
    }

    public ObservableWindowTimed(ObservableSource<T> observableSource, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, long j12, int i10, boolean z10) {
        super(observableSource);
        this.f73129p0 = j10;
        this.f73130q0 = j11;
        this.f73131r0 = timeUnit;
        this.f73132s0 = scheduler;
        this.f73133t0 = j12;
        this.f73134u0 = i10;
        this.v0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        long j10 = this.f73129p0;
        long j11 = this.f73130q0;
        if (j10 != j11) {
            this.source.subscribe(new c(serializedObserver, j10, j11, this.f73131r0, this.f73132s0.createWorker(), this.f73134u0));
            return;
        }
        long j12 = this.f73133t0;
        if (j12 == Long.MAX_VALUE) {
            this.source.subscribe(new b(serializedObserver, this.f73129p0, this.f73131r0, this.f73132s0, this.f73134u0));
            return;
        }
        ObservableSource<T> observableSource = this.source;
        TimeUnit timeUnit = this.f73131r0;
        observableSource.subscribe(new a(this.f73134u0, j10, j12, serializedObserver, this.f73132s0, timeUnit, this.v0));
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableCreate<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final FlowableOnSubscribe<T> f70412q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BackpressureStrategy f70413r0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70414a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f70414a = iArr;
            try {
                iArr[BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70414a[BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70414a[BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70414a[BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class c<T> extends b<T> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f70417r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f70418s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f70419t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicInteger f70420u0;

        public c(Subscriber<? super T> subscriber, int i10) {
            super(subscriber);
            this.f70417r0 = new SpscLinkedArrayQueue<>(i10);
            this.f70420u0 = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.b
        public final void c() {
            e();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.b
        public final void d() {
            if (this.f70420u0.getAndIncrement() == 0) {
                this.f70417r0.clear();
            }
        }

        public final void e() {
            if (this.f70420u0.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f70415p0;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f70417r0;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f70416q0.isDisposed()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.f70419t0;
                    T tPoll = spscLinkedArrayQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f70418s0;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(tPoll);
                    j11++;
                }
                if (j11 == j10) {
                    if (this.f70416q0.isDisposed()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z12 = this.f70419t0;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (z12 && zIsEmpty) {
                        Throwable th3 = this.f70418s0;
                        if (th3 != null) {
                            b(th3);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this, j11);
                }
                iAddAndGet = this.f70420u0.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.b, io.reactivex.Emitter
        public final void onComplete() {
            this.f70419t0 = true;
            e();
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t10) {
            if (this.f70419t0 || this.f70416q0.isDisposed()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f70417r0.offer(t10);
                e();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.b, io.reactivex.FlowableEmitter
        public final boolean tryOnError(Throwable th2) {
            if (this.f70419t0 || this.f70416q0.isDisposed()) {
                return false;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f70418s0 = th2;
            this.f70419t0 = true;
            e();
            return true;
        }
    }

    public static final class e<T> extends h<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.h
        public final void e() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public static final class f<T> extends b<T> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<T> f70421r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f70422s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f70423t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicInteger f70424u0;

        public f(Subscriber<? super T> subscriber) {
            super(subscriber);
            this.f70421r0 = new AtomicReference<>();
            this.f70424u0 = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.b
        public final void c() {
            e();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.b
        public final void d() {
            if (this.f70424u0.getAndIncrement() == 0) {
                this.f70421r0.lazySet(null);
            }
        }

        public final void e() {
            if (this.f70424u0.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f70415p0;
            AtomicReference<T> atomicReference = this.f70421r0;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (this.f70416q0.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z10 = this.f70423t0;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f70422s0;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(andSet);
                    j11++;
                }
                if (j11 == j10) {
                    if (this.f70416q0.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z12 = this.f70423t0;
                    boolean z13 = atomicReference.get() == null;
                    if (z12 && z13) {
                        Throwable th3 = this.f70422s0;
                        if (th3 != null) {
                            b(th3);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this, j11);
                }
                iAddAndGet = this.f70424u0.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.b, io.reactivex.Emitter
        public final void onComplete() {
            this.f70423t0 = true;
            e();
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t10) {
            if (this.f70423t0 || this.f70416q0.isDisposed()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f70421r0.set(t10);
                e();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.b, io.reactivex.FlowableEmitter
        public final boolean tryOnError(Throwable th2) {
            if (this.f70423t0 || this.f70416q0.isDisposed()) {
                return false;
            }
            if (th2 == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f70422s0 = th2;
            this.f70423t0 = true;
            e();
            return true;
        }
    }

    public static final class g<T> extends b<T> {
        @Override // io.reactivex.Emitter
        public final void onNext(T t10) {
            long j10;
            if (this.f70416q0.isDisposed()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.f70415p0.onNext(t10);
            do {
                j10 = get();
                if (j10 == 0) {
                    return;
                }
            } while (!compareAndSet(j10, j10 - 1));
        }
    }

    public static abstract class h<T> extends b<T> {
        public abstract void e();

        @Override // io.reactivex.Emitter
        public final void onNext(T t10) {
            if (this.f70416q0.isDisposed()) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                e();
            } else {
                this.f70415p0.onNext(t10);
                BackpressureHelper.produced(this, 1L);
            }
        }
    }

    public FlowableCreate(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.f70412q0 = flowableOnSubscribe;
        this.f70413r0 = backpressureStrategy;
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
    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        b gVar;
        int i10 = a.f70414a[this.f70413r0.ordinal()];
        if (i10 == 1) {
            gVar = new g(subscriber);
        } else if (i10 == 2) {
            gVar = new e(subscriber);
        } else if (i10 != 3) {
            gVar = i10 != 4 ? new c(subscriber, Flowable.bufferSize()) : new f(subscriber);
        } else {
            gVar = new d(subscriber);
        }
        subscriber.onSubscribe(gVar);
        try {
            this.f70412q0.subscribe(gVar);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            gVar.onError(th2);
        }
    }

    public static abstract class b<T> extends AtomicLong implements FlowableEmitter<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70415p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f70416q0 = new SequentialDisposable();

        public b(Subscriber<? super T> subscriber) {
            this.f70415p0 = subscriber;
        }

        public final void a() {
            SequentialDisposable sequentialDisposable = this.f70416q0;
            if (sequentialDisposable.isDisposed()) {
                return;
            }
            try {
                this.f70415p0.onComplete();
            } finally {
                sequentialDisposable.dispose();
            }
        }

        public final boolean b(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            SequentialDisposable sequentialDisposable = this.f70416q0;
            if (sequentialDisposable.isDisposed()) {
                return false;
            }
            try {
                this.f70415p0.onError(th2);
                return true;
            } finally {
                sequentialDisposable.dispose();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70416q0.dispose();
            d();
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            return this.f70416q0.isDisposed();
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th2) {
            if (tryOnError(th2)) {
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
                c();
            }
        }

        @Override // io.reactivex.FlowableEmitter
        public final long requested() {
            return get();
        }

        @Override // io.reactivex.FlowableEmitter
        public final FlowableEmitter<T> serialize() {
            return new i(this);
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setCancellable(Cancellable cancellable) {
            setDisposable(new CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setDisposable(Disposable disposable) {
            this.f70416q0.update(disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(Throwable th2) {
            return b(th2);
        }

        public void c() {
        }

        public void d() {
        }
    }

    public static final class d<T> extends h<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.h
        public final void e() {
        }
    }

    public static final class i<T> extends AtomicInteger implements FlowableEmitter<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f70425p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f70426q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscLinkedArrayQueue f70427r0 = new SpscLinkedArrayQueue(16);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f70428s0;

        public i(b<T> bVar) {
            this.f70425p0 = bVar;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                b();
            }
        }

        public final void b() {
            b<T> bVar = this.f70425p0;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f70427r0;
            AtomicThrowable atomicThrowable = this.f70426q0;
            int iAddAndGet = 1;
            while (!bVar.f70416q0.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    spscLinkedArrayQueue.clear();
                    bVar.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z10 = this.f70428s0;
                T tPoll = spscLinkedArrayQueue.poll();
                boolean z11 = tPoll == null;
                if (z10 && z11) {
                    bVar.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    bVar.onNext(tPoll);
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            return this.f70425p0.f70416q0.isDisposed();
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (this.f70425p0.f70416q0.isDisposed() || this.f70428s0) {
                return;
            }
            this.f70428s0 = true;
            a();
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th2) {
            if (tryOnError(th2)) {
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t10) {
            if (this.f70425p0.f70416q0.isDisposed() || this.f70428s0) {
                return;
            }
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f70425p0.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f70427r0;
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(t10);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.FlowableEmitter
        public final long requested() {
            return this.f70425p0.get();
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setCancellable(Cancellable cancellable) {
            this.f70425p0.setCancellable(cancellable);
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setDisposable(Disposable disposable) {
            this.f70425p0.setDisposable(disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            return this.f70425p0.toString();
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean tryOnError(Throwable th2) {
            if (!this.f70425p0.f70416q0.isDisposed() && !this.f70428s0) {
                if (th2 == null) {
                    th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f70426q0.addThrowable(th2)) {
                    this.f70428s0 = true;
                    a();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.FlowableEmitter
        public final FlowableEmitter<T> serialize() {
            return this;
        }
    }
}

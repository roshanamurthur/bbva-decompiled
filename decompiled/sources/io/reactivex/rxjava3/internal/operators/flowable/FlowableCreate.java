package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableEmitter;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Cancellable;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableCreate<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final FlowableOnSubscribe<T> f74677q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BackpressureStrategy f74678r0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74679a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f74679a = iArr;
            try {
                iArr[BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74679a[BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74679a[BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74679a[BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class c<T> extends b<T> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscLinkedArrayQueue<T> f74682r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f74683s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f74684t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicInteger f74685u0;

        public c(Subscriber<? super T> subscriber, int i10) {
            super(subscriber);
            this.f74682r0 = new SpscLinkedArrayQueue<>(i10);
            this.f74685u0 = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.b
        public final void c() {
            f();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.b
        public final void d() {
            if (this.f74685u0.getAndIncrement() == 0) {
                this.f74682r0.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.b
        public final boolean e(Throwable th2) {
            if (this.f74684t0 || this.f74681q0.isDisposed()) {
                return false;
            }
            this.f74683s0 = th2;
            this.f74684t0 = true;
            f();
            return true;
        }

        public final void f() {
            if (this.f74685u0.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f74680p0;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f74682r0;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f74681q0.isDisposed()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z10 = this.f74684t0;
                    T tPoll = spscLinkedArrayQueue.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f74683s0;
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
                    if (this.f74681q0.isDisposed()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z12 = this.f74684t0;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (z12 && zIsEmpty) {
                        Throwable th3 = this.f74683s0;
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
                iAddAndGet = this.f74685u0.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.b, io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            this.f74684t0 = true;
            f();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t10) {
            if (this.f74684t0 || this.f74681q0.isDisposed()) {
                return;
            }
            if (t10 == null) {
                onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
            } else {
                this.f74682r0.offer(t10);
                f();
            }
        }
    }

    public static final class e<T> extends h<T> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.h
        public final void f() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public static final class f<T> extends b<T> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<T> f74686r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f74687s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f74688t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicInteger f74689u0;

        public f(Subscriber<? super T> subscriber) {
            super(subscriber);
            this.f74686r0 = new AtomicReference<>();
            this.f74689u0 = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.b
        public final void c() {
            f();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.b
        public final void d() {
            if (this.f74689u0.getAndIncrement() == 0) {
                this.f74686r0.lazySet(null);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.b
        public final boolean e(Throwable th2) {
            if (this.f74688t0 || this.f74681q0.isDisposed()) {
                return false;
            }
            this.f74687s0 = th2;
            this.f74688t0 = true;
            f();
            return true;
        }

        public final void f() {
            if (this.f74689u0.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f74680p0;
            AtomicReference<T> atomicReference = this.f74686r0;
            int iAddAndGet = 1;
            do {
                long j10 = get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (this.f74681q0.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z10 = this.f74688t0;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (z10 && z11) {
                        Throwable th2 = this.f74687s0;
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
                    if (this.f74681q0.isDisposed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z12 = this.f74688t0;
                    boolean z13 = atomicReference.get() == null;
                    if (z12 && z13) {
                        Throwable th3 = this.f74687s0;
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
                iAddAndGet = this.f74689u0.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.b, io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            this.f74688t0 = true;
            f();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t10) {
            if (this.f74688t0 || this.f74681q0.isDisposed()) {
                return;
            }
            if (t10 == null) {
                onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
            } else {
                this.f74686r0.set(t10);
                f();
            }
        }
    }

    public static final class g<T> extends b<T> {
        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t10) {
            long j10;
            if (this.f74681q0.isDisposed()) {
                return;
            }
            if (t10 == null) {
                onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
                return;
            }
            this.f74680p0.onNext(t10);
            do {
                j10 = get();
                if (j10 == 0) {
                    return;
                }
            } while (!compareAndSet(j10, j10 - 1));
        }
    }

    public static abstract class h<T> extends b<T> {
        public abstract void f();

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t10) {
            if (this.f74681q0.isDisposed()) {
                return;
            }
            if (t10 == null) {
                onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
            } else if (get() == 0) {
                f();
            } else {
                this.f74680p0.onNext(t10);
                BackpressureHelper.produced(this, 1L);
            }
        }
    }

    public FlowableCreate(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        this.f74677q0 = flowableOnSubscribe;
        this.f74678r0 = backpressureStrategy;
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
    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        b gVar;
        int i10 = a.f74679a[this.f74678r0.ordinal()];
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
            this.f74677q0.subscribe(gVar);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            gVar.onError(th2);
        }
    }

    public static abstract class b<T> extends AtomicLong implements FlowableEmitter<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74680p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f74681q0 = new SequentialDisposable();

        public b(Subscriber<? super T> subscriber) {
            this.f74680p0 = subscriber;
        }

        public final void a() {
            SequentialDisposable sequentialDisposable = this.f74681q0;
            if (sequentialDisposable.isDisposed()) {
                return;
            }
            try {
                this.f74680p0.onComplete();
            } finally {
                sequentialDisposable.dispose();
            }
        }

        public final boolean b(Throwable th2) {
            SequentialDisposable sequentialDisposable = this.f74681q0;
            if (sequentialDisposable.isDisposed()) {
                return false;
            }
            try {
                this.f74680p0.onError(th2);
                return true;
            } finally {
                sequentialDisposable.dispose();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74681q0.dispose();
            d();
        }

        public boolean e(Throwable th2) {
            return b(th2);
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final boolean isCancelled() {
            return this.f74681q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onError(Throwable th2) {
            if (th2 == null) {
                th2 = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            if (e(th2)) {
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

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final long requested() {
            return get();
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final FlowableEmitter<T> serialize() {
            return new i(this);
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final void setCancellable(Cancellable cancellable) {
            setDisposable(new CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final void setDisposable(Disposable disposable) {
            this.f74681q0.update(disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final boolean tryOnError(Throwable th2) {
            if (th2 == null) {
                th2 = ExceptionHelper.createNullPointerException("tryOnError called with a null Throwable.");
            }
            return e(th2);
        }

        public void c() {
        }

        public void d() {
        }
    }

    public static final class d<T> extends h<T> {
        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate.h
        public final void f() {
        }
    }

    public static final class i<T> extends AtomicInteger implements FlowableEmitter<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T> f74690p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f74691q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SpscLinkedArrayQueue f74692r0 = new SpscLinkedArrayQueue(16);

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f74693s0;

        public i(b<T> bVar) {
            this.f74690p0 = bVar;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                b();
            }
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
        public final void b() {
            b<T> bVar = this.f74690p0;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f74692r0;
            AtomicThrowable atomicThrowable = this.f74691q0;
            int iAddAndGet = 1;
            while (!bVar.f74681q0.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    spscLinkedArrayQueue.clear();
                    atomicThrowable.tryTerminateConsumer(bVar);
                    return;
                }
                boolean z10 = this.f74693s0;
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

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final boolean isCancelled() {
            return this.f74690p0.f74681q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            if (this.f74690p0.f74681q0.isDisposed() || this.f74693s0) {
                return;
            }
            this.f74693s0 = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onError(Throwable th2) {
            if (tryOnError(th2)) {
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t10) {
            if (this.f74690p0.f74681q0.isDisposed() || this.f74693s0) {
                return;
            }
            if (t10 == null) {
                onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f74690p0.onNext(t10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f74692r0;
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(t10);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            b();
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final long requested() {
            return this.f74690p0.get();
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final void setCancellable(Cancellable cancellable) {
            this.f74690p0.setCancellable(cancellable);
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final void setDisposable(Disposable disposable) {
            this.f74690p0.setDisposable(disposable);
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            return this.f74690p0.toString();
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final boolean tryOnError(Throwable th2) {
            if (!this.f74690p0.f74681q0.isDisposed() && !this.f74693s0) {
                if (th2 == null) {
                    th2 = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
                }
                if (this.f74691q0.tryAddThrowable(th2)) {
                    this.f74693s0 = true;
                    a();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.rxjava3.core.FlowableEmitter
        public final FlowableEmitter<T> serialize() {
            return this;
        }
    }
}

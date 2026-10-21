package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SdkDigitizeStatus;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class AbstractFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final boolean f24685s0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Logger f24686t0 = Logger.getLogger(AbstractFuture.class.getName());

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a f24687u0;
    public static final Object v0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public volatile Object f24688p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public volatile d f24689q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public volatile h f24690r0;

    public static abstract class a {
        public abstract boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2);

        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f24691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f24692d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f24693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Throwable f24694b;

        static {
            if (AbstractFuture.f24685s0) {
                f24692d = null;
                f24691c = null;
            } else {
                f24692d = new b(null, false);
                f24691c = new b(null, true);
            }
        }

        public b(@Nullable Throwable th2, boolean z10) {
            this.f24693a = z10;
            this.f24694b = th2;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f24695b = new c(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f24696a;

        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th2) {
            boolean z10 = AbstractFuture.f24685s0;
            th2.getClass();
            this.f24696a = th2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f24697d = new d(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f24698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f24699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public d f24700c;

        public d(Runnable runnable, Executor executor) {
            this.f24698a = runnable;
            this.f24699b = executor;
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f24701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f24702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, h> f24703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, d> f24704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f24705e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            this.f24701a = atomicReferenceFieldUpdater;
            this.f24702b = atomicReferenceFieldUpdater2;
            this.f24703c = atomicReferenceFieldUpdater3;
            this.f24704d = atomicReferenceFieldUpdater4;
            this.f24705e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f24704d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == dVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f24705e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f24703c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == hVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void d(h hVar, h hVar2) {
            this.f24702b.lazySet(hVar, hVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void e(h hVar, Thread thread) {
            this.f24701a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AbstractFuture<V> f24706p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ListenableFuture<? extends V> f24707q0;

        public f(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
            this.f24706p0 = abstractFuture;
            this.f24707q0 = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f24706p0.f24688p0 != this) {
                return;
            }
            if (AbstractFuture.f24687u0.b(this.f24706p0, this, AbstractFuture.e(this.f24707q0))) {
                AbstractFuture.b(this.f24706p0);
            }
        }
    }

    public static final class g extends a {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f24689q0 != dVar) {
                        return false;
                    }
                    abstractFuture.f24689q0 = dVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f24688p0 != obj) {
                        return false;
                    }
                    abstractFuture.f24688p0 = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f24690r0 != hVar) {
                        return false;
                    }
                    abstractFuture.f24690r0 = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void d(h hVar, h hVar2) {
            hVar.f24710b = hVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void e(h hVar, Thread thread) {
            hVar.f24709a = thread;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f24708c = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public volatile Thread f24709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public volatile h f24710b;

        public h() {
            AbstractFuture.f24687u0.e(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, h.class, "r0"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, d.class, "q0"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "p0"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f24687u0 = gVar;
        if (th != null) {
            f24686t0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        v0 = new Object();
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
    public static void b(AbstractFuture<?> abstractFuture) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = abstractFuture.f24690r0;
            if (f24687u0.c(abstractFuture, hVar, h.f24708c)) {
                while (hVar != null) {
                    Thread thread = hVar.f24709a;
                    if (thread != null) {
                        hVar.f24709a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f24710b;
                }
                abstractFuture.afterDone();
                do {
                    dVar = abstractFuture.f24689q0;
                } while (!f24687u0.a(abstractFuture, dVar, d.f24697d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f24700c;
                    dVar3.f24700c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f24700c;
                    Runnable runnable = dVar2.f24698a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        abstractFuture = fVar.f24706p0;
                        if (abstractFuture.f24688p0 == fVar) {
                            if (f24687u0.b(abstractFuture, fVar, e(fVar.f24707q0))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f24699b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f24686t0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th2 = ((b) obj).f24694b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f24696a);
        }
        if (obj == v0) {
            return null;
        }
        return obj;
    }

    public static Object e(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) listenableFuture).f24688p0;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (bVar.f24693a) {
                return bVar.f24694b != null ? new b(bVar.f24694b, false) : b.f24692d;
            }
            return obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!f24685s0) && zIsCancelled) {
            return b.f24692d;
        }
        try {
            Object objF = f(listenableFuture);
            return objF == null ? v0 : objF;
        } catch (CancellationException e5) {
            if (zIsCancelled) {
                return new b(e5, false);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e5));
        } catch (ExecutionException e7) {
            return new c(e7.getCause());
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    public static <V> V f(Future<V> future) throws ExecutionException {
        V v3;
        boolean z10 = false;
        while (true) {
            try {
                v3 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v3;
    }

    public final void a(StringBuilder sb2) {
        try {
            Object objF = f(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objF == this ? "this future" : String.valueOf(objF));
            sb2.append(Constant.BRACKET_CLOSE);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e5.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e7) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e7.getCause());
            sb2.append(Constant.BRACKET_CLOSE);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f24689q0;
        d dVar2 = d.f24697d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f24700c = dVar;
                if (f24687u0.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f24689q0;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        b bVar;
        Object obj = this.f24688p0;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f24685s0) {
            bVar = new b(new CancellationException("Future.cancel() was called."), z10);
        } else {
            bVar = z10 ? b.f24691c : b.f24692d;
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z11 = false;
        while (true) {
            if (f24687u0.b(abstractFuture, obj, bVar)) {
                if (z10) {
                    abstractFuture.interruptTask();
                }
                b(abstractFuture);
                if (!(obj instanceof f)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((f) obj).f24707q0;
                if (!(listenableFuture instanceof AbstractFuture)) {
                    listenableFuture.cancel(z10);
                    return true;
                }
                abstractFuture = (AbstractFuture) listenableFuture;
                obj = abstractFuture.f24688p0;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractFuture.f24688p0;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
    }

    public final void g(h hVar) {
        hVar.f24709a = null;
        while (true) {
            h hVar2 = this.f24690r0;
            if (hVar2 == h.f24708c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f24710b;
                if (hVar2.f24709a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f24710b = hVar4;
                    if (hVar3.f24709a == null) {
                    }
                } else if (!f24687u0.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8 A[EDGE_INSN: B:56:0x00a8->B:36:0x0074 BREAK  A[LOOP:0: B:21:0x0041->B:86:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:67:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:78:0x014f  */
    /* JADX WARN: Code duplicated, block: B:80:0x015b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.concurrent.Future
    public final V get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24688p0 instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f24688p0;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String pendingToString() {
        Object obj = this.f24688p0;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ListenableFuture<? extends V> listenableFuture = ((f) obj).f24707q0;
            return ad.d.f(sb2, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), Constant.BRACKET_CLOSE);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
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
    public boolean set(@Nullable V v3) {
        if (v3 == null) {
            v3 = (V) v0;
        }
        if (!f24687u0.b(this, null, v3)) {
            return false;
        }
        b(this);
        return true;
    }

    public boolean setException(Throwable th2) {
        th2.getClass();
        if (!f24687u0.b(this, null, new c(th2))) {
            return false;
        }
        b(this);
        return true;
    }

    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        c cVar;
        listenableFuture.getClass();
        Object obj = this.f24688p0;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f24687u0.b(this, null, e(listenableFuture))) {
                    return false;
                }
                b(this);
                return true;
            }
            f fVar = new f(this, listenableFuture);
            if (f24687u0.b(this, null, fVar)) {
                try {
                    listenableFuture.addListener(fVar, s3.a.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        cVar = new c(th2);
                    } catch (Throwable unused) {
                        cVar = c.f24695b;
                    }
                    f24687u0.b(this, fVar, cVar);
                }
                return true;
            }
            obj = this.f24688p0;
        }
        if (obj instanceof b) {
            listenableFuture.cancel(((b) obj).f24693a);
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e5) {
                strPendingToString = "Exception thrown from implementation: " + e5.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strPendingToString);
                sb2.append(Constant.BRACKET_CLOSE);
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append(SdkDigitizeStatus.PENDING);
            }
        }
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.f24688p0;
        return (obj instanceof b) && ((b) obj).f24693a;
    }

    public void afterDone() {
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f24688p0;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) d(obj2);
            }
            h hVar = this.f24690r0;
            h hVar2 = h.f24708c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    a aVar = f24687u0;
                    aVar.d(hVar3, hVar);
                    if (aVar.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f24688p0;
                            } else {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) d(obj);
                    }
                    hVar = this.f24690r0;
                } while (hVar != hVar2);
            }
            return (V) d(this.f24688p0);
        }
        throw new InterruptedException();
    }
}

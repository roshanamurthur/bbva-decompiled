package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class SelfDestructiveThread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    public HandlerThread f20028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    public Handler f20029c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20034h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20027a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f20031e = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f20030d = 0;

    public interface ReplyCallback<T> {
        void onReply(T t10);
    }

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                SelfDestructiveThread.this.a();
                return true;
            }
            if (i10 != 1) {
                return true;
            }
            SelfDestructiveThread selfDestructiveThread = SelfDestructiveThread.this;
            Runnable runnable = (Runnable) message.obj;
            selfDestructiveThread.getClass();
            runnable.run();
            synchronized (selfDestructiveThread.f20027a) {
                selfDestructiveThread.f20029c.removeMessages(0);
                Handler handler = selfDestructiveThread.f20029c;
                handler.sendMessageDelayed(handler.obtainMessage(0), selfDestructiveThread.f20032f);
            }
            return true;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Callable f20036p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Handler f20037q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ReplyCallback f20038r0;

        public class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Object f20039p0;

            public a(Object obj) {
                this.f20039p0 = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.f20038r0.onReply(this.f20039p0);
            }
        }

        public b(Callable callable, Handler handler, ReplyCallback replyCallback) {
            this.f20036p0 = callable;
            this.f20037q0 = handler;
            this.f20038r0 = replyCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objCall;
            try {
                objCall = this.f20036p0.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f20037q0.post(new a(objCall));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f20041p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Callable f20042q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f20043r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f20044s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Condition f20045t0;

        public c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f20041p0 = atomicReference;
            this.f20042q0 = callable;
            this.f20043r0 = reentrantLock;
            this.f20044s0 = atomicBoolean;
            this.f20045t0 = condition;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f20041p0.set(this.f20042q0.call());
            } catch (Exception unused) {
            }
            ReentrantLock reentrantLock = this.f20043r0;
            reentrantLock.lock();
            try {
                this.f20044s0.set(false);
                this.f20045t0.signal();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public SelfDestructiveThread(String str, int i10, int i11) {
        this.f20034h = str;
        this.f20033g = i10;
        this.f20032f = i11;
    }

    public final void a() {
        synchronized (this.f20027a) {
            try {
                if (this.f20029c.hasMessages(1)) {
                    return;
                }
                this.f20028b.quit();
                this.f20028b = null;
                this.f20029c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this.f20027a) {
            try {
                if (this.f20028b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f20034h, this.f20033g);
                    this.f20028b = handlerThread;
                    handlerThread.start();
                    this.f20029c = new Handler(this.f20028b.getLooper(), this.f20031e);
                    this.f20030d++;
                }
                this.f20029c.removeMessages(0);
                Handler handler = this.f20029c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public int getGeneration() {
        int i10;
        synchronized (this.f20027a) {
            i10 = this.f20030d;
        }
        return i10;
    }

    @VisibleForTesting
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f20027a) {
            z10 = this.f20028b != null;
        }
        return z10;
    }

    public <T> void postAndReply(Callable<T> callable, ReplyCallback<T> replyCallback) {
        b(new b(callable, k2.a.a(), replyCallback));
    }

    public <T> T postAndWait(Callable<T> callable, int i10) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        b(new c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t10 = (T) atomicReference.get();
                reentrantLock.unlock();
                return t10;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t11 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t11;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}

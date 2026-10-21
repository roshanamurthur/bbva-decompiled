package uf;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: compiled from: SequentialExecutor.java */
/* JADX INFO: loaded from: classes10.dex */
public final class z implements Executor {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Logger f93846u0 = Logger.getLogger(z.class.getName());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Executor f93847p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @GuardedBy("queue")
    public final ArrayDeque f93848q0 = new ArrayDeque();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @GuardedBy("queue")
    public c f93849r0 = c.IDLE;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @GuardedBy("queue")
    public long f93850s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final b f93851t0 = new b();

    /* JADX INFO: compiled from: SequentialExecutor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Runnable f93852p0;

        public a(Runnable runnable) {
            this.f93852p0 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f93852p0.run();
        }

        public final String toString() {
            return this.f93852p0.toString();
        }
    }

    /* JADX INFO: compiled from: SequentialExecutor.java */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @CheckForNull
        public Runnable f93853p0;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r1 == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        
            r9.f93853p0.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
        
            uf.z.f93846u0.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f93853p0, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        
            r9.f93853p0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                uf.z r2 = uf.z.this     // Catch: java.lang.Throwable -> L56
                java.util.ArrayDeque r2 = r2.f93848q0     // Catch: java.lang.Throwable -> L56
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L56
                if (r0 != 0) goto L28
                uf.z r0 = uf.z.this     // Catch: java.lang.Throwable -> L1c
                uf.z$c r3 = r0.f93849r0     // Catch: java.lang.Throwable -> L1c
                uf.z$c r4 = uf.z.c.RUNNING     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                r0 = move-exception
                goto L79
            L1e:
                long r5 = r0.f93850s0     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.f93850s0 = r5     // Catch: java.lang.Throwable -> L1c
                r0.f93849r0 = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                uf.z r3 = uf.z.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.f93848q0     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                r9.f93853p0 = r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L47
                uf.z r0 = uf.z.this     // Catch: java.lang.Throwable -> L1c
                uf.z$c r3 = uf.z.c.IDLE     // Catch: java.lang.Throwable -> L1c
                r0.f93849r0 = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L46
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L46:
                return
            L47:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L56
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.f93853p0     // Catch: java.lang.Throwable -> L58 java.lang.RuntimeException -> L5a
                r3.run()     // Catch: java.lang.Throwable -> L58 java.lang.RuntimeException -> L5a
            L53:
                r9.f93853p0 = r2     // Catch: java.lang.Throwable -> L56
                goto L2
            L56:
                r0 = move-exception
                goto L7b
            L58:
                r0 = move-exception
                goto L76
            L5a:
                r3 = move-exception
                java.util.logging.Logger r4 = uf.z.f93846u0     // Catch: java.lang.Throwable -> L58
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L58
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
                r6.<init>()     // Catch: java.lang.Throwable -> L58
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L58
                java.lang.Runnable r7 = r9.f93853p0     // Catch: java.lang.Throwable -> L58
                r6.append(r7)     // Catch: java.lang.Throwable -> L58
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L58
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L58
                goto L53
            L76:
                r9.f93853p0 = r2     // Catch: java.lang.Throwable -> L56
                throw r0     // Catch: java.lang.Throwable -> L56
            L79:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L56
            L7b:
                if (r1 == 0) goto L84
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L84:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.z.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e5) {
                synchronized (z.this.f93848q0) {
                    z.this.f93849r0 = c.IDLE;
                    throw e5;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f93853p0;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + z.this.f93849r0 + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SequentialExecutor.java */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c IDLE;
        public static final c QUEUED;
        public static final c QUEUING;
        public static final c RUNNING;

        static {
            c cVar = new c("IDLE", 0);
            IDLE = cVar;
            c cVar2 = new c("QUEUING", 1);
            QUEUING = cVar2;
            c cVar3 = new c("QUEUED", 2);
            QUEUED = cVar3;
            c cVar4 = new c(DebugCoroutineInfoImplKt.RUNNING, 3);
            RUNNING = cVar4;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public z(Executor executor) {
        this.f93847p0 = (Executor) Preconditions.checkNotNull(executor);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z10;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f93848q0) {
            c cVar2 = this.f93849r0;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f93850s0;
                a aVar = new a(runnable);
                this.f93848q0.add(aVar);
                c cVar3 = c.QUEUING;
                this.f93849r0 = cVar3;
                try {
                    this.f93847p0.execute(this.f93851t0);
                    if (this.f93849r0 != cVar3) {
                        return;
                    }
                    synchronized (this.f93848q0) {
                        try {
                            if (this.f93850s0 == j10 && this.f93849r0 == cVar3) {
                                this.f93849r0 = cVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e5) {
                    synchronized (this.f93848q0) {
                        try {
                            c cVar4 = this.f93849r0;
                            if (cVar4 != c.IDLE && cVar4 != c.QUEUING) {
                                z10 = false;
                            } else if (this.f93848q0.removeLastOccurrence(aVar)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!(e5 instanceof RejectedExecutionException) || z10) {
                                throw e5;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            }
            this.f93848q0.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f93847p0 + "}";
    }
}

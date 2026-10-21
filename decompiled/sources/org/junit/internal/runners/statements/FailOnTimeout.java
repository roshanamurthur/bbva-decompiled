package org.junit.internal.runners.statements;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.internal.management.ManagementFactory;
import org.junit.internal.management.ThreadMXBean;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestTimedOutException;

/* JADX INFO: loaded from: classes13.dex */
public class FailOnTimeout extends Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Statement f91908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f91909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f91910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91911d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f91912a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f91913b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TimeUnit f91914c = TimeUnit.SECONDS;

        public FailOnTimeout build(Statement statement) {
            if (statement != null) {
                return new FailOnTimeout(this, statement);
            }
            throw new NullPointerException("statement cannot be null");
        }

        public Builder withLookingForStuckThread(boolean z10) {
            this.f91912a = z10;
            return this;
        }

        public Builder withTimeout(long j10, TimeUnit timeUnit) {
            if (j10 < 0) {
                throw new IllegalArgumentException("timeout must be non-negative");
            }
            if (timeUnit == null) {
                throw new NullPointerException("TimeUnit cannot be null");
            }
            this.f91913b = j10;
            this.f91914c = timeUnit;
            return this;
        }
    }

    public class a implements Callable<Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CountDownLatch f91915p0 = new CountDownLatch(1);

        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Throwable call() throws Exception {
            try {
                this.f91915p0.countDown();
                FailOnTimeout.this.f91908a.evaluate();
                return null;
            } catch (Exception e5) {
                throw e5;
            } catch (Throwable th2) {
                return th2;
            }
        }
    }

    @Deprecated
    public FailOnTimeout(Statement statement, long j10) {
        this(builder().withTimeout(j10, TimeUnit.MILLISECONDS), statement);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        ThreadGroup threadGroup;
        Thread thread;
        Throwable e5;
        StackTraceElement[] stackTrace;
        List listEmptyList;
        Iterator it;
        long threadCpuTime;
        a aVar = new a();
        FutureTask futureTask = new FutureTask(aVar);
        boolean z10 = this.f91911d;
        if (z10) {
            threadGroup = new ThreadGroup("FailOnTimeoutGroup");
            if (!threadGroup.isDaemon()) {
                try {
                    threadGroup.setDaemon(true);
                } catch (SecurityException unused) {
                }
            }
        } else {
            threadGroup = null;
        }
        Thread thread2 = new Thread(threadGroup, futureTask, "Time-limited test");
        thread2.setDaemon(true);
        thread2.start();
        aVar.f91915p0.await();
        long j10 = this.f91910c;
        TimeUnit timeUnit = this.f91909b;
        try {
            e5 = j10 > 0 ? (Throwable) futureTask.get(j10, timeUnit) : (Throwable) futureTask.get();
        } catch (InterruptedException e7) {
            e5 = e7;
        } catch (ExecutionException e10) {
            e5 = e10.getCause();
        } catch (TimeoutException unused2) {
            StackTraceElement[] stackTrace2 = thread2.getStackTrace();
            if (z10) {
                ThreadGroup threadGroup2 = thread2.getThreadGroup();
                int iMax = Math.max(threadGroup2.activeCount() * 2, 100);
                int i10 = 0;
                while (true) {
                    if (i10 >= 5) {
                        listEmptyList = Collections.emptyList();
                        break;
                    }
                    Thread[] threadArr = new Thread[iMax];
                    int iEnumerate = threadGroup2.enumerate(threadArr);
                    if (iEnumerate < iMax) {
                        listEmptyList = Arrays.asList(threadArr).subList(0, iEnumerate);
                        break;
                    } else {
                        iMax += 100;
                        i10++;
                    }
                }
                if (listEmptyList.isEmpty()) {
                    thread = null;
                } else {
                    Iterator it2 = listEmptyList.iterator();
                    long j11 = 0;
                    Thread thread3 = null;
                    while (it2.hasNext()) {
                        Thread thread4 = (Thread) it2.next();
                        if (thread4.getState() == Thread.State.RUNNABLE) {
                            ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
                            if (threadMXBean.isThreadCpuTimeSupported()) {
                                it = it2;
                                try {
                                    threadCpuTime = threadMXBean.getThreadCpuTime(thread4.getId());
                                } catch (UnsupportedOperationException unused3) {
                                    threadCpuTime = 0;
                                    if (thread3 != null || threadCpuTime > j11) {
                                        j11 = threadCpuTime;
                                        thread3 = thread4;
                                    }
                                    it2 = it;
                                }
                                if (thread3 != null) {
                                    j11 = threadCpuTime;
                                    thread3 = thread4;
                                } else {
                                    j11 = threadCpuTime;
                                    thread3 = thread4;
                                }
                            } else {
                                it = it2;
                            }
                            threadCpuTime = 0;
                            if (thread3 != null) {
                                j11 = threadCpuTime;
                                thread3 = thread4;
                            } else {
                                j11 = threadCpuTime;
                                thread3 = thread4;
                            }
                        } else {
                            it = it2;
                        }
                        it2 = it;
                    }
                    if (thread3 == thread2) {
                        thread = null;
                    } else {
                        thread = thread3;
                    }
                }
            } else {
                thread = null;
            }
            TestTimedOutException testTimedOutException = new TestTimedOutException(j10, timeUnit);
            if (stackTrace2 != null) {
                testTimedOutException.setStackTrace(stackTrace2);
                thread2.interrupt();
            }
            if (thread != null) {
                Exception exc = new Exception("Appears to be stuck in thread " + thread.getName());
                try {
                    stackTrace = thread.getStackTrace();
                } catch (SecurityException unused4) {
                    stackTrace = new StackTraceElement[0];
                }
                exc.setStackTrace(stackTrace);
                e5 = new MultipleFailureException(Arrays.asList(testTimedOutException, exc));
            } else {
                e5 = testTimedOutException;
            }
        }
        if (e5 != null) {
            throw e5;
        }
    }

    public FailOnTimeout(Builder builder, Statement statement) {
        this.f91908a = statement;
        this.f91910c = builder.f91913b;
        this.f91909b = builder.f91914c;
        this.f91911d = builder.f91912a;
    }
}

package okhttp3.internal.concurrent;

import androidx.appcompat.widget.g0;
import androidx.compose.animation.core.AnimationKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TaskRunner.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0003\u0017\u0016\u0018B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\n\u001a\u00020\u0002J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u0004R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "", "kickCoordinator$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "kickCoordinator", "Lokhttp3/internal/concurrent/Task;", "awaitTaskToRun", "newQueue", "", "activeQueues", "cancelAll", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "a", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "backend", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;)V", "Companion", "Backend", "RealBackend", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"})
public final class TaskRunner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final TaskRunner INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(Util.okHttpName + " TaskRunner", true)));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Logger f85774h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Backend backend;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f85779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f85780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TaskRunner$runnable$1 f85781g;

    /* JADX INFO: compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\tH&¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "beforeTask", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorNotify", "coordinatorWait", "nanos", "", "execute", "runnable", "Ljava/lang/Runnable;", "nanoTime", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Backend {
        void beforeTask(@NotNull TaskRunner taskRunner);

        void coordinatorNotify(@NotNull TaskRunner taskRunner);

        void coordinatorWait(@NotNull TaskRunner taskRunner, long nanos);

        void execute(@NotNull Runnable runnable);

        long nanoTime();
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "()V", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Logger getLogger() {
            return TaskRunner.f85774h;
        }
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "beforeTask", "", "nanoTime", "coordinatorNotify", "nanos", "coordinatorWait", "Ljava/lang/Runnable;", "runnable", "execute", "shutdown", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,314:1\n560#2:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n281#1:315\n*E\n"})
    public static final class RealBackend implements Backend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ThreadPoolExecutor f85782a;

        public RealBackend(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f85782a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(@NotNull TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(@NotNull TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(@NotNull TaskRunner taskRunner, long nanos) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j10 = nanos / AnimationKt.MillisToNanos;
            long j11 = nanos - (AnimationKt.MillisToNanos * j10);
            if (j10 > 0 || nanos > 0) {
                taskRunner.wait(j10, (int) j11);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f85782a.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.f85782a.shutdown();
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f85774h = logger;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(@NotNull Backend backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.backend = backend;
        this.f85776b = 10000;
        this.f85779e = new ArrayList();
        this.f85780f = new ArrayList();
        this.f85781g = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task taskAwaitTaskToRun;
                long jNanoTime;
                while (true) {
                    TaskRunner taskRunner = this.f85783p0;
                    synchronized (taskRunner) {
                        taskAwaitTaskToRun = taskRunner.awaitTaskToRun();
                    }
                    if (taskAwaitTaskToRun == null) {
                        return;
                    }
                    TaskQueue queue = taskAwaitTaskToRun.getQueue();
                    Intrinsics.checkNotNull(queue);
                    TaskRunner taskRunner2 = this.f85783p0;
                    boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
                        TaskLoggerKt.access$log(taskAwaitTaskToRun, queue, "starting");
                    } else {
                        jNanoTime = -1;
                    }
                    try {
                        TaskRunner.access$runTask(taskRunner2, taskAwaitTaskToRun);
                        try {
                            Unit unit = Unit.INSTANCE;
                            if (zIsLoggable) {
                                TaskLoggerKt.access$log(taskAwaitTaskToRun, queue, "finished run in " + TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
                            }
                        } catch (Throwable th2) {
                            if (zIsLoggable) {
                                TaskLoggerKt.access$log(taskAwaitTaskToRun, queue, "failed a run in " + TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        taskRunner2.getBackend().execute(this);
                        throw th3;
                    }
                }
            }
        };
    }

    public static final void access$runTask(TaskRunner taskRunner, Task task) {
        taskRunner.getClass();
        if (Util.assertionsEnabled && Thread.holdsLock(taskRunner)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + taskRunner);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.getName());
        try {
            long jRunOnce = task.runOnce();
            synchronized (taskRunner) {
                taskRunner.a(task, jRunOnce);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            synchronized (taskRunner) {
                taskRunner.a(task, -1L);
                Unit unit2 = Unit.INSTANCE;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void a(Task task, long j10) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        TaskQueue queue = task.getQueue();
        Intrinsics.checkNotNull(queue);
        if (queue.getActiveTask() != task) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean cancelActiveTask$okhttp = queue.getCancelActiveTask();
        queue.setCancelActiveTask$okhttp(false);
        queue.setActiveTask$okhttp(null);
        this.f85779e.remove(queue);
        if (j10 != -1 && !cancelActiveTask$okhttp && !queue.getShutdown()) {
            queue.scheduleAndDecide$okhttp(task, j10, true);
        }
        if (!queue.getFutureTasks$okhttp().isEmpty()) {
            this.f85780f.add(queue);
        }
    }

    @NotNull
    public final List<TaskQueue> activeQueues() {
        List<TaskQueue> listPlus;
        synchronized (this) {
            listPlus = CollectionsKt___CollectionsKt.plus((Collection) this.f85779e, (Iterable) this.f85780f);
        }
        return listPlus;
    }

    @Nullable
    public final Task awaitTaskToRun() throws Throwable {
        long j10;
        boolean z10;
        boolean z11;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (true) {
            ArrayList arrayList = this.f85780f;
            if (arrayList.isEmpty()) {
                return null;
            }
            Backend backend = this.backend;
            long jNanoTime = backend.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    j10 = jNanoTime;
                    z10 = false;
                    break;
                }
                Task task2 = ((TaskQueue) it.next()).getFutureTasks$okhttp().get(0);
                j10 = jNanoTime;
                long jMax = Math.max(0L, task2.getNextExecuteNanoTime() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        z10 = true;
                        break;
                    }
                    task = task2;
                }
                jNanoTime = j10;
            }
            if (task != null) {
                if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
                }
                task.setNextExecuteNanoTime$okhttp(-1L);
                TaskQueue queue = task.getQueue();
                Intrinsics.checkNotNull(queue);
                queue.getFutureTasks$okhttp().remove(task);
                arrayList.remove(queue);
                queue.setActiveTask$okhttp(task);
                this.f85779e.add(queue);
                if (z10 || (!this.f85777c && (!arrayList.isEmpty()))) {
                    backend.execute(this.f85781g);
                }
                return task;
            }
            if (this.f85777c) {
                if (jMin >= this.f85778d - j10) {
                    return null;
                }
                backend.coordinatorNotify(this);
                return null;
            }
            this.f85777c = true;
            this.f85778d = j10 + jMin;
            try {
                backend.coordinatorWait(this, jMin);
                z11 = false;
            } catch (InterruptedException unused) {
                z11 = false;
                try {
                    cancelAll();
                } catch (Throwable th2) {
                    th = th2;
                    this.f85777c = z11;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
                this.f85777c = z11;
                throw th;
            }
            this.f85777c = z11;
        }
    }

    public final void cancelAll() {
        ArrayList arrayList = this.f85779e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((TaskQueue) arrayList.get(size)).cancelAllAndDecide$okhttp();
            }
        }
        ArrayList arrayList2 = this.f85780f;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = (TaskQueue) arrayList2.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    @NotNull
    public final Backend getBackend() {
        return this.backend;
    }

    public final void kickCoordinator$okhttp(@NotNull TaskQueue taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.getActiveTask() == null) {
            boolean z10 = !taskQueue.getFutureTasks$okhttp().isEmpty();
            ArrayList arrayList = this.f85780f;
            if (z10) {
                Util.addIfAbsent(arrayList, taskQueue);
            } else {
                arrayList.remove(taskQueue);
            }
        }
        boolean z11 = this.f85777c;
        Backend backend = this.backend;
        if (z11) {
            backend.coordinatorNotify(this);
        } else {
            backend.execute(this.f85781g);
        }
    }

    @NotNull
    public final TaskQueue newQueue() {
        int i10;
        synchronized (this) {
            i10 = this.f85776b;
            this.f85776b = i10 + 1;
        }
        return new TaskQueue(this, g0.c(TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, i10));
    }
}

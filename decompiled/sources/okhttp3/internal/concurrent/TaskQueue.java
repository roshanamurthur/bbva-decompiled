package okhttp3.internal.concurrent;

import ad.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b>\u0010?J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086\bø\u0001\u0000J8\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000J\u0006\u0010\u0010\u001a\u00020\u000fJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u000f\u0010\u0019\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\bH\u0016R\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0016\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010)R$\u00100\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u00106\u001a\b\u0012\u0004\u0012\u00020\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010:\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010&\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010)R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020;8F¢\u0006\u0006\u001a\u0004\b<\u00105\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006@"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "Lokhttp3/internal/concurrent/Task;", "task", "", "delayNanos", "", "schedule", "", "name", "Lkotlin/Function0;", "block", "", "cancelable", "execute", "Ljava/util/concurrent/CountDownLatch;", "idleLatch", "recurrence", "scheduleAndDecide$okhttp", "(Lokhttp3/internal/concurrent/Task;JZ)Z", "scheduleAndDecide", "cancelAll", "shutdown", "cancelAllAndDecide$okhttp", "()Z", "cancelAllAndDecide", "toString", "Lokhttp3/internal/concurrent/TaskRunner;", "a", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "b", "Ljava/lang/String;", "getName$okhttp", "()Ljava/lang/String;", "c", "Z", "getShutdown$okhttp", "setShutdown$okhttp", "(Z)V", "d", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "activeTask", "", "e", "Ljava/util/List;", "getFutureTasks$okhttp", "()Ljava/util/List;", "futureTasks", "f", "getCancelActiveTask$okhttp", "setCancelActiveTask$okhttp", "cancelActiveTask", "", "getScheduledTasks", "scheduledTasks", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"})
public final class TaskQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TaskRunner taskRunner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean shutdown;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Task activeTask;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f85769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean cancelActiveTask;

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class a extends Task {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final CountDownLatch f85771e;

        public a() {
            super(d.f(new StringBuilder(), Util.okHttpName, " awaitIdle"), false);
            this.f85771e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long runOnce() {
            this.f85771e.countDown();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n*L\n1#1,218:1\n*E\n"})
    public static final class AnonymousClass1 extends Task {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f85772e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z10, Function0<Unit> function0) {
            super(str, z10);
            this.f85772e = function0;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.f85772e.invoke();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2, reason: invalid class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"})
    public static final class AnonymousClass2 extends Task {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0<Long> f85773e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Long> function0) {
            super(str, false, 2, null);
            this.f85773e = function0;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            return this.f85773e.invoke().longValue();
        }
    }

    public TaskQueue(@NotNull TaskRunner taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.taskRunner = taskRunner;
        this.name = name;
        this.f85769e = new ArrayList();
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String name, long j10, boolean z10, Function0 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        taskQueue.schedule(new AnonymousClass1(name, z10, block), j10);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        taskQueue.schedule(task, j10);
    }

    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                if (cancelAllAndDecide$okhttp()) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            Intrinsics.checkNotNull(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        ArrayList arrayList = this.f85769e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).getCancelable()) {
                Task task2 = (Task) arrayList.get(size);
                if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void execute(@NotNull String name, long delayNanos, boolean cancelable, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        schedule(new AnonymousClass1(name, cancelable, block), delayNanos);
    }

    @Nullable
    /* JADX INFO: renamed from: getActiveTask$okhttp, reason: from getter */
    public final Task getActiveTask() {
        return this.activeTask;
    }

    /* JADX INFO: renamed from: getCancelActiveTask$okhttp, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    @NotNull
    public final List<Task> getFutureTasks$okhttp() {
        return this.f85769e;
    }

    @NotNull
    /* JADX INFO: renamed from: getName$okhttp, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Task> getScheduledTasks() {
        List<Task> list;
        synchronized (this.taskRunner) {
            list = CollectionsKt___CollectionsKt.toList(this.f85769e);
        }
        return list;
    }

    /* JADX INFO: renamed from: getShutdown$okhttp, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    @NotNull
    /* JADX INFO: renamed from: getTaskRunner$okhttp, reason: from getter */
    public final TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    @NotNull
    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.f85769e.isEmpty()) {
                return new CountDownLatch(0);
            }
            Task task = this.activeTask;
            if (task instanceof a) {
                return ((a) task).f85771e;
            }
            for (Task task2 : this.f85769e) {
                if (task2 instanceof a) {
                    return ((a) task2).f85771e;
                }
            }
            a aVar = new a();
            if (scheduleAndDecide$okhttp(aVar, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            return aVar.f85771e;
        }
    }

    public final void schedule(@NotNull Task task, long delayNanos) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (scheduleAndDecide$okhttp(task, delayNanos, false)) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.getCancelable()) {
                if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean scheduleAndDecide$okhttp(@NotNull Task task, long delayNanos, boolean recurrence) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.initQueue$okhttp(this);
        long jNanoTime = this.taskRunner.getBackend().nanoTime();
        long j10 = jNanoTime + delayNanos;
        ArrayList arrayList = this.f85769e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime() <= j10) {
                if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j10);
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            if (recurrence) {
                str = "run again after " + TaskLoggerKt.formatDuration(j10 - jNanoTime);
            } else {
                str = "scheduled after " + TaskLoggerKt.formatDuration(j10 - jNanoTime);
            }
            TaskLoggerKt.access$log(task, this, str);
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((Task) it.next()).getNextExecuteNanoTime() - jNanoTime > delayNanos) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, task);
        return size == 0;
    }

    public final void setActiveTask$okhttp(@Nullable Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z10) {
        this.cancelActiveTask = z10;
    }

    public final void setShutdown$okhttp(boolean z10) {
        this.shutdown = z10;
    }

    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                this.shutdown = true;
                if (cancelAllAndDecide$okhttp()) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String name, long j10, Function0 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        taskQueue.schedule(new AnonymousClass2(name, block), j10);
    }

    public final void schedule(@NotNull String name, long delayNanos, @NotNull Function0<Long> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        schedule(new AnonymousClass2(name, block), delayNanos);
    }
}

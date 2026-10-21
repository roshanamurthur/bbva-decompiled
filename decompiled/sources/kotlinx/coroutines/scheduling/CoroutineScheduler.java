package kotlinx.coroutines.scheduling;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.b;
import androidx.datastore.preferences.protobuf.e;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import com.sun.mail.imap.IMAPStore;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.c;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0003DEFB+\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\b\b\u0002\u00100\u001a\u00020\f\u0012\b\b\u0002\u00102\u001a\u00020\u001e¢\u0006\u0004\bB\u0010CJ\"\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0012\u0010\u000b\u001a\u00020\n2\n\u0010\u0004\u001a\u00060\u0003R\u00020\u0000J\u0011\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0086\bJ\u0014\u0010\u0012\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\fJ&\u0010\u001a\u001a\u00020\b2\n\u0010\u0016\u001a\u00060\u000fj\u0002`\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0016\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\bJ\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u000e\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001bJ\u0010\u0010\"\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001bH\u0002J\u000e\u0010#\u001a\b\u0018\u00010\u0003R\u00020\u0000H\u0002J\u0014\u0010$\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0003R\u00020\u0000H\u0002J\u0018\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\nH\u0002J\u0012\u0010(\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002J\b\u0010)\u001a\u00020\nH\u0002J\b\u0010*\u001a\u00020\u0005H\u0002J$\u0010+\u001a\u0004\u0018\u00010\u001b*\b\u0018\u00010\u0003R\u00020\u00002\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\u000e\u0010,\u001a\b\u0018\u00010\u0003R\u00020\u0000H\u0002R\u0014\u0010-\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u001e\u00109\u001a\f\u0012\b\u0012\u00060\u0003R\u00020\u0000088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u000b\u0010>\u001a\u00020=8\u0002X\u0082\u0004R\u000b\u0010@\u001a\u00020?8\u0002X\u0082\u0004R\u000b\u0010A\u001a\u00020?8\u0002X\u0082\u0004¨\u0006G"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "worker", "", "oldIndex", "newIndex", "", "parkedWorkersStackTopUpdate", "", "parkedWorkersStackPush", "", "state", "availableCpuPermits", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", IMAPStore.ID_COMMAND, "execute", HearingDisabilitiesConstants.CLOSE_MODAL, "timeout", "shutdown", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "tailDispatch", "dispatch", "Lkotlinx/coroutines/scheduling/Task;", "createTask", "signalCpuWork", "", "toString", "task", "runSafely", "addToGlobalQueue", "parkedWorkersStackPop", "parkedWorkersStackNextIndex", "stateSnapshot", "skipUnpark", "signalBlockingWork", "tryCreateWorker", "tryUnpark", "createNewWorker", "submitToLocalQueue", "currentWorker", "corePoolSize", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "maxPoolSize", "idleWorkerKeepAliveNs", "J", "schedulerName", "Ljava/lang/String;", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "isTerminated", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "controlState", "parkedWorkersStack", "<init>", "(IIJLjava/lang/String;)V", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1033:1\n285#1:1036\n283#1:1037\n283#1:1038\n285#1:1039\n280#1:1045\n281#1,5:1046\n291#1:1052\n283#1:1053\n284#1:1054\n283#1:1060\n284#1:1061\n280#1:1062\n288#1:1063\n283#1:1064\n283#1:1067\n284#1:1068\n285#1:1069\n93#2:1034\n93#2:1051\n1#3:1035\n28#4,4:1040\n28#4,4:1055\n20#5:1044\n20#5:1059\n90#6:1065\n610#7:1066\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n281#1:1036\n288#1:1037\n289#1:1038\n298#1:1039\n347#1:1045\n375#1:1046,5\n398#1:1052\n445#1:1053\n446#1:1054\n482#1:1060\n483#1:1061\n489#1:1062\n498#1:1063\n498#1:1064\n576#1:1067\n577#1:1068\n578#1:1069\n119#1:1034\n395#1:1051\n347#1:1040,4\n478#1:1055,4\n347#1:1044\n478#1:1059\n515#1:1065\n522#1:1066\n*E\n"})
public final class CoroutineScheduler implements Executor, Closeable {
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;

    @Volatile
    private volatile int _isTerminated;

    @Volatile
    private volatile long controlState;

    @JvmField
    public final int corePoolSize;

    @JvmField
    @NotNull
    public final GlobalQueue globalBlockingQueue;

    @JvmField
    @NotNull
    public final GlobalQueue globalCpuQueue;

    @JvmField
    public final long idleWorkerKeepAliveNs;

    @JvmField
    public final int maxPoolSize;

    @Volatile
    private volatile long parkedWorkersStack;

    @JvmField
    @NotNull
    public final String schedulerName;

    @JvmField
    @NotNull
    public final ResizableAtomicArray<Worker> workers;

    @NotNull
    private static final AtomicLongFieldUpdater parkedWorkersStack$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    @NotNull
    private static final AtomicLongFieldUpdater controlState$FU = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    @NotNull
    private static final AtomicIntegerFieldUpdater _isTerminated$FU = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    @JvmField
    @NotNull
    public static final Symbol NOT_IN_STACK = new Symbol("NOT_IN_STACK");

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public CoroutineScheduler(int i10, int i11, long j10, @NotNull String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(b.a("Core pool size ", i10, " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(n1.e("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(b.a("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(e.f("Idle worker keep alive time ", j10, " must be positive").toString());
        }
        this.globalCpuQueue = new GlobalQueue();
        this.globalBlockingQueue = new GlobalQueue();
        this.workers = new ResizableAtomicArray<>((i10 + 1) * 2);
        this.controlState = ((long) i10) << 42;
        this._isTerminated = 0;
    }

    private final boolean addToGlobalQueue(Task task) {
        return task.taskContext.getTaskMode() == 1 ? this.globalBlockingQueue.addLast(task) : this.globalCpuQueue.addLast(task);
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = controlState$FU;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int iCoerceAtLeast = c.coerceAtLeast(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iCoerceAtLeast >= this.corePoolSize) {
                    return 0;
                }
                if (i10 >= this.maxPoolSize) {
                    return 0;
                }
                int i11 = ((int) (controlState$FU.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.workers.get(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                Worker worker = new Worker(this, i11);
                this.workers.setSynchronized(i11, worker);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i12 = iCoerceAtLeast + 1;
                worker.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final Worker currentWorker() {
        Thread threadCurrentThread = Thread.currentThread();
        Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
        if (worker == null || !Intrinsics.areEqual(CoroutineScheduler.this, this)) {
            return null;
        }
        return worker;
    }

    public static /* synthetic */ void dispatch$default(CoroutineScheduler coroutineScheduler, Runnable runnable, TaskContext taskContext, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            taskContext = TasksKt.NonBlockingContext;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        coroutineScheduler.dispatch(runnable, taskContext, z10);
    }

    private final int parkedWorkersStackNextIndex(Worker worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != NOT_IN_STACK) {
            if (nextParkedWorker == null) {
                return 0;
            }
            Worker worker2 = (Worker) nextParkedWorker;
            int indexInArray = worker2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = worker2.getNextParkedWorker();
        }
        return -1;
    }

    private final Worker parkedWorkersStackPop() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            Worker worker = this.workers.get((int) (2097151 & j10));
            if (worker == null) {
                return null;
            }
            long j11 = (SvgConstantsKt.SPECIFIED_MARKER_START + j10) & (-2097152);
            int iParkedWorkersStackNextIndex = parkedWorkersStackNextIndex(worker);
            if (iParkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j10, ((long) iParkedWorkersStackNextIndex) | j11)) {
                worker.setNextParkedWorker(NOT_IN_STACK);
                return worker;
            }
        }
    }

    private final void signalBlockingWork(long stateSnapshot, boolean skipUnpark) {
        if (skipUnpark || tryUnpark() || tryCreateWorker(stateSnapshot)) {
            return;
        }
        tryUnpark();
    }

    private final Task submitToLocalQueue(Worker worker, Task task, boolean z10) {
        if (worker == null || worker.state == WorkerState.TERMINATED) {
            return task;
        }
        if (task.taskContext.getTaskMode() == 0 && worker.state == WorkerState.BLOCKING) {
            return task;
        }
        worker.mayHaveLocalTasks = true;
        return worker.localQueue.add(task, z10);
    }

    private final boolean tryCreateWorker(long state) {
        if (c.coerceAtLeast(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iCreateNewWorker = createNewWorker();
            if (iCreateNewWorker == 1 && this.corePoolSize > 1) {
                createNewWorker();
            }
            if (iCreateNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean tryCreateWorker$default(CoroutineScheduler coroutineScheduler, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = controlState$FU.get(coroutineScheduler);
        }
        return coroutineScheduler.tryCreateWorker(j10);
    }

    private final boolean tryUnpark() {
        Worker workerParkedWorkersStackPop;
        do {
            workerParkedWorkersStackPop = parkedWorkersStackPop();
            if (workerParkedWorkersStackPop == null) {
                return false;
            }
        } while (!Worker.workerCtl$FU.compareAndSet(workerParkedWorkersStackPop, -1, 0));
        LockSupport.unpark(workerParkedWorkersStackPop);
        return true;
    }

    public final int availableCpuPermits(long state) {
        return (int) ((state & 9223367638808264704L) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        shutdown(10000L);
    }

    @NotNull
    public final Task createTask(@NotNull Runnable block, @NotNull TaskContext taskContext) {
        long jNanoTime = TasksKt.schedulerTimeSource.nanoTime();
        if (!(block instanceof Task)) {
            return new TaskImpl(block, jNanoTime, taskContext);
        }
        Task task = (Task) block;
        task.submissionTime = jNanoTime;
        task.taskContext = taskContext;
        return task;
    }

    public final void dispatch(@NotNull Runnable block, @NotNull TaskContext taskContext, boolean tailDispatch) {
        AbstractTimeSource timeSource = AbstractTimeSourceKt.getTimeSource();
        if (timeSource != null) {
            timeSource.trackTask();
        }
        Task taskCreateTask = createTask(block, taskContext);
        boolean z10 = false;
        boolean z11 = taskCreateTask.taskContext.getTaskMode() == 1;
        long jAddAndGet = z11 ? controlState$FU.addAndGet(this, SvgConstantsKt.SPECIFIED_MARKER_START) : 0L;
        Worker workerCurrentWorker = currentWorker();
        Task taskSubmitToLocalQueue = submitToLocalQueue(workerCurrentWorker, taskCreateTask, tailDispatch);
        if (taskSubmitToLocalQueue != null && !addToGlobalQueue(taskSubmitToLocalQueue)) {
            throw new RejectedExecutionException(d.f(new StringBuilder(), this.schedulerName, " was terminated"));
        }
        if (tailDispatch && workerCurrentWorker != null) {
            z10 = true;
        }
        if (z11) {
            signalBlockingWork(jAddAndGet, z10);
        } else {
            if (z10) {
                return;
            }
            signalCpuWork();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        dispatch$default(this, command, null, false, 6, null);
    }

    public final boolean isTerminated() {
        return _isTerminated$FU.get(this) != 0;
    }

    public final boolean parkedWorkersStackPush(@NotNull Worker worker) {
        long j10;
        long j11;
        int indexInArray;
        if (worker.getNextParkedWorker() != NOT_IN_STACK) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = (SvgConstantsKt.SPECIFIED_MARKER_START + j10) & (-2097152);
            indexInArray = worker.getIndexInArray();
            worker.setNextParkedWorker(this.workers.get((int) (2097151 & j10)));
        } while (!parkedWorkersStack$FU.compareAndSet(this, j10, j11 | ((long) indexInArray)));
        return true;
    }

    public final void parkedWorkersStackTopUpdate(@NotNull Worker worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$FU;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iParkedWorkersStackNextIndex = (int) (2097151 & j10);
            long j11 = (SvgConstantsKt.SPECIFIED_MARKER_START + j10) & (-2097152);
            if (iParkedWorkersStackNextIndex == oldIndex) {
                iParkedWorkersStackNextIndex = newIndex == 0 ? parkedWorkersStackNextIndex(worker) : newIndex;
            }
            if (iParkedWorkersStackNextIndex >= 0 && parkedWorkersStack$FU.compareAndSet(this, j10, j11 | ((long) iParkedWorkersStackNextIndex))) {
                return;
            }
        }
    }

    public final void runSafely(@NotNull Task task) {
        AbstractTimeSource timeSource;
        try {
            task.run();
            timeSource = AbstractTimeSourceKt.getTimeSource();
            if (timeSource == null) {
                return;
            }
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                timeSource = AbstractTimeSourceKt.getTimeSource();
                if (timeSource == null) {
                    return;
                }
            } catch (Throwable th3) {
                AbstractTimeSource timeSource2 = AbstractTimeSourceKt.getTimeSource();
                if (timeSource2 != null) {
                    timeSource2.unTrackTask();
                }
                throw th3;
            }
        }
        timeSource.unTrackTask();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public final void shutdown(long timeout) throws InterruptedException {
        int i10;
        Task taskRemoveFirstOrNull;
        if (_isTerminated$FU.compareAndSet(this, 0, 1)) {
            Worker workerCurrentWorker = currentWorker();
            synchronized (this.workers) {
                i10 = (int) (controlState$FU.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Worker worker = this.workers.get(i11);
                    Intrinsics.checkNotNull(worker);
                    Worker worker2 = worker;
                    if (worker2 != workerCurrentWorker) {
                        while (worker2.isAlive()) {
                            LockSupport.unpark(worker2);
                            worker2.join(timeout);
                        }
                        worker2.localQueue.offloadAllWorkTo(this.globalBlockingQueue);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.globalBlockingQueue.close();
            this.globalCpuQueue.close();
            while (true) {
                if (workerCurrentWorker == null) {
                    taskRemoveFirstOrNull = this.globalCpuQueue.removeFirstOrNull();
                    if (taskRemoveFirstOrNull == null && (taskRemoveFirstOrNull = this.globalBlockingQueue.removeFirstOrNull()) == null) {
                        break;
                    }
                } else {
                    taskRemoveFirstOrNull = workerCurrentWorker.findTask(true);
                    if (taskRemoveFirstOrNull == null) {
                        taskRemoveFirstOrNull = this.globalCpuQueue.removeFirstOrNull();
                        if (taskRemoveFirstOrNull == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                runSafely(taskRemoveFirstOrNull);
            }
            if (workerCurrentWorker != null) {
                workerCurrentWorker.tryReleaseCpu(WorkerState.TERMINATED);
            }
            parkedWorkersStack$FU.set(this, 0L);
            controlState$FU.set(this, 0L);
        }
    }

    public final void signalCpuWork() {
        if (tryUnpark() || tryCreateWorker$default(this, 0L, 1, null)) {
            return;
        }
        tryUnpark();
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iCurrentLength = this.workers.currentLength();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iCurrentLength; i15++) {
            Worker worker = this.workers.get(i15);
            if (worker != null) {
                int size$kotlinx_coroutines_core = worker.localQueue.getSize$kotlinx_coroutines_core();
                int i16 = WhenMappings.$EnumSwitchMapping$0[worker.state.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(size$kotlinx_coroutines_core);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(size$kotlinx_coroutines_core);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (size$kotlinx_coroutines_core > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(size$kotlinx_coroutines_core);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = controlState$FU.get(this);
        return this.schedulerName + '@' + DebugStringsKt.getHexAddress(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.getSize() + ", global blocking queue size = " + this.globalBlockingQueue.getSize() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020 H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020\u000eH\u0002J\n\u0010,\u001a\u0004\u0018\u00010 H\u0002J\n\u0010-\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010.\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u0003H\u0002J\b\u00101\u001a\u00020\u000eH\u0002J\u0006\u00102\u001a\u00020\u000eJ\u000e\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003J\b\u00105\u001a\u00020%H\u0002J\n\u00106\u001a\u0004\u0018\u00010 H\u0002J\b\u00107\u001a\u00020%H\u0016J\u0006\u00108\u001a\u00020\u0010J\b\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020\u000eH\u0002J\b\u0010;\u001a\u00020%H\u0002J\u000e\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u001dJ\u0016\u0010>\u001a\u0004\u0018\u00010 2\n\u0010?\u001a\u00060\u0003j\u0002`@H\u0002J\b\u0010A\u001a\u00020%H\u0002R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00198Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0006\u0010\"\u001a\u00020#¨\u0006B"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", FirebaseAnalytics.Param.INDEX, "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "", "minDelayUntilStealableTaskNs", "", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "stolenTask", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlinx/coroutines/scheduling/Task;", "terminationDeadline", "workerCtl", "Lkotlinx/atomicfu/AtomicInt;", "afterTask", "", "taskMode", "beforeTask", "executeTask", "task", "findAnyTask", "scanLocalQueue", "findBlockingTask", "findCpuTask", "findTask", "idleReset", "mode", "inStack", "isIo", "nextInt", "upperBound", "park", "pollGlobalQueues", "run", "runSingleTask", "runWorker", "tryAcquireCpuPermit", "tryPark", "tryReleaseCpu", "newState", "trySteal", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryTerminateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1033:1\n298#2:1034\n285#2:1035\n299#2,4:1036\n304#2:1040\n294#2,2:1041\n294#2,2:1045\n280#2:1052\n289#2:1053\n283#2:1054\n280#2:1055\n1#3:1043\n90#4:1044\n28#5,4:1047\n20#6:1051\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n665#1:1034\n665#1:1035\n665#1:1036,4\n679#1:1040\n753#1:1041,2\n807#1:1045,2\n855#1:1052\n881#1:1053\n881#1:1054\n963#1:1055\n790#1:1044\n851#1:1047,4\n851#1:1051\n*E\n"})
    public final class Worker extends Thread {

        @NotNull
        private static final AtomicIntegerFieldUpdater workerCtl$FU = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl");
        private volatile int indexInArray;

        @JvmField
        @NotNull
        public final WorkQueue localQueue;

        @JvmField
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;

        @Nullable
        private volatile Object nextParkedWorker;
        private int rngState;

        @JvmField
        @NotNull
        public WorkerState state;

        @NotNull
        private final Ref.ObjectRef<Task> stolenTask;
        private long terminationDeadline;

        @Volatile
        private volatile int workerCtl;

        private Worker() {
            setDaemon(true);
            this.localQueue = new WorkQueue();
            this.stolenTask = new Ref.ObjectRef<>();
            this.state = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.NOT_IN_STACK;
            this.rngState = Random.INSTANCE.nextInt();
        }

        private final void afterTask(int taskMode) {
            if (taskMode == 0) {
                return;
            }
            CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.state != WorkerState.TERMINATED) {
                this.state = WorkerState.DORMANT;
            }
        }

        private final void beforeTask(int taskMode) {
            if (taskMode != 0 && tryReleaseCpu(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.signalCpuWork();
            }
        }

        private final void executeTask(Task task) {
            int taskMode = task.taskContext.getTaskMode();
            idleReset(taskMode);
            beforeTask(taskMode);
            CoroutineScheduler.this.runSafely(task);
            afterTask(taskMode);
        }

        private final Task findAnyTask(boolean scanLocalQueue) {
            Task taskPollGlobalQueues;
            Task taskPollGlobalQueues2;
            if (scanLocalQueue) {
                boolean z10 = nextInt(CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z10 && (taskPollGlobalQueues2 = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues2;
                }
                Task taskPoll = this.localQueue.poll();
                if (taskPoll != null) {
                    return taskPoll;
                }
                if (!z10 && (taskPollGlobalQueues = pollGlobalQueues()) != null) {
                    return taskPollGlobalQueues;
                }
            } else {
                Task taskPollGlobalQueues3 = pollGlobalQueues();
                if (taskPollGlobalQueues3 != null) {
                    return taskPollGlobalQueues3;
                }
            }
            return trySteal(3);
        }

        private final Task findBlockingTask() {
            Task taskPollBlocking = this.localQueue.pollBlocking();
            if (taskPollBlocking != null) {
                return taskPollBlocking;
            }
            Task taskRemoveFirstOrNull = CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull == null ? trySteal(1) : taskRemoveFirstOrNull;
        }

        private final Task findCpuTask() {
            Task taskPollCpu = this.localQueue.pollCpu();
            if (taskPollCpu != null) {
                return taskPollCpu;
            }
            Task taskRemoveFirstOrNull = CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull == null ? trySteal(2) : taskRemoveFirstOrNull;
        }

        private final void idleReset(int mode) {
            this.terminationDeadline = 0L;
            if (this.state == WorkerState.PARKING) {
                this.state = WorkerState.BLOCKING;
            }
        }

        private final boolean inStack() {
            return this.nextParkedWorker != CoroutineScheduler.NOT_IN_STACK;
        }

        private final void park() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                tryTerminateWorker();
            }
        }

        private final Task pollGlobalQueues() {
            if (nextInt(2) == 0) {
                Task taskRemoveFirstOrNull = CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
                return taskRemoveFirstOrNull != null ? taskRemoveFirstOrNull : CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            }
            Task taskRemoveFirstOrNull2 = CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return taskRemoveFirstOrNull2 != null ? taskRemoveFirstOrNull2 : CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
        }

        private final void runWorker() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (CoroutineScheduler.this.isTerminated() || this.state == WorkerState.TERMINATED) {
                        break loop0;
                    }
                    Task taskFindTask = findTask(this.mayHaveLocalTasks);
                    if (taskFindTask != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        executeTask(taskFindTask);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if (this.minDelayUntilStealableTaskNs == 0) {
                        tryPark();
                    } else {
                        if (z10) {
                            tryReleaseCpu(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z10 = true;
                    }
                }
            }
            tryReleaseCpu(WorkerState.TERMINATED);
        }

        private final boolean tryAcquireCpuPermit() {
            long j10;
            if (this.state == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.controlState$FU;
            do {
                j10 = atomicLongFieldUpdater.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.controlState$FU.compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L));
            this.state = WorkerState.CPU_ACQUIRED;
            return true;
        }

        private final void tryPark() {
            if (!inStack()) {
                CoroutineScheduler.this.parkedWorkersStackPush(this);
                return;
            }
            workerCtl$FU.set(this, -1);
            while (inStack() && workerCtl$FU.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.state != WorkerState.TERMINATED) {
                tryReleaseCpu(WorkerState.PARKING);
                Thread.interrupted();
                park();
            }
        }

        private final Task trySteal(int stealingMode) {
            int i10 = (int) (CoroutineScheduler.controlState$FU.get(CoroutineScheduler.this) & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iNextInt = nextInt(i10);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                iNextInt++;
                if (iNextInt > i10) {
                    iNextInt = 1;
                }
                Worker worker = coroutineScheduler.workers.get(iNextInt);
                if (worker != null && worker != this) {
                    long jTrySteal = worker.localQueue.trySteal(stealingMode, this.stolenTask);
                    if (jTrySteal == -1) {
                        Ref.ObjectRef<Task> objectRef = this.stolenTask;
                        Task task = objectRef.element;
                        objectRef.element = null;
                        return task;
                    }
                    if (jTrySteal > 0) {
                        jMin = Math.min(jMin, jTrySteal);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        private final void tryTerminateWorker() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.workers) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    if (((int) (CoroutineScheduler.controlState$FU.get(coroutineScheduler) & 2097151)) <= coroutineScheduler.corePoolSize) {
                        return;
                    }
                    if (workerCtl$FU.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        setIndexInArray(0);
                        coroutineScheduler.parkedWorkersStackTopUpdate(this, i10, 0);
                        int andDecrement = (int) (CoroutineScheduler.controlState$FU.getAndDecrement(coroutineScheduler) & 2097151);
                        if (andDecrement != i10) {
                            Worker worker = coroutineScheduler.workers.get(andDecrement);
                            Intrinsics.checkNotNull(worker);
                            Worker worker2 = worker;
                            coroutineScheduler.workers.setSynchronized(i10, worker2);
                            worker2.setIndexInArray(i10);
                            coroutineScheduler.parkedWorkersStackTopUpdate(worker2, andDecrement, i10);
                        }
                        coroutineScheduler.workers.setSynchronized(andDecrement, null);
                        Unit unit = Unit.INSTANCE;
                        this.state = WorkerState.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Nullable
        public final Task findTask(boolean mayHaveLocalTasks) {
            return tryAcquireCpuPermit() ? findAnyTask(mayHaveLocalTasks) : findBlockingTask();
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @Nullable
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        @NotNull
        public final CoroutineScheduler getScheduler() {
            return CoroutineScheduler.this;
        }

        public final int getWorkerCtl() {
            return this.workerCtl;
        }

        public final boolean isIo() {
            return this.state == WorkerState.BLOCKING;
        }

        public final int nextInt(int upperBound) {
            int i10 = this.rngState;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.rngState = i13;
            int i14 = upperBound - 1;
            return (i14 & upperBound) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % upperBound;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            runWorker();
        }

        public final long runSingleTask() {
            boolean z10 = this.state == WorkerState.CPU_ACQUIRED;
            Task taskFindCpuTask = z10 ? findCpuTask() : findBlockingTask();
            if (taskFindCpuTask == null) {
                long j10 = this.minDelayUntilStealableTaskNs;
                if (j10 == 0) {
                    return -1L;
                }
                return j10;
            }
            CoroutineScheduler.this.runSafely(taskFindCpuTask);
            if (!z10) {
                CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, -2097152L);
            }
            return 0L;
        }

        public final void setIndexInArray(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.schedulerName);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void setNextParkedWorker(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean tryReleaseCpu(@NotNull WorkerState newState) {
            WorkerState workerState = this.state;
            boolean z10 = workerState == WorkerState.CPU_ACQUIRED;
            if (z10) {
                CoroutineScheduler.controlState$FU.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState != newState) {
                this.state = newState;
            }
            return z10;
        }

        public Worker(CoroutineScheduler coroutineScheduler, int i10) {
            this();
            setIndexInArray(i10);
        }
    }

    public /* synthetic */ CoroutineScheduler(int i10, int i11, long j10, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j10, (i12 & 8) != 0 ? TasksKt.DEFAULT_SCHEDULER_NAME : str);
    }
}

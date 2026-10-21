package kotlinx.coroutines.internal;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097Aø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0096\u0001J\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0016H\u0017J\u001c\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001c\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0017R\u0014\u0010\u001b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u00060!j\u0002`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u000b\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "", "tryAllocateWorker", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "obtainTaskOrDeallocateWorker", "", "time", "", "delay", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "", "parallelism", "limitedParallelism", "dispatch", "dispatchYield", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "workerAllocationLock", "Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,134:1\n66#1,8:135\n66#1,8:143\n28#2,4:151\n28#2,4:156\n20#3:155\n20#3:160\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n48#1:135,8\n55#1:143,8\n79#1:151,4\n92#1:156,4\n79#1:155\n92#1:160\n*E\n"})
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {

    @NotNull
    private static final AtomicIntegerFieldUpdater runningWorkers$FU = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers");
    private final /* synthetic */ Delay $$delegate_0;

    @NotNull
    private final CoroutineDispatcher dispatcher;
    private final int parallelism;

    @NotNull
    private final LockFreeTaskQueue<Runnable> queue;

    @Volatile
    private volatile int runningWorkers;

    @NotNull
    private final Object workerAllocationLock;

    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "(Lkotlinx/coroutines/internal/LimitedDispatcher;Ljava/lang/Runnable;)V", "run", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Worker implements Runnable {

        @NotNull
        private Runnable currentTask;

        public Worker(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th2) {
                    CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, th2);
                }
                Runnable runnableObtainTaskOrDeallocateWorker = LimitedDispatcher.this.obtainTaskOrDeallocateWorker();
                if (runnableObtainTaskOrDeallocateWorker == null) {
                    return;
                }
                this.currentTask = runnableObtainTaskOrDeallocateWorker;
                i10++;
                if (i10 >= 16 && LimitedDispatcher.this.dispatcher.isDispatchNeeded(LimitedDispatcher.this)) {
                    LimitedDispatcher.this.dispatcher.mo6007dispatch(LimitedDispatcher.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher, int i10) {
        this.dispatcher = coroutineDispatcher;
        this.parallelism = i10;
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.$$delegate_0 = delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
        this.queue = new LockFreeTaskQueue<>(false);
        this.workerAllocationLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable obtainTaskOrDeallocateWorker() {
        while (true) {
            Runnable runnableRemoveFirstOrNull = this.queue.removeFirstOrNull();
            if (runnableRemoveFirstOrNull != null) {
                return runnableRemoveFirstOrNull;
            }
            synchronized (this.workerAllocationLock) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = runningWorkers$FU;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.queue.getSize() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean tryAllocateWorker() {
        synchronized (this.workerAllocationLock) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = runningWorkers$FU;
            if (atomicIntegerFieldUpdater.get(this) >= this.parallelism) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object delay(long j10, @NotNull Continuation<? super Unit> continuation) {
        return this.$$delegate_0.delay(j10, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo6007dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(block);
        if (runningWorkers$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.mo6007dispatch(this, new Worker(runnableObtainTaskOrDeallocateWorker));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(block);
        if (runningWorkers$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.dispatchYield(this, new Worker(runnableObtainTaskOrDeallocateWorker));
    }

    @Override // kotlinx.coroutines.Delay
    @NotNull
    public DisposableHandle invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return this.$$delegate_0.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @ExperimentalCoroutinesApi
    @NotNull
    public CoroutineDispatcher limitedParallelism(int parallelism) {
        LimitedDispatcherKt.checkParallelism(parallelism);
        return parallelism >= this.parallelism ? this : super.limitedParallelism(parallelism);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo6008scheduleResumeAfterDelay(long timeMillis, @NotNull CancellableContinuation<? super Unit> continuation) {
        this.$$delegate_0.mo6008scheduleResumeAfterDelay(timeMillis, continuation);
    }
}

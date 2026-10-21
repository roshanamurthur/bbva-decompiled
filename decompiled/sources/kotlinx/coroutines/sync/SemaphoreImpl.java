package kotlinx.coroutines.sync;

import androidx.appcompat.widget.g0;
import com.bbva.networkplugin.command.impl.HeadCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import ek.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\f\u0010\u000e\u001a\u00020\n*\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0013\u0010\u0010\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0005J\u001e\u0010\u0015\u001a\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0004J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004R\u000b\u0010#\u001a\u00020\"8\u0002X\u0082\u0004R\u000b\u0010$\u001a\u00020\"8\u0002X\u0082\u0004R\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u0011\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Semaphore;", "", "acquireSlowPath", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "decPermits", "coerceAvailablePermitsAtMaximum", "Lkotlinx/coroutines/Waiter;", "waiter", "", "addAcquireToQueue", "tryResumeNextFromQueue", "", "tryResumeAcquire", "tryAcquire", "acquire", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "ignoredParam", "onAcquireRegFunction", "release", "permits", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Lkotlin/Function1;", "", "onCancellationRelease", "Lkotlin/jvm/functions/Function1;", "getAvailablePermits", "()I", "availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "enqIdx", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", HeadCommand.ID, "tail", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
public class SemaphoreImpl implements Semaphore {

    @Volatile
    private volatile int _availablePermits;

    @Volatile
    private volatile long deqIdx;

    @Volatile
    private volatile long enqIdx;

    @Volatile
    @Nullable
    private volatile Object head;

    @NotNull
    private final Function1<Throwable, Unit> onCancellationRelease;
    private final int permits;

    @Volatile
    @Nullable
    private volatile Object tail;

    @NotNull
    private static final AtomicReferenceFieldUpdater head$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, HeadCommand.ID);

    @NotNull
    private static final AtomicLongFieldUpdater deqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");

    @NotNull
    private static final AtomicReferenceFieldUpdater tail$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");

    @NotNull
    private static final AtomicLongFieldUpdater enqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");

    @NotNull
    private static final AtomicIntegerFieldUpdater _availablePermits$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");

    public SemaphoreImpl(int i10, int i11) {
        this.permits = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(g0.c("Semaphore should have at least 1 permit, but had ", i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(g0.c("The number of acquired permits should be in 0..", i10).toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head = semaphoreSegment;
        this.tail = semaphoreSegment;
        this._availablePermits = i10 - i11;
        this.onCancellationRelease = new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th2) {
                this.this$0.release();
            }
        };
    }

    public static /* synthetic */ Object acquire$suspendImpl(SemaphoreImpl semaphoreImpl, Continuation<? super Unit> continuation) throws Throwable {
        if (semaphoreImpl.decPermits() > 0) {
            return Unit.INSTANCE;
        }
        Object objAcquireSlowPath = semaphoreImpl.acquireSlowPath(continuation);
        return objAcquireSlowPath == a.getCOROUTINE_SUSPENDED() ? objAcquireSlowPath : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((CancellableContinuation<? super Unit>) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        } catch (Throwable th2) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(Waiter waiter) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$FU;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = enqIdx$FU.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        long j10 = andIncrement / ((long) SemaphoreKt.SEGMENT_SIZE);
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j10, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m6015isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM6013getSegmentimpl = SegmentOrClosed.m6013getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM6013getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM6013getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM6013getSegmentimpl)) {
                            if (!segment.decPointers$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            segment.remove();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == segment);
                    if (segmentM6013getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM6013getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m6013getSegmentimpl(objFindSegmentInternal);
        int i10 = (int) (andIncrement % ((long) SemaphoreKt.SEGMENT_SIZE));
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (!acquirers.compareAndSet(i10, null, waiter)) {
            if (acquirers.get(i10) != null) {
                Symbol symbol = SemaphoreKt.PERMIT;
                Symbol symbol2 = SemaphoreKt.TAKEN;
                AtomicReferenceArray acquirers2 = semaphoreSegment2.getAcquirers();
                while (!acquirers2.compareAndSet(i10, symbol, symbol2)) {
                    if (acquirers2.get(i10) != symbol) {
                        return false;
                    }
                }
                if (waiter instanceof CancellableContinuation) {
                    Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((CancellableContinuation) waiter).resume(Unit.INSTANCE, this.onCancellationRelease);
                } else {
                    if (!(waiter instanceof SelectInstance)) {
                        throw new IllegalStateException(("unexpected: " + waiter).toString());
                    }
                    ((SelectInstance) waiter).selectInRegistrationPhase(Unit.INSTANCE);
                }
                return true;
            }
        }
        waiter.invokeOnCancellation(semaphoreSegment2, i10);
        return true;
    }

    private final void coerceAvailablePermitsAtMaximum() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        do {
            atomicIntegerFieldUpdater = _availablePermits$FU;
            i10 = atomicIntegerFieldUpdater.get(this);
            i11 = this.permits;
            if (i10 <= i11) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final boolean tryResumeAcquire(Object obj) {
        if (!(obj instanceof CancellableContinuation)) {
            if (obj instanceof SelectInstance) {
                return ((SelectInstance) obj).trySelect(this, Unit.INSTANCE);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        Object objTryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$FU;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = deqIdx$FU.getAndIncrement(this);
        long j10 = andIncrement / ((long) SemaphoreKt.SEGMENT_SIZE);
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j10, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.m6015isClosedimpl(objFindSegmentInternal)) {
                break;
            }
            Segment segmentM6013getSegmentimpl = SegmentOrClosed.m6013getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= segmentM6013getSegmentimpl.id) {
                    break loop0;
                }
                if (!segmentM6013getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM6013getSegmentimpl)) {
                        if (!segment.decPointers$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        segment.remove();
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == segment);
                if (segmentM6013getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM6013getSegmentimpl.remove();
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m6013getSegmentimpl(objFindSegmentInternal);
        semaphoreSegment2.cleanPrev();
        boolean z10 = false;
        if (semaphoreSegment2.id > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) SemaphoreKt.SEGMENT_SIZE));
        Object andSet = semaphoreSegment2.getAcquirers().getAndSet(i10, SemaphoreKt.PERMIT);
        if (andSet != null) {
            if (andSet == SemaphoreKt.CANCELLED) {
                return false;
            }
            return tryResumeAcquire(andSet);
        }
        int i11 = SemaphoreKt.MAX_SPIN_CYCLES;
        for (int i12 = 0; i12 < i11; i12++) {
            if (semaphoreSegment2.getAcquirers().get(i10) == SemaphoreKt.TAKEN) {
                return true;
            }
        }
        Symbol symbol = SemaphoreKt.PERMIT;
        Symbol symbol2 = SemaphoreKt.BROKEN;
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (!acquirers.compareAndSet(i10, symbol, symbol2)) {
            if (acquirers.get(i10) != symbol) {
                return !z10;
            }
        }
        z10 = true;
        return !z10;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    @Nullable
    public Object acquire(@NotNull Continuation<? super Unit> continuation) {
        return acquire$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return Math.max(_availablePermits$FU.get(this), 0);
    }

    public final void onAcquireRegFunction(@NotNull SelectInstance<?> select, @Nullable Object ignoredParam) {
        while (decPermits() <= 0) {
            Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) select)) {
                return;
            }
        }
        select.selectInRegistrationPhase(Unit.INSTANCE);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
        do {
            int andIncrement = _availablePermits$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _availablePermits$FU;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final void acquire(@NotNull CancellableContinuation<? super Unit> waiter) {
        while (decPermits() <= 0) {
            Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) waiter)) {
                return;
            }
        }
        waiter.resume(Unit.INSTANCE, this.onCancellationRelease);
    }
}

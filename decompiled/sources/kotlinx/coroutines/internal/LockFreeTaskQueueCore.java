package kotlinx.coroutines.internal;

import a.d;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.networkplugin.command.impl.HeadCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ,*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J1\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0006J&\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\u0004\b\u0001\u0010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H#0%J\b\u0010&\u001a\u00020\u001aH\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010(\u001a\u0004\u0018\u00010\u0002J,\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002R#\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n0\tX\u0082\u0004R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", ExifInterface.LONGITUDE_EAST, "", "capacity", "", "singleConsumer", "", "(IZ)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Lkotlinx/atomicfu/AtomicArray;", "isEmpty", "()Z", "mask", "size", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)I", "allocateNextCopy", "state", "", "allocateOrGetNextCopy", HearingDisabilitiesConstants.CLOSE_MODAL, "fillPlaceholder", FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "markFrozen", "next", "removeFirstOrNull", "removeSlowPath", "oldHead", "newHead", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n299#2,3:309\n299#2,3:312\n299#2,3:315\n299#2,3:318\n299#2,3:321\n299#2,3:325\n299#2,3:328\n1#3:324\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n91#1:309,3\n92#1:312,3\n107#1:315,3\n167#1:318,3\n200#1:321,3\n231#1:325,3\n247#1:328,3\n*E\n"})
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;

    @Volatile
    @Nullable
    private volatile Object _next;

    @Volatile
    private volatile long _state;

    @NotNull
    private final AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next");

    @NotNull
    private static final AtomicLongFieldUpdater _state$FU = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state");

    @JvmField
    @NotNull
    public static final Symbol REMOVE_FROZEN = new Symbol("REMOVE_FROZEN");

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", HeadCommand.ID, "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int addFailReason(long j10) {
            return (j10 & LockFreeTaskQueueCore.CLOSED_MASK) != 0 ? 2 : 1;
        }

        public final long updateHead(long j10, int i10) {
            return wo(j10, LockFreeTaskQueueCore.HEAD_MASK) | ((long) i10);
        }

        public final long updateTail(long j10, int i10) {
            return wo(j10, LockFreeTaskQueueCore.TAIL_MASK) | (((long) i10) << 30);
        }

        public final <T> T withState(long j10, @NotNull Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) (LockFreeTaskQueueCore.HEAD_MASK & j10)), Integer.valueOf((int) ((j10 & LockFreeTaskQueueCore.TAIL_MASK) >> 30)));
        }

        public final long wo(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", FirebaseAnalytics.Param.INDEX, "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Placeholder {

        @JvmField
        public final int index;

        public Placeholder(int i10) {
            this.index = i10;
        }
    }

    public LockFreeTaskQueueCore(int i10, boolean z10) {
        this.capacity = i10;
        this.singleConsumer = z10;
        int i11 = i10 - 1;
        this.mask = i11;
        this.array = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LockFreeTaskQueueCore<E> allocateNextCopy(long state) {
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = new LockFreeTaskQueueCore<>(this.capacity * 2, this.singleConsumer);
        int i10 = (int) (HEAD_MASK & state);
        int i11 = (int) ((TAIL_MASK & state) >> 30);
        while (true) {
            int i12 = this.mask;
            if ((i10 & i12) == (i11 & i12)) {
                _state$FU.set(lockFreeTaskQueueCore, INSTANCE.wo(state, FROZEN_MASK));
                return lockFreeTaskQueueCore;
            }
            Object placeholder = this.array.get(i12 & i10);
            if (placeholder == null) {
                placeholder = new Placeholder(i10);
            }
            lockFreeTaskQueueCore.array.set(lockFreeTaskQueueCore.mask & i10, placeholder);
            i10++;
        }
    }

    private final LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long state) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        while (true) {
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore != null) {
                return lockFreeTaskQueueCore;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _next$FU;
            LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreAllocateNextCopy = allocateNextCopy(state);
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, lockFreeTaskQueueCoreAllocateNextCopy) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
        }
    }

    private final LockFreeTaskQueueCore<E> fillPlaceholder(int index, E element) {
        Object obj = this.array.get(this.mask & index);
        if (!(obj instanceof Placeholder) || ((Placeholder) obj).index != index) {
            return null;
        }
        this.array.set(index & this.mask, element);
        return this;
    }

    private final long markFrozen() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & FROZEN_MASK) != 0) {
                return j10;
            }
            j11 = j10 | FROZEN_MASK;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    private final LockFreeTaskQueueCore<E> removeSlowPath(int oldHead, int newHead) {
        long j10;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i10 = (int) (HEAD_MASK & j10);
            if ((FROZEN_MASK & j10) != 0) {
                return next();
            }
        } while (!_state$FU.compareAndSet(this, j10, INSTANCE.updateHead(j10, newHead)));
        this.array.set(this.mask & i10, null);
        return null;
    }

    public final int addLast(@NotNull E element) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return INSTANCE.addFailReason(j10);
            }
            int i10 = (int) (HEAD_MASK & j10);
            int i11 = (int) ((TAIL_MASK & j10) >> 30);
            int i12 = this.mask;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.singleConsumer && this.array.get(i11 & i12) != null) {
                int i13 = this.capacity;
                if (i13 < 1024 || ((i11 - i10) & MAX_CAPACITY_MASK) > (i13 >> 1)) {
                    return 1;
                }
            } else if (_state$FU.compareAndSet(this, j10, INSTANCE.updateTail(j10, (i11 + 1) & MAX_CAPACITY_MASK))) {
                this.array.set(i11 & i12, element);
                LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreFillPlaceholder = this;
                while ((_state$FU.get(lockFreeTaskQueueCoreFillPlaceholder) & FROZEN_MASK) != 0 && (lockFreeTaskQueueCoreFillPlaceholder = lockFreeTaskQueueCoreFillPlaceholder.next().fillPlaceholder(i11, element)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean close() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & CLOSED_MASK) != 0) {
                return true;
            }
            if ((FROZEN_MASK & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | CLOSED_MASK));
        return true;
    }

    public final int getSize() {
        long j10 = _state$FU.get(this);
        return (((int) ((j10 & TAIL_MASK) >> 30)) - ((int) (HEAD_MASK & j10))) & MAX_CAPACITY_MASK;
    }

    public final boolean isClosed() {
        return (_state$FU.get(this) & CLOSED_MASK) != 0;
    }

    public final boolean isEmpty() {
        long j10 = _state$FU.get(this);
        return ((int) (HEAD_MASK & j10)) == ((int) ((j10 & TAIL_MASK) >> 30));
    }

    @NotNull
    public final <R> List<R> map(@NotNull Function1<? super E, ? extends R> transform) {
        ArrayList arrayList = new ArrayList(this.capacity);
        long j10 = _state$FU.get(this);
        int i10 = (int) (HEAD_MASK & j10);
        int i11 = (int) ((j10 & TAIL_MASK) >> 30);
        while (true) {
            int i12 = this.mask;
            if ((i10 & i12) == (i11 & i12)) {
                return arrayList;
            }
            d dVar = (Object) this.array.get(i12 & i10);
            if (dVar != null && !(dVar instanceof Placeholder)) {
                arrayList.add(transform.invoke(dVar));
            }
            i10++;
        }
    }

    @NotNull
    public final LockFreeTaskQueueCore<E> next() {
        return allocateOrGetNextCopy(markFrozen());
    }

    @Nullable
    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = _state$FU;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((FROZEN_MASK & j10) != 0) {
                return REMOVE_FROZEN;
            }
            int i10 = (int) (HEAD_MASK & j10);
            int i11 = (int) ((TAIL_MASK & j10) >> 30);
            int i12 = this.mask;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.array.get(i12 & i10);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof Placeholder) {
                    return null;
                }
                int i13 = (i10 + 1) & MAX_CAPACITY_MASK;
                if (_state$FU.compareAndSet(this, j10, INSTANCE.updateHead(j10, i13))) {
                    this.array.set(this.mask & i10, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreRemoveSlowPath = this;
                    do {
                        lockFreeTaskQueueCoreRemoveSlowPath = lockFreeTaskQueueCoreRemoveSlowPath.removeSlowPath(i10, i13);
                    } while (lockFreeTaskQueueCoreRemoveSlowPath != null);
                    return obj;
                }
            }
        }
    }
}

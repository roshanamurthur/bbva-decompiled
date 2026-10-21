package kotlinx.coroutines.internal;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000226\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0000ø\u0001\u0000\u001a#\u0010\r\u001a\u00028\u0000\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b*\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a8\u0010\u0016\u001a\u00020\u0014*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0082\b\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", ExifInterface.LATITUDE_SOUTH, "", "id", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "prev", "createNewSegment", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "findSegmentInternal", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", HearingDisabilitiesConstants.CLOSE_MODAL, "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "cur", "", LandingAEMContentMapper.CONDITION, "addConditionally", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
public final class ConcurrentLinkedListKt {

    @NotNull
    private static final Symbol CLOSED = new Symbol("CLOSED");

    @NotNull
    public static final <N extends ConcurrentLinkedListNode<N>> N close(@NotNull N n7) {
        while (true) {
            Object nextOrClosed = n7.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n7;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) nextOrClosed;
            if (concurrentLinkedListNode != null) {
                n7 = (N) concurrentLinkedListNode;
            } else if (n7.markAsClosed()) {
                return n7;
            }
        }
    }

    @NotNull
    public static final Object findSegmentAndMoveForward$atomicfu(@Nullable Object obj, @NotNull AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j10, @NotNull Segment segment, @NotNull Function2 function2) {
        Object objFindSegmentInternal;
        loop0: while (true) {
            objFindSegmentInternal = findSegmentInternal(segment, j10, function2);
            if (!SegmentOrClosed.m6015isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM6013getSegmentimpl = SegmentOrClosed.m6013getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment2 = (Segment) atomicReferenceFieldUpdater.get(obj);
                    if (segment2.id >= segmentM6013getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM6013getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(obj, segment2, segmentM6013getSegmentimpl)) {
                            if (!segment2.decPointers$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            segment2.remove();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(obj) == segment2);
                    if (segmentM6013getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM6013getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return objFindSegmentInternal;
    }

    @NotNull
    public static final Object findSegmentAndMoveForward$atomicfu$array(@Nullable Object obj, @NotNull AtomicReferenceArray atomicReferenceArray, int i10, long j10, @NotNull Segment segment, @NotNull Function2 function2) {
        Object objFindSegmentInternal;
        loop0: while (true) {
            objFindSegmentInternal = findSegmentInternal(segment, j10, function2);
            if (!SegmentOrClosed.m6015isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM6013getSegmentimpl = SegmentOrClosed.m6013getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment2 = (Segment) atomicReferenceArray.get(i10);
                    if (segment2.id >= segmentM6013getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM6013getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceArray.compareAndSet(i10, segment2, segmentM6013getSegmentimpl)) {
                            if (!segment2.decPointers$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            segment2.remove();
                            break loop0;
                        }
                    } while (atomicReferenceArray.get(i10) == segment2);
                    if (segmentM6013getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM6013getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return objFindSegmentInternal;
    }

    @NotNull
    public static final <S extends Segment<S>> Object findSegmentInternal(@NotNull S s4, long j10, @NotNull Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s4.id >= j10 && !s4.isRemoved()) {
                return SegmentOrClosed.m6010constructorimpl(s4);
            }
            Object nextOrClosed = s4.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return SegmentOrClosed.m6010constructorimpl(CLOSED);
            }
            S sInvoke = (S) ((ConcurrentLinkedListNode) nextOrClosed);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s4.id + 1), s4);
                if (s4.trySetNext(sInvoke)) {
                    if (s4.isRemoved()) {
                        s4.remove();
                    }
                }
            }
            s4 = (Object) sInvoke;
        }
    }

    public static final boolean moveForward$atomicfu(@Nullable Object obj, @NotNull AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, @NotNull Segment segment) {
        while (true) {
            Segment segment2 = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment2.id >= segment.id) {
                return true;
            }
            if (!segment.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(obj, segment2, segment)) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(obj) == segment2);
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
        }
    }

    public static final boolean moveForward$atomicfu$array(@Nullable Object obj, @NotNull AtomicReferenceArray atomicReferenceArray, int i10, @NotNull Segment segment) {
        while (true) {
            Segment segment2 = (Segment) atomicReferenceArray.get(i10);
            if (segment2.id >= segment.id) {
                return true;
            }
            if (!segment.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            do {
                if (atomicReferenceArray.compareAndSet(i10, segment2, segment)) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                    return true;
                }
            } while (atomicReferenceArray.get(i10) == segment2);
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
        }
    }
}

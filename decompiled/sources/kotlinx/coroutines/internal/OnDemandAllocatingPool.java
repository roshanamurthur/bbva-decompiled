package kotlinx.coroutines.internal;

import androidx.camera.camera2.internal.compat.u;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OnDemandAllocatingPool.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0004\u001a\u00020\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u000b\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004R\u0013\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00148\u0002X\u0082\u0004¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "allocate", "", HearingDisabilitiesConstants.CLOSE_MODAL, "", "stateRepresentation$kotlinx_coroutines_core", "()Ljava/lang/String;", "stateRepresentation", "toString", "", "maxCapacity", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Lkotlin/Function1;", "create", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/atomicfu/AtomicInt;", "controlState", "Lkotlinx/atomicfu/AtomicArray;", "elements", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,107:1\n41#1:108\n41#1:109\n35#1,7:110\n41#1:127\n1549#2:117\n1620#2,2:118\n1622#2:122\n1549#2:123\n1620#2,3:124\n101#3,2:120\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n35#1:108\n54#1:109\n76#1:110,7\n92#1:127\n77#1:117\n77#1:118,2\n77#1:122\n91#1:123\n91#1:124,3\n79#1:120,2\n*E\n"})
public final class OnDemandAllocatingPool<T> {

    @NotNull
    private static final AtomicIntegerFieldUpdater controlState$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState");

    @Volatile
    private volatile int controlState;

    @NotNull
    private final Function1<Integer, T> create;

    @NotNull
    private final AtomicReferenceArray elements;
    private final int maxCapacity;

    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandAllocatingPool(int i10, @NotNull Function1<? super Integer, ? extends T> function1) {
        this.maxCapacity = i10;
        this.create = function1;
        this.elements = new AtomicReferenceArray(i10);
    }

    public final boolean allocate() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i10) != 0) {
                return false;
            }
            if (i10 >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$FU.compareAndSet(this, i10, i10 + 1));
        this.elements.set(i10, this.create.invoke(Integer.valueOf(i10)));
        return true;
    }

    @NotNull
    public final List<T> close() {
        int i10;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i10 = 0;
                break;
            }
        } while (!controlState$FU.compareAndSet(this, i10, Integer.MIN_VALUE | i10));
        IntRange intRangeUntil = c.until(0, i10);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            do {
                andSet = this.elements.getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    @NotNull
    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i10 = controlState$FU.get(this);
        IntRange intRangeUntil = c.until(0, Integer.MAX_VALUE & i10);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(this.elements.get(((IntIterator) it).nextInt()));
        }
        return u.f(arrayList.toString(), (i10 & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    @NotNull
    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + RootService.CLOSE_BRACKET;
    }
}

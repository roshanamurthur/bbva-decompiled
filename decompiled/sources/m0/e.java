package m0;

import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n1#2:4152\n*E\n"})
public final class e implements Iterable<Object>, Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SlotTable f83244p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f83245q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f83246r0;

    public e(@NotNull SlotTable slotTable, int i10) {
        this.f83244p0 = slotTable;
        int iAccess$dataAnchor = SlotTableKt.access$dataAnchor(slotTable.getGroups(), i10);
        int i11 = i10 + 1;
        this.f83245q0 = i11 < slotTable.getGroupsSize() ? SlotTableKt.access$dataAnchor(slotTable.getGroups(), i11) : slotTable.getSlotsSize();
        this.f83246r0 = iAccess$dataAnchor;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83246r0 < this.f83245q0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // java.util.Iterator
    @Nullable
    public final Object next() {
        Object obj;
        int i10 = this.f83246r0;
        if (i10 >= 0) {
            SlotTable slotTable = this.f83244p0;
            if (i10 < slotTable.getSlots().length) {
                obj = slotTable.getSlots()[this.f83246r0];
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        this.f83246r0++;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Object> iterator() {
        return this;
    }
}

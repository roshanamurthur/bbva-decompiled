package m0;

import androidx.compose.runtime.BitVector;
import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n33#2,6:4152\n1#3:4158\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n*L\n3681#1:4152,6\n*E\n"})
public final class q0 implements Iterable<Object>, Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SlotTable f83305p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f83306q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f83307r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f83308s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final BitVector f83309t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f83310u0;

    public q0(@NotNull SlotTable slotTable, int i10, @NotNull GroupSourceInformation groupSourceInformation) {
        this.f83305p0 = slotTable;
        int iAccess$dataAnchor = SlotTableKt.access$dataAnchor(slotTable.getGroups(), i10);
        this.f83306q0 = iAccess$dataAnchor;
        this.f83307r0 = groupSourceInformation.getDataStartOffset();
        int dataEndOffset = groupSourceInformation.getDataEndOffset();
        if (dataEndOffset <= 0) {
            int i11 = i10 + 1;
            dataEndOffset = (i11 < slotTable.getGroupsSize() ? SlotTableKt.access$dataAnchor(slotTable.getGroups(), i11) : slotTable.getSlotsSize()) - iAccess$dataAnchor;
        }
        this.f83308s0 = dataEndOffset;
        BitVector bitVector = new BitVector();
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = groups.get(i12);
                if (obj instanceof GroupSourceInformation) {
                    GroupSourceInformation groupSourceInformation2 = (GroupSourceInformation) obj;
                    bitVector.setRange(groupSourceInformation2.getDataStartOffset(), groupSourceInformation2.getDataEndOffset());
                }
            }
        }
        this.f83309t0 = bitVector;
        this.f83310u0 = bitVector.nextClear(this.f83307r0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83310u0 < this.f83308s0;
    }

    @Override // java.util.Iterator
    @Nullable
    public final Object next() {
        int i10 = this.f83310u0;
        Object obj = (i10 < 0 || i10 >= this.f83308s0) ? null : this.f83305p0.getSlots()[this.f83306q0 + this.f83310u0];
        this.f83310u0 = this.f83309t0.nextClear(this.f83310u0 + 1);
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

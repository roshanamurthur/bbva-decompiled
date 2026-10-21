package m0;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4151:1\n158#2,8:4152\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3522#1:4152,8\n*E\n"})
public final class g0 implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SlotTable f83252p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f83253q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f83254r0;

    public g0(int i10, @NotNull SlotTable slotTable, int i11) {
        this.f83252p0 = slotTable;
        this.f83253q0 = i10;
        this.f83254r0 = i11;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @Nullable
    public final CompositionGroup find(@NotNull Object obj) {
        int iAnchorIndex;
        int i10;
        if (obj instanceof Anchor) {
            Anchor anchor = (Anchor) obj;
            SlotTable slotTable = this.f83252p0;
            if (!slotTable.ownsAnchor(anchor) || (iAnchorIndex = slotTable.anchorIndex(anchor)) < (i10 = this.f83253q0) || iAnchorIndex - i10 >= SlotTableKt.access$groupSize(slotTable.getGroups(), i10)) {
                return null;
            }
            return new g0(iAnchorIndex, slotTable, this.f83254r0);
        }
        if (!(obj instanceof u0)) {
            return null;
        }
        u0 u0Var = (u0) obj;
        CompositionGroup compositionGroupFind = find(u0Var.f83325a);
        if (compositionGroupFind != null) {
            return (CompositionGroup) CollectionsKt___CollectionsKt.firstOrNull(CollectionsKt___CollectionsKt.drop(compositionGroupFind.getCompositionGroups(), u0Var.f83326b));
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public final Iterable<Object> getData() {
        SlotTable slotTable = this.f83252p0;
        int i10 = this.f83253q0;
        GroupSourceInformation groupSourceInformationSourceInformationOf = slotTable.sourceInformationOf(i10);
        return groupSourceInformationSourceInformationOf != null ? new q0(slotTable, i10, groupSourceInformationSourceInformationOf) : new e(slotTable, i10);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final int getGroupSize() {
        return SlotTableKt.access$groupSize(this.f83252p0.getGroups(), this.f83253q0);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public final Object getIdentity() {
        SlotTable slotTable = this.f83252p0;
        if (slotTable.getVersion() != this.f83254r0) {
            throw new ConcurrentModificationException();
        }
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            return slotReaderOpenReader.anchor(this.f83253q0);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public final Object getKey() {
        SlotTable slotTable = this.f83252p0;
        int[] groups = slotTable.getGroups();
        int i10 = this.f83253q0;
        if (!SlotTableKt.access$hasObjectKey(groups, i10)) {
            return Integer.valueOf(SlotTableKt.access$key(slotTable.getGroups(), i10));
        }
        Object obj = slotTable.getSlots()[SlotTableKt.access$objectKeyIndex(slotTable.getGroups(), i10)];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public final Object getNode() {
        SlotTable slotTable = this.f83252p0;
        int[] groups = slotTable.getGroups();
        int i10 = this.f83253q0;
        if (SlotTableKt.access$isNode(groups, i10)) {
            return slotTable.getSlots()[SlotTableKt.access$nodeIndex(slotTable.getGroups(), i10)];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final int getSlotsSize() {
        int groupSize = getGroupSize();
        int i10 = this.f83253q0;
        int i11 = groupSize + i10;
        SlotTable slotTable = this.f83252p0;
        return (i11 < slotTable.getGroupsSize() ? SlotTableKt.access$dataAnchor(slotTable.getGroups(), i11) : slotTable.getSlotsSize()) - SlotTableKt.access$dataAnchor(slotTable.getGroups(), i10);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public final String getSourceInfo() {
        SlotTable slotTable = this.f83252p0;
        int[] groups = slotTable.getGroups();
        int i10 = this.f83253q0;
        if (SlotTableKt.access$hasAux(groups, i10)) {
            Object obj = slotTable.getSlots()[SlotTableKt.access$auxIndex(slotTable.getGroups(), i10)];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        GroupSourceInformation groupSourceInformationSourceInformationOf = slotTable.sourceInformationOf(i10);
        if (groupSourceInformationSourceInformationOf != null) {
            return groupSourceInformationSourceInformationOf.getSourceInformation();
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final boolean isEmpty() {
        return SlotTableKt.access$groupSize(this.f83252p0.getGroups(), this.f83253q0) == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<CompositionGroup> iterator() {
        SlotTable slotTable = this.f83252p0;
        if (slotTable.getVersion() != this.f83254r0) {
            throw new ConcurrentModificationException();
        }
        int i10 = this.f83253q0;
        GroupSourceInformation groupSourceInformationSourceInformationOf = slotTable.sourceInformationOf(i10);
        return groupSourceInformationSourceInformationOf != null ? new r0(slotTable, i10, groupSourceInformationSourceInformationOf, new a(i10)) : new j(i10 + 1, slotTable, SlotTableKt.access$groupSize(slotTable.getGroups(), i10) + i10);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public final Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }
}

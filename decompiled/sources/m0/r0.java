package m0;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n1#2:4152\n*E\n"})
public final class r0 implements Iterator<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SlotTable f83311p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f83312q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final GroupSourceInformation f83313r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final s0 f83314s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f83315t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f83316u0;

    public r0(@NotNull SlotTable slotTable, int i10, @NotNull GroupSourceInformation groupSourceInformation, @NotNull s0 s0Var) {
        this.f83311p0 = slotTable;
        this.f83312q0 = i10;
        this.f83313r0 = groupSourceInformation;
        this.f83314s0 = s0Var;
        this.f83315t0 = slotTable.getVersion();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> groups = this.f83313r0.getGroups();
        return groups != null && this.f83316u0 < groups.size();
    }

    @Override // java.util.Iterator
    public final CompositionGroup next() {
        Object obj;
        ArrayList<Object> groups = this.f83313r0.getGroups();
        if (groups != null) {
            int i10 = this.f83316u0;
            this.f83316u0 = i10 + 1;
            obj = groups.get(i10);
        } else {
            obj = null;
        }
        boolean z10 = obj instanceof Anchor;
        SlotTable slotTable = this.f83311p0;
        if (z10) {
            return new g0(((Anchor) obj).getLocation(), slotTable, this.f83315t0);
        }
        if (!(obj instanceof GroupSourceInformation)) {
            ComposerKt.composeRuntimeError("Unexpected group information structure");
            throw new KotlinNothingValueException();
        }
        return new t0(slotTable, this.f83312q0, (GroupSourceInformation) obj, new f0(this.f83314s0, this.f83316u0 - 1));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

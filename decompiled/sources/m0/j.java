package m0;

import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotTableKt;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SlotTable f83260p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f83261q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f83262r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f83263s0;

    public j(int i10, @NotNull SlotTable slotTable, int i11) {
        this.f83260p0 = slotTable;
        this.f83261q0 = i11;
        this.f83262r0 = i10;
        this.f83263s0 = slotTable.getVersion();
        if (slotTable.getWriter()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83262r0 < this.f83261q0;
    }

    @Override // java.util.Iterator
    public final CompositionGroup next() {
        SlotTable slotTable = this.f83260p0;
        int version = slotTable.getVersion();
        int i10 = this.f83263s0;
        if (version != i10) {
            throw new ConcurrentModificationException();
        }
        int i11 = this.f83262r0;
        this.f83262r0 = SlotTableKt.access$groupSize(slotTable.getGroups(), i11) + i11;
        return new g0(i11, slotTable, i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

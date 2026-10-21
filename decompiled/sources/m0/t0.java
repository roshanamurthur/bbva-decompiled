package m0;

import androidx.compose.runtime.GroupSourceInformation;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SlotTable f83318p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f83319q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final GroupSourceInformation f83320r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final s0 f83321s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Integer f83322t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final t0 f83323u0 = this;

    public t0(@NotNull SlotTable slotTable, int i10, @NotNull GroupSourceInformation groupSourceInformation, @NotNull f0 f0Var) {
        this.f83318p0 = slotTable;
        this.f83319q0 = i10;
        this.f83320r0 = groupSourceInformation;
        this.f83321s0 = f0Var;
        this.f83322t0 = Integer.valueOf(groupSourceInformation.getKey());
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final /* synthetic */ CompositionGroup find(Object obj) {
        return t0.a.a(this, obj);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public final Iterable<CompositionGroup> getCompositionGroups() {
        return this.f83323u0;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public final Iterable<Object> getData() {
        return new q0(this.f83318p0, this.f83319q0, this.f83320r0);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final /* synthetic */ int getGroupSize() {
        return t0.b.a(this);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public final Object getIdentity() {
        return this.f83321s0.a(this.f83318p0);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public final Object getKey() {
        return this.f83322t0;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public final Object getNode() {
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final /* synthetic */ int getSlotsSize() {
        return t0.b.c(this);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public final String getSourceInfo() {
        return this.f83320r0.getSourceInformation();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final boolean isEmpty() {
        ArrayList<Object> groups = this.f83320r0.getGroups();
        boolean z10 = false;
        if (groups != null && !groups.isEmpty()) {
            z10 = true;
        }
        return !z10;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<CompositionGroup> iterator() {
        return new r0(this.f83318p0, this.f83319q0, this.f83320r0, this.f83321s0);
    }
}

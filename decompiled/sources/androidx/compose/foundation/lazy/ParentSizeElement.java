package androidx.compose.foundation.lazy;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y.i;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ly/i;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class ParentSizeElement extends ModifierNodeElement<i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final State<Integer> f4688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final State<Integer> f4689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f4690e;

    public /* synthetic */ ParentSizeElement(float f6, MutableIntState mutableIntState, MutableIntState mutableIntState2, String str, int i10) {
        this(f6, (i10 & 2) != 0 ? null : mutableIntState, (i10 & 4) != 0 ? null : mutableIntState2, str);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        i iVar = new i();
        iVar.H0 = this.f4687b;
        iVar.I0 = this.f4688c;
        iVar.J0 = this.f4689d;
        return iVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f4687b == iVar.H0) {
            if (Intrinsics.areEqual(this.f4688c, iVar.I0)) {
                if (Intrinsics.areEqual(this.f4689d, iVar.J0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        State<Integer> state = this.f4688c;
        int iHashCode = (state != null ? state.hashCode() : 0) * 31;
        State<Integer> state2 = this.f4689d;
        return Float.floatToIntBits(this.f4687b) + ((iHashCode + (state2 != null ? state2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName(this.f4690e);
        inspectorInfo.setValue(Float.valueOf(this.f4687b));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        i node2 = (i) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0 = this.f4687b;
        node2.I0 = this.f4688c;
        node2.J0 = this.f4689d;
    }

    public ParentSizeElement(float f6, @Nullable State<Integer> state, @Nullable State<Integer> state2, @NotNull String inspectorName) {
        Intrinsics.checkNotNullParameter(inspectorName, "inspectorName");
        this.f4687b = f6;
        this.f4688c = state;
        this.f4689d = state2;
        this.f4690e = inspectorName;
    }
}

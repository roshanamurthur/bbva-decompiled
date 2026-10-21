package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lt/n;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class ClickableSemanticsElement extends ModifierNodeElement<t.n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Role f3349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f3350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f3351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f3352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f3353g;

    public ClickableSemanticsElement(Role role, String str, String str2, Function0 function0, Function0 onClick, boolean z10) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f3348b = z10;
        this.f3349c = role;
        this.f3350d = str;
        this.f3351e = function0;
        this.f3352f = str2;
        this.f3353g = onClick;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        boolean z10 = this.f3348b;
        return new t.n(this.f3349c, this.f3352f, this.f3350d, this.f3353g, this.f3351e, z10);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSemanticsElement)) {
            return false;
        }
        ClickableSemanticsElement clickableSemanticsElement = (ClickableSemanticsElement) obj;
        return this.f3348b == clickableSemanticsElement.f3348b && Intrinsics.areEqual(this.f3349c, clickableSemanticsElement.f3349c) && Intrinsics.areEqual(this.f3350d, clickableSemanticsElement.f3350d) && Intrinsics.areEqual(this.f3351e, clickableSemanticsElement.f3351e) && Intrinsics.areEqual(this.f3352f, clickableSemanticsElement.f3352f) && Intrinsics.areEqual(this.f3353g, clickableSemanticsElement.f3353g);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int i10 = (this.f3348b ? 1231 : 1237) * 31;
        Role role = this.f3349c;
        int iHashCode = (i10 + (role != null ? role.hashCode() : 0)) * 31;
        String str = this.f3350d;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Function0<Unit> function0 = this.f3351e;
        int iHashCode3 = (iHashCode2 + (function0 != null ? function0.hashCode() : 0)) * 31;
        String str2 = this.f3352f;
        return this.f3353g.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        t.n node2 = (t.n) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        boolean z10 = this.f3348b;
        String str = this.f3352f;
        node2.a(this.f3349c, str, this.f3350d, this.f3353g, this.f3351e, z10);
    }
}

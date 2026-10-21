package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/g;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class CombinedClickableElement extends ModifierNodeElement<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableInteractionSource f3358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f3360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Role f3361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f3362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f3363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f3364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f3365i;

    public CombinedClickableElement() {
        throw null;
    }

    public CombinedClickableElement(MutableInteractionSource interactionSource, boolean z10, String str, Role role, Function0 onClick, String str2, Function0 function0, Function0 function1) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f3358b = interactionSource;
        this.f3359c = z10;
        this.f3360d = str;
        this.f3361e = role;
        this.f3362f = onClick;
        this.f3363g = str2;
        this.f3364h = function0;
        this.f3365i = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new g(this.f3358b, this.f3359c, this.f3360d, this.f3361e, this.f3362f, this.f3363g, this.f3364h, this.f3365i);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(CombinedClickableElement.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.CombinedClickableElement");
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.areEqual(this.f3358b, combinedClickableElement.f3358b) && this.f3359c == combinedClickableElement.f3359c && Intrinsics.areEqual(this.f3360d, combinedClickableElement.f3360d) && Intrinsics.areEqual(this.f3361e, combinedClickableElement.f3361e) && Intrinsics.areEqual(this.f3362f, combinedClickableElement.f3362f) && Intrinsics.areEqual(this.f3363g, combinedClickableElement.f3363g) && Intrinsics.areEqual(this.f3364h, combinedClickableElement.f3364h) && Intrinsics.areEqual(this.f3365i, combinedClickableElement.f3365i);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = ((this.f3358b.hashCode() * 31) + (this.f3359c ? 1231 : 1237)) * 31;
        String str = this.f3360d;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.f3361e;
        int iHashCode3 = (this.f3362f.hashCode() + ((iHashCode2 + (role != null ? Role.m3828hashCodeimpl(role.getF17490a()) : 0)) * 31)) * 31;
        String str2 = this.f3363g;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0<Unit> function0 = this.f3364h;
        int iHashCode5 = (iHashCode4 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0<Unit> function1 = this.f3365i;
        return iHashCode5 + (function1 != null ? function1.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        boolean z10;
        g node2 = (g) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        boolean z11 = this.f3359c;
        String str = this.f3360d;
        Role role = this.f3361e;
        Function0<Unit> onClick = this.f3362f;
        String str2 = this.f3363g;
        Function0<Unit> function0 = this.f3364h;
        node2.getClass();
        MutableInteractionSource interactionSource = this.f3358b;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if ((node2.N0 == null) != (function0 == null)) {
            node2.b();
        }
        node2.N0 = function0;
        node2.d(interactionSource, z11, onClick);
        node2.O0.a(role, str, str2, onClick, function0, z11);
        h hVar = node2.P0;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onClick, "<set-?>");
        hVar.L0 = onClick;
        hVar.K0 = interactionSource;
        if (hVar.J0 != z11) {
            hVar.J0 = z11;
            z10 = true;
        } else {
            z10 = false;
        }
        if ((hVar.P0 == null) != (function0 == null)) {
            z10 = true;
        }
        hVar.P0 = function0;
        boolean z12 = hVar.Q0 == null;
        Function0<Unit> function1 = this.f3365i;
        boolean z13 = z12 == (function1 == null) ? z10 : true;
        hVar.Q0 = function1;
        if (z13) {
            hVar.O0.resetPointerInputHandler();
        }
    }
}

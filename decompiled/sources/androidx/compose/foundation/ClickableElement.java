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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/e;", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class ClickableElement extends ModifierNodeElement<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableInteractionSource f3309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f3311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Role f3312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f3313f;

    public ClickableElement() {
        throw null;
    }

    public ClickableElement(MutableInteractionSource interactionSource, boolean z10, String str, Role role, Function0 onClick) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f3309b = interactionSource;
        this.f3310c = z10;
        this.f3311d = str;
        this.f3312e = role;
        this.f3313f = onClick;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new e(this.f3309b, this.f3310c, this.f3311d, this.f3312e, this.f3313f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(ClickableElement.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.ClickableElement");
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.areEqual(this.f3309b, clickableElement.f3309b) && this.f3310c == clickableElement.f3310c && Intrinsics.areEqual(this.f3311d, clickableElement.f3311d) && Intrinsics.areEqual(this.f3312e, clickableElement.f3312e) && Intrinsics.areEqual(this.f3313f, clickableElement.f3313f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = ((this.f3309b.hashCode() * 31) + (this.f3310c ? 1231 : 1237)) * 31;
        String str = this.f3311d;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.f3312e;
        return this.f3313f.hashCode() + ((iHashCode2 + (role != null ? Role.m3828hashCodeimpl(role.getF17490a()) : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        e node2 = (e) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        boolean z10 = this.f3310c;
        String str = this.f3311d;
        Role role = this.f3312e;
        Function0<Unit> onClick = this.f3313f;
        node2.getClass();
        MutableInteractionSource interactionSource = this.f3309b;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        node2.d(interactionSource, z10, onClick);
        node2.N0.a(role, str, null, onClick, null, z10);
        f fVar = node2.O0;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        fVar.J0 = z10;
        Intrinsics.checkNotNullParameter(onClick, "<set-?>");
        fVar.L0 = onClick;
        fVar.K0 = interactionSource;
    }
}

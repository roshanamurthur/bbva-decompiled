package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x0.h;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lx0/h;", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,81:1\n735#2,2:82\n728#2,2:84\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n57#1:82,2\n59#1:84,2\n*E\n"})
final /* data */ class FocusRequesterElement extends ModifierNodeElement<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FocusRequester f15510b;

    public FocusRequesterElement(@NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.f15510b = focusRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        FocusRequester focusRequester = this.f15510b;
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        h hVar = new h();
        hVar.H0 = focusRequester;
        return hVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.areEqual(this.f15510b, ((FocusRequesterElement) obj).f15510b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f15510b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "focusRequester").set("focusRequester", this.f15510b);
    }

    @NotNull
    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f15510b + RootService.CLOSE_BRACKET;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        h node2 = (h) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.H0.getFocusRequesterNodes$ui_release().remove(node2);
        FocusRequester focusRequester = this.f15510b;
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        node2.H0 = focusRequester;
        focusRequester.getFocusRequesterNodes$ui_release().add(node2);
    }
}

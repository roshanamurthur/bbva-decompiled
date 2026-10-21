package androidx.compose.ui.draw;

import androidx.activity.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/DrawBackgroundModifier;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class DrawBehindElement extends ModifierNodeElement<DrawBackgroundModifier> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<DrawScope, Unit> f15444b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(@NotNull Function1<? super DrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.f15444b = onDraw;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new DrawBackgroundModifier(this.f15444b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && Intrinsics.areEqual(this.f15444b, ((DrawBehindElement) obj).f15444b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f15444b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        a.c(inspectorInfo, "<this>", "drawBehind").set("onDraw", this.f15444b);
    }

    @NotNull
    public final String toString() {
        return ci.a.c(new StringBuilder("DrawBehindElement(onDraw="), this.f15444b, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        DrawBackgroundModifier node2 = (DrawBackgroundModifier) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.setOnDraw(this.f15444b);
    }
}

package androidx.compose.ui.draw;

import androidx.activity.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w0.e;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lw0/e;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class DrawWithContentElement extends ModifierNodeElement<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<ContentDrawScope, Unit> f15447b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(@NotNull Function1<? super ContentDrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.f15447b = onDraw;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Function1<ContentDrawScope, Unit> onDraw = this.f15447b;
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        e eVar = new e();
        eVar.H0 = onDraw;
        return eVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && Intrinsics.areEqual(this.f15447b, ((DrawWithContentElement) obj).f15447b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f15447b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        a.c(inspectorInfo, "<this>", "drawWithContent").set("onDraw", this.f15447b);
    }

    @NotNull
    public final String toString() {
        return ci.a.c(new StringBuilder("DrawWithContentElement(onDraw="), this.f15447b, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        e node2 = (e) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Function1<ContentDrawScope, Unit> function1 = this.f15447b;
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        node2.H0 = function1;
    }
}

package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import i1.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\u0010\u0010\u000eJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R3\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/draw/DrawBackgroundModifier;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "H0", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "setOnDraw", "(Lkotlin/jvm/functions/Function1;)V", "onDraw", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public Function1<? super DrawScope, Unit> onDraw;

    public DrawBackgroundModifier(@NotNull Function1<? super DrawScope, Unit> onDraw) {
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        this.onDraw = onDraw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.onDraw.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }

    @NotNull
    public final Function1<DrawScope, Unit> getOnDraw() {
        return this.onDraw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
        e.a(this);
    }

    public final void setOnDraw(@NotNull Function1<? super DrawScope, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onDraw = function1;
    }
}

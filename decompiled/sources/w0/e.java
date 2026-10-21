package w0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Modifier.Node implements DrawModifierNode {

    @NotNull
    public Function1<? super ContentDrawScope, Unit> H0;

    public e() {
        throw null;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.H0.invoke(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
        i1.e.a(this);
    }
}

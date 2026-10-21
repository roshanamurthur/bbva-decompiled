package t;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Background.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
public final class b extends Modifier.Node implements DrawModifierNode {
    public long H0;

    @Nullable
    public Brush I0;
    public float J0;

    @NotNull
    public Shape K0;

    @Nullable
    public Size L0;

    @Nullable
    public LayoutDirection M0;

    @Nullable
    public Outline N0;

    @Nullable
    public Shape O0;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(@NotNull ContentDrawScope contentDrawScope) {
        Outline outlineMo157createOutlinePq9zytI;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        if (this.K0 == RectangleShapeKt.getRectangleShape()) {
            if (!Color.m2509equalsimpl0(this.H0, Color.INSTANCE.m2544getUnspecified0d7_KjU())) {
                a1.b.K(contentDrawScope, this.H0, 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
            Brush brush = this.I0;
            if (brush != null) {
                a1.b.J(contentDrawScope, brush, 0L, 0L, this.J0, null, null, 0, 118, null);
            }
        } else {
            if (Size.m2339equalsimpl(contentDrawScope.mo2909getSizeNHjbRc(), this.L0) && contentDrawScope.getLayoutDirection() == this.M0 && Intrinsics.areEqual(this.O0, this.K0)) {
                outlineMo157createOutlinePq9zytI = this.N0;
                Intrinsics.checkNotNull(outlineMo157createOutlinePq9zytI);
            } else {
                outlineMo157createOutlinePq9zytI = this.K0.mo157createOutlinePq9zytI(contentDrawScope.mo2909getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
            }
            Outline outline = outlineMo157createOutlinePq9zytI;
            if (!Color.m2509equalsimpl0(this.H0, Color.INSTANCE.m2544getUnspecified0d7_KjU())) {
                OutlineKt.m2726drawOutlinewDX37Ww(contentDrawScope, outline, this.H0, (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? Fill.INSTANCE : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? DrawScope.INSTANCE.m2939getDefaultBlendMode0nO6VwU() : 0);
            }
            Brush brush2 = this.I0;
            if (brush2 != null) {
                OutlineKt.m2725drawOutlinehn5TExg$default(contentDrawScope, outline, brush2, this.J0, null, null, 0, 56, null);
            }
            this.N0 = outline;
            this.L0 = Size.m2332boximpl(contentDrawScope.mo2909getSizeNHjbRc());
            this.M0 = contentDrawScope.getLayoutDirection();
            this.O0 = this.K0;
        }
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final /* synthetic */ void onMeasureResultChanged() {
        i1.e.a(this);
    }
}

package t;

import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function1<CacheDrawScope, DrawResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BorderModifierNode f93400p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BorderModifierNode borderModifierNode) {
        super(1);
        this.f93400p0 = borderModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        CacheDrawScope CacheDrawModifierNode = cacheDrawScope;
        Intrinsics.checkNotNullParameter(CacheDrawModifierNode, "$this$CacheDrawModifierNode");
        BorderModifierNode borderModifierNode = this.f93400p0;
        float width = borderModifierNode.getWidth();
        CacheDrawModifierNode.getClass();
        if (x1.a.h(CacheDrawModifierNode, width) < 0.0f || Size.m2343getMinDimensionimpl(CacheDrawModifierNode.m2200getSizeNHjbRc()) <= 0.0f) {
            return CacheDrawModifierNode.onDrawWithContent(d.f93367p0);
        }
        float f6 = 2;
        float fMin = Math.min(Dp.m4394equalsimpl0(borderModifierNode.getWidth(), Dp.INSTANCE.m4407getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(x1.a.h(CacheDrawModifierNode, borderModifierNode.getWidth())), (float) Math.ceil(Size.m2343getMinDimensionimpl(CacheDrawModifierNode.m2200getSizeNHjbRc()) / f6));
        float f10 = fMin / f6;
        long jOffset = OffsetKt.Offset(f10, f10);
        long jSize = SizeKt.Size(Size.m2344getWidthimpl(CacheDrawModifierNode.m2200getSizeNHjbRc()) - fMin, Size.m2341getHeightimpl(CacheDrawModifierNode.m2200getSizeNHjbRc()) - fMin);
        boolean z10 = f6 * fMin > Size.m2343getMinDimensionimpl(CacheDrawModifierNode.m2200getSizeNHjbRc());
        Outline outlineMo157createOutlinePq9zytI = borderModifierNode.getShape().mo157createOutlinePq9zytI(CacheDrawModifierNode.m2200getSizeNHjbRc(), CacheDrawModifierNode.getLayoutDirection(), CacheDrawModifierNode);
        if (outlineMo157createOutlinePq9zytI instanceof Outline.Generic) {
            return BorderModifierNode.access$drawGenericBorder(borderModifierNode, CacheDrawModifierNode, borderModifierNode.getBrush(), (Outline.Generic) outlineMo157createOutlinePq9zytI, z10, fMin);
        }
        if (outlineMo157createOutlinePq9zytI instanceof Outline.Rounded) {
            return BorderModifierNode.m132access$drawRoundRectBorderJqoCqck(borderModifierNode, CacheDrawModifierNode, borderModifierNode.getBrush(), (Outline.Rounded) outlineMo157createOutlinePq9zytI, jOffset, jSize, z10, fMin);
        }
        if (outlineMo157createOutlinePq9zytI instanceof Outline.Rectangle) {
            return CacheDrawModifierNode.onDrawWithContent(new e(borderModifierNode.getBrush(), z10 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : jOffset, z10 ? CacheDrawModifierNode.m2200getSizeNHjbRc() : jSize, z10 ? Fill.INSTANCE : new Stroke(fMin, 0.0f, 0, 0, null, 30, null)));
        }
        throw new NoWhenBranchMatchedException();
    }
}

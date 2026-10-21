package h0;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.FabPlacement;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n1#1,547:1\n1#2:548\n426#3:549\n400#3:550\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n*L\n350#1:549\n350#1:550\n*E\n"})
public final class k implements Shape {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Shape f68858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FabPlacement f68859b;

    public k(@NotNull Shape cutoutShape, @NotNull FabPlacement fabPlacement) {
        Intrinsics.checkNotNullParameter(cutoutShape, "cutoutShape");
        Intrinsics.checkNotNullParameter(fabPlacement, "fabPlacement");
        this.f68858a = cutoutShape;
        this.f68859b = fabPlacement;
    }

    @Override // androidx.compose.ui.graphics.Shape
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo157createOutlinePq9zytI(long j10, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect(new Rect(0.0f, 0.0f, Size.m2344getWidthimpl(j10), Size.m2341getHeightimpl(j10)));
        Path Path2 = AndroidPath_androidKt.Path();
        float fMo415toPx0680j_4 = density.mo415toPx0680j_4(AppBarKt.f6677e);
        FabPlacement fabPlacement = this.f68859b;
        float f6 = 2 * fMo415toPx0680j_4;
        long jSize = SizeKt.Size(fabPlacement.getWidth() + f6, fabPlacement.getHeight() + f6);
        float left = fabPlacement.getLeft() - fMo415toPx0680j_4;
        float fM2344getWidthimpl = Size.m2344getWidthimpl(jSize) + left;
        float fM2341getHeightimpl = Size.m2341getHeightimpl(jSize) / 2.0f;
        Shape shape = this.f68858a;
        OutlineKt.addOutline(Path2, shape.mo157createOutlinePq9zytI(jSize, layoutDirection, density));
        Path2.mo2412translatek4lQ0M(OffsetKt.Offset(left, -fM2341getHeightimpl));
        if (Intrinsics.areEqual(shape, RoundedCornerShapeKt.getCircleShape())) {
            float fMo415toPx0680j_5 = density.mo415toPx0680j_4(AppBarKt.f6678f);
            float f10 = -((float) Math.sqrt((fM2341getHeightimpl * fM2341getHeightimpl) - 0.0f));
            float f11 = fM2341getHeightimpl + f10;
            float f12 = left + f11;
            float f13 = fM2344getWidthimpl - f11;
            Pair<Float, Float> pairCalculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f10 - 1.0f, 0.0f, fM2341getHeightimpl);
            float fFloatValue = pairCalculateRoundedEdgeIntercept.component1().floatValue() + fM2341getHeightimpl;
            float fFloatValue2 = pairCalculateRoundedEdgeIntercept.component2().floatValue() - 0.0f;
            Path2.moveTo(f12 - fMo415toPx0680j_5, 0.0f);
            Path2.quadraticBezierTo(f12 - 1.0f, 0.0f, left + fFloatValue, fFloatValue2);
            Path2.lineTo(fM2344getWidthimpl - fFloatValue, fFloatValue2);
            Path2.quadraticBezierTo(f13 + 1.0f, 0.0f, fMo415toPx0680j_5 + f13, 0.0f);
            Path2.close();
        }
        Path2.mo2409opN5in7k0(Path, Path2, PathOperation.INSTANCE.m2757getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f68858a, kVar.f68858a) && Intrinsics.areEqual(this.f68859b, kVar.f68859b);
    }

    public final int hashCode() {
        return this.f68859b.hashCode() + (this.f68858a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.f68858a + ", fabPlacement=" + this.f68859b + RootService.CLOSE_BRACKET;
    }
}

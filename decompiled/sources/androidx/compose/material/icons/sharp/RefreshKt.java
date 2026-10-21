package androidx.compose.material.icons.sharp;

import ad.d;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Refresh.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Sharp;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getRefresh", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Refresh", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/sharp/RefreshKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,52:1\n122#2:53\n116#2,3:54\n119#2,3:58\n132#2,18:61\n152#2:98\n174#3:57\n694#4,2:79\n706#4,2:81\n708#4,11:87\n64#5,4:83\n*S KotlinDebug\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/sharp/RefreshKt\n*L\n29#1:53\n29#1:54,3\n29#1:58,3\n30#1:61,18\n30#1:98\n29#1:57\n30#1:79,2\n30#1:81,2\n30#1:87,11\n30#1:83,4\n*E\n"})
public final class RefreshKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8699a;

    @NotNull
    public static final ImageVector getRefresh(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f8699a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Refresh", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(17.65f, 6.35f);
        pathBuilderC.curveTo(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        pathBuilderC.curveToRelative(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        pathBuilderC.reflectiveCurveToRelative(3.57f, 8.0f, 7.99f, 8.0f);
        pathBuilderC.curveToRelative(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        pathBuilderC.horizontalLineToRelative(-2.08f);
        pathBuilderC.curveToRelative(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        pathBuilderC.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilderC.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilderC.curveToRelative(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        pathBuilderC.lineTo(13.0f, 11.0f);
        pathBuilderC.horizontalLineToRelative(7.0f);
        pathBuilderC.verticalLineTo(4.0f);
        pathBuilderC.lineToRelative(-2.35f, 2.35f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8699a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

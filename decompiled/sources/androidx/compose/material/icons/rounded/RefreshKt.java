package androidx.compose.material.icons.rounded;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getRefresh", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Refresh", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/rounded/RefreshKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n122#2:57\n116#2,3:58\n119#2,3:62\n132#2,18:65\n152#2:102\n174#3:61\n694#4,2:83\n706#4,2:85\n708#4,11:91\n64#5,4:87\n*S KotlinDebug\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/rounded/RefreshKt\n*L\n29#1:57\n29#1:58,3\n29#1:62,3\n30#1:65,18\n30#1:102\n29#1:61\n30#1:83,2\n30#1:85,2\n30#1:91,11\n30#1:87,4\n*E\n"})
public final class RefreshKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8650a;

    @NotNull
    public static final ImageVector getRefresh(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8650a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Refresh", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(17.65f, 6.35f);
        pathBuilderC.curveToRelative(-1.63f, -1.63f, -3.94f, -2.57f, -6.48f, -2.31f);
        pathBuilderC.curveToRelative(-3.67f, 0.37f, -6.69f, 3.35f, -7.1f, 7.02f);
        pathBuilderC.curveTo(3.52f, 15.91f, 7.27f, 20.0f, 12.0f, 20.0f);
        pathBuilderC.curveToRelative(3.19f, 0.0f, 5.93f, -1.87f, 7.21f, -4.56f);
        pathBuilderC.curveToRelative(0.32f, -0.67f, -0.16f, -1.44f, -0.9f, -1.44f);
        pathBuilderC.curveToRelative(-0.37f, 0.0f, -0.72f, 0.2f, -0.88f, 0.53f);
        pathBuilderC.curveToRelative(-1.13f, 2.43f, -3.84f, 3.97f, -6.8f, 3.31f);
        pathBuilderC.curveToRelative(-2.22f, -0.49f, -4.01f, -2.3f, -4.48f, -4.52f);
        pathBuilderC.curveTo(5.31f, 9.44f, 8.26f, 6.0f, 12.0f, 6.0f);
        pathBuilderC.curveToRelative(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        pathBuilderC.lineToRelative(-1.51f, 1.51f);
        pathBuilderC.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        pathBuilderC.horizontalLineTo(19.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.verticalLineTo(6.41f);
        pathBuilderC.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilderC.lineToRelative(-0.64f, 0.65f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8650a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

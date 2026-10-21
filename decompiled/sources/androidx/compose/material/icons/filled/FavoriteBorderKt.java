package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: FavoriteBorder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getFavoriteBorder", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "FavoriteBorder", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFavoriteBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/filled/FavoriteBorderKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,58:1\n122#2:59\n116#2,3:60\n119#2,3:64\n132#2,18:67\n152#2:104\n174#3:63\n694#4,2:85\n706#4,2:87\n708#4,11:93\n64#5,4:89\n*S KotlinDebug\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/filled/FavoriteBorderKt\n*L\n29#1:59\n29#1:60,3\n29#1:64,3\n30#1:67,18\n30#1:104\n29#1:63\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"})
public final class FavoriteBorderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8533a;

    @NotNull
    public static final ImageVector getFavoriteBorder(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f8533a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FavoriteBorder", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(16.5f, 3.0f);
        pathBuilderC.curveToRelative(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        pathBuilderC.curveTo(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        pathBuilderC.curveTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        pathBuilderC.curveToRelative(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        pathBuilderC.lineTo(12.0f, 21.35f);
        pathBuilderC.lineToRelative(1.45f, -1.32f);
        pathBuilderC.curveTo(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        pathBuilderC.curveTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.1f, 18.55f);
        pathBuilderC.lineToRelative(-0.1f, 0.1f);
        pathBuilderC.lineToRelative(-0.1f, -0.1f);
        pathBuilderC.curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        pathBuilderC.curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        pathBuilderC.curveToRelative(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        pathBuilderC.horizontalLineToRelative(1.87f);
        pathBuilderC.curveTo(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        pathBuilderC.curveToRelative(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        pathBuilderC.curveToRelative(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8533a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

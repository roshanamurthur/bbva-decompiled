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

/* JADX INFO: compiled from: Build.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Sharp;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getBuild", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Build", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/sharp/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,49:1\n122#2:50\n116#2,3:51\n119#2,3:55\n132#2,18:58\n152#2:95\n174#3:54\n694#4,2:76\n706#4,2:78\n708#4,11:84\n64#5,4:80\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/sharp/BuildKt\n*L\n29#1:50\n29#1:51,3\n29#1:55,3\n30#1:58,18\n30#1:95\n29#1:54\n30#1:76,2\n30#1:78,2\n30#1:84,11\n30#1:80,4\n*E\n"})
public final class BuildKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8666a;

    @NotNull
    public static final ImageVector getBuild(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f8666a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Build", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(12.09f, 2.91f);
        pathBuilderC.curveTo(10.08f, 0.9f, 7.07f, 0.49f, 4.65f, 1.67f);
        pathBuilderC.lineToRelative(4.34f, 4.34f);
        pathBuilderC.lineToRelative(-3.0f, 3.0f);
        pathBuilderC.lineToRelative(-4.34f, -4.34f);
        pathBuilderC.curveTo(0.48f, 7.1f, 0.89f, 10.09f, 2.9f, 12.1f);
        pathBuilderC.curveToRelative(1.86f, 1.86f, 4.58f, 2.35f, 6.89f, 1.48f);
        pathBuilderC.lineToRelative(9.82f, 9.82f);
        pathBuilderC.lineToRelative(3.71f, -3.71f);
        pathBuilderC.lineToRelative(-9.78f, -9.79f);
        pathBuilderC.curveToRelative(0.92f, -2.34f, 0.44f, -5.1f, -1.45f, -6.99f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8666a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

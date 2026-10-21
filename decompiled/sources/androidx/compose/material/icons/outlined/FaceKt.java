package androidx.compose.material.icons.outlined;

import ad.d;
import androidx.appcompat.widget.o1;
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

/* JADX INFO: compiled from: Face.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getFace", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Face", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/outlined/FaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n122#2:75\n116#2,3:76\n119#2,3:80\n132#2,18:83\n152#2:120\n174#3:79\n694#4,2:101\n706#4,2:103\n708#4,11:109\n64#5,4:105\n*S KotlinDebug\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/outlined/FaceKt\n*L\n29#1:75\n29#1:76,3\n29#1:80,3\n30#1:83,18\n30#1:120\n29#1:79\n30#1:101,2\n30#1:103,2\n30#1:109,11\n30#1:105,4\n*E\n"})
public final class FaceKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8581a;

    @NotNull
    public static final ImageVector getFace(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8581a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Face", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(10.25f, 13.0f);
        pathBuilderC.curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
        pathBuilderC.reflectiveCurveTo(7.75f, 13.69f, 7.75f, 13.0f);
        pathBuilderC.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilderC.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilderC.close();
        pathBuilderC.moveTo(15.0f, 11.75f);
        pathBuilderC.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilderC.reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f);
        pathBuilderC.reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderC.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilderC.close();
        pathBuilderC.moveTo(22.0f, 12.0f);
        pathBuilderC.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        pathBuilderC.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilderC.reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f);
        pathBuilderC.reflectiveCurveToRelative(10.0f, 4.48f, 10.0f, 10.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(10.66f, 4.12f);
        pathBuilderC.curveTo(12.06f, 6.44f, 14.6f, 8.0f, 17.5f, 8.0f);
        pathBuilderC.curveToRelative(0.46f, 0.0f, 0.91f, -0.05f, 1.34f, -0.12f);
        pathBuilderC.curveTo(17.44f, 5.56f, 14.9f, 4.0f, 12.0f, 4.0f);
        pathBuilderC.curveToRelative(-0.46f, 0.0f, -0.91f, 0.05f, -1.34f, 0.12f);
        pathBuilderC.close();
        pathBuilderC.moveTo(4.42f, 9.47f);
        pathBuilderC.curveToRelative(1.71f, -0.97f, 3.03f, -2.55f, 3.66f, -4.44f);
        pathBuilderC.curveTo(6.37f, 6.0f, 5.05f, 7.58f, 4.42f, 9.47f);
        pathBuilderC.close();
        pathBuilderC.moveTo(20.0f, 12.0f);
        pathBuilderC.curveToRelative(0.0f, -0.78f, -0.12f, -1.53f, -0.33f, -2.24f);
        pathBuilderC.curveToRelative(-0.7f, 0.15f, -1.42f, 0.24f, -2.17f, 0.24f);
        pathBuilderC.curveToRelative(-3.13f, 0.0f, -5.92f, -1.44f, -7.76f, -3.69f);
        pathBuilderC.curveTo(8.69f, 8.87f, 6.6f, 10.88f, 4.0f, 11.86f);
        pathBuilderC.curveToRelative(0.01f, 0.04f, 0.0f, 0.09f, 0.0f, 0.14f);
        pathBuilderC.curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, o1.d(pathBuilderC, 8.0f, -3.59f, 8.0f, -8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8581a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

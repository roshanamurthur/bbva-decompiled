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

/* JADX INFO: compiled from: Face.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Sharp;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getFace", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Face", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/sharp/FaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,64:1\n122#2:65\n116#2,3:66\n119#2,3:70\n132#2,18:73\n152#2:110\n174#3:69\n694#4,2:91\n706#4,2:93\n708#4,11:99\n64#5,4:95\n*S KotlinDebug\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/sharp/FaceKt\n*L\n29#1:65\n29#1:66,3\n29#1:70,3\n30#1:73,18\n30#1:110\n29#1:69\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
public final class FaceKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8679a;

    @NotNull
    public static final ImageVector getFace(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f8679a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Face", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(9.0f, 11.75f);
        pathBuilderC.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilderC.reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f);
        pathBuilderC.reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderC.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilderC.close();
        pathBuilderC.moveTo(15.0f, 11.75f);
        pathBuilderC.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilderC.reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f);
        pathBuilderC.reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderC.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.0f, 2.0f);
        pathBuilderC.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderC.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderC.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderC.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.0f, 20.0f);
        pathBuilderC.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderC.curveToRelative(0.0f, -0.29f, 0.02f, -0.58f, 0.05f, -0.86f);
        pathBuilderC.curveToRelative(2.36f, -1.05f, 4.23f, -2.98f, 5.21f, -5.37f);
        pathBuilderC.curveTo(11.07f, 8.33f, 14.05f, 10.0f, 17.42f, 10.0f);
        pathBuilderC.curveToRelative(0.78f, 0.0f, 1.53f, -0.09f, 2.25f, -0.26f);
        pathBuilderC.curveToRelative(0.21f, 0.71f, 0.33f, 1.47f, 0.33f, 2.26f);
        pathBuilderC.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8679a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

package androidx.compose.material.icons.twotone;

import ad.d;
import androidx.appcompat.widget.a;
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

/* JADX INFO: compiled from: CheckCircle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getCheckCircle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "CheckCircle", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckCircle.kt\nandroidx/compose/material/icons/twotone/CheckCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n122#2:73\n116#2,3:74\n119#2,3:78\n132#2,18:81\n152#2:118\n132#2,18:119\n152#2:156\n174#3:77\n694#4,2:99\n706#4,2:101\n708#4,11:107\n694#4,2:137\n706#4,2:139\n708#4,11:145\n64#5,4:103\n64#5,4:141\n*S KotlinDebug\n*F\n+ 1 CheckCircle.kt\nandroidx/compose/material/icons/twotone/CheckCircleKt\n*L\n29#1:73\n29#1:74,3\n29#1:78,3\n30#1:81,18\n30#1:118\n46#1:119,18\n46#1:156\n29#1:77\n30#1:99,2\n30#1:101,2\n30#1:107,11\n46#1:137,2\n46#1:139,2\n46#1:145,11\n30#1:103,4\n46#1:141,4\n*E\n"})
public final class CheckCircleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8717a;

    @NotNull
    public static final ImageVector getCheckCircle(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f8717a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CheckCircle", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(12.0f, 4.0f);
        pathBuilderC.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        pathBuilderC.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        pathBuilderC.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        pathBuilderC.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(10.0f, 17.0f);
        pathBuilderC.lineToRelative(-4.0f, -4.0f);
        pathBuilderC.lineToRelative(1.41f, -1.41f);
        pathBuilderC.lineTo(10.0f, 14.17f);
        pathBuilderC.lineToRelative(6.59f, -6.59f);
        pathBuilderC.lineTo(18.0f, 9.0f);
        pathBuilderC.lineToRelative(-8.0f, 8.0f);
        pathBuilderC.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC2 = d.c(12.0f, 2.0f);
        pathBuilderC2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderC2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderC2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderC2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(12.0f, 20.0f);
        pathBuilderC2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderC2.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilderC2.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderC2.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(16.59f, 7.58f);
        pathBuilderC2.lineTo(10.0f, 14.17f);
        pathBuilderC2.lineToRelative(-2.59f, -2.58f);
        pathBuilderC2.lineTo(6.0f, 13.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, a.d(pathBuilderC2, 4.0f, 4.0f, 8.0f, -8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8717a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: AccountCircle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getAccountCircle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountCircle", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAccountCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/twotone/AccountCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n122#2:88\n116#2,3:89\n119#2,3:93\n132#2,18:96\n152#2:133\n132#2,18:134\n152#2:171\n132#2,18:172\n152#2:209\n174#3:92\n694#4,2:114\n706#4,2:116\n708#4,11:122\n694#4,2:152\n706#4,2:154\n708#4,11:160\n694#4,2:190\n706#4,2:192\n708#4,11:198\n64#5,4:118\n64#5,4:156\n64#5,4:194\n*S KotlinDebug\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/twotone/AccountCircleKt\n*L\n29#1:88\n29#1:89,3\n29#1:93,3\n30#1:96,18\n30#1:133\n46#1:134,18\n46#1:171\n68#1:172,18\n68#1:209\n29#1:92\n30#1:114,2\n30#1:116,2\n30#1:122,11\n46#1:152,2\n46#1:154,2\n46#1:160,11\n68#1:190,2\n68#1:192,2\n68#1:198,11\n30#1:118,4\n46#1:156,4\n68#1:194,4\n*E\n"})
public final class AccountCircleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8709a;

    @NotNull
    public static final ImageVector getAccountCircle(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f8709a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AccountCircle", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(12.0f, 4.0f);
        pathBuilderC.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilderC.curveToRelative(0.0f, 1.95f, 0.7f, 3.73f, 1.86f, 5.12f);
        pathBuilderC.curveTo(7.55f, 15.8f, 9.68f, 15.0f, 12.0f, 15.0f);
        pathBuilderC.reflectiveCurveToRelative(4.45f, 0.8f, 6.14f, 2.12f);
        pathBuilderC.curveTo(19.3f, 15.73f, 20.0f, 13.95f, 20.0f, 12.0f);
        pathBuilderC.curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.0f, 13.0f);
        pathBuilderC.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilderC.curveTo(8.5f, 7.57f, 10.07f, 6.0f, 12.0f, 6.0f);
        pathBuilderC.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilderC.curveTo(15.5f, 11.43f, 13.93f, 13.0f, 12.0f, 13.0f);
        pathBuilderC.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC2 = d.c(12.0f, 2.0f);
        pathBuilderC2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderC2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderC2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderC2.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(12.0f, 20.0f);
        pathBuilderC2.curveToRelative(-1.74f, 0.0f, -3.34f, -0.56f, -4.65f, -1.5f);
        pathBuilderC2.curveTo(8.66f, 17.56f, 10.26f, 17.0f, 12.0f, 17.0f);
        pathBuilderC2.reflectiveCurveToRelative(3.34f, 0.56f, 4.65f, 1.5f);
        pathBuilderC2.curveTo(15.34f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(18.14f, 17.12f);
        pathBuilderC2.curveTo(16.45f, 15.8f, 14.32f, 15.0f, 12.0f, 15.0f);
        pathBuilderC2.reflectiveCurveToRelative(-4.45f, 0.8f, -6.14f, 2.12f);
        pathBuilderC2.curveTo(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f);
        pathBuilderC2.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilderC2.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilderC2.curveTo(20.0f, 13.95f, 19.3f, 15.73f, 18.14f, 17.12f);
        pathBuilderC2.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw3 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk10 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC3 = d.c(12.0f, 5.93f);
        pathBuilderC3.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilderC3.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilderC3.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderC3.curveTo(15.5f, 7.5f, 13.93f, 5.93f, 12.0f, 5.93f);
        pathBuilderC3.close();
        pathBuilderC3.moveTo(12.0f, 10.93f);
        pathBuilderC3.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderC3.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderC3.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderC3.reflectiveCurveTo(12.83f, 10.93f, 12.0f, 10.93f);
        pathBuilderC3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw3, iM2818getBevelLxFBmk10, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8709a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

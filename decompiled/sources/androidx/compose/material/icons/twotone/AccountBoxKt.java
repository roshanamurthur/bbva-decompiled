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

/* JADX INFO: compiled from: AccountBox.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getAccountBox", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountBox", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAccountBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBox.kt\nandroidx/compose/material/icons/twotone/AccountBoxKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n122#2:91\n116#2,3:92\n119#2,3:96\n132#2,18:99\n152#2:136\n132#2,18:137\n152#2:174\n132#2,18:175\n152#2:212\n174#3:95\n694#4,2:117\n706#4,2:119\n708#4,11:125\n694#4,2:155\n706#4,2:157\n708#4,11:163\n694#4,2:193\n706#4,2:195\n708#4,11:201\n64#5,4:121\n64#5,4:159\n64#5,4:197\n*S KotlinDebug\n*F\n+ 1 AccountBox.kt\nandroidx/compose/material/icons/twotone/AccountBoxKt\n*L\n29#1:91\n29#1:92,3\n29#1:96,3\n30#1:99,18\n30#1:136\n45#1:137,18\n45#1:174\n71#1:175,18\n71#1:212\n29#1:95\n30#1:117,2\n30#1:119,2\n30#1:125,11\n45#1:155,2\n45#1:157,2\n45#1:163,11\n71#1:193,2\n71#1:195,2\n71#1:201,11\n30#1:121,4\n45#1:159,4\n71#1:197,4\n*E\n"})
public final class AccountBoxKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8708a;

    @NotNull
    public static final ImageVector getAccountBox(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f8708a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AccountBox", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(5.0f, 17.86f);
        pathBuilderC.curveTo(6.8f, 16.09f, 9.27f, 15.0f, 12.0f, 15.0f);
        pathBuilderC.reflectiveCurveToRelative(5.2f, 1.09f, 7.0f, 2.86f);
        pathBuilderC.verticalLineTo(5.0f);
        pathBuilderC.horizontalLineTo(5.0f);
        pathBuilderC.verticalLineTo(17.86f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.0f, 6.0f);
        pathBuilderC.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilderC.reflectiveCurveTo(13.93f, 13.0f, 12.0f, 13.0f);
        pathBuilderC.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilderC.reflectiveCurveTo(10.07f, 6.0f, 12.0f, 6.0f);
        pathBuilderC.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 19.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-0.24f);
        pathBuilder.curveTo(8.42f, 17.62f, 10.16f, 17.0f, 12.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 0.62f, 5.0f, 1.76f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.86f);
        pathBuilder.curveTo(17.2f, 16.09f, 14.73f, 15.0f, 12.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(-5.2f, 1.09f, -7.0f, 2.86f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(17.86f);
        pathBuilder.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw3 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk10 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC2 = d.c(12.0f, 13.0f);
        pathBuilderC2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderC2.reflectiveCurveTo(13.93f, 6.0f, 12.0f, 6.0f);
        pathBuilderC2.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilderC2.reflectiveCurveTo(10.07f, 13.0f, 12.0f, 13.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(12.0f, 8.0f);
        pathBuilderC2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderC2.reflectiveCurveTo(12.83f, 11.0f, 12.0f, 11.0f);
        pathBuilderC2.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderC2.reflectiveCurveTo(11.17f, 8.0f, 12.0f, 8.0f);
        pathBuilderC2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw3, iM2818getBevelLxFBmk10, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8708a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

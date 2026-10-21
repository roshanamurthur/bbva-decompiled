package androidx.compose.material.icons.outlined;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getAccountCircle", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountCircle", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAccountCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/outlined/AccountCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n122#2:74\n116#2,3:75\n119#2,3:79\n132#2,18:82\n152#2:119\n132#2,18:120\n152#2:157\n174#3:78\n694#4,2:100\n706#4,2:102\n708#4,11:108\n694#4,2:138\n706#4,2:140\n708#4,11:146\n64#5,4:104\n64#5,4:142\n*S KotlinDebug\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/outlined/AccountCircleKt\n*L\n29#1:74\n29#1:75,3\n29#1:79,3\n30#1:82,18\n30#1:119\n54#1:120,18\n54#1:157\n29#1:78\n30#1:100,2\n30#1:102,2\n30#1:108,11\n54#1:138,2\n54#1:140,2\n54#1:146,11\n30#1:104,4\n54#1:142,4\n*E\n"})
public final class AccountCircleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8562a;

    @NotNull
    public static final ImageVector getAccountCircle(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8562a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AccountCircle", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(12.0f, 2.0f);
        pathBuilderC.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderC.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderC.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderC.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(7.35f, 18.5f);
        pathBuilderC.curveTo(8.66f, 17.56f, 10.26f, 17.0f, 12.0f, 17.0f);
        pathBuilderC.reflectiveCurveToRelative(3.34f, 0.56f, 4.65f, 1.5f);
        pathBuilderC.curveTo(15.34f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f);
        pathBuilderC.reflectiveCurveTo(8.66f, 19.44f, 7.35f, 18.5f);
        pathBuilderC.close();
        pathBuilderC.moveTo(18.14f, 17.12f);
        pathBuilderC.lineTo(18.14f, 17.12f);
        pathBuilderC.curveTo(16.45f, 15.8f, 14.32f, 15.0f, 12.0f, 15.0f);
        pathBuilderC.reflectiveCurveToRelative(-4.45f, 0.8f, -6.14f, 2.12f);
        pathBuilderC.lineToRelative(0.0f, 0.0f);
        pathBuilderC.curveTo(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f);
        pathBuilderC.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilderC.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilderC.curveTo(20.0f, 13.95f, 19.3f, 15.73f, 18.14f, 17.12f);
        pathBuilderC.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC2 = d.c(12.0f, 6.0f);
        pathBuilderC2.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilderC2.reflectiveCurveTo(10.07f, 13.0f, 12.0f, 13.0f);
        pathBuilderC2.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderC2.reflectiveCurveTo(13.93f, 6.0f, 12.0f, 6.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(12.0f, 11.0f);
        pathBuilderC2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderC2.reflectiveCurveTo(11.17f, 8.0f, 12.0f, 8.0f);
        pathBuilderC2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderC2.reflectiveCurveTo(12.83f, 11.0f, 12.0f, 11.0f);
        pathBuilderC2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8562a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

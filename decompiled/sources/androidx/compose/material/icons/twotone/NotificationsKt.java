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

/* JADX INFO: compiled from: Notifications.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getNotifications", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Notifications", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notifications.kt\nandroidx/compose/material/icons/twotone/NotificationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n122#2:74\n116#2,3:75\n119#2,3:79\n132#2,18:82\n152#2:119\n132#2,18:120\n152#2:157\n174#3:78\n694#4,2:100\n706#4,2:102\n708#4,11:108\n694#4,2:138\n706#4,2:140\n708#4,11:146\n64#5,4:104\n64#5,4:142\n*S KotlinDebug\n*F\n+ 1 Notifications.kt\nandroidx/compose/material/icons/twotone/NotificationsKt\n*L\n29#1:74\n29#1:75,3\n29#1:79,3\n30#1:82,18\n30#1:119\n39#1:120,18\n39#1:157\n29#1:78\n30#1:100,2\n30#1:102,2\n30#1:108,11\n39#1:138,2\n39#1:140,2\n39#1:146,11\n30#1:104,4\n39#1:142,4\n*E\n"})
public final class NotificationsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8743a;

    @NotNull
    public static final ImageVector getNotifications(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f8743a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Notifications", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(12.0f, 6.5f);
        pathBuilderC.curveToRelative(-2.49f, 0.0f, -4.0f, 2.02f, -4.0f, 4.5f);
        pathBuilderC.verticalLineToRelative(6.0f);
        pathBuilderC.horizontalLineToRelative(8.0f);
        pathBuilderC.verticalLineToRelative(-6.0f);
        pathBuilderC.curveToRelative(0.0f, -2.48f, -1.51f, -4.5f, -4.0f, -4.5f);
        pathBuilderC.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC2 = d.c(12.0f, 22.0f);
        pathBuilderC2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC2.horizontalLineToRelative(-4.0f);
        pathBuilderC2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(18.0f, 16.0f);
        pathBuilderC2.verticalLineToRelative(-5.0f);
        pathBuilderC2.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        pathBuilderC2.lineTo(13.5f, 4.0f);
        pathBuilderC2.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderC2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderC2.verticalLineToRelative(0.68f);
        pathBuilderC2.curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilderC2.verticalLineToRelative(5.0f);
        pathBuilderC2.lineToRelative(-2.0f, 2.0f);
        pathBuilderC2.verticalLineToRelative(1.0f);
        pathBuilderC2.horizontalLineToRelative(16.0f);
        pathBuilderC2.verticalLineToRelative(-1.0f);
        pathBuilderC2.lineToRelative(-2.0f, -2.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(16.0f, 17.0f);
        pathBuilderC2.lineTo(8.0f, 17.0f);
        pathBuilderC2.verticalLineToRelative(-6.0f);
        pathBuilderC2.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        pathBuilderC2.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        pathBuilderC2.verticalLineToRelative(6.0f);
        pathBuilderC2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8743a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

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

/* JADX INFO: compiled from: Notifications.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getNotifications", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Notifications", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notifications.kt\nandroidx/compose/material/icons/outlined/NotificationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,64:1\n122#2:65\n116#2,3:66\n119#2,3:70\n132#2,18:73\n152#2:110\n174#3:69\n694#4,2:91\n706#4,2:93\n708#4,11:99\n64#5,4:95\n*S KotlinDebug\n*F\n+ 1 Notifications.kt\nandroidx/compose/material/icons/outlined/NotificationsKt\n*L\n29#1:65\n29#1:66,3\n29#1:70,3\n30#1:73,18\n30#1:110\n29#1:69\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
public final class NotificationsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8596a;

    @NotNull
    public static final ImageVector getNotifications(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8596a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Notifications", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(12.0f, 22.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.horizontalLineToRelative(-4.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(18.0f, 16.0f);
        pathBuilderC.verticalLineToRelative(-5.0f);
        pathBuilderC.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        pathBuilderC.lineTo(13.5f, 4.0f);
        pathBuilderC.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderC.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderC.verticalLineToRelative(0.68f);
        pathBuilderC.curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilderC.verticalLineToRelative(5.0f);
        pathBuilderC.lineToRelative(-2.0f, 2.0f);
        pathBuilderC.verticalLineToRelative(1.0f);
        pathBuilderC.horizontalLineToRelative(16.0f);
        pathBuilderC.verticalLineToRelative(-1.0f);
        pathBuilderC.lineToRelative(-2.0f, -2.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(16.0f, 17.0f);
        pathBuilderC.lineTo(8.0f, 17.0f);
        pathBuilderC.verticalLineToRelative(-6.0f);
        pathBuilderC.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        pathBuilderC.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        pathBuilderC.verticalLineToRelative(6.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8596a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

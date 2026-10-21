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

/* JADX INFO: compiled from: Notifications.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Sharp;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getNotifications", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Notifications", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notifications.kt\nandroidx/compose/material/icons/sharp/NotificationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n122#2:57\n116#2,3:58\n119#2,3:62\n132#2,18:65\n152#2:102\n174#3:61\n694#4,2:83\n706#4,2:85\n708#4,11:91\n64#5,4:87\n*S KotlinDebug\n*F\n+ 1 Notifications.kt\nandroidx/compose/material/icons/sharp/NotificationsKt\n*L\n29#1:57\n29#1:58,3\n29#1:62,3\n30#1:65,18\n30#1:102\n29#1:61\n30#1:83,2\n30#1:85,2\n30#1:91,11\n30#1:87,4\n*E\n"})
public final class NotificationsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8694a;

    @NotNull
    public static final ImageVector getNotifications(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f8694a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Notifications", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(12.0f, 22.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.horizontalLineToRelative(-4.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(18.0f, 16.0f);
        pathBuilderC.verticalLineToRelative(-5.0f);
        pathBuilderC.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        pathBuilderC.lineTo(13.5f, 2.5f);
        pathBuilderC.horizontalLineToRelative(-3.0f);
        pathBuilderC.verticalLineToRelative(2.18f);
        pathBuilderC.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilderC.verticalLineToRelative(5.0f);
        pathBuilderC.lineToRelative(-2.0f, 2.0f);
        pathBuilderC.verticalLineToRelative(1.0f);
        pathBuilderC.horizontalLineToRelative(16.0f);
        pathBuilderC.verticalLineToRelative(-1.0f);
        pathBuilderC.lineToRelative(-2.0f, -2.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8694a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

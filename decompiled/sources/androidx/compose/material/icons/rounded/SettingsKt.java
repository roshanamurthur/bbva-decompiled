package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSettings", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Settings", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/rounded/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n122#2:84\n116#2,3:85\n119#2,3:89\n132#2,18:92\n152#2:129\n174#3:88\n694#4,2:110\n706#4,2:112\n708#4,11:118\n64#5,4:114\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/rounded/SettingsKt\n*L\n29#1:84\n29#1:85,3\n29#1:89,3\n30#1:92,18\n30#1:129\n29#1:88\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"})
public final class SettingsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8653a;

    @NotNull
    public static final ImageVector getSettings(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8653a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Settings", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(19.5f, 12.0f);
        pathBuilderC.curveToRelative(0.0f, -0.23f, -0.01f, -0.45f, -0.03f, -0.68f);
        pathBuilderC.lineToRelative(1.86f, -1.41f);
        pathBuilderC.curveToRelative(0.4f, -0.3f, 0.51f, -0.86f, 0.26f, -1.3f);
        pathBuilderC.lineToRelative(-1.87f, -3.23f);
        pathBuilderC.curveToRelative(-0.25f, -0.44f, -0.79f, -0.62f, -1.25f, -0.42f);
        pathBuilderC.lineToRelative(-2.15f, 0.91f);
        pathBuilderC.curveToRelative(-0.37f, -0.26f, -0.76f, -0.49f, -1.17f, -0.68f);
        pathBuilderC.lineToRelative(-0.29f, -2.31f);
        pathBuilderC.curveTo(14.8f, 2.38f, 14.37f, 2.0f, 13.87f, 2.0f);
        pathBuilderC.horizontalLineToRelative(-3.73f);
        pathBuilderC.curveTo(9.63f, 2.0f, 9.2f, 2.38f, 9.14f, 2.88f);
        pathBuilderC.lineTo(8.85f, 5.19f);
        pathBuilderC.curveToRelative(-0.41f, 0.19f, -0.8f, 0.42f, -1.17f, 0.68f);
        pathBuilderC.lineTo(5.53f, 4.96f);
        pathBuilderC.curveToRelative(-0.46f, -0.2f, -1.0f, -0.02f, -1.25f, 0.42f);
        pathBuilderC.lineTo(2.41f, 8.62f);
        pathBuilderC.curveToRelative(-0.25f, 0.44f, -0.14f, 0.99f, 0.26f, 1.3f);
        pathBuilderC.lineToRelative(1.86f, 1.41f);
        pathBuilderC.curveTo(4.51f, 11.55f, 4.5f, 11.77f, 4.5f, 12.0f);
        pathBuilderC.reflectiveCurveToRelative(0.01f, 0.45f, 0.03f, 0.68f);
        pathBuilderC.lineToRelative(-1.86f, 1.41f);
        pathBuilderC.curveToRelative(-0.4f, 0.3f, -0.51f, 0.86f, -0.26f, 1.3f);
        pathBuilderC.lineToRelative(1.87f, 3.23f);
        pathBuilderC.curveToRelative(0.25f, 0.44f, 0.79f, 0.62f, 1.25f, 0.42f);
        pathBuilderC.lineToRelative(2.15f, -0.91f);
        pathBuilderC.curveToRelative(0.37f, 0.26f, 0.76f, 0.49f, 1.17f, 0.68f);
        pathBuilderC.lineToRelative(0.29f, 2.31f);
        pathBuilderC.curveTo(9.2f, 21.62f, 9.63f, 22.0f, 10.13f, 22.0f);
        pathBuilderC.horizontalLineToRelative(3.73f);
        pathBuilderC.curveToRelative(0.5f, 0.0f, 0.93f, -0.38f, 0.99f, -0.88f);
        pathBuilderC.lineToRelative(0.29f, -2.31f);
        pathBuilderC.curveToRelative(0.41f, -0.19f, 0.8f, -0.42f, 1.17f, -0.68f);
        pathBuilderC.lineToRelative(2.15f, 0.91f);
        pathBuilderC.curveToRelative(0.46f, 0.2f, 1.0f, 0.02f, 1.25f, -0.42f);
        pathBuilderC.lineToRelative(1.87f, -3.23f);
        pathBuilderC.curveToRelative(0.25f, -0.44f, 0.14f, -0.99f, -0.26f, -1.3f);
        pathBuilderC.lineToRelative(-1.86f, -1.41f);
        pathBuilderC.curveTo(19.49f, 12.45f, 19.5f, 12.23f, 19.5f, 12.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.04f, 15.5f);
        pathBuilderC.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilderC.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilderC.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilderC.reflectiveCurveTo(13.97f, 15.5f, 12.04f, 15.5f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8653a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

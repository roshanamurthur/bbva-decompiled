package androidx.compose.material.icons.filled;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSettings", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Settings", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/filled/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n122#2:84\n116#2,3:85\n119#2,3:89\n132#2,18:92\n152#2:129\n174#3:88\n694#4,2:110\n706#4,2:112\n708#4,11:118\n64#5,4:114\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/filled/SettingsKt\n*L\n29#1:84\n29#1:85,3\n29#1:89,3\n30#1:92,18\n30#1:129\n29#1:88\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"})
public final class SettingsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8555a;

    @NotNull
    public static final ImageVector getSettings(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f8555a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Settings", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(19.14f, 12.94f);
        pathBuilderC.curveToRelative(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        pathBuilderC.curveToRelative(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        pathBuilderC.lineToRelative(2.03f, -1.58f);
        pathBuilderC.curveToRelative(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        pathBuilderC.lineToRelative(-1.92f, -3.32f);
        pathBuilderC.curveToRelative(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        pathBuilderC.lineToRelative(-2.39f, 0.96f);
        pathBuilderC.curveToRelative(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        pathBuilderC.lineTo(14.4f, 2.81f);
        pathBuilderC.curveToRelative(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        pathBuilderC.horizontalLineToRelative(-3.84f);
        pathBuilderC.curveToRelative(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        pathBuilderC.lineTo(9.25f, 5.35f);
        pathBuilderC.curveTo(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        pathBuilderC.lineTo(5.24f, 5.33f);
        pathBuilderC.curveToRelative(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        pathBuilderC.lineTo(2.74f, 8.87f);
        pathBuilderC.curveTo(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        pathBuilderC.lineToRelative(2.03f, 1.58f);
        pathBuilderC.curveTo(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        pathBuilderC.reflectiveCurveToRelative(0.02f, 0.64f, 0.07f, 0.94f);
        pathBuilderC.lineToRelative(-2.03f, 1.58f);
        pathBuilderC.curveToRelative(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        pathBuilderC.lineToRelative(1.92f, 3.32f);
        pathBuilderC.curveToRelative(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        pathBuilderC.lineToRelative(2.39f, -0.96f);
        pathBuilderC.curveToRelative(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        pathBuilderC.lineToRelative(0.36f, 2.54f);
        pathBuilderC.curveToRelative(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        pathBuilderC.horizontalLineToRelative(3.84f);
        pathBuilderC.curveToRelative(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        pathBuilderC.lineToRelative(0.36f, -2.54f);
        pathBuilderC.curveToRelative(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        pathBuilderC.lineToRelative(2.39f, 0.96f);
        pathBuilderC.curveToRelative(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        pathBuilderC.lineToRelative(1.92f, -3.32f);
        pathBuilderC.curveToRelative(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        pathBuilderC.lineTo(19.14f, 12.94f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.0f, 15.6f);
        pathBuilderC.curveToRelative(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        pathBuilderC.reflectiveCurveToRelative(1.62f, -3.6f, 3.6f, -3.6f);
        pathBuilderC.reflectiveCurveToRelative(3.6f, 1.62f, 3.6f, 3.6f);
        pathBuilderC.reflectiveCurveTo(13.98f, 15.6f, 12.0f, 15.6f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8555a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

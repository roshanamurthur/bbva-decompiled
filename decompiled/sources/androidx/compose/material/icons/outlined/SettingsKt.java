package androidx.compose.material.icons.outlined;

import ad.d;
import androidx.appcompat.widget.o1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSettings", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Settings", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/outlined/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,145:1\n122#2:146\n116#2,3:147\n119#2,3:151\n132#2,18:154\n152#2:191\n174#3:150\n694#4,2:172\n706#4,2:174\n708#4,11:180\n64#5,4:176\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/outlined/SettingsKt\n*L\n29#1:146\n29#1:147,3\n29#1:151,3\n30#1:154,18\n30#1:191\n29#1:150\n30#1:172,2\n30#1:174,2\n30#1:180,11\n30#1:176,4\n*E\n"})
public final class SettingsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8604a;

    @NotNull
    public static final ImageVector getSettings(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8604a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Settings", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(19.43f, 12.98f);
        pathBuilderC.curveToRelative(0.04f, -0.32f, 0.07f, -0.64f, 0.07f, -0.98f);
        pathBuilderC.curveToRelative(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.98f);
        pathBuilderC.lineToRelative(2.11f, -1.65f);
        pathBuilderC.curveToRelative(0.19f, -0.15f, 0.24f, -0.42f, 0.12f, -0.64f);
        pathBuilderC.lineToRelative(-2.0f, -3.46f);
        pathBuilderC.curveToRelative(-0.09f, -0.16f, -0.26f, -0.25f, -0.44f, -0.25f);
        pathBuilderC.curveToRelative(-0.06f, 0.0f, -0.12f, 0.01f, -0.17f, 0.03f);
        pathBuilderC.lineToRelative(-2.49f, 1.0f);
        pathBuilderC.curveToRelative(-0.52f, -0.4f, -1.08f, -0.73f, -1.69f, -0.98f);
        pathBuilderC.lineToRelative(-0.38f, -2.65f);
        pathBuilderC.curveTo(14.46f, 2.18f, 14.25f, 2.0f, 14.0f, 2.0f);
        pathBuilderC.horizontalLineToRelative(-4.0f);
        pathBuilderC.curveToRelative(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
        pathBuilderC.lineToRelative(-0.38f, 2.65f);
        pathBuilderC.curveToRelative(-0.61f, 0.25f, -1.17f, 0.59f, -1.69f, 0.98f);
        pathBuilderC.lineToRelative(-2.49f, -1.0f);
        pathBuilderC.curveToRelative(-0.06f, -0.02f, -0.12f, -0.03f, -0.18f, -0.03f);
        pathBuilderC.curveToRelative(-0.17f, 0.0f, -0.34f, 0.09f, -0.43f, 0.25f);
        pathBuilderC.lineToRelative(-2.0f, 3.46f);
        pathBuilderC.curveToRelative(-0.13f, 0.22f, -0.07f, 0.49f, 0.12f, 0.64f);
        pathBuilderC.lineToRelative(2.11f, 1.65f);
        pathBuilderC.curveToRelative(-0.04f, 0.32f, -0.07f, 0.65f, -0.07f, 0.98f);
        pathBuilderC.curveToRelative(0.0f, 0.33f, 0.03f, 0.66f, 0.07f, 0.98f);
        pathBuilderC.lineToRelative(-2.11f, 1.65f);
        pathBuilderC.curveToRelative(-0.19f, 0.15f, -0.24f, 0.42f, -0.12f, 0.64f);
        pathBuilderC.lineToRelative(2.0f, 3.46f);
        pathBuilderC.curveToRelative(0.09f, 0.16f, 0.26f, 0.25f, 0.44f, 0.25f);
        pathBuilderC.curveToRelative(0.06f, 0.0f, 0.12f, -0.01f, 0.17f, -0.03f);
        pathBuilderC.lineToRelative(2.49f, -1.0f);
        pathBuilderC.curveToRelative(0.52f, 0.4f, 1.08f, 0.73f, 1.69f, 0.98f);
        pathBuilderC.lineToRelative(0.38f, 2.65f);
        pathBuilderC.curveToRelative(0.03f, 0.24f, 0.24f, 0.42f, 0.49f, 0.42f);
        pathBuilderC.horizontalLineToRelative(4.0f);
        pathBuilderC.curveToRelative(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
        pathBuilderC.lineToRelative(0.38f, -2.65f);
        pathBuilderC.curveToRelative(0.61f, -0.25f, 1.17f, -0.59f, 1.69f, -0.98f);
        pathBuilderC.lineToRelative(2.49f, 1.0f);
        pathBuilderC.curveToRelative(0.06f, 0.02f, 0.12f, 0.03f, 0.18f, 0.03f);
        pathBuilderC.curveToRelative(0.17f, 0.0f, 0.34f, -0.09f, 0.43f, -0.25f);
        pathBuilderC.lineToRelative(2.0f, -3.46f);
        pathBuilderC.curveToRelative(0.12f, -0.22f, 0.07f, -0.49f, -0.12f, -0.64f);
        pathBuilderC.lineToRelative(-2.11f, -1.65f);
        pathBuilderC.close();
        pathBuilderC.moveTo(17.45f, 11.27f);
        pathBuilderC.curveToRelative(0.04f, 0.31f, 0.05f, 0.52f, 0.05f, 0.73f);
        pathBuilderC.curveToRelative(0.0f, 0.21f, -0.02f, 0.43f, -0.05f, 0.73f);
        pathBuilderC.lineToRelative(-0.14f, 1.13f);
        pathBuilderC.lineToRelative(0.89f, 0.7f);
        pathBuilderC.lineToRelative(1.08f, 0.84f);
        pathBuilderC.lineToRelative(-0.7f, 1.21f);
        pathBuilderC.lineToRelative(-1.27f, -0.51f);
        pathBuilderC.lineToRelative(-1.04f, -0.42f);
        pathBuilderC.lineToRelative(-0.9f, 0.68f);
        pathBuilderC.curveToRelative(-0.43f, 0.32f, -0.84f, 0.56f, -1.25f, 0.73f);
        pathBuilderC.lineToRelative(-1.06f, 0.43f);
        pathBuilderC.lineToRelative(-0.16f, 1.13f);
        pathBuilderC.lineToRelative(-0.2f, 1.35f);
        pathBuilderC.horizontalLineToRelative(-1.4f);
        pathBuilderC.lineToRelative(-0.19f, -1.35f);
        pathBuilderC.lineToRelative(-0.16f, -1.13f);
        pathBuilderC.lineToRelative(-1.06f, -0.43f);
        pathBuilderC.curveToRelative(-0.43f, -0.18f, -0.83f, -0.41f, -1.23f, -0.71f);
        pathBuilderC.lineToRelative(-0.91f, -0.7f);
        pathBuilderC.lineToRelative(-1.06f, 0.43f);
        pathBuilderC.lineToRelative(-1.27f, 0.51f);
        pathBuilderC.lineToRelative(-0.7f, -1.21f);
        pathBuilderC.lineToRelative(1.08f, -0.84f);
        pathBuilderC.lineToRelative(0.89f, -0.7f);
        pathBuilderC.lineToRelative(-0.14f, -1.13f);
        pathBuilderC.curveToRelative(-0.03f, -0.31f, -0.05f, -0.54f, -0.05f, -0.74f);
        pathBuilderC.reflectiveCurveToRelative(0.02f, -0.43f, 0.05f, -0.73f);
        pathBuilderC.lineToRelative(0.14f, -1.13f);
        pathBuilderC.lineToRelative(-0.89f, -0.7f);
        pathBuilderC.lineToRelative(-1.08f, -0.84f);
        pathBuilderC.lineToRelative(0.7f, -1.21f);
        pathBuilderC.lineToRelative(1.27f, 0.51f);
        pathBuilderC.lineToRelative(1.04f, 0.42f);
        pathBuilderC.lineToRelative(0.9f, -0.68f);
        pathBuilderC.curveToRelative(0.43f, -0.32f, 0.84f, -0.56f, 1.25f, -0.73f);
        pathBuilderC.lineToRelative(1.06f, -0.43f);
        pathBuilderC.lineToRelative(0.16f, -1.13f);
        pathBuilderC.lineToRelative(0.2f, -1.35f);
        pathBuilderC.horizontalLineToRelative(1.39f);
        pathBuilderC.lineToRelative(0.19f, 1.35f);
        pathBuilderC.lineToRelative(0.16f, 1.13f);
        pathBuilderC.lineToRelative(1.06f, 0.43f);
        pathBuilderC.curveToRelative(0.43f, 0.18f, 0.83f, 0.41f, 1.23f, 0.71f);
        pathBuilderC.lineToRelative(0.91f, 0.7f);
        pathBuilderC.lineToRelative(1.06f, -0.43f);
        pathBuilderC.lineToRelative(1.27f, -0.51f);
        pathBuilderC.lineToRelative(0.7f, 1.21f);
        pathBuilderC.lineToRelative(-1.07f, 0.85f);
        pathBuilderC.lineToRelative(-0.89f, 0.7f);
        pathBuilderC.lineToRelative(0.14f, 1.13f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.0f, 8.0f);
        pathBuilderC.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilderC.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderC.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.0f, 14.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderC.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderC.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, o1.d(pathBuilderC, -0.9f, 2.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8604a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

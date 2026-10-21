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

/* JADX INFO: compiled from: ExitToApp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getExitToApp", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ExitToApp", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExitToApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExitToApp.kt\nandroidx/compose/material/icons/rounded/ExitToAppKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n122#2:77\n116#2,3:78\n119#2,3:82\n132#2,18:85\n152#2:122\n174#3:81\n694#4,2:103\n706#4,2:105\n708#4,11:111\n64#5,4:107\n*S KotlinDebug\n*F\n+ 1 ExitToApp.kt\nandroidx/compose/material/icons/rounded/ExitToAppKt\n*L\n29#1:77\n29#1:78,3\n29#1:82,3\n30#1:85,18\n30#1:122\n29#1:81\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"})
public final class ExitToAppKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8629a;

    @NotNull
    public static final ImageVector getExitToApp(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8629a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ExitToApp", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(10.79f, 16.29f);
        pathBuilderC.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderC.lineToRelative(3.59f, -3.59f);
        pathBuilderC.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderC.lineTo(12.2f, 7.7f);
        pathBuilderC.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderC.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderC.lineTo(12.67f, 11.0f);
        pathBuilderC.horizontalLineTo(4.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.horizontalLineToRelative(8.67f);
        pathBuilderC.lineToRelative(-1.88f, 1.88f);
        pathBuilderC.curveToRelative(-0.39f, 0.39f, -0.38f, 1.03f, 0.0f, 1.41f);
        pathBuilderC.close();
        pathBuilderC.moveTo(19.0f, 3.0f);
        pathBuilderC.horizontalLineTo(5.0f);
        pathBuilderC.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderC.verticalLineToRelative(3.0f);
        pathBuilderC.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.verticalLineTo(6.0f);
        pathBuilderC.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.horizontalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderC.verticalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderC.horizontalLineTo(6.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.verticalLineToRelative(-2.0f);
        pathBuilderC.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.verticalLineToRelative(3.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.horizontalLineToRelative(14.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.verticalLineTo(5.0f);
        pathBuilderC.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8629a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

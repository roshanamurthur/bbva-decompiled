package androidx.compose.material.icons.outlined;

import ad.d;
import androidx.appcompat.widget.a;
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

/* JADX INFO: compiled from: CheckCircle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getCheckCircle", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "CheckCircle", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckCircle.kt\nandroidx/compose/material/icons/outlined/CheckCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n122#2:57\n116#2,3:58\n119#2,3:62\n132#2,18:65\n152#2:102\n174#3:61\n694#4,2:83\n706#4,2:85\n708#4,11:91\n64#5,4:87\n*S KotlinDebug\n*F\n+ 1 CheckCircle.kt\nandroidx/compose/material/icons/outlined/CheckCircleKt\n*L\n29#1:57\n29#1:58,3\n29#1:62,3\n30#1:65,18\n30#1:102\n29#1:61\n30#1:83,2\n30#1:85,2\n30#1:91,11\n30#1:87,4\n*E\n"})
public final class CheckCircleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8570a;

    @NotNull
    public static final ImageVector getCheckCircle(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8570a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CheckCircle", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(12.0f, 2.0f);
        pathBuilderC.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderC.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderC.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderC.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(12.0f, 20.0f);
        pathBuilderC.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderC.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilderC.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderC.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(16.59f, 7.58f);
        pathBuilderC.lineTo(10.0f, 14.17f);
        pathBuilderC.lineToRelative(-2.59f, -2.58f);
        pathBuilderC.lineTo(6.0f, 13.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, a.d(pathBuilderC, 4.0f, 4.0f, 8.0f, -8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8570a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

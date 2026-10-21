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

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getShare", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Share", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nandroidx/compose/material/icons/outlined/ShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n122#2:78\n116#2,3:79\n119#2,3:83\n132#2,18:86\n152#2:123\n174#3:82\n694#4,2:104\n706#4,2:106\n708#4,11:112\n64#5,4:108\n*S KotlinDebug\n*F\n+ 1 Share.kt\nandroidx/compose/material/icons/outlined/ShareKt\n*L\n29#1:78\n29#1:79,3\n29#1:83,3\n30#1:86,18\n30#1:123\n29#1:82\n30#1:104,2\n30#1:106,2\n30#1:112,11\n30#1:108,4\n*E\n"})
public final class ShareKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8605a;

    @NotNull
    public static final ImageVector getShare(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8605a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Share", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(18.0f, 16.08f);
        pathBuilderC.curveToRelative(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        pathBuilderC.lineTo(8.91f, 12.7f);
        pathBuilderC.curveToRelative(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        pathBuilderC.reflectiveCurveToRelative(-0.04f, -0.47f, -0.09f, -0.7f);
        pathBuilderC.lineToRelative(7.05f, -4.11f);
        pathBuilderC.curveToRelative(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        pathBuilderC.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderC.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderC.curveToRelative(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        pathBuilderC.lineTo(8.04f, 9.81f);
        pathBuilderC.curveTo(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        pathBuilderC.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderC.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderC.curveToRelative(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        pathBuilderC.lineToRelative(7.12f, 4.16f);
        pathBuilderC.curveToRelative(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        pathBuilderC.curveToRelative(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        pathBuilderC.reflectiveCurveToRelative(2.92f, -1.31f, 2.92f, -2.92f);
        pathBuilderC.curveToRelative(0.0f, -1.61f, -1.31f, -2.92f, -2.92f, -2.92f);
        pathBuilderC.close();
        pathBuilderC.moveTo(18.0f, 4.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(6.0f, 13.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(18.0f, 20.02f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, o1.d(pathBuilderC, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8605a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

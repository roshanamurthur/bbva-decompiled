package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: AddCircle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getAddCircle", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "AddCircle", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddCircle.kt\nandroidx/compose/material/icons/rounded/AddCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,61:1\n122#2:62\n116#2,3:63\n119#2,3:67\n132#2,18:70\n152#2:107\n174#3:66\n694#4,2:88\n706#4,2:90\n708#4,11:96\n64#5,4:92\n*S KotlinDebug\n*F\n+ 1 AddCircle.kt\nandroidx/compose/material/icons/rounded/AddCircleKt\n*L\n29#1:62\n29#1:63,3\n29#1:67,3\n30#1:70,18\n30#1:107\n29#1:66\n30#1:88,2\n30#1:90,2\n30#1:96,11\n30#1:92,4\n*E\n"})
public final class AddCircleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8612a;

    @NotNull
    public static final ImageVector getAddCircle(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8612a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddCircle", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
        pathBuilderC.moveTo(16.0f, 13.0f);
        pathBuilderC.horizontalLineToRelative(-3.0f);
        pathBuilderC.verticalLineToRelative(3.0f);
        pathBuilderC.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.verticalLineToRelative(-3.0f);
        pathBuilderC.lineTo(8.0f, 13.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.horizontalLineToRelative(3.0f);
        pathBuilderC.lineTo(11.0f, 8.0f);
        pathBuilderC.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderC.verticalLineToRelative(3.0f);
        pathBuilderC.horizontalLineToRelative(3.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, o1.d(pathBuilderC, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8612a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

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

/* JADX INFO: compiled from: ShoppingCart.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getShoppingCart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ShoppingCart", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShoppingCart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingCart.kt\nandroidx/compose/material/icons/rounded/ShoppingCartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n122#2:71\n116#2,3:72\n119#2,3:76\n132#2,18:79\n152#2:116\n174#3:75\n694#4,2:97\n706#4,2:99\n708#4,11:105\n64#5,4:101\n*S KotlinDebug\n*F\n+ 1 ShoppingCart.kt\nandroidx/compose/material/icons/rounded/ShoppingCartKt\n*L\n29#1:71\n29#1:72,3\n29#1:76,3\n30#1:79,18\n30#1:116\n29#1:75\n30#1:97,2\n30#1:99,2\n30#1:105,11\n30#1:101,4\n*E\n"})
public final class ShoppingCartKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8655a;

    @NotNull
    public static final ImageVector getShoppingCart(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8655a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ShoppingCart", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(7.0f, 18.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderC.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilderC.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(1.0f, 3.0f);
        pathBuilderC.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.horizontalLineToRelative(1.0f);
        pathBuilderC.lineToRelative(3.6f, 7.59f);
        pathBuilderC.lineToRelative(-1.35f, 2.44f);
        pathBuilderC.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        pathBuilderC.horizontalLineToRelative(11.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.lineTo(7.0f, 15.0f);
        pathBuilderC.lineToRelative(1.1f, -2.0f);
        pathBuilderC.horizontalLineToRelative(7.45f);
        pathBuilderC.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        pathBuilderC.lineToRelative(3.58f, -6.49f);
        pathBuilderC.curveToRelative(0.37f, -0.66f, -0.11f, -1.48f, -0.87f, -1.48f);
        pathBuilderC.lineTo(5.21f, 4.0f);
        pathBuilderC.lineToRelative(-0.67f, -1.43f);
        pathBuilderC.curveToRelative(-0.16f, -0.35f, -0.52f, -0.57f, -0.9f, -0.57f);
        pathBuilderC.lineTo(2.0f, 2.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(17.0f, 18.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderC.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderC.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, o1.d(pathBuilderC, -0.9f, -2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8655a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

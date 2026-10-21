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

/* JADX INFO: compiled from: Phone.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getPhone", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Phone", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Phone.kt\nandroidx/compose/material/icons/outlined/PhoneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,64:1\n122#2:65\n116#2,3:66\n119#2,3:70\n132#2,18:73\n152#2:110\n174#3:69\n694#4,2:91\n706#4,2:93\n708#4,11:99\n64#5,4:95\n*S KotlinDebug\n*F\n+ 1 Phone.kt\nandroidx/compose/material/icons/outlined/PhoneKt\n*L\n29#1:65\n29#1:66,3\n29#1:70,3\n30#1:73,18\n30#1:110\n29#1:69\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
public final class PhoneKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8598a;

    @NotNull
    public static final ImageVector getPhone(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8598a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Phone", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(6.54f, 5.0f);
        pathBuilderC.curveToRelative(0.06f, 0.89f, 0.21f, 1.76f, 0.45f, 2.59f);
        pathBuilderC.lineToRelative(-1.2f, 1.2f);
        pathBuilderC.curveToRelative(-0.41f, -1.2f, -0.67f, -2.47f, -0.76f, -3.79f);
        pathBuilderC.horizontalLineToRelative(1.51f);
        pathBuilderC.moveToRelative(9.86f, 12.02f);
        pathBuilderC.curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f);
        pathBuilderC.verticalLineToRelative(1.49f);
        pathBuilderC.curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f);
        pathBuilderC.lineToRelative(1.2f, -1.19f);
        pathBuilderC.moveTo(7.5f, 3.0f);
        pathBuilderC.horizontalLineTo(4.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.verticalLineToRelative(-3.49f);
        pathBuilderC.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.curveToRelative(-1.24f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        pathBuilderC.curveToRelative(-0.1f, -0.04f, -0.21f, -0.05f, -0.31f, -0.05f);
        pathBuilderC.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilderC.lineToRelative(-2.2f, 2.2f);
        pathBuilderC.curveToRelative(-2.83f, -1.45f, -5.15f, -3.76f, -6.59f, -6.59f);
        pathBuilderC.lineToRelative(2.2f, -2.2f);
        pathBuilderC.curveToRelative(0.28f, -0.28f, 0.36f, -0.67f, 0.25f, -1.02f);
        pathBuilderC.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        pathBuilderC.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8598a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

package androidx.compose.material.icons.rounded;

import ad.e;
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

/* JADX INFO: compiled from: Star.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getStar", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Star", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Star.kt\nandroidx/compose/material/icons/rounded/StarKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,54:1\n122#2:55\n116#2,3:56\n119#2,3:60\n132#2,18:63\n152#2:100\n174#3:59\n694#4,2:81\n706#4,2:83\n708#4,11:89\n64#5,4:85\n*S KotlinDebug\n*F\n+ 1 Star.kt\nandroidx/compose/material/icons/rounded/StarKt\n*L\n29#1:55\n29#1:56,3\n29#1:60,3\n30#1:63,18\n30#1:100\n29#1:59\n30#1:81,2\n30#1:83,2\n30#1:89,11\n30#1:85,4\n*E\n"})
public final class StarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8656a;

    @NotNull
    public static final ImageVector getStar(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8656a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Star", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(12.0f, 17.27f, 4.15f, 2.51f);
        pathBuilderC.curveToRelative(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f);
        pathBuilderC.lineToRelative(-1.1f, -4.72f);
        pathBuilderC.lineToRelative(3.67f, -3.18f);
        pathBuilderC.curveToRelative(0.67f, -0.58f, 0.31f, -1.68f, -0.57f, -1.75f);
        pathBuilderC.lineToRelative(-4.83f, -0.41f);
        pathBuilderC.lineToRelative(-1.89f, -4.46f);
        pathBuilderC.curveToRelative(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0.0f);
        pathBuilderC.lineTo(9.19f, 8.63f);
        pathBuilderC.lineTo(4.36f, 9.04f);
        pathBuilderC.curveToRelative(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f);
        pathBuilderC.lineToRelative(3.67f, 3.18f);
        pathBuilderC.lineToRelative(-1.1f, 4.72f);
        pathBuilderC.curveToRelative(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f);
        pathBuilderC.lineTo(12.0f, 17.27f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8656a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

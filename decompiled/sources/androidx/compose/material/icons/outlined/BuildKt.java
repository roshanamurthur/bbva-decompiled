package androidx.compose.material.icons.outlined;

import ad.e;
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

/* JADX INFO: compiled from: Build.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getBuild", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Build", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/outlined/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n122#2:66\n116#2,3:67\n119#2,3:71\n132#2,18:74\n152#2:111\n174#3:70\n694#4,2:92\n706#4,2:94\n708#4,11:100\n64#5,4:96\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/outlined/BuildKt\n*L\n29#1:66\n29#1:67,3\n29#1:71,3\n30#1:74,18\n30#1:111\n29#1:70\n30#1:92,2\n30#1:94,2\n30#1:100,11\n30#1:96,4\n*E\n"})
public final class BuildKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8568a;

    @NotNull
    public static final ImageVector getBuild(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8568a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Build", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(22.61f, 18.99f, -9.08f, -9.08f);
        pathBuilderC.curveToRelative(0.93f, -2.34f, 0.45f, -5.1f, -1.44f, -7.0f);
        pathBuilderC.curveTo(9.79f, 0.61f, 6.21f, 0.4f, 3.66f, 2.26f);
        pathBuilderC.lineTo(7.5f, 6.11f);
        pathBuilderC.lineTo(6.08f, 7.52f);
        pathBuilderC.lineTo(2.25f, 3.69f);
        pathBuilderC.curveTo(0.39f, 6.23f, 0.6f, 9.82f, 2.9f, 12.11f);
        pathBuilderC.curveToRelative(1.86f, 1.86f, 4.57f, 2.35f, 6.89f, 1.48f);
        pathBuilderC.lineToRelative(9.11f, 9.11f);
        pathBuilderC.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderC.lineToRelative(2.3f, -2.3f);
        pathBuilderC.curveToRelative(0.4f, -0.38f, 0.4f, -1.01f, 0.0f, -1.41f);
        pathBuilderC.close();
        pathBuilderC.moveTo(19.61f, 20.59f);
        pathBuilderC.lineToRelative(-9.46f, -9.46f);
        pathBuilderC.curveToRelative(-0.61f, 0.45f, -1.29f, 0.72f, -2.0f, 0.82f);
        pathBuilderC.curveToRelative(-1.36f, 0.2f, -2.79f, -0.21f, -3.83f, -1.25f);
        pathBuilderC.curveTo(3.37f, 9.76f, 2.93f, 8.5f, 3.0f, 7.26f);
        pathBuilderC.lineToRelative(3.09f, 3.09f);
        pathBuilderC.lineToRelative(4.24f, -4.24f);
        pathBuilderC.lineToRelative(-3.09f, -3.09f);
        pathBuilderC.curveToRelative(1.24f, -0.07f, 2.49f, 0.37f, 3.44f, 1.31f);
        pathBuilderC.curveToRelative(1.08f, 1.08f, 1.49f, 2.57f, 1.24f, 3.96f);
        pathBuilderC.curveToRelative(-0.12f, 0.71f, -0.42f, 1.37f, -0.88f, 1.96f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, a.d(pathBuilderC, 9.45f, 9.45f, -0.88f, 0.89f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8568a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: Build.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getBuild", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Build", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/filled/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,51:1\n122#2:52\n116#2,3:53\n119#2,3:57\n132#2,18:60\n152#2:97\n174#3:56\n694#4,2:78\n706#4,2:80\n708#4,11:86\n64#5,4:82\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/filled/BuildKt\n*L\n29#1:52\n29#1:53,3\n29#1:57,3\n30#1:60,18\n30#1:97\n29#1:56\n30#1:78,2\n30#1:80,2\n30#1:86,11\n30#1:82,4\n*E\n"})
public final class BuildKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8519a;

    @NotNull
    public static final ImageVector getBuild(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f8519a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Build", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(22.7f, 19.0f, -9.1f, -9.1f);
        pathBuilderC.curveToRelative(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
        pathBuilderC.curveToRelative(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
        pathBuilderC.lineTo(9.0f, 6.0f);
        pathBuilderC.lineTo(6.0f, 9.0f);
        pathBuilderC.lineTo(1.6f, 4.7f);
        pathBuilderC.curveTo(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
        pathBuilderC.curveToRelative(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
        pathBuilderC.lineToRelative(9.1f, 9.1f);
        pathBuilderC.curveToRelative(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
        pathBuilderC.lineToRelative(2.3f, -2.3f);
        pathBuilderC.curveToRelative(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8519a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

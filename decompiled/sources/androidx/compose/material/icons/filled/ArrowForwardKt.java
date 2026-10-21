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

/* JADX INFO: compiled from: ArrowForward.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getArrowForward", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowForward", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nArrowForward.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrowForward.kt\nandroidx/compose/material/icons/filled/ArrowForwardKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,47:1\n122#2:48\n116#2,3:49\n119#2,3:53\n132#2,18:56\n152#2:93\n174#3:52\n694#4,2:74\n706#4,2:76\n708#4,11:82\n64#5,4:78\n*S KotlinDebug\n*F\n+ 1 ArrowForward.kt\nandroidx/compose/material/icons/filled/ArrowForwardKt\n*L\n29#1:48\n29#1:49,3\n29#1:53,3\n30#1:56,18\n30#1:93\n29#1:52\n30#1:74,2\n30#1:76,2\n30#1:82,11\n30#1:78,4\n*E\n"})
public final class ArrowForwardKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8518a;

    @NotNull
    public static final ImageVector getArrowForward(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f8518a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowForward", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(12.0f, 4.0f, -1.41f, 1.41f);
        pathBuilderC.lineTo(16.17f, 11.0f);
        pathBuilderC.horizontalLineTo(4.0f);
        pathBuilderC.verticalLineToRelative(2.0f);
        pathBuilderC.horizontalLineToRelative(12.17f);
        pathBuilderC.lineToRelative(-5.58f, 5.59f);
        pathBuilderC.lineTo(12.0f, 20.0f);
        pathBuilderC.lineToRelative(8.0f, -8.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8518a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

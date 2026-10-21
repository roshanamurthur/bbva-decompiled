package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getCall", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Call", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/filled/CallKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n122#2:54\n116#2,3:55\n119#2,3:59\n132#2,18:62\n152#2:99\n174#3:58\n694#4,2:80\n706#4,2:82\n708#4,11:88\n64#5,4:84\n*S KotlinDebug\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/filled/CallKt\n*L\n29#1:54\n29#1:55,3\n29#1:59,3\n30#1:62,18\n30#1:99\n29#1:58\n30#1:80,2\n30#1:82,2\n30#1:88,11\n30#1:84,4\n*E\n"})
public final class CallKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8520a;

    @NotNull
    public static final ImageVector getCall(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f8520a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Call", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(20.01f, 15.38f);
        pathBuilderC.curveToRelative(-1.23f, 0.0f, -2.42f, -0.2f, -3.53f, -0.56f);
        pathBuilderC.curveToRelative(-0.35f, -0.12f, -0.74f, -0.03f, -1.01f, 0.24f);
        pathBuilderC.lineToRelative(-1.57f, 1.97f);
        pathBuilderC.curveToRelative(-2.83f, -1.35f, -5.48f, -3.9f, -6.89f, -6.83f);
        pathBuilderC.lineToRelative(1.95f, -1.66f);
        pathBuilderC.curveToRelative(0.27f, -0.28f, 0.35f, -0.67f, 0.24f, -1.02f);
        pathBuilderC.curveToRelative(-0.37f, -1.11f, -0.56f, -2.3f, -0.56f, -3.53f);
        pathBuilderC.curveToRelative(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f);
        pathBuilderC.horizontalLineTo(4.19f);
        pathBuilderC.curveTo(3.65f, 3.0f, 3.0f, 3.24f, 3.0f, 3.99f);
        pathBuilderC.curveTo(3.0f, 13.28f, 10.73f, 21.0f, 20.01f, 21.0f);
        pathBuilderC.curveToRelative(0.71f, 0.0f, 0.99f, -0.63f, 0.99f, -1.18f);
        pathBuilderC.verticalLineToRelative(-3.45f);
        pathBuilderC.curveToRelative(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8520a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

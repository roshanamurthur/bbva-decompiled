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

/* JADX INFO: compiled from: Done.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getDone", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Done", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Done.kt\nandroidx/compose/material/icons/rounded/DoneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,48:1\n122#2:49\n116#2,3:50\n119#2,3:54\n132#2,18:57\n152#2:94\n174#3:53\n694#4,2:75\n706#4,2:77\n708#4,11:83\n64#5,4:79\n*S KotlinDebug\n*F\n+ 1 Done.kt\nandroidx/compose/material/icons/rounded/DoneKt\n*L\n29#1:49\n29#1:50,3\n29#1:54,3\n30#1:57,18\n30#1:94\n29#1:53\n30#1:75,2\n30#1:77,2\n30#1:83,11\n30#1:79,4\n*E\n"})
public final class DoneKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8626a;

    @NotNull
    public static final ImageVector getDone(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8626a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Done", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(9.0f, 16.2f, -3.5f, -3.5f);
        pathBuilderC.curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        pathBuilderC.curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.4f);
        pathBuilderC.lineToRelative(4.19f, 4.19f);
        pathBuilderC.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderC.lineTo(20.3f, 7.7f);
        pathBuilderC.curveToRelative(0.39f, -0.39f, 0.39f, -1.01f, 0.0f, -1.4f);
        pathBuilderC.curveToRelative(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        pathBuilderC.lineTo(9.0f, 16.2f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8626a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

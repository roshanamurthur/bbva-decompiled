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

/* JADX INFO: compiled from: Send.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSend", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Send", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/rounded/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,50:1\n122#2:51\n116#2,3:52\n119#2,3:56\n132#2,18:59\n152#2:96\n174#3:55\n694#4,2:77\n706#4,2:79\n708#4,11:85\n64#5,4:81\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/rounded/SendKt\n*L\n29#1:51\n29#1:52,3\n29#1:56,3\n30#1:59,18\n30#1:96\n29#1:55\n30#1:77,2\n30#1:79,2\n30#1:85,11\n30#1:81,4\n*E\n"})
public final class SendKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8652a;

    @NotNull
    public static final ImageVector getSend(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8652a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Send", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(3.4f, 20.4f, 17.45f, -7.48f);
        pathBuilderC.curveToRelative(0.81f, -0.35f, 0.81f, -1.49f, 0.0f, -1.84f);
        pathBuilderC.lineTo(3.4f, 3.6f);
        pathBuilderC.curveToRelative(-0.66f, -0.29f, -1.39f, 0.2f, -1.39f, 0.91f);
        pathBuilderC.lineTo(2.0f, 9.12f);
        pathBuilderC.curveToRelative(0.0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f);
        pathBuilderC.lineTo(17.0f, 12.0f);
        pathBuilderC.lineTo(2.87f, 13.88f);
        pathBuilderC.curveToRelative(-0.5f, 0.07f, -0.87f, 0.5f, -0.87f, 1.0f);
        pathBuilderC.lineToRelative(0.01f, 4.61f);
        pathBuilderC.curveToRelative(0.0f, 0.71f, 0.73f, 1.2f, 1.39f, 0.91f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8652a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

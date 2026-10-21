package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ThumbUp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getThumbUp", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbUp", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThumbUp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbUp.kt\nandroidx/compose/material/icons/rounded/ThumbUpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n122#2:60\n116#2,3:61\n119#2,3:65\n132#2,18:68\n152#2:105\n174#3:64\n694#4,2:86\n706#4,2:88\n708#4,11:94\n64#5,4:90\n*S KotlinDebug\n*F\n+ 1 ThumbUp.kt\nandroidx/compose/material/icons/rounded/ThumbUpKt\n*L\n29#1:60\n29#1:61,3\n29#1:65,3\n30#1:68,18\n30#1:105\n29#1:64\n30#1:86,2\n30#1:88,2\n30#1:94,11\n30#1:90,4\n*E\n"})
public final class ThumbUpKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8657a;

    @NotNull
    public static final ImageVector getThumbUp(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8657a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ThumbUp", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(13.12f, 2.06f, 7.58f, 7.6f);
        pathBuilderB.curveToRelative(-0.37f, 0.37f, -0.58f, 0.88f, -0.58f, 1.41f);
        pathBuilderB.verticalLineTo(19.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(9.0f);
        pathBuilderB.curveToRelative(0.8f, 0.0f, 1.52f, -0.48f, 1.84f, -1.21f);
        pathBuilderB.lineToRelative(3.26f, -7.61f);
        pathBuilderB.curveTo(23.94f, 10.2f, 22.49f, 8.0f, 20.34f, 8.0f);
        pathBuilderB.horizontalLineToRelative(-5.65f);
        pathBuilderB.lineToRelative(0.95f, -4.58f);
        pathBuilderB.curveToRelative(0.1f, -0.5f, -0.05f, -1.01f, -0.41f, -1.37f);
        pathBuilderB.curveToRelative(-0.59f, -0.58f, -1.53f, -0.58f, -2.11f, 0.01f);
        pathBuilderB.close();
        pathBuilderB.moveTo(3.0f, 21.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineToRelative(-8.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(8.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8657a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

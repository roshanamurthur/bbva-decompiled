package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ThumbUp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getThumbUp", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbUp", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThumbUp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbUp.kt\nandroidx/compose/material/icons/outlined/ThumbUpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n122#2:69\n116#2,3:70\n119#2,3:74\n132#2,18:77\n152#2:114\n174#3:73\n694#4,2:95\n706#4,2:97\n708#4,11:103\n64#5,4:99\n*S KotlinDebug\n*F\n+ 1 ThumbUp.kt\nandroidx/compose/material/icons/outlined/ThumbUpKt\n*L\n29#1:69\n29#1:70,3\n29#1:74,3\n30#1:77,18\n30#1:114\n29#1:73\n30#1:95,2\n30#1:97,2\n30#1:103,11\n30#1:99,4\n*E\n"})
public final class ThumbUpKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8608a;

    @NotNull
    public static final ImageVector getThumbUp(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8608a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ThumbUp", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        pathBuilder.lineToRelative(3.02f, -7.05f);
        pathBuilder.curveToRelative(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-6.31f);
        pathBuilder.lineToRelative(0.95f, -4.57f);
        pathBuilder.lineToRelative(0.03f, -0.32f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        pathBuilder.lineTo(14.17f, 1.0f);
        pathBuilder.lineTo(7.58f, 7.59f);
        pathBuilder.curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 9.0f);
        pathBuilder.lineToRelative(4.34f, -4.34f);
        pathBuilder.lineTo(12.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-3.0f, 7.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        a.e(pathBuilder, 1.0f, 9.0f, 4.0f, 12.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8608a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

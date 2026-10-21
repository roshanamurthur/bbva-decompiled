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

/* JADX INFO: compiled from: Email.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getEmail", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Email", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEmail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Email.kt\nandroidx/compose/material/icons/rounded/EmailKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,58:1\n122#2:59\n116#2,3:60\n119#2,3:64\n132#2,18:67\n152#2:104\n174#3:63\n694#4,2:85\n706#4,2:87\n708#4,11:93\n64#5,4:89\n*S KotlinDebug\n*F\n+ 1 Email.kt\nandroidx/compose/material/icons/rounded/EmailKt\n*L\n29#1:59\n29#1:60,3\n29#1:64,3\n30#1:67,18\n30#1:104\n29#1:63\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"})
public final class EmailKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8628a;

    @NotNull
    public static final ImageVector getEmail(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8628a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Email", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(20.0f, 4.0f, 4.0f, 4.0f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderB.lineTo(2.0f, 18.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.lineTo(22.0f, 6.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(19.6f, 8.25f);
        pathBuilderB.lineToRelative(-7.07f, 4.42f);
        pathBuilderB.curveToRelative(-0.32f, 0.2f, -0.74f, 0.2f, -1.06f, 0.0f);
        pathBuilderB.lineTo(4.4f, 8.25f);
        pathBuilderB.curveToRelative(-0.25f, -0.16f, -0.4f, -0.43f, -0.4f, -0.72f);
        pathBuilderB.curveToRelative(0.0f, -0.67f, 0.73f, -1.07f, 1.3f, -0.72f);
        pathBuilderB.lineTo(12.0f, 11.0f);
        pathBuilderB.lineToRelative(6.7f, -4.19f);
        pathBuilderB.curveToRelative(0.57f, -0.35f, 1.3f, 0.05f, 1.3f, 0.72f);
        pathBuilderB.curveToRelative(0.0f, 0.29f, -0.15f, 0.56f, -0.4f, 0.72f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8628a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

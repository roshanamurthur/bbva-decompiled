package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: ExitToApp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Filled;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getExitToApp", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ExitToApp", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExitToApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExitToApp.kt\nandroidx/compose/material/icons/filled/ExitToAppKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,66:1\n122#2:67\n116#2,3:68\n119#2,3:72\n132#2,18:75\n152#2:112\n174#3:71\n694#4,2:93\n706#4,2:95\n708#4,11:101\n64#5,4:97\n*S KotlinDebug\n*F\n+ 1 ExitToApp.kt\nandroidx/compose/material/icons/filled/ExitToAppKt\n*L\n29#1:67\n29#1:68,3\n29#1:72,3\n30#1:75,18\n30#1:112\n29#1:71\n30#1:93,2\n30#1:95,2\n30#1:101,11\n30#1:97,4\n*E\n"})
public final class ExitToAppKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8531a;

    @NotNull
    public static final ImageVector getExitToApp(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f8531a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ExitToApp", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(10.09f, 15.59f, 11.5f, 17.0f);
        pathBuilderB.lineToRelative(5.0f, -5.0f);
        pathBuilderB.lineToRelative(-5.0f, -5.0f);
        pathBuilderB.lineToRelative(-1.41f, 1.41f);
        pathBuilderB.lineTo(12.67f, 11.0f);
        pathBuilderB.horizontalLineTo(3.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.horizontalLineToRelative(9.67f);
        pathBuilderB.lineToRelative(-2.58f, 2.59f);
        pathBuilderB.close();
        pathBuilderB.moveTo(19.0f, 3.0f);
        pathBuilderB.horizontalLineTo(5.0f);
        pathBuilderB.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(4.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.horizontalLineTo(5.0f);
        pathBuilderB.verticalLineToRelative(-4.0f);
        pathBuilderB.horizontalLineTo(3.0f);
        pathBuilderB.verticalLineToRelative(4.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8531a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

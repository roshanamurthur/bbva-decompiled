package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Edit.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getEdit", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Edit", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEdit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Edit.kt\nandroidx/compose/material/icons/outlined/EditKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n122#2:60\n116#2,3:61\n119#2,3:65\n132#2,18:68\n152#2:105\n174#3:64\n694#4,2:86\n706#4,2:88\n708#4,11:94\n64#5,4:90\n*S KotlinDebug\n*F\n+ 1 Edit.kt\nandroidx/compose/material/icons/outlined/EditKt\n*L\n29#1:60\n29#1:61,3\n29#1:65,3\n30#1:68,18\n30#1:105\n29#1:64\n30#1:86,2\n30#1:88,2\n30#1:94,11\n30#1:90,4\n*E\n"})
public final class EditKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8578a;

    @NotNull
    public static final ImageVector getEdit(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8578a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Edit", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(14.06f, 9.02f, 0.92f, 0.92f);
        pathBuilderC.lineTo(5.92f, 19.0f);
        pathBuilderC.lineTo(5.0f, 19.0f);
        pathBuilderC.verticalLineToRelative(-0.92f);
        pathBuilderC.lineToRelative(9.06f, -9.06f);
        pathBuilderC.moveTo(17.66f, 3.0f);
        pathBuilderC.curveToRelative(-0.25f, 0.0f, -0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilderC.lineToRelative(-1.83f, 1.83f);
        pathBuilderC.lineToRelative(3.75f, 3.75f);
        pathBuilderC.lineToRelative(1.83f, -1.83f);
        pathBuilderC.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderC.lineToRelative(-2.34f, -2.34f);
        pathBuilderC.curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilderC.close();
        pathBuilderC.moveTo(14.06f, 6.19f);
        pathBuilderC.lineTo(3.0f, 17.25f);
        pathBuilderC.lineTo(3.0f, 21.0f);
        pathBuilderC.horizontalLineToRelative(3.75f);
        pathBuilderC.lineTo(17.81f, 9.94f);
        pathBuilderC.lineToRelative(-3.75f, -3.75f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8578a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

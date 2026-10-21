package androidx.compose.material.icons.twotone;

import ad.d;
import androidx.appcompat.widget.a;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getEdit", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Edit", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEdit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Edit.kt\nandroidx/compose/material/icons/twotone/EditKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n122#2:69\n116#2,3:70\n119#2,3:74\n132#2,18:77\n152#2:114\n132#2,18:115\n152#2:152\n174#3:73\n694#4,2:95\n706#4,2:97\n708#4,11:103\n694#4,2:133\n706#4,2:135\n708#4,11:141\n64#5,4:99\n64#5,4:137\n*S KotlinDebug\n*F\n+ 1 Edit.kt\nandroidx/compose/material/icons/twotone/EditKt\n*L\n29#1:69\n29#1:70,3\n29#1:74,3\n30#1:77,18\n30#1:114\n38#1:115,18\n38#1:152\n29#1:73\n30#1:95,2\n30#1:97,2\n30#1:103,11\n38#1:133,2\n38#1:135,2\n38#1:141,11\n30#1:99,4\n38#1:137,4\n*E\n"})
public final class EditKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8725a;

    @NotNull
    public static final ImageVector getEdit(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f8725a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Edit", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 18.08f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(0.92f);
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, a.d(pathBuilder, 9.06f, -9.06f, -0.92f, -0.92f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(20.71f, 7.04f);
        pathBuilderC.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderC.lineToRelative(-2.34f, -2.34f);
        pathBuilderC.curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilderC.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilderC.lineToRelative(-1.83f, 1.83f);
        pathBuilderC.lineToRelative(3.75f, 3.75f);
        pathBuilderC.lineToRelative(1.83f, -1.83f);
        pathBuilderC.close();
        pathBuilderC.moveTo(3.0f, 17.25f);
        pathBuilderC.verticalLineTo(21.0f);
        pathBuilderC.horizontalLineToRelative(3.75f);
        pathBuilderC.lineTo(17.81f, 9.94f);
        pathBuilderC.lineToRelative(-3.75f, -3.75f);
        pathBuilderC.lineTo(3.0f, 17.25f);
        pathBuilderC.close();
        pathBuilderC.moveTo(5.92f, 19.0f);
        pathBuilderC.horizontalLineTo(5.0f);
        pathBuilderC.verticalLineToRelative(-0.92f);
        pathBuilderC.lineToRelative(9.06f, -9.06f);
        pathBuilderC.lineToRelative(0.92f, 0.92f);
        pathBuilderC.lineTo(5.92f, 19.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8725a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

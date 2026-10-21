package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: Place.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getPlace", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Place", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Place.kt\nandroidx/compose/material/icons/twotone/PlaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n122#2:66\n116#2,3:67\n119#2,3:71\n132#2,18:74\n152#2:111\n132#2,18:112\n152#2:149\n174#3:70\n694#4,2:92\n706#4,2:94\n708#4,11:100\n694#4,2:130\n706#4,2:132\n708#4,11:138\n64#5,4:96\n64#5,4:134\n*S KotlinDebug\n*F\n+ 1 Place.kt\nandroidx/compose/material/icons/twotone/PlaceKt\n*L\n29#1:66\n29#1:67,3\n29#1:71,3\n30#1:74,18\n30#1:111\n40#1:112,18\n40#1:149\n29#1:70\n30#1:92,2\n30#1:94,2\n30#1:100,11\n40#1:130,2\n40#1:132,2\n40#1:138,11\n30#1:96,4\n40#1:134,4\n*E\n"})
public final class PlaceKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8746a;

    @NotNull
    public static final ImageVector getPlace(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f8746a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Place", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(18.5f, 10.2f);
        pathBuilderC.curveToRelative(0.0f, 2.57f, -2.1f, 5.79f, -6.16f, 9.51f);
        pathBuilderC.lineTo(12.0f, 20.01f);
        pathBuilderC.lineToRelative(-0.34f, -0.31f);
        pathBuilderC.curveTo(7.6f, 15.99f, 5.5f, 12.77f, 5.5f, 10.2f);
        pathBuilderC.curveToRelative(0.0f, -3.84f, 2.82f, -6.7f, 6.5f, -6.7f);
        pathBuilderC.reflectiveCurveTo(18.5f, 6.35f, 18.5f, 10.2f);
        pathBuilderC.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC2 = d.c(12.0f, 2.0f);
        pathBuilderC2.curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
        pathBuilderC2.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        pathBuilderC2.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        pathBuilderC2.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(18.0f, 10.2f);
        pathBuilderC2.curveTo(18.0f, 6.57f, 15.35f, 4.0f, 12.0f, 4.0f);
        pathBuilderC2.reflectiveCurveToRelative(-6.0f, 2.57f, -6.0f, 6.2f);
        pathBuilderC2.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        pathBuilderC2.curveTo(16.05f, 15.64f, 18.0f, 12.54f, 18.0f, 10.2f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(12.0f, 12.0f);
        pathBuilderC2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderC2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderC2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderC2.reflectiveCurveTo(13.1f, 12.0f, 12.0f, 12.0f);
        pathBuilderC2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8746a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

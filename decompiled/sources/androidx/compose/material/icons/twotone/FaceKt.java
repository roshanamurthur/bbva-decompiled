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

/* JADX INFO: compiled from: Face.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getFace", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Face", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/twotone/FaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n122#2:87\n116#2,3:88\n119#2,3:92\n132#2,18:95\n152#2:132\n132#2,18:133\n152#2:170\n132#2,18:171\n152#2:208\n132#2,18:209\n152#2:246\n174#3:91\n694#4,2:113\n706#4,2:115\n708#4,11:121\n694#4,2:151\n706#4,2:153\n708#4,11:159\n694#4,2:189\n706#4,2:191\n708#4,11:197\n694#4,2:227\n706#4,2:229\n708#4,11:235\n64#5,4:117\n64#5,4:155\n64#5,4:193\n64#5,4:231\n*S KotlinDebug\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/twotone/FaceKt\n*L\n29#1:87\n29#1:88,3\n29#1:92,3\n30#1:95,18\n30#1:132\n42#1:133,18\n42#1:170\n69#1:171,18\n69#1:208\n75#1:209,18\n75#1:246\n29#1:91\n30#1:113,2\n30#1:115,2\n30#1:121,11\n42#1:151,2\n42#1:153,2\n42#1:159,11\n69#1:189,2\n69#1:191,2\n69#1:197,11\n75#1:227,2\n75#1:229,2\n75#1:235,11\n30#1:117,4\n42#1:155,4\n69#1:193,4\n75#1:231,4\n*E\n"})
public final class FaceKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8728a;

    @NotNull
    public static final ImageVector getFace(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f8728a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Face", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(17.5f, 8.0f);
        pathBuilderC.curveToRelative(0.46f, 0.0f, 0.91f, -0.05f, 1.34f, -0.12f);
        pathBuilderC.curveTo(17.44f, 5.56f, 14.9f, 4.0f, 12.0f, 4.0f);
        pathBuilderC.curveToRelative(-0.46f, 0.0f, -0.91f, 0.05f, -1.34f, 0.12f);
        pathBuilderC.curveTo(12.06f, 6.44f, 14.6f, 8.0f, 17.5f, 8.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(8.08f, 5.03f);
        pathBuilderC.curveTo(6.37f, 6.0f, 5.05f, 7.58f, 4.42f, 9.47f);
        pathBuilderC.curveToRelative(1.71f, -0.97f, 3.03f, -2.55f, 3.66f, -4.44f);
        pathBuilderC.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC2 = d.c(12.0f, 2.0f);
        pathBuilderC2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderC2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderC2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderC2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(12.0f, 4.0f);
        pathBuilderC2.curveToRelative(2.9f, 0.0f, 5.44f, 1.56f, 6.84f, 3.88f);
        pathBuilderC2.curveToRelative(-0.43f, 0.07f, -0.88f, 0.12f, -1.34f, 0.12f);
        pathBuilderC2.curveToRelative(-2.9f, 0.0f, -5.44f, -1.56f, -6.84f, -3.88f);
        pathBuilderC2.curveToRelative(0.43f, -0.07f, 0.88f, -0.12f, 1.34f, -0.12f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(8.08f, 5.03f);
        pathBuilderC2.curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f);
        pathBuilderC2.curveTo(5.05f, 7.58f, 6.37f, 6.0f, 8.08f, 5.03f);
        pathBuilderC2.close();
        pathBuilderC2.moveTo(12.0f, 20.0f);
        pathBuilderC2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderC2.curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.01f, -0.15f);
        pathBuilderC2.curveToRelative(2.6f, -0.98f, 4.68f, -2.99f, 5.74f, -5.55f);
        pathBuilderC2.curveToRelative(1.83f, 2.26f, 4.62f, 3.7f, 7.75f, 3.7f);
        pathBuilderC2.curveToRelative(0.75f, 0.0f, 1.47f, -0.09f, 2.17f, -0.24f);
        pathBuilderC2.curveToRelative(0.21f, 0.71f, 0.33f, 1.46f, 0.33f, 2.24f);
        pathBuilderC2.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilderC2.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw3 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk10 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 13.0f);
        pathBuilder.moveToRelative(-1.25f, 0.0f);
        pathBuilder.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilder.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw3, iM2818getBevelLxFBmk10, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw4 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk11 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.0f, 13.0f);
        pathBuilder2.moveToRelative(-1.25f, 0.0f);
        pathBuilder2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilder2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw4, iM2818getBevelLxFBmk11, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8728a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

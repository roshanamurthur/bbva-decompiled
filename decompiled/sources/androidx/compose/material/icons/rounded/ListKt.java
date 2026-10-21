package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: List.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Rounded;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getList", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "List", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/rounded/ListKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,121:1\n122#2:122\n116#2,3:123\n119#2,3:127\n132#2,18:130\n152#2:167\n174#3:126\n694#4,2:148\n706#4,2:150\n708#4,11:156\n64#5,4:152\n*S KotlinDebug\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/rounded/ListKt\n*L\n29#1:122\n29#1:123,3\n29#1:127,3\n30#1:130,18\n30#1:167\n29#1:126\n30#1:148,2\n30#1:150,2\n30#1:156,11\n30#1:152,4\n*E\n"})
public final class ListKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8639a;

    @NotNull
    public static final ImageVector getList(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f8639a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.List", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = d.c(4.0f, 13.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(4.0f, 17.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(4.0f, 9.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(8.0f, 13.0f);
        pathBuilderC.horizontalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.lineTo(8.0f, 11.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(8.0f, 17.0f);
        pathBuilderC.horizontalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.lineTo(8.0f, 15.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(7.0f, 8.0f);
        pathBuilderC.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.horizontalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.lineTo(8.0f, 7.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(4.0f, 13.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(4.0f, 17.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(4.0f, 9.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(8.0f, 13.0f);
        pathBuilderC.horizontalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.lineTo(8.0f, 11.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(8.0f, 17.0f);
        pathBuilderC.horizontalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.lineTo(8.0f, 15.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(7.0f, 8.0f);
        pathBuilderC.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.horizontalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.lineTo(8.0f, 7.0f);
        pathBuilderC.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8639a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

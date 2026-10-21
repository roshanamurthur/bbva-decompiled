package androidx.compose.material.icons.outlined;

import androidx.appcompat.view.menu.b;
import androidx.appcompat.widget.c;
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

/* JADX INFO: compiled from: List.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getList", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "List", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/outlined/ListKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n122#2:110\n116#2,3:111\n119#2,3:115\n132#2,18:118\n152#2:155\n174#3:114\n694#4,2:136\n706#4,2:138\n708#4,11:144\n64#5,4:140\n*S KotlinDebug\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/outlined/ListKt\n*L\n29#1:110\n29#1:111,3\n29#1:115,3\n30#1:118,18\n30#1:155\n29#1:114\n30#1:136,2\n30#1:138,2\n30#1:144,11\n30#1:140,4\n*E\n"})
public final class ListKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8590a;

    @NotNull
    public static final ImageVector getList(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8590a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.List", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        c.c(pathBuilder, 3.0f, 11.0f, 2.0f);
        a.e(pathBuilder, 3.0f, 17.0f, 2.0f, -2.0f);
        c.c(pathBuilder, 3.0f, 15.0f, 2.0f);
        pathBuilder.moveTo(3.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 7.0f);
        c.c(pathBuilder, 3.0f, 7.0f, 2.0f);
        a.e(pathBuilder, 7.0f, 13.0f, 14.0f, -2.0f);
        c.c(pathBuilder, 7.0f, 11.0f, 2.0f);
        a.e(pathBuilder, 7.0f, 17.0f, 14.0f, -2.0f);
        c.c(pathBuilder, 7.0f, 15.0f, 2.0f);
        pathBuilder.moveTo(7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.lineTo(21.0f, 7.0f);
        pathBuilder.lineTo(7.0f, 7.0f);
        pathBuilder.close();
        a.e(pathBuilder, 3.0f, 13.0f, 2.0f, -2.0f);
        c.c(pathBuilder, 3.0f, 11.0f, 2.0f);
        a.e(pathBuilder, 3.0f, 17.0f, 2.0f, -2.0f);
        c.c(pathBuilder, 3.0f, 15.0f, 2.0f);
        pathBuilder.moveTo(3.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 7.0f);
        c.c(pathBuilder, 3.0f, 7.0f, 2.0f);
        a.e(pathBuilder, 7.0f, 13.0f, 14.0f, -2.0f);
        c.c(pathBuilder, 7.0f, 11.0f, 2.0f);
        a.e(pathBuilder, 7.0f, 17.0f, 14.0f, -2.0f);
        c.c(pathBuilder, 7.0f, 15.0f, 2.0f);
        pathBuilder.moveTo(7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, b.d(pathBuilder, 21.0f, 7.0f, 7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8590a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

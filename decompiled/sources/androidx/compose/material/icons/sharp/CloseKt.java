package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: Close.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Sharp;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getClose", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Close", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nClose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Close.kt\nandroidx/compose/material/icons/sharp/CloseKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,51:1\n122#2:52\n116#2,3:53\n119#2,3:57\n132#2,18:60\n152#2:97\n174#3:56\n694#4,2:78\n706#4,2:80\n708#4,11:86\n64#5,4:82\n*S KotlinDebug\n*F\n+ 1 Close.kt\nandroidx/compose/material/icons/sharp/CloseKt\n*L\n29#1:52\n29#1:53,3\n29#1:57,3\n30#1:60,18\n30#1:97\n29#1:56\n30#1:78,2\n30#1:80,2\n30#1:86,11\n30#1:82,4\n*E\n"})
public final class CloseKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8671a;

    @NotNull
    public static final ImageVector getClose(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f8671a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Close", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(19.0f, 6.41f, 17.59f, 5.0f);
        pathBuilderB.lineTo(12.0f, 10.59f);
        pathBuilderB.lineTo(6.41f, 5.0f);
        pathBuilderB.lineTo(5.0f, 6.41f);
        pathBuilderB.lineTo(10.59f, 12.0f);
        pathBuilderB.lineTo(5.0f, 17.59f);
        pathBuilderB.lineTo(6.41f, 19.0f);
        pathBuilderB.lineTo(12.0f, 13.41f);
        pathBuilderB.lineTo(17.59f, 19.0f);
        pathBuilderB.lineTo(19.0f, 17.59f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, androidx.appcompat.view.menu.b.d(pathBuilderB, 13.41f, 12.0f, 19.0f, 6.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8671a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

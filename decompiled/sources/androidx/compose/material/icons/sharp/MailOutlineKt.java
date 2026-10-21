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

/* JADX INFO: compiled from: MailOutline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Sharp;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getMailOutline", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "MailOutline", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMailOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MailOutline.kt\nandroidx/compose/material/icons/sharp/MailOutlineKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,55:1\n122#2:56\n116#2,3:57\n119#2,3:61\n132#2,18:64\n152#2:101\n174#3:60\n694#4,2:82\n706#4,2:84\n708#4,11:90\n64#5,4:86\n*S KotlinDebug\n*F\n+ 1 MailOutline.kt\nandroidx/compose/material/icons/sharp/MailOutlineKt\n*L\n29#1:56\n29#1:57,3\n29#1:61,3\n30#1:64,18\n30#1:101\n29#1:60\n30#1:82,2\n30#1:84,2\n30#1:90,11\n30#1:86,4\n*E\n"})
public final class MailOutlineKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8691a;

    @NotNull
    public static final ImageVector getMailOutline(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f8691a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MailOutline", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(22.0f, 4.0f, 2.01f, 4.0f);
        pathBuilderB.lineTo(2.0f, 20.0f);
        pathBuilderB.horizontalLineToRelative(20.0f);
        pathBuilderB.lineTo(22.0f, 4.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(20.0f, 18.0f);
        pathBuilderB.lineTo(4.0f, 18.0f);
        pathBuilderB.lineTo(4.0f, 8.0f);
        pathBuilderB.lineToRelative(8.0f, 5.0f);
        pathBuilderB.lineToRelative(8.0f, -5.0f);
        pathBuilderB.verticalLineToRelative(10.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(12.0f, 11.0f);
        pathBuilderB.lineTo(4.0f, 6.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.lineToRelative(-8.0f, 5.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8691a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

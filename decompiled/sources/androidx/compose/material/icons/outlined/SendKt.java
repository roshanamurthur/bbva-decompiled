package androidx.compose.material.icons.outlined;

import ad.e;
import androidx.appcompat.view.menu.b;
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

/* JADX INFO: compiled from: Send.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$Outlined;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSend", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Send", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/outlined/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n122#2:54\n116#2,3:55\n119#2,3:59\n132#2,18:62\n152#2:99\n174#3:58\n694#4,2:80\n706#4,2:82\n708#4,11:88\n64#5,4:84\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/outlined/SendKt\n*L\n29#1:54\n29#1:55,3\n29#1:59,3\n30#1:62,18\n30#1:99\n29#1:58\n30#1:80,2\n30#1:82,2\n30#1:88,11\n30#1:84,4\n*E\n"})
public final class SendKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8603a;

    @NotNull
    public static final ImageVector getSend(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f8603a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Send", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw = StrokeCap.INSTANCE.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk8 = StrokeJoin.INSTANCE.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(4.01f, 6.03f, 7.51f, 3.22f);
        pathBuilderC.lineToRelative(-7.52f, -1.0f);
        pathBuilderC.lineToRelative(0.01f, -2.22f);
        pathBuilderC.moveToRelative(7.5f, 8.72f);
        pathBuilderC.lineTo(4.0f, 17.97f);
        pathBuilderC.verticalLineToRelative(-2.22f);
        pathBuilderC.lineToRelative(7.51f, -1.0f);
        pathBuilderC.moveTo(2.01f, 3.0f);
        pathBuilderC.lineTo(2.0f, 10.0f);
        pathBuilderC.lineToRelative(15.0f, 2.0f);
        pathBuilderC.lineToRelative(-15.0f, 2.0f);
        pathBuilderC.lineToRelative(0.01f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, b.d(pathBuilderC, 23.0f, 12.0f, 2.01f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8603a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

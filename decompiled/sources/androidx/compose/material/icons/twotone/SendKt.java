package androidx.compose.material.icons.twotone;

import ad.e;
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
import c2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Send.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSend", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Send", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/twotone/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n122#2:66\n116#2,3:67\n119#2,3:71\n132#2,18:74\n152#2:111\n132#2,18:112\n152#2:149\n174#3:70\n694#4,2:92\n706#4,2:94\n708#4,11:100\n694#4,2:130\n706#4,2:132\n708#4,11:138\n64#5,4:96\n64#5,4:134\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/twotone/SendKt\n*L\n29#1:66\n29#1:67,3\n29#1:71,3\n30#1:74,18\n30#1:111\n40#1:112,18\n40#1:149\n29#1:70\n30#1:92,2\n30#1:94,2\n30#1:100,11\n40#1:130,2\n40#1:132,2\n40#1:138,11\n30#1:96,4\n40#1:134,4\n*E\n"})
public final class SendKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8750a;

    @NotNull
    public static final ImageVector getSend(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f8750a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Send", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(4.0f, 8.25f, 7.51f, 1.0f);
        pathBuilderC.lineToRelative(-7.5f, -3.22f);
        pathBuilderC.close();
        pathBuilderC.moveTo(4.01f, 17.97f);
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, a.d(pathBuilderC, 7.5f, -3.22f, -7.51f, 1.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderB = b.b(2.01f, 3.0f, 2.0f, 10.0f);
        pathBuilderB.lineToRelative(15.0f, 2.0f);
        pathBuilderB.lineToRelative(-15.0f, 2.0f);
        pathBuilderB.lineToRelative(0.01f, 7.0f);
        pathBuilderB.lineTo(23.0f, 12.0f);
        pathBuilderB.lineTo(2.01f, 3.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(4.0f, 8.25f);
        pathBuilderB.lineTo(4.0f, 6.03f);
        pathBuilderB.lineToRelative(7.51f, 3.22f);
        pathBuilderB.lineToRelative(-7.51f, -1.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(4.01f, 17.97f);
        pathBuilderB.verticalLineToRelative(-2.22f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, a.d(pathBuilderB, 7.51f, -1.0f, -7.51f, 3.22f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8750a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

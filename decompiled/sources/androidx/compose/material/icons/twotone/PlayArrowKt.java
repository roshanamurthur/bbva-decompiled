package androidx.compose.material.icons.twotone;

import ad.e;
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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlayArrow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/icons/Icons$TwoTone;", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getPlayArrow", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "PlayArrow", "material-icons-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlayArrow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/twotone/PlayArrowKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n122#2:54\n116#2,3:55\n119#2,3:59\n132#2,18:62\n152#2:99\n132#2,18:100\n152#2:137\n174#3:58\n694#4,2:80\n706#4,2:82\n708#4,11:88\n694#4,2:118\n706#4,2:120\n708#4,11:126\n64#5,4:84\n64#5,4:122\n*S KotlinDebug\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/twotone/PlayArrowKt\n*L\n29#1:54\n29#1:55,3\n29#1:59,3\n30#1:62,18\n30#1:99\n36#1:100,18\n36#1:137\n29#1:58\n30#1:80,2\n30#1:82,2\n30#1:88,11\n36#1:118,2\n36#1:120,2\n36#1:126,11\n30#1:84,4\n36#1:122,4\n*E\n"})
public final class PlayArrowKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static ImageVector f8747a;

    @NotNull
    public static final ImageVector getPlayArrow(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f8747a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PlayArrow", Dp.m4389constructorimpl(24.0f), Dp.m4389constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw = companion2.m2808getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM2818getBevelLxFBmk8 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 8.64f);
        pathBuilder.verticalLineToRelative(6.72f);
        pathBuilder.lineTo(15.27f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m3013addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM2808getButtKaPHkGw, iM2818getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2534getBlack0d7_KjU(), null);
        int iM2808getButtKaPHkGw2 = companion2.m2808getButtKaPHkGw();
        int iM2818getBevelLxFBmk9 = companion3.m2818getBevelLxFBmk8();
        PathBuilder pathBuilderC = e.c(8.0f, 19.0f, 11.0f, -7.0f);
        c.c(pathBuilderC, 8.0f, 5.0f, 14.0f);
        pathBuilderC.moveTo(10.0f, 8.64f);
        pathBuilderC.lineTo(15.27f, 12.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3013addPathoIyEayM$default(builder, b.d(pathBuilderC, 10.0f, 15.36f, 10.0f, 8.64f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM2808getButtKaPHkGw2, iM2818getBevelLxFBmk9, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f8747a = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}

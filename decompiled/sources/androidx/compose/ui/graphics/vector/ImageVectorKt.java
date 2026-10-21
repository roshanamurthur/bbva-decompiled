package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009e\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0089\u0001\u0010$\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "name", "Landroidx/compose/ui/graphics/Brush;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "pathBuilder", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "path", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "block", "group", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,768:1\n64#2,4:769\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n707#1:769,4\n*E\n"})
public final class ImageVectorKt {
    @NotNull
    public static final ImageVector.Builder group(@NotNull ImageVector.Builder builder, @NotNull String name, float f6, float f10, float f11, float f12, float f13, float f14, float f15, @NotNull List<? extends PathNode> clipPathData, @NotNull Function1<? super ImageVector.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f6, f10, f11, f12, f13, f14, f15, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, List list, Function1 block, int i10, Object obj) {
        String name = (i10 & 1) != 0 ? "" : str;
        float f16 = (i10 & 2) != 0 ? 0.0f : f6;
        float f17 = (i10 & 4) != 0 ? 0.0f : f10;
        float f18 = (i10 & 8) != 0 ? 0.0f : f11;
        float f19 = (i10 & 16) != 0 ? 1.0f : f12;
        float f20 = (i10 & 32) == 0 ? f13 : 1.0f;
        float f21 = (i10 & 64) != 0 ? 0.0f : f14;
        float f22 = (i10 & 128) != 0 ? 0.0f : f15;
        List clipPathData = (i10 & 256) != 0 ? VectorKt.getEmptyPath() : list;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f16, f17, f18, f19, f20, f21, f22, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @NotNull
    /* JADX INFO: renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m3015pathR_LF3I(@NotNull ImageVector.Builder path, @NotNull String name, @Nullable Brush brush, float f6, @Nullable Brush brush2, float f10, float f11, int i10, int i11, float f12, int i12, @NotNull Function1<? super PathBuilder, Unit> pathBuilder) {
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m3013addPathoIyEayM$default(path, pathBuilder2.getNodes(), i12, name, brush, f6, brush2, f10, f11, i10, i11, f12, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m3016pathR_LF3I$default(ImageVector.Builder path, String str, Brush brush, float f6, Brush brush2, float f10, float f11, int i10, int i11, float f12, int i12, Function1 pathBuilder, int i13, Object obj) {
        String name = (i13 & 1) != 0 ? "" : str;
        Brush brush3 = (i13 & 2) != 0 ? null : brush;
        float f13 = (i13 & 4) != 0 ? 1.0f : f6;
        Brush brush4 = (i13 & 8) != 0 ? null : brush2;
        float f14 = (i13 & 16) != 0 ? 1.0f : f10;
        float f15 = (i13 & 32) != 0 ? 0.0f : f11;
        int defaultStrokeLineCap = (i13 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i10;
        int defaultStrokeLineJoin = (i13 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i11;
        float f16 = (i13 & 256) != 0 ? 4.0f : f12;
        int defaultFillType = (i13 & 512) != 0 ? VectorKt.getDefaultFillType() : i12;
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m3013addPathoIyEayM$default(path, pathBuilder2.getNodes(), defaultFillType, name, brush3, f13, brush4, f14, f15, defaultStrokeLineCap, defaultStrokeLineJoin, f16, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}

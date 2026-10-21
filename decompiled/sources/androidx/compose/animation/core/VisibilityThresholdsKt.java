package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import bk.q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VisibilityThresholds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\".\u0010\u0007\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\f\u001a\u00020\t*\u00020\b8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\f\u001a\u00020\u000e*\u00020\r8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u000f\"\u0015\u0010\f\u001a\u00020\u0011*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0012\"\u0018\u0010\f\u001a\u00020\u0014*\u00020\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u0015\"\u0018\u0010\f\u001a\u00020\u0017*\u00020\u00168Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u0018\"\u0018\u0010\f\u001a\u00020\u001a*\u00020\u00198Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u001b\"\u0018\u0010\f\u001a\u00020\u001d*\u00020\u001c8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u001e\"\u0015\u0010\f\u001a\u00020 *\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\n\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"", "Landroidx/compose/animation/core/TwoWayConverter;", "", "b", "Ljava/util/Map;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "visibilityThresholdMap", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "getVisibilityThreshold", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "animation-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,114:1\n174#2:115\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:115\n*E\n"})
public final class VisibilityThresholdsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Rect f3210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<TwoWayConverter<?, ?>, Float> f3211b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f3210a = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        Float fValueOf2 = Float.valueOf(1.0f);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(Dp.INSTANCE);
        Float fValueOf3 = Float.valueOf(0.1f);
        f3211b = q.mapOf(TuplesKt.to(vectorConverter, fValueOf2), TuplesKt.to(VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), fValueOf2), TuplesKt.to(VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), fValueOf2), TuplesKt.to(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(0.01f)), TuplesKt.to(VectorConvertersKt.getVectorConverter(Rect.INSTANCE), fValueOf), TuplesKt.to(VectorConvertersKt.getVectorConverter(Size.INSTANCE), fValueOf), TuplesKt.to(VectorConvertersKt.getVectorConverter(Offset.INSTANCE), fValueOf), TuplesKt.to(vectorConverter2, fValueOf3), TuplesKt.to(VectorConvertersKt.getVectorConverter(DpOffset.INSTANCE), fValueOf3));
    }

    public static final int getVisibilityThreshold(@NotNull IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return 1;
    }

    @NotNull
    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return f3211b;
    }

    public static final long getVisibilityThreshold(@NotNull IntOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntOffsetKt.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(@NotNull Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@NotNull DpOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Dp.Companion companion2 = Dp.INSTANCE;
        return DpKt.m4410DpOffsetYgX7TsA(getVisibilityThreshold(companion2), getVisibilityThreshold(companion2));
    }

    public static final long getVisibilityThreshold(@NotNull Size.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@NotNull IntSize.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntSizeKt.IntSize(1, 1);
    }

    @NotNull
    public static final Rect getVisibilityThreshold(@NotNull Rect.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f3210a;
    }

    public static final float getVisibilityThreshold(@NotNull Dp.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return Dp.m4389constructorimpl(0.1f);
    }
}

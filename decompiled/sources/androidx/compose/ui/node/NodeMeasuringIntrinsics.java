package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ/\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ/\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u000b¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics;", "", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "measureBlock", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "intrinsicMeasurable", "", "h", "minWidth$ui_release", "(Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minWidth", "w", "minHeight$ui_release", "minHeight", "maxWidth$ui_release", "maxWidth", "maxHeight$ui_release", "maxHeight", "<init>", "()V", "a", "b", "c", "d", "MeasureBlock", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class NodeMeasuringIntrinsics {

    @NotNull
    public static final NodeMeasuringIntrinsics INSTANCE = new NodeMeasuringIntrinsics();

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface MeasureBlock {
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        MeasureResult mo3580measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j10);
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class a implements Measurable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final IntrinsicMeasurable f16912p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final c f16913q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final d f16914r0;

        public a(@NotNull IntrinsicMeasurable measurable, @NotNull c minMax, @NotNull d widthHeight) {
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            Intrinsics.checkNotNullParameter(minMax, "minMax");
            Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
            this.f16912p0 = measurable;
            this.f16913q0 = minMax;
            this.f16914r0 = widthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        @Nullable
        public final Object getParentData() {
            return this.f16912p0.getParentData();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int i10) {
            return this.f16912p0.maxIntrinsicHeight(i10);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int i10) {
            return this.f16912p0.maxIntrinsicWidth(i10);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @NotNull
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public final Placeable mo3575measureBRTryo0(long j10) {
            d dVar = this.f16914r0;
            d dVar2 = d.Width;
            c cVar = this.f16913q0;
            IntrinsicMeasurable intrinsicMeasurable = this.f16912p0;
            if (dVar == dVar2) {
                return new b(cVar == c.Max ? intrinsicMeasurable.maxIntrinsicWidth(Constraints.m4356getMaxHeightimpl(j10)) : intrinsicMeasurable.minIntrinsicWidth(Constraints.m4356getMaxHeightimpl(j10)), Constraints.m4356getMaxHeightimpl(j10));
            }
            return new b(Constraints.m4357getMaxWidthimpl(j10), cVar == c.Max ? intrinsicMeasurable.maxIntrinsicHeight(Constraints.m4357getMaxWidthimpl(j10)) : intrinsicMeasurable.minIntrinsicHeight(Constraints.m4357getMaxWidthimpl(j10)));
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int i10) {
            return this.f16912p0.minIntrinsicHeight(i10);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int i10) {
            return this.f16912p0.minIntrinsicWidth(i10);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c Max;
        public static final c Min;

        static {
            c cVar = new c("Min", 0);
            Min = cVar;
            c cVar2 = new c("Max", 1);
            Max = cVar2;
            $VALUES = new c[]{cVar, cVar2};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d Height;
        public static final d Width;

        static {
            d dVar = new d("Width", 0);
            Width = dVar;
            d dVar2 = new d("Height", 1);
            Height = dVar2;
            $VALUES = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public final int maxHeight$ui_release(@NotNull MeasureBlock measureBlock, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int w6) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return measureBlock.mo3580measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Height), ConstraintsKt.Constraints$default(0, w6, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth$ui_release(@NotNull MeasureBlock measureBlock, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int h4) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return measureBlock.mo3580measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Width), ConstraintsKt.Constraints$default(0, 0, 0, h4, 7, null)).getWidth();
    }

    public final int minHeight$ui_release(@NotNull MeasureBlock measureBlock, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int w6) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return measureBlock.mo3580measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Height), ConstraintsKt.Constraints$default(0, w6, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth$ui_release(@NotNull MeasureBlock measureBlock, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int h4) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return measureBlock.mo3580measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Width), ConstraintsKt.Constraints$default(0, 0, 0, h4, 7, null)).getWidth();
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class b extends Placeable {
        public b(int i10, int i11) {
            m3609setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i10, i11));
        }

        @Override // androidx.compose.ui.layout.Measured
        public final int get(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno */
        public final void mo3579placeAtf8xVGno(long j10, float f6, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        }
    }
}

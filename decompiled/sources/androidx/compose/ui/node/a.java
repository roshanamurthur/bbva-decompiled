package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class C0063a implements NodeMeasuringIntrinsics.MeasureBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LayoutModifierNode f16940a;

        public C0063a(LayoutModifierNode layoutModifierNode) {
            this.f16940a = layoutModifierNode;
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo3580measure3p2s80s(@NotNull MeasureScope maxHeight, @NotNull Measurable intrinsicMeasurable, long j10) {
            Intrinsics.checkNotNullParameter(maxHeight, "$this$maxHeight");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return this.f16940a.mo172measure3p2s80s(maxHeight, intrinsicMeasurable, j10);
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class b implements NodeMeasuringIntrinsics.MeasureBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LayoutModifierNode f16941a;

        public b(LayoutModifierNode layoutModifierNode) {
            this.f16941a = layoutModifierNode;
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo3580measure3p2s80s(@NotNull MeasureScope maxWidth, @NotNull Measurable intrinsicMeasurable, long j10) {
            Intrinsics.checkNotNullParameter(maxWidth, "$this$maxWidth");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return this.f16941a.mo172measure3p2s80s(maxWidth, intrinsicMeasurable, j10);
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class c implements NodeMeasuringIntrinsics.MeasureBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LayoutModifierNode f16942a;

        public c(LayoutModifierNode layoutModifierNode) {
            this.f16942a = layoutModifierNode;
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo3580measure3p2s80s(@NotNull MeasureScope minHeight, @NotNull Measurable intrinsicMeasurable, long j10) {
            Intrinsics.checkNotNullParameter(minHeight, "$this$minHeight");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return this.f16942a.mo172measure3p2s80s(minHeight, intrinsicMeasurable, j10);
        }
    }

    /* JADX INFO: compiled from: LayoutModifierNode.kt */
    public static final class d implements NodeMeasuringIntrinsics.MeasureBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LayoutModifierNode f16943a;

        public d(LayoutModifierNode layoutModifierNode) {
            this.f16943a = layoutModifierNode;
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo3580measure3p2s80s(@NotNull MeasureScope minWidth, @NotNull Measurable intrinsicMeasurable, long j10) {
            Intrinsics.checkNotNullParameter(minWidth, "$this$minWidth");
            Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
            return this.f16943a.mo172measure3p2s80s(minWidth, intrinsicMeasurable, j10);
        }
    }

    public static int a(LayoutModifierNode layoutModifierNode, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new C0063a(layoutModifierNode), intrinsicMeasureScope, measurable, i10);
    }

    public static int b(LayoutModifierNode layoutModifierNode, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new b(layoutModifierNode), intrinsicMeasureScope, measurable, i10);
    }

    public static int c(LayoutModifierNode layoutModifierNode, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new c(layoutModifierNode), intrinsicMeasureScope, measurable, i10);
    }

    public static int d(LayoutModifierNode layoutModifierNode, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new d(layoutModifierNode), intrinsicMeasureScope, measurable, i10);
    }
}

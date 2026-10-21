package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import bk.q;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", PluginUtils.IDENTIFIER_LAYOUT, "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MeasureScope extends IntrinsicMeasureScope {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.MeasureScope$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: MeasureScope.kt */
    public final /* synthetic */ class CC {
        @NotNull
        public static MeasureResult a(MeasureScope measureScope, int i10, int i11, @NotNull Map alignmentLines, @NotNull Function1 placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return new MeasureResult(measureScope, i10, i11, alignmentLines, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public final int width;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public final int height;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                @NotNull
                public final Map<AlignmentLine, Integer> alignmentLines;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f16632d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MeasureScope f16633e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function1<Placeable.PlacementScope, Unit> f16634f;

                {
                    this.f16632d = i10;
                    this.f16634f = placementBlock;
                    this.width = i10;
                    this.height = i11;
                    this.alignmentLines = alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                @NotNull
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                    MeasureScope measureScope2 = this.f16633e;
                    LayoutDirection layoutDirection = measureScope2.getLayoutDirection();
                    LookaheadCapablePlaceable lookaheadCapablePlaceable = measureScope2 instanceof LookaheadCapablePlaceable ? (LookaheadCapablePlaceable) measureScope2 : null;
                    LayoutCoordinates layoutCoordinates = Placeable.PlacementScope.f16651c;
                    int parentWidth = companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.f16652d;
                    Placeable.PlacementScope.f16650b = this.f16632d;
                    Placeable.PlacementScope.f16649a = layoutDirection;
                    boolean zAccess$configureForPlacingForAlignment = Placeable.PlacementScope.Companion.access$configureForPlacingForAlignment(companion, lookaheadCapablePlaceable);
                    this.f16634f.invoke(companion);
                    if (lookaheadCapablePlaceable != null) {
                        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(zAccess$configureForPlacingForAlignment);
                    }
                    Placeable.PlacementScope.f16650b = parentWidth;
                    Placeable.PlacementScope.f16649a = parentLayoutDirection;
                    Placeable.PlacementScope.f16651c = layoutCoordinates;
                    Placeable.PlacementScope.f16652d = layoutNodeLayoutDelegate;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasureResult q(MeasureScope measureScope, int i10, int i11, Map map, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
            }
            if ((i12 & 4) != 0) {
                map = q.emptyMap();
            }
            return measureScope.layout(i10, i11, map, function1);
        }
    }

    /* JADX INFO: compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @ExperimentalComposeUiApi
        @Deprecated
        public static boolean isLookingAhead(@NotNull MeasureScope measureScope) {
            return g1.c.a(measureScope);
        }

        @Deprecated
        @NotNull
        public static MeasureResult layout(@NotNull MeasureScope measureScope, int i10, int i11, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return CC.a(measureScope, i10, i11, alignmentLines, placementBlock);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m3591roundToPxR2X_6o(@NotNull MeasureScope measureScope, long j10) {
            return x1.a.a(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m3592roundToPx0680j_4(@NotNull MeasureScope measureScope, float f6) {
            return x1.a.b(measureScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m3593toDpGaN1DYA(@NotNull MeasureScope measureScope, long j10) {
            return x1.a.c(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3594toDpu2uoSUM(@NotNull MeasureScope measureScope, float f6) {
            return x1.a.d(measureScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m3596toDpSizekrfVVM(@NotNull MeasureScope measureScope, long j10) {
            return x1.a.f(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m3597toPxR2X_6o(@NotNull MeasureScope measureScope, long j10) {
            return x1.a.g(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m3598toPx0680j_4(@NotNull MeasureScope measureScope, float f6) {
            return x1.a.h(measureScope, f6);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull MeasureScope measureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return x1.a.i(measureScope, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m3599toSizeXkaWNTQ(@NotNull MeasureScope measureScope, long j10) {
            return x1.a.j(measureScope, j10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m3600toSp0xMU5do(@NotNull MeasureScope measureScope, float f6) {
            return x1.a.k(measureScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3601toSpkPz2Gy4(@NotNull MeasureScope measureScope, float f6) {
            return x1.a.l(measureScope, f6);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m3595toDpu2uoSUM(@NotNull MeasureScope measureScope, int i10) {
            return x1.a.e(measureScope, i10);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m3602toSpkPz2Gy4(@NotNull MeasureScope measureScope, int i10) {
            return x1.a.m(measureScope, i10);
        }
    }

    @NotNull
    MeasureResult layout(int width, int height, @NotNull Map<AlignmentLine, Integer> alignmentLines, @NotNull Function1<? super Placeable.PlacementScope, Unit> placementBlock);
}

package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0000\u001a!\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0018H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getCurrentSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "merge", "lhs", "rhs", "containsInclusive", "", "Landroidx/compose/ui/geometry/Rect;", TypedValues.CycleType.S_WAVE_OFFSET, "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "visibleBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SelectionManagerKt {

    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long a(SelectionManager selectionManager, long j10, Selection.AnchorInfo anchorInfo, boolean z10) {
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (!z10) {
            offset--;
        }
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        Offset offsetM625getCurrentDragPosition_m7T9E = selectionManager.m625getCurrentDragPosition_m7T9E();
        Intrinsics.checkNotNull(offsetM625getCurrentDragPosition_m7T9E);
        float fM2275getXimpl = Offset.m2275getXimpl(layoutCoordinates.mo3582localPositionOfR5De75A(containerLayoutCoordinates, offsetM625getCurrentDragPosition_m7T9E.getF15533a()));
        long jMo603getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo603getRangeOfLineContainingjx7JFs(offset);
        Rect boundingBox = anchorSelectable$foundation_release.getBoundingBox(TextRange.m3965getMinimpl(jMo603getRangeOfLineContainingjx7JFs));
        Rect boundingBox2 = anchorSelectable$foundation_release.getBoundingBox(kotlin.ranges.c.coerceAtLeast(TextRange.m3964getMaximpl(jMo603getRangeOfLineContainingjx7JFs) - 1, TextRange.m3965getMinimpl(jMo603getRangeOfLineContainingjx7JFs)));
        float fCoerceIn = kotlin.ranges.c.coerceIn(fM2275getXimpl, Math.min(boundingBox.getLeft(), boundingBox2.getLeft()), Math.max(boundingBox.getRight(), boundingBox2.getRight()));
        return Math.abs(fM2275getXimpl - fCoerceIn) > ((float) (IntSize.m4549getWidthimpl(j10) / 2)) ? Offset.INSTANCE.m2290getUnspecifiedF1C5BW0() : containerLayoutCoordinates.mo3582localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(fCoerceIn, Offset.m2276getYimpl(anchorSelectable$foundation_release.getBoundingBox(offset).m2305getCenterF1C5BW0())));
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m632calculateSelectionMagnifierCenterAndroidO0kMr_c(@NotNull SelectionManager manager, long j10) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Selection selection = manager.getSelection();
        if (selection == null) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = manager.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return Offset.INSTANCE.m2290getUnspecifiedF1C5BW0();
        }
        if (i10 == 1) {
            return a(manager, j10, selection.getStart(), true);
        }
        if (i10 == 2) {
            return a(manager, j10, selection.getEnd(), false);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m633containsInclusiveUv8p0NA(@NotNull Rect containsInclusive, long j10) {
        Intrinsics.checkNotNullParameter(containsInclusive, "$this$containsInclusive");
        float left = containsInclusive.getLeft();
        float right = containsInclusive.getRight();
        float fM2275getXimpl = Offset.m2275getXimpl(j10);
        if (left <= fM2275getXimpl && fM2275getXimpl <= right) {
            float top = containsInclusive.getTop();
            float bottom = containsInclusive.getBottom();
            float fM2276getYimpl = Offset.m2276getYimpl(j10);
            if (top <= fM2276getYimpl && fM2276getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final AnnotatedString getCurrentSelectedText(@NotNull Selectable selectable, @NotNull Selection selection) {
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        Intrinsics.checkNotNullParameter(selection, "selection");
        AnnotatedString text = selectable.getText();
        if (selectable.getSelectableId() != selection.getStart().getSelectableId() && selectable.getSelectableId() != selection.getEnd().getSelectableId()) {
            return text;
        }
        if (selectable.getSelectableId() == selection.getStart().getSelectableId() && selectable.getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset());
        }
        if (selectable.getSelectableId() == selection.getStart().getSelectableId()) {
            return selection.getHandlesCrossed() ? text.subSequence(0, selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), text.length());
        }
        return selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), text.length()) : text.subSequence(0, selection.getEnd().getOffset());
    }

    @Nullable
    public static final Selection merge(@Nullable Selection selection, @Nullable Selection selection2) {
        Selection selectionMerge;
        return (selection == null || (selectionMerge = selection.merge(selection2)) == null) ? selection2 : selectionMerge;
    }

    @NotNull
    public static final Rect visibleBounds(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m2313Rect0a9Yr6o(layoutCoordinates.mo3586windowToLocalMKHz9U(rectBoundsInWindow.m2310getTopLeftF1C5BW0()), layoutCoordinates.mo3586windowToLocalMKHz9U(rectBoundsInWindow.m2304getBottomRightF1C5BW0()));
    }
}

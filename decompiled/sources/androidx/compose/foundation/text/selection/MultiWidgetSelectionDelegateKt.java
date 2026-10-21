package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001ak\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Offset;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "", "selectableId", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "", "isStartHandle", "Lkotlin/Pair;", "getTextSelectionInfo-yM0VcXU", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/geometry/Offset;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Lkotlin/Pair;", "getTextSelectionInfo", "Landroidx/compose/ui/geometry/Rect;", "bounds", "position", "", "getOffsetForPosition-0AR0LA0", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;J)I", "getOffsetForPosition", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class MultiWidgetSelectionDelegateKt {
    public static final Selection a(long j10, boolean z10, long j11, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m3967getStartimpl(j10)), TextRange.m3967getStartimpl(j10), j11), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m3962getEndimpl(j10) - 1, 0)), TextRange.m3962getEndimpl(j10), j11), z10);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-0AR0LA0, reason: not valid java name */
    public static final int m606getOffsetForPosition0AR0LA0(@NotNull TextLayoutResult textLayoutResult, @NotNull Rect bounds, long j10) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (bounds.m2301containsk4lQ0M(j10)) {
            return kotlin.ranges.c.coerceIn(textLayoutResult.m3940getOffsetForPositionk4lQ0M(j10), 0, length);
        }
        if (SelectionMode.Vertical.mo635compare3MmeM6k$foundation_release(j10, bounds) < 0) {
            return 0;
        }
        return length;
    }

    @NotNull
    /* JADX INFO: renamed from: getTextSelectionInfo-yM0VcXU, reason: not valid java name */
    public static final Pair<Selection, Boolean> m607getTextSelectionInfoyM0VcXU(@NotNull TextLayoutResult textLayoutResult, long j10, long j11, @Nullable Offset offset, long j12, @NotNull SelectionAdjustment adjustment, @Nullable Selection selection, boolean z10) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m4549getWidthimpl(textLayoutResult.getSize()), IntSize.m4548getHeightimpl(textLayoutResult.getSize()));
        if (!SelectionMode.Vertical.m636isSelected2x9bVx0$foundation_release(rect, j10, j11)) {
            return new Pair<>(null, Boolean.FALSE);
        }
        int iM606getOffsetForPosition0AR0LA0 = m606getOffsetForPosition0AR0LA0(textLayoutResult, rect, j10);
        int iM606getOffsetForPosition0AR0LA1 = m606getOffsetForPosition0AR0LA0(textLayoutResult, rect, j11);
        int iM606getOffsetForPosition0AR0LA2 = offset != null ? m606getOffsetForPosition0AR0LA0(textLayoutResult, rect, offset.getF15533a()) : -1;
        long jMo610adjustZXO7KMw = adjustment.mo610adjustZXO7KMw(textLayoutResult, TextRangeKt.TextRange(iM606getOffsetForPosition0AR0LA0, iM606getOffsetForPosition0AR0LA1), iM606getOffsetForPosition0AR0LA2, z10, selection != null ? TextRange.m3955boximpl(selection.m609toTextRanged9O1mEE()) : null);
        Selection selectionA = a(jMo610adjustZXO7KMw, TextRange.m3966getReversedimpl(jMo610adjustZXO7KMw), j12, textLayoutResult);
        boolean z11 = true;
        boolean z12 = !Intrinsics.areEqual(selectionA, selection);
        if (!z10 ? iM606getOffsetForPosition0AR0LA1 == iM606getOffsetForPosition0AR0LA2 : iM606getOffsetForPosition0AR0LA0 == iM606getOffsetForPosition0AR0LA2) {
            if (!z12) {
                z11 = false;
            }
        }
        return new Pair<>(selectionA, Boolean.valueOf(z11));
    }
}

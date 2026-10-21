package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import f0.c;
import f0.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0})
public final class SelectionControllerKt {
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1, java.lang.Object] */
    public static final Modifier access$makeSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j10, final Function0 function0, final Function0 function1, boolean z10) {
        if (z10) {
            ?? r12 = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                public long lastPosition;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                public long dragTotalDistance;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    Offset.Companion companion = Offset.INSTANCE;
                    this.lastPosition = companion.m2291getZeroF1C5BW0();
                    this.dragTotalDistance = companion.m2291getZeroF1C5BW0();
                }

                public final long getDragTotalDistance() {
                    return this.dragTotalDistance;
                }

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onCancel() {
                    long j11 = j10;
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar2, j11)) {
                        selectionRegistrar2.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* JADX INFO: renamed from: onDrag-k-4lQ0M */
                public void mo539onDragk4lQ0M(long delta) {
                    LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                    if (layoutCoordinatesInvoke != null) {
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        if (layoutCoordinatesInvoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10)) {
                            long jM2280plusMKHz9U = Offset.m2280plusMKHz9U(this.dragTotalDistance, delta);
                            this.dragTotalDistance = jM2280plusMKHz9U;
                            long jM2280plusMKHz9U2 = Offset.m2280plusMKHz9U(this.lastPosition, jM2280plusMKHz9U);
                            if (SelectionControllerKt.m588access$outOfBoundary2x9bVx0(function1.invoke(), this.lastPosition, jM2280plusMKHz9U2) || !selectionRegistrar2.mo637notifySelectionUpdate5iVPX68(layoutCoordinatesInvoke, jM2280plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                                return;
                            }
                            this.lastPosition = jM2280plusMKHz9U2;
                            this.dragTotalDistance = Offset.INSTANCE.m2291getZeroF1C5BW0();
                        }
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* JADX INFO: renamed from: onStart-k-4lQ0M */
                public void mo540onStartk4lQ0M(long startPoint) {
                    LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                    long j11 = j10;
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (layoutCoordinatesInvoke != null) {
                        if (!layoutCoordinatesInvoke.isAttached()) {
                            return;
                        }
                        if (SelectionControllerKt.m588access$outOfBoundary2x9bVx0(function1.invoke(), startPoint, startPoint)) {
                            selectionRegistrar2.notifySelectionUpdateSelectAll(j11);
                        } else {
                            selectionRegistrar2.mo638notifySelectionUpdateStartd4ec7I(layoutCoordinatesInvoke, startPoint, SelectionAdjustment.INSTANCE.getWord());
                        }
                        this.lastPosition = startPoint;
                    }
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar2, j11)) {
                        this.dragTotalDistance = Offset.INSTANCE.m2291getZeroF1C5BW0();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onStop() {
                    long j11 = j10;
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar2, j11)) {
                        selectionRegistrar2.notifySelectionUpdateEnd();
                    }
                }

                public final void setDragTotalDistance(long j11) {
                    this.dragTotalDistance = j11;
                }

                public final void setLastPosition(long j11) {
                    this.lastPosition = j11;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onUp() {
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* JADX INFO: renamed from: onDown-k-4lQ0M */
                public void mo538onDownk4lQ0M(long point) {
                }
            };
            return SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, (Object) r12, new c(r12, null));
        }
        ?? r11 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public long lastPosition = Offset.INSTANCE.m2291getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onDrag-3MmeM6k, reason: not valid java name */
            public boolean mo589onDrag3MmeM6k(long dragPosition, @NotNull SelectionAdjustment adjustment) {
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!layoutCoordinatesInvoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10)) {
                    return false;
                }
                if (!selectionRegistrar2.mo637notifySelectionUpdate5iVPX68(layoutCoordinatesInvoke, dragPosition, this.lastPosition, false, adjustment)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtend-k-4lQ0M, reason: not valid java name */
            public boolean mo590onExtendk4lQ0M(long downPosition) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!layoutCoordinatesInvoke.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo637notifySelectionUpdate5iVPX68(layoutCoordinatesInvoke, downPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone())) {
                    this.lastPosition = downPosition;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
            public boolean mo591onExtendDragk4lQ0M(long dragPosition) {
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                if (!layoutCoordinatesInvoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10)) {
                    return false;
                }
                if (!selectionRegistrar2.mo637notifySelectionUpdate5iVPX68(layoutCoordinatesInvoke, dragPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone())) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onStart-3MmeM6k, reason: not valid java name */
            public boolean mo592onStart3MmeM6k(long downPosition, @NotNull SelectionAdjustment adjustment) {
                Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                LayoutCoordinates layoutCoordinatesInvoke = function0.invoke();
                if (layoutCoordinatesInvoke == null || !layoutCoordinatesInvoke.isAttached()) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                selectionRegistrar2.mo638notifySelectionUpdateStartd4ec7I(layoutCoordinatesInvoke, downPosition, adjustment);
                this.lastPosition = downPosition;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10);
            }

            public final void setLastPosition(long j11) {
                this.lastPosition = j11;
            }
        };
        return PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, (Object) r11, new d(r11, null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    /* JADX INFO: renamed from: access$outOfBoundary-2x9bVx0, reason: not valid java name */
    public static final boolean m588access$outOfBoundary2x9bVx0(TextLayoutResult textLayoutResult, long j10, long j11) {
        if (textLayoutResult == null) {
            return false;
        }
        int length = textLayoutResult.getLayoutInput().getText().getText().length();
        int iM3940getOffsetForPositionk4lQ0M = textLayoutResult.m3940getOffsetForPositionk4lQ0M(j10);
        int iM3940getOffsetForPositionk4lQ0M2 = textLayoutResult.m3940getOffsetForPositionk4lQ0M(j11);
        int i10 = length - 1;
        return (iM3940getOffsetForPositionk4lQ0M >= i10 && iM3940getOffsetForPositionk4lQ0M2 >= i10) || (iM3940getOffsetForPositionk4lQ0M < 0 && iM3940getOffsetForPositionk4lQ0M2 < 0);
    }
}

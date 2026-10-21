package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0007\u001a\f\u0010\u0010\u001a\u00020\u000e*\u00020\u0000H\u0007\u001a\f\u0010\u0011\u001a\u00020\u000e*\u00020\u0000H\u0007\u001a!\u0010\u0016\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "changedToDown", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "positionChanged", "positionChangedIgnoreConsumed", "Landroidx/compose/ui/geometry/Offset;", "positionChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeIgnoreConsumed", "positionChangeConsumed", "anyChangeConsumed", "", "consumeDownChange", "consumePositionChange", "consumeAllChanges", "Landroidx/compose/ui/unit/IntSize;", "size", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "isOutOfBounds", "Landroidx/compose/ui/geometry/Size;", "extendedTouchPadding", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class PointerEventKt {
    public static final long a(PointerInputChange pointerInputChange, boolean z10) {
        long jM2279minusMKHz9U = Offset.m2279minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition());
        return (z10 || !pointerInputChange.isConsumed()) ? jM2279minusMKHz9U : Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @Deprecated(message = "Use consume() instead", replaceWith = @ReplaceWith(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        pointerInputChange.consume();
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @ReplaceWith(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        if (Offset.m2272equalsimpl0(positionChange(pointerInputChange), Offset.INSTANCE.m2291getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    @Deprecated(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* JADX INFO: renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m3424isOutOfBoundsO0kMr_c(@NotNull PointerInputChange isOutOfBounds, long j10) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        long position = isOutOfBounds.getPosition();
        float fM2275getXimpl = Offset.m2275getXimpl(position);
        float fM2276getYimpl = Offset.m2276getYimpl(position);
        return fM2275getXimpl < 0.0f || fM2275getXimpl > ((float) IntSize.m4549getWidthimpl(j10)) || fM2276getYimpl < 0.0f || fM2276getYimpl > ((float) IntSize.m4548getHeightimpl(j10));
    }

    /* JADX INFO: renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m3425isOutOfBoundsjwHxaWs(@NotNull PointerInputChange isOutOfBounds, long j10, long j11) {
        Intrinsics.checkNotNullParameter(isOutOfBounds, "$this$isOutOfBounds");
        if (!PointerType.m3532equalsimpl0(isOutOfBounds.getType(), PointerType.INSTANCE.m3539getTouchT8wyACA())) {
            return m3424isOutOfBoundsO0kMr_c(isOutOfBounds, j10);
        }
        long position = isOutOfBounds.getPosition();
        float fM2275getXimpl = Offset.m2275getXimpl(position);
        float fM2276getYimpl = Offset.m2276getYimpl(position);
        return fM2275getXimpl < (-Size.m2344getWidthimpl(j11)) || fM2275getXimpl > Size.m2344getWidthimpl(j11) + ((float) IntSize.m4549getWidthimpl(j10)) || fM2276getYimpl < (-Size.m2341getHeightimpl(j11)) || fM2276getYimpl > Size.m2341getHeightimpl(j11) + ((float) IntSize.m4548getHeightimpl(j10));
    }

    public static final long positionChange(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return a(pointerInputChange, false);
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return a(pointerInputChange, true);
    }

    public static final boolean positionChanged(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !Offset.m2272equalsimpl0(a(pointerInputChange, false), Offset.INSTANCE.m2291getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@NotNull PointerInputChange pointerInputChange) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<this>");
        return !Offset.m2272equalsimpl0(a(pointerInputChange, true), Offset.INSTANCE.m2291getZeroF1C5BW0());
    }
}

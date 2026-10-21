package androidx.compose.ui.unit;

import androidx.collection.g;
import androidx.collection.k;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.ranges.c;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\u001a:\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\f*\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a!\u0010\u0012\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a!\u0010\u0019\u001a\u00020\u0016*\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001e\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"", "minWidth", "maxWidth", "minHeight", "maxHeight", "Landroidx/compose/ui/unit/Constraints;", androidx.constraintlayout.widget.Constraints.TAG, "(IIII)J", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "constrain", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "width", "constrainWidth-K40F9xA", "(JI)I", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "isSatisfiedBy", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", TypedValues.CycleType.S_WAVE_OFFSET, "ui-unit_release"}, k = 2, mv = {1, 8, 0})
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i10, int i11, int i12, int i13) {
        if (i11 < i10) {
            throw new IllegalArgumentException(g.b("maxWidth(", i11, ") must be >= than minWidth(", i10, RootService.CLOSE_BRACKET).toString());
        }
        if (i13 < i12) {
            throw new IllegalArgumentException(g.b("maxHeight(", i13, ") must be >= than minHeight(", i12, RootService.CLOSE_BRACKET).toString());
        }
        if (i10 < 0 || i12 < 0) {
            throw new IllegalArgumentException(k.c("minWidth(", i10, ") and minHeight(", i12, ") must be >= 0").toString());
        }
        return Constraints.INSTANCE.m4364createConstraintsZbe2FdA$ui_unit_release(i10, i11, i12, i13);
    }

    public static /* synthetic */ long Constraints$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return Constraints(i10, i11, i12, i13);
    }

    @Stable
    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m4368constrain4WqzIAM(long j10, long j11) {
        return IntSizeKt.IntSize(c.coerceIn(IntSize.m4549getWidthimpl(j11), Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(j10)), c.coerceIn(IntSize.m4548getHeightimpl(j11), Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(j10)));
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m4369constrainN9IONVI(long j10, long j11) {
        return Constraints(c.coerceIn(Constraints.m4359getMinWidthimpl(j11), Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(j10)), c.coerceIn(Constraints.m4357getMaxWidthimpl(j11), Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(j10)), c.coerceIn(Constraints.m4358getMinHeightimpl(j11), Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(j10)), c.coerceIn(Constraints.m4356getMaxHeightimpl(j11), Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(j10)));
    }

    @Stable
    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m4370constrainHeightK40F9xA(long j10, int i10) {
        return c.coerceIn(i10, Constraints.m4358getMinHeightimpl(j10), Constraints.m4356getMaxHeightimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m4371constrainWidthK40F9xA(long j10, int i10) {
        return c.coerceIn(i10, Constraints.m4359getMinWidthimpl(j10), Constraints.m4357getMaxWidthimpl(j10));
    }

    @Stable
    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m4372isSatisfiedBy4WqzIAM(long j10, long j11) {
        int iM4359getMinWidthimpl = Constraints.m4359getMinWidthimpl(j10);
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10);
        int iM4549getWidthimpl = IntSize.m4549getWidthimpl(j11);
        if (iM4359getMinWidthimpl <= iM4549getWidthimpl && iM4549getWidthimpl <= iM4357getMaxWidthimpl) {
            int iM4358getMinHeightimpl = Constraints.m4358getMinHeightimpl(j10);
            int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
            int iM4548getHeightimpl = IntSize.m4548getHeightimpl(j11);
            if (iM4358getMinHeightimpl <= iM4548getHeightimpl && iM4548getHeightimpl <= iM4356getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m4373offsetNN6EwU(long j10, int i10, int i11) {
        int iCoerceAtLeast = c.coerceAtLeast(Constraints.m4359getMinWidthimpl(j10) + i10, 0);
        int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(j10);
        if (iM4357getMaxWidthimpl != Integer.MAX_VALUE) {
            iM4357getMaxWidthimpl = c.coerceAtLeast(iM4357getMaxWidthimpl + i10, 0);
        }
        int iCoerceAtLeast2 = c.coerceAtLeast(Constraints.m4358getMinHeightimpl(j10) + i11, 0);
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
        if (iM4356getMaxHeightimpl != Integer.MAX_VALUE) {
            iM4356getMaxHeightimpl = c.coerceAtLeast(iM4356getMaxHeightimpl + i11, 0);
        }
        return Constraints(iCoerceAtLeast, iM4357getMaxWidthimpl, iCoerceAtLeast2, iM4356getMaxHeightimpl);
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m4374offsetNN6EwU$default(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m4373offsetNN6EwU(j10, i10, i11);
    }
}

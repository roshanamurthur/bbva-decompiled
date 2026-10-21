package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.ranges.c;

/* JADX INFO: compiled from: LayoutUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LayoutUtilsKt {
    /* JADX INFO: renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m574finalConstraintstfFHcEY(long j10, boolean z10, int i10, float f6) {
        return ConstraintsKt.Constraints$default(0, m576finalMaxWidthtfFHcEY(j10, z10, i10, f6), 0, Constraints.m4356getMaxHeightimpl(j10), 5, null);
    }

    /* JADX INFO: renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m575finalMaxLinesxdlQI24(boolean z10, int i10, int i11) {
        if (z10 || !TextOverflow.m4336equalsimpl0(i10, TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8())) {
            return c.coerceAtLeast(i11, 1);
        }
        return 1;
    }

    /* JADX INFO: renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m576finalMaxWidthtfFHcEY(long j10, boolean z10, int i10, float f6) {
        int iM4357getMaxWidthimpl = ((z10 || TextOverflow.m4336equalsimpl0(i10, TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8())) && Constraints.m4353getHasBoundedWidthimpl(j10)) ? Constraints.m4357getMaxWidthimpl(j10) : Integer.MAX_VALUE;
        return Constraints.m4359getMinWidthimpl(j10) == iM4357getMaxWidthimpl ? iM4357getMaxWidthimpl : c.coerceIn(TextDelegateKt.ceilToIntPx(f6), Constraints.m4359getMinWidthimpl(j10), iM4357getMaxWidthimpl);
    }
}

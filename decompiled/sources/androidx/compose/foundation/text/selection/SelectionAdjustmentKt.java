package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"ensureAtLeastOneChar", "Landroidx/compose/ui/text/TextRange;", "text", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "lastOffset", "isStartHandle", "", "previousHandlesCrossed", "(Ljava/lang/String;IIZZ)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SelectionAdjustmentKt {
    public static final long ensureAtLeastOneChar(@NotNull String text, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (i11 == 0) {
            return TextRangeKt.TextRange(i10, i10);
        }
        if (i10 == 0) {
            return z10 ? TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(text, 0), 0) : TextRangeKt.TextRange(0, StringHelpers_androidKt.findFollowingBreak(text, 0));
        }
        if (i10 == i11) {
            return z10 ? TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(text, i11), i11) : TextRangeKt.TextRange(i11, StringHelpers_androidKt.findPrecedingBreak(text, i11));
        }
        if (z10) {
            return !z11 ? TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(text, i10), i10) : TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(text, i10), i10);
        }
        return !z11 ? TextRangeKt.TextRange(i10, StringHelpers_androidKt.findFollowingBreak(text, i10)) : TextRangeKt.TextRange(i10, StringHelpers_androidKt.findPrecedingBreak(text, i10));
    }
}

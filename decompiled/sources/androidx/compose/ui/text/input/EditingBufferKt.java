package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m4100updateRangeAfterDeletepWDy79M(long j10, long j11) {
        int iM3963getLengthimpl;
        int iM3965getMinimpl = TextRange.m3965getMinimpl(j10);
        int iM3964getMaximpl = TextRange.m3964getMaximpl(j10);
        if (TextRange.m3969intersects5zctL8(j11, j10)) {
            if (TextRange.m3957contains5zctL8(j11, j10)) {
                iM3965getMinimpl = TextRange.m3965getMinimpl(j11);
                iM3964getMaximpl = iM3965getMinimpl;
            } else {
                if (TextRange.m3957contains5zctL8(j10, j11)) {
                    iM3963getLengthimpl = TextRange.m3963getLengthimpl(j11);
                } else if (TextRange.m3958containsimpl(j11, iM3965getMinimpl)) {
                    iM3965getMinimpl = TextRange.m3965getMinimpl(j11);
                    iM3963getLengthimpl = TextRange.m3963getLengthimpl(j11);
                } else {
                    iM3964getMaximpl = TextRange.m3965getMinimpl(j11);
                }
                iM3964getMaximpl -= iM3963getLengthimpl;
            }
        } else if (iM3964getMaximpl > TextRange.m3965getMinimpl(j11)) {
            iM3965getMinimpl -= TextRange.m3963getLengthimpl(j11);
            iM3963getLengthimpl = TextRange.m3963getLengthimpl(j11);
            iM3964getMaximpl -= iM3963getLengthimpl;
        }
        return TextRangeKt.TextRange(iM3965getMinimpl, iM3964getMaximpl);
    }
}

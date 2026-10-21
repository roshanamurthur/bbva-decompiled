package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextLayoutResultProxy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TextLayoutResultProxyKt {
    /* JADX INFO: renamed from: access$coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m562access$coerceIn3MmeM6k(long j10, Rect rect) {
        float right;
        float bottom;
        if (Offset.m2275getXimpl(j10) < rect.getLeft()) {
            right = rect.getLeft();
        } else {
            right = Offset.m2275getXimpl(j10) > rect.getRight() ? rect.getRight() : Offset.m2275getXimpl(j10);
        }
        if (Offset.m2276getYimpl(j10) < rect.getTop()) {
            bottom = rect.getTop();
        } else {
            bottom = Offset.m2276getYimpl(j10) > rect.getBottom() ? rect.getBottom() : Offset.m2276getYimpl(j10);
        }
        return OffsetKt.Offset(right, bottom);
    }
}

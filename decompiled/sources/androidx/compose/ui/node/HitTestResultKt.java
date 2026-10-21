package androidx.compose.ui.node;

import kotlin.Metadata;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0})
public final class HitTestResultKt {
    public static final long access$DistanceAndInLayer(float f6, boolean z10) {
        return ((z10 ? 1L : 0L) & 4294967295L) | (((long) Float.floatToIntBits(f6)) << 32);
    }
}

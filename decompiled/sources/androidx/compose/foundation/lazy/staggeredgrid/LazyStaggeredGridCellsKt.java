package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

/* JADX INFO: compiled from: LazyStaggeredGridCells.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyStaggeredGridCellsKt {
    public static final int[] access$calculateCellsCrossAxisSizeImpl(int i10, int i11, int i12) {
        int i13 = i10 - ((i11 - 1) * i12);
        int i14 = i13 / i11;
        int i15 = i13 % i11;
        int[] iArr = new int[i11];
        int i16 = 0;
        while (i16 < i11) {
            iArr[i16] = (i16 < i15 ? 1 : 0) + i14;
            i16++;
        }
        return iArr;
    }
}

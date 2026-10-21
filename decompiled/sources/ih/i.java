package ih;

import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: PDF417CodewordDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f69711a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, PDF417Common.SYMBOL_TABLE.length, 8);

    static {
        int i10;
        int i11 = 0;
        while (true) {
            int[] iArr = PDF417Common.SYMBOL_TABLE;
            if (i11 >= iArr.length) {
                return;
            }
            int i12 = iArr[i11];
            int i13 = i12 & 1;
            int i14 = 0;
            while (i14 < 8) {
                float f6 = 0.0f;
                while (true) {
                    i10 = i12 & 1;
                    if (i10 == i13) {
                        f6 += 1.0f;
                        i12 >>= 1;
                    }
                }
                f69711a[i11][7 - i14] = f6 / 17.0f;
                i14++;
                i13 = i10;
            }
            i11++;
        }
    }
}

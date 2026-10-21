package cz.muni.fi.xklinex.whiteboxAES;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class XORBox implements Serializable {
    public static final int BOXES = 8;
    public static final int WIDTH = 4;
    private static final long serialVersionUID = -5355889365547416446L;
    protected byte[][] xor = null;

    public XORBox() {
        init();
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.deepEquals(this.xor, ((XORBox) obj).xor);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.deepHashCode(this.xor) + 371;
    }

    public final void init() {
        this.xor = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 256);
    }

    public long xor(long j10, long j11) {
        return xor(this.xor, j10, j11);
    }

    public static long xor(byte[][] bArr, long j10, long j11) {
        long j12 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = i10 * 4;
            j12 |= ((long) bArr[i10][(int) ((((j10 >>> i11) & 15) << 4) | (15 & (j11 >>> i11)))]) << i11;
        }
        return j12;
    }
}

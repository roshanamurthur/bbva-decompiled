package cz.muni.fi.xklinex.whiteboxAES;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class XORCascade implements Serializable {
    public static final int BOXES = 3;
    public static final int C = 2;
    public static final int L = 0;
    public static final int R = 1;
    public static final int WIDTH = 4;
    private static final long serialVersionUID = -2288726654138138762L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final XORBox[] f68116x = new XORBox[3];

    public XORCascade() {
        for (int i10 = 0; i10 < 3; i10++) {
            this.f68116x[i10] = new XORBox();
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.deepEquals(this.f68116x, ((XORCascade) obj).f68116x);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.deepHashCode(this.f68116x) + 581;
    }

    public long xor(long j10, long j11, long j12, long j13) {
        return xor(this.f68116x, j10, j11, j12, j13);
    }

    public static long xor(XORBox[] xORBoxArr, long j10, long j11, long j12, long j13) {
        return xORBoxArr[2].xor(xORBoxArr[0].xor(j10, j11), xORBoxArr[1].xor(j12, j13));
    }
}

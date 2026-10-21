package cz.muni.fi.xklinex.whiteboxAES;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class XORCascadeState implements Serializable {
    public static final int BOXES = 15;
    public static final int WIDTH = 16;
    private static final long serialVersionUID = -7203348462332125659L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final XORBoxState[] f68117x = new XORBoxState[15];

    public XORCascadeState() {
        for (int i10 = 0; i10 < 15; i10++) {
            this.f68117x[i10] = new XORBoxState();
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.deepEquals(this.f68117x, ((XORCascadeState) obj).f68117x);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.deepHashCode(this.f68117x) + 201;
    }

    public State xor(State[] stateArr) {
        return xor(this.f68117x, stateArr);
    }

    public static State xor(XORBoxState[] xORBoxStateArr, State[] stateArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = 1 << (3 - i11);
            int i13 = 1 << i11;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = i14 * 2 * i13;
                xORBoxStateArr[i10 + i14].xorA(stateArr[i15], stateArr[i15 + i13]);
            }
            i10 += i12;
        }
        return stateArr[0];
    }
}

package cz.muni.fi.xklinex.whiteboxAES;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class XORBoxState implements Serializable {
    public static final int BOXES = 32;
    public static final int WIDTH = 16;
    private static final long serialVersionUID = 1274697272673072694L;
    protected byte[][] xor = null;

    public XORBoxState() {
        init();
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.deepEquals(this.xor, ((XORBoxState) obj).xor);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.deepHashCode(this.xor) + 485;
    }

    public final void init() {
        this.xor = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 32, 256);
    }

    public State xorA(State state, State state2) {
        return xorA(this.xor, state, state2);
    }

    public static State xorA(byte[][] bArr, State state, State state2) {
        byte[] state3 = state.getState();
        byte[] state4 = state2.getState();
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = i10 * 2;
            byte[] bArr2 = bArr[i11];
            byte b10 = state3[i10];
            byte b11 = state4[i10];
            state3[i10] = (byte) ((bArr[i11 + 1][(((b10 >>> 4) & 15) << 4) | ((b11 >>> 4) & 15)] << 4) | bArr2[((b10 & 15) << 4) | (b11 & 15)]);
        }
        state.setState(state3, false);
        return state;
    }
}

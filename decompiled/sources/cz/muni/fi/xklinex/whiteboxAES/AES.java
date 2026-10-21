package cz.muni.fi.xklinex.whiteboxAES;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.t3;
import com.vasco.digipass.sdk.utils.utilities.wbc.WBCTable;
import cz.muni.fi.xklinex.whiteboxAES.generator.ExternalBijections;
import cz.muni.fi.xklinex.whiteboxAES.generator.GF2MatrixEx;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class AES implements Serializable {
    public static final int BYTES = 16;
    public static final int ROUNDS = 10;
    public static final int T1BOXES = 2;
    private static final long serialVersionUID = 7018750917462672211L;
    public static final int[] shiftRows = {0, 1, 2, 3, 5, 6, 7, 4, 10, 11, 8, 9, 15, 12, 13, 14};
    public static final int[] shiftRowsInv = {0, 1, 2, 3, 7, 4, 5, 6, 10, 11, 8, 9, 13, 14, 15, 12};

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    protected T1Box[][] f68112t1 = (T1Box[][]) Array.newInstance((Class<?>) T1Box.class, 2, 16);
    protected XORCascadeState[] xorState = new XORCascadeState[2];

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    protected T2Box[][] f68113t2 = (T2Box[][]) Array.newInstance((Class<?>) T2Box.class, 10, 16);

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    protected T3Box[][] f68114t3 = (T3Box[][]) Array.newInstance((Class<?>) T3Box.class, 10, 16);
    protected XORCascade[][] xor = (XORCascade[][]) Array.newInstance((Class<?>) XORCascade.class, 10, 8);
    private boolean encrypt = true;

    public static byte HI(byte b10) {
        return (byte) ((b10 >>> 4) & 15);
    }

    public static byte HILO(byte b10, byte b11) {
        return (byte) (((b10 & 15) << 4) | (b11 & 15));
    }

    public static byte LO(byte b10) {
        return (byte) (b10 & 15);
    }

    public static void applyExternalEnc(State state, ExternalBijections externalBijections, boolean z10) {
        if (z10) {
            GF2MatrixEx gF2MatrixEx = new GF2MatrixEx(128, 1);
            for (int i10 = 0; i10 < 16; i10++) {
                t3.a(gF2MatrixEx, state.get(i10), i10 * 8, 0);
            }
            GF2MatrixEx gF2MatrixEx2 = (GF2MatrixEx) externalBijections.getIODM()[0].getMb().rightMultiply(gF2MatrixEx);
            for (int i11 = 0; i11 < 16; i11++) {
                state.set(t3.a(gF2MatrixEx2, i11 * 8, 0), i11);
            }
            for (int i12 = 0; i12 < 16; i12++) {
                int i13 = i12 * 2;
                state.set(HILO((byte) (externalBijections.getLfC()[0][i13 + 1].coding[HI(state.get(i12))] & 255), (byte) (externalBijections.getLfC()[0][i13].coding[LO(state.get(i12))] & 255)), i12);
            }
            return;
        }
        for (int i14 = 0; i14 < 16; i14++) {
            int i15 = i14 * 2;
            state.set(HILO((byte) (externalBijections.getLfC()[1][i15 + 1].invCoding[HI(state.get(i14))] & 255), (byte) (externalBijections.getLfC()[1][i15].invCoding[LO(state.get(i14))] & 255)), i14);
        }
        GF2MatrixEx gF2MatrixEx3 = new GF2MatrixEx(128, 1);
        for (int i16 = 0; i16 < 16; i16++) {
            t3.a(gF2MatrixEx3, state.get(i16), i16 * 8, 0);
        }
        GF2MatrixEx gF2MatrixEx4 = (GF2MatrixEx) externalBijections.getIODM()[1].getInv().rightMultiply(gF2MatrixEx3);
        for (int i17 = 0; i17 < 16; i17++) {
            state.set(t3.a(gF2MatrixEx4, i17 * 8, 0), i17);
        }
    }

    public static int[] getShift(boolean z10) {
        return z10 ? shiftRows : shiftRowsInv;
    }

    public static int posIdx(byte b10) {
        return b10 & 255;
    }

    public State crypt(State state) {
        W32b[] w32bArr = new W32b[16];
        State[] stateArr = new State[16];
        for (int i10 = 0; i10 < 16; i10++) {
            w32bArr[i10] = new W32b();
            stateArr[i10] = new State();
        }
        for (int i11 = 0; i11 < 16; i11++) {
            stateArr[i11].loadFrom(this.f68112t1[0][i11].lookup(state.get(i11)));
        }
        this.xorState[0].xor(stateArr);
        state.loadFrom(stateArr[0]);
        for (int i12 = 0; i12 < 9; i12++) {
            for (int i13 = 0; i13 < 16; i13++) {
                w32bArr[i13].set(this.f68113t2[i12][i13].lookup(state.get(shift(i13))));
            }
            for (int i14 = 0; i14 < 4; i14++) {
                W32b w32b = w32bArr[i14];
                int i15 = i14 * 2;
                int i16 = i14 + 4;
                int i17 = i14 + 8;
                int i18 = i14 + 12;
                w32b.set(this.xor[i12][i15].xor(w32b.getLong(), w32bArr[i16].getLong(), w32bArr[i17].getLong(), w32bArr[i18].getLong()));
                byte[] bArr = w32bArr[i14].get();
                w32bArr[i18].set(this.f68114t3[i12][i18].lookup(bArr[3]));
                w32bArr[i17].set(this.f68114t3[i12][i17].lookup(bArr[2]));
                w32bArr[i16].set(this.f68114t3[i12][i16].lookup(bArr[1]));
                w32bArr[i14].set(this.f68114t3[i12][i14].lookup(bArr[0]));
                W32b w32b2 = w32bArr[i14];
                w32b2.set(this.xor[i12][i15 + 1].xor(w32b2.getLong(), w32bArr[i16].getLong(), w32bArr[i17].getLong(), w32bArr[i18].getLong()));
                state.setColumn(w32bArr[i14], i14);
            }
        }
        for (int i19 = 0; i19 < 16; i19++) {
            stateArr[i19].loadFrom(this.f68112t1[1][i19].lookup(state.get(shift(i19))));
        }
        this.xorState[1].xor(stateArr);
        state.loadFrom(stateArr[0]);
        return state;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AES aes = (AES) obj;
        return Arrays.deepEquals(this.f68112t1, aes.f68112t1) && Arrays.deepEquals(this.xorState, aes.xorState) && Arrays.deepEquals(this.f68113t2, aes.f68113t2) && Arrays.deepEquals(this.f68114t3, aes.f68114t3) && Arrays.deepEquals(this.xor, aes.xor) && this.encrypt == aes.encrypt;
    }

    public T1Box[][] getT1() {
        return this.f68112t1;
    }

    public T2Box[][] getT2() {
        return this.f68113t2;
    }

    public T3Box[][] getT3() {
        return this.f68114t3;
    }

    public XORCascade[][] getXor() {
        return this.xor;
    }

    public XORCascadeState[] getXorState() {
        return this.xorState;
    }

    public int hashCode() {
        return ((((((((((Arrays.deepHashCode(this.f68112t1) + 623) * 89) + Arrays.deepHashCode(this.xorState)) * 89) + Arrays.deepHashCode(this.f68113t2)) * 89) + Arrays.deepHashCode(this.f68114t3)) * 89) + Arrays.deepHashCode(this.xor)) * 89) + (this.encrypt ? 1 : 0);
    }

    public void init(WBCTable wBCTable) {
        this.f68112t1 = wBCTable.getT1();
        this.xorState = wBCTable.getXorState();
        this.f68113t2 = wBCTable.getT2();
        this.f68114t3 = wBCTable.getT3();
        this.xor = wBCTable.getXor();
    }

    public void setEncrypt(boolean z10) {
        this.encrypt = z10;
    }

    public int shift(int i10) {
        return getShift(this.encrypt)[i10];
    }
}

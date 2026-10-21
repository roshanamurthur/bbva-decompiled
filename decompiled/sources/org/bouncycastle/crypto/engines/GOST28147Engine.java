package org.bouncycastle.crypto.engines;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class GOST28147Engine implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f88425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Hashtable f88426e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88428b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f88427a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88429c = f88425d;

    static {
        byte[] bArr = {4, 10, 9, 2, 13, 8, 0, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 11, 1, 12, 7, 15, 5, 3, Constants.CVR_B1b41_1110_ONLINE_PIN, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, Constants.CVR_B1b41_1110_ONLINE_PIN, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, Constants.CVR_B1b41_1110_ONLINE_PIN, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 11, 8, 12};
        f88425d = bArr;
        byte[] bArr2 = {4, 2, 15, 5, 9, 1, 0, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, Constants.CVR_B1b41_1110_ONLINE_PIN, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, Constants.CVR_B1b41_1110_ONLINE_PIN, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, Constants.CVR_B1b41_1110_ONLINE_PIN, 7, 10, 15, 4, 1, 8};
        byte[] bArr3 = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 12, 0, 13, 5, 3, 7, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, Constants.CVR_B1b41_1110_ONLINE_PIN, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, Constants.CVR_B1b41_1110_ONLINE_PIN, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, Constants.CVR_B1b41_1110_ONLINE_PIN, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, Constants.CVR_B1b41_1110_ONLINE_PIN, 11, 10, 15, 5, 0, 12, Constants.CVR_B1b41_1110_ONLINE_PIN, 8, 6, 2, 3, 9, 1, 7, 13, 4};
        byte[] bArr4 = {8, 4, 11, 1, 3, 5, 0, 9, 2, Constants.CVR_B1b41_1110_ONLINE_PIN, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.CVR_B1b41_1110_ONLINE_PIN, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 3, 8, 3, 2, 6, 4, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 0, 4, 11, Constants.CVR_B1b41_1110_ONLINE_PIN, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12};
        byte[] bArr5 = {1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 15, 10, 7, 12, 9, 11, 1, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 12, 6, 1, 11, 13, 9, 3, 8};
        byte[] bArr6 = {15, 12, 2, 10, 6, 4, 5, 0, 7, 9, Constants.CVR_B1b41_1110_ONLINE_PIN, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, Constants.CVR_B1b41_1110_ONLINE_PIN, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 1, 8, 0, 15, 3, 2, 5, Constants.CVR_B1b41_1110_ONLINE_PIN, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, Constants.CVR_B1b41_1110_ONLINE_PIN};
        byte[] bArr7 = {12, 4, 6, 2, 10, 5, 11, 9, Constants.CVR_B1b41_1110_ONLINE_PIN, 8, 13, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, Constants.CVR_B1b41_1110_ONLINE_PIN, 4, 7, 11, 13, 0, 15, 11, 3, 5, 8, 2, 15, 10, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, 13, 4, 15, 6, 7, 0, 10, 5, 3, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 11, 7, 15, 5, 10, 8, 1, 6, 13, 0, 9, 3, Constants.CVR_B1b41_1110_ONLINE_PIN, 11, 4, 2, 12, 5, 13, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, Constants.CVR_B1b41_1110_ONLINE_PIN, 0, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, 13, 10, 3, 7, 1, 7, Constants.CVR_B1b41_1110_ONLINE_PIN, 13, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2};
        byte[] bArr8 = {4, 10, 9, 2, 13, 8, 0, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 11, 1, 12, 7, 15, 5, 3, Constants.CVR_B1b41_1110_ONLINE_PIN, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, Constants.CVR_B1b41_1110_ONLINE_PIN, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, Constants.CVR_B1b41_1110_ONLINE_PIN, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 11, 8, 12};
        byte[] bArr9 = {10, 4, 5, 6, 8, 1, 3, 7, 13, 12, Constants.CVR_B1b41_1110_ONLINE_PIN, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, Constants.CVR_B1b41_1110_ONLINE_PIN, 10, 8, 7, 15, 12, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, Constants.CVR_B1b41_1110_ONLINE_PIN, 12, 3, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, Constants.CVR_B1b41_1110_ONLINE_PIN, 13, 0, 2, 12};
        f88426e = new Hashtable();
        b("Default", bArr);
        b("E-TEST", bArr2);
        b("E-A", bArr3);
        b("E-B", bArr4);
        b("E-C", bArr5);
        b("E-D", bArr6);
        b("Param-Z", bArr7);
        b("D-TEST", bArr8);
        b("D-A", bArr9);
    }

    public static void b(String str, byte[] bArr) {
        f88426e.put(Strings.toUpperCase(str), bArr);
    }

    public static int c(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr[i10 + 2] << 16) & 16711680) + ((bArr[i10 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i10] & 255);
    }

    public static void e(int i10, int i11, byte[] bArr) {
        bArr[i11 + 3] = (byte) (i10 >>> 24);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11] = (byte) i10;
    }

    public static byte[] getSBox(String str) {
        byte[] bArr = (byte[]) f88426e.get(Strings.toUpperCase(str));
        if (bArr != null) {
            return Arrays.clone(bArr);
        }
        throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    public static String getSBoxName(byte[] bArr) {
        Hashtable hashtable = f88426e;
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            if (Arrays.areEqual((byte[]) hashtable.get(str), bArr)) {
                return str;
            }
        }
        throw new IllegalArgumentException("SBOX provided did not map to a known one");
    }

    public final int a(int i10, int i11) {
        int i12 = i11 + i10;
        byte[] bArr = this.f88429c;
        int i13 = bArr[i12 & 15] + (bArr[((i12 >> 4) & 15) + 16] << 4) + (bArr[((i12 >> 8) & 15) + 32] << 8) + (bArr[((i12 >> 12) & 15) + 48] << 12) + (bArr[((i12 >> 16) & 15) + 64] << 16) + (bArr[((i12 >> 20) & 15) + 80] << 20) + (bArr[((i12 >> 24) & 15) + 96] << 24) + (bArr[((i12 >> 28) & 15) + 112] << 28);
        return (i13 << 11) | (i13 >>> 21);
    }

    public final int[] d(boolean z10, byte[] bArr) {
        this.f88428b = z10;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i10 = 0; i10 != 8; i10++) {
            iArr[i10] = c(i10 * 4, bArr);
        }
        return iArr;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "GOST28147";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithSBox)) {
            if (cipherParameters instanceof KeyParameter) {
                this.f88427a = d(z10, ((KeyParameter) cipherParameters).getKey());
                return;
            } else {
                if (cipherParameters != null) {
                    throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to GOST28147 init - "));
                }
                return;
            }
        }
        ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
        byte[] sBox = parametersWithSBox.getSBox();
        if (sBox.length != 128) {
            throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
        }
        this.f88429c = Arrays.clone(sBox);
        if (parametersWithSBox.getParameters() != null) {
            this.f88427a = d(z10, ((KeyParameter) parametersWithSBox.getParameters()).getKey());
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13;
        int[] iArr = this.f88427a;
        if (iArr == null) {
            throw new IllegalStateException("GOST28147 engine not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int iC = c(i10, bArr);
        int iC2 = c(i10 + 4, bArr);
        int i14 = 7;
        if (this.f88428b) {
            for (int i15 = 0; i15 < 3; i15++) {
                int i16 = 0;
                while (i16 < 8) {
                    int iA = iC2 ^ a(iC, iArr[i16]);
                    i16++;
                    int i17 = iC;
                    iC = iA;
                    iC2 = i17;
                }
            }
            i12 = iC2;
            i13 = iC;
            while (i14 > 0) {
                int iA2 = i12 ^ a(i13, iArr[i14]);
                i14--;
                i12 = i13;
                i13 = iA2;
            }
        } else {
            int i18 = 0;
            while (i18 < 8) {
                int iA3 = iC2 ^ a(iC, iArr[i18]);
                i18++;
                int i19 = iC;
                iC = iA3;
                iC2 = i19;
            }
            i12 = iC2;
            i13 = iC;
            for (int i20 = 0; i20 < 3; i20++) {
                int i21 = 7;
                while (i21 >= 0 && (i20 != 2 || i21 != 0)) {
                    int iA4 = i12 ^ a(i13, iArr[i21]);
                    i21--;
                    i12 = i13;
                    i13 = iA4;
                }
            }
        }
        int iA5 = i12 ^ a(i13, iArr[0]);
        e(i13, i11, bArr2);
        e(iA5, i11 + 4, bArr2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}

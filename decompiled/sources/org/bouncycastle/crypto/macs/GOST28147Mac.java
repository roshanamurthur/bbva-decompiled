package org.bouncycastle.crypto.macs;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithSBox;

/* JADX INFO: loaded from: classes4.dex */
public class GOST28147Mac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88862a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88863b = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88867f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f88868g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f88869h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f88870i = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, Constants.CVR_B1b41_1110_ONLINE_PIN, 15, 12, 0, 13, 5, 3, 7, Constants.CVR_B1b41_1110_ONLINE_PIN, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, Constants.CVR_B1b41_1110_ONLINE_PIN, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, Constants.CVR_B1b41_1110_ONLINE_PIN, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, Constants.CVR_B1b41_1110_ONLINE_PIN, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, Constants.CVR_B1b41_1110_ONLINE_PIN, 11, 10, 15, 5, 0, 12, Constants.CVR_B1b41_1110_ONLINE_PIN, 8, 6, 2, 3, 9, 1, 7, 13, 4};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f88866e = new byte[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88865d = new byte[8];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88864c = 0;

    public static byte[] a(int i10, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i10];
        System.arraycopy(bArr, i10, bArr3, 0, bArr2.length);
        for (int i11 = 0; i11 != bArr2.length; i11++) {
            bArr3[i11] = (byte) (bArr3[i11] ^ bArr2[i11]);
        }
        return bArr3;
    }

    public static int b(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr[i10 + 2] << 16) & 16711680) + ((bArr[i10 + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i10] & 255);
    }

    public static void d(int i10, int i11, byte[] bArr) {
        bArr[i11 + 3] = (byte) (i10 >>> 24);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11] = (byte) i10;
    }

    public final void c(int[] iArr, byte[] bArr, byte[] bArr2) {
        int iB = b(0, bArr);
        int iB2 = b(4, bArr);
        for (int i10 = 0; i10 < 2; i10++) {
            int i11 = 0;
            while (i11 < 8) {
                int i12 = iArr[i11] + iB;
                byte[] bArr3 = this.f88870i;
                int i13 = bArr3[i12 & 15] + (bArr3[((i12 >> 4) & 15) + 16] << 4) + (bArr3[((i12 >> 8) & 15) + 32] << 8) + (bArr3[((i12 >> 12) & 15) + 48] << 12) + (bArr3[((i12 >> 16) & 15) + 64] << 16) + (bArr3[((i12 >> 20) & 15) + 80] << 20) + (bArr3[((i12 >> 24) & 15) + 96] << 24) + (bArr3[((i12 >> 28) & 15) + 112] << 28);
                i11++;
                int i14 = iB;
                iB = iB2 ^ ((i13 << 11) | (i13 >>> 21));
                iB2 = i14;
            }
        }
        d(iB, 0, bArr2);
        d(iB2, 4, bArr2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        while (true) {
            int i11 = this.f88864c;
            if (i11 >= this.f88862a) {
                break;
            }
            this.f88865d[i11] = 0;
            this.f88864c = i11 + 1;
        }
        byte[] bArr2 = this.f88865d;
        byte[] bArrA = new byte[bArr2.length];
        byte[] bArr3 = this.f88866e;
        System.arraycopy(bArr2, 0, bArrA, 0, bArr3.length);
        if (this.f88867f) {
            this.f88867f = false;
        } else {
            bArrA = a(0, this.f88865d, bArr3);
        }
        c(this.f88868g, bArrA, this.f88866e);
        int length = bArr3.length / 2;
        int i12 = this.f88863b;
        System.arraycopy(bArr3, length - i12, bArr, i10, i12);
        reset();
        return i12;
    }

    public final void e(CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters == null) {
            return;
        }
        if (cipherParameters instanceof ParametersWithSBox) {
            ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
            System.arraycopy(parametersWithSBox.getSBox(), 0, this.f88870i, 0, parametersWithSBox.getSBox().length);
            parameters = parametersWithSBox.getParameters();
        } else if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            if (key.length != 32) {
                throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
            }
            int[] iArr = new int[8];
            for (int i10 = 0; i10 != 8; i10++) {
                iArr[i10] = b(i10 * 4, key);
            }
            this.f88868g = iArr;
            parameters = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to GOST28147 init - "));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            byte[] bArr = this.f88866e;
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
            this.f88869h = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        }
        e(parameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88863b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        reset();
        this.f88865d = new byte[this.f88862a];
        this.f88869h = null;
        e(cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f88865d;
            if (i10 >= bArr.length) {
                this.f88864c = 0;
                this.f88867f = true;
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException {
        int i10 = this.f88864c;
        byte[] bArr = this.f88865d;
        if (i10 == bArr.length) {
            byte[] bArrA = new byte[bArr.length];
            byte[] bArr2 = this.f88866e;
            System.arraycopy(bArr, 0, bArrA, 0, bArr2.length);
            if (this.f88867f) {
                this.f88867f = false;
                byte[] bArr3 = this.f88869h;
                if (bArr3 != null) {
                    bArrA = a(0, this.f88865d, bArr3);
                }
            } else {
                bArrA = a(0, this.f88865d, bArr2);
            }
            c(this.f88868g, bArrA, this.f88866e);
            this.f88864c = 0;
        }
        byte[] bArr4 = this.f88865d;
        int i11 = this.f88864c;
        this.f88864c = i11 + 1;
        bArr4[i11] = b10;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i12 = this.f88864c;
        int i13 = this.f88862a;
        int i14 = i13 - i12;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, this.f88865d, i12, i14);
            byte[] bArr2 = this.f88865d;
            byte[] bArrA = new byte[bArr2.length];
            byte[] bArr3 = this.f88866e;
            System.arraycopy(bArr2, 0, bArrA, 0, bArr3.length);
            if (this.f88867f) {
                this.f88867f = false;
                byte[] bArr4 = this.f88869h;
                if (bArr4 != null) {
                    bArrA = a(0, this.f88865d, bArr4);
                }
            } else {
                bArrA = a(0, this.f88865d, bArr3);
            }
            c(this.f88868g, bArrA, this.f88866e);
            this.f88864c = 0;
            i11 -= i14;
            i10 += i14;
            while (i11 > i13) {
                c(this.f88868g, a(i10, bArr, bArr3), this.f88866e);
                i11 -= i13;
                i10 += i13;
            }
        }
        System.arraycopy(bArr, i10, this.f88865d, this.f88864c, i11);
        this.f88864c += i11;
    }
}

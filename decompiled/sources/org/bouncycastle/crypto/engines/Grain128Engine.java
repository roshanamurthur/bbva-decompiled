package org.bouncycastle.crypto.engines;

import androidx.core.view.MotionEventCompat;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes3.dex */
public class Grain128Engine implements StreamCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f88440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f88441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f88443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f88444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88446g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f88447h = false;

    public static void e(int i10, int[] iArr) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i10;
    }

    public final byte a() {
        if (this.f88446g > 3) {
            int iB = b();
            this.f88445f = iB;
            byte[] bArr = this.f88442c;
            bArr[0] = (byte) iB;
            bArr[1] = (byte) (iB >> 8);
            bArr[2] = (byte) (iB >> 16);
            bArr[3] = (byte) (iB >> 24);
            int[] iArr = this.f88444e;
            e(d() ^ this.f88443d[0], iArr);
            this.f88444e = iArr;
            int[] iArr2 = this.f88443d;
            e(c(), iArr2);
            this.f88443d = iArr2;
            this.f88446g = 0;
        }
        byte[] bArr2 = this.f88442c;
        int i10 = this.f88446g;
        this.f88446g = i10 + 1;
        return bArr2[i10];
    }

    public final int b() {
        int[] iArr = this.f88444e;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 2) | (i11 << 30);
        int i13 = (i10 >>> 12) | (i11 << 20);
        int i14 = (i10 >>> 15) | (i11 << 17);
        int i15 = iArr[2];
        int i16 = (i11 >>> 4) | (i15 << 28);
        int i17 = (i11 >>> 13) | (i15 << 19);
        int i18 = iArr[3];
        int i19 = (i15 >>> 9) | (i18 << 23);
        int i20 = (i15 >>> 25) | (i18 << 7);
        int i21 = (i18 << 1) | (i15 >>> 31);
        int[] iArr2 = this.f88443d;
        int i22 = iArr2[0];
        int i23 = iArr2[1];
        int i24 = (i22 >>> 8) | (i23 << 24);
        int i25 = (i22 >>> 13) | (i23 << 19);
        int i26 = (i22 >>> 20) | (i23 << 12);
        int i27 = iArr2[2];
        int i28 = iArr2[3];
        int i29 = i25 & i26;
        return ((((((((((i21 & i13) & ((i28 << 1) | (i27 >>> 31))) ^ (((i29 ^ (i13 & i24)) ^ (i21 & ((i23 >>> 10) | (i27 << 22)))) ^ (((i23 >>> 28) | (i27 << 4)) & ((i27 >>> 15) | (i28 << 17))))) ^ ((i27 >>> 29) | (i28 << 3))) ^ i12) ^ i14) ^ i16) ^ i17) ^ i15) ^ i19) ^ i20;
    }

    public final int c() {
        int[] iArr = this.f88443d;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 7) | (i11 << 25);
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = (i13 >>> 6) | (i14 << 26);
        return i14 ^ ((((i10 ^ i12) ^ ((i11 >>> 6) | (i13 << 26))) ^ i15) ^ ((i13 >>> 17) | (i14 << 15)));
    }

    public final int d() {
        int[] iArr = this.f88444e;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 3) | (i11 << 29);
        int i13 = (i10 >>> 11) | (i11 << 21);
        int i14 = (i10 >>> 13) | (i11 << 19);
        int i15 = (i10 >>> 17) | (i11 << 15);
        int i16 = (i10 >>> 18) | (i11 << 14);
        int i17 = (i10 >>> 26) | (i11 << 6);
        int i18 = (i10 >>> 27) | (i11 << 5);
        int i19 = iArr[2];
        int i20 = (i11 >>> 8) | (i19 << 24);
        int i21 = (i11 >>> 16) | (i19 << 16);
        int i22 = (i11 >>> 24) | (i19 << 8);
        int i23 = (i11 >>> 27) | (i19 << 5);
        int i24 = (i11 >>> 29) | (i19 << 3);
        int i25 = iArr[3];
        return (((((((i25 ^ (((i10 ^ i17) ^ i22) ^ ((i19 >>> 27) | (i25 << 5)))) ^ (i12 & ((i19 >>> 3) | (i25 << 29)))) ^ (i13 & i14)) ^ (i15 & i16)) ^ (i18 & i23)) ^ (i20 & i21)) ^ (i24 & ((i19 >>> 1) | (i25 << 31)))) ^ (((i19 >>> 4) | (i25 << 28)) & ((i19 >>> 20) | (i25 << 12)));
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.f88441b = new byte[keyParameter.getKey().length];
        this.f88440a = new byte[keyParameter.getKey().length];
        this.f88443d = new int[4];
        this.f88444e = new int[4];
        this.f88442c = new byte[4];
        System.arraycopy(iv, 0, this.f88441b, 0, iv.length);
        System.arraycopy(keyParameter.getKey(), 0, this.f88440a, 0, keyParameter.getKey().length);
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (!this.f88447h) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ a());
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.f88446g = 4;
        byte[] bArr = this.f88440a;
        byte[] bArr2 = this.f88441b;
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.f88440a = bArr;
        this.f88441b = bArr2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f88444e;
            if (i10 >= iArr.length) {
                break;
            }
            byte[] bArr3 = this.f88440a;
            int i12 = i11 + 3;
            int i13 = i11 + 2;
            int i14 = i11 + 1;
            iArr[i10] = (bArr3[i11] & 255) | (bArr3[i12] << 24) | ((bArr3[i13] << 16) & 16711680) | ((bArr3[i14] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            int[] iArr2 = this.f88443d;
            byte[] bArr4 = this.f88441b;
            iArr2[i10] = (bArr4[i11] & 255) | ((bArr4[i14] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr4[i12] << 24) | ((bArr4[i13] << 16) & 16711680);
            i11 += 4;
            i10++;
        }
        for (int i15 = 0; i15 < 8; i15++) {
            this.f88445f = b();
            int[] iArr3 = this.f88444e;
            e((d() ^ this.f88443d[0]) ^ this.f88445f, iArr3);
            this.f88444e = iArr3;
            int[] iArr4 = this.f88443d;
            e(c() ^ this.f88445f, iArr4);
            this.f88443d = iArr4;
        }
        this.f88447h = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        if (this.f88447h) {
            return (byte) (b10 ^ a());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes3.dex */
public class Grainv1Engine implements StreamCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f88448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f88449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f88451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f88452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88454g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f88455h = false;

    public static void e(int i10, int[] iArr) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i10;
    }

    public final byte a() {
        if (this.f88454g > 1) {
            int iB = b();
            this.f88453f = iB;
            byte[] bArr = this.f88450c;
            bArr[0] = (byte) iB;
            bArr[1] = (byte) (iB >> 8);
            int[] iArr = this.f88452e;
            e(d() ^ this.f88451d[0], iArr);
            this.f88452e = iArr;
            int[] iArr2 = this.f88451d;
            e(c(), iArr2);
            this.f88451d = iArr2;
            this.f88454g = 0;
        }
        byte[] bArr2 = this.f88450c;
        int i10 = this.f88454g;
        this.f88454g = i10 + 1;
        return bArr2[i10];
    }

    public final int b() {
        int[] iArr = this.f88452e;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 1) | (i11 << 15);
        int i13 = (i10 >>> 2) | (i11 << 14);
        int i14 = (i10 >>> 4) | (i11 << 12);
        int i15 = (i10 >>> 10) | (i11 << 6);
        int i16 = iArr[2];
        int i17 = (i11 >>> 15) | (i16 << 1);
        int i18 = iArr[3];
        int i19 = (i16 >>> 11) | (i18 << 5);
        int i20 = iArr[4];
        int i21 = (i18 >>> 8) | (i20 << 8);
        int i22 = (i20 << 1) | (i18 >>> 15);
        int[] iArr2 = this.f88451d;
        int i23 = iArr2[0] >>> 3;
        int i24 = iArr2[1];
        int i25 = i23 | (i24 << 13);
        int i26 = iArr2[2];
        int i27 = (i24 >>> 9) | (i26 << 7);
        int i28 = (iArr2[3] << 2) | (i26 >>> 14);
        int i29 = iArr2[4];
        int i30 = i28 & i29;
        int i31 = ((((i27 ^ i22) ^ (i25 & i29)) ^ i30) ^ (i29 & i22)) ^ ((i25 & i27) & i28);
        int i32 = i25 & i28;
        return (((((((((i22 & i30) ^ (((i32 & i22) ^ ((i29 & i32) ^ i31)) ^ ((i27 & i28) & i22))) ^ i12) ^ i13) ^ i14) ^ i15) ^ i17) ^ i19) ^ i21) & 65535;
    }

    public final int c() {
        int[] iArr = this.f88451d;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 13) | (i11 << 3);
        int i13 = iArr[2];
        int i14 = (i11 >>> 7) | (i13 << 9);
        int i15 = iArr[3];
        int i16 = (i13 >>> 6) | (i15 << 10);
        int i17 = iArr[4];
        int i18 = (i15 >>> 3) | (i17 << 13);
        return (((i17 << 2) | (i15 >>> 14)) ^ ((((i10 ^ i12) ^ i14) ^ i16) ^ i18)) & 65535;
    }

    public final int d() {
        int[] iArr = this.f88452e;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 9) | (i11 << 7);
        int i13 = (i10 >>> 14) | (i11 << 2);
        int i14 = (i10 >>> 15) | (i11 << 1);
        int i15 = iArr[2];
        int i16 = (i11 >>> 5) | (i15 << 11);
        int i17 = (i11 >>> 12) | (i15 << 4);
        int i18 = iArr[3];
        int i19 = (i15 >>> 1) | (i18 << 15);
        int i20 = (i15 >>> 5) | (i18 << 11);
        int i21 = (i15 >>> 13) | (i18 << 3);
        int i22 = iArr[4];
        int i23 = (i18 >>> 4) | (i22 << 12);
        int i24 = (i18 >>> 12) | (i22 << 4);
        int i25 = (i18 >>> 14) | (i22 << 2);
        int i26 = (i22 << 1) | (i18 >>> 15);
        int i27 = i26 & i24;
        int i28 = (((i10 ^ (((((((((i25 ^ i24) ^ i23) ^ i21) ^ i20) ^ i19) ^ i17) ^ i16) ^ i13) ^ i12)) ^ i27) ^ (i20 & i19)) ^ (i14 & i12);
        int i29 = i24 & i23;
        int i30 = i19 & i17 & i16;
        return (((((((((i26 & i21) & i17) & i12) ^ ((i28 ^ (i29 & i21)) ^ i30)) ^ ((i29 & i20) & i19)) ^ ((i27 & i16) & i14)) ^ (((i27 & i23) & i21) & i20)) ^ ((i30 & i14) & i12)) ^ (((((i23 & i21) & i20) & i19) & i17) & i16)) & 65535;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.f88449b = new byte[keyParameter.getKey().length];
        this.f88448a = new byte[keyParameter.getKey().length];
        this.f88451d = new int[5];
        this.f88452e = new int[5];
        this.f88450c = new byte[2];
        System.arraycopy(iv, 0, this.f88449b, 0, iv.length);
        System.arraycopy(keyParameter.getKey(), 0, this.f88448a, 0, keyParameter.getKey().length);
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (!this.f88455h) {
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
        this.f88454g = 2;
        byte[] bArr = this.f88448a;
        byte[] bArr2 = this.f88449b;
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.f88448a = bArr;
        this.f88449b = bArr2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f88452e;
            if (i10 >= iArr.length) {
                break;
            }
            byte[] bArr3 = this.f88448a;
            int i12 = i11 + 1;
            iArr[i10] = ((bArr3[i11] & 255) | (bArr3[i12] << 8)) & 65535;
            int[] iArr2 = this.f88451d;
            byte[] bArr4 = this.f88449b;
            iArr2[i10] = ((bArr4[i11] & 255) | (bArr4[i12] << 8)) & 65535;
            i11 += 2;
            i10++;
        }
        for (int i13 = 0; i13 < 10; i13++) {
            this.f88453f = b();
            int[] iArr3 = this.f88452e;
            e((d() ^ this.f88451d[0]) ^ this.f88453f, iArr3);
            this.f88452e = iArr3;
            int[] iArr4 = this.f88451d;
            e(c() ^ this.f88453f, iArr4);
            this.f88451d = iArr4;
        }
        this.f88455h = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        if (this.f88455h) {
            return (byte) (b10 ^ a());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}

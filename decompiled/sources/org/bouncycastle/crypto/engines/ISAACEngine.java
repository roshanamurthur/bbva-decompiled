package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class ISAACEngine implements StreamCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f88485a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f88486b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88487c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88488d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88489e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88490f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f88491g = new byte[1024];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f88492h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f88493i = false;

    public static void b(int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = i10 ^ (i11 << 11);
        iArr[0] = i12;
        int i13 = iArr[3] + i12;
        iArr[3] = i13;
        int i14 = iArr[2];
        int i15 = i11 + i14;
        iArr[1] = i15;
        int i16 = i15 ^ (i14 >>> 2);
        iArr[1] = i16;
        int i17 = iArr[4] + i16;
        iArr[4] = i17;
        int i18 = i14 + i13;
        iArr[2] = i18;
        int i19 = i18 ^ (i13 << 8);
        iArr[2] = i19;
        int i20 = iArr[5] + i19;
        iArr[5] = i20;
        int i21 = i13 + i17;
        iArr[3] = i21;
        int i22 = i21 ^ (i17 >>> 16);
        iArr[3] = i22;
        int i23 = iArr[6] + i22;
        iArr[6] = i23;
        int i24 = i17 + i20;
        iArr[4] = i24;
        int i25 = (i20 << 10) ^ i24;
        iArr[4] = i25;
        int i26 = iArr[7] + i25;
        iArr[7] = i26;
        int i27 = i20 + i23;
        iArr[5] = i27;
        int i28 = (i23 >>> 4) ^ i27;
        iArr[5] = i28;
        int i29 = i12 + i28;
        iArr[0] = i29;
        int i30 = i23 + i26;
        iArr[6] = i30;
        int i31 = (i26 << 8) ^ i30;
        iArr[6] = i31;
        int i32 = i16 + i31;
        iArr[1] = i32;
        int i33 = i26 + i29;
        iArr[7] = i33;
        int i34 = (i29 >>> 9) ^ i33;
        iArr[7] = i34;
        iArr[2] = i19 + i34;
        iArr[0] = i29 + i32;
    }

    public final void a() {
        int i10;
        int i11;
        int i12 = this.f88488d;
        int i13 = this.f88489e + 1;
        this.f88489e = i13;
        this.f88488d = i12 + i13;
        for (int i14 = 0; i14 < 256; i14++) {
            int[] iArr = this.f88485a;
            int i15 = iArr[i14];
            int i16 = i14 & 3;
            if (i16 == 0) {
                i10 = this.f88487c;
                i11 = i10 << 13;
            } else if (i16 == 1) {
                i10 = this.f88487c;
                i11 = i10 >>> 6;
            } else if (i16 != 2) {
                if (i16 == 3) {
                    i10 = this.f88487c;
                    i11 = i10 >>> 16;
                }
                int i17 = this.f88487c + iArr[(i14 + 128) & 255];
                this.f88487c = i17;
                int i18 = iArr[(i15 >>> 2) & 255] + i17 + this.f88488d;
                iArr[i14] = i18;
                int[] iArr2 = this.f88486b;
                int i19 = iArr[(i18 >>> 10) & 255] + i15;
                this.f88488d = i19;
                iArr2[i14] = i19;
            } else {
                i10 = this.f88487c;
                i11 = i10 << 2;
            }
            this.f88487c = i10 ^ i11;
            int i110 = this.f88487c + iArr[(i14 + 128) & 255];
            this.f88487c = i110;
            int i111 = iArr[(i15 >>> 2) & 255] + i110 + this.f88488d;
            iArr[i14] = i111;
            int[] iArr3 = this.f88486b;
            int i112 = iArr[(i111 >>> 10) & 255] + i15;
            this.f88488d = i112;
            iArr3[i14] = i112;
        }
    }

    public final void c(byte[] bArr) {
        this.f88492h = bArr;
        if (this.f88485a == null) {
            this.f88485a = new int[256];
        }
        if (this.f88486b == null) {
            this.f88486b = new int[256];
        }
        for (int i10 = 0; i10 < 256; i10++) {
            int[] iArr = this.f88485a;
            this.f88486b[i10] = 0;
            iArr[i10] = 0;
        }
        this.f88489e = 0;
        this.f88488d = 0;
        this.f88487c = 0;
        this.f88490f = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i11 = 0; i11 < length; i11 += 4) {
            this.f88486b[i11 >>> 2] = Pack.littleEndianToInt(bArr2, i11);
        }
        int[] iArr2 = new int[8];
        for (int i12 = 0; i12 < 8; i12++) {
            iArr2[i12] = -1640531527;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            b(iArr2);
        }
        int i14 = 0;
        while (i14 < 2) {
            for (int i15 = 0; i15 < 256; i15 += 8) {
                for (int i16 = 0; i16 < 8; i16++) {
                    iArr2[i16] = iArr2[i16] + (i14 < 1 ? this.f88486b[i15 + i16] : this.f88485a[i15 + i16]);
                }
                b(iArr2);
                for (int i17 = 0; i17 < 8; i17++) {
                    this.f88485a[i15 + i17] = iArr2[i17];
                }
            }
            i14++;
        }
        a();
        this.f88493i = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ISAAC";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to ISAAC init - "));
        }
        c(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f88493i) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            if (this.f88490f == 0) {
                a();
                this.f88491g = Pack.intToBigEndian(this.f88486b);
            }
            byte[] bArr3 = this.f88491g;
            int i14 = this.f88490f;
            bArr2[i13 + i12] = (byte) (bArr3[i14] ^ bArr[i13 + i10]);
            this.f88490f = (i14 + 1) & 1023;
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        c(this.f88492h);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        if (this.f88490f == 0) {
            a();
            this.f88491g = Pack.intToBigEndian(this.f88486b);
        }
        byte[] bArr = this.f88491g;
        int i10 = this.f88490f;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        this.f88490f = (i10 + 1) & 1023;
        return b11;
    }
}

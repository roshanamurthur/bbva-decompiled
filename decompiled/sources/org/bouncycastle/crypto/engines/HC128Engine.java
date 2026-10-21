package org.bouncycastle.crypto.engines;

import com.google.android.material.internal.ViewUtils;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes3.dex */
public class HC128Engine implements StreamCipher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f88460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88461f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f88456a = new int[512];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f88457b = new int[512];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88458c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f88462g = new byte[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88463h = 0;

    public static int a(int i10, int i11) {
        return (i10 - i11) & 511;
    }

    public static int d(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    public final byte b() {
        int i10 = this.f88463h;
        byte[] bArr = this.f88462g;
        if (i10 == 0) {
            int iE = e();
            bArr[0] = (byte) (iE & 255);
            bArr[1] = (byte) ((iE >> 8) & 255);
            bArr[2] = (byte) ((iE >> 16) & 255);
            bArr[3] = (byte) ((iE >> 24) & 255);
        }
        int i11 = this.f88463h;
        byte b10 = bArr[i11];
        this.f88463h = (i11 + 1) & 3;
        return b10;
    }

    public final void c() {
        if (this.f88459d.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        this.f88463h = 0;
        this.f88458c = 0;
        int[] iArr = new int[1280];
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = i10 >> 2;
            iArr[i11] = ((this.f88459d[i10] & 255) << ((i10 & 3) * 8)) | iArr[i11];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f88460e;
            if (i12 >= bArr.length || i12 >= 16) {
                break;
            }
            int i13 = (i12 >> 2) + 8;
            iArr[i13] = ((bArr[i12] & 255) << ((i12 & 3) * 8)) | iArr[i13];
            i12++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i14 = 16; i14 < 1280; i14++) {
            int i15 = iArr[i14 - 2];
            int iD = ((i15 >>> 10) ^ (d(i15, 17) ^ d(i15, 19))) + iArr[i14 - 7];
            int i16 = iArr[i14 - 15];
            iArr[i14] = iD + ((i16 >>> 3) ^ (d(i16, 7) ^ d(i16, 18))) + iArr[i14 - 16] + i14;
        }
        int[] iArr2 = this.f88456a;
        System.arraycopy(iArr, 256, iArr2, 0, 512);
        int[] iArr3 = this.f88457b;
        System.arraycopy(iArr, ViewUtils.EDGE_TO_EDGE_FLAGS, iArr3, 0, 512);
        for (int i17 = 0; i17 < 512; i17++) {
            iArr2[i17] = e();
        }
        for (int i18 = 0; i18 < 512; i18++) {
            iArr3[i18] = e();
        }
        this.f88458c = 0;
    }

    public final int e() {
        int i10;
        int i11;
        int i12 = this.f88458c;
        int i13 = i12 & 511;
        int[] iArr = this.f88457b;
        int[] iArr2 = this.f88456a;
        if (i12 < 512) {
            int i14 = iArr2[i13];
            int i15 = iArr2[a(i13, 3)];
            int i16 = iArr2[a(i13, 10)];
            int i17 = iArr2[a(i13, 511)];
            iArr2[i13] = d(i16, 8) + (d(i17, 23) ^ d(i15, 10)) + i14;
            int i18 = iArr2[a(i13, 12)];
            i10 = iArr[i18 & 255] + iArr[((i18 >> 16) & 255) + 256];
            i11 = iArr2[i13];
        } else {
            int i19 = iArr[i13];
            int i20 = iArr[a(i13, 3)];
            int i21 = iArr[a(i13, 10)];
            int i22 = iArr[a(i13, 511)];
            iArr[i13] = ((i21 << 8) | (i21 >>> (-8))) + (((i22 >>> (-23)) | (i22 << 23)) ^ ((i20 >>> (-10)) | (i20 << 10))) + i19;
            int i23 = iArr[a(i13, 12)];
            i10 = iArr2[i23 & 255] + iArr2[((i23 >> 16) & 255) + 256];
            i11 = iArr[i13];
        }
        int i24 = i11 ^ i10;
        this.f88458c = (this.f88458c + 1) & 1023;
        return i24;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f88460e = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.f88460e = new byte[0];
            parameters = cipherParameters;
        }
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "Invalid parameter passed to HC128 init - "));
        }
        this.f88459d = ((KeyParameter) parameters).getKey();
        c();
        this.f88461f = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (!this.f88461f) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ b());
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        c();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        return (byte) (b10 ^ b());
    }
}

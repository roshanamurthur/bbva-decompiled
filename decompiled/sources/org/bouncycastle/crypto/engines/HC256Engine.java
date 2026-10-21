package org.bouncycastle.crypto.engines;

import com.google.android.material.internal.ViewUtils;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes3.dex */
public class HC256Engine implements StreamCipher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f88468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88469f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f88464a = new int[1024];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f88465b = new int[1024];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88466c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f88470g = new byte[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88471h = 0;

    public static int c(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    public final byte a() {
        int i10 = this.f88471h;
        byte[] bArr = this.f88470g;
        if (i10 == 0) {
            int iD = d();
            bArr[0] = (byte) (iD & 255);
            bArr[1] = (byte) ((iD >> 8) & 255);
            bArr[2] = (byte) ((iD >> 16) & 255);
            bArr[3] = (byte) ((iD >> 24) & 255);
        }
        int i11 = this.f88471h;
        byte b10 = bArr[i11];
        this.f88471h = (i11 + 1) & 3;
        return b10;
    }

    public final void b() {
        byte[] bArr = this.f88467d;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.f88468e.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.f88467d;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.f88467d = bArr2;
        }
        byte[] bArr4 = this.f88468e;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.f88468e;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.f88468e = bArr5;
        }
        this.f88471h = 0;
        this.f88466c = 0;
        int[] iArr = new int[2560];
        for (int i10 = 0; i10 < 32; i10++) {
            int i11 = i10 >> 2;
            iArr[i11] = iArr[i11] | ((this.f88467d[i10] & 255) << ((i10 & 3) * 8));
        }
        for (int i12 = 0; i12 < 32; i12++) {
            int i13 = (i12 >> 2) + 8;
            iArr[i13] = iArr[i13] | ((this.f88468e[i12] & 255) << ((i12 & 3) * 8));
        }
        for (int i14 = 16; i14 < 2560; i14++) {
            int i15 = iArr[i14 - 2];
            int i16 = iArr[i14 - 15];
            iArr[i14] = ((i15 >>> 10) ^ (c(i15, 17) ^ c(i15, 19))) + iArr[i14 - 7] + ((i16 >>> 3) ^ (c(i16, 7) ^ c(i16, 18))) + iArr[i14 - 16] + i14;
        }
        System.arraycopy(iArr, 512, this.f88464a, 0, 1024);
        System.arraycopy(iArr, 1536, this.f88465b, 0, 1024);
        for (int i17 = 0; i17 < 4096; i17++) {
            d();
        }
        this.f88466c = 0;
    }

    public final int d() {
        int i10;
        int i11;
        int i12 = this.f88466c;
        int i13 = i12 & 1023;
        int[] iArr = this.f88465b;
        int[] iArr2 = this.f88464a;
        if (i12 < 1024) {
            int i14 = iArr2[(i13 - 3) & 1023];
            int i15 = iArr2[(i13 - 1023) & 1023];
            iArr2[i13] = iArr2[(i13 - 10) & 1023] + (c(i15, 23) ^ c(i14, 10)) + iArr[(i14 ^ i15) & 1023] + iArr2[i13];
            int i16 = iArr2[(i13 - 12) & 1023];
            i10 = iArr[i16 & 255] + iArr[((i16 >> 8) & 255) + 256] + iArr[((i16 >> 16) & 255) + 512] + iArr[((i16 >> 24) & 255) + ViewUtils.EDGE_TO_EDGE_FLAGS];
            i11 = iArr2[i13];
        } else {
            int i17 = iArr[(i13 - 3) & 1023];
            int i18 = iArr[(i13 - 1023) & 1023];
            iArr[i13] = iArr[(i13 - 10) & 1023] + (c(i18, 23) ^ c(i17, 10)) + iArr2[(i17 ^ i18) & 1023] + iArr[i13];
            int i19 = iArr[(i13 - 12) & 1023];
            i10 = iArr2[i19 & 255] + iArr2[((i19 >> 8) & 255) + 256] + iArr2[((i19 >> 16) & 255) + 512] + iArr2[((i19 >> 24) & 255) + ViewUtils.EDGE_TO_EDGE_FLAGS];
            i11 = iArr[i13];
        }
        int i20 = i11 ^ i10;
        this.f88466c = (this.f88466c + 1) & 2047;
        return i20;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-256";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f88468e = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.f88468e = new byte[0];
            parameters = cipherParameters;
        }
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "Invalid parameter passed to HC256 init - "));
        }
        this.f88467d = ((KeyParameter) parameters).getKey();
        b();
        this.f88469f = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        if (!this.f88469f) {
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
        b();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        return (byte) (b10 ^ a());
    }
}

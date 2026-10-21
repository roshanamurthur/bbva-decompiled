package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class RC4Engine implements StreamCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f88521a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88522b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88523c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88524d = null;

    public final void a(byte[] bArr) {
        this.f88524d = bArr;
        this.f88522b = 0;
        this.f88523c = 0;
        if (this.f88521a == null) {
            this.f88521a = new byte[256];
        }
        for (int i10 = 0; i10 < 256; i10++) {
            this.f88521a[i10] = (byte) i10;
        }
        int length = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            int i13 = bArr[length] & 255;
            byte[] bArr2 = this.f88521a;
            byte b10 = bArr2[i12];
            i11 = (i13 + b10 + i11) & 255;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
            length = (length + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to RC4 init - "));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.f88524d = key;
        a(key);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f88522b + 1) & 255;
            this.f88522b = i14;
            byte[] bArr3 = this.f88521a;
            byte b10 = bArr3[i14];
            int i15 = (this.f88523c + b10) & 255;
            this.f88523c = i15;
            bArr3[i14] = bArr3[i15];
            bArr3[i15] = b10;
            bArr2[i13 + i12] = (byte) (bArr3[(bArr3[i14] + b10) & 255] ^ bArr[i13 + i10]);
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        a(this.f88524d);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        int i10 = (this.f88522b + 1) & 255;
        this.f88522b = i10;
        byte[] bArr = this.f88521a;
        byte b11 = bArr[i10];
        int i11 = (this.f88523c + b11) & 255;
        this.f88523c = i11;
        bArr[i10] = bArr[i11];
        bArr[i11] = b11;
        return (byte) (b10 ^ bArr[(bArr[i10] + b11) & 255]);
    }
}

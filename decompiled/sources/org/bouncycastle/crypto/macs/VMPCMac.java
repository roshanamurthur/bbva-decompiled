package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes4.dex */
public class VMPCMac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f88928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f88929b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88930c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f88931d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f88932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f88933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f88934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f88935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f88936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f88937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f88938k;

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        for (int i11 = 1; i11 < 25; i11++) {
            byte[] bArr2 = this.f88930c;
            byte b10 = this.f88931d;
            byte b11 = this.f88929b;
            byte b12 = bArr2[(b10 + bArr2[b11 & 255]) & 255];
            this.f88931d = b12;
            byte b13 = this.f88938k;
            byte b14 = this.f88937j;
            byte b15 = bArr2[(b13 + b14 + i11) & 255];
            this.f88938k = b15;
            byte b16 = this.f88936i;
            byte b17 = bArr2[(b14 + b16 + i11) & 255];
            this.f88937j = b17;
            byte b18 = this.f88935h;
            byte b19 = bArr2[(b16 + b18 + i11) & 255];
            this.f88936i = b19;
            byte b20 = bArr2[(b18 + b12 + i11) & 255];
            this.f88935h = b20;
            byte[] bArr3 = this.f88932e;
            byte b21 = this.f88928a;
            bArr3[b21 & 31] = (byte) (b20 ^ bArr3[b21 & 31]);
            bArr3[(b21 + 1) & 31] = (byte) (b19 ^ bArr3[(b21 + 1) & 31]);
            bArr3[(b21 + 2) & 31] = (byte) (b17 ^ bArr3[(b21 + 2) & 31]);
            bArr3[(b21 + 3) & 31] = (byte) (b15 ^ bArr3[(b21 + 3) & 31]);
            this.f88928a = (byte) ((b21 + 4) & 31);
            byte b22 = bArr2[b11 & 255];
            bArr2[b11 & 255] = bArr2[b12 & 255];
            bArr2[b12 & 255] = b22;
            this.f88929b = (byte) ((b11 + 1) & 255);
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr4 = this.f88930c;
            byte b23 = this.f88931d;
            int i13 = i12 & 255;
            byte b24 = bArr4[i13];
            byte b25 = bArr4[(b23 + b24 + this.f88932e[i12 & 31]) & 255];
            this.f88931d = b25;
            bArr4[i13] = bArr4[b25 & 255];
            bArr4[b25 & 255] = b24;
        }
        byte[] bArr5 = new byte[20];
        for (int i14 = 0; i14 < 20; i14++) {
            byte[] bArr6 = this.f88930c;
            int i15 = i14 & 255;
            byte b26 = bArr6[(this.f88931d + bArr6[i15]) & 255];
            this.f88931d = b26;
            bArr5[i14] = bArr6[(bArr6[bArr6[b26 & 255] & 255] + 1) & 255];
            byte b27 = bArr6[i15];
            bArr6[i15] = bArr6[b26 & 255];
            bArr6[b26 & 255] = b27;
        }
        System.arraycopy(bArr5, 0, bArr, i10, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv = parametersWithIV.getIV();
        this.f88933f = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.f88934g = keyParameter.getKey();
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        byte[] bArr = this.f88934g;
        byte[] bArr2 = this.f88933f;
        this.f88931d = (byte) 0;
        this.f88930c = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            this.f88930c[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr3 = this.f88930c;
            byte b10 = this.f88931d;
            int i12 = i11 & 255;
            byte b11 = bArr3[i12];
            byte b12 = bArr3[(b10 + b11 + bArr[i11 % bArr.length]) & 255];
            this.f88931d = b12;
            int i13 = b12 & 255;
            bArr3[i12] = bArr3[i13];
            bArr3[i13] = b11;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr4 = this.f88930c;
            byte b13 = this.f88931d;
            int i15 = i14 & 255;
            byte b14 = bArr4[i15];
            byte b15 = bArr4[(b13 + b14 + bArr2[i14 % bArr2.length]) & 255];
            this.f88931d = b15;
            int i16 = b15 & 255;
            bArr4[i15] = bArr4[i16];
            bArr4[i16] = b14;
        }
        this.f88929b = (byte) 0;
        this.f88938k = (byte) 0;
        this.f88937j = (byte) 0;
        this.f88936i = (byte) 0;
        this.f88935h = (byte) 0;
        this.f88928a = (byte) 0;
        this.f88932e = new byte[32];
        for (int i17 = 0; i17 < 32; i17++) {
            this.f88932e[i17] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException {
        byte[] bArr = this.f88930c;
        byte b11 = this.f88931d;
        byte b12 = this.f88929b;
        byte b13 = bArr[(b11 + bArr[b12 & 255]) & 255];
        this.f88931d = b13;
        byte b14 = (byte) (b10 ^ bArr[(bArr[bArr[b13 & 255] & 255] + 1) & 255]);
        byte b15 = this.f88938k;
        byte b16 = this.f88937j;
        byte b17 = bArr[(b15 + b16) & 255];
        this.f88938k = b17;
        byte b18 = this.f88936i;
        byte b19 = bArr[(b16 + b18) & 255];
        this.f88937j = b19;
        byte b20 = this.f88935h;
        byte b21 = bArr[(b18 + b20) & 255];
        this.f88936i = b21;
        byte b22 = bArr[(b20 + b13 + b14) & 255];
        this.f88935h = b22;
        byte[] bArr2 = this.f88932e;
        byte b23 = this.f88928a;
        bArr2[b23 & 31] = (byte) (b22 ^ bArr2[b23 & 31]);
        bArr2[(b23 + 1) & 31] = (byte) (b21 ^ bArr2[(b23 + 1) & 31]);
        bArr2[(b23 + 2) & 31] = (byte) (b19 ^ bArr2[(b23 + 2) & 31]);
        bArr2[(b23 + 3) & 31] = (byte) (b17 ^ bArr2[(b23 + 3) & 31]);
        this.f88928a = (byte) ((b23 + 4) & 31);
        byte b24 = bArr[b12 & 255];
        bArr[b12 & 255] = bArr[b13 & 255];
        bArr[b13 & 255] = b24;
        this.f88929b = (byte) ((b12 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            update(bArr[i10 + i12]);
        }
    }
}

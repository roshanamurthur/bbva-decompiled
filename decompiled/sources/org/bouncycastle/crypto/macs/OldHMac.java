package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes4.dex */
public class OldHMac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f88896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f88898c = new byte[64];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88899d = new byte[64];

    public OldHMac(Digest digest) {
        this.f88896a = digest;
        this.f88897b = digest.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        int i11 = this.f88897b;
        byte[] bArr2 = new byte[i11];
        Digest digest = this.f88896a;
        digest.doFinal(bArr2, 0);
        byte[] bArr3 = this.f88899d;
        digest.update(bArr3, 0, bArr3.length);
        digest.update(bArr2, 0, i11);
        int iDoFinal = digest.doFinal(bArr, i10);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.f88896a.getAlgorithmName() + "/HMAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88897b;
    }

    public Digest getUnderlyingDigest() {
        return this.f88896a;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        Digest digest = this.f88896a;
        digest.reset();
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        byte[] bArr = this.f88898c;
        if (length > 64) {
            digest.update(key, 0, key.length);
            digest.doFinal(bArr, 0);
            for (int i10 = this.f88897b; i10 < bArr.length; i10++) {
                bArr[i10] = 0;
            }
        } else {
            System.arraycopy(key, 0, bArr, 0, key.length);
            for (int length2 = key.length; length2 < bArr.length; length2++) {
                bArr[length2] = 0;
            }
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f88899d = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ 54);
        }
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.f88899d;
            if (i12 >= bArr3.length) {
                digest.update(bArr, 0, bArr.length);
                return;
            } else {
                bArr3[i12] = (byte) (bArr3[i12] ^ 92);
                i12++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Digest digest = this.f88896a;
        digest.reset();
        byte[] bArr = this.f88898c;
        digest.update(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        this.f88896a.update(b10);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        this.f88896a.update(bArr, i10, i11);
    }
}

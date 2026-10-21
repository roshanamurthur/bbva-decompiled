package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.digests.DSTU7564Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes4.dex */
public class DSTU7564Mac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DSTU7564Digest f88846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88848c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f88849d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f88850e;

    public DSTU7564Mac(int i10) {
        this.f88846a = new DSTU7564Digest(i10);
        this.f88847b = i10 / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        if (this.f88848c == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (bArr.length - i10 < this.f88847b) {
            throw new OutputLengthException("Output buffer too short");
        }
        DSTU7564Digest dSTU7564Digest = this.f88846a;
        int byteLength = dSTU7564Digest.getByteLength() - ((int) (this.f88850e % ((long) dSTU7564Digest.getByteLength())));
        if (byteLength < 13) {
            byteLength += dSTU7564Digest.getByteLength();
        }
        byte[] bArr2 = new byte[byteLength];
        bArr2[0] = -128;
        Pack.longToLittleEndian(this.f88850e * 8, bArr2, byteLength - 12);
        dSTU7564Digest.update(bArr2, 0, byteLength);
        byte[] bArr3 = this.f88849d;
        dSTU7564Digest.update(bArr3, 0, bArr3.length);
        this.f88850e = 0L;
        int iDoFinal = dSTU7564Digest.doFinal(bArr, i10);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "DSTU7564Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88847b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f88848c = null;
        reset();
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Bad parameter passed");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.f88849d = new byte[key.length];
        int length = key.length;
        DSTU7564Digest dSTU7564Digest = this.f88846a;
        int byteLength = dSTU7564Digest.getByteLength() * (((dSTU7564Digest.getByteLength() + length) - 1) / dSTU7564Digest.getByteLength());
        if (byteLength - key.length < 13) {
            byteLength += dSTU7564Digest.getByteLength();
        }
        byte[] bArr = new byte[byteLength];
        System.arraycopy(key, 0, bArr, 0, key.length);
        bArr[key.length] = -128;
        Pack.intToLittleEndian(key.length * 8, bArr, byteLength - 12);
        this.f88848c = bArr;
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.f88849d;
            if (i10 >= bArr2.length) {
                byte[] bArr3 = this.f88848c;
                dSTU7564Digest.update(bArr3, 0, bArr3.length);
                return;
            } else {
                bArr2[i10] = (byte) (~key[i10]);
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.f88850e = 0L;
        DSTU7564Digest dSTU7564Digest = this.f88846a;
        dSTU7564Digest.reset();
        byte[] bArr = this.f88848c;
        if (bArr != null) {
            dSTU7564Digest.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) throws IllegalStateException {
        this.f88846a.update(b10);
        this.f88850e++;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        if (bArr.length - i10 < i11) {
            throw new DataLengthException("Input buffer too short");
        }
        if (this.f88848c != null) {
            this.f88846a.update(bArr, i10, i11);
            this.f88850e += (long) i11;
        } else {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
    }
}

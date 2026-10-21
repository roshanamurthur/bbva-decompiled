package org.bouncycastle.jcajce.provider.digest;

import java.security.MessageDigest;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes8.dex */
public class BCMessageDigest extends MessageDigest {
    protected Digest digest;
    protected int digestSize;

    public BCMessageDigest(Digest digest) {
        super(digest.getAlgorithmName());
        this.digest = digest;
        this.digestSize = digest.getDigestSize();
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.digestSize];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return this.digestSize;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.digest.reset();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b10) {
        this.digest.update(b10);
    }

    public BCMessageDigest(Xof xof, int i10) {
        super(xof.getAlgorithmName());
        this.digest = xof;
        this.digestSize = i10 / 8;
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) {
        this.digest.update(bArr, i10, i11);
    }
}

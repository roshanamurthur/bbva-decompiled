package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class GenericSigner implements Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsymmetricBlockCipher f89541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Digest f89542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89543c;

    public GenericSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this.f89541a = asymmetricBlockCipher;
        this.f89542b = digest;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        if (!this.f89543c) {
            throw new IllegalStateException("GenericSigner not initialised for signature generation.");
        }
        Digest digest = this.f89542b;
        int digestSize = digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        digest.doFinal(bArr, 0);
        return this.f89541a.processBlock(bArr, 0, digestSize);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f89543c = z10;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z10 && !asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("signing requires private key");
        }
        if (!z10 && asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("verification requires public key");
        }
        reset();
        this.f89541a.init(z10, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89542b.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f89542b.update(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.f89543c) {
            throw new IllegalStateException("GenericSigner not initialised for verification");
        }
        Digest digest = this.f89542b;
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        digest.doFinal(bArr2, 0);
        try {
            byte[] bArrProcessBlock = this.f89541a.processBlock(bArr, 0, bArr.length);
            if (bArrProcessBlock.length < digestSize) {
                byte[] bArr3 = new byte[digestSize];
                System.arraycopy(bArrProcessBlock, 0, bArr3, digestSize - bArrProcessBlock.length, bArrProcessBlock.length);
                bArrProcessBlock = bArr3;
            }
            return Arrays.constantTimeAreEqual(bArrProcessBlock, bArr2);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f89542b.update(bArr, i10, i11);
    }
}

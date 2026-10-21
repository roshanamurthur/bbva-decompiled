package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes13.dex */
public class DigestingMessageSigner implements Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f90957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MessageSigner f90958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f90959c;

    public DigestingMessageSigner(MessageSigner messageSigner, Digest digest) {
        this.f90958b = messageSigner;
        this.f90957a = digest;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.f90959c) {
            throw new IllegalStateException("DigestingMessageSigner not initialised for signature generation.");
        }
        Digest digest = this.f90957a;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return this.f90958b.generateSignature(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f90959c = z10;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z10 && !asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("Signing Requires Private Key.");
        }
        if (!z10 && asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("Verification Requires Public Key.");
        }
        reset();
        this.f90958b.init(z10, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f90957a.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f90957a.update(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.f90959c) {
            throw new IllegalStateException("DigestingMessageSigner not initialised for verification");
        }
        Digest digest = this.f90957a;
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr2, 0);
        return this.f90958b.verifySignature(bArr2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f90957a.update(bArr, i10, i11);
    }
}

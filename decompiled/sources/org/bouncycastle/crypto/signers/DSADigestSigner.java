package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes5.dex */
public class DSADigestSigner implements Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DSA f89495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Digest f89496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DSAEncoding f89497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89498d;

    public DSADigestSigner(DSA dsa, Digest digest) {
        this.f89495a = dsa;
        this.f89496b = digest;
        this.f89497c = StandardDSAEncoding.INSTANCE;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.f89498d) {
            throw new IllegalStateException("DSADigestSigner not initialised for signature generation.");
        }
        Digest digest = this.f89496b;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        BigInteger[] bigIntegerArrGenerateSignature = this.f89495a.generateSignature(bArr);
        try {
            return this.f89497c.encode(getOrder(), bigIntegerArrGenerateSignature[0], bigIntegerArrGenerateSignature[1]);
        } catch (Exception unused) {
            throw new IllegalStateException("unable to encode signature");
        }
    }

    public BigInteger getOrder() {
        DSA dsa = this.f89495a;
        if (dsa instanceof DSAExt) {
            return ((DSAExt) dsa).getOrder();
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f89498d = z10;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z10 && !asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("Signing Requires Private Key.");
        }
        if (!z10 && asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("Verification Requires Public Key.");
        }
        reset();
        this.f89495a.init(z10, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89496b.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f89496b.update(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.f89498d) {
            throw new IllegalStateException("DSADigestSigner not initialised for verification");
        }
        Digest digest = this.f89496b;
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr2, 0);
        try {
            BigInteger[] bigIntegerArrDecode = this.f89497c.decode(getOrder(), bArr);
            return this.f89495a.verifySignature(bArr2, bigIntegerArrDecode[0], bigIntegerArrDecode[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    public DSADigestSigner(DSAExt dSAExt, Digest digest, DSAEncoding dSAEncoding) {
        this.f89495a = dSAExt;
        this.f89496b = digest;
        this.f89497c = dSAEncoding;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f89496b.update(bArr, i10, i11);
    }
}

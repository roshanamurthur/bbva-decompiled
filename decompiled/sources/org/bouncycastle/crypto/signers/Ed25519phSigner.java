package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class Ed25519phSigner implements Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f89524a = Ed25519.createPrehash();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ed25519PrivateKeyParameters f89527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ed25519PublicKeyParameters f89528e;

    public Ed25519phSigner(byte[] bArr) {
        this.f89525b = Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.f89526c || this.f89527d == null) {
            throw new IllegalStateException("Ed25519phSigner not initialised for signature generation.");
        }
        byte[] bArr = new byte[64];
        if (64 != this.f89524a.doFinal(bArr, 0)) {
            throw new IllegalStateException("Prehash digest failed");
        }
        byte[] bArr2 = new byte[64];
        this.f89527d.sign(2, this.f89525b, bArr, 0, 64, bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f89526c = z10;
        if (z10) {
            this.f89527d = (Ed25519PrivateKeyParameters) cipherParameters;
            this.f89528e = null;
        } else {
            this.f89527d = null;
            this.f89528e = (Ed25519PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89524a.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f89524a.update(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        if (this.f89526c || (ed25519PublicKeyParameters = this.f89528e) == null) {
            throw new IllegalStateException("Ed25519phSigner not initialised for verification");
        }
        if (64 != bArr.length) {
            return false;
        }
        return Ed25519.verifyPrehash(bArr, 0, ed25519PublicKeyParameters.getEncoded(), 0, this.f89525b, this.f89524a);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f89524a.update(bArr, i10, i11);
    }
}

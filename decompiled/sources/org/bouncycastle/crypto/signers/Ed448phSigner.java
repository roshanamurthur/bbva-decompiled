package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class Ed448phSigner implements Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xof f89534a = Ed448.createPrehash();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ed448PrivateKeyParameters f89537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ed448PublicKeyParameters f89538e;

    public Ed448phSigner(byte[] bArr) {
        this.f89535b = Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        if (!this.f89536c || this.f89537d == null) {
            throw new IllegalStateException("Ed448phSigner not initialised for signature generation.");
        }
        byte[] bArr = new byte[64];
        if (64 != this.f89534a.doFinal(bArr, 0, 64)) {
            throw new IllegalStateException("Prehash digest failed");
        }
        byte[] bArr2 = new byte[114];
        this.f89537d.sign(1, this.f89535b, bArr, 0, 64, bArr2, 0);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f89536c = z10;
        if (z10) {
            this.f89537d = (Ed448PrivateKeyParameters) cipherParameters;
            this.f89538e = null;
        } else {
            this.f89537d = null;
            this.f89538e = (Ed448PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.f89534a.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f89534a.update(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        Ed448PublicKeyParameters ed448PublicKeyParameters;
        if (this.f89536c || (ed448PublicKeyParameters = this.f89538e) == null) {
            throw new IllegalStateException("Ed448phSigner not initialised for verification");
        }
        if (114 != bArr.length) {
            return false;
        }
        return Ed448.verifyPrehash(bArr, 0, ed448PublicKeyParameters.getEncoded(), 0, this.f89535b, this.f89534a);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f89534a.update(bArr, i10, i11);
    }
}

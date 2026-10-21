package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.StateAwareMessageSigner;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSStateAwareSigner implements StateAwareMessageSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GMSSSigner f91050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GMSSPrivateKeyParameters f91051b;

    public class a implements GMSSDigestProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Memoable f91052a;

        public a(Memoable memoable) {
            this.f91052a = memoable;
        }

        @Override // org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider
        public final Digest get() {
            return (Digest) this.f91052a.copy();
        }
    }

    public GMSSStateAwareSigner(Digest digest) {
        if (!(digest instanceof Memoable)) {
            throw new IllegalArgumentException("digest must implement Memoable");
        }
        this.f91050a = new GMSSSigner(new a(((Memoable) digest).copy()));
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        if (this.f91051b == null) {
            throw new IllegalStateException("signing key no longer usable");
        }
        byte[] bArrGenerateSignature = this.f91050a.generateSignature(bArr);
        this.f91051b = this.f91051b.nextKey();
        return bArrGenerateSignature;
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public AsymmetricKeyParameter getUpdatedPrivateKey() {
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = this.f91051b;
        this.f91051b = null;
        return gMSSPrivateKeyParameters;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (z10) {
            this.f91051b = cipherParameters instanceof ParametersWithRandom ? (GMSSPrivateKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (GMSSPrivateKeyParameters) cipherParameters;
        }
        this.f91050a.init(z10, cipherParameters);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return this.f91050a.verifySignature(bArr, bArr2);
    }
}

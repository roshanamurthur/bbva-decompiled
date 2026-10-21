package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.pqc.crypto.StateAwareMessageSigner;
import org.bouncycastle.util.Arrays;
import zm.f;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSSigner implements StateAwareMessageSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMSSPrivateKeyParameters f91418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public XMSSPublicKeyParameters f91419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public XMSSParameters f91420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f91421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zm.b f91422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f91423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91424g;

    public final f a(byte[] bArr, OTSHashAddress oTSHashAddress) {
        if (bArr.length != this.f91420c.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        b bVar = this.f91421d;
        bVar.f(bVar.e(this.f91418a.getSecretKeySeed(), oTSHashAddress), this.f91418a.getPublicSeed());
        return this.f91421d.g(bArr, oTSHashAddress);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] byteArray;
        if (bArr == null) {
            throw new NullPointerException("message == null");
        }
        if (!this.f91423f) {
            throw new IllegalStateException("signer not initialized for signature generation");
        }
        XMSSPrivateKeyParameters xMSSPrivateKeyParameters = this.f91418a;
        if (xMSSPrivateKeyParameters == null) {
            throw new IllegalStateException("signing key no longer usable");
        }
        synchronized (xMSSPrivateKeyParameters) {
            try {
                if (this.f91418a.getUsagesRemaining() <= 0) {
                    throw new ExhaustedPrivateKeyException("no usages of private key remaining");
                }
                if (this.f91418a.f91388w0.getAuthenticationPath().isEmpty()) {
                    throw new IllegalStateException("not initialized");
                }
                try {
                    int index = this.f91418a.getIndex();
                    this.f91424g = true;
                    long j10 = index;
                    byte[] bArrB = this.f91422e.b(this.f91418a.getSecretKeyPRF(), XMSSUtil.toBytesBigEndian(j10, 32));
                    byteArray = new XMSSSignature.Builder(this.f91420c).withIndex(index).withRandom(bArrB).withWOTSPlusSignature(a(this.f91422e.a(Arrays.concatenate(bArrB, this.f91418a.getRoot(), XMSSUtil.toBytesBigEndian(j10, this.f91420c.getTreeDigestSize())), bArr), (OTSHashAddress) new OTSHashAddress.Builder().withOTSAddress(index).build())).withAuthPath(this.f91418a.f91388w0.getAuthenticationPath()).build().toByteArray();
                    this.f91418a.f91388w0.E0 = true;
                    this.f91418a.a();
                } catch (Throwable th2) {
                    this.f91418a.f91388w0.E0 = true;
                    this.f91418a.a();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArray;
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public AsymmetricKeyParameter getUpdatedPrivateKey() {
        synchronized (this.f91418a) {
            try {
                if (this.f91424g) {
                    XMSSPrivateKeyParameters xMSSPrivateKeyParameters = this.f91418a;
                    this.f91418a = null;
                    return xMSSPrivateKeyParameters;
                }
                XMSSPrivateKeyParameters xMSSPrivateKeyParameters2 = this.f91418a;
                if (xMSSPrivateKeyParameters2 != null) {
                    this.f91418a = xMSSPrivateKeyParameters2.getNextKey();
                }
                return xMSSPrivateKeyParameters2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long getUsagesRemaining() {
        return this.f91418a.getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        XMSSParameters parameters;
        if (z10) {
            this.f91423f = true;
            this.f91424g = false;
            XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (XMSSPrivateKeyParameters) cipherParameters;
            this.f91418a = xMSSPrivateKeyParameters;
            parameters = xMSSPrivateKeyParameters.getParameters();
        } else {
            this.f91423f = false;
            XMSSPublicKeyParameters xMSSPublicKeyParameters = (XMSSPublicKeyParameters) cipherParameters;
            this.f91419b = xMSSPublicKeyParameters;
            parameters = xMSSPublicKeyParameters.getParameters();
        }
        this.f91420c = parameters;
        b bVarA = this.f91420c.a();
        this.f91421d = bVarA;
        this.f91422e = bVarA.f91435b;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        XMSSSignature xMSSSignatureBuild = new XMSSSignature.Builder(this.f91420c).withSignature(bArr2).build();
        int index = xMSSSignatureBuild.getIndex();
        this.f91421d.f(new byte[this.f91420c.getTreeDigestSize()], this.f91419b.getPublicSeed());
        long j10 = index;
        byte[] bArrA = this.f91422e.a(Arrays.concatenate(xMSSSignatureBuild.getRandom(), this.f91419b.getRoot(), XMSSUtil.toBytesBigEndian(j10, this.f91420c.getTreeDigestSize())), bArr);
        int height = this.f91420c.getHeight();
        return Arrays.constantTimeAreEqual(d.a(this.f91421d, height, bArrA, xMSSSignatureBuild, (OTSHashAddress) new OTSHashAddress.Builder().withOTSAddress(index).build(), XMSSUtil.getLeafIndex(j10, height)).getValue(), this.f91419b.getRoot());
    }
}

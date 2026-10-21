package org.bouncycastle.pqc.crypto.xmss;

import java.security.SecureRandom;
import java.text.ParseException;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSMT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XMSSMTParameters f91318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final XMSSParameters f91319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f91320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public XMSSMTPrivateKeyParameters f91321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public XMSSMTPublicKeyParameters f91322e;

    public XMSSMT(XMSSMTParameters xMSSMTParameters, SecureRandom secureRandom) {
        if (xMSSMTParameters == null) {
            throw new NullPointerException("params == null");
        }
        this.f91318a = xMSSMTParameters;
        this.f91319b = xMSSMTParameters.getXMSSParameters();
        this.f91320c = secureRandom;
        this.f91321d = new XMSSMTPrivateKeyParameters.Builder(xMSSMTParameters).build();
        this.f91322e = new XMSSMTPublicKeyParameters.Builder(xMSSMTParameters).build();
    }

    public byte[] exportPrivateKey() {
        return this.f91321d.toByteArray();
    }

    public byte[] exportPublicKey() {
        return this.f91322e.toByteArray();
    }

    public void generateKeys() {
        XMSSMTKeyPairGenerator xMSSMTKeyPairGenerator = new XMSSMTKeyPairGenerator();
        xMSSMTKeyPairGenerator.init(new XMSSMTKeyGenerationParameters(getParams(), this.f91320c));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = xMSSMTKeyPairGenerator.generateKeyPair();
        this.f91321d = (XMSSMTPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (XMSSMTPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        this.f91322e = xMSSMTPublicKeyParameters;
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = this.f91321d;
        this.f91319b.a().f(new byte[this.f91318a.getTreeDigestSize()], this.f91321d.getPublicSeed());
        this.f91321d = xMSSMTPrivateKeyParameters;
        this.f91322e = xMSSMTPublicKeyParameters;
    }

    public XMSSMTParameters getParams() {
        return this.f91318a;
    }

    public byte[] getPublicSeed() {
        return this.f91321d.getPublicSeed();
    }

    public XMSSParameters getXMSS() {
        return this.f91319b;
    }

    public void importState(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("privateKey == null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicKey == null");
        }
        XMSSMTParameters xMSSMTParameters = this.f91318a;
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParametersBuild = new XMSSMTPrivateKeyParameters.Builder(xMSSMTParameters).withPrivateKey(bArr).build();
        XMSSMTPublicKeyParameters xMSSMTPublicKeyParametersBuild = new XMSSMTPublicKeyParameters.Builder(xMSSMTParameters).withPublicKey(bArr2).build();
        if (!Arrays.areEqual(xMSSMTPrivateKeyParametersBuild.getRoot(), xMSSMTPublicKeyParametersBuild.getRoot())) {
            throw new IllegalStateException("root of private key and public key do not match");
        }
        if (!Arrays.areEqual(xMSSMTPrivateKeyParametersBuild.getPublicSeed(), xMSSMTPublicKeyParametersBuild.getPublicSeed())) {
            throw new IllegalStateException("public seed of private key and public key do not match");
        }
        this.f91319b.a().f(new byte[xMSSMTParameters.getTreeDigestSize()], xMSSMTPrivateKeyParametersBuild.getPublicSeed());
        this.f91321d = xMSSMTPrivateKeyParametersBuild;
        this.f91322e = xMSSMTPublicKeyParametersBuild;
    }

    public byte[] sign(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("message == null");
        }
        XMSSMTSigner xMSSMTSigner = new XMSSMTSigner();
        xMSSMTSigner.init(true, this.f91321d);
        byte[] bArrGenerateSignature = xMSSMTSigner.generateSignature(bArr);
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (XMSSMTPrivateKeyParameters) xMSSMTSigner.getUpdatedPrivateKey();
        this.f91321d = xMSSMTPrivateKeyParameters;
        XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = this.f91322e;
        this.f91319b.a().f(new byte[this.f91318a.getTreeDigestSize()], this.f91321d.getPublicSeed());
        this.f91321d = xMSSMTPrivateKeyParameters;
        this.f91322e = xMSSMTPublicKeyParameters;
        return bArrGenerateSignature;
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ParseException {
        if (bArr == null) {
            throw new NullPointerException("message == null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("signature == null");
        }
        if (bArr3 == null) {
            throw new NullPointerException("publicKey == null");
        }
        XMSSMTSigner xMSSMTSigner = new XMSSMTSigner();
        xMSSMTSigner.init(false, new XMSSMTPublicKeyParameters.Builder(getParams()).withPublicKey(bArr3).build());
        return xMSSMTSigner.verifySignature(bArr, bArr2);
    }
}

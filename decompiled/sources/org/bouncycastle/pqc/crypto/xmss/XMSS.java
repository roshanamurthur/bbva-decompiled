package org.bouncycastle.pqc.crypto.xmss;

import java.security.SecureRandom;
import java.text.ParseException;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.util.Arrays;
import zm.f;

/* JADX INFO: loaded from: classes13.dex */
public class XMSS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XMSSParameters f91301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f91302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f91303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public XMSSPrivateKeyParameters f91304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public XMSSPublicKeyParameters f91305e;

    public XMSS(XMSSParameters xMSSParameters, SecureRandom secureRandom) {
        if (xMSSParameters == null) {
            throw new NullPointerException("params == null");
        }
        this.f91301a = xMSSParameters;
        this.f91302b = xMSSParameters.a();
        this.f91303c = secureRandom;
    }

    public XMSSPrivateKeyParameters exportPrivateKey() {
        return this.f91304d;
    }

    public XMSSPublicKeyParameters exportPublicKey() {
        return this.f91305e;
    }

    public void generateKeys() {
        XMSSKeyPairGenerator xMSSKeyPairGenerator = new XMSSKeyPairGenerator();
        xMSSKeyPairGenerator.init(new XMSSKeyGenerationParameters(getParams(), this.f91303c));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = xMSSKeyPairGenerator.generateKeyPair();
        this.f91304d = (XMSSPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        this.f91305e = (XMSSPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        this.f91302b.f(new byte[this.f91301a.getTreeDigestSize()], this.f91304d.getPublicSeed());
    }

    public int getIndex() {
        return this.f91304d.getIndex();
    }

    public XMSSParameters getParams() {
        return this.f91301a;
    }

    public XMSSPrivateKeyParameters getPrivateKey() {
        return this.f91304d;
    }

    public byte[] getPublicSeed() {
        return this.f91304d.getPublicSeed();
    }

    public byte[] getRoot() {
        return this.f91304d.getRoot();
    }

    public b getWOTSPlus() {
        return this.f91302b;
    }

    public void importState(XMSSPrivateKeyParameters xMSSPrivateKeyParameters, XMSSPublicKeyParameters xMSSPublicKeyParameters) {
        if (!Arrays.areEqual(xMSSPrivateKeyParameters.getRoot(), xMSSPublicKeyParameters.getRoot())) {
            throw new IllegalStateException("root of private key and public key do not match");
        }
        if (!Arrays.areEqual(xMSSPrivateKeyParameters.getPublicSeed(), xMSSPublicKeyParameters.getPublicSeed())) {
            throw new IllegalStateException("public seed of private key and public key do not match");
        }
        this.f91304d = xMSSPrivateKeyParameters;
        this.f91305e = xMSSPublicKeyParameters;
        this.f91302b.f(new byte[this.f91301a.getTreeDigestSize()], this.f91304d.getPublicSeed());
    }

    public void setIndex(int i10) {
        this.f91304d = new XMSSPrivateKeyParameters.Builder(this.f91301a).withSecretKeySeed(this.f91304d.getSecretKeySeed()).withSecretKeyPRF(this.f91304d.getSecretKeyPRF()).withPublicSeed(this.f91304d.getPublicSeed()).withRoot(this.f91304d.getRoot()).withBDSState(this.f91304d.f91388w0).build();
    }

    public void setPublicSeed(byte[] bArr) {
        this.f91304d = new XMSSPrivateKeyParameters.Builder(this.f91301a).withSecretKeySeed(this.f91304d.getSecretKeySeed()).withSecretKeyPRF(this.f91304d.getSecretKeyPRF()).withPublicSeed(bArr).withRoot(getRoot()).withBDSState(this.f91304d.f91388w0).build();
        this.f91305e = new XMSSPublicKeyParameters.Builder(this.f91301a).withRoot(getRoot()).withPublicSeed(bArr).build();
        this.f91302b.f(new byte[this.f91301a.getTreeDigestSize()], bArr);
    }

    public void setRoot(byte[] bArr) {
        this.f91304d = new XMSSPrivateKeyParameters.Builder(this.f91301a).withSecretKeySeed(this.f91304d.getSecretKeySeed()).withSecretKeyPRF(this.f91304d.getSecretKeyPRF()).withPublicSeed(getPublicSeed()).withRoot(bArr).withBDSState(this.f91304d.f91388w0).build();
        this.f91305e = new XMSSPublicKeyParameters.Builder(this.f91301a).withRoot(bArr).withPublicSeed(getPublicSeed()).build();
    }

    public byte[] sign(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("message == null");
        }
        XMSSSigner xMSSSigner = new XMSSSigner();
        xMSSSigner.init(true, this.f91304d);
        byte[] bArrGenerateSignature = xMSSSigner.generateSignature(bArr);
        XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (XMSSPrivateKeyParameters) xMSSSigner.getUpdatedPrivateKey();
        this.f91304d = xMSSPrivateKeyParameters;
        importState(xMSSPrivateKeyParameters, this.f91305e);
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
        XMSSSigner xMSSSigner = new XMSSSigner();
        xMSSSigner.init(false, new XMSSPublicKeyParameters.Builder(getParams()).withPublicKey(bArr3).build());
        return xMSSSigner.verifySignature(bArr, bArr2);
    }

    public f wotsSign(byte[] bArr, OTSHashAddress oTSHashAddress) {
        if (bArr.length != this.f91301a.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[] secretKeySeed = this.f91304d.getSecretKeySeed();
        b bVar = this.f91302b;
        bVar.f(bVar.e(secretKeySeed, oTSHashAddress), getPublicSeed());
        return bVar.g(bArr, oTSHashAddress);
    }

    public void importState(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("privateKey == null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicKey == null");
        }
        XMSSParameters xMSSParameters = this.f91301a;
        XMSSPrivateKeyParameters xMSSPrivateKeyParametersBuild = new XMSSPrivateKeyParameters.Builder(xMSSParameters).withPrivateKey(bArr).build();
        XMSSPublicKeyParameters xMSSPublicKeyParametersBuild = new XMSSPublicKeyParameters.Builder(xMSSParameters).withPublicKey(bArr2).build();
        if (!Arrays.areEqual(xMSSPrivateKeyParametersBuild.getRoot(), xMSSPublicKeyParametersBuild.getRoot())) {
            throw new IllegalStateException("root of private key and public key do not match");
        }
        if (!Arrays.areEqual(xMSSPrivateKeyParametersBuild.getPublicSeed(), xMSSPublicKeyParametersBuild.getPublicSeed())) {
            throw new IllegalStateException("public seed of private key and public key do not match");
        }
        this.f91304d = xMSSPrivateKeyParametersBuild;
        this.f91305e = xMSSPublicKeyParametersBuild;
        this.f91302b.f(new byte[xMSSParameters.getTreeDigestSize()], this.f91304d.getPublicSeed());
    }
}

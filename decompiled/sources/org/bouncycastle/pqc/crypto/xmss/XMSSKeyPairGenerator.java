package org.bouncycastle.pqc.crypto.xmss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMSSParameters f91315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f91316b;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        XMSSParameters xMSSParameters = this.f91315a;
        SecureRandom secureRandom = this.f91316b;
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        byte[] bArr = new byte[treeDigestSize];
        secureRandom.nextBytes(bArr);
        byte[] bArr2 = new byte[treeDigestSize];
        secureRandom.nextBytes(bArr2);
        byte[] bArr3 = new byte[treeDigestSize];
        secureRandom.nextBytes(bArr3);
        XMSSPrivateKeyParameters xMSSPrivateKeyParametersBuild = new XMSSPrivateKeyParameters.Builder(xMSSParameters).withSecretKeySeed(bArr).withSecretKeyPRF(bArr2).withPublicSeed(bArr3).withBDSState(new BDS(xMSSParameters, bArr3, bArr, (OTSHashAddress) new OTSHashAddress.Builder().build())).build();
        XMSSNode root = xMSSPrivateKeyParametersBuild.f91388w0.getRoot();
        XMSSPrivateKeyParameters xMSSPrivateKeyParametersBuild2 = new XMSSPrivateKeyParameters.Builder(this.f91315a).withSecretKeySeed(xMSSPrivateKeyParametersBuild.getSecretKeySeed()).withSecretKeyPRF(xMSSPrivateKeyParametersBuild.getSecretKeyPRF()).withPublicSeed(xMSSPrivateKeyParametersBuild.getPublicSeed()).withRoot(root.getValue()).withBDSState(xMSSPrivateKeyParametersBuild.f91388w0).build();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new XMSSPublicKeyParameters.Builder(this.f91315a).withRoot(root.getValue()).withPublicSeed(xMSSPrivateKeyParametersBuild2.getPublicSeed()).build(), (AsymmetricKeyParameter) xMSSPrivateKeyParametersBuild2);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        XMSSKeyGenerationParameters xMSSKeyGenerationParameters = (XMSSKeyGenerationParameters) keyGenerationParameters;
        this.f91316b = xMSSKeyGenerationParameters.getRandom();
        this.f91315a = xMSSKeyGenerationParameters.getParameters();
    }
}

package org.bouncycastle.pqc.crypto.xmss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSMTKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMSSMTParameters f91324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public XMSSParameters f91325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f91326c;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BDSStateMap bDSStateMap = new XMSSMTPrivateKeyParameters.Builder(this.f91324a).build().f91338x0;
        int treeDigestSize = this.f91324a.getTreeDigestSize();
        byte[] bArr = new byte[treeDigestSize];
        this.f91326c.nextBytes(bArr);
        byte[] bArr2 = new byte[treeDigestSize];
        this.f91326c.nextBytes(bArr2);
        byte[] bArr3 = new byte[treeDigestSize];
        this.f91326c.nextBytes(bArr3);
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParametersBuild = new XMSSMTPrivateKeyParameters.Builder(this.f91324a).withSecretKeySeed(bArr).withSecretKeyPRF(bArr2).withPublicSeed(bArr3).withBDSState(bDSStateMap).build();
        this.f91325b.a().f(new byte[this.f91324a.getTreeDigestSize()], xMSSMTPrivateKeyParametersBuild.getPublicSeed());
        int layers = this.f91324a.getLayers() - 1;
        BDS bds = new BDS(this.f91325b, xMSSMTPrivateKeyParametersBuild.getPublicSeed(), xMSSMTPrivateKeyParametersBuild.getSecretKeySeed(), (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(layers).build());
        XMSSNode root = bds.getRoot();
        xMSSMTPrivateKeyParametersBuild.f91338x0.f91277p0.put(Integers.valueOf(layers), bds);
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParametersBuild2 = new XMSSMTPrivateKeyParameters.Builder(this.f91324a).withSecretKeySeed(xMSSMTPrivateKeyParametersBuild.getSecretKeySeed()).withSecretKeyPRF(xMSSMTPrivateKeyParametersBuild.getSecretKeyPRF()).withPublicSeed(xMSSMTPrivateKeyParametersBuild.getPublicSeed()).withRoot(root.getValue()).withBDSState(xMSSMTPrivateKeyParametersBuild.f91338x0).build();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new XMSSMTPublicKeyParameters.Builder(this.f91324a).withRoot(root.getValue()).withPublicSeed(xMSSMTPrivateKeyParametersBuild2.getPublicSeed()).build(), (AsymmetricKeyParameter) xMSSMTPrivateKeyParametersBuild2);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        XMSSMTKeyGenerationParameters xMSSMTKeyGenerationParameters = (XMSSMTKeyGenerationParameters) keyGenerationParameters;
        this.f91326c = xMSSMTKeyGenerationParameters.getRandom();
        XMSSMTParameters parameters = xMSSMTKeyGenerationParameters.getParameters();
        this.f91324a = parameters;
        this.f91325b = parameters.getXMSSParameters();
    }
}

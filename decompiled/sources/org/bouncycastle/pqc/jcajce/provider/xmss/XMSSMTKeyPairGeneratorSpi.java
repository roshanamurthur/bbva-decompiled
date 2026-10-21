package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyPairGenerator;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSMTKeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMSSMTKeyGenerationParameters f91531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final XMSSMTKeyPairGenerator f91532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ASN1ObjectIdentifier f91533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecureRandom f91534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f91535e;

    public XMSSMTKeyPairGeneratorSpi() {
        super("XMSSMT");
        this.f91532b = new XMSSMTKeyPairGenerator();
        this.f91534d = CryptoServicesRegistrar.getSecureRandom();
        this.f91535e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        boolean z10 = this.f91535e;
        XMSSMTKeyPairGenerator xMSSMTKeyPairGenerator = this.f91532b;
        if (!z10) {
            XMSSMTKeyGenerationParameters xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(10, 20, new SHA512Digest()), this.f91534d);
            this.f91531a = xMSSMTKeyGenerationParameters;
            xMSSMTKeyPairGenerator.init(xMSSMTKeyGenerationParameters);
            this.f91535e = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = xMSSMTKeyPairGenerator.generateKeyPair();
        return new KeyPair(new BCXMSSMTPublicKey(this.f91533c, (XMSSMTPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCXMSSMTPrivateKey(this.f91533c, (XMSSMTPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        XMSSMTKeyGenerationParameters xMSSMTKeyGenerationParameters;
        if (!(algorithmParameterSpec instanceof XMSSMTParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a XMSSMTParameterSpec");
        }
        XMSSMTParameterSpec xMSSMTParameterSpec = (XMSSMTParameterSpec) algorithmParameterSpec;
        if (xMSSMTParameterSpec.getTreeDigest().equals("SHA256")) {
            this.f91533c = NISTObjectIdentifiers.id_sha256;
            xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new SHA256Digest()), secureRandom);
        } else if (xMSSMTParameterSpec.getTreeDigest().equals("SHA512")) {
            this.f91533c = NISTObjectIdentifiers.id_sha512;
            xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new SHA512Digest()), secureRandom);
        } else {
            if (!xMSSMTParameterSpec.getTreeDigest().equals("SHAKE128")) {
                if (xMSSMTParameterSpec.getTreeDigest().equals("SHAKE256")) {
                    this.f91533c = NISTObjectIdentifiers.id_shake256;
                    xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new SHAKEDigest(256)), secureRandom);
                }
                this.f91532b.init(this.f91531a);
                this.f91535e = true;
            }
            this.f91533c = NISTObjectIdentifiers.id_shake128;
            xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new SHAKEDigest(128)), secureRandom);
        }
        this.f91531a = xMSSMTKeyGenerationParameters;
        this.f91532b.init(this.f91531a);
        this.f91535e = true;
    }
}

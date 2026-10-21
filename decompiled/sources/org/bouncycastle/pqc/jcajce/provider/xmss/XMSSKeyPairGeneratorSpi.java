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
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyPairGenerator;
import org.bouncycastle.pqc.crypto.xmss.XMSSParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.XMSSParameterSpec;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSKeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMSSKeyGenerationParameters f91526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ASN1ObjectIdentifier f91527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final XMSSKeyPairGenerator f91528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecureRandom f91529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f91530e;

    public XMSSKeyPairGeneratorSpi() {
        super("XMSS");
        this.f91528c = new XMSSKeyPairGenerator();
        this.f91529d = CryptoServicesRegistrar.getSecureRandom();
        this.f91530e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        boolean z10 = this.f91530e;
        XMSSKeyPairGenerator xMSSKeyPairGenerator = this.f91528c;
        if (!z10) {
            XMSSKeyGenerationParameters xMSSKeyGenerationParameters = new XMSSKeyGenerationParameters(new XMSSParameters(10, new SHA512Digest()), this.f91529d);
            this.f91526a = xMSSKeyGenerationParameters;
            xMSSKeyPairGenerator.init(xMSSKeyGenerationParameters);
            this.f91530e = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = xMSSKeyPairGenerator.generateKeyPair();
        return new KeyPair(new BCXMSSPublicKey(this.f91527b, (XMSSPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCXMSSPrivateKey(this.f91527b, (XMSSPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        XMSSKeyGenerationParameters xMSSKeyGenerationParameters;
        if (!(algorithmParameterSpec instanceof XMSSParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a XMSSParameterSpec");
        }
        XMSSParameterSpec xMSSParameterSpec = (XMSSParameterSpec) algorithmParameterSpec;
        if (xMSSParameterSpec.getTreeDigest().equals("SHA256")) {
            this.f91527b = NISTObjectIdentifiers.id_sha256;
            xMSSKeyGenerationParameters = new XMSSKeyGenerationParameters(new XMSSParameters(xMSSParameterSpec.getHeight(), new SHA256Digest()), secureRandom);
        } else if (xMSSParameterSpec.getTreeDigest().equals("SHA512")) {
            this.f91527b = NISTObjectIdentifiers.id_sha512;
            xMSSKeyGenerationParameters = new XMSSKeyGenerationParameters(new XMSSParameters(xMSSParameterSpec.getHeight(), new SHA512Digest()), secureRandom);
        } else {
            if (!xMSSParameterSpec.getTreeDigest().equals("SHAKE128")) {
                if (xMSSParameterSpec.getTreeDigest().equals("SHAKE256")) {
                    this.f91527b = NISTObjectIdentifiers.id_shake256;
                    xMSSKeyGenerationParameters = new XMSSKeyGenerationParameters(new XMSSParameters(xMSSParameterSpec.getHeight(), new SHAKEDigest(256)), secureRandom);
                }
                this.f91528c.init(this.f91526a);
                this.f91530e = true;
            }
            this.f91527b = NISTObjectIdentifiers.id_shake128;
            xMSSKeyGenerationParameters = new XMSSKeyGenerationParameters(new XMSSParameters(xMSSParameterSpec.getHeight(), new SHAKEDigest(128)), secureRandom);
        }
        this.f91526a = xMSSKeyGenerationParameters;
        this.f91528c.init(this.f91526a);
        this.f91530e = true;
    }
}

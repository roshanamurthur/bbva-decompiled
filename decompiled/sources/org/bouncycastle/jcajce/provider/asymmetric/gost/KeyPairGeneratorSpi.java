package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.GOST3410KeyPairGenerator;
import org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

/* JADX INFO: loaded from: classes8.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GOST3410KeyPairGenerator f89969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GOST3410ParameterSpec f89970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f89971c;

    public KeyPairGeneratorSpi() {
        super("GOST3410");
        this.f89969a = new GOST3410KeyPairGenerator();
        this.f89971c = false;
    }

    public final void a(GOST3410ParameterSpec gOST3410ParameterSpec, SecureRandom secureRandom) {
        GOST3410PublicKeyParameterSetSpec publicKeyParameters = gOST3410ParameterSpec.getPublicKeyParameters();
        this.f89969a.init(new GOST3410KeyGenerationParameters(secureRandom, new GOST3410Parameters(publicKeyParameters.getP(), publicKeyParameters.getQ(), publicKeyParameters.getA())));
        this.f89971c = true;
        this.f89970b = gOST3410ParameterSpec;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f89971c) {
            a(new GOST3410ParameterSpec(CryptoProObjectIdentifiers.gostR3410_94_CryptoPro_A.getId()), CryptoServicesRegistrar.getSecureRandom());
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.f89969a.generateKeyPair();
        GOST3410PublicKeyParameters gOST3410PublicKeyParameters = (GOST3410PublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        GOST3410PrivateKeyParameters gOST3410PrivateKeyParameters = (GOST3410PrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        GOST3410ParameterSpec gOST3410ParameterSpec = this.f89970b;
        BCGOST3410PublicKey bCGOST3410PublicKey = new BCGOST3410PublicKey();
        bCGOST3410PublicKey.f89967p0 = gOST3410PublicKeyParameters.getY();
        bCGOST3410PublicKey.f89968q0 = gOST3410ParameterSpec;
        GOST3410ParameterSpec gOST3410ParameterSpec2 = this.f89970b;
        BCGOST3410PrivateKey bCGOST3410PrivateKey = new BCGOST3410PrivateKey();
        bCGOST3410PrivateKey.f89966r0 = new PKCS12BagAttributeCarrierImpl();
        bCGOST3410PrivateKey.f89964p0 = gOST3410PrivateKeyParameters.getX();
        bCGOST3410PrivateKey.f89965q0 = gOST3410ParameterSpec2;
        if (gOST3410ParameterSpec2 != null) {
            return new KeyPair(bCGOST3410PublicKey, bCGOST3410PrivateKey);
        }
        throw new IllegalArgumentException("spec is null");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof GOST3410ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
        }
        a((GOST3410ParameterSpec) algorithmParameterSpec, secureRandom);
    }
}

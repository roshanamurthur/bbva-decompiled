package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.RSAKeyPairGenerator;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/* JADX INFO: loaded from: classes8.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AlgorithmIdentifier f90000c = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AlgorithmIdentifier f90001d = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f90002e = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAKeyPairGenerator f90003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AlgorithmIdentifier f90004b;

    public static class PSS extends KeyPairGeneratorSpi {
        public PSS() {
            super("RSASSA-PSS", KeyPairGeneratorSpi.f90001d);
        }
    }

    public KeyPairGeneratorSpi() {
        this("RSA", f90000c);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.f90003a.generateKeyPair();
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        AlgorithmIdentifier algorithmIdentifier = this.f90004b;
        BCRSAPublicKey bCRSAPublicKey = new BCRSAPublicKey(algorithmIdentifier, rSAKeyParameters);
        BCRSAPrivateCrtKey bCRSAPrivateCrtKey = new BCRSAPrivateCrtKey(rSAPrivateCrtKeyParameters);
        bCRSAPrivateCrtKey.algorithmIdentifier = algorithmIdentifier;
        bCRSAPrivateCrtKey.f89978q0 = rSAPrivateCrtKeyParameters.getPublicExponent();
        bCRSAPrivateCrtKey.f89979r0 = rSAPrivateCrtKeyParameters.getP();
        bCRSAPrivateCrtKey.f89980s0 = rSAPrivateCrtKeyParameters.getQ();
        bCRSAPrivateCrtKey.f89981t0 = rSAPrivateCrtKeyParameters.getDP();
        bCRSAPrivateCrtKey.f89982u0 = rSAPrivateCrtKeyParameters.getDQ();
        bCRSAPrivateCrtKey.v0 = rSAPrivateCrtKeyParameters.getQInv();
        return new KeyPair(bCRSAPublicKey, bCRSAPrivateCrtKey);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.f90003a.init(new RSAKeyGenerationParameters(f90002e, secureRandom, i10, PrimeCertaintyCalculator.getDefaultCertainty(i10)));
    }

    public KeyPairGeneratorSpi(String str, AlgorithmIdentifier algorithmIdentifier) {
        super(str);
        this.f90004b = algorithmIdentifier;
        RSAKeyPairGenerator rSAKeyPairGenerator = new RSAKeyPairGenerator();
        this.f90003a = rSAKeyPairGenerator;
        rSAKeyPairGenerator.init(new RSAKeyGenerationParameters(f90002e, CryptoServicesRegistrar.getSecureRandom(), 2048, PrimeCertaintyCalculator.getDefaultCertainty(2048)));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
        this.f90003a.init(new RSAKeyGenerationParameters(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.getDefaultCertainty(2048)));
    }
}

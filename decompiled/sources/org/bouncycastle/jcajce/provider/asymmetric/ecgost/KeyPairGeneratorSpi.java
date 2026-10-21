package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECGOST3410Parameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes8.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlgorithmParameterSpec f89890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECKeyPairGenerator f89891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89893d;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410");
        this.f89890a = null;
        this.f89891b = new ECKeyPairGenerator();
        this.f89892c = "ECGOST3410";
        this.f89893d = false;
    }

    public final void a(GOST3410ParameterSpec gOST3410ParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        ECDomainParameters byOID = ECGOST3410NamedCurves.getByOID(gOST3410ParameterSpec.getPublicKeyParamSet());
        if (byOID == null) {
            throw new InvalidAlgorithmParameterException("unknown curve: " + gOST3410ParameterSpec.getPublicKeyParamSet());
        }
        this.f89890a = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(gOST3410ParameterSpec.getPublicKeyParamSet()), byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
        this.f89891b.init(new ECKeyGenerationParameters(new ECGOST3410Parameters(new ECNamedDomainParameters(gOST3410ParameterSpec.getPublicKeyParamSet(), byOID), gOST3410ParameterSpec.getPublicKeyParamSet(), gOST3410ParameterSpec.getDigestParamSet(), gOST3410ParameterSpec.getEncryptionParamSet()), secureRandom));
        this.f89893d = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f89893d) {
            throw new IllegalStateException("EC Key Pair Generator not initialised");
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.f89891b.generateKeyPair();
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        AlgorithmParameterSpec algorithmParameterSpec = this.f89890a;
        boolean z10 = algorithmParameterSpec instanceof ECParameterSpec;
        String str = this.f89892c;
        if (z10) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            BCECGOST3410PublicKey bCECGOST3410PublicKey = new BCECGOST3410PublicKey(str, eCPublicKeyParameters, eCParameterSpec);
            return new KeyPair(bCECGOST3410PublicKey, new BCECGOST3410PrivateKey(str, eCPrivateKeyParameters, bCECGOST3410PublicKey, eCParameterSpec));
        }
        if (algorithmParameterSpec == null) {
            return new KeyPair(new BCECGOST3410PublicKey(str, eCPublicKeyParameters), new BCECGOST3410PrivateKey(str, eCPrivateKeyParameters));
        }
        java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
        BCECGOST3410PublicKey bCECGOST3410PublicKey2 = new BCECGOST3410PublicKey(str, eCPublicKeyParameters, eCParameterSpec2);
        return new KeyPair(bCECGOST3410PublicKey2, new BCECGOST3410PrivateKey(str, eCPrivateKeyParameters, bCECGOST3410PublicKey2, eCParameterSpec2));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec = this.f89890a;
        if (algorithmParameterSpec == null) {
            throw new InvalidParameterException("unknown key size.");
        }
        try {
            initialize((ECGenParameterSpec) algorithmParameterSpec, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("key size not configurable.");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        ECKeyGenerationParameters eCKeyGenerationParameters;
        if (algorithmParameterSpec instanceof GOST3410ParameterSpec) {
            a((GOST3410ParameterSpec) algorithmParameterSpec, secureRandom);
            return;
        }
        boolean z10 = algorithmParameterSpec instanceof ECParameterSpec;
        ECKeyPairGenerator eCKeyPairGenerator = this.f89891b;
        if (!z10) {
            if (!(algorithmParameterSpec instanceof java.security.spec.ECParameterSpec)) {
                boolean z11 = algorithmParameterSpec instanceof ECGenParameterSpec;
                if (z11 || (algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec)) {
                    a(new GOST3410ParameterSpec(z11 ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName()), secureRandom);
                    return;
                }
                if (algorithmParameterSpec == null) {
                    ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
                    if (providerConfiguration.getEcImplicitlyCa() != null) {
                        ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
                        this.f89890a = algorithmParameterSpec;
                        eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH()), secureRandom);
                    }
                }
                if (algorithmParameterSpec != null || BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() != null) {
                    throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            }
            java.security.spec.ECParameterSpec eCParameterSpec = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
            this.f89890a = algorithmParameterSpec;
            ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            eCKeyPairGenerator.init(new ECKeyGenerationParameters(new ECDomainParameters(eCCurveConvertCurve, EC5Util.convertPoint(eCCurveConvertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom));
            this.f89893d = true;
        }
        ECParameterSpec eCParameterSpec2 = (ECParameterSpec) algorithmParameterSpec;
        this.f89890a = algorithmParameterSpec;
        eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECDomainParameters(eCParameterSpec2.getCurve(), eCParameterSpec2.getG(), eCParameterSpec2.getN(), eCParameterSpec2.getH()), secureRandom);
        eCKeyPairGenerator.init(eCKeyGenerationParameters);
        this.f89893d = true;
    }
}

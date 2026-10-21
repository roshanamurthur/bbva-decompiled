package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import androidx.camera.core.processing.f;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ua.DSTU4145NamedCurves;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.generators.DSTU4145KeyPairGenerator;
import org.bouncycastle.crypto.params.DSTU4145Parameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.spec.DSTU4145ParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes8.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlgorithmParameterSpec f89816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DSTU4145KeyPairGenerator f89817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ECKeyGenerationParameters f89819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89820e;

    public KeyPairGeneratorSpi() {
        super("DSTU4145");
        this.f89816a = null;
        this.f89817b = new DSTU4145KeyPairGenerator();
        this.f89818c = "DSTU4145";
        this.f89820e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f89820e) {
            throw new IllegalStateException("DSTU Key Pair Generator not initialised");
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.f89817b.generateKeyPair();
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        AlgorithmParameterSpec algorithmParameterSpec = this.f89816a;
        boolean z10 = algorithmParameterSpec instanceof ECParameterSpec;
        String str = this.f89818c;
        if (z10) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(str, eCPublicKeyParameters, eCParameterSpec);
            return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(str, eCPrivateKeyParameters, bCDSTU4145PublicKey, eCParameterSpec));
        }
        if (algorithmParameterSpec == null) {
            return new KeyPair(new BCDSTU4145PublicKey(str, eCPublicKeyParameters), new BCDSTU4145PrivateKey(str, eCPrivateKeyParameters));
        }
        java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
        BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(str, eCPublicKeyParameters, eCParameterSpec2);
        return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(str, eCPrivateKeyParameters, bCDSTU4145PublicKey2, eCParameterSpec2));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec = this.f89816a;
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
        boolean z10 = algorithmParameterSpec instanceof ECParameterSpec;
        DSTU4145KeyPairGenerator dSTU4145KeyPairGenerator = this.f89817b;
        if (!z10) {
            if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
                java.security.spec.ECParameterSpec eCParameterSpec = (java.security.spec.ECParameterSpec) algorithmParameterSpec;
                this.f89816a = algorithmParameterSpec;
                ECCurve eCCurveConvertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                ECPoint eCPointConvertPoint = EC5Util.convertPoint(eCCurveConvertCurve, eCParameterSpec.getGenerator());
                if (eCParameterSpec instanceof DSTU4145ParameterSpec) {
                    this.f89819d = new ECKeyGenerationParameters(new DSTU4145Parameters(new ECDomainParameters(eCCurveConvertCurve, eCPointConvertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), ((DSTU4145ParameterSpec) eCParameterSpec).getDKE()), secureRandom);
                } else {
                    this.f89819d = new ECKeyGenerationParameters(new ECDomainParameters(eCCurveConvertCurve, eCPointConvertPoint, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
                }
                eCKeyGenerationParameters = this.f89819d;
                dSTU4145KeyPairGenerator.init(eCKeyGenerationParameters);
            } else {
                boolean z11 = algorithmParameterSpec instanceof ECGenParameterSpec;
                if (!z11 && !(algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec)) {
                    if (algorithmParameterSpec == null) {
                        ProviderConfiguration providerConfiguration = BouncyCastleProvider.CONFIGURATION;
                        if (providerConfiguration.getEcImplicitlyCa() != null) {
                            ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
                            this.f89816a = algorithmParameterSpec;
                            eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH()), secureRandom);
                        }
                    }
                    if (algorithmParameterSpec != null || BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa() != null) {
                        throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec: ".concat(algorithmParameterSpec.getClass().getName()));
                    }
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
                String name = z11 ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName();
                ECDomainParameters byOID = DSTU4145NamedCurves.getByOID(new ASN1ObjectIdentifier(name));
                if (byOID == null) {
                    throw new InvalidAlgorithmParameterException(f.d("unknown curve name: ", name));
                }
                ECNamedCurveSpec eCNamedCurveSpec = new ECNamedCurveSpec(name, byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
                this.f89816a = eCNamedCurveSpec;
                ECCurve eCCurveConvertCurve2 = EC5Util.convertCurve(eCNamedCurveSpec.getCurve());
                ECKeyGenerationParameters eCKeyGenerationParameters2 = new ECKeyGenerationParameters(new ECDomainParameters(eCCurveConvertCurve2, EC5Util.convertPoint(eCCurveConvertCurve2, eCNamedCurveSpec.getGenerator()), eCNamedCurveSpec.getOrder(), BigInteger.valueOf(eCNamedCurveSpec.getCofactor())), secureRandom);
                this.f89819d = eCKeyGenerationParameters2;
                dSTU4145KeyPairGenerator.init(eCKeyGenerationParameters2);
            }
            this.f89820e = true;
        }
        ECParameterSpec eCParameterSpec2 = (ECParameterSpec) algorithmParameterSpec;
        this.f89816a = algorithmParameterSpec;
        eCKeyGenerationParameters = new ECKeyGenerationParameters(new ECDomainParameters(eCParameterSpec2.getCurve(), eCParameterSpec2.getG(), eCParameterSpec2.getN(), eCParameterSpec2.getH()), secureRandom);
        this.f89819d = eCKeyGenerationParameters;
        dSTU4145KeyPairGenerator.init(eCKeyGenerationParameters);
        this.f89820e = true;
    }
}

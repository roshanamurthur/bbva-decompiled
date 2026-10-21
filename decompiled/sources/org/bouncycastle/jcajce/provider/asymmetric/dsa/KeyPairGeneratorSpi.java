package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.DSAKeyPairGenerator;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes8.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Hashtable f89798f = new Hashtable();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f89799g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DSAKeyGenerationParameters f89800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DSAKeyPairGenerator f89801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f89803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89804e;

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.f89801b = new DSAKeyPairGenerator();
        this.f89802c = 2048;
        this.f89803d = CryptoServicesRegistrar.getSecureRandom();
        this.f89804e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        DSAParametersGenerator dSAParametersGenerator;
        int i10;
        SecureRandom secureRandom;
        if (!this.f89804e) {
            Integer numValueOf = Integers.valueOf(this.f89802c);
            Hashtable hashtable = f89798f;
            if (hashtable.containsKey(numValueOf)) {
                this.f89800a = (DSAKeyGenerationParameters) hashtable.get(numValueOf);
            } else {
                synchronized (f89799g) {
                    try {
                        if (hashtable.containsKey(numValueOf)) {
                            this.f89800a = (DSAKeyGenerationParameters) hashtable.get(numValueOf);
                        } else {
                            int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.f89802c);
                            int i11 = this.f89802c;
                            if (i11 == 1024) {
                                dSAParametersGenerator = new DSAParametersGenerator();
                                if (Properties.isOverrideSet("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                    i10 = this.f89802c;
                                    secureRandom = this.f89803d;
                                    dSAParametersGenerator.init(i10, defaultCertainty, secureRandom);
                                } else {
                                    dSAParametersGenerator.init(new DSAParameterGenerationParameters(1024, 160, defaultCertainty, this.f89803d));
                                }
                            } else if (i11 > 1024) {
                                DSAParameterGenerationParameters dSAParameterGenerationParameters = new DSAParameterGenerationParameters(i11, 256, defaultCertainty, this.f89803d);
                                dSAParametersGenerator = new DSAParametersGenerator(new SHA256Digest());
                                dSAParametersGenerator.init(dSAParameterGenerationParameters);
                            } else {
                                dSAParametersGenerator = new DSAParametersGenerator();
                                i10 = this.f89802c;
                                secureRandom = this.f89803d;
                                dSAParametersGenerator.init(i10, defaultCertainty, secureRandom);
                            }
                            DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(this.f89803d, dSAParametersGenerator.generateParameters());
                            this.f89800a = dSAKeyGenerationParameters;
                            hashtable.put(numValueOf, dSAKeyGenerationParameters);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f89801b.init(this.f89800a);
            this.f89804e = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.f89801b.generateKeyPair();
        DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        DSAPrivateKeyParameters dSAPrivateKeyParameters = (DSAPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        BCDSAPublicKey bCDSAPublicKey = new BCDSAPublicKey();
        bCDSAPublicKey.f89790p0 = dSAPublicKeyParameters.getY();
        bCDSAPublicKey.f89792r0 = new DSAParameterSpec(dSAPublicKeyParameters.getParameters().getP(), dSAPublicKeyParameters.getParameters().getQ(), dSAPublicKeyParameters.getParameters().getG());
        bCDSAPublicKey.f89791q0 = dSAPublicKeyParameters;
        BCDSAPrivateKey bCDSAPrivateKey = new BCDSAPrivateKey();
        bCDSAPrivateKey.f89788r0 = new PKCS12BagAttributeCarrierImpl();
        bCDSAPrivateKey.f89786p0 = dSAPrivateKeyParameters.getX();
        bCDSAPrivateKey.f89787q0 = new DSAParameterSpec(dSAPrivateKeyParameters.getParameters().getP(), dSAPrivateKeyParameters.getParameters().getQ(), dSAPrivateKeyParameters.getParameters().getG());
        return new KeyPair(bCDSAPublicKey, bCDSAPrivateKey);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        boolean z10;
        if (i10 < 512 || i10 > 4096 || ((i10 < 1024 && i10 % 64 != 0) || (i10 >= 1024 && i10 % 1024 != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec dSADefaultParameters = BouncyCastleProvider.CONFIGURATION.getDSADefaultParameters(i10);
        if (dSADefaultParameters != null) {
            DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(secureRandom, new DSAParameters(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.f89800a = dSAKeyGenerationParameters;
            this.f89801b.init(dSAKeyGenerationParameters);
            z10 = true;
        } else {
            this.f89802c = i10;
            this.f89803d = secureRandom;
            z10 = false;
        }
        this.f89804e = z10;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
        DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(secureRandom, new DSAParameters(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.f89800a = dSAKeyGenerationParameters;
        this.f89801b.init(dSAKeyGenerationParameters);
        this.f89804e = true;
    }
}

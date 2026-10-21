package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.bouncycastle.crypto.generators.DHParametersGenerator;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes8.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Hashtable f89778f = new Hashtable();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f89779g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DHKeyGenerationParameters f89780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DHBasicKeyPairGenerator f89781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f89783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89784e;

    public KeyPairGeneratorSpi() {
        super("DH");
        this.f89781b = new DHBasicKeyPairGenerator();
        this.f89782c = 2048;
        this.f89783d = CryptoServicesRegistrar.getSecureRandom();
        this.f89784e = false;
    }

    public static DHKeyGenerationParameters a(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof DHDomainParameterSpec ? new DHKeyGenerationParameters(secureRandom, ((DHDomainParameterSpec) dHParameterSpec).getDomainParameters()) : new DHKeyGenerationParameters(secureRandom, new DHParameters(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        DHKeyGenerationParameters dHKeyGenerationParametersA;
        if (!this.f89784e) {
            Integer numValueOf = Integers.valueOf(this.f89782c);
            Hashtable hashtable = f89778f;
            if (hashtable.containsKey(numValueOf)) {
                dHKeyGenerationParametersA = (DHKeyGenerationParameters) hashtable.get(numValueOf);
            } else {
                DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.f89782c);
                if (dHDefaultParameters != null) {
                    dHKeyGenerationParametersA = a(this.f89783d, dHDefaultParameters);
                } else {
                    synchronized (f89779g) {
                        try {
                            if (hashtable.containsKey(numValueOf)) {
                                this.f89780a = (DHKeyGenerationParameters) hashtable.get(numValueOf);
                            } else {
                                DHParametersGenerator dHParametersGenerator = new DHParametersGenerator();
                                int i10 = this.f89782c;
                                dHParametersGenerator.init(i10, PrimeCertaintyCalculator.getDefaultCertainty(i10), this.f89783d);
                                DHKeyGenerationParameters dHKeyGenerationParameters = new DHKeyGenerationParameters(this.f89783d, dHParametersGenerator.generateParameters());
                                this.f89780a = dHKeyGenerationParameters;
                                hashtable.put(numValueOf, dHKeyGenerationParameters);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                this.f89781b.init(this.f89780a);
                this.f89784e = true;
            }
            this.f89780a = dHKeyGenerationParametersA;
            this.f89781b.init(this.f89780a);
            this.f89784e = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.f89781b.generateKeyPair();
        DHPublicKeyParameters dHPublicKeyParameters = (DHPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        DHPrivateKeyParameters dHPrivateKeyParameters = (DHPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        BCDHPublicKey bCDHPublicKey = new BCDHPublicKey();
        bCDHPublicKey.f89755p0 = dHPublicKeyParameters.getY();
        bCDHPublicKey.f89757r0 = new DHDomainParameterSpec(dHPublicKeyParameters.getParameters());
        bCDHPublicKey.f89756q0 = dHPublicKeyParameters;
        BCDHPrivateKey bCDHPrivateKey = new BCDHPrivateKey();
        bCDHPrivateKey.f89754t0 = new PKCS12BagAttributeCarrierImpl();
        bCDHPrivateKey.f89750p0 = dHPrivateKeyParameters.getX();
        bCDHPrivateKey.f89751q0 = new DHDomainParameterSpec(dHPrivateKeyParameters.getParameters());
        return new KeyPair(bCDHPublicKey, bCDHPrivateKey);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.f89782c = i10;
        this.f89783d = secureRandom;
        this.f89784e = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
        try {
            DHKeyGenerationParameters dHKeyGenerationParametersA = a(secureRandom, (DHParameterSpec) algorithmParameterSpec);
            this.f89780a = dHKeyGenerationParametersA;
            this.f89781b.init(dHKeyGenerationParametersA);
            this.f89784e = true;
        } catch (IllegalArgumentException e5) {
            throw new InvalidAlgorithmParameterException(e5.getMessage(), e5);
        }
    }
}

package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.ElGamalKeyPairGenerator;
import org.bouncycastle.crypto.generators.ElGamalParametersGenerator;
import org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ElGamalKeyGenerationParameters f89957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ElGamalKeyPairGenerator f89958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SecureRandom f89961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f89962f;

    public KeyPairGeneratorSpi() {
        super("ElGamal");
        this.f89958b = new ElGamalKeyPairGenerator();
        this.f89959c = 1024;
        this.f89960d = 20;
        this.f89961e = CryptoServicesRegistrar.getSecureRandom();
        this.f89962f = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        ElGamalKeyGenerationParameters elGamalKeyGenerationParameters;
        boolean z10 = this.f89962f;
        ElGamalKeyPairGenerator elGamalKeyPairGenerator = this.f89958b;
        if (!z10) {
            DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.f89959c);
            if (dHDefaultParameters != null) {
                elGamalKeyGenerationParameters = new ElGamalKeyGenerationParameters(this.f89961e, new ElGamalParameters(dHDefaultParameters.getP(), dHDefaultParameters.getG(), dHDefaultParameters.getL()));
            } else {
                ElGamalParametersGenerator elGamalParametersGenerator = new ElGamalParametersGenerator();
                elGamalParametersGenerator.init(this.f89959c, this.f89960d, this.f89961e);
                elGamalKeyGenerationParameters = new ElGamalKeyGenerationParameters(this.f89961e, elGamalParametersGenerator.generateParameters());
            }
            this.f89957a = elGamalKeyGenerationParameters;
            elGamalKeyPairGenerator.init(this.f89957a);
            this.f89962f = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = elGamalKeyPairGenerator.generateKeyPair();
        ElGamalPublicKeyParameters elGamalPublicKeyParameters = (ElGamalPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic();
        ElGamalPrivateKeyParameters elGamalPrivateKeyParameters = (ElGamalPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate();
        BCElGamalPublicKey bCElGamalPublicKey = new BCElGamalPublicKey();
        bCElGamalPublicKey.f89951p0 = elGamalPublicKeyParameters.getY();
        bCElGamalPublicKey.f89952q0 = new ElGamalParameterSpec(elGamalPublicKeyParameters.getParameters().getP(), elGamalPublicKeyParameters.getParameters().getG());
        BCElGamalPrivateKey bCElGamalPrivateKey = new BCElGamalPrivateKey();
        bCElGamalPrivateKey.f89950r0 = new PKCS12BagAttributeCarrierImpl();
        bCElGamalPrivateKey.f89948p0 = elGamalPrivateKeyParameters.getX();
        bCElGamalPrivateKey.f89949q0 = new ElGamalParameterSpec(elGamalPrivateKeyParameters.getParameters().getP(), elGamalPrivateKeyParameters.getParameters().getG());
        return new KeyPair(bCElGamalPublicKey, bCElGamalPrivateKey);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.f89959c = i10;
        this.f89961e = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        ElGamalKeyGenerationParameters elGamalKeyGenerationParameters;
        boolean z10 = algorithmParameterSpec instanceof ElGamalParameterSpec;
        if (!z10 && !(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
        }
        if (z10) {
            ElGamalParameterSpec elGamalParameterSpec = (ElGamalParameterSpec) algorithmParameterSpec;
            elGamalKeyGenerationParameters = new ElGamalKeyGenerationParameters(secureRandom, new ElGamalParameters(elGamalParameterSpec.getP(), elGamalParameterSpec.getG()));
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            elGamalKeyGenerationParameters = new ElGamalKeyGenerationParameters(secureRandom, new ElGamalParameters(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
        }
        this.f89957a = elGamalKeyGenerationParameters;
        this.f89958b.init(this.f89957a);
        this.f89962f = true;
    }
}

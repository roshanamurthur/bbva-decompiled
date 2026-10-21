package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.ElGamalParametersGenerator;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;

/* JADX INFO: loaded from: classes8.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89946b = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        ElGamalParametersGenerator elGamalParametersGenerator = new ElGamalParametersGenerator();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            elGamalParametersGenerator.init(this.strength, 20, secureRandom);
        } else {
            elGamalParametersGenerator.init(this.strength, 20, CryptoServicesRegistrar.getSecureRandom());
        }
        ElGamalParameters elGamalParametersGenerateParameters = elGamalParametersGenerator.generateParameters();
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("ElGamal");
            algorithmParametersCreateParametersInstance.init(new DHParameterSpec(elGamalParametersGenerateParameters.getP(), elGamalParametersGenerateParameters.getG(), this.f89946b));
            return algorithmParametersCreateParametersInstance;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i10, SecureRandom secureRandom) {
        this.strength = i10;
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
        this.strength = dHGenParameterSpec.getPrimeSize();
        this.f89946b = dHGenParameterSpec.getExponentSize();
        this.random = secureRandom;
    }
}

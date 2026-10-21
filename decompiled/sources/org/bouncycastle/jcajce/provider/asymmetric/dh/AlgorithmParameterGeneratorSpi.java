package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.DHParametersGenerator;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

/* JADX INFO: loaded from: classes8.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 2048;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89748b = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        DHParametersGenerator dHParametersGenerator = new DHParametersGenerator();
        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            dHParametersGenerator.init(this.strength, defaultCertainty, secureRandom);
        } else {
            dHParametersGenerator.init(this.strength, defaultCertainty, CryptoServicesRegistrar.getSecureRandom());
        }
        DHParameters dHParametersGenerateParameters = dHParametersGenerator.generateParameters();
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DH");
            algorithmParametersCreateParametersInstance.init(new DHParameterSpec(dHParametersGenerateParameters.getP(), dHParametersGenerateParameters.getG(), this.f89748b));
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
        this.f89748b = dHGenParameterSpec.getExponentSize();
        this.random = secureRandom;
    }
}

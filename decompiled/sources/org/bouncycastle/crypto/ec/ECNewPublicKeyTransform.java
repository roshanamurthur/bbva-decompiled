package org.bouncycastle.crypto.ec;

import af.e;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: classes2.dex */
public class ECNewPublicKeyTransform implements ECPairTransform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECPublicKeyParameters f88235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f88236b;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public void init(CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException("ECPublicKeyParameters are required for new public key transform.");
            }
            this.f88235a = (ECPublicKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            if (!(cipherParameters instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException("ECPublicKeyParameters are required for new public key transform.");
            }
            this.f88235a = (ECPublicKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f88236b = secureRandom;
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.f88235a;
        if (eCPublicKeyParameters == null) {
            throw new IllegalStateException("ECNewPublicKeyTransform not initialised");
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n7 = parameters.getN();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        BigInteger bigIntegerA = e.a(n7, this.f88236b);
        ECPoint[] eCPointArr = {eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerA), this.f88235a.getQ().multiply(bigIntegerA).add(ECAlgorithms.cleanPoint(parameters.getCurve(), eCPair.getY()))};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}

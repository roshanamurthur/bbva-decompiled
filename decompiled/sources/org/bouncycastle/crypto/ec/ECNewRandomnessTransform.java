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
public class ECNewRandomnessTransform implements ECPairFactorTransform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECPublicKeyParameters f88237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f88238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BigInteger f88239c;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.ec.ECPairFactorTransform
    public BigInteger getTransformValue() {
        return this.f88239c;
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public void init(CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException("ECPublicKeyParameters are required for new randomness transform.");
            }
            this.f88237a = (ECPublicKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            if (!(cipherParameters instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException("ECPublicKeyParameters are required for new randomness transform.");
            }
            this.f88237a = (ECPublicKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f88238b = secureRandom;
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.f88237a;
        if (eCPublicKeyParameters == null) {
            throw new IllegalStateException("ECNewRandomnessTransform not initialised");
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n7 = parameters.getN();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        BigInteger bigIntegerA = e.a(n7, this.f88238b);
        ECPoint[] eCPointArr = {eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerA).add(ECAlgorithms.cleanPoint(parameters.getCurve(), eCPair.getX())), this.f88237a.getQ().multiply(bigIntegerA).add(ECAlgorithms.cleanPoint(parameters.getCurve(), eCPair.getY()))};
        parameters.getCurve().normalizeAll(eCPointArr);
        this.f88239c = bigIntegerA;
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}

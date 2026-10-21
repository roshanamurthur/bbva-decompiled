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
public class ECElGamalEncryptor implements ECEncryptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECPublicKeyParameters f88231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f88232b;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.ec.ECEncryptor
    public ECPair encrypt(ECPoint eCPoint) {
        ECPublicKeyParameters eCPublicKeyParameters = this.f88231a;
        if (eCPublicKeyParameters == null) {
            throw new IllegalStateException("ECElGamalEncryptor not initialised");
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger bigIntegerA = e.a(parameters.getN(), this.f88232b);
        ECPoint[] eCPointArr = {createBasePointMultiplier().multiply(parameters.getG(), bigIntegerA), this.f88231a.getQ().multiply(bigIntegerA).add(ECAlgorithms.cleanPoint(parameters.getCurve(), eCPoint))};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }

    @Override // org.bouncycastle.crypto.ec.ECEncryptor
    public void init(CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException("ECPublicKeyParameters are required for encryption.");
            }
            this.f88231a = (ECPublicKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            if (!(cipherParameters instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException("ECPublicKeyParameters are required for encryption.");
            }
            this.f88231a = (ECPublicKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f88232b = secureRandom;
    }
}

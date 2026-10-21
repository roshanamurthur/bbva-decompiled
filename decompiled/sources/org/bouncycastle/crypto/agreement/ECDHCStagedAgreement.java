package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.StagedAgreement;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECDHCStagedAgreement implements StagedAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECPrivateKeyParameters f87884a;

    public final ECPoint a(ECPublicKeyParameters eCPublicKeyParameters) {
        ECDomainParameters parameters = this.f87884a.getParameters();
        if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new IllegalStateException("ECDHC public key has wrong domain parameters");
        }
        BigInteger bigIntegerMod = parameters.getH().multiply(this.f87884a.getD()).mod(parameters.getN());
        ECPoint eCPointCleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
        if (eCPointCleanPoint.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        ECPoint eCPointNormalize = eCPointCleanPoint.multiply(bigIntegerMod).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
        }
        return eCPointNormalize;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        return a((ECPublicKeyParameters) cipherParameters).getAffineXCoord().toBigInteger();
    }

    @Override // org.bouncycastle.crypto.StagedAgreement
    public AsymmetricKeyParameter calculateStage(CipherParameters cipherParameters) {
        return new ECPublicKeyParameters(a((ECPublicKeyParameters) cipherParameters), this.f87884a.getParameters());
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.f87884a.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        this.f87884a = (ECPrivateKeyParameters) cipherParameters;
    }
}

package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECDHBasicAgreement implements BasicAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECPrivateKeyParameters f87882a;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) cipherParameters;
        ECDomainParameters parameters = this.f87882a.getParameters();
        if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new IllegalStateException("ECDH public key has wrong domain parameters");
        }
        BigInteger d2 = this.f87882a.getD();
        ECPoint eCPointCleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
        if (eCPointCleanPoint.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECDH");
        }
        BigInteger h4 = parameters.getH();
        if (!h4.equals(ECConstants.ONE)) {
            d2 = parameters.getHInv().multiply(d2).mod(parameters.getN());
            eCPointCleanPoint = ECAlgorithms.referenceMultiply(eCPointCleanPoint, h4);
        }
        ECPoint eCPointNormalize = eCPointCleanPoint.multiply(d2).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
        }
        return eCPointNormalize.getAffineXCoord().toBigInteger();
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.f87882a.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        this.f87882a = (ECPrivateKeyParameters) cipherParameters;
    }
}

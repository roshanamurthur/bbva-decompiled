package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.MQVPrivateParameters;
import org.bouncycastle.crypto.params.MQVPublicParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class ECMQVBasicAgreement implements BasicAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MQVPrivateParameters f87886a;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        if (Properties.isOverrideSet("org.bouncycastle.ec.disable_mqv")) {
            throw new IllegalStateException("ECMQV explicitly disabled");
        }
        MQVPublicParameters mQVPublicParameters = (MQVPublicParameters) cipherParameters;
        ECPrivateKeyParameters staticPrivateKey = this.f87886a.getStaticPrivateKey();
        ECDomainParameters parameters = staticPrivateKey.getParameters();
        if (!parameters.equals(mQVPublicParameters.getStaticPublicKey().getParameters())) {
            throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
        }
        ECPrivateKeyParameters ephemeralPrivateKey = this.f87886a.getEphemeralPrivateKey();
        ECPublicKeyParameters ephemeralPublicKey = this.f87886a.getEphemeralPublicKey();
        ECPublicKeyParameters staticPublicKey = mQVPublicParameters.getStaticPublicKey();
        ECPublicKeyParameters ephemeralPublicKey2 = mQVPublicParameters.getEphemeralPublicKey();
        BigInteger n7 = parameters.getN();
        int iBitLength = (n7.bitLength() + 1) / 2;
        BigInteger bigIntegerShiftLeft = ECConstants.ONE.shiftLeft(iBitLength);
        ECCurve curve = parameters.getCurve();
        ECPoint eCPointCleanPoint = ECAlgorithms.cleanPoint(curve, ephemeralPublicKey.getQ());
        ECPoint eCPointCleanPoint2 = ECAlgorithms.cleanPoint(curve, staticPublicKey.getQ());
        ECPoint eCPointCleanPoint3 = ECAlgorithms.cleanPoint(curve, ephemeralPublicKey2.getQ());
        BigInteger bigIntegerMod = staticPrivateKey.getD().multiply(eCPointCleanPoint.getAffineXCoord().toBigInteger().mod(bigIntegerShiftLeft).setBit(iBitLength)).add(ephemeralPrivateKey.getD()).mod(n7);
        BigInteger bit = eCPointCleanPoint3.getAffineXCoord().toBigInteger().mod(bigIntegerShiftLeft).setBit(iBitLength);
        BigInteger bigIntegerMod2 = parameters.getH().multiply(bigIntegerMod).mod(n7);
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(eCPointCleanPoint2, bit.multiply(bigIntegerMod2).mod(n7), eCPointCleanPoint3, bigIntegerMod2).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
        }
        return eCPointNormalize.getAffineXCoord().toBigInteger();
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.f87886a.getStaticPrivateKey().getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        this.f87886a = (MQVPrivateParameters) cipherParameters;
    }
}

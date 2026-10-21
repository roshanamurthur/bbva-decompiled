package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes2.dex */
public class ECVKOAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f87887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ECPrivateKeyParameters f87888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BigInteger f87889c;

    public ECVKOAgreement(Digest digest) {
        this.f87887a = digest;
    }

    public byte[] calculateAgreement(CipherParameters cipherParameters) {
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) cipherParameters;
        ECDomainParameters parameters = this.f87888b.getParameters();
        if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new IllegalStateException("ECVKO public key has wrong domain parameters");
        }
        BigInteger bigIntegerMod = parameters.getH().multiply(this.f87889c).multiply(this.f87888b.getD()).mod(parameters.getN());
        ECPoint eCPointCleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
        if (eCPointCleanPoint.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        ECPoint eCPointNormalize = eCPointCleanPoint.multiply(bigIntegerMod).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
        }
        BigInteger bigInteger = eCPointNormalize.getAffineXCoord().toBigInteger();
        BigInteger bigInteger2 = eCPointNormalize.getAffineYCoord().toBigInteger();
        int i10 = bigInteger.toByteArray().length > 33 ? 64 : 32;
        int i11 = i10 * 2;
        byte[] bArr = new byte[i11];
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(i10, bigInteger);
        byte[] bArrAsUnsignedByteArray2 = BigIntegers.asUnsignedByteArray(i10, bigInteger2);
        for (int i12 = 0; i12 != i10; i12++) {
            bArr[i12] = bArrAsUnsignedByteArray[(i10 - i12) - 1];
        }
        for (int i13 = 0; i13 != i10; i13++) {
            bArr[i10 + i13] = bArrAsUnsignedByteArray2[(i10 - i13) - 1];
        }
        Digest digest = this.f87887a;
        digest.update(bArr, 0, i11);
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr2, 0);
        return bArr2;
    }

    public int getFieldSize() {
        return (this.f87888b.getParameters().getCurve().getFieldSize() + 7) / 8;
    }

    public void init(CipherParameters cipherParameters) {
        ParametersWithUKM parametersWithUKM = (ParametersWithUKM) cipherParameters;
        this.f87888b = (ECPrivateKeyParameters) parametersWithUKM.getParameters();
        byte[] ukm = parametersWithUKM.getUKM();
        int length = ukm.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = ukm[(ukm.length - i10) - 1];
        }
        this.f87889c = new BigInteger(1, bArr);
    }
}

package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.SM2KeyExchangePrivateParameters;
import org.bouncycastle.crypto.params.SM2KeyExchangePublicParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class SM2KeyExchange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f87892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f87893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ECPrivateKeyParameters f87894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ECPoint f87895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ECPoint f87896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ECDomainParameters f87897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ECPrivateKeyParameters f87899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f87900i;

    public SM2KeyExchange() {
        this(new SM3Digest());
    }

    public static void a(Digest digest, ECFieldElement eCFieldElement) {
        byte[] encoded = eCFieldElement.getEncoded();
        digest.update(encoded, 0, encoded.length);
    }

    public final byte[] b(Digest digest, ECPoint eCPoint, byte[] bArr, byte[] bArr2, ECPoint eCPoint2, ECPoint eCPoint3) {
        a(digest, eCPoint.getAffineXCoord());
        digest.update(bArr, 0, bArr.length);
        digest.update(bArr2, 0, bArr2.length);
        a(digest, eCPoint2.getAffineXCoord());
        a(digest, eCPoint2.getAffineYCoord());
        a(digest, eCPoint3.getAffineXCoord());
        a(digest, eCPoint3.getAffineYCoord());
        Digest digest2 = this.f87892a;
        byte[] bArr3 = new byte[digest2.getDigestSize()];
        digest2.doFinal(bArr3, 0);
        return bArr3;
    }

    public final ECPoint c(SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters) {
        ECDomainParameters parameters = this.f87894c.getParameters();
        ECPoint eCPointCleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), sM2KeyExchangePublicParameters.getStaticPublicKey().getQ());
        ECPoint eCPointCleanPoint2 = ECAlgorithms.cleanPoint(parameters.getCurve(), sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ());
        BigInteger bit = this.f87896e.getAffineXCoord().toBigInteger().and(BigInteger.valueOf(1L).shiftLeft(this.f87898g).subtract(BigInteger.valueOf(1L))).setBit(this.f87898g);
        BigInteger bit2 = eCPointCleanPoint2.getAffineXCoord().toBigInteger().and(BigInteger.valueOf(1L).shiftLeft(this.f87898g).subtract(BigInteger.valueOf(1L))).setBit(this.f87898g);
        BigInteger bigIntegerMod = this.f87897f.getH().multiply(this.f87894c.getD().add(bit.multiply(this.f87899h.getD()))).mod(this.f87897f.getN());
        return ECAlgorithms.sumOfTwoMultiplies(eCPointCleanPoint, bigIntegerMod, eCPointCleanPoint2, bigIntegerMod.multiply(bit2).mod(this.f87897f.getN())).normalize();
    }

    public byte[] calculateKey(int i10, CipherParameters cipherParameters) {
        SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters;
        byte[] id;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) parametersWithID.getParameters();
            id = parametersWithID.getID();
        } else {
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) cipherParameters;
            id = new byte[0];
        }
        byte[] bArr = this.f87893b;
        ECPoint eCPoint = this.f87895d;
        Digest digest = this.f87892a;
        byte[] bArrD = d(digest, eCPoint, bArr);
        byte[] bArrD2 = d(digest, sM2KeyExchangePublicParameters.getStaticPublicKey().getQ(), id);
        ECPoint eCPointC = c(sM2KeyExchangePublicParameters);
        return this.f87900i ? e(eCPointC, bArrD, bArrD2, i10) : e(eCPointC, bArrD2, bArrD, i10);
    }

    public byte[][] calculateKeyWithConfirmation(int i10, byte[] bArr, CipherParameters cipherParameters) {
        SM2KeyExchangePublicParameters sM2KeyExchangePublicParameters;
        byte[] id;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) parametersWithID.getParameters();
            id = parametersWithID.getID();
        } else {
            sM2KeyExchangePublicParameters = (SM2KeyExchangePublicParameters) cipherParameters;
            id = new byte[0];
        }
        if (this.f87900i && bArr == null) {
            throw new IllegalArgumentException("if initiating, confirmationTag must be set");
        }
        byte[] bArr2 = this.f87893b;
        ECPoint eCPoint = this.f87895d;
        Digest digest = this.f87892a;
        byte[] bArrD = d(digest, eCPoint, bArr2);
        byte[] bArrD2 = d(digest, sM2KeyExchangePublicParameters.getStaticPublicKey().getQ(), id);
        ECPoint eCPointC = c(sM2KeyExchangePublicParameters);
        if (!this.f87900i) {
            byte[] bArrE = e(eCPointC, bArrD2, bArrD, i10);
            byte[] bArrB = b(this.f87892a, eCPointC, bArrD2, bArrD, sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ(), this.f87896e);
            digest.update((byte) 2);
            a(digest, eCPointC.getAffineYCoord());
            digest.update(bArrB, 0, bArrB.length);
            byte[] bArr3 = new byte[digest.getDigestSize()];
            digest.doFinal(bArr3, 0);
            digest.update((byte) 3);
            a(digest, eCPointC.getAffineYCoord());
            digest.update(bArrB, 0, bArrB.length);
            byte[] bArr4 = new byte[digest.getDigestSize()];
            digest.doFinal(bArr4, 0);
            return new byte[][]{bArrE, bArr3, bArr4};
        }
        byte[] bArrE2 = e(eCPointC, bArrD, bArrD2, i10);
        byte[] bArrB2 = b(this.f87892a, eCPointC, bArrD, bArrD2, this.f87896e, sM2KeyExchangePublicParameters.getEphemeralPublicKey().getQ());
        digest.update((byte) 2);
        a(digest, eCPointC.getAffineYCoord());
        digest.update(bArrB2, 0, bArrB2.length);
        byte[] bArr5 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr5, 0);
        if (!Arrays.constantTimeAreEqual(bArr5, bArr)) {
            throw new IllegalStateException("confirmation tag mismatch");
        }
        digest.update((byte) 3);
        a(digest, eCPointC.getAffineYCoord());
        digest.update(bArrB2, 0, bArrB2.length);
        byte[] bArr6 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr6, 0);
        return new byte[][]{bArrE2, bArr6};
    }

    public final byte[] d(Digest digest, ECPoint eCPoint, byte[] bArr) {
        int length = bArr.length * 8;
        digest.update((byte) (length >>> 8));
        digest.update((byte) length);
        digest.update(bArr, 0, bArr.length);
        a(digest, this.f87897f.getCurve().getA());
        a(digest, this.f87897f.getCurve().getB());
        a(digest, this.f87897f.getG().getAffineXCoord());
        a(digest, this.f87897f.getG().getAffineYCoord());
        a(digest, eCPoint.getAffineXCoord());
        a(digest, eCPoint.getAffineYCoord());
        Digest digest2 = this.f87892a;
        byte[] bArr2 = new byte[digest2.getDigestSize()];
        digest2.doFinal(bArr2, 0);
        return bArr2;
    }

    public final byte[] e(ECPoint eCPoint, byte[] bArr, byte[] bArr2, int i10) {
        Memoable memoable;
        Memoable memoableCopy;
        Digest digest = this.f87892a;
        int digestSize = digest.getDigestSize();
        byte[] bArr3 = new byte[Math.max(4, digestSize)];
        int i11 = (i10 + 7) / 8;
        byte[] bArr4 = new byte[i11];
        if (digest instanceof Memoable) {
            a(digest, eCPoint.getAffineXCoord());
            a(digest, eCPoint.getAffineYCoord());
            digest.update(bArr, 0, bArr.length);
            digest.update(bArr2, 0, bArr2.length);
            memoable = (Memoable) digest;
            memoableCopy = memoable.copy();
        } else {
            memoable = null;
            memoableCopy = null;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            if (memoable != null) {
                memoable.reset(memoableCopy);
            } else {
                a(digest, eCPoint.getAffineXCoord());
                a(digest, eCPoint.getAffineYCoord());
                digest.update(bArr, 0, bArr.length);
                digest.update(bArr2, 0, bArr2.length);
            }
            i13++;
            Pack.intToBigEndian(i13, bArr3, 0);
            digest.update(bArr3, 0, 4);
            digest.doFinal(bArr3, 0);
            int iMin = Math.min(digestSize, i11 - i12);
            System.arraycopy(bArr3, 0, bArr4, i12, iMin);
            i12 += iMin;
        }
        return bArr4;
    }

    public void init(CipherParameters cipherParameters) {
        SM2KeyExchangePrivateParameters sM2KeyExchangePrivateParameters;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            sM2KeyExchangePrivateParameters = (SM2KeyExchangePrivateParameters) parametersWithID.getParameters();
            this.f87893b = parametersWithID.getID();
        } else {
            sM2KeyExchangePrivateParameters = (SM2KeyExchangePrivateParameters) cipherParameters;
            this.f87893b = new byte[0];
        }
        this.f87900i = sM2KeyExchangePrivateParameters.isInitiator();
        this.f87894c = sM2KeyExchangePrivateParameters.getStaticPrivateKey();
        this.f87899h = sM2KeyExchangePrivateParameters.getEphemeralPrivateKey();
        this.f87897f = this.f87894c.getParameters();
        this.f87895d = sM2KeyExchangePrivateParameters.getStaticPublicPoint();
        this.f87896e = sM2KeyExchangePrivateParameters.getEphemeralPublicPoint();
        this.f87898g = (this.f87897f.getCurve().getFieldSize() / 2) - 1;
    }

    public SM2KeyExchange(Digest digest) {
        this.f87892a = digest;
    }
}

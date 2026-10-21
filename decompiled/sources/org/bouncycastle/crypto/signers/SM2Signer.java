package org.bouncycastle.crypto.signers;

import ci.a;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class SM2Signer implements Signer, ECConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomDSAKCalculator f89597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Digest f89598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DSAEncoding f89599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ECDomainParameters f89600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ECPoint f89601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ECKeyParameters f89602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f89603g;

    public SM2Signer() {
        this(StandardDSAEncoding.INSTANCE, new SM3Digest());
    }

    public static void a(Digest digest, ECFieldElement eCFieldElement) {
        byte[] encoded = eCFieldElement.getEncoded();
        digest.update(encoded, 0, encoded.length);
    }

    public final boolean b(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger n7 = this.f89600d.getN();
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n7) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n7) >= 0) {
            return false;
        }
        Digest digest = this.f89598b;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        reset();
        BigInteger bigIntegerCalculateE = calculateE(n7, bArr);
        BigInteger bigIntegerMod = bigInteger.add(bigInteger2).mod(n7);
        if (bigIntegerMod.equals(ECConstants.ZERO)) {
            return false;
        }
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(this.f89600d.getG(), bigInteger2, ((ECPublicKeyParameters) this.f89602f).getQ(), bigIntegerMod).normalize();
        if (eCPointNormalize.isInfinity()) {
            return false;
        }
        return bigIntegerCalculateE.add(eCPointNormalize.getAffineXCoord().toBigInteger()).mod(n7).equals(bigInteger);
    }

    public BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        Digest digest = this.f89598b;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        reset();
        BigInteger n7 = this.f89600d.getN();
        BigInteger bigIntegerCalculateE = calculateE(n7, bArr);
        BigInteger d2 = ((ECPrivateKeyParameters) this.f89602f).getD();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerNextK = this.f89597a.nextK();
            BigInteger bigIntegerMod = bigIntegerCalculateE.add(eCMultiplierCreateBasePointMultiplier.multiply(this.f89600d.getG(), bigIntegerNextK).normalize().getAffineXCoord().toBigInteger()).mod(n7);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!bigIntegerMod.equals(bigInteger) && !bigIntegerMod.add(bigIntegerNextK).equals(n7)) {
                BigInteger bigIntegerMod2 = d2.add(ECConstants.ONE).modInverse(n7).multiply(bigIntegerNextK.subtract(bigIntegerMod.multiply(d2)).mod(n7)).mod(n7);
                if (!bigIntegerMod2.equals(bigInteger)) {
                    try {
                        return this.f89599c.encode(this.f89600d.getN(), bigIntegerMod, bigIntegerMod2);
                    } catch (Exception e5) {
                        throw new CryptoException(a.b(e5, new StringBuilder("unable to encode signature: ")), e5);
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z10, CipherParameters cipherParameters) {
        byte[] bArrDecodeStrict;
        ECPoint q10;
        BigInteger n7;
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            CipherParameters parameters = parametersWithID.getParameters();
            byte[] id = parametersWithID.getID();
            if (id.length >= 8192) {
                throw new IllegalArgumentException("SM2 user ID must be less than 2^16 bits long");
            }
            bArrDecodeStrict = id;
            cipherParameters = parameters;
        } else {
            bArrDecodeStrict = Hex.decodeStrict("31323334353637383132333435363738");
        }
        if (z10) {
            boolean z11 = cipherParameters instanceof ParametersWithRandom;
            RandomDSAKCalculator randomDSAKCalculator = this.f89597a;
            if (z11) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                ECKeyParameters eCKeyParameters = (ECKeyParameters) parametersWithRandom.getParameters();
                this.f89602f = eCKeyParameters;
                ECDomainParameters parameters2 = eCKeyParameters.getParameters();
                this.f89600d = parameters2;
                n7 = parameters2.getN();
                secureRandom = parametersWithRandom.getRandom();
            } else {
                ECKeyParameters eCKeyParameters2 = (ECKeyParameters) cipherParameters;
                this.f89602f = eCKeyParameters2;
                ECDomainParameters parameters3 = eCKeyParameters2.getParameters();
                this.f89600d = parameters3;
                n7 = parameters3.getN();
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
            }
            randomDSAKCalculator.init(n7, secureRandom);
            q10 = createBasePointMultiplier().multiply(this.f89600d.getG(), ((ECPrivateKeyParameters) this.f89602f).getD()).normalize();
        } else {
            ECKeyParameters eCKeyParameters3 = (ECKeyParameters) cipherParameters;
            this.f89602f = eCKeyParameters3;
            this.f89600d = eCKeyParameters3.getParameters();
            q10 = ((ECPublicKeyParameters) this.f89602f).getQ();
        }
        this.f89601e = q10;
        Digest digest = this.f89598b;
        digest.reset();
        int length = bArrDecodeStrict.length * 8;
        digest.update((byte) ((length >> 8) & 255));
        digest.update((byte) (length & 255));
        digest.update(bArrDecodeStrict, 0, bArrDecodeStrict.length);
        a(digest, this.f89600d.getCurve().getA());
        a(digest, this.f89600d.getCurve().getB());
        a(digest, this.f89600d.getG().getAffineXCoord());
        a(digest, this.f89600d.getG().getAffineYCoord());
        a(digest, this.f89601e.getAffineXCoord());
        a(digest, this.f89601e.getAffineYCoord());
        int digestSize = digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        digest.doFinal(bArr, 0);
        this.f89603g = bArr;
        digest.update(bArr, 0, digestSize);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        Digest digest = this.f89598b;
        digest.reset();
        byte[] bArr = this.f89603g;
        if (bArr != null) {
            digest.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.f89598b.update(b10);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        try {
            BigInteger[] bigIntegerArrDecode = this.f89599c.decode(this.f89600d.getN(), bArr);
            return b(bigIntegerArrDecode[0], bigIntegerArrDecode[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    public SM2Signer(Digest digest) {
        this(StandardDSAEncoding.INSTANCE, digest);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.f89598b.update(bArr, i10, i11);
    }

    public SM2Signer(DSAEncoding dSAEncoding) {
        this.f89597a = new RandomDSAKCalculator();
        this.f89599c = dSAEncoding;
        this.f89598b = new SM3Digest();
    }

    public SM2Signer(DSAEncoding dSAEncoding, Digest digest) {
        this.f89597a = new RandomDSAKCalculator();
        this.f89599c = dSAEncoding;
        this.f89598b = digest;
    }
}

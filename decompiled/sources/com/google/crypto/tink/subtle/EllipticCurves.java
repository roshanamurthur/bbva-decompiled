package com.google.crypto.tink.subtle;

import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.noknok.android.client.asm.authenticator.KSUtils;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public final class EllipticCurves {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CurveType {
        private static final /* synthetic */ CurveType[] $VALUES;
        public static final CurveType NIST_P256;
        public static final CurveType NIST_P384;
        public static final CurveType NIST_P521;

        static {
            CurveType curveType = new CurveType("NIST_P256", 0);
            NIST_P256 = curveType;
            CurveType curveType2 = new CurveType("NIST_P384", 1);
            NIST_P384 = curveType2;
            CurveType curveType3 = new CurveType("NIST_P521", 2);
            NIST_P521 = curveType3;
            $VALUES = new CurveType[]{curveType, curveType2, curveType3};
        }

        public CurveType() {
            throw null;
        }

        public static CurveType valueOf(String str) {
            return (CurveType) Enum.valueOf(CurveType.class, str);
        }

        public static CurveType[] values() {
            return (CurveType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EcdsaEncoding {
        private static final /* synthetic */ EcdsaEncoding[] $VALUES;
        public static final EcdsaEncoding DER;
        public static final EcdsaEncoding IEEE_P1363;

        static {
            EcdsaEncoding ecdsaEncoding = new EcdsaEncoding("IEEE_P1363", 0);
            IEEE_P1363 = ecdsaEncoding;
            EcdsaEncoding ecdsaEncoding2 = new EcdsaEncoding(ASN1Encoding.DER, 1);
            DER = ecdsaEncoding2;
            $VALUES = new EcdsaEncoding[]{ecdsaEncoding, ecdsaEncoding2};
        }

        public EcdsaEncoding() {
            throw null;
        }

        public static EcdsaEncoding valueOf(String str) {
            return (EcdsaEncoding) Enum.valueOf(EcdsaEncoding.class, str);
        }

        public static EcdsaEncoding[] values() {
            return (EcdsaEncoding[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PointFormatType {
        private static final /* synthetic */ PointFormatType[] $VALUES;
        public static final PointFormatType COMPRESSED;
        public static final PointFormatType DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        public static final PointFormatType UNCOMPRESSED;

        static {
            PointFormatType pointFormatType = new PointFormatType("UNCOMPRESSED", 0);
            UNCOMPRESSED = pointFormatType;
            PointFormatType pointFormatType2 = new PointFormatType("COMPRESSED", 1);
            COMPRESSED = pointFormatType2;
            PointFormatType pointFormatType3 = new PointFormatType("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
            DO_NOT_USE_CRUNCHY_UNCOMPRESSED = pointFormatType3;
            $VALUES = new PointFormatType[]{pointFormatType, pointFormatType2, pointFormatType3};
        }

        public PointFormatType() {
            throw null;
        }

        public static PointFormatType valueOf(String str) {
            return (PointFormatType) Enum.valueOf(PointFormatType.class, str);
        }

        public static PointFormatType[] values() {
            return (PointFormatType[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f47460b;

        static {
            int[] iArr = new int[CurveType.values().length];
            f47460b = iArr;
            try {
                iArr[CurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47460b[CurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47460b[CurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[PointFormatType.values().length];
            f47459a = iArr2;
            try {
                iArr2[PointFormatType.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47459a[PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47459a[PointFormatType.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        int length = 0;
        while (length < bArr.length && bArr[length] == 0) {
            length++;
        }
        if (length == bArr.length) {
            length = bArr.length - 1;
        }
        int i10 = (bArr[length] & 128) == 128 ? 1 : 0;
        byte[] bArr2 = new byte[(bArr.length - length) + i10];
        System.arraycopy(bArr, length, bArr2, i10, bArr.length - length);
        return bArr2;
    }

    public static void b(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (isSameEcParameterSpec(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e5) {
            throw new GeneralSecurityException(e5);
        }
    }

    public static byte[] computeSharedSecret(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        b(eCPublicKey, eCPrivateKey);
        return computeSharedSecret(eCPrivateKey, eCPublicKey.getW());
    }

    public static ECPoint ecPointDecode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        return pointDecode(ellipticCurve, pointFormatType, bArr);
    }

    public static byte[] ecdsaDer2Ieee(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!isValidDerEncoding(bArr)) {
            throw new GeneralSecurityException("Invalid DER encoding");
        }
        byte[] bArr2 = new byte[i10];
        int i11 = (bArr[1] & 255) >= 128 ? 3 : 2;
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = bArr[i12];
        int i15 = bArr[i13] == 0 ? 1 : 0;
        System.arraycopy(bArr, i13 + i15, bArr2, ((i10 / 2) - i14) + i15, i14 - i15);
        int i16 = i14 + 1 + i13;
        int i17 = i16 + 1;
        int i18 = bArr[i16];
        int i19 = bArr[i17] != 0 ? 0 : 1;
        System.arraycopy(bArr, i17 + i19, bArr2, (i10 - i18) + i19, i18 - i19);
        return bArr2;
    }

    public static byte[] ecdsaIeee2Der(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i10;
        if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        byte[] bArrA = a(Arrays.copyOf(bArr, bArr.length / 2));
        byte[] bArrA2 = a(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
        int length = bArrA.length + 4 + bArrA2.length;
        if (length >= 128) {
            bArr2 = new byte[length + 3];
            bArr2[0] = 48;
            bArr2[1] = KSUtils.PLAIN_BUFFER;
            bArr2[2] = (byte) length;
            i10 = 3;
        } else {
            bArr2 = new byte[length + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) length;
            i10 = 2;
        }
        int i11 = i10 + 1;
        bArr2[i10] = 2;
        int i12 = i10 + 2;
        bArr2[i11] = (byte) bArrA.length;
        System.arraycopy(bArrA, 0, bArr2, i12, bArrA.length);
        int length2 = i12 + bArrA.length;
        bArr2[length2] = 2;
        bArr2[length2 + 1] = (byte) bArrA2.length;
        System.arraycopy(bArrA2, 0, bArr2, length2 + 2, bArrA2.length);
        return bArr2;
    }

    public static int encodingSizeInBytes(EllipticCurve ellipticCurve, PointFormatType pointFormatType) throws GeneralSecurityException {
        int iFieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i10 = a.f47459a[pointFormatType.ordinal()];
        if (i10 == 1) {
            return (iFieldSizeInBytes * 2) + 1;
        }
        if (i10 == 2) {
            return iFieldSizeInBytes * 2;
        }
        if (i10 == 3) {
            return iFieldSizeInBytes + 1;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static int fieldSizeInBits(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return getModulus(ellipticCurve).subtract(BigInteger.ONE).bitLength();
    }

    public static int fieldSizeInBytes(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (fieldSizeInBits(ellipticCurve) + 7) / 8;
    }

    public static KeyPair generateKeyPair(CurveType curveType) throws GeneralSecurityException {
        return generateKeyPair(getCurveSpec(curveType));
    }

    public static ECParameterSpec getCurveSpec(CurveType curveType) throws NoSuchAlgorithmException {
        int i10 = a.f47460b[curveType.ordinal()];
        if (i10 == 1) {
            return getNistP256Params();
        }
        if (i10 == 2) {
            return getNistP384Params();
        }
        if (i10 == 3) {
            return getNistP521Params();
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + curveType);
    }

    public static ECPrivateKey getEcPrivateKey(byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC).generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    public static ECPublicKey getEcPublicKey(byte[] bArr) throws GeneralSecurityException {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC).generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static BigInteger getModulus(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return EllipticCurvesUtil.getModulus(ellipticCurve);
    }

    public static ECParameterSpec getNistP256Params() {
        return EllipticCurvesUtil.NIST_P256_PARAMS;
    }

    public static ECParameterSpec getNistP384Params() {
        return EllipticCurvesUtil.NIST_P384_PARAMS;
    }

    public static ECParameterSpec getNistP521Params() {
        return EllipticCurvesUtil.NIST_P521_PARAMS;
    }

    public static BigInteger getY(BigInteger bigInteger, boolean z10, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger modulus = getModulus(ellipticCurve);
        BigInteger bigIntegerModSqrt = modSqrt(bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(modulus), modulus);
        return z10 != bigIntegerModSqrt.testBit(0) ? modulus.subtract(bigIntegerModSqrt).mod(modulus) : bigIntegerModSqrt;
    }

    public static boolean isNistEcParameterSpec(ECParameterSpec eCParameterSpec) {
        return EllipticCurvesUtil.isNistEcParameterSpec(eCParameterSpec);
    }

    public static boolean isSameEcParameterSpec(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return EllipticCurvesUtil.isSameEcParameterSpec(eCParameterSpec, eCParameterSpec2);
    }

    public static boolean isValidDerEncoding(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (bArr.length < 8 || bArr[0] != 48) {
            return false;
        }
        int i14 = bArr[1] & 255;
        if (i14 == 129) {
            i14 = bArr[2] & 255;
            if (i14 < 128) {
                return false;
            }
            i10 = 2;
        } else {
            if (i14 == 128 || i14 > 129) {
                return false;
            }
            i10 = 1;
        }
        if (i14 != (bArr.length - 1) - i10 || bArr[i10 + 1] != 2 || (i13 = (i12 = i10 + 3 + (i11 = bArr[i10 + 2] & 255)) + 1) >= bArr.length || i11 == 0) {
            return false;
        }
        int i15 = i10 + 3;
        byte b10 = bArr[i15];
        if ((b10 & 255) >= 128) {
            return false;
        }
        if ((i11 > 1 && b10 == 0 && (bArr[i10 + 4] & 255) < 128) || bArr[i15 + i11] != 2) {
            return false;
        }
        int i16 = bArr[i13] & 255;
        if (i12 + 2 + i16 != bArr.length || i16 == 0) {
            return false;
        }
        byte b11 = bArr[i10 + 5 + i11];
        if ((b11 & 255) >= 128) {
            return false;
        }
        return i16 <= 1 || b11 != 0 || (bArr[(i10 + 6) + i11] & 255) >= 128;
    }

    public static BigInteger modSqrt(BigInteger bigInteger, BigInteger bigInteger2) throws GeneralSecurityException {
        BigInteger bigIntegerModPow;
        if (bigInteger2.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigIntegerMod.equals(bigInteger3)) {
            return bigInteger3;
        }
        int i10 = 0;
        if (bigInteger2.testBit(0) && bigInteger2.testBit(1)) {
            bigIntegerModPow = bigIntegerMod.modPow(bigInteger2.add(BigInteger.ONE).shiftRight(2), bigInteger2);
        } else if (!bigInteger2.testBit(0) || bigInteger2.testBit(1)) {
            bigIntegerModPow = null;
        } else {
            BigInteger bigIntegerAdd = BigInteger.ONE;
            BigInteger bigIntegerShiftRight = bigInteger2.subtract(bigIntegerAdd).shiftRight(1);
            while (true) {
                BigInteger bigIntegerMod2 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod).mod(bigInteger2);
                if (bigIntegerMod2.equals(BigInteger.ZERO)) {
                    return bigIntegerAdd;
                }
                BigInteger bigIntegerModPow2 = bigIntegerMod2.modPow(bigIntegerShiftRight, bigInteger2);
                BigInteger bigIntegerMod3 = BigInteger.ONE;
                if (bigIntegerModPow2.add(bigIntegerMod3).equals(bigInteger2)) {
                    BigInteger bigIntegerShiftRight2 = bigInteger2.add(bigIntegerMod3).shiftRight(1);
                    BigInteger bigIntegerMod4 = bigIntegerAdd;
                    for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                        BigInteger bigIntegerMultiply = bigIntegerMod4.multiply(bigIntegerMod3);
                        bigIntegerMod4 = bigIntegerMod4.multiply(bigIntegerMod4).add(bigIntegerMod3.multiply(bigIntegerMod3).mod(bigInteger2).multiply(bigIntegerMod2)).mod(bigInteger2);
                        BigInteger bigIntegerMod5 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigInteger2);
                        if (bigIntegerShiftRight2.testBit(iBitLength)) {
                            BigInteger bigIntegerMod6 = bigIntegerMod4.multiply(bigIntegerAdd).add(bigIntegerMod5.multiply(bigIntegerMod2)).mod(bigInteger2);
                            bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerMod5).add(bigIntegerMod4).mod(bigInteger2);
                            bigIntegerMod4 = bigIntegerMod6;
                        } else {
                            bigIntegerMod3 = bigIntegerMod5;
                        }
                    }
                    bigIntegerModPow = bigIntegerMod4;
                    break;
                }
                if (!bigIntegerModPow2.equals(bigIntegerMod3)) {
                    throw new InvalidAlgorithmParameterException("p is not prime");
                }
                bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod3);
                i10++;
                if (i10 == 128 && !bigInteger2.isProbablePrime(80)) {
                    throw new InvalidAlgorithmParameterException("p is not prime");
                }
            }
        }
        if (bigIntegerModPow == null || bigIntegerModPow.multiply(bigIntegerModPow).mod(bigInteger2).compareTo(bigIntegerMod) == 0) {
            return bigIntegerModPow;
        }
        throw new GeneralSecurityException("Could not find a modular square root");
    }

    public static ECPoint pointDecode(CurveType curveType, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        return pointDecode(getCurveSpec(curveType).getCurve(), pointFormatType, bArr);
    }

    public static byte[] pointEncode(CurveType curveType, PointFormatType pointFormatType, ECPoint eCPoint) throws GeneralSecurityException {
        return pointEncode(getCurveSpec(curveType).getCurve(), pointFormatType, eCPoint);
    }

    public static void validatePublicKey(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        b(eCPublicKey, eCPrivateKey);
        EllipticCurvesUtil.checkPointOnCurve(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    public static KeyPair generateKeyPair(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator engineFactory = EngineFactory.KEY_PAIR_GENERATOR.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC);
        engineFactory.initialize(eCParameterSpec);
        return engineFactory.generateKeyPair();
    }

    public static ECPoint pointDecode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        int iFieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i10 = a.f47459a[pointFormatType.ordinal()];
        boolean z10 = false;
        if (i10 == 1) {
            if (bArr.length != (iFieldSizeInBytes * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i11 = iFieldSizeInBytes + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i11)), new BigInteger(1, Arrays.copyOfRange(bArr, i11, bArr.length)));
            EllipticCurvesUtil.checkPointOnCurve(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (i10 == 2) {
            if (bArr.length != iFieldSizeInBytes * 2) {
                throw new GeneralSecurityException("invalid point size");
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, iFieldSizeInBytes)), new BigInteger(1, Arrays.copyOfRange(bArr, iFieldSizeInBytes, bArr.length)));
            EllipticCurvesUtil.checkPointOnCurve(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        if (i10 != 3) {
            throw new GeneralSecurityException("invalid format:" + pointFormatType);
        }
        BigInteger modulus = getModulus(ellipticCurve);
        if (bArr.length != iFieldSizeInBytes + 1) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b10 = bArr[0];
        if (b10 != 2) {
            if (b10 != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            z10 = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        return new ECPoint(bigInteger, getY(bigInteger, z10, ellipticCurve));
    }

    public static byte[] pointEncode(EllipticCurve ellipticCurve, PointFormatType pointFormatType, ECPoint eCPoint) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(eCPoint, ellipticCurve);
        int iFieldSizeInBytes = fieldSizeInBytes(ellipticCurve);
        int i10 = a.f47459a[pointFormatType.ordinal()];
        if (i10 == 1) {
            int i11 = (iFieldSizeInBytes * 2) + 1;
            byte[] bArr = new byte[i11];
            byte[] bigEndianBytes = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineX());
            byte[] bigEndianBytes2 = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineY());
            System.arraycopy(bigEndianBytes2, 0, bArr, i11 - bigEndianBytes2.length, bigEndianBytes2.length);
            System.arraycopy(bigEndianBytes, 0, bArr, (iFieldSizeInBytes + 1) - bigEndianBytes.length, bigEndianBytes.length);
            bArr[0] = 4;
            return bArr;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new GeneralSecurityException("invalid format:" + pointFormatType);
            }
            int i12 = iFieldSizeInBytes + 1;
            byte[] bArr2 = new byte[i12];
            byte[] bigEndianBytes3 = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineX());
            System.arraycopy(bigEndianBytes3, 0, bArr2, i12 - bigEndianBytes3.length, bigEndianBytes3.length);
            bArr2[0] = (byte) (eCPoint.getAffineY().testBit(0) ? 3 : 2);
            return bArr2;
        }
        int i13 = iFieldSizeInBytes * 2;
        byte[] bArr3 = new byte[i13];
        byte[] bigEndianBytes4 = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineX());
        if (bigEndianBytes4.length > iFieldSizeInBytes) {
            bigEndianBytes4 = Arrays.copyOfRange(bigEndianBytes4, bigEndianBytes4.length - iFieldSizeInBytes, bigEndianBytes4.length);
        }
        byte[] bigEndianBytes5 = BigIntegerEncoding.toBigEndianBytes(eCPoint.getAffineY());
        if (bigEndianBytes5.length > iFieldSizeInBytes) {
            bigEndianBytes5 = Arrays.copyOfRange(bigEndianBytes5, bigEndianBytes5.length - iFieldSizeInBytes, bigEndianBytes5.length);
        }
        System.arraycopy(bigEndianBytes5, 0, bArr3, i13 - bigEndianBytes5.length, bigEndianBytes5.length);
        System.arraycopy(bigEndianBytes4, 0, bArr3, iFieldSizeInBytes - bigEndianBytes4.length, bigEndianBytes4.length);
        return bArr3;
    }

    public static byte[] computeSharedSecret(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey publicKeyGeneratePublic = EngineFactory.KEY_FACTORY.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC).generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement engineFactory = EngineFactory.KEY_AGREEMENT.getInstance("ECDH");
        engineFactory.init(eCPrivateKey);
        try {
            engineFactory.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = engineFactory.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() != -1 && bigInteger.compareTo(getModulus(curve)) < 0) {
                getY(bigInteger, true, curve);
                return bArrGenerateSecret;
            }
            throw new GeneralSecurityException("shared secret is out of range");
        } catch (IllegalStateException e5) {
            throw new GeneralSecurityException(e5);
        }
    }

    public static ECPrivateKey getEcPrivateKey(CurveType curveType, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC).generatePrivate(new ECPrivateKeySpec(BigIntegerEncoding.fromUnsignedBigEndianBytes(bArr), getCurveSpec(curveType)));
    }

    public static ECPublicKey getEcPublicKey(CurveType curveType, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        return getEcPublicKey(getCurveSpec(curveType), pointFormatType, bArr);
    }

    public static ECPublicKey getEcPublicKey(ECParameterSpec eCParameterSpec, PointFormatType pointFormatType, byte[] bArr) throws GeneralSecurityException {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC).generatePublic(new ECPublicKeySpec(pointDecode(eCParameterSpec.getCurve(), pointFormatType, bArr), eCParameterSpec));
    }

    public static ECPublicKey getEcPublicKey(CurveType curveType, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec curveSpec = getCurveSpec(curveType);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        EllipticCurvesUtil.checkPointOnCurve(eCPoint, curveSpec.getCurve());
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance(LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC).generatePublic(new ECPublicKeySpec(eCPoint, curveSpec));
    }
}

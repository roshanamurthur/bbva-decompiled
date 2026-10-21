package com.google.crypto.tink.signature.internal;

import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.proto.RsaSsaPssParams;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class SigUtil {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f47366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f47367c;

        static {
            int[] iArr = new int[HashType.values().length];
            f47367c = iArr;
            try {
                iArr[HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47367c[HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47367c[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EllipticCurveType.values().length];
            f47366b = iArr2;
            try {
                iArr2[EllipticCurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47366b[EllipticCurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47366b[EllipticCurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[EcdsaSignatureEncoding.values().length];
            f47365a = iArr3;
            try {
                iArr3[EcdsaSignatureEncoding.DER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47365a[EcdsaSignatureEncoding.IEEE_P1363.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static EllipticCurves.CurveType toCurveType(EllipticCurveType ellipticCurveType) throws GeneralSecurityException {
        int i10 = a.f47366b[ellipticCurveType.ordinal()];
        if (i10 == 1) {
            return EllipticCurves.CurveType.NIST_P256;
        }
        if (i10 == 2) {
            return EllipticCurves.CurveType.NIST_P384;
        }
        if (i10 == 3) {
            return EllipticCurves.CurveType.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: " + ellipticCurveType.name());
    }

    public static EllipticCurves.EcdsaEncoding toEcdsaEncoding(EcdsaSignatureEncoding ecdsaSignatureEncoding) throws GeneralSecurityException {
        int i10 = a.f47365a[ecdsaSignatureEncoding.ordinal()];
        if (i10 == 1) {
            return EllipticCurves.EcdsaEncoding.DER;
        }
        if (i10 == 2) {
            return EllipticCurves.EcdsaEncoding.IEEE_P1363;
        }
        throw new GeneralSecurityException("unknown ECDSA encoding: " + ecdsaSignatureEncoding.name());
    }

    public static Enums.HashType toHashType(HashType hashType) throws GeneralSecurityException {
        int i10 = a.f47367c[hashType.ordinal()];
        if (i10 == 1) {
            return Enums.HashType.SHA256;
        }
        if (i10 == 2) {
            return Enums.HashType.SHA384;
        }
        if (i10 == 3) {
            return Enums.HashType.SHA512;
        }
        throw new GeneralSecurityException("unsupported hash type: " + hashType.name());
    }

    public static ByteString toUnsignedIntByteString(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        return byteArray[0] == 0 ? ByteString.copyFrom(byteArray, 1, byteArray.length - 1) : ByteString.copyFrom(byteArray);
    }

    public static void validateEcdsaParams(EcdsaParams ecdsaParams) throws GeneralSecurityException {
        EcdsaSignatureEncoding encoding = ecdsaParams.getEncoding();
        HashType hashType = ecdsaParams.getHashType();
        EllipticCurveType curve = ecdsaParams.getCurve();
        int i10 = a.f47365a[encoding.ordinal()];
        if (i10 != 1 && i10 != 2) {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
        int i11 = a.f47366b[curve.ordinal()];
        if (i11 == 1) {
            if (hashType != HashType.SHA256) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else if (i11 == 2) {
            if (hashType != HashType.SHA384 && hashType != HashType.SHA512) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else {
            if (i11 != 3) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
            if (hashType != HashType.SHA512) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        }
    }

    public static void validateRsaSsaPkcs1Params(RsaSsaPkcs1Params rsaSsaPkcs1Params) throws GeneralSecurityException {
        toHashType(rsaSsaPkcs1Params.getHashType());
    }

    public static void validateRsaSsaPssParams(RsaSsaPssParams rsaSsaPssParams) throws GeneralSecurityException {
        toHashType(rsaSsaPssParams.getSigHash());
        if (rsaSsaPssParams.getSigHash() != rsaSsaPssParams.getMgf1Hash()) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        if (rsaSsaPssParams.getSaltLength() < 0) {
            throw new GeneralSecurityException("salt length is negative");
        }
    }
}

package com.google.crypto.tink.signature;

import androidx.collection.h;
import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.EcdsaParams;
import com.google.crypto.tink.proto.EcdsaSignatureEncoding;
import com.google.crypto.tink.proto.EllipticCurveType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import z0.b;

/* JADX INFO: compiled from: EcdsaProtoSerialization.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParametersSerializer<EcdsaParameters, ProtoParametersSerialization> f47355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParametersParser<ProtoParametersSerialization> f47356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeySerializer<EcdsaPublicKey, ProtoKeySerialization> f47357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f47358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KeySerializer<EcdsaPrivateKey, ProtoKeySerialization> f47359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f47360f;

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EcdsaProtoSerialization.java */
    public static /* synthetic */ class C0207a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f47362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f47363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f47364d;

        static {
            int[] iArr = new int[EcdsaSignatureEncoding.values().length];
            f47364d = iArr;
            try {
                iArr[EcdsaSignatureEncoding.IEEE_P1363.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47364d[EcdsaSignatureEncoding.DER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EllipticCurveType.values().length];
            f47363c = iArr2;
            try {
                iArr2[EllipticCurveType.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47363c[EllipticCurveType.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47363c[EllipticCurveType.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[OutputPrefixType.values().length];
            f47362b = iArr3;
            try {
                iArr3[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47362b[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47362b[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47362b[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[HashType.values().length];
            f47361a = iArr4;
            try {
                iArr4[HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47361a[HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47361a[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        Bytes bytesFromPrintableAscii2 = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f47355a = ParametersSerializer.create(new z0.a(7), EcdsaParameters.class, ProtoParametersSerialization.class);
        f47356b = ParametersParser.create(new b(6), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        f47357c = KeySerializer.create(new bc.org.bouncycastle.math.ec.a(), EcdsaPublicKey.class, ProtoKeySerialization.class);
        f47358d = KeyParser.create(new ai.a(), bytesFromPrintableAscii2, ProtoKeySerialization.class);
        f47359e = KeySerializer.create(new h(), EcdsaPrivateKey.class, ProtoKeySerialization.class);
        f47360f = KeyParser.create(new b2.a(5), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    public static int a(EcdsaParameters.CurveType curveType) throws GeneralSecurityException {
        if (EcdsaParameters.CurveType.NIST_P256.equals(curveType)) {
            return 33;
        }
        if (EcdsaParameters.CurveType.NIST_P384.equals(curveType)) {
            return 49;
        }
        if (EcdsaParameters.CurveType.NIST_P521.equals(curveType)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + curveType);
    }

    public static EcdsaParams b(EcdsaParameters ecdsaParameters) throws GeneralSecurityException {
        HashType hashType;
        EllipticCurveType ellipticCurveType;
        EcdsaSignatureEncoding ecdsaSignatureEncoding;
        EcdsaParams.Builder builderNewBuilder = EcdsaParams.newBuilder();
        EcdsaParameters.HashType hashType2 = ecdsaParameters.getHashType();
        if (EcdsaParameters.HashType.SHA256.equals(hashType2)) {
            hashType = HashType.SHA256;
        } else if (EcdsaParameters.HashType.SHA384.equals(hashType2)) {
            hashType = HashType.SHA384;
        } else {
            if (!EcdsaParameters.HashType.SHA512.equals(hashType2)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + hashType2);
            }
            hashType = HashType.SHA512;
        }
        EcdsaParams.Builder hashType3 = builderNewBuilder.setHashType(hashType);
        EcdsaParameters.CurveType curveType = ecdsaParameters.getCurveType();
        if (EcdsaParameters.CurveType.NIST_P256.equals(curveType)) {
            ellipticCurveType = EllipticCurveType.NIST_P256;
        } else if (EcdsaParameters.CurveType.NIST_P384.equals(curveType)) {
            ellipticCurveType = EllipticCurveType.NIST_P384;
        } else {
            if (!EcdsaParameters.CurveType.NIST_P521.equals(curveType)) {
                throw new GeneralSecurityException("Unable to serialize CurveType " + curveType);
            }
            ellipticCurveType = EllipticCurveType.NIST_P521;
        }
        EcdsaParams.Builder curve = hashType3.setCurve(ellipticCurveType);
        EcdsaParameters.SignatureEncoding signatureEncoding = ecdsaParameters.getSignatureEncoding();
        if (EcdsaParameters.SignatureEncoding.IEEE_P1363.equals(signatureEncoding)) {
            ecdsaSignatureEncoding = EcdsaSignatureEncoding.IEEE_P1363;
        } else {
            if (!EcdsaParameters.SignatureEncoding.DER.equals(signatureEncoding)) {
                throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + signatureEncoding);
            }
            ecdsaSignatureEncoding = EcdsaSignatureEncoding.DER;
        }
        return curve.setEncoding(ecdsaSignatureEncoding).build();
    }

    public static com.google.crypto.tink.proto.EcdsaPublicKey c(EcdsaPublicKey ecdsaPublicKey) throws GeneralSecurityException {
        int iA = a(ecdsaPublicKey.getParameters().getCurveType());
        ECPoint publicPoint = ecdsaPublicKey.getPublicPoint();
        return com.google.crypto.tink.proto.EcdsaPublicKey.newBuilder().setParams(b(ecdsaPublicKey.getParameters())).setX(ByteString.copyFrom(BigIntegerEncoding.toBigEndianBytesOfFixedLength(publicPoint.getAffineX(), iA))).setY(ByteString.copyFrom(BigIntegerEncoding.toBigEndianBytesOfFixedLength(publicPoint.getAffineY(), iA))).build();
    }

    public static EcdsaParameters.CurveType d(EllipticCurveType ellipticCurveType) throws GeneralSecurityException {
        int i10 = C0207a.f47363c[ellipticCurveType.ordinal()];
        if (i10 == 1) {
            return EcdsaParameters.CurveType.NIST_P256;
        }
        if (i10 == 2) {
            return EcdsaParameters.CurveType.NIST_P384;
        }
        if (i10 == 3) {
            return EcdsaParameters.CurveType.NIST_P521;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + ellipticCurveType.getNumber());
    }

    public static EcdsaParameters.HashType e(HashType hashType) throws GeneralSecurityException {
        int i10 = C0207a.f47361a[hashType.ordinal()];
        if (i10 == 1) {
            return EcdsaParameters.HashType.SHA256;
        }
        if (i10 == 2) {
            return EcdsaParameters.HashType.SHA384;
        }
        if (i10 == 3) {
            return EcdsaParameters.HashType.SHA512;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + hashType.getNumber());
    }

    public static OutputPrefixType f(EcdsaParameters.Variant variant) throws GeneralSecurityException {
        if (EcdsaParameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (EcdsaParameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (EcdsaParameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        if (EcdsaParameters.Variant.LEGACY.equals(variant)) {
            return OutputPrefixType.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    public static EcdsaParameters.SignatureEncoding g(EcdsaSignatureEncoding ecdsaSignatureEncoding) throws GeneralSecurityException {
        int i10 = C0207a.f47364d[ecdsaSignatureEncoding.ordinal()];
        if (i10 == 1) {
            return EcdsaParameters.SignatureEncoding.IEEE_P1363;
        }
        if (i10 == 2) {
            return EcdsaParameters.SignatureEncoding.DER;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + ecdsaSignatureEncoding.getNumber());
    }

    public static EcdsaParameters.Variant h(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i10 = C0207a.f47362b[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return EcdsaParameters.Variant.TINK;
        }
        if (i10 == 2) {
            return EcdsaParameters.Variant.CRUNCHY;
        }
        if (i10 == 3) {
            return EcdsaParameters.Variant.LEGACY;
        }
        if (i10 == 4) {
            return EcdsaParameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}

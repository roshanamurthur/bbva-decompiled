package com.google.crypto.tink.signature;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
@Alpha
public final class EcdsaParameters extends SignatureParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SignatureEncoding f47318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurveType f47319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashType f47320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Variant f47321d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SignatureEncoding f47322a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CurveType f47323b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashType f47324c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Variant f47325d = Variant.NO_PREFIX;

        public EcdsaParameters build() throws GeneralSecurityException {
            SignatureEncoding signatureEncoding = this.f47322a;
            if (signatureEncoding == null) {
                throw new GeneralSecurityException("signature encoding is not set");
            }
            CurveType curveType = this.f47323b;
            if (curveType == null) {
                throw new GeneralSecurityException("EC curve type is not set");
            }
            HashType hashType = this.f47324c;
            if (hashType == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            Variant variant = this.f47325d;
            if (variant == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (curveType == CurveType.NIST_P256 && hashType != HashType.SHA256) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (curveType == CurveType.NIST_P384 && hashType != HashType.SHA384 && hashType != HashType.SHA512) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (curveType != CurveType.NIST_P521 || hashType == HashType.SHA512) {
                return new EcdsaParameters(signatureEncoding, curveType, hashType, variant);
            }
            throw new GeneralSecurityException("NIST_P521 requires SHA512");
        }

        @CanIgnoreReturnValue
        public Builder setCurveType(CurveType curveType) {
            this.f47323b = curveType;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHashType(HashType hashType) {
            this.f47324c = hashType;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSignatureEncoding(SignatureEncoding signatureEncoding) {
            this.f47322a = signatureEncoding;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant variant) {
            this.f47325d = variant;
            return this;
        }
    }

    @Immutable
    public static final class CurveType {
        public static final CurveType NIST_P256 = new CurveType("NIST_P256", EllipticCurvesUtil.NIST_P256_PARAMS);
        public static final CurveType NIST_P384 = new CurveType("NIST_P384", EllipticCurvesUtil.NIST_P384_PARAMS);
        public static final CurveType NIST_P521 = new CurveType("NIST_P521", EllipticCurvesUtil.NIST_P521_PARAMS);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ECParameterSpec f47327b;

        public CurveType(String str, ECParameterSpec eCParameterSpec) {
            this.f47326a = str;
            this.f47327b = eCParameterSpec;
        }

        public static CurveType fromParameterSpec(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
            CurveType curveType = NIST_P256;
            if (EllipticCurvesUtil.isSameEcParameterSpec(eCParameterSpec, curveType.toParameterSpec())) {
                return curveType;
            }
            CurveType curveType2 = NIST_P384;
            if (EllipticCurvesUtil.isSameEcParameterSpec(eCParameterSpec, curveType2.toParameterSpec())) {
                return curveType2;
            }
            CurveType curveType3 = NIST_P521;
            if (EllipticCurvesUtil.isSameEcParameterSpec(eCParameterSpec, curveType3.toParameterSpec())) {
                return curveType3;
            }
            throw new GeneralSecurityException("unknown ECParameterSpec");
        }

        public ECParameterSpec toParameterSpec() {
            return this.f47327b;
        }

        public String toString() {
            return this.f47326a;
        }
    }

    @Immutable
    public static final class HashType {
        public static final HashType SHA256 = new HashType("SHA256");
        public static final HashType SHA384 = new HashType("SHA384");
        public static final HashType SHA512 = new HashType("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47328a;

        public HashType(String str) {
            this.f47328a = str;
        }

        public String toString() {
            return this.f47328a;
        }
    }

    @Immutable
    public static final class SignatureEncoding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47329a;
        public static final SignatureEncoding IEEE_P1363 = new SignatureEncoding("IEEE_P1363");
        public static final SignatureEncoding DER = new SignatureEncoding(ASN1Encoding.DER);

        public SignatureEncoding(String str) {
            this.f47329a = str;
        }

        public String toString() {
            return this.f47329a;
        }
    }

    @Immutable
    public static final class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47330a;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant LEGACY = new Variant("LEGACY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.f47330a = str;
        }

        public String toString() {
            return this.f47330a;
        }
    }

    public EcdsaParameters(SignatureEncoding signatureEncoding, CurveType curveType, HashType hashType, Variant variant) {
        this.f47318a = signatureEncoding;
        this.f47319b = curveType;
        this.f47320c = hashType;
        this.f47321d = variant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EcdsaParameters)) {
            return false;
        }
        EcdsaParameters ecdsaParameters = (EcdsaParameters) obj;
        return ecdsaParameters.getSignatureEncoding() == getSignatureEncoding() && ecdsaParameters.getCurveType() == getCurveType() && ecdsaParameters.getHashType() == getHashType() && ecdsaParameters.getVariant() == getVariant();
    }

    public CurveType getCurveType() {
        return this.f47319b;
    }

    public HashType getHashType() {
        return this.f47320c;
    }

    public SignatureEncoding getSignatureEncoding() {
        return this.f47318a;
    }

    public Variant getVariant() {
        return this.f47321d;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.f47321d != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hash(this.f47318a, this.f47319b, this.f47320c, this.f47321d);
    }

    public String toString() {
        return "ECDSA Parameters (variant: " + this.f47321d + ", hashType: " + this.f47320c + ", encoding: " + this.f47318a + ", curve: " + this.f47319b + ")";
    }
}

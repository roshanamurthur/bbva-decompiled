package com.google.crypto.tink.signature;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Alpha
public final class EcdsaPublicKey extends SignaturePublicKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EcdsaParameters f47335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECPoint f47336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bytes f47337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f47338d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public EcdsaParameters f47339a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public ECPoint f47340b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f47341c = null;

        public EcdsaPublicKey build() throws GeneralSecurityException {
            Bytes bytesCopyFrom;
            EcdsaParameters ecdsaParameters = this.f47339a;
            if (ecdsaParameters == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            ECPoint eCPoint = this.f47340b;
            if (eCPoint == null) {
                throw new GeneralSecurityException("Cannot build without public point");
            }
            EllipticCurvesUtil.checkPointOnCurve(eCPoint, ecdsaParameters.getCurveType().toParameterSpec().getCurve());
            if (this.f47339a.hasIdRequirement() && this.f47341c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f47339a.hasIdRequirement() && this.f47341c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f47339a.getVariant() == EcdsaParameters.Variant.NO_PREFIX) {
                bytesCopyFrom = Bytes.copyFrom(new byte[0]);
            } else if (this.f47339a.getVariant() == EcdsaParameters.Variant.LEGACY || this.f47339a.getVariant() == EcdsaParameters.Variant.CRUNCHY) {
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f47341c.intValue()).array());
            } else {
                if (this.f47339a.getVariant() != EcdsaParameters.Variant.TINK) {
                    throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + this.f47339a.getVariant());
                }
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f47341c.intValue()).array());
            }
            return new EcdsaPublicKey(this.f47339a, this.f47340b, bytesCopyFrom, this.f47341c);
        }

        @CanIgnoreReturnValue
        public Builder setIdRequirement(@Nullable Integer num) {
            this.f47341c = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(EcdsaParameters ecdsaParameters) {
            this.f47339a = ecdsaParameters;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPublicPoint(ECPoint eCPoint) {
            this.f47340b = eCPoint;
            return this;
        }
    }

    public EcdsaPublicKey(EcdsaParameters ecdsaParameters, ECPoint eCPoint, Bytes bytes, Integer num) {
        this.f47335a = ecdsaParameters;
        this.f47336b = eCPoint;
        this.f47337c = bytes;
        this.f47338d = num;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof EcdsaPublicKey)) {
            return false;
        }
        EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) key;
        return ecdsaPublicKey.f47335a.equals(this.f47335a) && ecdsaPublicKey.f47336b.equals(this.f47336b) && Objects.equals(ecdsaPublicKey.f47338d, this.f47338d);
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f47338d;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey
    public Bytes getOutputPrefix() {
        return this.f47337c;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public ECPoint getPublicPoint() {
        return this.f47336b;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public EcdsaParameters getParameters() {
        return this.f47335a;
    }
}

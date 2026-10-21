package com.google.crypto.tink.mac;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class AesCmacKey extends MacKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AesCmacParameters f46762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretBytes f46763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bytes f46764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46765d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public AesCmacParameters f46766a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public SecretBytes f46767b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f46768c = null;

        public AesCmacKey build() throws GeneralSecurityException {
            Bytes bytesCopyFrom;
            AesCmacParameters aesCmacParameters = this.f46766a;
            if (aesCmacParameters == null || this.f46767b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (aesCmacParameters.getKeySizeBytes() != this.f46767b.size()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f46766a.hasIdRequirement() && this.f46768c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f46766a.hasIdRequirement() && this.f46768c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f46766a.getVariant() == AesCmacParameters.Variant.NO_PREFIX) {
                bytesCopyFrom = Bytes.copyFrom(new byte[0]);
            } else if (this.f46766a.getVariant() == AesCmacParameters.Variant.LEGACY || this.f46766a.getVariant() == AesCmacParameters.Variant.CRUNCHY) {
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f46768c.intValue()).array());
            } else {
                if (this.f46766a.getVariant() != AesCmacParameters.Variant.TINK) {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f46766a.getVariant());
                }
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f46768c.intValue()).array());
            }
            return new AesCmacKey(this.f46766a, this.f46767b, bytesCopyFrom, this.f46768c);
        }

        @CanIgnoreReturnValue
        public Builder setAesKeyBytes(SecretBytes secretBytes) throws GeneralSecurityException {
            this.f46767b = secretBytes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIdRequirement(@Nullable Integer num) {
            this.f46768c = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(AesCmacParameters aesCmacParameters) {
            this.f46766a = aesCmacParameters;
            return this;
        }
    }

    public AesCmacKey(AesCmacParameters aesCmacParameters, SecretBytes secretBytes, Bytes bytes, Integer num) {
        this.f46762a = aesCmacParameters;
        this.f46763b = secretBytes;
        this.f46764c = bytes;
        this.f46765d = num;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof AesCmacKey)) {
            return false;
        }
        AesCmacKey aesCmacKey = (AesCmacKey) key;
        return aesCmacKey.f46762a.equals(this.f46762a) && aesCmacKey.f46763b.equalsSecretBytes(this.f46763b) && Objects.equals(aesCmacKey.f46765d, this.f46765d);
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getAesKey() {
        return this.f46763b;
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f46765d;
    }

    @Override // com.google.crypto.tink.mac.MacKey
    public Bytes getOutputPrefix() {
        return this.f46764c;
    }

    @Override // com.google.crypto.tink.mac.MacKey, com.google.crypto.tink.Key
    public AesCmacParameters getParameters() {
        return this.f46762a;
    }
}

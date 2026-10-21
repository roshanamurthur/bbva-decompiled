package com.google.crypto.tink.aead;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.annotations.Alpha;
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
@Alpha
public final class AesGcmKey extends AeadKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AesGcmParameters f46485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretBytes f46486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bytes f46487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46488d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public AesGcmParameters f46489a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public SecretBytes f46490b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f46491c = null;

        public AesGcmKey build() throws GeneralSecurityException {
            Bytes bytesCopyFrom;
            AesGcmParameters aesGcmParameters = this.f46489a;
            if (aesGcmParameters == null || this.f46490b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (aesGcmParameters.getKeySizeBytes() != this.f46490b.size()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f46489a.hasIdRequirement() && this.f46491c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f46489a.hasIdRequirement() && this.f46491c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f46489a.getVariant() == AesGcmParameters.Variant.NO_PREFIX) {
                bytesCopyFrom = Bytes.copyFrom(new byte[0]);
            } else if (this.f46489a.getVariant() == AesGcmParameters.Variant.CRUNCHY) {
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f46491c.intValue()).array());
            } else {
                if (this.f46489a.getVariant() != AesGcmParameters.Variant.TINK) {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f46489a.getVariant());
                }
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f46491c.intValue()).array());
            }
            return new AesGcmKey(this.f46489a, this.f46490b, bytesCopyFrom, this.f46491c);
        }

        @CanIgnoreReturnValue
        public Builder setIdRequirement(@Nullable Integer num) {
            this.f46491c = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeyBytes(SecretBytes secretBytes) {
            this.f46490b = secretBytes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(AesGcmParameters aesGcmParameters) {
            this.f46489a = aesGcmParameters;
            return this;
        }
    }

    public AesGcmKey(AesGcmParameters aesGcmParameters, SecretBytes secretBytes, Bytes bytes, Integer num) {
        this.f46485a = aesGcmParameters;
        this.f46486b = secretBytes;
        this.f46487c = bytes;
        this.f46488d = num;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof AesGcmKey)) {
            return false;
        }
        AesGcmKey aesGcmKey = (AesGcmKey) key;
        return aesGcmKey.f46485a.equals(this.f46485a) && aesGcmKey.f46486b.equalsSecretBytes(this.f46486b) && Objects.equals(aesGcmKey.f46488d, this.f46488d);
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f46488d;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.f46486b;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public Bytes getOutputPrefix() {
        return this.f46487c;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public AesGcmParameters getParameters() {
        return this.f46485a;
    }
}

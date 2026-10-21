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
public final class AesGcmSivKey extends AeadKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AesGcmSivParameters f46502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretBytes f46503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bytes f46504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46505d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public AesGcmSivParameters f46506a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public SecretBytes f46507b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f46508c = null;

        public AesGcmSivKey build() throws GeneralSecurityException {
            Bytes bytesCopyFrom;
            AesGcmSivParameters aesGcmSivParameters = this.f46506a;
            if (aesGcmSivParameters == null || this.f46507b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (aesGcmSivParameters.getKeySizeBytes() != this.f46507b.size()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f46506a.hasIdRequirement() && this.f46508c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f46506a.hasIdRequirement() && this.f46508c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f46506a.getVariant() == AesGcmSivParameters.Variant.NO_PREFIX) {
                bytesCopyFrom = Bytes.copyFrom(new byte[0]);
            } else if (this.f46506a.getVariant() == AesGcmSivParameters.Variant.CRUNCHY) {
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f46508c.intValue()).array());
            } else {
                if (this.f46506a.getVariant() != AesGcmSivParameters.Variant.TINK) {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f46506a.getVariant());
                }
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f46508c.intValue()).array());
            }
            return new AesGcmSivKey(this.f46506a, this.f46507b, bytesCopyFrom, this.f46508c);
        }

        @CanIgnoreReturnValue
        public Builder setIdRequirement(@Nullable Integer num) {
            this.f46508c = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeyBytes(SecretBytes secretBytes) {
            this.f46507b = secretBytes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(AesGcmSivParameters aesGcmSivParameters) {
            this.f46506a = aesGcmSivParameters;
            return this;
        }
    }

    public AesGcmSivKey(AesGcmSivParameters aesGcmSivParameters, SecretBytes secretBytes, Bytes bytes, Integer num) {
        this.f46502a = aesGcmSivParameters;
        this.f46503b = secretBytes;
        this.f46504c = bytes;
        this.f46505d = num;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof AesGcmSivKey)) {
            return false;
        }
        AesGcmSivKey aesGcmSivKey = (AesGcmSivKey) key;
        return aesGcmSivKey.f46502a.equals(this.f46502a) && aesGcmSivKey.f46503b.equalsSecretBytes(this.f46503b) && Objects.equals(aesGcmSivKey.f46505d, this.f46505d);
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f46505d;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.f46503b;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public Bytes getOutputPrefix() {
        return this.f46504c;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public AesGcmSivParameters getParameters() {
        return this.f46502a;
    }
}

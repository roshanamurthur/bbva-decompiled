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
public final class AesEaxKey extends AeadKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AesEaxParameters f46468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretBytes f46469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bytes f46470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46471d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public AesEaxParameters f46472a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public SecretBytes f46473b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f46474c = null;

        public AesEaxKey build() throws GeneralSecurityException {
            Bytes bytesCopyFrom;
            AesEaxParameters aesEaxParameters = this.f46472a;
            if (aesEaxParameters == null || this.f46473b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (aesEaxParameters.getKeySizeBytes() != this.f46473b.size()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f46472a.hasIdRequirement() && this.f46474c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f46472a.hasIdRequirement() && this.f46474c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f46472a.getVariant() == AesEaxParameters.Variant.NO_PREFIX) {
                bytesCopyFrom = Bytes.copyFrom(new byte[0]);
            } else if (this.f46472a.getVariant() == AesEaxParameters.Variant.CRUNCHY) {
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f46474c.intValue()).array());
            } else {
                if (this.f46472a.getVariant() != AesEaxParameters.Variant.TINK) {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f46472a.getVariant());
                }
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f46474c.intValue()).array());
            }
            return new AesEaxKey(this.f46472a, this.f46473b, bytesCopyFrom, this.f46474c);
        }

        @CanIgnoreReturnValue
        public Builder setIdRequirement(@Nullable Integer num) {
            this.f46474c = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeyBytes(SecretBytes secretBytes) {
            this.f46473b = secretBytes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(AesEaxParameters aesEaxParameters) {
            this.f46472a = aesEaxParameters;
            return this;
        }
    }

    public AesEaxKey(AesEaxParameters aesEaxParameters, SecretBytes secretBytes, Bytes bytes, Integer num) {
        this.f46468a = aesEaxParameters;
        this.f46469b = secretBytes;
        this.f46470c = bytes;
        this.f46471d = num;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof AesEaxKey)) {
            return false;
        }
        AesEaxKey aesEaxKey = (AesEaxKey) key;
        return aesEaxKey.f46468a.equals(this.f46468a) && aesEaxKey.f46469b.equalsSecretBytes(this.f46469b) && Objects.equals(aesEaxKey.f46471d, this.f46471d);
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f46471d;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.f46469b;
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public Bytes getOutputPrefix() {
        return this.f46470c;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public AesEaxParameters getParameters() {
        return this.f46468a;
    }
}

package com.google.crypto.tink.mac;

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
public final class HmacKey extends MacKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HmacParameters f46780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretBytes f46781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bytes f46782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46783d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public HmacParameters f46784a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public SecretBytes f46785b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f46786c = null;

        public HmacKey build() throws GeneralSecurityException {
            Bytes bytesCopyFrom;
            HmacParameters hmacParameters = this.f46784a;
            if (hmacParameters == null || this.f46785b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (hmacParameters.getKeySizeBytes() != this.f46785b.size()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f46784a.hasIdRequirement() && this.f46786c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f46784a.hasIdRequirement() && this.f46786c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.f46784a.getVariant() == HmacParameters.Variant.NO_PREFIX) {
                bytesCopyFrom = Bytes.copyFrom(new byte[0]);
            } else if (this.f46784a.getVariant() == HmacParameters.Variant.LEGACY || this.f46784a.getVariant() == HmacParameters.Variant.CRUNCHY) {
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f46786c.intValue()).array());
            } else {
                if (this.f46784a.getVariant() != HmacParameters.Variant.TINK) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f46784a.getVariant());
                }
                bytesCopyFrom = Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f46786c.intValue()).array());
            }
            return new HmacKey(this.f46784a, this.f46785b, bytesCopyFrom, this.f46786c);
        }

        @CanIgnoreReturnValue
        public Builder setIdRequirement(@Nullable Integer num) {
            this.f46786c = num;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeyBytes(SecretBytes secretBytes) {
            this.f46785b = secretBytes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(HmacParameters hmacParameters) {
            this.f46784a = hmacParameters;
            return this;
        }
    }

    public HmacKey(HmacParameters hmacParameters, SecretBytes secretBytes, Bytes bytes, Integer num) {
        this.f46780a = hmacParameters;
        this.f46781b = secretBytes;
        this.f46782c = bytes;
        this.f46783d = num;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof HmacKey)) {
            return false;
        }
        HmacKey hmacKey = (HmacKey) key;
        return hmacKey.f46780a.equals(this.f46780a) && hmacKey.f46781b.equalsSecretBytes(this.f46781b) && Objects.equals(hmacKey.f46783d, this.f46783d);
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.f46783d;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.f46781b;
    }

    @Override // com.google.crypto.tink.mac.MacKey
    public Bytes getOutputPrefix() {
        return this.f46782c;
    }

    @Override // com.google.crypto.tink.mac.MacKey, com.google.crypto.tink.Key
    public HmacParameters getParameters() {
        return this.f46780a;
    }
}

package com.google.crypto.tink.prf;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.util.SecretBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.RestrictedApi;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Alpha
public final class HkdfPrfKey extends PrfKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HkdfPrfParameters f46827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecretBytes f46828b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public HkdfPrfParameters f46829a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public SecretBytes f46830b = null;

        public HkdfPrfKey build() throws GeneralSecurityException {
            HkdfPrfParameters hkdfPrfParameters = this.f46829a;
            if (hkdfPrfParameters == null || this.f46830b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (hkdfPrfParameters.getKeySizeBytes() == this.f46830b.size()) {
                return new HkdfPrfKey(this.f46829a, this.f46830b);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }

        @CanIgnoreReturnValue
        public Builder setKeyBytes(SecretBytes secretBytes) {
            this.f46830b = secretBytes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setParameters(HkdfPrfParameters hkdfPrfParameters) {
            this.f46829a = hkdfPrfParameters;
            return this;
        }
    }

    public HkdfPrfKey(HkdfPrfParameters hkdfPrfParameters, SecretBytes secretBytes) {
        this.f46827a = hkdfPrfParameters;
        this.f46828b = secretBytes;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public static Builder builder() {
        return new Builder();
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key key) {
        if (!(key instanceof HkdfPrfKey)) {
            return false;
        }
        HkdfPrfKey hkdfPrfKey = (HkdfPrfKey) key;
        return hkdfPrfKey.f46827a.equals(this.f46827a) && hkdfPrfKey.f46828b.equalsSecretBytes(this.f46828b);
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return null;
    }

    @RestrictedApi(allowedOnPath = ".*Test\\.java", allowlistAnnotations = {AccessesPartialKey.class}, explanation = "Accessing parts of keys can produce unexpected incompatibilities, annotate the function with @AccessesPartialKey", link = "https://developers.google.com/tink/design/access_control#accessing_partial_keys")
    public SecretBytes getKeyBytes() {
        return this.f46828b;
    }

    @Override // com.google.crypto.tink.prf.PrfKey, com.google.crypto.tink.Key
    public HkdfPrfParameters getParameters() {
        return this.f46827a;
    }
}

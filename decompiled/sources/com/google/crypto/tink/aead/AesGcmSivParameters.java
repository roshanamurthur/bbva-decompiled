package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class AesGcmSivParameters extends AeadParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Variant f46511b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Integer f46512a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Variant f46513b = Variant.NO_PREFIX;

        public AesGcmSivParameters build() throws GeneralSecurityException {
            Integer num = this.f46512a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f46513b != null) {
                return new AesGcmSivParameters(num.intValue(), this.f46513b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f46512a = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant variant) {
            this.f46513b = variant;
            return this;
        }
    }

    @Immutable
    public static final class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46514a;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.f46514a = str;
        }

        public String toString() {
            return this.f46514a;
        }
    }

    public AesGcmSivParameters(int i10, Variant variant) {
        this.f46510a = i10;
        this.f46511b = variant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AesGcmSivParameters)) {
            return false;
        }
        AesGcmSivParameters aesGcmSivParameters = (AesGcmSivParameters) obj;
        return aesGcmSivParameters.getKeySizeBytes() == getKeySizeBytes() && aesGcmSivParameters.getVariant() == getVariant();
    }

    public int getKeySizeBytes() {
        return this.f46510a;
    }

    public Variant getVariant() {
        return this.f46511b;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.f46511b != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46510a), this.f46511b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb2.append(this.f46511b);
        sb2.append(", ");
        return androidx.appcompat.widget.a.c(sb2, this.f46510a, "-byte key)");
    }
}

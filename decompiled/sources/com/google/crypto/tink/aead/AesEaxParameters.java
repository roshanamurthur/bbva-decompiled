package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class AesEaxParameters extends AeadParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Variant f46479d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Integer f46480a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Integer f46481b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f46482c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Variant f46483d = Variant.NO_PREFIX;

        public AesEaxParameters build() throws GeneralSecurityException {
            Integer num = this.f46480a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f46481b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f46483d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f46482c != null) {
                return new AesEaxParameters(num.intValue(), this.f46481b.intValue(), this.f46482c.intValue(), this.f46483d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setIvSizeBytes(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f46481b = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f46480a = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int i10) throws GeneralSecurityException {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f46482c = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant variant) {
            this.f46483d = variant;
            return this;
        }
    }

    @Immutable
    public static final class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46484a;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.f46484a = str;
        }

        public String toString() {
            return this.f46484a;
        }
    }

    public AesEaxParameters(int i10, int i11, int i12, Variant variant) {
        this.f46476a = i10;
        this.f46477b = i11;
        this.f46478c = i12;
        this.f46479d = variant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AesEaxParameters)) {
            return false;
        }
        AesEaxParameters aesEaxParameters = (AesEaxParameters) obj;
        return aesEaxParameters.getKeySizeBytes() == getKeySizeBytes() && aesEaxParameters.getIvSizeBytes() == getIvSizeBytes() && aesEaxParameters.getTagSizeBytes() == getTagSizeBytes() && aesEaxParameters.getVariant() == getVariant();
    }

    public int getIvSizeBytes() {
        return this.f46477b;
    }

    public int getKeySizeBytes() {
        return this.f46476a;
    }

    public int getTagSizeBytes() {
        return this.f46478c;
    }

    public Variant getVariant() {
        return this.f46479d;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.f46479d != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46476a), Integer.valueOf(this.f46477b), Integer.valueOf(this.f46478c), this.f46479d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AesEax Parameters (variant: ");
        sb2.append(this.f46479d);
        sb2.append(", ");
        sb2.append(this.f46477b);
        sb2.append("-byte IV, ");
        sb2.append(this.f46478c);
        sb2.append("-byte tag, and ");
        return androidx.appcompat.widget.a.c(sb2, this.f46476a, "-byte key)");
    }
}

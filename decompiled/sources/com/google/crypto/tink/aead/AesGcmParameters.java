package com.google.crypto.tink.aead;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class AesGcmParameters extends AeadParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Variant f46496d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Integer f46497a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Integer f46498b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f46499c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Variant f46500d = Variant.NO_PREFIX;

        public AesGcmParameters build() throws GeneralSecurityException {
            Integer num = this.f46497a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f46500d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f46498b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f46499c != null) {
                return new AesGcmParameters(num.intValue(), this.f46498b.intValue(), this.f46499c.intValue(), this.f46500d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        @CanIgnoreReturnValue
        public Builder setIvSizeBytes(int i10) throws GeneralSecurityException {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f46498b = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f46497a = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f46499c = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant variant) {
            this.f46500d = variant;
            return this;
        }
    }

    @Immutable
    public static final class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46501a;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.f46501a = str;
        }

        public String toString() {
            return this.f46501a;
        }
    }

    public AesGcmParameters(int i10, int i11, int i12, Variant variant) {
        this.f46493a = i10;
        this.f46494b = i11;
        this.f46495c = i12;
        this.f46496d = variant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AesGcmParameters)) {
            return false;
        }
        AesGcmParameters aesGcmParameters = (AesGcmParameters) obj;
        return aesGcmParameters.getKeySizeBytes() == getKeySizeBytes() && aesGcmParameters.getIvSizeBytes() == getIvSizeBytes() && aesGcmParameters.getTagSizeBytes() == getTagSizeBytes() && aesGcmParameters.getVariant() == getVariant();
    }

    public int getIvSizeBytes() {
        return this.f46494b;
    }

    public int getKeySizeBytes() {
        return this.f46493a;
    }

    public int getTagSizeBytes() {
        return this.f46495c;
    }

    public Variant getVariant() {
        return this.f46496d;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.f46496d != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46493a), Integer.valueOf(this.f46494b), Integer.valueOf(this.f46495c), this.f46496d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcm Parameters (variant: ");
        sb2.append(this.f46496d);
        sb2.append(", ");
        sb2.append(this.f46494b);
        sb2.append("-byte IV, ");
        sb2.append(this.f46495c);
        sb2.append("-byte tag, and ");
        return androidx.appcompat.widget.a.c(sb2, this.f46493a, "-byte key)");
    }
}

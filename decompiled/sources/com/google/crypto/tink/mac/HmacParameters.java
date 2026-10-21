package com.google.crypto.tink.mac;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Alpha
public final class HmacParameters extends MacParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Variant f46792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashType f46793d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Integer f46794a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Integer f46795b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashType f46796c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Variant f46797d = Variant.NO_PREFIX;

        public HmacParameters build() throws GeneralSecurityException {
            Integer num = this.f46794a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f46795b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f46796c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f46797d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f46794a));
            }
            int iIntValue = this.f46795b.intValue();
            HashType hashType = this.f46796c;
            if (iIntValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iIntValue)));
            }
            if (hashType == HashType.SHA1) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
                }
            } else if (hashType == HashType.SHA224) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
                }
            } else if (hashType == HashType.SHA256) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
                }
            } else if (hashType == HashType.SHA384) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
                }
            } else {
                if (hashType != HashType.SHA512) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
                }
            }
            return new HmacParameters(this.f46794a.intValue(), this.f46795b.intValue(), this.f46797d, this.f46796c);
        }

        @CanIgnoreReturnValue
        public Builder setHashType(HashType hashType) {
            this.f46796c = hashType;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i10) throws GeneralSecurityException {
            this.f46794a = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int i10) throws GeneralSecurityException {
            this.f46795b = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant variant) {
            this.f46797d = variant;
            return this;
        }
    }

    @Immutable
    public static final class HashType {
        public static final HashType SHA1 = new HashType("SHA1");
        public static final HashType SHA224 = new HashType("SHA224");
        public static final HashType SHA256 = new HashType("SHA256");
        public static final HashType SHA384 = new HashType("SHA384");
        public static final HashType SHA512 = new HashType("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46798a;

        public HashType(String str) {
            this.f46798a = str;
        }

        public String toString() {
            return this.f46798a;
        }
    }

    @Immutable
    public static final class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46799a;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant LEGACY = new Variant("LEGACY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.f46799a = str;
        }

        public String toString() {
            return this.f46799a;
        }
    }

    public HmacParameters(int i10, int i11, Variant variant, HashType hashType) {
        this.f46790a = i10;
        this.f46791b = i11;
        this.f46792c = variant;
        this.f46793d = hashType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HmacParameters)) {
            return false;
        }
        HmacParameters hmacParameters = (HmacParameters) obj;
        return hmacParameters.getKeySizeBytes() == getKeySizeBytes() && hmacParameters.getTotalTagSizeBytes() == getTotalTagSizeBytes() && hmacParameters.getVariant() == getVariant() && hmacParameters.getHashType() == getHashType();
    }

    public int getCryptographicTagSizeBytes() {
        return this.f46791b;
    }

    public HashType getHashType() {
        return this.f46793d;
    }

    public int getKeySizeBytes() {
        return this.f46790a;
    }

    public int getTotalTagSizeBytes() {
        Variant variant = Variant.NO_PREFIX;
        Variant variant2 = this.f46792c;
        if (variant2 == variant) {
            return getCryptographicTagSizeBytes();
        }
        if (variant2 != Variant.TINK && variant2 != Variant.CRUNCHY && variant2 != Variant.LEGACY) {
            throw new IllegalStateException("Unknown variant");
        }
        int cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        return cryptographicTagSizeBytes + 5;
    }

    public Variant getVariant() {
        return this.f46792c;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.f46792c != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46790a), Integer.valueOf(this.f46791b), this.f46792c, this.f46793d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HMAC Parameters (variant: ");
        sb2.append(this.f46792c);
        sb2.append(", hashType: ");
        sb2.append(this.f46793d);
        sb2.append(", ");
        sb2.append(this.f46791b);
        sb2.append("-byte tags, and ");
        return androidx.appcompat.widget.a.c(sb2, this.f46790a, "-byte key)");
    }
}

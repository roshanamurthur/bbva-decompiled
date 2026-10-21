package com.google.crypto.tink.mac;

import androidx.appcompat.widget.g0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class AesCmacParameters extends MacParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Variant f46772c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Integer f46773a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Integer f46774b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Variant f46775c = Variant.NO_PREFIX;

        public AesCmacParameters build() throws GeneralSecurityException {
            Integer num = this.f46773a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f46774b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f46775c != null) {
                return new AesCmacParameters(num.intValue(), this.f46774b.intValue(), this.f46775c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f46773a = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTagSizeBytes(int i10) throws GeneralSecurityException {
            if (i10 < 10 || 16 < i10) {
                throw new GeneralSecurityException(g0.c("Invalid tag size for AesCmacParameters: ", i10));
            }
            this.f46774b = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setVariant(Variant variant) {
            this.f46775c = variant;
            return this;
        }
    }

    @Immutable
    public static final class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46776a;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant LEGACY = new Variant("LEGACY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        public Variant(String str) {
            this.f46776a = str;
        }

        public String toString() {
            return this.f46776a;
        }
    }

    public AesCmacParameters(int i10, int i11, Variant variant) {
        this.f46770a = i10;
        this.f46771b = i11;
        this.f46772c = variant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AesCmacParameters)) {
            return false;
        }
        AesCmacParameters aesCmacParameters = (AesCmacParameters) obj;
        return aesCmacParameters.getKeySizeBytes() == getKeySizeBytes() && aesCmacParameters.getTotalTagSizeBytes() == getTotalTagSizeBytes() && aesCmacParameters.getVariant() == getVariant();
    }

    public int getCryptographicTagSizeBytes() {
        return this.f46771b;
    }

    public int getKeySizeBytes() {
        return this.f46770a;
    }

    public int getTotalTagSizeBytes() {
        Variant variant = Variant.NO_PREFIX;
        Variant variant2 = this.f46772c;
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
        return this.f46772c;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.f46772c != Variant.NO_PREFIX;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46770a), Integer.valueOf(this.f46771b), this.f46772c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb2.append(this.f46772c);
        sb2.append(", ");
        sb2.append(this.f46771b);
        sb2.append("-byte tags, and ");
        return androidx.appcompat.widget.a.c(sb2, this.f46770a, "-byte key)");
    }
}

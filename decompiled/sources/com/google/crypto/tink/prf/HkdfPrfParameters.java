package com.google.crypto.tink.prf;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.util.Bytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Alpha
public final class HkdfPrfParameters extends PrfParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashType f46834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Bytes f46835c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Integer f46836a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public HashType f46837b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Bytes f46838c = null;

        public HkdfPrfParameters build() throws GeneralSecurityException {
            Integer num = this.f46836a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f46837b != null) {
                return new HkdfPrfParameters(num.intValue(), this.f46837b, this.f46838c);
            }
            throw new GeneralSecurityException("hash type is not set");
        }

        @CanIgnoreReturnValue
        public Builder setHashType(HashType hashType) {
            this.f46837b = hashType;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKeySizeBytes(int i10) throws GeneralSecurityException {
            if (i10 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit or larger are supported", Integer.valueOf(i10 * 8)));
            }
            this.f46836a = Integer.valueOf(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSalt(Bytes bytes) {
            if (bytes.size() == 0) {
                return this;
            }
            this.f46838c = bytes;
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
        public final String f46839a;

        public HashType(String str) {
            this.f46839a = str;
        }

        public String toString() {
            return this.f46839a;
        }
    }

    public HkdfPrfParameters(int i10, HashType hashType, Bytes bytes) {
        this.f46833a = i10;
        this.f46834b = hashType;
        this.f46835c = bytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HkdfPrfParameters)) {
            return false;
        }
        HkdfPrfParameters hkdfPrfParameters = (HkdfPrfParameters) obj;
        return hkdfPrfParameters.getKeySizeBytes() == getKeySizeBytes() && hkdfPrfParameters.getHashType() == getHashType() && Objects.equals(hkdfPrfParameters.getSalt(), getSalt());
    }

    public HashType getHashType() {
        return this.f46834b;
    }

    public int getKeySizeBytes() {
        return this.f46833a;
    }

    @Nullable
    public Bytes getSalt() {
        return this.f46835c;
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46833a), this.f46834b, this.f46835c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HKDF PRF Parameters (hashType: ");
        sb2.append(this.f46834b);
        sb2.append(", salt: ");
        sb2.append(this.f46835c);
        sb2.append(", and ");
        return androidx.appcompat.widget.a.c(sb2, this.f46833a, "-byte key)");
    }
}

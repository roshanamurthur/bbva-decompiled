package com.bbva.ethermobilesdk.cipher.token.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecretKeyGeneratorAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b,\u0010-B9\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010.J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J=\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR(\u0010+\u001a\u0004\u0018\u00010\f2\b\u0010%\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$¨\u0006/"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/model/SecretKeyGeneratorAttributes;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "component1", "component2", "component3", "component4", "", "component5", "keyFactoryAlgorithm", "keySpecAlgorithm", "keyLength", "iterations", "salt", "copy", "toString", "a", "Ljava/lang/String;", "getKeyFactoryAlgorithm", "()Ljava/lang/String;", "b", "getKeySpecAlgorithm", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getKeyLength", "()I", "d", "getIterations", "e", "[B", "getSalt", "()[B", "<set-?>", "f", "getSaltLength", "saltLength", "g", "getSaltSeed", "saltSeed", "<init>", "(Ljava/lang/String;Ljava/lang/String;II[B)V", "(Ljava/lang/String;Ljava/lang/String;III[B)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SecretKeyGeneratorAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String keyFactoryAlgorithm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String keySpecAlgorithm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int keyLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int iterations;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] salt;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int saltLength;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final byte[] saltSeed;

    public SecretKeyGeneratorAttributes(@NotNull String keyFactoryAlgorithm, @NotNull String keySpecAlgorithm, int i10, int i11, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(keyFactoryAlgorithm, "keyFactoryAlgorithm");
        Intrinsics.checkNotNullParameter(keySpecAlgorithm, "keySpecAlgorithm");
        this.keyFactoryAlgorithm = keyFactoryAlgorithm;
        this.keySpecAlgorithm = keySpecAlgorithm;
        this.keyLength = i10;
        this.iterations = i11;
        this.salt = bArr;
    }

    public static /* synthetic */ SecretKeyGeneratorAttributes copy$default(SecretKeyGeneratorAttributes secretKeyGeneratorAttributes, String str, String str2, int i10, int i11, byte[] bArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = secretKeyGeneratorAttributes.keyFactoryAlgorithm;
        }
        if ((i12 & 2) != 0) {
            str2 = secretKeyGeneratorAttributes.keySpecAlgorithm;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            i10 = secretKeyGeneratorAttributes.keyLength;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = secretKeyGeneratorAttributes.iterations;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            bArr = secretKeyGeneratorAttributes.salt;
        }
        return secretKeyGeneratorAttributes.copy(str, str3, i13, i14, bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyFactoryAlgorithm() {
        return this.keyFactoryAlgorithm;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeySpecAlgorithm() {
        return this.keySpecAlgorithm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getKeyLength() {
        return this.keyLength;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIterations() {
        return this.iterations;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final byte[] getSalt() {
        return this.salt;
    }

    @NotNull
    public final SecretKeyGeneratorAttributes copy(@NotNull String keyFactoryAlgorithm, @NotNull String keySpecAlgorithm, int keyLength, int iterations, @Nullable byte[] salt) {
        Intrinsics.checkNotNullParameter(keyFactoryAlgorithm, "keyFactoryAlgorithm");
        Intrinsics.checkNotNullParameter(keySpecAlgorithm, "keySpecAlgorithm");
        return new SecretKeyGeneratorAttributes(keyFactoryAlgorithm, keySpecAlgorithm, keyLength, iterations, salt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SecretKeyGeneratorAttributes.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.bbva.ethermobilesdk.cipher.token.model.SecretKeyGeneratorAttributes");
        SecretKeyGeneratorAttributes secretKeyGeneratorAttributes = (SecretKeyGeneratorAttributes) other;
        if (!Intrinsics.areEqual(this.keyFactoryAlgorithm, secretKeyGeneratorAttributes.keyFactoryAlgorithm) || !Intrinsics.areEqual(this.keySpecAlgorithm, secretKeyGeneratorAttributes.keySpecAlgorithm) || this.keyLength != secretKeyGeneratorAttributes.keyLength || this.iterations != secretKeyGeneratorAttributes.iterations) {
            return false;
        }
        byte[] bArr = this.salt;
        if (bArr != null) {
            byte[] bArr2 = secretKeyGeneratorAttributes.salt;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (secretKeyGeneratorAttributes.salt != null) {
            return false;
        }
        if (this.saltLength != secretKeyGeneratorAttributes.saltLength) {
            return false;
        }
        byte[] bArr3 = this.saltSeed;
        if (bArr3 != null) {
            if (secretKeyGeneratorAttributes.saltSeed == null) {
                return false;
            }
            Intrinsics.checkNotNull(bArr3);
            byte[] bArr4 = secretKeyGeneratorAttributes.saltSeed;
            Intrinsics.checkNotNull(bArr4);
            if (!Arrays.equals(bArr3, bArr4)) {
                return false;
            }
        } else if (secretKeyGeneratorAttributes.saltSeed != null) {
            return false;
        }
        return true;
    }

    public final int getIterations() {
        return this.iterations;
    }

    @NotNull
    public final String getKeyFactoryAlgorithm() {
        return this.keyFactoryAlgorithm;
    }

    public final int getKeyLength() {
        return this.keyLength;
    }

    @NotNull
    public final String getKeySpecAlgorithm() {
        return this.keySpecAlgorithm;
    }

    @Nullable
    public final byte[] getSalt() {
        return this.salt;
    }

    public final int getSaltLength() {
        return this.saltLength;
    }

    @Nullable
    public final byte[] getSaltSeed() {
        return this.saltSeed;
    }

    public int hashCode() {
        int iC = (((n1.c(this.keySpecAlgorithm, this.keyFactoryAlgorithm.hashCode() * 31, 31) + this.keyLength) * 31) + this.iterations) * 31;
        byte[] bArr = this.salt;
        int iHashCode = (((iC + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31) + this.saltLength) * 31;
        byte[] bArr2 = this.saltSeed;
        return iHashCode + (bArr2 != null ? Arrays.hashCode(bArr2) : 0);
    }

    @NotNull
    public String toString() {
        return "SecretKeyGeneratorAttributes(keyFactoryAlgorithm=" + this.keyFactoryAlgorithm + ", keySpecAlgorithm=" + this.keySpecAlgorithm + ", keyLength=" + this.keyLength + ", iterations=" + this.iterations + ", salt=" + Arrays.toString(this.salt) + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecretKeyGeneratorAttributes(@NotNull String keyFactoryAlgorithm, @NotNull String keySpecAlgorithm, int i10, int i11, int i12, @NotNull byte[] saltSeed) {
        this(keyFactoryAlgorithm, keySpecAlgorithm, i10, i11, null);
        Intrinsics.checkNotNullParameter(keyFactoryAlgorithm, "keyFactoryAlgorithm");
        Intrinsics.checkNotNullParameter(keySpecAlgorithm, "keySpecAlgorithm");
        Intrinsics.checkNotNullParameter(saltSeed, "saltSeed");
        this.saltLength = i12;
        this.saltSeed = saltSeed;
    }
}

package com.bbva.ethermobilesdk.cipher.token.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Arrays;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecretKeyBundle.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/token/model/SecretKeyBundle;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Ljavax/crypto/SecretKey;", "component1", "", "component2", "key", "salt", "copy", "", "toString", "a", "Ljavax/crypto/SecretKey;", "getKey", "()Ljavax/crypto/SecretKey;", "b", "[B", "getSalt", "()[B", "<init>", "(Ljavax/crypto/SecretKey;[B)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SecretKeyBundle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SecretKey key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] salt;

    public SecretKeyBundle(@NotNull SecretKey key, @NotNull byte[] salt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(salt, "salt");
        this.key = key;
        this.salt = salt;
    }

    public static /* synthetic */ SecretKeyBundle copy$default(SecretKeyBundle secretKeyBundle, SecretKey secretKey, byte[] bArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            secretKey = secretKeyBundle.key;
        }
        if ((i10 & 2) != 0) {
            bArr = secretKeyBundle.salt;
        }
        return secretKeyBundle.copy(secretKey, bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SecretKey getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getSalt() {
        return this.salt;
    }

    @NotNull
    public final SecretKeyBundle copy(@NotNull SecretKey key, @NotNull byte[] salt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(salt, "salt");
        return new SecretKeyBundle(key, salt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SecretKeyBundle.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.bbva.ethermobilesdk.cipher.token.model.SecretKeyBundle");
        SecretKeyBundle secretKeyBundle = (SecretKeyBundle) other;
        return Intrinsics.areEqual(this.key, secretKeyBundle.key) && Arrays.equals(this.salt, secretKeyBundle.salt);
    }

    @NotNull
    public final SecretKey getKey() {
        return this.key;
    }

    @NotNull
    public final byte[] getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return Arrays.hashCode(this.salt) + (this.key.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SecretKeyBundle(key=" + this.key + ", salt=" + Arrays.toString(this.salt) + ")";
    }
}

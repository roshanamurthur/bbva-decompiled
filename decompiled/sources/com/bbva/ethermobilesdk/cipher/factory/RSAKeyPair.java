package com.bbva.ethermobilesdk.cipher.factory;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RSAKeyPair.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/factory/RSAKeyPair;", "", "Ljava/security/interfaces/RSAPublicKey;", "component1", "Ljava/security/interfaces/RSAPrivateKey;", "component2", "public", "private", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/security/interfaces/RSAPublicKey;", "getPublic", "()Ljava/security/interfaces/RSAPublicKey;", "b", "Ljava/security/interfaces/RSAPrivateKey;", "getPrivate", "()Ljava/security/interfaces/RSAPrivateKey;", "<init>", "(Ljava/security/interfaces/RSAPublicKey;Ljava/security/interfaces/RSAPrivateKey;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RSAKeyPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RSAPublicKey public;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RSAPrivateKey private;

    public RSAKeyPair(@NotNull RSAPublicKey rSAPublicKey, @NotNull RSAPrivateKey rSAPrivateKey) {
        Intrinsics.checkNotNullParameter(rSAPublicKey, "public");
        Intrinsics.checkNotNullParameter(rSAPrivateKey, "private");
        this.public = rSAPublicKey;
        this.private = rSAPrivateKey;
    }

    public static /* synthetic */ RSAKeyPair copy$default(RSAKeyPair rSAKeyPair, RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rSAPublicKey = rSAKeyPair.public;
        }
        if ((i10 & 2) != 0) {
            rSAPrivateKey = rSAKeyPair.private;
        }
        return rSAKeyPair.copy(rSAPublicKey, rSAPrivateKey);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RSAPublicKey getPublic() {
        return this.public;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RSAPrivateKey getPrivate() {
        return this.private;
    }

    @NotNull
    public final RSAKeyPair copy(@NotNull RSAPublicKey rSAPublicKey, @NotNull RSAPrivateKey rSAPrivateKey) {
        Intrinsics.checkNotNullParameter(rSAPublicKey, "public");
        Intrinsics.checkNotNullParameter(rSAPrivateKey, "private");
        return new RSAKeyPair(rSAPublicKey, rSAPrivateKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RSAKeyPair)) {
            return false;
        }
        RSAKeyPair rSAKeyPair = (RSAKeyPair) other;
        return Intrinsics.areEqual(this.public, rSAKeyPair.public) && Intrinsics.areEqual(this.private, rSAKeyPair.private);
    }

    @NotNull
    public final RSAPrivateKey getPrivate() {
        return this.private;
    }

    @NotNull
    public final RSAPublicKey getPublic() {
        return this.public;
    }

    public int hashCode() {
        return this.private.hashCode() + (this.public.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RSAKeyPair(public=" + this.public + ", private=" + this.private + ")";
    }
}

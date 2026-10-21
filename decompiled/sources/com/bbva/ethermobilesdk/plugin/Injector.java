package com.bbva.ethermobilesdk.plugin;

import android.content.Context;
import com.bbva.ethermobilesdk.cipher.jwe.CipherAlgorithm;
import com.bbva.ethermobilesdk.cipher.jwe.JweCipher;
import com.bbva.ethermobilesdk.cipher.pincipher.PinCipher;
import com.bbva.ethermobilesdk.cipher.pincipher.exception.PinCipherException;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.plugin.model.PluginCipherError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\n\u0010\u000e\u001a\u00020\r*\u00020\fR$\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/Injector;", "", "Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/cipher/pincipher/PinCipher;", "getPinCipherClient", "Lcom/bbva/ethermobilesdk/cipher/jwe/CipherAlgorithm;", "cipherAlgorithm", "Lcom/bbva/ethermobilesdk/cipher/jwe/JweCipher;", "getJweCipherClient", "Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher;", "getSoftCipherClient", "Lcom/bbva/ethermobilesdk/cipher/pincipher/exception/PinCipherException;", "Lcom/bbva/ethermobilesdk/plugin/model/PluginCipherError;", "toInitializationError", "b", "Lcom/bbva/ethermobilesdk/cipher/jwe/JweCipher;", "getJweCipher", "()Lcom/bbva/ethermobilesdk/cipher/jwe/JweCipher;", "setJweCipher", "(Lcom/bbva/ethermobilesdk/cipher/jwe/JweCipher;)V", "jweCipher", "<init>", "()V", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static PinCipher f29908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static JweCipher jweCipher;

    @Nullable
    public final JweCipher getJweCipher() {
        return jweCipher;
    }

    @NotNull
    public final JweCipher getJweCipherClient(@NotNull CipherAlgorithm cipherAlgorithm) {
        Intrinsics.checkNotNullParameter(cipherAlgorithm, "cipherAlgorithm");
        JweCipher jweCipher2 = new JweCipher(cipherAlgorithm);
        jweCipher = jweCipher2;
        Intrinsics.checkNotNull(jweCipher2, "null cannot be cast to non-null type com.bbva.ethermobilesdk.cipher.jwe.JweCipher");
        return jweCipher2;
    }

    @NotNull
    public final PinCipher getPinCipherClient(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f29908a == null) {
            f29908a = new PinCipher(context);
        }
        PinCipher pinCipher = f29908a;
        Intrinsics.checkNotNull(pinCipher, "null cannot be cast to non-null type com.bbva.ethermobilesdk.cipher.pincipher.PinCipher");
        return pinCipher;
    }

    @NotNull
    public final SoftCipher getSoftCipherClient() {
        return new SoftCipher();
    }

    public final void setJweCipher(@Nullable JweCipher jweCipher2) {
        jweCipher = jweCipher2;
    }

    @NotNull
    public final PluginCipherError toInitializationError(@NotNull PinCipherException pinCipherException) {
        Intrinsics.checkNotNullParameter(pinCipherException, "<this>");
        return PluginCipherError.CLIENT_NOT_INITIALIZED;
    }
}

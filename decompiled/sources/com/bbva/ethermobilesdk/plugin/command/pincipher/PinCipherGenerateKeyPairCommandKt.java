package com.bbva.ethermobilesdk.plugin.command.pincipher;

import com.bbva.ethermobilesdk.cipher.pincipher.exception.PinCipherException;
import com.bbva.ethermobilesdk.plugin.model.PluginCipherError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PinCipherGenerateKeyPairCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toGenerateKeyPairError", "Lcom/bbva/ethermobilesdk/plugin/model/PluginCipherError;", "Lcom/bbva/ethermobilesdk/cipher/pincipher/exception/PinCipherException;", "cipher-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PinCipherGenerateKeyPairCommandKt {
    @NotNull
    public static final PluginCipherError toGenerateKeyPairError(@NotNull PinCipherException pinCipherException) {
        Intrinsics.checkNotNullParameter(pinCipherException, "<this>");
        return PluginCipherError.INVALID_KEY_PAIR;
    }
}

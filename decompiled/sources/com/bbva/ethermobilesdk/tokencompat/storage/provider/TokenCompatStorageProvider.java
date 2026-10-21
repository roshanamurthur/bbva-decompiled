package com.bbva.ethermobilesdk.tokencompat.storage.provider;

import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatRelayedStorage;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TokenCompatStorageProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/TokenCompatStorageProvider;", "", "()V", "get", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage;", "config", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "get$ethertoken_compat_release", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TokenCompatStorageProvider {

    @NotNull
    public static final TokenCompatStorageProvider INSTANCE = new TokenCompatStorageProvider();

    @NotNull
    public final TokenCompatStorage get$ethertoken_compat_release(@NotNull TokenCompatConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Storage relayedStorage = config.getRelayedStorage();
        return relayedStorage != null ? new TokenCompatRelayedStorage(config.getContext(), config.getStorageMode(), relayedStorage) : new TokenCompatStorage(config.getContext(), config.getStorageMode(), null, 4, null);
    }
}

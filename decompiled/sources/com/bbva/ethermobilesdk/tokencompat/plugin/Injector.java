package com.bbva.ethermobilesdk.tokencompat.plugin;

import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/plugin/Injector;", "", "()V", "createClient", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat;", "tokenCompatConfig", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "ethertoken-compat-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    @NotNull
    public final TokenCompat createClient(@NotNull TokenCompatConfig tokenCompatConfig) {
        Intrinsics.checkNotNullParameter(tokenCompatConfig, "tokenCompatConfig");
        return new TokenCompat(tokenCompatConfig);
    }
}

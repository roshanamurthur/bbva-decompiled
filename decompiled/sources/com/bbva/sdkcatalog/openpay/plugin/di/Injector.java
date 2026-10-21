package com.bbva.sdkcatalog.openpay.plugin.di;

import com.bbva.sdkcatalog.openpay.plugin.DefaultOpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/di/Injector;", "", "<init>", "()V", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "getOpenPayManager", "()Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "setOpenPayManager", "(Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;)V", "create", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    @Nullable
    private static OpenPayManager openPayManager;

    private Injector() {
    }

    @NotNull
    public final OpenPayManager create() {
        DefaultOpenPayManager defaultOpenPayManager = new DefaultOpenPayManager();
        openPayManager = defaultOpenPayManager;
        return defaultOpenPayManager;
    }

    @Nullable
    public final OpenPayManager getOpenPayManager() {
        return openPayManager;
    }

    public final void setOpenPayManager(@Nullable OpenPayManager openPayManager2) {
        openPayManager = openPayManager2;
    }
}

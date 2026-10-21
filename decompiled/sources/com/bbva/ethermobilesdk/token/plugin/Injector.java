package com.bbva.ethermobilesdk.token.plugin;

import android.content.Context;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.plugin.model.Configuration;
import com.bbva.ethermobilesdk.token.storage.Storage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\t\u001a\u00020\b2\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006J\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/Injector;", "", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/bbva/ethermobilesdk/token/plugin/model/Configuration;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "Lcom/bbva/ethermobilesdk/token/plugin/StorageProvider;", "provider", "", "init", "context", "configuration", "create", "Lcom/bbva/ethermobilesdk/token/EtherToken;", "a", "Lcom/bbva/ethermobilesdk/token/EtherToken;", "getClient", "()Lcom/bbva/ethermobilesdk/token/EtherToken;", "setClient", "(Lcom/bbva/ethermobilesdk/token/EtherToken;)V", "client", "<init>", "()V", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static EtherToken client;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Function2<? super Context, ? super Configuration, ? extends Storage> f30127b;

    public final void create(@NotNull Context context, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Function2<? super Context, ? super Configuration, ? extends Storage> function2 = f30127b;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storageProvider");
            function2 = null;
        }
        client = new EtherToken(function2.invoke(context, configuration));
    }

    @Nullable
    public final EtherToken getClient() {
        return client;
    }

    public final void init(@NotNull Function2<? super Context, ? super Configuration, ? extends Storage> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        f30127b = provider;
    }

    public final void setClient(@Nullable EtherToken etherToken) {
        client = etherToken;
    }
}

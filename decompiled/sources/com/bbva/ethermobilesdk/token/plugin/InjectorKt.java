package com.bbva.ethermobilesdk.token.plugin;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.plugin.model.PluginEtherTokenError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000*.\u0010\u0007\"\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b¨\u0006\f"}, d2 = {"withClient", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "block", "Lkotlin/Function1;", "Lcom/bbva/ethermobilesdk/token/EtherToken;", "StorageProvider", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/bbva/ethermobilesdk/token/plugin/model/Configuration;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "ethertoken-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InjectorKt {
    public static final void withClient(@NotNull CommandCallback callback, @NotNull Function1<? super EtherToken, Unit> block) {
        Unit unit;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        EtherToken client = Injector.INSTANCE.getClient();
        if (client != null) {
            block.invoke(client);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            callback.sendError(PluginEtherTokenError.CLIENT_NOT_INITIALIZED);
        }
    }
}

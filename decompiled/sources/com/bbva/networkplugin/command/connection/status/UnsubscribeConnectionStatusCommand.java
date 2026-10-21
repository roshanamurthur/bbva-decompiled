package com.bbva.networkplugin.command.connection.status;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.networkplugin.net.ConnectionStatusHandler;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UnsubscribeConnectionStatusCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/networkplugin/command/connection/status/UnsubscribeConnectionStatusCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/networkplugin/net/ConnectionStatusHandler;", "handler", "<init>", "(Lcom/bbva/networkplugin/net/ConnectionStatusHandler;)V", "Companion", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class UnsubscribeConnectionStatusCommand extends AbstractCommand implements CoroutineScope {

    @NotNull
    public static final String ID = "unsubscribe.connection.status";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ConnectionStatusHandler f35227p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35228q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsubscribeConnectionStatusCommand(@NotNull ConnectionStatusHandler handler) {
        super(Void.class);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f35227p0 = handler;
        this.f35228q0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35228q0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            this.f35227p0.unsubscribe();
            callback.sendEvent();
        } catch (Throwable unused) {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}

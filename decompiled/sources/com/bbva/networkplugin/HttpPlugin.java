package com.bbva.networkplugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.network.NetworkWorker;
import com.bbva.networkplugin.net.ConnectionStatusHandler;
import com.bbva.networkplugin.net.EndPointImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpPlugin.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/networkplugin/HttpPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "Companion", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class HttpPlugin extends Plugin {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f35223c = "Http";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EndPointImpl f35224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConnectionStatusHandler f35225b;

    public HttpPlugin(@NotNull NetworkWorker networkWorker) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        this.f35224a = new EndPointImpl(networkWorker, null, 2, null);
        this.f35225b = new ConnectionStatusHandler(networkWorker);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new HttpCommandFactory(this.f35224a, this.f35225b, null, 4, null);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return f35223c;
    }
}

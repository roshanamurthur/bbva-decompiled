package com.bbva.plugin.naturalauthentication;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.plugin.naturalauthentication.injection.Injector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NaturalAuthenticationPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/NaturalAuthenticationPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "client", "Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;", Constants.policy, "", "<init>", "(Lcom/bbva/ethermobilesdk/naturalauthentication/NaturalAuthentication;Ljava/lang/String;)V", "getId", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "Companion", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NaturalAuthenticationPlugin extends Plugin {

    @NotNull
    public static final String ID = "NaturalAuth";

    public NaturalAuthenticationPlugin(@NotNull NaturalAuthentication client, @NotNull String policy) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Injector.INSTANCE.initialize(client, policy);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new NaturalAuthenticationCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }
}

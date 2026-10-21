package com.bbva.plugin.permissions;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.permissions.command.CheckPermissionStateCommand;
import kotlin.Metadata;
import z6.f;
import z6.g;

/* JADX INFO: compiled from: PermissionsPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/permissions/PermissionsPluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "permissions-plugin_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PermissionsPluginCommandFactory extends CommandFactory {
    public PermissionsPluginCommandFactory() {
        addCommandProvider(CheckPermissionStateCommand.ID, new f(6));
        addCommandProvider("request", new g(7));
    }
}

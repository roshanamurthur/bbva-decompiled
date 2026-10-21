package com.bbva.plugin.localstorage;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.plugin.localstorage.command.secure.GetSecureCommand;
import com.bbva.plugin.localstorage.command.secure.InvalidateSecureKeyCommand;
import com.bbva.plugin.localstorage.command.secure.IsBiometricAvailableCommand;
import com.bbva.plugin.localstorage.command.secure.IsSecureHardwareCommand;
import com.bbva.plugin.localstorage.command.secure.SetSecureCommand;
import kotlin.Metadata;
import q6.a;
import z6.b;
import z6.c;
import z6.d;
import z6.e;
import z6.f;
import z6.g;
import z6.h;

/* JADX INFO: compiled from: LocalStoragePlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/localstorage/SecureStoragePluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SecureStoragePluginCommandFactory extends CommandFactory {
    public SecureStoragePluginCommandFactory() {
        addCommandProvider("get", new b(5));
        addCommandProvider(SetCommand.ID, new a(5));
        addCommandProvider(RemoveCommand.ID, new q6.b(7));
        addCommandProvider(ClearCommand.ID, new c(4));
        addCommandProvider(GetSecureCommand.ID, new d(4));
        addCommandProvider(SetSecureCommand.ID, new e(4));
        addCommandProvider(InvalidateSecureKeyCommand.ID, new f(5));
        addCommandProvider(IsSecureHardwareCommand.ID, new g(6));
        addCommandProvider(IsBiometricAvailableCommand.ID, new h(4));
    }
}

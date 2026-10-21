package com.bbva.ethermobilesdk.token.plugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.CreateClientCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateOtpCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GetActivatedTokensDetailCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GetTokenIdsCommand;
import com.bbva.ethermobilesdk.token.plugin.command.RemoveTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.SetDefaultOcraSuiteCommand;
import kotlin.Metadata;
import z6.a;
import z6.l;
import z6.n;
import z6.o;
import z6.p;
import z6.q;
import z6.r;
import z6.s;

/* JADX INFO: compiled from: EtherTokenCommandFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/EtherTokenCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EtherTokenCommandFactory extends CommandFactory {
    public EtherTokenCommandFactory() {
        addCommandProvider(CreateClientCommand.ID, new n(1));
        int i10 = 3;
        addCommandProvider(ActivateTokenCommand.ID, new a(i10));
        addCommandProvider(GenerateActivationFormCommand.ID, new l(i10));
        addCommandProvider(GenerateOtpCommand.ID, new o(i10));
        addCommandProvider(GetTokenIdsCommand.ID, new p(i10));
        int i11 = 2;
        addCommandProvider(GetActivatedTokensDetailCommand.ID, new q(i11));
        addCommandProvider(RemoveTokenCommand.ID, new r(i11));
        addCommandProvider(SetDefaultOcraSuiteCommand.ID, new s(i11));
    }
}

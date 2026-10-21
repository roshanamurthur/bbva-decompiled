package com.bbva.plugin.google.pay;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.google.pay.command.CardsPendingVerificationCommand;
import com.bbva.plugin.google.pay.command.GetPushDataCommand;
import com.bbva.plugin.google.pay.command.PushProvisioningCommand;
import com.bbva.plugin.google.pay.command.SearchCardsCommand;
import kotlin.Metadata;
import z6.a;
import z6.l;
import z6.n;
import z6.o;
import z6.p;

/* JADX INFO: compiled from: GooglePayCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/google/pay/GooglePayCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GooglePayCommandFactory extends CommandFactory {
    public GooglePayCommandFactory() {
        addCommandProvider(GetPushDataCommand.ID, new n(3));
        addCommandProvider(PushProvisioningCommand.ID, new a(4));
        addCommandProvider(CardsPendingVerificationCommand.ID, new l(4));
        addCommandProvider(SearchCardsCommand.ID, new o(5));
        addCommandProvider("getcardstatus", new p(4));
    }
}

package com.bbva.plugin.smsregex.request;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import kotlin.Metadata;
import z6.i;

/* JADX INFO: compiled from: SmsRegexCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/smsregex/request/SmsRegexCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "smsregex-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SmsRegexCommandFactory extends CommandFactory {
    public SmsRegexCommandFactory() {
        addCommandProvider("request", new i(4));
    }
}

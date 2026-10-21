package com.bbva.plugin.smsregex.request;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SmsRegexPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/smsregex/request/SmsRegexPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "()V", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "getId", "", "Companion", "smsregex-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SmsRegexPlugin extends Plugin {

    @NotNull
    public static final String ID = "Sms";

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new SmsRegexCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }
}

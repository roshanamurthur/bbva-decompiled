package com.bbva.plugin.rateapp;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import z6.v;

/* JADX INFO: compiled from: InAppReviewPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00060\u0004R\u00020\u0000H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/rateapp/InAppReviewPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "()V", "createCommandFactory", "Lcom/bbva/plugin/rateapp/InAppReviewPlugin$InAppReviewCommandFactory;", "getId", "", "Companion", "InAppReviewCommandFactory", "rateapp-plugin_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InAppReviewPlugin extends Plugin {

    /* JADX INFO: compiled from: InAppReviewPlugin.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/rateapp/InAppReviewPlugin$InAppReviewCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "(Lcom/bbva/plugin/rateapp/InAppReviewPlugin;)V", "rateapp-plugin_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class InAppReviewCommandFactory extends CommandFactory {
        public InAppReviewCommandFactory(InAppReviewPlugin inAppReviewPlugin) {
            addCommandProvider("rateapp", new v(6));
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "RateApp";
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public InAppReviewCommandFactory createCommandFactory() {
        return new InAppReviewCommandFactory(this);
    }
}

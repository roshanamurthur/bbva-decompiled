package com.bbva.plugin.biometrics;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z6.h;
import z6.i;

/* JADX INFO: compiled from: BiometricsPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00060\u0004R\u00020\u0000H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/biometrics/BiometricsPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "()V", "createCommandFactory", "Lcom/bbva/plugin/biometrics/BiometricsPlugin$BiometricsCommandFactory;", "getId", "", "BiometricsCommandFactory", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BiometricsPlugin extends Plugin {

    /* JADX INFO: compiled from: BiometricsPlugin.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/biometrics/BiometricsPlugin$BiometricsCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "(Lcom/bbva/plugin/biometrics/BiometricsPlugin;)V", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class BiometricsCommandFactory extends CommandFactory {
        public BiometricsCommandFactory(BiometricsPlugin this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            addCommandProvider("checkenabled", new h(3));
            addCommandProvider(NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, new i(2));
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "Biometrics";
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public BiometricsCommandFactory createCommandFactory() {
        return new BiometricsCommandFactory(this);
    }
}

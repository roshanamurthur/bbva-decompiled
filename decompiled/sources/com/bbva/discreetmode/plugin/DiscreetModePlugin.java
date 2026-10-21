package com.bbva.discreetmode.plugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.discreetmode.DiscreetMode;
import com.bbva.discreetmode.models.DiscreetModeConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiscreetModePlugin.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/discreetmode/plugin/DiscreetModePlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/discreetmode/models/DiscreetModeConfiguration;", "configuration", "Lcom/bbva/discreetmode/DiscreetMode;", "discreetMode", "<init>", "(Lcom/bbva/discreetmode/models/DiscreetModeConfiguration;Lcom/bbva/discreetmode/DiscreetMode;)V", "Companion", "discreetmode-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModePlugin extends Plugin {

    @NotNull
    public static final String ID = "DiscreetModePlugin";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DiscreetMode f29086a;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscreetModePlugin() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new DiscreetModeCommandFactory(this.f29086a);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DiscreetModePlugin(DiscreetModeConfiguration discreetModeConfiguration, DiscreetMode discreetMode, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        discreetModeConfiguration = (i10 & 1) != 0 ? new DiscreetModeConfiguration(null, null, 3, null) : discreetModeConfiguration;
        this(discreetModeConfiguration, (i10 & 2) != 0 ? new DiscreetMode(discreetModeConfiguration) : discreetMode);
    }

    public DiscreetModePlugin(@NotNull DiscreetModeConfiguration configuration, @NotNull DiscreetMode discreetMode) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(discreetMode, "discreetMode");
        this.f29086a = discreetMode;
    }
}

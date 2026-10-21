package com.bbva.speech.plugin;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import com.bbva.speech.plugin.injector.Injector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SpeechPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/speech/plugin/SpeechPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "()V", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "getId", "", "initialize", "", "components", "Lcom/bbva/androidtoolkit/plugin/component/PluginComponentContainer;", "speech-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SpeechPlugin extends Plugin {
    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new SpeechCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "SpeechPlugin";
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    public void initialize(@NotNull PluginComponentContainer components) {
        Intrinsics.checkNotNullParameter(components, "components");
        super.initialize(components);
        Injector injector = Injector.INSTANCE;
        Application application = components.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "components.application");
        injector.init(application);
    }
}

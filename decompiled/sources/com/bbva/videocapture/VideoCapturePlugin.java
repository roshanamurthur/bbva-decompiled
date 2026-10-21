package com.bbva.videocapture;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import com.bbva.videocapture.di.Injector;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoCapturePlugin.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/videocapture/VideoCapturePlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "<init>", "()V", "initialize", "", "components", "Lcom/bbva/androidtoolkit/plugin/component/PluginComponentContainer;", "getId", "", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "Companion", "video-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoCapturePlugin extends Plugin {

    @NotNull
    public static final String ID = "VideoCapture";

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new VideoCaptureCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    public void initialize(@Nullable PluginComponentContainer components) {
        super.initialize(components);
        Injector.INSTANCE.create();
    }
}

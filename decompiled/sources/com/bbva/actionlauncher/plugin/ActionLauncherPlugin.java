package com.bbva.actionlauncher.plugin;

import android.app.Application;
import com.bbva.actionlauncher.ActionLauncherConfig;
import com.bbva.actionlauncher.AndroidActionLauncher;
import com.bbva.actionlauncher.model.PlatformType;
import com.bbva.actionlauncher.plugin.factory.ActionLauncherCommandFactory;
import com.bbva.actionlauncher.plugin.params.FileSystemConfig;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActionLauncherPlugin.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0014¨\u0006\u0011"}, d2 = {"Lcom/bbva/actionlauncher/plugin/ActionLauncherPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/component/PluginComponentContainer;", "components", "", "initialize", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/actionlauncher/plugin/params/FileSystemConfig;", "config", "Lcom/bbva/actionlauncher/model/PlatformType;", "platformType", "<init>", "(Lcom/bbva/actionlauncher/plugin/params/FileSystemConfig;Lcom/bbva/actionlauncher/model/PlatformType;)V", "Companion", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class ActionLauncherPlugin extends Plugin {

    @NotNull
    public static final String ID = "ActionLauncher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FileSystemConfig f26460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlatformType f26461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AndroidActionLauncher f26462c;

    public ActionLauncherPlugin(@NotNull FileSystemConfig config, @NotNull PlatformType platformType) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(platformType, "platformType");
        this.f26460a = config;
        this.f26461b = platformType;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        AndroidActionLauncher androidActionLauncher = this.f26462c;
        if (androidActionLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("actionLauncher");
            androidActionLauncher = null;
        }
        return new ActionLauncherCommandFactory(androidActionLauncher, this.f26461b);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    public void initialize(@NotNull PluginComponentContainer components) {
        Intrinsics.checkNotNullParameter(components, "components");
        Application application = components.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "components.application");
        FileSystemConfig fileSystemConfig = this.f26460a;
        this.f26462c = new AndroidActionLauncher(application, new ActionLauncherConfig(fileSystemConfig.getAuthorities(), fileSystemConfig.getTargetPath(), 0, 0, 12, null));
        super.initialize(components);
    }
}

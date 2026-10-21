package com.bbva.actionlauncher.plugin.factory;

import c4.a;
import c4.b;
import c4.c;
import c4.d;
import c4.e;
import c4.f;
import c4.g;
import c4.i;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.model.PlatformType;
import com.bbva.actionlauncher.plugin.commands.ShareFileCommand;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActionLauncherCommandFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/actionlauncher/plugin/factory/ActionLauncherCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "Lcom/bbva/actionlauncher/ActionLauncher;", "a", "Lcom/bbva/actionlauncher/ActionLauncher;", "getActionLauncher", "()Lcom/bbva/actionlauncher/ActionLauncher;", "actionLauncher", "Lcom/bbva/actionlauncher/model/PlatformType;", "b", "Lcom/bbva/actionlauncher/model/PlatformType;", "getPlatformType", "()Lcom/bbva/actionlauncher/model/PlatformType;", "platformType", "<init>", "(Lcom/bbva/actionlauncher/ActionLauncher;Lcom/bbva/actionlauncher/model/PlatformType;)V", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class ActionLauncherCommandFactory extends CommandFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ActionLauncher actionLauncher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PlatformType platformType;

    public ActionLauncherCommandFactory(@NotNull ActionLauncher actionLauncher, @NotNull PlatformType platformType) {
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
        Intrinsics.checkNotNullParameter(platformType, "platformType");
        this.actionLauncher = actionLauncher;
        this.platformType = platformType;
        addCommandProvider("openmaps", new a(this, 0));
        addCommandProvider("canopenuri", new b(this, 0));
        addCommandProvider("openuri", new c(this, 0));
        addCommandProvider("openmarket", new d(this, 0));
        addCommandProvider("opendialer", new e(this, 0));
        addCommandProvider("share", new f(this, 0));
        addCommandProvider("openappsettings", new g(this, 0));
        final ShareFileCommand shareFileCommand = new ShareFileCommand(actionLauncher);
        addCommandProvider("sharefile", new CommandProvider() { // from class: c4.h
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            public final AbstractCommand create() {
                ShareFileCommand this_with = shareFileCommand;
                Intrinsics.checkNotNullParameter(this_with, "$this_with");
                return this_with;
            }
        });
        addCommandProvider("shareimage", new i(shareFileCommand, 0));
    }

    @NotNull
    public final ActionLauncher getActionLauncher() {
        return this.actionLauncher;
    }

    @NotNull
    public final PlatformType getPlatformType() {
        return this.platformType;
    }
}

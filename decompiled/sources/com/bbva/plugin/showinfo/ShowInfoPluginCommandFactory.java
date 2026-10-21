package com.bbva.plugin.showinfo;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.showinfo.command.HideCommand;
import com.bbva.plugin.showinfo.command.NativeListModalCommand;
import com.bbva.plugin.showinfo.command.TooltipCommand;
import com.bbva.plugin.showinfo.manager.InfoHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r7.b;
import r7.c;
import r7.d;
import sa.a;
import z6.f;

/* JADX INFO: compiled from: ShowinfoPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/showinfo/ShowInfoPluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "", "", "", "snackBarImages", "Lcom/bbva/plugin/showinfo/manager/InfoHandler;", "infoHandler", "<init>", "(Ljava/util/Map;Lcom/bbva/plugin/showinfo/manager/InfoHandler;)V", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class ShowInfoPluginCommandFactory extends CommandFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Integer> f35997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InfoHandler f35998b;

    public ShowInfoPluginCommandFactory(@NotNull Map<String, Integer> snackBarImages, @NotNull InfoHandler infoHandler) {
        Intrinsics.checkNotNullParameter(snackBarImages, "snackBarImages");
        Intrinsics.checkNotNullParameter(infoHandler, "infoHandler");
        this.f35997a = snackBarImages;
        this.f35998b = infoHandler;
        addCommandProvider("toast", new a(this, 1));
        addCommandProvider("snackbar", new b(this, 2));
        addCommandProvider("notification", new c(this, 2));
        addCommandProvider(HideCommand.ID, new d(this, 3));
        addCommandProvider(NativeListModalCommand.ID, new f(7));
        addCommandProvider(TooltipCommand.ID, new sa.d(this, 1));
    }
}

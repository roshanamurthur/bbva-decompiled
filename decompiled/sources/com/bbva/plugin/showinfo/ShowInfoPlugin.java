package com.bbva.plugin.showinfo;

import bk.q;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.plugin.showinfo.manager.BasicInfoHandler;
import com.bbva.plugin.showinfo.manager.InfoHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShowinfoPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\n\u001a\u00020\tH\u0014¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/showinfo/ShowInfoPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "", "", "images", "", "setSnackBarImages", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/plugin/showinfo/manager/InfoHandler;", "infoHandler", "<init>", "(Lcom/bbva/plugin/showinfo/manager/InfoHandler;)V", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class ShowInfoPlugin extends Plugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InfoHandler f35995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Map<String, Integer> f35996b;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowInfoPlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new ShowInfoPluginCommandFactory(this.f35996b, this.f35995a);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "ShowInfoPlugin";
    }

    public final void setSnackBarImages(@NotNull Map<String, Integer> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f35996b = images;
    }

    public ShowInfoPlugin(@NotNull InfoHandler infoHandler) {
        Intrinsics.checkNotNullParameter(infoHandler, "infoHandler");
        this.f35995a = infoHandler;
        this.f35996b = q.emptyMap();
    }

    public /* synthetic */ ShowInfoPlugin(InfoHandler infoHandler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new BasicInfoHandler() : infoHandler);
    }
}

package com.bbva.glomohybrid.documents.plugin;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.glomohybrid.documents.common.FileUseCaseFactory;
import com.bbva.glomohybrid.documents.plugin.factory.OpenDocumentCommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenDocumentPlugin.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/documents/plugin/OpenDocumentPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "useCaseFactory", "Lcom/bbva/glomohybrid/documents/common/FileUseCaseFactory;", "actionLauncher", "Lcom/bbva/actionlauncher/ActionLauncher;", "uriExporter", "Lcom/bbva/glomohybrid/documents/plugin/UriExporter;", "(Lcom/bbva/glomohybrid/documents/common/FileUseCaseFactory;Lcom/bbva/actionlauncher/ActionLauncher;Lcom/bbva/glomohybrid/documents/plugin/UriExporter;)V", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "getId", "", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OpenDocumentPlugin extends Plugin {
    public OpenDocumentPlugin(@NotNull FileUseCaseFactory useCaseFactory, @NotNull ActionLauncher actionLauncher, @NotNull UriExporter uriExporter) {
        Intrinsics.checkNotNullParameter(useCaseFactory, "useCaseFactory");
        Intrinsics.checkNotNullParameter(actionLauncher, "actionLauncher");
        Intrinsics.checkNotNullParameter(uriExporter, "uriExporter");
        Injector.init$default(Injector.INSTANCE, useCaseFactory, actionLauncher, uriExporter, null, 8, null);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new OpenDocumentCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "OpenDocument";
    }
}

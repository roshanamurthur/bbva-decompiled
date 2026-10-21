package com.bbva.document.scanner.plugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.document.scanner.DocumentScanner;
import com.bbva.document.scanner.plugin.launcher.DocumentScannerLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentScannerPlugin.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/document/scanner/plugin/DocumentScannerPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "documentScanner", "Lcom/bbva/document/scanner/DocumentScanner;", "(Lcom/bbva/document/scanner/DocumentScanner;)V", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "getId", "", "Companion", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DocumentScannerPlugin extends Plugin {

    @NotNull
    public static final String ID = "DocumentScannerPlugin";

    public DocumentScannerPlugin(@NotNull DocumentScanner documentScanner) {
        Intrinsics.checkNotNullParameter(documentScanner, "documentScanner");
        Injector.INSTANCE.initialize(new DocumentScannerLauncher(documentScanner, null, 2, null));
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new DocumentScannerCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }
}

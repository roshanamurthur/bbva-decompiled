package com.bbva.document.scanner.plugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.document.scanner.plugin.command.PreviewDocumentCommand;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import kotlin.Metadata;
import q6.a;
import q6.b;

/* JADX INFO: compiled from: DocumentScannerCommandFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/document/scanner/plugin/DocumentScannerCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DocumentScannerCommandFactory extends CommandFactory {
    public DocumentScannerCommandFactory() {
        addCommandProvider(ScanDocumentCommand.ID, new a(0));
        addCommandProvider(PreviewDocumentCommand.ID, new b(0));
    }
}

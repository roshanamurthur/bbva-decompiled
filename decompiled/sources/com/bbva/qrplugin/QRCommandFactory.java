package com.bbva.qrplugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import kotlin.Metadata;
import z6.u;
import z6.v;

/* JADX INFO: compiled from: QRPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/qrplugin/QRCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "qr-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QRCommandFactory extends CommandFactory {
    public QRCommandFactory() {
        addCommandProvider(ScanDocumentCommand.ID, new u(5));
        addCommandProvider("fromimage", new v(7));
    }
}

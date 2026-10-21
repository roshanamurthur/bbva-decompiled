package com.bbva.ocrcardplugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import kotlin.Metadata;
import z6.s;
import z6.t;

/* JADX INFO: compiled from: OcrCardPlugin.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ocrcardplugin/OcrCardCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "ocrcard-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OcrCardCommandFactory extends CommandFactory {
    public OcrCardCommandFactory() {
        addCommandProvider("canscan", new s(3));
        addCommandProvider(ScanDocumentCommand.ID, new t(2));
    }
}

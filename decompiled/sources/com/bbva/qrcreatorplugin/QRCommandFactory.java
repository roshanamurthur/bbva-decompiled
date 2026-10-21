package com.bbva.qrcreatorplugin;

import c4.f;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.qrcreatorplugin.command.GenerateCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QRCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/qrcreatorplugin/QRCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "codeGenerator", "Lcom/bbva/qrcreatorplugin/CodeGenerator;", "(Lcom/bbva/qrcreatorplugin/CodeGenerator;)V", "qrcreator-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QRCommandFactory extends CommandFactory {
    public QRCommandFactory(@NotNull CodeGenerator codeGenerator) {
        Intrinsics.checkNotNullParameter(codeGenerator, "codeGenerator");
        addCommandProvider(GenerateCommand.ID, new f(codeGenerator, 3));
    }
}

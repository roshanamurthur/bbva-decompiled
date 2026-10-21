package com.bbva.glomohybrid.documents.plugin.factory;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.glomohybrid.documents.plugin.commands.OpenBase64Command;
import com.bbva.glomohybrid.documents.plugin.commands.OpenDocumentCommand;
import com.bbva.glomohybrid.documents.plugin.commands.OpenDocumentUrlCommand;
import com.bbva.glomohybrid.documents.plugin.commands.OpenPathCommand;
import com.bbva.glomohybrid.documents.plugin.commands.OpenTermsCommand;
import kotlin.Metadata;
import q6.a;
import z6.b;
import z6.u;
import z6.v;

/* JADX INFO: compiled from: OpenDocumentCommandFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/documents/plugin/factory/OpenDocumentCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OpenDocumentCommandFactory extends CommandFactory {
    public OpenDocumentCommandFactory() {
        addCommandProvider(OpenTermsCommand.ID, new u(2));
        addCommandProvider(OpenDocumentCommand.ID, new v(3));
        addCommandProvider(OpenDocumentUrlCommand.ID, new b(2));
        addCommandProvider(OpenBase64Command.ID, new a(3));
        addCommandProvider(OpenPathCommand.ID, new q6.b(4));
    }
}

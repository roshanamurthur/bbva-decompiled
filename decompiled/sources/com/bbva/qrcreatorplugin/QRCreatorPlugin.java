package com.bbva.qrcreatorplugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QRCreatorPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/qrcreatorplugin/QRCreatorPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/qrcreatorplugin/CodeGenerator;", "codeGenerator", "<init>", "(Lcom/bbva/qrcreatorplugin/CodeGenerator;)V", "Companion", "qrcreator-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class QRCreatorPlugin extends Plugin {

    @NotNull
    public static final String ID = "QRCreator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CodeGenerator f36340a;

    /* JADX WARN: Multi-variable type inference failed */
    public QRCreatorPlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new QRCommandFactory(this.f36340a);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    public /* synthetic */ QRCreatorPlugin(CodeGenerator codeGenerator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new DefaultCodeGenerator() : codeGenerator);
    }

    public QRCreatorPlugin(@NotNull CodeGenerator codeGenerator) {
        Intrinsics.checkNotNullParameter(codeGenerator, "codeGenerator");
        this.f36340a = codeGenerator;
    }
}

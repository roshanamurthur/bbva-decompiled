package com.bbva.qrcreatorplugin.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.qrcreatorplugin.CodeGenerator;
import com.bbva.qrcreatorplugin.model.GenerateDTO;
import com.bbva.qrcreatorplugin.validator.GenerateDTOValidator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GenerateCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/qrcreatorplugin/command/GenerateCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/qrcreatorplugin/model/GenerateDTO;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/qrcreatorplugin/CodeGenerator;", "codeGenerator", "<init>", "(Lcom/bbva/qrcreatorplugin/CodeGenerator;)V", "Companion", "qrcreator-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class GenerateCommand extends AbstractCommand<GenerateDTO> {

    @NotNull
    public static final String ID = "generate";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CodeGenerator f36341p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateCommand(@NotNull CodeGenerator codeGenerator) {
        super(GenerateDTO.class, new GenerateDTOValidator());
        Intrinsics.checkNotNullParameter(codeGenerator, "codeGenerator");
        this.f36341p0 = codeGenerator;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull GenerateDTO params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            boolean zAreEqual = Intrinsics.areEqual(params.getFormat(), "QR");
            CodeGenerator codeGenerator = this.f36341p0;
            callback.sendEvent(zAreEqual ? codeGenerator.qr(params.toQr()) : codeGenerator.barcode(params.toBarcode()));
        } catch (Exception unused) {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}

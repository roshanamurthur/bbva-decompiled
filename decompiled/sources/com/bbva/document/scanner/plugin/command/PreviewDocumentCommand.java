package com.bbva.document.scanner.plugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.document.scanner.PreviewOptions;
import com.bbva.document.scanner.plugin.launcher.DocumentScannerActivityLauncher;
import com.bbva.document.scanner.plugin.model.PreviewDocumentParams;
import com.bbva.document.scanner.plugin.model.RatioParamKt;
import com.bbva.document.scanner.plugin.validators.PreviewDocumentParamsValidator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PreviewDocumentCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/document/scanner/plugin/command/PreviewDocumentCommand;", "Lcom/bbva/document/scanner/plugin/command/ActivityAwareCommand;", "Lcom/bbva/document/scanner/plugin/model/PreviewDocumentParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class PreviewDocumentCommand extends ActivityAwareCommand<PreviewDocumentParams> {

    @NotNull
    public static final String ID = "preview";

    /* JADX INFO: compiled from: PreviewDocumentCommand.kt */
    public static final class a extends Lambda implements Function2<DocumentScannerActivityLauncher, Activity, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PreviewDocumentParams f29145q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29146r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PreviewDocumentParams previewDocumentParams, CommandCallback commandCallback) {
            super(2);
            this.f29145q0 = previewDocumentParams;
            this.f29146r0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(DocumentScannerActivityLauncher documentScannerActivityLauncher, Activity activity) {
            DocumentScannerActivityLauncher withScannerRequest = documentScannerActivityLauncher;
            Activity it = activity;
            Intrinsics.checkNotNullParameter(withScannerRequest, "$this$withScannerRequest");
            Intrinsics.checkNotNullParameter(it, "it");
            withScannerRequest.previewDocument(it, PreviewDocumentCommand.access$toPreviewOptions(PreviewDocumentCommand.this, this.f29145q0), new com.bbva.document.scanner.plugin.command.a(this.f29146r0));
            return Unit.INSTANCE;
        }
    }

    public PreviewDocumentCommand() {
        super(PreviewDocumentParams.class, new PreviewDocumentParamsValidator());
    }

    public static final PreviewOptions access$toPreviewOptions(PreviewDocumentCommand previewDocumentCommand, PreviewDocumentParams previewDocumentParams) {
        previewDocumentCommand.getClass();
        String uri = previewDocumentParams.getUri();
        Intrinsics.checkNotNull(uri);
        return new PreviewOptions(uri, RatioParamKt.toRatio(previewDocumentParams.getRatio()), previewDocumentParams.getTitleText(), previewDocumentParams.getPrimaryButtonText(), previewDocumentParams.getSecondaryButtonText(), false, 32, null);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull PreviewDocumentParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        withScannerRequest(callback, new a(params, callback));
    }
}

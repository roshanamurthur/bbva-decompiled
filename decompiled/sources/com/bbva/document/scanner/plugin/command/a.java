package com.bbva.document.scanner.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.document.scanner.plugin.model.PreviewResponse;
import com.bbva.document.scanner.presentation.preview.PreviewResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PreviewDocumentCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Lambda implements Function1<PreviewResult, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f29149p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CommandCallback commandCallback) {
        super(1);
        this.f29149p0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PreviewResult previewResult) {
        PreviewResult result = previewResult;
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z10 = result instanceof PreviewResult.Success;
        CommandCallback commandCallback = this.f29149p0;
        if (z10) {
            commandCallback.sendEvent(PreviewResponse.Primary.toJson());
        } else if (result instanceof PreviewResult.Retry) {
            commandCallback.sendEvent(PreviewResponse.Secondary.toJson());
        } else if (result instanceof PreviewResult.Cancel) {
            commandCallback.sendError(Errors.ErrorCanceled);
        } else {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}

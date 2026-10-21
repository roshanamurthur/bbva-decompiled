package com.bbva.dcaptureplugin.command.params;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LaunchDocumentCaptureParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/dcaptureplugin/command/params/LaunchDocumentCaptureParamsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/dcaptureplugin/command/params/LaunchDocumentCaptureParams;", "<init>", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LaunchDocumentCaptureParamsValidator implements ValidatorChecker<LaunchDocumentCaptureParams> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull LaunchDocumentCaptureParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        List<String> documents = params.getDocuments();
        return (documents == null || documents.isEmpty() || params.getConfiguration() == null) ? false : true;
    }
}

package com.bbva.document.scanner.plugin.validators;

import com.bbva.document.scanner.plugin.model.CaptureDocumentParams;
import com.bbva.document.scanner.plugin.model.RatioParam;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScanDocumentParamsValidator.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/document/scanner/plugin/validators/ScanDocumentParamsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/document/scanner/plugin/model/CaptureDocumentParams;", "params", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "<init>", "()V", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class ScanDocumentParamsValidator implements ValidatorChecker<CaptureDocumentParams> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull CaptureDocumentParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.getRatio() != null && !ValidationConstantsKt.getSupportedRatios().contains(params.getRatio().getType())) {
            return false;
        }
        RatioParam ratio = params.getRatio();
        return !Intrinsics.areEqual(ratio != null ? ratio.getType() : null, "custom") || params.getRatio().getParameters().keySet().containsAll(ValidationConstantsKt.getSupportedCustomKeys());
    }
}

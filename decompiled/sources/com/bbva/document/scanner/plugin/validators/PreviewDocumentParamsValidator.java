package com.bbva.document.scanner.plugin.validators;

import com.bbva.document.scanner.plugin.model.PreviewDocumentParams;
import com.bbva.document.scanner.plugin.model.RatioParam;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PreviewDocumentParamsValidator.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/document/scanner/plugin/validators/PreviewDocumentParamsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/document/scanner/plugin/model/PreviewDocumentParams;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreviewDocumentParamsValidator implements ValidatorChecker<PreviewDocumentParams> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull PreviewDocumentParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.getUri() == null || !new File(params.getUri()).exists()) {
            return false;
        }
        List<String> supportedRatios = ValidationConstantsKt.getSupportedRatios();
        RatioParam ratio = params.getRatio();
        if (!CollectionsKt___CollectionsKt.contains(supportedRatios, ratio != null ? ratio.getType() : null)) {
            return false;
        }
        RatioParam ratio2 = params.getRatio();
        if (Intrinsics.areEqual(ratio2 != null ? ratio2.getType() : null, "custom")) {
            return params.getRatio().getParameters().keySet().containsAll(ValidationConstantsKt.getSupportedCustomKeys());
        }
        return true;
    }
}

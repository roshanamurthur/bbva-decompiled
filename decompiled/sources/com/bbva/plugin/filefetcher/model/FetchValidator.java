package com.bbva.plugin.filefetcher.model;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/filefetcher/model/FetchValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/plugin/filefetcher/model/FetchDTO;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "filefetcher-plugin_release"}, k = 1, mv = {1, 1, 16})
public final class FetchValidator implements ValidatorChecker<FetchDTO> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull FetchDTO params) {
        return params.getContentType() != null;
    }
}

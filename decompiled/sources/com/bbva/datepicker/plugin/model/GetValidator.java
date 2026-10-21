package com.bbva.datepicker.plugin.model;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetValidator.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/datepicker/plugin/model/GetValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/datepicker/plugin/model/GetRequest;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "datepicker-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class GetValidator implements ValidatorChecker<GetRequest> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull GetRequest params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return params.getDefaultDate() != null;
    }
}

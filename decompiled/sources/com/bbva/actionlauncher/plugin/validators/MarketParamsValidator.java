package com.bbva.actionlauncher.plugin.validators;

import com.bbva.actionlauncher.plugin.params.MarketParams;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Validators.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/actionlauncher/plugin/validators/MarketParamsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/actionlauncher/plugin/params/MarketParams;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MarketParamsValidator implements ValidatorChecker<MarketParams> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@Nullable MarketParams params) {
        if (params == null) {
            return false;
        }
        String packageId = params.getPackageId();
        return !(packageId == null || packageId.length() == 0);
    }
}

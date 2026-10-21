package com.bbva.discreetmode.plugin.commands.validators;

import com.bbva.discreetmode.plugin.commands.models.StartMonitoringParams;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.text.l;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StartMonitoringParamsValidator.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/discreetmode/plugin/commands/validators/StartMonitoringParamsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/discreetmode/plugin/commands/models/StartMonitoringParams;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "discreetmode-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StartMonitoringParamsValidator implements ValidatorChecker<StartMonitoringParams> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@Nullable StartMonitoringParams params) {
        String type = params == null ? null : params.getType();
        return !(type == null || l.isBlank(type));
    }
}

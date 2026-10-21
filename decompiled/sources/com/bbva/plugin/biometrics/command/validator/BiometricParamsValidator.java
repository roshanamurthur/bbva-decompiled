package com.bbva.plugin.biometrics.command.validator;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.plugin.biometrics.command.params.BiometricParams;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricParamsValidator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/biometrics/command/validator/BiometricParamsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/plugin/biometrics/command/params/BiometricParams;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BiometricParamsValidator implements ValidatorChecker<BiometricParams> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@Nullable BiometricParams params) {
        String title;
        String negativeButtonText;
        return (params == null || (title = params.getTitle()) == null || title.length() == 0 || (negativeButtonText = params.getNegativeButtonText()) == null || negativeButtonText.length() == 0) ? false : true;
    }
}

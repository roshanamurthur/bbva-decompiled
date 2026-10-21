package com.bbva.plugin.google.pay.command.validator;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.plugin.google.pay.request.PushProvisioningRequest;
import com.bbva.plugin.google.pay.utils.ExtensionsKt;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CommandValidators.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/google/pay/command/validator/PushProvisioningValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/plugin/google/pay/request/PushProvisioningRequest;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PushProvisioningValidator implements ValidatorChecker<PushProvisioningRequest> {

    @NotNull
    public static final PushProvisioningValidator INSTANCE = new PushProvisioningValidator();

    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@Nullable PushProvisioningRequest params) {
        return params != null && params.getPan().length() > 0 && ExtensionsKt.isValidPan(params.getPan()) && params.getAlias().length() > 0 && params.getActivationData().length() > 0;
    }
}

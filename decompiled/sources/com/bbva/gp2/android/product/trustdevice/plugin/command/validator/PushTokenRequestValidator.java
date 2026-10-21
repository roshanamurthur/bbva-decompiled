package com.bbva.gp2.android.product.trustdevice.plugin.command.validator;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.gp2.android.product.trustdevice.plugin.request.PushTokenRequest;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.text.l;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CommandValidators.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/command/validator/PushTokenRequestValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/gp2/android/product/trustdevice/plugin/request/PushTokenRequest;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final class PushTokenRequestValidator implements ValidatorChecker<PushTokenRequest> {
    public static final PushTokenRequestValidator INSTANCE = new PushTokenRequestValidator();

    private PushTokenRequestValidator() {
    }

    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@Nullable PushTokenRequest params) {
        String pushToken;
        return (params == null || (pushToken = params.getPushToken()) == null || l.isBlank(pushToken)) ? false : true;
    }
}

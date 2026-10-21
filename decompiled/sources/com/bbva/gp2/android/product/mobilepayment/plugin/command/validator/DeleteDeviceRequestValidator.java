package com.bbva.gp2.android.product.mobilepayment.plugin.command.validator;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.gp2.android.product.mobilepayment.plugin.request.DeleteDeviceRequest;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CommandValidators.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/command/validator/DeleteDeviceRequestValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/gp2/android/product/mobilepayment/plugin/request/DeleteDeviceRequest;", "<init>", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteDeviceRequestValidator implements ValidatorChecker<DeleteDeviceRequest> {

    @NotNull
    public static final DeleteDeviceRequestValidator INSTANCE = new DeleteDeviceRequestValidator();

    private DeleteDeviceRequestValidator() {
    }

    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@Nullable DeleteDeviceRequest params) {
        String pkcs7;
        return (params == null || (pkcs7 = params.getPkcs7()) == null || l.isBlank(pkcs7)) ? false : true;
    }
}

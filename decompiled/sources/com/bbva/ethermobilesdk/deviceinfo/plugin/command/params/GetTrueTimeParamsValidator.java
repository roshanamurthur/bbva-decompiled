package com.bbva.ethermobilesdk.deviceinfo.plugin.command.params;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetTrueTimeParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/params/GetTrueTimeParamsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/params/GetTrueTimeParams;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "deviceinfo-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTrueTimeParamsValidator implements ValidatorChecker<GetTrueTimeParams> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull GetTrueTimeParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String host = params.getHost();
        return (host == null || host.length() == 0 || !(l.isBlank(params.getHost()) ^ true) || params.getTimeout() == null || params.getTimeout().intValue() <= 0) ? false : true;
    }
}

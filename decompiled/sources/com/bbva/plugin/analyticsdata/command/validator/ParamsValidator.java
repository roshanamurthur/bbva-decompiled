package com.bbva.plugin.analyticsdata.command.validator;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.plugin.analyticsdata.command.validator.MalformedParams;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ParamsValidator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/analyticsdata/command/validator/ParamsValidator;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/plugin/analyticsdata/command/validator/MalformedParams;", "Lcom/cells/validator/ValidatorChecker;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "(Lcom/bbva/plugin/analyticsdata/command/validator/MalformedParams;)Z", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ParamsValidator<T extends MalformedParams> implements ValidatorChecker<T> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull T params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return !params.isMalformed();
    }
}

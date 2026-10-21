package com.bbva.plugin.showinfo;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.plugin.showinfo.data.TooltipDTO;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Validator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/showinfo/TooltipValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/plugin/showinfo/data/TooltipDTO;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TooltipValidator implements ValidatorChecker<TooltipDTO> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull TooltipDTO params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return (params.getTitle() == null || params.getSupportingText() == null || params.getPositiveButtonText() == null) ? false : true;
    }
}

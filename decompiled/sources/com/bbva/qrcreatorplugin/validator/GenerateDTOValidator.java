package com.bbva.qrcreatorplugin.validator;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.qrcreatorplugin.model.GenerateDTO;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GenerateDTOValidator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/qrcreatorplugin/validator/GenerateDTOValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/qrcreatorplugin/model/GenerateDTO;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "qrcreator-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GenerateDTOValidator implements ValidatorChecker<GenerateDTO> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull GenerateDTO params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return (params.getContent() == null || params.getWidth() == null || params.getHeight() == null || params.getFormat() == null) ? false : true;
    }
}

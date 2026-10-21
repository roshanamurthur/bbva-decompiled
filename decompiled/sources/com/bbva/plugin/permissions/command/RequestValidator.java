package com.bbva.plugin.permissions.command;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RequestPermissionCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/permissions/command/RequestValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/plugin/permissions/command/PermissionRequestDTO;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "permissions-plugin_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RequestValidator implements ValidatorChecker<PermissionRequestDTO> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@Nullable PermissionRequestDTO params) {
        return (params != null ? params.getName() : null) != null;
    }
}

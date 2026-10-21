package com.bbva.actionlauncher.plugin.validators;

import com.bbva.actionlauncher.AndroidActionLauncher;
import com.bbva.actionlauncher.plugin.params.MapsParams;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.text.l;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Validators.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/actionlauncher/plugin/validators/MapsParamsValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/actionlauncher/plugin/params/MapsParams;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "actionlauncher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MapsParamsValidator implements ValidatorChecker<MapsParams> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@Nullable MapsParams params) {
        if (params != null) {
            return l.startsWith$default(params.getUriString(), AndroidActionLauncher.GEO_SCHEME, false, 2, null) || l.startsWith$default(params.getUriString(), AndroidActionLauncher.GOOGLE_NAV_SCHEME, false, 2, null) || l.startsWith$default(params.getUriString(), AndroidActionLauncher.PETAL_NAV_SCHEME, false, 2, null);
        }
        return false;
    }
}

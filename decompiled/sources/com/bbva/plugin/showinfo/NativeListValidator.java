package com.bbva.plugin.showinfo;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.showinfo.nativemodal.modal.Item;
import com.bbva.showinfo.nativemodal.modal.NativeListModalConfiguration;
import com.cells.validator.ValidatorChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Validator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/showinfo/NativeListValidator;", "Lcom/cells/validator/ValidatorChecker;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "()V", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "params", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NativeListValidator implements ValidatorChecker<NativeListModalConfiguration> {
    @Override // com.cells.validator.ValidatorChecker
    public boolean isValid(@NotNull NativeListModalConfiguration params) {
        Intrinsics.checkNotNullParameter(params, "params");
        List<Item> values = params.getValues();
        return !(values == null || values.isEmpty());
    }
}

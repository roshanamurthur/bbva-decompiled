package com.bbva.component.ui.login.handler.validations;

import com.bbva.cellswidgets.model.ValidationRule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentSelectorValidator.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/component/ui/login/handler/validations/DocumentSelectorValidator;", "Lcom/bbva/component/ui/login/handler/validations/Validator;", "()V", "execute", "", "dataToValidate", "", "validations", "", "Lcom/bbva/cellswidgets/model/ValidationRule;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentSelectorValidator implements Validator {
    @Override // com.bbva.component.ui.login.handler.validations.Validator
    public boolean execute(@NotNull String dataToValidate, @NotNull List<ValidationRule> validations) {
        Intrinsics.checkNotNullParameter(dataToValidate, "dataToValidate");
        Intrinsics.checkNotNullParameter(validations, "validations");
        return dataToValidate.length() > 0;
    }
}

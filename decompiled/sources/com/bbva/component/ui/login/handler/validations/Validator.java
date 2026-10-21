package com.bbva.component.ui.login.handler.validations;

import com.bbva.cellswidgets.model.ValidationRule;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Validator.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, d2 = {"Lcom/bbva/component/ui/login/handler/validations/Validator;", "", "execute", "", "dataToValidate", "", "validations", "", "Lcom/bbva/cellswidgets/model/ValidationRule;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Validator {
    boolean execute(@NotNull String dataToValidate, @NotNull List<ValidationRule> validations);
}

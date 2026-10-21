package com.bbva.glomohybrid.login.domain.formconfigurator;

import androidx.annotation.StringRes;
import com.bbva.component.ui.login.model.ButtonLink;
import com.bbva.component.ui.login.model.InputFieldConfig;
import com.bbva.component.ui.login.model.InputFieldIdentifier;
import com.bbva.component.ui.login.model.InputForm;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FormLoginConfigurator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/formconfigurator/FormLoginConfigurator;", "", "inputsForm", "", "Lcom/bbva/component/ui/login/model/InputForm;", "getInputsForm", "()Ljava/util/List;", "configureRememberedPassword", "Lcom/bbva/component/ui/login/model/ButtonLink;", "textResource", "", "inputPassword", "Lcom/bbva/component/ui/login/model/InputFieldConfig;", "updateInputForm", "identifier", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "inputFieldConfig", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FormLoginConfigurator {
    @NotNull
    ButtonLink configureRememberedPassword(@StringRes int textResource);

    @NotNull
    List<InputForm> getInputsForm();

    @NotNull
    InputFieldConfig inputPassword();

    @NotNull
    List<InputForm> updateInputForm(@NotNull InputFieldIdentifier identifier, @NotNull InputFieldConfig inputFieldConfig);
}

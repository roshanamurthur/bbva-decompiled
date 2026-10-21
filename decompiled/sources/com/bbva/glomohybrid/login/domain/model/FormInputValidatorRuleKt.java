package com.bbva.glomohybrid.login.domain.model;

import android.content.Context;
import com.bbva.component.ui.login.model.ResourceType;
import com.bbva.component.ui.login.model.Validations;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FormInputValidatorRule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toValidation", "Lcom/bbva/component/ui/login/model/Validations;", "Lcom/bbva/glomohybrid/login/domain/model/Rule;", "context", "Landroid/content/Context;", "Login_mexicoGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FormInputValidatorRuleKt {
    @NotNull
    public static final Validations toValidation(@NotNull Rule rule, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(rule, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String regex = rule.getRegex();
        String string = context.getString(rule.getErrorMessage());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new Validations(regex, false, new ResourceType("", string));
    }
}

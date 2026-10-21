package com.bbva.component.ui.login.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InputFieldData.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"inputFormResult", "Lcom/bbva/component/ui/login/model/InputFormResult;", "Lcom/bbva/component/ui/login/model/InputFieldData;", "component-ui-login_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InputFieldDataKt {
    @NotNull
    public static final InputFormResult inputFormResult(@NotNull InputFieldData inputFieldData) {
        Intrinsics.checkNotNullParameter(inputFieldData, "<this>");
        return new InputFormResult(inputFieldData.getInputFieldIdentifier(), inputFieldData.getInputText());
    }
}

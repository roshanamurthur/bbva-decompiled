package com.bbva.component.ui.login.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginResult.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/ui/login/model/InputFormResult;", "", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "component1", "", "component2", "inputFieldIdentifier", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "getInputFieldIdentifier", "()Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/component/ui/login/model/InputFieldIdentifier;Ljava/lang/String;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InputFormResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InputFieldIdentifier inputFieldIdentifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    public InputFormResult(@NotNull InputFieldIdentifier inputFieldIdentifier, @NotNull String value) {
        Intrinsics.checkNotNullParameter(inputFieldIdentifier, "inputFieldIdentifier");
        Intrinsics.checkNotNullParameter(value, "value");
        this.inputFieldIdentifier = inputFieldIdentifier;
        this.value = value;
    }

    public static /* synthetic */ InputFormResult copy$default(InputFormResult inputFormResult, InputFieldIdentifier inputFieldIdentifier, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inputFieldIdentifier = inputFormResult.inputFieldIdentifier;
        }
        if ((i10 & 2) != 0) {
            str = inputFormResult.value;
        }
        return inputFormResult.copy(inputFieldIdentifier, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InputFieldIdentifier getInputFieldIdentifier() {
        return this.inputFieldIdentifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final InputFormResult copy(@NotNull InputFieldIdentifier inputFieldIdentifier, @NotNull String value) {
        Intrinsics.checkNotNullParameter(inputFieldIdentifier, "inputFieldIdentifier");
        Intrinsics.checkNotNullParameter(value, "value");
        return new InputFormResult(inputFieldIdentifier, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFormResult)) {
            return false;
        }
        InputFormResult inputFormResult = (InputFormResult) other;
        return this.inputFieldIdentifier == inputFormResult.inputFieldIdentifier && Intrinsics.areEqual(this.value, inputFormResult.value);
    }

    @NotNull
    public final InputFieldIdentifier getInputFieldIdentifier() {
        return this.inputFieldIdentifier;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.inputFieldIdentifier.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "InputFormResult(inputFieldIdentifier=" + this.inputFieldIdentifier + ", value=" + this.value + ")";
    }
}

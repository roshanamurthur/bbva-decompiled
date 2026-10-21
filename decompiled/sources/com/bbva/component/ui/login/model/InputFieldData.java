package com.bbva.component.ui.login.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.cellswidgets.model.ValidationRule;
import com.bbva.component.ui.login.handler.validations.Validator;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InputFieldData.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b2\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0013\u001a\u00020\rHÆ\u0001J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00101\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$\"\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/bbva/component/ui/login/model/InputFieldData;", "", "", "validate", "", "component1", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "component2", "", "component3", "", "Lcom/bbva/cellswidgets/model/ValidationRule;", "component4", "Lcom/bbva/component/ui/login/handler/validations/Validator;", "component5", "id", "inputFieldIdentifier", "newTextValue", "validations", "validator", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "b", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "getInputFieldIdentifier", "()Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "c", "Ljava/lang/String;", "getNewTextValue", "()Ljava/lang/String;", "d", "Ljava/util/List;", "getValidations", "()Ljava/util/List;", "e", "Lcom/bbva/component/ui/login/handler/validations/Validator;", "getValidator", "()Lcom/bbva/component/ui/login/handler/validations/Validator;", "f", "getInputText", "setInputText", "(Ljava/lang/String;)V", "inputText", "<init>", "(ILcom/bbva/component/ui/login/model/InputFieldIdentifier;Ljava/lang/String;Ljava/util/List;Lcom/bbva/component/ui/login/handler/validations/Validator;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InputFieldData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InputFieldIdentifier inputFieldIdentifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String newTextValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<ValidationRule> validations;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Validator validator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String inputText;

    public InputFieldData(int i10, @NotNull InputFieldIdentifier inputFieldIdentifier, @NotNull String newTextValue, @NotNull List<ValidationRule> validations, @NotNull Validator validator) {
        Intrinsics.checkNotNullParameter(inputFieldIdentifier, "inputFieldIdentifier");
        Intrinsics.checkNotNullParameter(newTextValue, "newTextValue");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.id = i10;
        this.inputFieldIdentifier = inputFieldIdentifier;
        this.newTextValue = newTextValue;
        this.validations = validations;
        this.validator = validator;
        this.inputText = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputFieldData copy$default(InputFieldData inputFieldData, int i10, InputFieldIdentifier inputFieldIdentifier, String str, List list, Validator validator, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = inputFieldData.id;
        }
        if ((i11 & 2) != 0) {
            inputFieldIdentifier = inputFieldData.inputFieldIdentifier;
        }
        InputFieldIdentifier inputFieldIdentifier2 = inputFieldIdentifier;
        if ((i11 & 4) != 0) {
            str = inputFieldData.newTextValue;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            list = inputFieldData.validations;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            validator = inputFieldData.validator;
        }
        return inputFieldData.copy(i10, inputFieldIdentifier2, str2, list2, validator);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InputFieldIdentifier getInputFieldIdentifier() {
        return this.inputFieldIdentifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNewTextValue() {
        return this.newTextValue;
    }

    @NotNull
    public final List<ValidationRule> component4() {
        return this.validations;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Validator getValidator() {
        return this.validator;
    }

    @NotNull
    public final InputFieldData copy(int id, @NotNull InputFieldIdentifier inputFieldIdentifier, @NotNull String newTextValue, @NotNull List<ValidationRule> validations, @NotNull Validator validator) {
        Intrinsics.checkNotNullParameter(inputFieldIdentifier, "inputFieldIdentifier");
        Intrinsics.checkNotNullParameter(newTextValue, "newTextValue");
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(validator, "validator");
        return new InputFieldData(id, inputFieldIdentifier, newTextValue, validations, validator);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldData)) {
            return false;
        }
        InputFieldData inputFieldData = (InputFieldData) other;
        return this.id == inputFieldData.id && this.inputFieldIdentifier == inputFieldData.inputFieldIdentifier && Intrinsics.areEqual(this.newTextValue, inputFieldData.newTextValue) && Intrinsics.areEqual(this.validations, inputFieldData.validations) && Intrinsics.areEqual(this.validator, inputFieldData.validator);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final InputFieldIdentifier getInputFieldIdentifier() {
        return this.inputFieldIdentifier;
    }

    @NotNull
    public final String getInputText() {
        return this.inputText;
    }

    @NotNull
    public final String getNewTextValue() {
        return this.newTextValue;
    }

    @NotNull
    public final List<ValidationRule> getValidations() {
        return this.validations;
    }

    @NotNull
    public final Validator getValidator() {
        return this.validator;
    }

    public int hashCode() {
        return this.validator.hashCode() + a.a(this.validations, n1.c(this.newTextValue, (this.inputFieldIdentifier.hashCode() + (this.id * 31)) * 31, 31), 31);
    }

    public final void setInputText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.inputText = str;
    }

    @NotNull
    public String toString() {
        return "InputFieldData(id=" + this.id + ", inputFieldIdentifier=" + this.inputFieldIdentifier + ", newTextValue=" + this.newTextValue + ", validations=" + this.validations + ", validator=" + this.validator + ")";
    }

    public final boolean validate() {
        return this.validator.execute(this.inputText, this.validations);
    }

    public /* synthetic */ InputFieldData(int i10, InputFieldIdentifier inputFieldIdentifier, String str, List list, Validator validator, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, inputFieldIdentifier, str, (i11 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, validator);
    }
}

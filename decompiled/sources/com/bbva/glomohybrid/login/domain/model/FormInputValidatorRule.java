package com.bbva.glomohybrid.login.domain.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.model.enums.Behavior;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FormInputValidatorRule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003JK\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/FormInputValidatorRule;", "", "", "component1", "component2", "component3", "", "component4", "", "Lcom/bbva/glomohybrid/login/domain/model/Rule;", "component5", "Lcom/bbva/glomohybrid/login/model/enums/Behavior;", "component6", LogKeysKt.TAG, "code", "inputType", "maxLength", "rules", "behavior", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", "getCode", "c", "getInputType", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMaxLength", "()I", "e", "Ljava/util/List;", "getRules", "()Ljava/util/List;", "f", "Lcom/bbva/glomohybrid/login/model/enums/Behavior;", "getBehavior", "()Lcom/bbva/glomohybrid/login/model/enums/Behavior;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/bbva/glomohybrid/login/model/enums/Behavior;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class FormInputValidatorRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inputType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int maxLength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Rule> rules;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Behavior behavior;

    public FormInputValidatorRule(@NotNull String tag, @NotNull String code, @NotNull String inputType, int i10, @NotNull List<Rule> rules, @NotNull Behavior behavior) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.tag = tag;
        this.code = code;
        this.inputType = inputType;
        this.maxLength = i10;
        this.rules = rules;
        this.behavior = behavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormInputValidatorRule copy$default(FormInputValidatorRule formInputValidatorRule, String str, String str2, String str3, int i10, List list, Behavior behavior, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = formInputValidatorRule.tag;
        }
        if ((i11 & 2) != 0) {
            str2 = formInputValidatorRule.code;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            str3 = formInputValidatorRule.inputType;
        }
        String str5 = str3;
        if ((i11 & 8) != 0) {
            i10 = formInputValidatorRule.maxLength;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            list = formInputValidatorRule.rules;
        }
        List list2 = list;
        if ((i11 & 32) != 0) {
            behavior = formInputValidatorRule.behavior;
        }
        return formInputValidatorRule.copy(str, str4, str5, i12, list2, behavior);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInputType() {
        return this.inputType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final List<Rule> component5() {
        return this.rules;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Behavior getBehavior() {
        return this.behavior;
    }

    @NotNull
    public final FormInputValidatorRule copy(@NotNull String tag, @NotNull String code, @NotNull String inputType, int maxLength, @NotNull List<Rule> rules, @NotNull Behavior behavior) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        return new FormInputValidatorRule(tag, code, inputType, maxLength, rules, behavior);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormInputValidatorRule)) {
            return false;
        }
        FormInputValidatorRule formInputValidatorRule = (FormInputValidatorRule) other;
        return Intrinsics.areEqual(this.tag, formInputValidatorRule.tag) && Intrinsics.areEqual(this.code, formInputValidatorRule.code) && Intrinsics.areEqual(this.inputType, formInputValidatorRule.inputType) && this.maxLength == formInputValidatorRule.maxLength && Intrinsics.areEqual(this.rules, formInputValidatorRule.rules) && this.behavior == formInputValidatorRule.behavior;
    }

    @NotNull
    public final Behavior getBehavior() {
        return this.behavior;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getInputType() {
        return this.inputType;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final List<Rule> getRules() {
        return this.rules;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return this.behavior.hashCode() + com.google.android.gms.measurement.internal.a.a(this.rules, (n1.c(this.inputType, n1.c(this.code, this.tag.hashCode() * 31, 31), 31) + this.maxLength) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "FormInputValidatorRule(tag=" + this.tag + ", code=" + this.code + ", inputType=" + this.inputType + ", maxLength=" + this.maxLength + ", rules=" + this.rules + ", behavior=" + this.behavior + ")";
    }

    public /* synthetic */ FormInputValidatorRule(String str, String str2, String str3, int i10, List list, Behavior behavior, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i10, list, (i11 & 32) != 0 ? Behavior.PREFIX : behavior);
    }
}

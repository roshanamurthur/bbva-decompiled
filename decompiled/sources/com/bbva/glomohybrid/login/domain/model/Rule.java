package com.bbva.glomohybrid.login.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FormInputValidatorRule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/Rule;", "", "", "component1", "", "component2", "regex", "errorMessage", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getRegex", "()Ljava/lang/String;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getErrorMessage", "()I", "<init>", "(Ljava/lang/String;I)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Rule {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String regex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int errorMessage;

    public Rule(@NotNull String regex, int i10) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.regex = regex;
        this.errorMessage = i10;
    }

    public static /* synthetic */ Rule copy$default(Rule rule, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rule.regex;
        }
        if ((i11 & 2) != 0) {
            i10 = rule.errorMessage;
        }
        return rule.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final Rule copy(@NotNull String regex, int errorMessage) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        return new Rule(regex, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) other;
        return Intrinsics.areEqual(this.regex, rule.regex) && this.errorMessage == rule.errorMessage;
    }

    public final int getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getRegex() {
        return this.regex;
    }

    public int hashCode() {
        return (this.regex.hashCode() * 31) + this.errorMessage;
    }

    @NotNull
    public String toString() {
        return "Rule(regex=" + this.regex + ", errorMessage=" + this.errorMessage + ")";
    }
}

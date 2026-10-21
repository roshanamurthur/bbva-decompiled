package com.bbva.notifications.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoPushData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/bbva/notifications/model/AccountValidationResult;", "", "account", "", "verificationResult", "", "(Ljava/lang/String;I)V", "getAccount", "()Ljava/lang/String;", "getVerificationResult", "()I", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AccountValidationResult {

    @SerializedName("cb")
    @NotNull
    private final String account;

    @SerializedName("rv")
    private final int verificationResult;

    public AccountValidationResult(@NotNull String account, int i10) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.account = account;
        this.verificationResult = i10;
    }

    public static /* synthetic */ AccountValidationResult copy$default(AccountValidationResult accountValidationResult, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountValidationResult.account;
        }
        if ((i11 & 2) != 0) {
            i10 = accountValidationResult.verificationResult;
        }
        return accountValidationResult.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getVerificationResult() {
        return this.verificationResult;
    }

    @NotNull
    public final AccountValidationResult copy(@NotNull String account, int verificationResult) {
        Intrinsics.checkNotNullParameter(account, "account");
        return new AccountValidationResult(account, verificationResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountValidationResult)) {
            return false;
        }
        AccountValidationResult accountValidationResult = (AccountValidationResult) other;
        return Intrinsics.areEqual(this.account, accountValidationResult.account) && this.verificationResult == accountValidationResult.verificationResult;
    }

    @NotNull
    public final String getAccount() {
        return this.account;
    }

    public final int getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        return (this.account.hashCode() * 31) + this.verificationResult;
    }

    @NotNull
    public String toString() {
        return "AccountValidationResult(account=" + this.account + ", verificationResult=" + this.verificationResult + ")";
    }
}

package com.viergegroup.sdk.taptophone.vierge.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/SearchTxnResponseOpenPay;", "", "()V", "errorCode", "", "getErrorCode", "()I", "setErrorCode", "(I)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "transactionDto", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionResponseOpenPay;", "getTransactionDto", "()Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionResponseOpenPay;", "setTransactionDto", "(Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionResponseOpenPay;)V", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SearchTxnResponseOpenPay {
    private int errorCode;

    @NotNull
    private String errorMessage = "";

    @Nullable
    private TransactionResponseOpenPay transactionDto;

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final TransactionResponseOpenPay getTransactionDto() {
        return this.transactionDto;
    }

    public final void setErrorCode(int i10) {
        this.errorCode = i10;
    }

    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorMessage = str;
    }

    public final void setTransactionDto(@Nullable TransactionResponseOpenPay transactionResponseOpenPay) {
        this.transactionDto = transactionResponseOpenPay;
    }
}

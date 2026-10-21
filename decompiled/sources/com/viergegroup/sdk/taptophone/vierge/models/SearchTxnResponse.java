package com.viergegroup.sdk.taptophone.vierge.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/SearchTxnResponse;", "", "()V", "errorCode", "", "getErrorCode", "()I", "setErrorCode", "(I)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "transactionDto", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionResponse;", "getTransactionDto", "()Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionResponse;", "setTransactionDto", "(Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionResponse;)V", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SearchTxnResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f67973b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TransactionResponse f67974c;

    /* JADX INFO: renamed from: getErrorCode, reason: from getter */
    public final int getF67972a() {
        return this.f67972a;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorMessage, reason: from getter */
    public final String getF67973b() {
        return this.f67973b;
    }

    @Nullable
    /* JADX INFO: renamed from: getTransactionDto, reason: from getter */
    public final TransactionResponse getF67974c() {
        return this.f67974c;
    }

    public final void setErrorCode(int i10) {
        this.f67972a = i10;
    }

    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67973b = str;
    }

    public final void setTransactionDto(@Nullable TransactionResponse transactionResponse) {
        this.f67974c = transactionResponse;
    }
}

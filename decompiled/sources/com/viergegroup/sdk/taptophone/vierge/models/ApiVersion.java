package com.viergegroup.sdk.taptophone.vierge.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/ApiVersion;", "", "", "apiVersionId", com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getApiVersionId", "()I", "setApiVersionId", "(I)V", "", "apiVersionName", "Ljava/lang/String;", "getApiVersionName", "()Ljava/lang/String;", "setApiVersionName", "(Ljava/lang/String;)V", "Version1", "Version2", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0})
public enum ApiVersion {
    Version1(1, "Version1"),
    Version2(2, "Version2");

    private int getInjectedTransactionParameters;

    @NotNull
    private String inject;

    ApiVersion(int i10, String str) {
        this.getInjectedTransactionParameters = i10;
        this.inject = str;
    }

    /* JADX INFO: renamed from: getApiVersionId, reason: from getter */
    public final int getGetInjectedTransactionParameters() {
        return this.getInjectedTransactionParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: getApiVersionName, reason: from getter */
    public final String getInject() {
        return this.inject;
    }

    public final void setApiVersionId(int i10) {
        this.getInjectedTransactionParameters = i10;
    }

    public final void setApiVersionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inject = str;
    }
}

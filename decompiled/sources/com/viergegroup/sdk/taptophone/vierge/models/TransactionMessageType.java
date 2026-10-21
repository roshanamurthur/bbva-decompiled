package com.viergegroup.sdk.taptophone.vierge.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionMessageType;", "", "transactionMessageTypeId", "", "transactionMessageTypeName", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getTransactionMessageTypeId", "()I", "setTransactionMessageTypeId", "(I)V", "getTransactionMessageTypeName", "()Ljava/lang/String;", "setTransactionMessageTypeName", "(Ljava/lang/String;)V", "Undefined", "Financial", "Advice", "Comm", "KeyLoad", "Reverse", "Closure", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum TransactionMessageType {
    Undefined(-1, "Undefined"),
    Financial(1, "Financial"),
    Advice(2, "Advice"),
    Comm(3, "Comm"),
    KeyLoad(4, "KeyLoad"),
    Reverse(5, "Reverse"),
    Closure(6, "Closure");

    private int transactionMessageTypeId;

    @NotNull
    private String transactionMessageTypeName;

    TransactionMessageType(int i10, String str) {
        this.transactionMessageTypeId = i10;
        this.transactionMessageTypeName = str;
    }

    public final int getTransactionMessageTypeId() {
        return this.transactionMessageTypeId;
    }

    @NotNull
    public final String getTransactionMessageTypeName() {
        return this.transactionMessageTypeName;
    }

    public final void setTransactionMessageTypeId(int i10) {
        this.transactionMessageTypeId = i10;
    }

    public final void setTransactionMessageTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionMessageTypeName = str;
    }
}

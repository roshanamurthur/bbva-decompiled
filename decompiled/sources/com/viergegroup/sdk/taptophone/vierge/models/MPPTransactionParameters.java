package com.viergegroup.sdk.taptophone.vierge.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/MPPTransactionParameters;", "", "()V", "transactionAmount", "", "getTransactionAmount", "()J", "setTransactionAmount", "(J)V", "transactionType", "Lcom/mypinpad/tsdk/api/models/TransactionType;", "getTransactionType", "()Lcom/mypinpad/tsdk/api/models/TransactionType;", "setTransactionType", "(Lcom/mypinpad/tsdk/api/models/TransactionType;)V", "getRrn", "", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MPPTransactionParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f67965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public com.mypinpad.tsdk.api.models.TransactionType f67966b = com.mypinpad.tsdk.api.models.TransactionType.PURCHASE;

    @NotNull
    public final String getRrn() {
        String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmmss"));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return StringsKt__StringsKt.padEnd(str, 12, '0');
    }

    /* JADX INFO: renamed from: getTransactionAmount, reason: from getter */
    public final long getF67965a() {
        return this.f67965a;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransactionType, reason: from getter */
    public final com.mypinpad.tsdk.api.models.TransactionType getF67966b() {
        return this.f67966b;
    }

    public final void setTransactionAmount(long j10) {
        this.f67965a = j10;
    }

    public final void setTransactionType(@NotNull com.mypinpad.tsdk.api.models.TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.f67966b = transactionType;
    }
}

package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.models.TransactionParameters;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sm {
    @NotNull
    public static final sq setDividerPadding(@NotNull TransactionParameters transactionParameters) {
        return (sq) setY(new Object[]{transactionParameters}, -2098458560, 2098458560, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        TransactionParameters transactionParameters = (TransactionParameters) objArr[0];
        Intrinsics.checkNotNullParameter(transactionParameters, "");
        return new sq(transactionParameters.getAmount(), transactionParameters.getAmountOther(), sj.setDividerPadding(transactionParameters.getCurrency()), transactionParameters.getDetails(), (so) sv.setY(new Object[]{transactionParameters.getType()}, -237800956, 237800956, (int) System.currentTimeMillis()), transactionParameters.getRrn(), transactionParameters.getApplicationFilteringSelectors(), transactionParameters.getMetadata(), transactionParameters.getGatewayId());
    }
}

package com.bbva.ethermobilesdk.devicechecker.model;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;

/* JADX INFO: compiled from: ServiceResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/model/ServiceResponse;", "", "", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "SERVICE_ERROR", "SERVICE_FALSE", "SERVICE_TRUE", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
public enum ServiceResponse {
    SERVICE_ERROR(-1),
    SERVICE_FALSE(0),
    SERVICE_TRUE(1);

    private final int code;

    ServiceResponse(int i10) {
        this.code = i10;
    }

    public final int getCode() {
        return this.code;
    }
}

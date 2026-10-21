package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import ad.d;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;

/* JADX INFO: loaded from: classes6.dex */
public class BulletUsedRequest extends BulletActiveRequest {
    private String transactionType;
    private String unpredictableNumber;

    public String getTransactionType() {
        return this.transactionType;
    }

    public String getTransactionTypeCode() {
        String str = this.transactionType;
        str.getClass();
        switch (str) {
            case "CONTACTLESS":
                return TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE;
            case "DRSP":
                return TransactionType.TRANSACTION_TYPE_DRSP_CODE;
            case "MAGSTRIPE":
                return "M";
            default:
                return "";
        }
    }

    public String getUnpredictableNumber() {
        return this.unpredictableNumber;
    }

    public void setTransactionType(String str) {
        this.transactionType = str;
    }

    public void setUnpredictableNumber(String str) {
        this.unpredictableNumber = str;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.request.backend.BulletActiveRequest
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BulletUsedRequest{atc='");
        sb2.append(getAtc());
        sb2.append("', timestamp='");
        sb2.append(getTimestamp());
        sb2.append("', unpredictableNumber='");
        sb2.append(this.unpredictableNumber);
        sb2.append("', transactionType='");
        return d.f(sb2, this.transactionType, "'}");
    }
}

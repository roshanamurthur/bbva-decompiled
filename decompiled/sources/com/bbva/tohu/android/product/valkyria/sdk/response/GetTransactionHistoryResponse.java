package com.bbva.tohu.android.product.valkyria.sdk.response;

import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.TransactionHistoryResponseData;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class GetTransactionHistoryResponse {
    private TransactionHistoryResponseData data;
    private Result result;

    public GetTransactionHistoryResponse() {
    }

    public TransactionHistoryResponseData getData() {
        return this.data;
    }

    public Result getResult() {
        return this.result;
    }

    public void setData(TransactionHistoryResponseData transactionHistoryResponseData) {
        this.data = transactionHistoryResponseData;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String toString() {
        return "GetTransactionHistoryResponse{result=" + this.result + ", data=" + this.data + AbstractJsonLexerKt.END_OBJ;
    }

    public GetTransactionHistoryResponse(Result result, TransactionHistoryResponseData transactionHistoryResponseData) {
        this.result = result;
        this.data = transactionHistoryResponseData;
    }
}

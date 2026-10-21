package com.bbva.tohu.android.product.valkyria.sdk.response;

import com.bbva.tohu.android.core.response.Result;

/* JADX INFO: loaded from: classes6.dex */
public class NotifyProvisionResultResponse {
    private Result result;

    public NotifyProvisionResultResponse(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return this.result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String toString() {
        return "NotifyProvisionResultResponse{Result {" + this.result.getCode() + this.result.getInfo() + "}}";
    }
}

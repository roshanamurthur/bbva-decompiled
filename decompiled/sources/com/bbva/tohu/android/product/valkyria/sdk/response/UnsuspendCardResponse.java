package com.bbva.tohu.android.product.valkyria.sdk.response;

import com.bbva.tohu.android.core.response.Result;

/* JADX INFO: loaded from: classes6.dex */
public class UnsuspendCardResponse {
    private Result result;
    private String state;

    public UnsuspendCardResponse() {
    }

    public UnsuspendCardResponse(String str, Result result) {
        this.state = str;
        this.result = result;
    }

    public Result getResult() {
        return this.result;
    }

    public String getState() {
        return this.state;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public void setState(String str) {
        this.state = str;
    }
}

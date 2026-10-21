package com.bbva.tohu.android.product.valkyria.sdk.response;

import com.bbva.tohu.android.core.response.Result;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class ConfirmReplenishResponse {
    private Result result;

    public Result getResult() {
        return this.result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String toString() {
        return "ConfirmReplenishResponse{result=" + this.result + AbstractJsonLexerKt.END_OBJ;
    }
}

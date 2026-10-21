package com.bbva.tohu.android.product.valkyria.sdk.response;

import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.GetToken;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class GetTokenResponse {
    private GetToken data;
    private Result result;

    public GetToken getData() {
        return this.data;
    }

    public Result getResult() {
        return this.result;
    }

    public void setData(GetToken getToken) {
        this.data = getToken;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String toString() {
        return "GetTokenResponse{result=" + this.result + ", data=" + this.data + AbstractJsonLexerKt.END_OBJ;
    }
}

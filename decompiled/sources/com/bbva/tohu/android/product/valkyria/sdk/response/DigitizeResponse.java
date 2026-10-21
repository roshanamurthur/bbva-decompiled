package com.bbva.tohu.android.product.valkyria.sdk.response;

import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.Digitize;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class DigitizeResponse {
    private Digitize data;
    private Result result;

    public DigitizeResponse() {
    }

    public Digitize getData() {
        return this.data;
    }

    public Result getResult() {
        return this.result;
    }

    public void setData(Digitize digitize) {
        this.data = digitize;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String toString() {
        return "DigitizeResponse{result=" + this.result + ", data=" + this.data + AbstractJsonLexerKt.END_OBJ;
    }

    public DigitizeResponse(Result result, Digitize digitize) {
        this.result = result;
        this.data = digitize;
    }
}

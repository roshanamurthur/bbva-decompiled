package com.bbva.tohu.android.product.valkyria.sdk.response.backend;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class Keys {
    private String keyLocator;
    private List<ValuesResponse> values;

    public String getKeyLocator() {
        return this.keyLocator;
    }

    public List<ValuesResponse> getValues() {
        return this.values;
    }

    public void setKeyLocator(String str) {
        this.keyLocator = str;
    }

    public void setValues(List<ValuesResponse> list) {
        this.values = list;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Keys{keyLocator='");
        sb2.append(this.keyLocator);
        sb2.append("', values=");
        return a.c(sb2, this.values, AbstractJsonLexerKt.END_OBJ);
    }
}

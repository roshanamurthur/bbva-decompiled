package com.bbva.tohu.android.product.valkyria.sdk.builders;

import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CallbackDataBuilder {
    private Map<String, String> data = new HashMap();

    public static CallbackDataBuilder aMap() {
        return new CallbackDataBuilder();
    }

    public Map<String, String> build() {
        return this.data;
    }

    public CallbackDataBuilder withCardUniqueRef(String str) {
        this.data.put(TohuCallbackErrors.CARD_UNIQUE_REFERENCE_KEY, str);
        return this;
    }

    public CallbackDataBuilder withResult(String str) {
        this.data.put("result", str);
        return this;
    }
}

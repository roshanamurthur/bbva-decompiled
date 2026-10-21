package com.bbva.tohu.android.product.valkyria.sdk.builders;

import com.bbva.tohu.android.product.valkyria.sdk.request.ProvisionResult;

/* JADX INFO: loaded from: classes6.dex */
public class ProvisionResultBuilder {
    private ProvisionResult provisionResult = new ProvisionResult();

    private ProvisionResultBuilder() {
    }

    public static ProvisionResultBuilder aProvisionResult() {
        return new ProvisionResultBuilder();
    }

    public ProvisionResult build() {
        return this.provisionResult;
    }

    public ProvisionResultBuilder withCardUniqueReference(String str) {
        this.provisionResult.setCardUniqueReference(str);
        return this;
    }

    public ProvisionResultBuilder withErrorCode(String str) {
        this.provisionResult.setErrorCode(str);
        return this;
    }

    public ProvisionResultBuilder withErrorDescription(String str) {
        this.provisionResult.setErrorDescription(str);
        return this;
    }

    public ProvisionResultBuilder withResult(String str) {
        this.provisionResult.setResult(str);
        return this;
    }
}

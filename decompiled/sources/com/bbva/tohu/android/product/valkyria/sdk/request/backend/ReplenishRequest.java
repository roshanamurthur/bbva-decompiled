package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import androidx.datastore.preferences.protobuf.e;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class ReplenishRequest {
    private BulletsRequest bullets;
    private String cardUniqueReference;
    private Map<String, String> extraParams;

    public BulletsRequest getBullets() {
        return this.bullets;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    public void setBullets(BulletsRequest bulletsRequest) {
        this.bullets = bulletsRequest;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setExtraParams(Map<String, String> map) {
        this.extraParams = map;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReplenishRequest{cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', bullets=");
        sb2.append(this.bullets);
        sb2.append(", extraParams=");
        return e.g(sb2, this.extraParams, AbstractJsonLexerKt.END_OBJ);
    }
}

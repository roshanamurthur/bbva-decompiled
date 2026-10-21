package com.bbva.tohu.android.product.valkyria.sdk.response.backend;

import androidx.datastore.preferences.protobuf.e;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class ReplenishResponseData {
    private List<BulletsResponse> bullets;
    private Boolean discardAll;
    private Map<String, String> extraParams;
    private List<Keys> keys;
    private int threshold;

    public List<BulletsResponse> getBullets() {
        return this.bullets;
    }

    public Boolean getDiscardAll() {
        return this.discardAll;
    }

    public Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    public List<Keys> getKeys() {
        return this.keys;
    }

    public int getThreshold() {
        return this.threshold;
    }

    public void setBullets(List<BulletsResponse> list) {
        this.bullets = list;
    }

    public void setDiscardAll(Boolean bool) {
        this.discardAll = bool;
    }

    public void setExtraParams(Map<String, String> map) {
        this.extraParams = map;
    }

    public void setKeys(List<Keys> list) {
        this.keys = list;
    }

    public void setThreshold(int i10) {
        this.threshold = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReplenishResponseData{bullets=");
        sb2.append(this.bullets);
        sb2.append(", keys=");
        sb2.append(this.keys);
        sb2.append(", discardAll=");
        sb2.append(this.discardAll);
        sb2.append(", threshold='");
        sb2.append(this.threshold);
        sb2.append("', extraParams=");
        return e.g(sb2, this.extraParams, AbstractJsonLexerKt.END_OBJ);
    }
}

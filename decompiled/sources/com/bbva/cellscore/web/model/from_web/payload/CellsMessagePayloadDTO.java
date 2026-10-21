package com.bbva.cellscore.web.model.from_web.payload;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CellsMessagePayloadDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("page")
    String f27128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("params")
    Map<String, Object> f27129b;

    public String getPage() {
        return this.f27128a;
    }

    public Map<String, Object> getParams() {
        return this.f27129b;
    }
}

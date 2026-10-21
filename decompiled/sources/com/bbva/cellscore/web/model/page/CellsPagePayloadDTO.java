package com.bbva.cellscore.web.model.page;

import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class CellsPagePayloadDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("page")
    private String f27134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("components")
    private ComponentDTO[] f27135b;

    public ComponentDTO[] getComponentDTOs() {
        return this.f27135b;
    }

    public String getPage() {
        return this.f27134a;
    }
}

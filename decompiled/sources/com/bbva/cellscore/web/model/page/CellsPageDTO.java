package com.bbva.cellscore.web.model.page;

import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class CellsPageDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("op")
    String f27132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(BanxicoConstants.KEY_HISTORICAL_PAYLOAD)
    CellsPagePayloadDTO f27133b;

    public String getOperation() {
        return this.f27132a;
    }

    public CellsPagePayloadDTO getPayloadDTO() {
        return this.f27133b;
    }
}

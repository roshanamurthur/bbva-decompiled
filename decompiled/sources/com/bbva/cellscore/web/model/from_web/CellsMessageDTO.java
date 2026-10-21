package com.bbva.cellscore.web.model.from_web;

import com.bbva.cellscore.web.model.from_web.payload.CellsMessagePayloadDTO;
import com.bbva.cellscore.web.model.from_web.payload.ChannelMessageDTO;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class CellsMessageDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("op")
    String f27125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(BanxicoConstants.KEY_HISTORICAL_PAYLOAD)
    CellsMessagePayloadDTO f27126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("payloadChannel")
    ChannelMessageDTO[] f27127c;

    public ChannelMessageDTO[] getChannelMessageDTOs() {
        return this.f27127c;
    }

    public String getOperation() {
        return this.f27125a;
    }

    public CellsMessagePayloadDTO getPayloadDTO() {
        return this.f27126b;
    }
}

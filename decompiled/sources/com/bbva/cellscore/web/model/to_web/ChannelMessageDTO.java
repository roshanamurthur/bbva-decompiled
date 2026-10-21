package com.bbva.cellscore.web.model.to_web;

import com.bbva.cells.bridge.model.base.PayloadDTO;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelMessageDTO extends PayloadDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("channelName")
    private String f27161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("channelPayload")
    private Object f27162b;

    public ChannelMessageDTO(Object obj) {
        this.f27162b = obj;
    }

    public ChannelMessageDTO(String str, Object obj) {
        this.f27161a = str;
        this.f27162b = obj;
    }
}

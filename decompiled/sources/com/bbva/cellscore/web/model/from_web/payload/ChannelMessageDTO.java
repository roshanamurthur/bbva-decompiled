package com.bbva.cellscore.web.model.from_web.payload;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelMessageDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("channelName")
    String f27130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("channelPayload")
    Object f27131b;

    public String getChannelName() {
        return this.f27130a;
    }

    public Object getChannelPayload() {
        return this.f27131b;
    }
}

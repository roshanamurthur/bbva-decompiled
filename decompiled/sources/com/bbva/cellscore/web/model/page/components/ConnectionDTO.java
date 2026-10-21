package com.bbva.cellscore.web.model.page.components;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectionDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("in")
    private ChannelConnectionDTO f27150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("out")
    private ChannelConnectionDTO f27151b;

    public ChannelConnectionDTO getIn() {
        return this.f27150a;
    }

    public ChannelConnectionDTO getOut() {
        return this.f27151b;
    }
}

package com.bbva.androidtoolkit.plugin.postmessage;

import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class PostMessageDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pluginName")
    private String f26539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("origin")
    private String f26540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("action")
    private String f26541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName(BanxicoConstants.KEY_HISTORICAL_PAYLOAD)
    private PayloadDTO f26542d;

    public PostMessageDTO(String str, String str2, String str3, PayloadDTO payloadDTO) {
        this.f26539a = str;
        this.f26540b = str2;
        this.f26541c = str3;
        this.f26542d = payloadDTO;
    }

    public String getAction() {
        return this.f26541c;
    }

    public String getOrigin() {
        return this.f26540b;
    }

    public PayloadDTO getPayload() {
        return this.f26542d;
    }

    public String getPluginName() {
        return this.f26539a;
    }
}

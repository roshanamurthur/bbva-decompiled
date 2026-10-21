package com.bbva.cellscore.web.plugin.model;

import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class PluginRequestDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private String f27216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pluginId")
    private String f27217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("actionId")
    private String f27218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName(BanxicoConstants.KEY_HISTORICAL_PAYLOAD)
    private JsonElement f27219d;

    public String getActionId() {
        return this.f27218c;
    }

    public String getID() {
        return this.f27216a;
    }

    public JsonElement getPayload() {
        return this.f27219d;
    }

    public String getPluginId() {
        return this.f27217b;
    }

    public String toString() {
        return "PluginRequestDTO{id='" + this.f27216a + "', pluginId='" + this.f27217b + "', actionId='" + this.f27218c + "', payload=" + this.f27219d + AbstractJsonLexerKt.END_OBJ;
    }
}

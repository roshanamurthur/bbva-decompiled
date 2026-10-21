package com.bbva.cellscore.web.model.page.components;

import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TemplateDTO {
    public static final String TEMPLATE = "TEMPLATE";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("type")
    String f27156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("tagName")
    String f27157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(LogKeysKt.PROPERTIES)
    Map<String, Object> f27158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("path")
    String f27159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("animation")
    String f27160e;

    public String getAnimation() {
        return this.f27160e;
    }

    public String getPath() {
        return this.f27159d;
    }

    public Map<String, Object> getProperties() {
        return this.f27158c;
    }

    public String getTagName() {
        return this.f27157b;
    }

    public String getType() {
        return this.f27156a;
    }
}

package com.bbva.cellscore.web.model.page.components;

import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelDefinitionDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("bind")
    private String f27139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("nativeLink")
    private Link f27140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(DynamicLink.Builder.KEY_LINK)
    private Link f27141c;

    public static class Link {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("page")
        private String f27142a;

        public String getPage() {
            return this.f27142a;
        }
    }

    public String getBind() {
        return this.f27139a;
    }

    public Link getNativeLink() {
        return this.f27140b;
    }

    public Link getWebLink() {
        return this.f27141c;
    }
}

package com.bbva.cellscore.web.model.page.components;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChannelDefinitionDTO f27138b;

    public ChannelDTO(String str, ChannelDefinitionDTO channelDefinitionDTO) {
        this.f27138b = channelDefinitionDTO;
        this.f27137a = str;
    }

    public ChannelDefinitionDTO getBind() {
        return this.f27138b;
    }

    public String getName() {
        return this.f27137a;
    }
}

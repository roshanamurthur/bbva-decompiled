package com.bbva.cellscore.web.mapper;

import com.bbva.cellscore.web.data.component.Channel;
import com.bbva.cellscore.web.model.page.components.ChannelDTO;
import com.bbva.cellscore.web.model.page.components.ChannelDefinitionDTO;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelMapper implements Mapper<ChannelDTO, Channel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Channel.ChannelType f27114a;

    public ChannelMapper(Channel.ChannelType channelType) {
        this.f27114a = channelType;
    }

    @Override // com.bbva.cellscore.web.mapper.Mapper
    public ChannelDTO dataToModel(Channel channel) {
        return null;
    }

    @Override // com.bbva.cellscore.web.mapper.Mapper
    public Channel modelToData(ChannelDTO channelDTO) {
        String str;
        String page;
        String page2 = "";
        String name = channelDTO.getName() == null ? "" : channelDTO.getName();
        ChannelDefinitionDTO bind = channelDTO.getBind();
        if (bind != null) {
            String bind2 = bind.getBind() == null ? "" : bind.getBind();
            ChannelDefinitionDTO.Link nativeLink = bind.getNativeLink();
            page = (nativeLink == null || nativeLink.getPage() == null) ? "" : nativeLink.getPage();
            ChannelDefinitionDTO.Link webLink = bind.getWebLink();
            if (webLink != null && webLink.getPage() != null) {
                page2 = webLink.getPage();
            }
            str = page2;
            page2 = bind2;
        } else {
            str = "";
            page = str;
        }
        return Channel.create(name, this.f27114a, page2, page, str);
    }
}

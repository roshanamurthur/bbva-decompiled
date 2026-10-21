package com.bbva.cellscore.web.mapper;

import com.bbva.cellscore.web.data.component.Channel;
import com.bbva.cellscore.web.data.component.ComponentDefinition;
import com.bbva.cellscore.web.data.component.FeatureFlag;
import com.bbva.cellscore.web.model.page.components.ChannelDTO;
import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import com.bbva.cellscore.web.model.page.components.FeatureFlagDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentMapper implements Mapper<ComponentDTO, ComponentDefinition> {
    @Override // com.bbva.cellscore.web.mapper.Mapper
    public ComponentDTO dataToModel(ComponentDefinition componentDefinition) {
        return null;
    }

    @Override // com.bbva.cellscore.web.mapper.Mapper
    public ComponentDefinition modelToData(ComponentDTO componentDTO) {
        String tag = componentDTO.getTag() == null ? "" : componentDTO.getTag();
        String zone = componentDTO.getZone() != null ? componentDTO.getZone() : "";
        String type = componentDTO.getType();
        type.getClass();
        ComponentDefinition.ComponentType componentType = type.equals(ComponentDTO.DATA_MANAGER) ? ComponentDefinition.ComponentType.DATA_MANAGER : !type.equals(ComponentDTO.UI) ? ComponentDefinition.ComponentType.CROSS : ComponentDefinition.ComponentType.UI;
        ArrayList arrayList = new ArrayList();
        ChannelMapper channelMapper = new ChannelMapper(Channel.ChannelType.IN);
        ChannelMapper channelMapper2 = new ChannelMapper(Channel.ChannelType.OUT);
        Iterator<ChannelDTO> it = componentDTO.getInChannels().iterator();
        while (it.hasNext()) {
            arrayList.add(channelMapper.modelToData(it.next()));
        }
        Iterator<ChannelDTO> it2 = componentDTO.getOutChannels().iterator();
        while (it2.hasNext()) {
            arrayList.add(channelMapper2.modelToData(it2.next()));
        }
        Map<String, Object> properties = componentDTO.getProperties();
        if (properties == null) {
            properties = new HashMap<>();
        }
        Map<String, Object> map = properties;
        List<FeatureFlagDTO> featureFlags = componentDTO.getFeatureFlags();
        ArrayList arrayList2 = new ArrayList();
        if (featureFlags != null) {
            for (FeatureFlagDTO featureFlagDTO : featureFlags) {
                arrayList2.add(new FeatureFlag(featureFlagDTO.getId(), featureFlagDTO.getAppId(), featureFlagDTO.getDefault()));
            }
        }
        return ComponentDefinition.create(tag, zone, componentType, arrayList2, map, arrayList);
    }
}

package com.bbva.cellscore.web.deserializer;

import com.bbva.cellscore.web.model.page.components.ChannelConnectionDTO;
import com.bbva.cellscore.web.model.page.components.ChannelDTO;
import com.bbva.cellscore.web.model.page.components.ChannelDefinitionDTO;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelConnectionDeserializer implements JsonDeserializer {
    @Override // com.google.gson.JsonDeserializer
    public ChannelConnectionDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Set<Map.Entry<String, JsonElement>> setEntrySet = jsonElement.getAsJsonObject().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, JsonElement> entry : setEntrySet) {
            arrayList.add(new ChannelDTO(entry.getKey(), (ChannelDefinitionDTO) jsonDeserializationContext.deserialize(entry.getValue(), ChannelDefinitionDTO.class)));
        }
        return new ChannelConnectionDTO(arrayList);
    }
}

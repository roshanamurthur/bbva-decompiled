package com.bbva.cellscore.web.mapper;

import android.os.Bundle;
import com.bbva.cellscore.helper.BundleHelper;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.data.component.ChannelMessage;
import com.bbva.cellscore.web.model.from_web.CellsMessageDTO;
import com.bbva.cellscore.web.model.from_web.payload.CellsMessagePayloadDTO;
import com.bbva.cellscore.web.model.from_web.payload.ChannelMessageDTO;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CellsMessageMapper implements Mapper<CellsMessageDTO, CellsMessage> {
    @Override // com.bbva.cellscore.web.mapper.Mapper
    public CellsMessageDTO dataToModel(CellsMessage cellsMessage) {
        return null;
    }

    @Override // com.bbva.cellscore.web.mapper.Mapper
    public CellsMessage modelToData(CellsMessageDTO cellsMessageDTO) {
        String operation = cellsMessageDTO.getOperation() == null ? "push" : cellsMessageDTO.getOperation();
        if (NavigationOperations.POP.equals(operation)) {
            return CellsMessage.create(NavigationOperations.POP, new ArrayList());
        }
        CellsMessagePayloadDTO payloadDTO = cellsMessageDTO.getPayloadDTO();
        if (payloadDTO != null) {
            String page = payloadDTO.getPage() != null ? payloadDTO.getPage() : "";
            Bundle bundle = new Bundle();
            BundleHelper.addToBundleIfPossible(bundle, cellsMessageDTO.getPayloadDTO().getParams());
            return CellsMessage.create(operation, page, bundle);
        }
        if (!NavigationOperations.UPDATE.equals(operation)) {
            return CellsMessage.empty();
        }
        ChannelMessageDTO[] channelMessageDTOs = cellsMessageDTO.getChannelMessageDTOs();
        ArrayList arrayList = new ArrayList();
        if (channelMessageDTOs == null) {
            return CellsMessage.create(operation, arrayList);
        }
        for (ChannelMessageDTO channelMessageDTO : channelMessageDTOs) {
            Bundle bundle2 = new Bundle();
            String channelName = channelMessageDTO.getChannelName() == null ? "" : channelMessageDTO.getChannelName();
            Object channelPayload = channelMessageDTO.getChannelPayload();
            if (channelPayload instanceof Map) {
                for (Map.Entry entry : ((Map) channelPayload).entrySet()) {
                    BundleHelper.addObjectToBundle(bundle2, (String) entry.getKey(), entry.getValue());
                }
            } else if (channelPayload != null) {
                BundleHelper.addObjectToBundle(bundle2, "value", channelPayload);
            }
            arrayList.add(ChannelMessage.create(channelName, bundle2));
        }
        return CellsMessage.create(operation, arrayList);
    }
}

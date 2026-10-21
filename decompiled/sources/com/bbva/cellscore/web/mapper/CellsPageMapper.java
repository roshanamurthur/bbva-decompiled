package com.bbva.cellscore.web.mapper;

import com.bbva.cellscore.web.data.CellsPage;
import com.bbva.cellscore.web.model.page.CellsPageDTO;
import com.bbva.cellscore.web.model.page.CellsPagePayloadDTO;
import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class CellsPageMapper implements Mapper<CellsPageDTO, CellsPage> {
    @Override // com.bbva.cellscore.web.mapper.Mapper
    public CellsPageDTO dataToModel(CellsPage cellsPage) {
        return null;
    }

    @Override // com.bbva.cellscore.web.mapper.Mapper
    public CellsPage modelToData(CellsPageDTO cellsPageDTO) {
        String operation = cellsPageDTO.getOperation() == null ? "push" : cellsPageDTO.getOperation();
        CellsPagePayloadDTO payloadDTO = cellsPageDTO.getPayloadDTO();
        String page = payloadDTO.getPage() == null ? "" : payloadDTO.getPage();
        ComponentDTO[] componentDTOs = payloadDTO.getComponentDTOs();
        ArrayList arrayList = new ArrayList();
        if (componentDTOs != null) {
            ComponentMapper componentMapper = new ComponentMapper();
            for (ComponentDTO componentDTO : componentDTOs) {
                arrayList.add(componentMapper.modelToData(componentDTO));
            }
        }
        return new CellsPage(operation, page, arrayList);
    }
}

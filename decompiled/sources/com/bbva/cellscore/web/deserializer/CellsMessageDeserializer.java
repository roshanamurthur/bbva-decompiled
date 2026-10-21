package com.bbva.cellscore.web.deserializer;

import com.bbva.cells.bridge.JsMessageDeserializer;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.mapper.CellsMessageMapper;
import com.bbva.cellscore.web.model.from_web.CellsMessageDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class CellsMessageDeserializer implements JsMessageDeserializer<CellsMessage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f27105a = new GsonBuilder().create();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CellsMessageMapper f27106b = new CellsMessageMapper();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.cells.bridge.JsMessageDeserializer
    public CellsMessage deserialize(String str) {
        return this.f27106b.modelToData((CellsMessageDTO) this.f27105a.fromJson(str, CellsMessageDTO.class));
    }
}

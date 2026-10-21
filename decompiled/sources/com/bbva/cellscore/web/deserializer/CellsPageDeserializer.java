package com.bbva.cellscore.web.deserializer;

import com.bbva.cellscore.web.data.CellsPage;
import com.bbva.cellscore.web.data.GlobalDefinition;
import com.bbva.cellscore.web.mapper.CellsPageMapper;
import com.bbva.cellscore.web.model.page.CellsPageDTO;
import com.bbva.cellscore.web.model.page.components.ChannelConnectionDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CellsPageDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f27107a = new GsonBuilder().registerTypeAdapter(ChannelConnectionDTO.class, new ChannelConnectionDeserializer()).create();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CellsPageMapper f27108b = new CellsPageMapper();

    public class a extends TypeToken<Map<String, Object>> {
    }

    public CellsPage deserialize(InputStream inputStream) {
        try {
            return this.f27108b.modelToData((CellsPageDTO) this.f27107a.fromJson((Reader) new InputStreamReader(inputStream), CellsPageDTO.class));
        } catch (Exception e5) {
            e5.getMessage();
            return CellsPage.EMPTY;
        }
    }

    public GlobalDefinition deserializeGlobalProperties(InputStream inputStream) {
        try {
            return new GlobalDefinition((Map) this.f27107a.fromJson(new InputStreamReader(inputStream), new a().getType()));
        } catch (Exception e5) {
            e5.getMessage();
            return new GlobalDefinition();
        }
    }
}

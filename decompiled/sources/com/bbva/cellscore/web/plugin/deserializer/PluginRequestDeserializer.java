package com.bbva.cellscore.web.plugin.deserializer;

import com.bbva.cells.bridge.JsMessageDeserializer;
import com.bbva.cellscore.web.plugin.model.PluginRequestDTO;
import com.google.gson.Gson;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public class PluginRequestDeserializer implements JsMessageDeserializer<Pair<String, PluginRequestDTO>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f27215a = new Gson();

    @Override // com.bbva.cells.bridge.JsMessageDeserializer
    public Pair<String, PluginRequestDTO> deserialize(String str) {
        return new Pair<>(str, this.f27215a.fromJson(str, PluginRequestDTO.class));
    }
}

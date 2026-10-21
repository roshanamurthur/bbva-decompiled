package com.bbva.cells.bridge.deserializer;

import com.bbva.cells.bridge.JsMessageDeserializer;
import com.bbva.cells.bridge.model.JsMessageDTO;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes2.dex */
public class JSMessageDeserializerImpl implements JsMessageDeserializer<JsMessageDTO> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f26666a = new Gson();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.cells.bridge.JsMessageDeserializer
    public JsMessageDTO deserialize(String str) {
        return (JsMessageDTO) this.f26666a.fromJson(str, JsMessageDTO.class);
    }
}

package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonObjectVariantSerializer implements VariantSerializer<JsonUtilityService.JSONObject> {
    private final JsonUtilityService jsonUtilityService;
    private final JsonValueVariantSerializer valueVariantSerializer;

    public JsonObjectVariantSerializer(JsonUtilityService jsonUtilityService) {
        if (jsonUtilityService == null) {
            throw new IllegalArgumentException();
        }
        this.jsonUtilityService = jsonUtilityService;
        this.valueVariantSerializer = new JsonValueVariantSerializer(jsonUtilityService);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.adobe.marketing.mobile.VariantSerializer
    public JsonUtilityService.JSONObject deserialize(Variant variant) throws VariantException {
        if (variant == null) {
            throw new IllegalArgumentException();
        }
        if (variant.getKind() == VariantKind.NULL) {
            return null;
        }
        JsonUtilityService.JSONObject jSONObjectCreateJSONObject = this.jsonUtilityService.createJSONObject(new HashMap());
        for (Map.Entry<String, Variant> entry : variant.getVariantMap().entrySet()) {
            try {
                jSONObjectCreateJSONObject.put(entry.getKey(), this.valueVariantSerializer.deserialize(entry.getValue()));
            } catch (JsonException e5) {
                throw new VariantSerializationFailedException(e5);
            }
        }
        return jSONObjectCreateJSONObject;
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(JsonUtilityService.JSONObject jSONObject) throws VariantException {
        if (jSONObject == null) {
            return Variant.fromNull();
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null) {
                try {
                    map.put(next, this.valueVariantSerializer.serialize(jSONObject.get(next)));
                } catch (JsonException e5) {
                    throw new VariantSerializationFailedException(e5);
                }
            }
        }
        return Variant.fromVariantMap(map);
    }
}

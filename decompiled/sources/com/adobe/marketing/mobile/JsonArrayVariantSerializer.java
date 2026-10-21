package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
final class JsonArrayVariantSerializer implements VariantSerializer<JsonUtilityService.JSONArray> {
    private final JsonUtilityService jsonUtilityService;

    public JsonArrayVariantSerializer(JsonUtilityService jsonUtilityService) {
        if (jsonUtilityService == null) {
            throw new IllegalArgumentException();
        }
        this.jsonUtilityService = jsonUtilityService;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.adobe.marketing.mobile.VariantSerializer
    public JsonUtilityService.JSONArray deserialize(Variant variant) throws VariantException {
        if (variant == null) {
            throw new IllegalArgumentException();
        }
        if (variant.getKind() == VariantKind.NULL) {
            return null;
        }
        JsonUtilityService.JSONArray jSONArrayCreateJSONArray = this.jsonUtilityService.createJSONArray(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        Iterator<Variant> it = variant.getVariantList().iterator();
        while (it.hasNext()) {
            try {
                jSONArrayCreateJSONArray.put(new JsonValueVariantSerializer(this.jsonUtilityService).deserialize(it.next()));
            } catch (JsonException e5) {
                throw new VariantSerializationFailedException(e5);
            }
        }
        return jSONArrayCreateJSONArray;
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(JsonUtilityService.JSONArray jSONArray) throws VariantException {
        if (jSONArray == null) {
            return Variant.fromNull();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                arrayList.add(new JsonValueVariantSerializer(this.jsonUtilityService).serialize(jSONArray.get(i10)));
            } catch (JsonException e5) {
                throw new VariantSerializationFailedException(e5);
            }
        }
        return Variant.fromVariantList(arrayList);
    }
}

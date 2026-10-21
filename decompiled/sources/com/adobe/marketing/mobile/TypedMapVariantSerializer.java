package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class TypedMapVariantSerializer<T> implements VariantSerializer<Map<String, T>> {
    private final VariantSerializer<T> elementSerializer;

    public TypedMapVariantSerializer(VariantSerializer<T> variantSerializer) {
        if (variantSerializer == null) {
            throw new IllegalArgumentException();
        }
        this.elementSerializer = variantSerializer;
    }

    public Map<String, T> deserializeMap(Map<String, Variant> map) {
        Object typedObject;
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Variant> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                Variant value = entry.getValue();
                if (value == null || value.getKind() == VariantKind.NULL) {
                    typedObject = null;
                } else {
                    try {
                        typedObject = value.getTypedObject(this.elementSerializer);
                    } catch (VariantException unused) {
                    }
                }
                map2.put(key, typedObject);
            }
        }
        return map2;
    }

    public Variant serializeMap(Map<String, ? extends T> map) {
        return Variant.fromVariantMap(serializeMapToVariantMap(map));
    }

    public Map<String, Variant> serializeMapToVariantMap(Map<String, ? extends T> map) {
        Variant variantFromNull;
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, ? extends T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                T value = entry.getValue();
                if (value == null) {
                    variantFromNull = Variant.fromNull();
                } else {
                    try {
                        variantFromNull = Variant.fromTypedObject(value, this.elementSerializer);
                    } catch (VariantException unused) {
                    }
                }
                map2.put(key, variantFromNull);
            }
        }
        return map2;
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Map<String, T> deserialize(Variant variant) throws VariantException {
        if (variant == null) {
            throw new IllegalArgumentException();
        }
        if (variant.getKind() == VariantKind.NULL) {
            return null;
        }
        return deserializeMap(variant.getVariantMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(Map<String, T> map) {
        return serializeMap(map);
    }
}

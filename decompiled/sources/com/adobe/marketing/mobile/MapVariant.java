package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class MapVariant extends Variant {
    private HashMap<String, Variant> values;

    private MapVariant(MapVariant mapVariant) {
        if (mapVariant == null) {
            throw new IllegalArgumentException();
        }
        this.values = mapVariant.values;
    }

    public static MapVariant from(Map<String, Variant> map) {
        return new MapVariant(map);
    }

    @Override // com.adobe.marketing.mobile.Variant
    public VariantKind getKind() {
        return VariantKind.MAP;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public Map<String, Variant> getVariantMap() {
        return new HashMap(this.values);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        boolean z10 = true;
        for (Map.Entry<String, Variant> entry : this.values.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",");
            }
            sb2.append("\"");
            sb2.append(entry.getKey().replaceAll("\"", "\\\""));
            sb2.append("\":");
            sb2.append(entry.getValue().toString());
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.adobe.marketing.mobile.Variant
    /* JADX INFO: renamed from: clone */
    public MapVariant mo4852clone() {
        return new MapVariant(this);
    }

    private MapVariant(Map<String, Variant> map) {
        if (map != null) {
            this.values = new HashMap<>();
            for (Map.Entry<String, Variant> entry : map.entrySet()) {
                String key = entry.getKey();
                Variant value = entry.getValue();
                if (key != null) {
                    this.values.put(key, value == null ? Variant.fromNull() : value);
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}

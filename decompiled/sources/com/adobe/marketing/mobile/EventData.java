package com.adobe.marketing.mobile;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
class EventData {
    private static final String LOG_TAG = "EventData";
    private final Map<String, Variant> internalMap;

    public EventData() {
        this.internalMap = new HashMap();
    }

    private String convertVariantToString(Variant variant) throws VariantException {
        return variant instanceof VectorVariant ? variant.toString() : variant.convertToString();
    }

    public static EventData fromObjectMap(Map<String, ?> map) throws VariantException {
        return new EventData(PermissiveVariantSerializer.DEFAULT_INSTANCE.serializeToVariantMap(map));
    }

    public Map<String, Variant> asMapCopy() {
        return new HashMap(this.internalMap);
    }

    public boolean containsKey(String str) {
        if (str != null) {
            return this.internalMap.containsKey(str);
        }
        throw new IllegalArgumentException();
    }

    public EventData copy() {
        return new EventData(asMapCopy());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.internalMap.equals(((EventData) obj).internalMap);
    }

    public boolean getBoolean(String str) throws VariantException {
        return getVariant(str).getBoolean();
    }

    public double getDouble(String str) throws VariantException {
        return getVariant(str).getDouble();
    }

    @Deprecated
    public int getInt(String str, int i10) {
        return optInteger(str, i10);
    }

    public int getInteger(String str) throws VariantException {
        return getVariant(str).getInteger();
    }

    public VariantKind getKind(String str) throws VariantException {
        if (str != null) {
            return getVariant(str).getKind();
        }
        throw new IllegalArgumentException();
    }

    public long getLong(String str) throws VariantException {
        return getVariant(str).getLong();
    }

    @Deprecated
    public Map<String, String> getMap(String str) {
        return optStringMap(str, null);
    }

    @Deprecated
    public Object getObject(String str) {
        try {
            return optVariant(str, Variant.fromNull()).getObject();
        } catch (VariantException unused) {
            return null;
        }
    }

    @Deprecated
    public <T> List<T> getObjectList(String str, Class<T> cls) throws ClassCastException {
        return optVariant(str, Variant.fromNull()).getObjectList(cls);
    }

    @Deprecated
    public String getString(String str) {
        return optString(str, null);
    }

    public String getString2(String str) throws VariantException {
        return getVariant(str).getString();
    }

    public List<String> getStringList(String str) throws VariantException {
        return getVariant(str).getStringList();
    }

    public Map<String, String> getStringMap(String str) throws VariantException {
        return getVariant(str).getStringMap();
    }

    public <T> List<T> getTypedList(String str, VariantSerializer<T> variantSerializer) throws VariantException {
        return getVariant(str).getTypedList(variantSerializer);
    }

    public <T> Map<String, T> getTypedMap(String str, VariantSerializer<T> variantSerializer) throws VariantException {
        return getVariant(str).getTypedMap(variantSerializer);
    }

    public <T> T getTypedObject(String str, VariantSerializer<T> variantSerializer) throws VariantException {
        return (T) getVariant(str).getTypedObject(variantSerializer);
    }

    public Variant getVariant(String str) throws VariantException {
        return Variant.getVariantFromMap(this.internalMap, str);
    }

    public List<Variant> getVariantList(String str) throws VariantException {
        return getVariant(str).getVariantList();
    }

    public Map<String, Variant> getVariantMap(String str) throws VariantException {
        return getVariant(str).getVariantMap();
    }

    public int hashCode() {
        return this.internalMap.hashCode();
    }

    public boolean isEmpty() {
        return this.internalMap.isEmpty();
    }

    public Set<String> keys() {
        return this.internalMap.keySet();
    }

    public void merge(EventData eventData) {
        if (eventData == null || eventData.size() == 0) {
            return;
        }
        Map<String, Variant> map = this.internalMap;
        map.putAll(CollectionUtils.addDataToMap(map, eventData.internalMap));
    }

    public boolean optBoolean(String str, boolean z10) {
        try {
            return getBoolean(str);
        } catch (VariantException unused) {
            return z10;
        }
    }

    public double optDouble(String str, double d2) {
        try {
            return getDouble(str);
        } catch (VariantException unused) {
            return d2;
        }
    }

    public int optInteger(String str, int i10) {
        try {
            return getInteger(str);
        } catch (VariantException unused) {
            return i10;
        }
    }

    public long optLong(String str, long j10) {
        try {
            return getLong(str);
        } catch (VariantException unused) {
            return j10;
        }
    }

    public String optString(String str, String str2) {
        try {
            return getString2(str);
        } catch (VariantException unused) {
            return str2;
        }
    }

    public List<String> optStringList(String str, List<String> list) {
        try {
            return getStringList(str);
        } catch (VariantException unused) {
            return list;
        }
    }

    public Map<String, String> optStringMap(String str, Map<String, String> map) {
        try {
            return getStringMap(str);
        } catch (VariantException unused) {
            return map;
        }
    }

    public <T> List<T> optTypedList(String str, List<T> list, VariantSerializer<T> variantSerializer) {
        try {
            return getTypedList(str, variantSerializer);
        } catch (VariantException unused) {
            return list;
        }
    }

    public <T> Map<String, T> optTypedMap(String str, Map<String, T> map, VariantSerializer<T> variantSerializer) {
        try {
            return getTypedMap(str, variantSerializer);
        } catch (VariantException unused) {
            return map;
        }
    }

    public <T> T optTypedObject(String str, T t10, VariantSerializer<T> variantSerializer) {
        try {
            return (T) getTypedObject(str, variantSerializer);
        } catch (VariantException unused) {
            return t10;
        }
    }

    public Variant optVariant(String str, Variant variant) {
        try {
            return getVariant(str);
        } catch (VariantException unused) {
            return variant;
        }
    }

    public List<Variant> optVariantList(String str, List<Variant> list) {
        try {
            return getVariantList(str);
        } catch (VariantException unused) {
            return list;
        }
    }

    public Map<String, Variant> optVariantMap(String str, Map<String, Variant> map) {
        try {
            return getVariantMap(str);
        } catch (VariantException unused) {
            return map;
        }
    }

    public void overwrite(EventData eventData) {
        if (eventData == null || eventData.size() == 0) {
            return;
        }
        Map<String, Variant> mapAddDataToMap = CollectionUtils.addDataToMap(eventData.internalMap, this.internalMap, true, true);
        this.internalMap.clear();
        this.internalMap.putAll(mapAddDataToMap);
    }

    public String prettyString(int i10) {
        return CollectionUtils.getPrettyString(this.internalMap, i10);
    }

    public EventData putBoolean(String str, boolean z10) {
        return putVariant(str, Variant.fromBoolean(z10));
    }

    public EventData putDouble(String str, double d2) {
        return putVariant(str, Variant.fromDouble(d2));
    }

    @Deprecated
    public EventData putInt(String str, int i10) {
        return putInteger(str, i10);
    }

    public EventData putInteger(String str, int i10) {
        return putVariant(str, Variant.fromInteger(i10));
    }

    public EventData putLong(String str, long j10) {
        return putVariant(str, Variant.fromLong(j10));
    }

    @Deprecated
    public EventData putMap(String str, Map<String, String> map) {
        return putStringMap(str, map);
    }

    public EventData putNull(String str) {
        return putVariant(str, Variant.fromNull());
    }

    @Deprecated
    public EventData putObject(String str, Object obj) {
        return putVariant(str, Variant.fromObject(obj));
    }

    public EventData putString(String str, String str2) {
        return putVariant(str, Variant.fromString(str2));
    }

    public EventData putStringList(String str, List<String> list) {
        return putVariant(str, Variant.fromStringList(list));
    }

    public EventData putStringMap(String str, Map<String, String> map) {
        return putVariant(str, Variant.fromStringMap(map));
    }

    public <T> EventData putTypedList(String str, List<T> list, VariantSerializer<T> variantSerializer) {
        return putVariant(str, Variant.fromTypedList(list, variantSerializer));
    }

    public <T> EventData putTypedMap(String str, Map<String, T> map, VariantSerializer<T> variantSerializer) {
        return putVariant(str, Variant.fromTypedMap(map, variantSerializer));
    }

    public <T> EventData putTypedObject(String str, T t10, VariantSerializer<T> variantSerializer) throws VariantException {
        return putVariant(str, Variant.fromTypedObject(t10, variantSerializer));
    }

    public EventData putVariant(String str, Variant variant) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (variant == null) {
            this.internalMap.put(str, Variant.fromNull());
        } else {
            this.internalMap.put(str, variant);
        }
        return this;
    }

    public EventData putVariantList(String str, List<Variant> list) {
        return putVariant(str, Variant.fromVariantList(list));
    }

    public EventData putVariantMap(String str, Map<String, Variant> map) {
        return putVariant(str, Variant.fromVariantMap(map));
    }

    public int size() {
        return this.internalMap.size();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[Catch: VariantException -> 0x0040, TryCatch #0 {VariantException -> 0x0040, blocks: (B:4:0x000e, B:6:0x0011, B:8:0x001e, B:10:0x0026, B:12:0x002c, B:15:0x0042, B:16:0x0045, B:17:0x0052, B:19:0x0058, B:21:0x0066), top: B:27:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[Catch: VariantException -> 0x0040, TryCatch #0 {VariantException -> 0x0040, blocks: (B:4:0x000e, B:6:0x0011, B:8:0x001e, B:10:0x0026, B:12:0x002c, B:15:0x0042, B:16:0x0045, B:17:0x0052, B:19:0x0058, B:21:0x0066), top: B:27:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[SYNTHETIC] */
    public long toFnv1aHash(String[] strArr) {
        TreeMap treeMap;
        StringBuilder sb2 = new StringBuilder();
        Map<String, Variant> flattenedDataMap = EventDataFlattener.getFlattenedDataMap(this);
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    String[] strArr2 = (String[]) strArr.clone();
                    Arrays.sort(strArr2);
                    for (String str : strArr2) {
                        if (!StringUtils.isNullOrEmpty(str) && flattenedDataMap.containsKey(str)) {
                            Variant variant = flattenedDataMap.get(str);
                            sb2.append(str);
                            sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                            sb2.append(convertVariantToString(variant));
                        }
                    }
                } else {
                    treeMap = new TreeMap(flattenedDataMap);
                    for (String str2 : treeMap.keySet()) {
                        if (!(treeMap.get(str2) instanceof MapVariant)) {
                            Variant variant2 = flattenedDataMap.get(str2);
                            sb2.append(str2);
                            sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                            sb2.append(convertVariantToString(variant2));
                        }
                    }
                }
            } catch (VariantException e5) {
                Log.debug(LOG_TAG, "Unable to convert variant: %s.", e5.getLocalizedMessage());
                return 0L;
            }
        } else {
            treeMap = new TreeMap(flattenedDataMap);
            while (r4.hasNext()) {
                if (!(treeMap.get(str2) instanceof MapVariant)) {
                    Variant variant3 = flattenedDataMap.get(str2);
                    sb2.append(str2);
                    sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                    sb2.append(convertVariantToString(variant3));
                }
            }
        }
        return StringEncoder.convertStringToDecimalHash(sb2.toString());
    }

    public Map<String, Object> toObjectMap() {
        return PermissiveVariantSerializer.DEFAULT_INSTANCE.deserializeToObjectMap(this.internalMap);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        boolean z10 = true;
        for (Map.Entry<String, Variant> entry : this.internalMap.entrySet()) {
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

    @Deprecated
    public boolean getBoolean(String str, boolean z10) {
        return optBoolean(str, z10);
    }

    @Deprecated
    public long getLong(String str, long j10) {
        return optLong(str, j10);
    }

    @Deprecated
    public <T> T getObject(String str, Class<T> cls) {
        try {
            return (T) optVariant(str, Variant.fromNull()).getObject(cls);
        } catch (VariantException unused) {
            return null;
        }
    }

    public EventData(EventData eventData) {
        this();
        if (eventData != null) {
            this.internalMap.putAll(eventData.internalMap);
            return;
        }
        throw new IllegalArgumentException();
    }

    public EventData(Map<String, Variant> map) {
        this();
        if (map != null) {
            for (Map.Entry<String, Variant> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    Variant value = entry.getValue();
                    this.internalMap.put(key, value == null ? Variant.fromNull() : value);
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}

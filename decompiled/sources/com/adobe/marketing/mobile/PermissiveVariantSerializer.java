package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class PermissiveVariantSerializer implements VariantSerializer<Object> {
    public static final PermissiveVariantSerializer DEFAULT_INSTANCE = new PermissiveVariantSerializer();
    private static final String LOG_TAG = "PermissiveVariantSerializer";
    public static final int MAX_DEPTH = 256;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.PermissiveVariantSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$marketing$mobile$VariantKind;

        static {
            int[] iArr = new int[VariantKind.values().length];
            $SwitchMap$com$adobe$marketing$mobile$VariantKind = iArr;
            try {
                iArr[VariantKind.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.MAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.VECTOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private PermissiveVariantSerializer() {
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Object deserialize(Variant variant) throws VariantException {
        if (variant == null) {
            throw new IllegalArgumentException();
        }
        VariantKind kind = variant.getKind();
        switch (AnonymousClass1.$SwitchMap$com$adobe$marketing$mobile$VariantKind[kind.ordinal()]) {
            case 1:
                return null;
            case 2:
                return Integer.valueOf(variant.getInteger());
            case 3:
                return Long.valueOf(variant.getLong());
            case 4:
                return Double.valueOf(variant.getDouble());
            case 5:
                return Boolean.valueOf(variant.getBoolean());
            case 6:
                return variant.getString();
            case 7:
                HashMap map = new HashMap();
                for (Map.Entry<String, Variant> entry : variant.getVariantMap().entrySet()) {
                    map.put(entry.getKey(), deserialize(entry.getValue()));
                }
                return map;
            case 8:
                ArrayList arrayList = new ArrayList();
                Iterator<Variant> it = variant.getVariantList().iterator();
                while (it.hasNext()) {
                    arrayList.add(deserialize(it.next()));
                }
                return arrayList;
            case 9:
                return variant.getObject();
            default:
                throw new VariantSerializationFailedException("unexpected variant kind: " + kind);
        }
    }

    public Map<String, Object> deserializeToObjectMap(Map<String, Variant> map) {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Variant> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                try {
                    map2.put(key, deserialize(entry.getValue()));
                } catch (VariantException e5) {
                    Log.debug(LOG_TAG, "Unable to deserialize value for key %s, value has an unknown type, pair will be skipped, %s", key, e5);
                } catch (IllegalArgumentException e7) {
                    Log.debug(LOG_TAG, "Unable to deserialize value for key %s, value was null, pair will be skipped, %s", key, e7);
                }
            }
        }
        return map2;
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(Object obj) throws VariantException {
        return serialize(obj, 0);
    }

    public Map<String, Variant> serializeToVariantMap(Map<?, ?> map) throws VariantException {
        return serializeToVariantMap(map, 0);
    }

    private Variant serialize(Object obj, int i10) throws VariantException {
        if (obj == null) {
            return Variant.fromNull();
        }
        if (i10 > 256) {
            throw new VariantSerializationFailedException("infinite recursion");
        }
        if (obj instanceof Variant) {
            return (Variant) obj;
        }
        if (obj instanceof Integer) {
            return Variant.fromInteger(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return Variant.fromLong(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return Variant.fromDouble(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return Variant.fromDouble(((Float) obj).floatValue());
        }
        if (obj instanceof Short) {
            return Variant.fromInteger(((Short) obj).shortValue());
        }
        if (obj instanceof Byte) {
            return Variant.fromInteger(((Byte) obj).byteValue());
        }
        if (obj instanceof String) {
            return Variant.fromString((String) obj);
        }
        if (obj instanceof Boolean) {
            return Variant.fromBoolean(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Map) {
            return Variant.fromVariantMap(serializeToVariantMap((Map) obj, i10));
        }
        if (!(obj instanceof Collection)) {
            return new Variant.ObjectVariant(obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(serialize(it.next(), i10 + 1));
        }
        return Variant.fromVariantList(arrayList);
    }

    private Map<String, Variant> serializeToVariantMap(Map<?, ?> map, int i10) throws VariantException {
        HashMap map2 = new HashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key != null) {
                String string = key instanceof String ? (String) key : key.toString();
                if (string != null) {
                    map2.put(string, serialize(entry.getValue(), i10 + 1));
                }
            }
        }
        return map2;
    }
}

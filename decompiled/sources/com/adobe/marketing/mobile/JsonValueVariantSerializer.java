package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonValueVariantSerializer implements VariantSerializer<Object> {
    private final JsonUtilityService jsonUtilityService;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.JsonValueVariantSerializer$1, reason: invalid class name */
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
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.BOOLEAN.ordinal()] = 6;
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
        }
    }

    public JsonValueVariantSerializer(JsonUtilityService jsonUtilityService) {
        if (jsonUtilityService == null) {
            throw new IllegalArgumentException();
        }
        this.jsonUtilityService = jsonUtilityService;
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Object deserialize(Variant variant) throws VariantException {
        if (variant == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$adobe$marketing$mobile$VariantKind[variant.getKind().ordinal()]) {
            case 1:
                return null;
            case 2:
                return variant.getString();
            case 3:
                return Integer.valueOf(variant.getInteger());
            case 4:
                return Long.valueOf(variant.getLong());
            case 5:
                return Double.valueOf(variant.getDouble());
            case 6:
                return Boolean.valueOf(variant.getBoolean());
            case 7:
                return new JsonObjectVariantSerializer(this.jsonUtilityService).deserialize(variant);
            case 8:
                return new JsonArrayVariantSerializer(this.jsonUtilityService).deserialize(variant);
            default:
                throw new VariantSerializationFailedException();
        }
    }

    @Override // com.adobe.marketing.mobile.VariantSerializer
    public Variant serialize(Object obj) throws VariantException {
        if (obj == null) {
            return Variant.fromNull();
        }
        if (obj instanceof JsonUtilityService.JSONObject) {
            return new JsonObjectVariantSerializer(this.jsonUtilityService).serialize((JsonUtilityService.JSONObject) obj);
        }
        if (obj instanceof JsonUtilityService.JSONArray) {
            return new JsonArrayVariantSerializer(this.jsonUtilityService).serialize((JsonUtilityService.JSONArray) obj);
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
        if (obj instanceof Boolean) {
            return Variant.fromBoolean(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return Variant.fromString((String) obj);
        }
        throw new VariantSerializationFailedException();
    }
}

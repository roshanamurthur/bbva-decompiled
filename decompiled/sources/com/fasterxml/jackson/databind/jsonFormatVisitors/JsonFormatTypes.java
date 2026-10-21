package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class JsonFormatTypes {
    private static final /* synthetic */ JsonFormatTypes[] $VALUES;
    public static final JsonFormatTypes ANY;
    public static final JsonFormatTypes ARRAY;
    public static final JsonFormatTypes BOOLEAN;
    public static final JsonFormatTypes INTEGER;
    public static final JsonFormatTypes NULL;
    public static final JsonFormatTypes NUMBER;
    public static final JsonFormatTypes OBJECT;
    public static final JsonFormatTypes STRING;
    private static final Map<String, JsonFormatTypes> _byLCName;

    static {
        JsonFormatTypes jsonFormatTypes = new JsonFormatTypes("STRING", 0);
        STRING = jsonFormatTypes;
        JsonFormatTypes jsonFormatTypes2 = new JsonFormatTypes("NUMBER", 1);
        NUMBER = jsonFormatTypes2;
        JsonFormatTypes jsonFormatTypes3 = new JsonFormatTypes("INTEGER", 2);
        INTEGER = jsonFormatTypes3;
        JsonFormatTypes jsonFormatTypes4 = new JsonFormatTypes("BOOLEAN", 3);
        BOOLEAN = jsonFormatTypes4;
        JsonFormatTypes jsonFormatTypes5 = new JsonFormatTypes("OBJECT", 4);
        OBJECT = jsonFormatTypes5;
        JsonFormatTypes jsonFormatTypes6 = new JsonFormatTypes("ARRAY", 5);
        ARRAY = jsonFormatTypes6;
        JsonFormatTypes jsonFormatTypes7 = new JsonFormatTypes(VDVideoSelfieConfiguration.NULL, 6);
        NULL = jsonFormatTypes7;
        JsonFormatTypes jsonFormatTypes8 = new JsonFormatTypes("ANY", 7);
        ANY = jsonFormatTypes8;
        $VALUES = new JsonFormatTypes[]{jsonFormatTypes, jsonFormatTypes2, jsonFormatTypes3, jsonFormatTypes4, jsonFormatTypes5, jsonFormatTypes6, jsonFormatTypes7, jsonFormatTypes8};
        _byLCName = new HashMap();
        for (JsonFormatTypes jsonFormatTypes9 : values()) {
            _byLCName.put(jsonFormatTypes9.name().toLowerCase(), jsonFormatTypes9);
        }
    }

    public JsonFormatTypes() {
        throw null;
    }

    @JsonCreator
    public static JsonFormatTypes forValue(String str) {
        return _byLCName.get(str);
    }

    public static JsonFormatTypes valueOf(String str) {
        return (JsonFormatTypes) Enum.valueOf(JsonFormatTypes.class, str);
    }

    public static JsonFormatTypes[] values() {
        return (JsonFormatTypes[]) $VALUES.clone();
    }

    @JsonValue
    public String value() {
        return name().toLowerCase();
    }
}

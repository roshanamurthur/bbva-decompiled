package com.fasterxml.jackson.databind.node;

import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class JsonNodeType {
    private static final /* synthetic */ JsonNodeType[] $VALUES;
    public static final JsonNodeType ARRAY;
    public static final JsonNodeType BINARY;
    public static final JsonNodeType BOOLEAN;
    public static final JsonNodeType MISSING;
    public static final JsonNodeType NULL;
    public static final JsonNodeType NUMBER;
    public static final JsonNodeType OBJECT;
    public static final JsonNodeType POJO;
    public static final JsonNodeType STRING;

    static {
        JsonNodeType jsonNodeType = new JsonNodeType("ARRAY", 0);
        ARRAY = jsonNodeType;
        JsonNodeType jsonNodeType2 = new JsonNodeType("BINARY", 1);
        BINARY = jsonNodeType2;
        JsonNodeType jsonNodeType3 = new JsonNodeType("BOOLEAN", 2);
        BOOLEAN = jsonNodeType3;
        JsonNodeType jsonNodeType4 = new JsonNodeType("MISSING", 3);
        MISSING = jsonNodeType4;
        JsonNodeType jsonNodeType5 = new JsonNodeType(VDVideoSelfieConfiguration.NULL, 4);
        NULL = jsonNodeType5;
        JsonNodeType jsonNodeType6 = new JsonNodeType("NUMBER", 5);
        NUMBER = jsonNodeType6;
        JsonNodeType jsonNodeType7 = new JsonNodeType("OBJECT", 6);
        OBJECT = jsonNodeType7;
        JsonNodeType jsonNodeType8 = new JsonNodeType("POJO", 7);
        POJO = jsonNodeType8;
        JsonNodeType jsonNodeType9 = new JsonNodeType("STRING", 8);
        STRING = jsonNodeType9;
        $VALUES = new JsonNodeType[]{jsonNodeType, jsonNodeType2, jsonNodeType3, jsonNodeType4, jsonNodeType5, jsonNodeType6, jsonNodeType7, jsonNodeType8, jsonNodeType9};
    }

    public JsonNodeType() {
        throw null;
    }

    public static JsonNodeType valueOf(String str) {
        return (JsonNodeType) Enum.valueOf(JsonNodeType.class, str);
    }

    public static JsonNodeType[] values() {
        return (JsonNodeType[]) $VALUES.clone();
    }
}

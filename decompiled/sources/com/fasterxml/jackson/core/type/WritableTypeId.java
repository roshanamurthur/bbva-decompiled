package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

/* JADX INFO: loaded from: classes9.dex */
public class WritableTypeId {
    public String asProperty;
    public Object extra;
    public Object forValue;
    public Class<?> forValueType;
    public Object id;
    public Inclusion include;
    public JsonToken valueShape;
    public boolean wrapperWritten;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Inclusion {
        private static final /* synthetic */ Inclusion[] $VALUES;
        public static final Inclusion METADATA_PROPERTY;
        public static final Inclusion PARENT_PROPERTY;
        public static final Inclusion PAYLOAD_PROPERTY;
        public static final Inclusion WRAPPER_ARRAY;
        public static final Inclusion WRAPPER_OBJECT;

        static {
            Inclusion inclusion = new Inclusion("WRAPPER_ARRAY", 0);
            WRAPPER_ARRAY = inclusion;
            Inclusion inclusion2 = new Inclusion("WRAPPER_OBJECT", 1);
            WRAPPER_OBJECT = inclusion2;
            Inclusion inclusion3 = new Inclusion("METADATA_PROPERTY", 2);
            METADATA_PROPERTY = inclusion3;
            Inclusion inclusion4 = new Inclusion("PAYLOAD_PROPERTY", 3);
            PAYLOAD_PROPERTY = inclusion4;
            Inclusion inclusion5 = new Inclusion("PARENT_PROPERTY", 4);
            PARENT_PROPERTY = inclusion5;
            $VALUES = new Inclusion[]{inclusion, inclusion2, inclusion3, inclusion4, inclusion5};
        }

        public Inclusion() {
            throw null;
        }

        public static Inclusion valueOf(String str) {
            return (Inclusion) Enum.valueOf(Inclusion.class, str);
        }

        public static Inclusion[] values() {
            return (Inclusion[]) $VALUES.clone();
        }

        public boolean requiresObjectContext() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public WritableTypeId() {
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this(obj, jsonToken, (Object) null);
    }

    public WritableTypeId(Object obj, Class<?> cls, JsonToken jsonToken) {
        this(obj, jsonToken, (Object) null);
        this.forValueType = cls;
    }

    public WritableTypeId(Object obj, JsonToken jsonToken, Object obj2) {
        this.forValue = obj;
        this.id = obj2;
        this.valueShape = jsonToken;
    }
}

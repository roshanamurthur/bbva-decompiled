package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TypeSerializer {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43374a;

        static {
            int[] iArr = new int[JsonTypeInfo.As.values().length];
            f43374a = iArr;
            try {
                iArr[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43374a[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43374a[JsonTypeInfo.As.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43374a[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43374a[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void _writeLegacySuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        writableTypeId.wrapperWritten = !jsonGenerator.canWriteTypeId();
        writeTypeSuffix(jsonGenerator, writableTypeId);
    }

    public abstract TypeSerializer forProperty(BeanProperty beanProperty);

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract JsonTypeInfo.As getTypeInclusion();

    public WritableTypeId typeId(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i10 = a.f43374a[getTypeInclusion().ordinal()];
        if (i10 == 1) {
            writableTypeId.include = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
        } else if (i10 == 2) {
            writableTypeId.include = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
        } else if (i10 == 3) {
            writableTypeId.include = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.asProperty = getPropertyName();
        } else if (i10 == 4) {
            writableTypeId.include = WritableTypeId.Inclusion.WRAPPER_ARRAY;
        } else if (i10 != 5) {
            VersionUtil.throwInternal();
        } else {
            writableTypeId.include = WritableTypeId.Inclusion.WRAPPER_OBJECT;
        }
        return writableTypeId;
    }

    @Deprecated
    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY, str));
    }

    @Deprecated
    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT, str));
    }

    @Deprecated
    public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING, str));
    }

    public abstract WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    @Deprecated
    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY));
    }

    @Deprecated
    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT));
    }

    @Deprecated
    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING));
    }

    public abstract WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    @Deprecated
    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY));
    }

    @Deprecated
    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT));
    }

    @Deprecated
    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING));
    }

    @Deprecated
    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, cls, JsonToken.START_ARRAY));
    }

    @Deprecated
    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, cls, JsonToken.START_OBJECT));
    }

    @Deprecated
    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, cls, JsonToken.VALUE_STRING));
    }

    public WritableTypeId typeId(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId writableTypeIdTypeId = typeId(obj, jsonToken);
        writableTypeIdTypeId.id = obj2;
        return writableTypeIdTypeId;
    }

    public WritableTypeId typeId(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId writableTypeIdTypeId = typeId(obj, jsonToken);
        writableTypeIdTypeId.forValueType = cls;
        return writableTypeIdTypeId;
    }
}

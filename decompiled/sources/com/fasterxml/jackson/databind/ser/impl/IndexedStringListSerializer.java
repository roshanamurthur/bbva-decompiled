package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@JacksonStdImpl
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();

    public IndexedStringListSerializer() {
        super(List.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new IndexedStringListSerializer(this, bool);
    }

    public final void a(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i10) throws IOException {
        jsonGenerator.setCurrentValue(list);
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                String str = list.get(i11);
                if (str == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.writeString(str);
                }
            } catch (Exception e5) {
                wrapAndThrow(serializerProvider, e5, list, i11);
                return;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void acceptContentVisitor(JsonArrayFormatVisitor jsonArrayFormatVisitor) throws JsonMappingException {
        jsonArrayFormatVisitor.itemsFormat(JsonFormatTypes.STRING);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public JsonNode contentSchema() {
        return createSchemaNode("string", true);
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, Boolean bool) {
        super(indexedStringListSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int size = list.size();
        if (size == 1 && ((this._unwrapSingle == null && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            a(list, jsonGenerator, serializerProvider, 1);
            return;
        }
        jsonGenerator.writeStartArray(size);
        a(list, jsonGenerator, serializerProvider, size);
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase
    public void serializeWithType(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(list, JsonToken.START_ARRAY));
        a(list, jsonGenerator, serializerProvider, list.size());
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }
}

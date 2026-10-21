package com.fasterxml.jackson.databind.ext;

import com.esotericsoftware.kryo.serializers.f0;
import com.esotericsoftware.kryo.serializers.g0;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.IOException;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes9.dex */
public class NioPathSerializer extends StdScalarSerializer<Path> {
    public NioPathSerializer() {
        super(f0.d());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        serialize(g0.d(obj), jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        serializeWithType(g0.d(obj), jsonGenerator, serializerProvider, typeSerializer);
    }

    public void serialize(Path path, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(path.toUri().toString());
    }

    public void serializeWithType(Path path, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(path, f0.d(), JsonToken.VALUE_STRING));
        serialize(path, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }
}

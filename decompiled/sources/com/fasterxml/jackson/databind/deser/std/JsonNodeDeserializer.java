package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class JsonNodeDeserializer extends com.fasterxml.jackson.databind.deser.std.a<JsonNode> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final JsonNodeDeserializer f43256p0 = new JsonNodeDeserializer();

    public JsonNodeDeserializer() {
        super(JsonNode.class, null);
    }

    public static JsonDeserializer<? extends JsonNode> getDeserializer(Class<?> cls) {
        if (cls == ObjectNode.class) {
            return b.f43258p0;
        }
        return cls == ArrayNode.class ? a.f43257p0 : f43256p0;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.a, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.a, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.a, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return super.supportsUpdate(deserializationConfig);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 1) {
            return currentTokenId != 3 ? deserializeAny(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
        }
        return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public JsonNode getNullValue(DeserializationContext deserializationContext) {
        return NullNode.getInstance();
    }

    public static final class a extends com.fasterxml.jackson.databind.deser.std.a<ArrayNode> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f43257p0 = new a();

        public a() {
            super(ArrayNode.class, Boolean.TRUE);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            return jsonParser.isExpectedStartArrayToken() ? (ArrayNode) updateArray(jsonParser, deserializationContext, (ArrayNode) obj) : (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedStartArrayToken()) {
                return deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }
    }

    public static final class b extends com.fasterxml.jackson.databind.deser.std.a<ObjectNode> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f43258p0 = new b();

        public b() {
            super(ObjectNode.class, Boolean.TRUE);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            return (jsonParser.isExpectedStartObjectToken() || jsonParser.hasToken(JsonToken.FIELD_NAME)) ? (ObjectNode) updateObject(jsonParser, deserializationContext, (ObjectNode) obj) : (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedStartObjectToken()) {
                return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            if (jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return deserializeObjectAtName(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            if (jsonParser.hasToken(JsonToken.END_OBJECT)) {
                return deserializationContext.getNodeFactory().objectNode();
            }
            return (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }
    }
}

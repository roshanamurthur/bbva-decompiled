package com.noknok.android.client.utils;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes11.dex */
public class StrictTypeAdapter {

    public static class JsonArrayDeserializer implements JsonDeserializer<JsonArray> {
        private JsonArrayDeserializer() {
        }

        public /* synthetic */ JsonArrayDeserializer(int i10) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public JsonArray deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject.isJsonArray()) {
                return asJsonObject.getAsJsonArray();
            }
            throw new JsonParseException(jsonElement + " is not valid JsonArray");
        }
    }

    public static class JsonBooleanDeserializer implements JsonDeserializer<Boolean> {
        private JsonBooleanDeserializer() {
        }

        public /* synthetic */ JsonBooleanDeserializer(int i10) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Boolean deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement.getAsJsonPrimitive().isBoolean()) {
                return Boolean.valueOf(jsonElement.getAsJsonPrimitive().getAsBoolean());
            }
            throw new JsonParseException(jsonElement + " is not boolean value");
        }
    }

    public static class JsonIntegerDeserializer implements JsonDeserializer<Integer> {
        private JsonIntegerDeserializer() {
        }

        public /* synthetic */ JsonIntegerDeserializer(int i10) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber() && asJsonPrimitive.getAsLong() <= 2147483647L && asJsonPrimitive.getAsLong() >= -2147483648L) {
                return Integer.valueOf(asJsonPrimitive.getAsInt());
            }
            throw new JsonParseException(jsonElement + " is not valid int value");
        }
    }

    public static class JsonLongDeserializer implements JsonDeserializer<Long> {
        private JsonLongDeserializer() {
        }

        public /* synthetic */ JsonLongDeserializer(int i10) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Long deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement.getAsJsonPrimitive().isNumber()) {
                return Long.valueOf(jsonElement.getAsJsonPrimitive().getAsLong());
            }
            throw new JsonParseException(jsonElement + " is not valid long value");
        }
    }

    public static class JsonShortDeserializer implements JsonDeserializer<Short> {
        private JsonShortDeserializer() {
        }

        public /* synthetic */ JsonShortDeserializer(int i10) {
            this();
        }

        @Override // com.google.gson.JsonDeserializer
        public Short deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber() && asJsonPrimitive.getAsLong() <= 32767 && asJsonPrimitive.getAsLong() >= -32768) {
                return Short.valueOf(asJsonPrimitive.getAsShort());
            }
            throw new JsonParseException(jsonElement + " is not valid short value");
        }
    }

    public static class JsonStringDeserializer implements JsonDeserializer<String> {
        private JsonStringDeserializer() {
        }

        public /* synthetic */ JsonStringDeserializer(int i10) {
            this();
        }

        @Override // com.google.gson.JsonDeserializer
        public String deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement.getAsJsonPrimitive().isString()) {
                return jsonElement.getAsJsonPrimitive().getAsString();
            }
            throw new JsonParseException(jsonElement + " is not String value");
        }
    }

    public static class JsonStringTypeAdapter extends TypeAdapter<String> {
        private JsonStringTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        public String read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.STRING) {
                return jsonReader.nextString();
            }
            throw new JsonParseException("Invalid type or null provided for String value");
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }

    public static GsonBuilder GsonBuilder() {
        return typeSafeGsonBuilder().registerTypeAdapterFactory(new NullCheckCollectionAdapterFactory());
    }

    public static GsonBuilder typeSafeGsonBuilder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        int i10 = 0;
        gsonBuilder.registerTypeAdapter(Boolean.TYPE, new JsonBooleanDeserializer(i10));
        gsonBuilder.registerTypeAdapter(Boolean.class, new JsonBooleanDeserializer(i10));
        gsonBuilder.registerTypeAdapter(Integer.TYPE, new JsonIntegerDeserializer(i10));
        gsonBuilder.registerTypeAdapter(Integer.class, new JsonIntegerDeserializer(i10));
        gsonBuilder.registerTypeAdapter(Short.TYPE, new JsonShortDeserializer(i10));
        gsonBuilder.registerTypeAdapter(Short.class, new JsonShortDeserializer(i10));
        gsonBuilder.registerTypeAdapter(Long.TYPE, new JsonLongDeserializer(i10));
        gsonBuilder.registerTypeAdapter(Long.class, new JsonLongDeserializer(i10));
        gsonBuilder.registerTypeAdapter(String.class, new JsonStringDeserializer(i10));
        gsonBuilder.registerTypeAdapter(JsonArray.class, new JsonArrayDeserializer(i10));
        return gsonBuilder;
    }
}

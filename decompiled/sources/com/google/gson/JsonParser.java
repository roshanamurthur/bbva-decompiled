package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes10.dex */
public final class JsonParser {
    @Deprecated
    public JsonParser() {
    }

    public static JsonElement parseReader(Reader reader) throws JsonSyntaxException, JsonIOException {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            JsonElement reader2 = parseReader(jsonReader);
            if (!reader2.isJsonNull() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return reader2;
        } catch (MalformedJsonException e5) {
            throw new JsonSyntaxException(e5);
        } catch (IOException e7) {
            throw new JsonIOException(e7);
        } catch (NumberFormatException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    public static JsonElement parseString(String str) throws JsonSyntaxException {
        return parseReader(new StringReader(str));
    }

    @Deprecated
    public JsonElement parse(String str) throws JsonSyntaxException {
        return parseString(str);
    }

    @Deprecated
    public JsonElement parse(Reader reader) throws JsonSyntaxException, JsonIOException {
        return parseReader(reader);
    }

    @Deprecated
    public JsonElement parse(JsonReader jsonReader) throws JsonSyntaxException, JsonIOException {
        return parseReader(jsonReader);
    }

    public static JsonElement parseReader(JsonReader jsonReader) throws JsonSyntaxException, JsonIOException {
        boolean zIsLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                JsonElement jsonElement = Streams.parse(jsonReader);
                jsonReader.setLenient(zIsLenient);
                return jsonElement;
            } catch (OutOfMemoryError e5) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e5);
            } catch (StackOverflowError e7) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e7);
            }
        } catch (Throwable th2) {
            jsonReader.setLenient(zIsLenient);
            throw th2;
        }
    }
}

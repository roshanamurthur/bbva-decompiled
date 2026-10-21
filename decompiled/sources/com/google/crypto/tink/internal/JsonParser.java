package com.google.crypto.tink.internal;

import androidx.camera.core.processing.f;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f46630a = new b();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46631a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f46631a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46631a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46631a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46631a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46631a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46631a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b extends TypeAdapter<JsonElement> {
        public static JsonElement a(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i10 = a.f46631a[jsonToken.ordinal()];
            if (i10 == 3) {
                String strNextString = jsonReader.nextString();
                if (JsonParser.isValidString(strNextString)) {
                    return new JsonPrimitive(strNextString);
                }
                throw new IOException("illegal characters in string");
            }
            if (i10 == 4) {
                return new JsonPrimitive(new c(jsonReader.nextString()));
            }
            if (i10 == 5) {
                return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            if (i10 == 6) {
                jsonReader.nextNull();
                return JsonNull.INSTANCE;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        @Nullable
        public static JsonElement b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i10 = a.f46631a[jsonToken.ordinal()];
            if (i10 == 1) {
                jsonReader.beginArray();
                return new JsonArray();
            }
            if (i10 != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new JsonObject();
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
            throw new UnsupportedOperationException("write is not supported");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public final JsonElement read2(JsonReader jsonReader) throws IOException {
            String strNextName;
            JsonToken jsonTokenPeek = jsonReader.peek();
            JsonElement jsonElementB = b(jsonReader, jsonTokenPeek);
            if (jsonElementB == null) {
                return a(jsonReader, jsonTokenPeek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    if (jsonElementB instanceof JsonObject) {
                        strNextName = jsonReader.nextName();
                        if (!JsonParser.isValidString(strNextName)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        strNextName = null;
                    }
                    JsonToken jsonTokenPeek2 = jsonReader.peek();
                    JsonElement jsonElementB2 = b(jsonReader, jsonTokenPeek2);
                    boolean z10 = jsonElementB2 != null;
                    if (jsonElementB2 == null) {
                        jsonElementB2 = a(jsonReader, jsonTokenPeek2);
                    }
                    if (jsonElementB instanceof JsonArray) {
                        ((JsonArray) jsonElementB).add(jsonElementB2);
                    } else {
                        JsonObject jsonObject = (JsonObject) jsonElementB;
                        if (jsonObject.has(strNextName)) {
                            throw new IOException(f.d("duplicate key: ", strNextName));
                        }
                        jsonObject.add(strNextName, jsonElementB2);
                    }
                    if (z10) {
                        arrayDeque.addLast(jsonElementB);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        jsonElementB = jsonElementB2;
                    } else {
                        continue;
                    }
                } else {
                    if (jsonElementB instanceof JsonArray) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return jsonElementB;
                    }
                    jsonElementB = (JsonElement) arrayDeque.removeLast();
                }
            }
        }
    }

    public static final class c extends Number {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final String f46632p0;

        public c(String str) {
            this.f46632p0 = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        private Object writeReplace() throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        @Override // java.lang.Number
        public final double doubleValue() {
            return Double.parseDouble(this.f46632p0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f46632p0.equals(((c) obj).f46632p0);
            }
            return false;
        }

        @Override // java.lang.Number
        public final float floatValue() {
            return Float.parseFloat(this.f46632p0);
        }

        public final int hashCode() {
            return this.f46632p0.hashCode();
        }

        @Override // java.lang.Number
        public final int intValue() {
            String str = this.f46632p0;
            try {
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(str);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(str).intValue();
            }
        }

        @Override // java.lang.Number
        public final long longValue() {
            String str = this.f46632p0;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).longValue();
            }
        }

        public final String toString() {
            return this.f46632p0;
        }
    }

    public static long getParsedNumberAsLongOrThrow(JsonElement jsonElement) {
        if (jsonElement.getAsNumber() instanceof c) {
            return Long.parseLong(jsonElement.getAsNumber().toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }

    public static boolean isValidString(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }

    public static JsonElement parse(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.setLenient(false);
            return f46630a.read2(jsonReader);
        } catch (NumberFormatException e5) {
            throw new IOException(e5);
        }
    }
}

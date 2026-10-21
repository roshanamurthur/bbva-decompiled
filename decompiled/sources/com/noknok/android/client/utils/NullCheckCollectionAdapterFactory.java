package com.noknok.android.client.utils;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public final class NullCheckCollectionAdapterFactory implements TypeAdapterFactory {

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypeAdapter<Collection<E>> f63458a;

        public Adapter(TypeAdapter<Collection<E>> typeAdapter) {
            this.f63458a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public Collection<E> read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return this.f63458a.read2(jsonReader);
            }
            throw new JsonParseException("null is not accepted for json collections");
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            this.f63458a.write(jsonWriter, collection);
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (Collection.class.isAssignableFrom(typeToken.getRawType())) {
            return new Adapter(StrictTypeAdapter.typeSafeGsonBuilder().create().getAdapter(typeToken));
        }
        return null;
    }
}

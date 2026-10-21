package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class SerializerCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<TypeKey, JsonSerializer<Object>> f43401a = new HashMap<>(64);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<ReadOnlyClassToSerializerMap> f43402b = new AtomicReference<>();

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws JsonMappingException {
        synchronized (this) {
            try {
                if (this.f43401a.put(new TypeKey(cls, false), jsonSerializer) == null) {
                    this.f43402b.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addTypedSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            try {
                if (this.f43401a.put(new TypeKey(javaType, true), jsonSerializer) == null) {
                    this.f43402b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void flush() {
        this.f43401a.clear();
    }

    public ReadOnlyClassToSerializerMap getReadOnlyLookupMap() {
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMapFrom;
        ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap = this.f43402b.get();
        if (readOnlyClassToSerializerMap != null) {
            return readOnlyClassToSerializerMap;
        }
        synchronized (this) {
            readOnlyClassToSerializerMapFrom = this.f43402b.get();
            if (readOnlyClassToSerializerMapFrom == null) {
                readOnlyClassToSerializerMapFrom = ReadOnlyClassToSerializerMap.from(this.f43401a);
                this.f43402b.set(readOnlyClassToSerializerMapFrom);
            }
        }
        return readOnlyClassToSerializerMapFrom;
    }

    public synchronized int size() {
        return this.f43401a.size();
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this.f43401a.get(new TypeKey(javaType, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this.f43401a.get(new TypeKey(cls, false));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this.f43401a.get(new TypeKey(cls, true));
        }
        return jsonSerializer;
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        JsonSerializer<Object> jsonSerializer;
        synchronized (this) {
            jsonSerializer = this.f43401a.get(new TypeKey(javaType, false));
        }
        return jsonSerializer;
    }

    public void addTypedSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        synchronized (this) {
            try {
                if (this.f43401a.put(new TypeKey(cls, true), jsonSerializer) == null) {
                    this.f43402b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws JsonMappingException {
        synchronized (this) {
            try {
                if (this.f43401a.put(new TypeKey(javaType, false), jsonSerializer) == null) {
                    this.f43402b.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAndResolveNonTypedSerializer(Class<?> cls, JavaType javaType, JsonSerializer<Object> jsonSerializer, SerializerProvider serializerProvider) throws JsonMappingException {
        synchronized (this) {
            try {
                JsonSerializer<Object> jsonSerializerPut = this.f43401a.put(new TypeKey(cls, false), jsonSerializer);
                JsonSerializer<Object> jsonSerializerPut2 = this.f43401a.put(new TypeKey(javaType, false), jsonSerializer);
                if (jsonSerializerPut == null || jsonSerializerPut2 == null) {
                    this.f43402b.set(null);
                }
                if (jsonSerializer instanceof ResolvableSerializer) {
                    ((ResolvableSerializer) jsonSerializer).resolve(serializerProvider);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.TypeKey;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class ReadOnlyClassToSerializerMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f43419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43421c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JsonSerializer<Object> f43422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f43423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<?> f43424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final JavaType f43425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f43426e;

        public a(a aVar, TypeKey typeKey, JsonSerializer<Object> jsonSerializer) {
            this.f43423b = aVar;
            this.f43422a = jsonSerializer;
            this.f43426e = typeKey.isTyped();
            this.f43424c = typeKey.getRawType();
            this.f43425d = typeKey.getType();
        }
    }

    public ReadOnlyClassToSerializerMap(Map<TypeKey, JsonSerializer<Object>> map) {
        int size = map.size();
        int i10 = 8;
        while (i10 < (size <= 64 ? size + size : size + (size >> 2))) {
            i10 += i10;
        }
        this.f43420b = i10;
        this.f43421c = i10 - 1;
        a[] aVarArr = new a[i10];
        for (Map.Entry<TypeKey, JsonSerializer<Object>> entry : map.entrySet()) {
            TypeKey key = entry.getKey();
            int iHashCode = key.hashCode() & this.f43421c;
            aVarArr[iHashCode] = new a(aVarArr[iHashCode], key, entry.getValue());
        }
        this.f43419a = aVarArr;
    }

    public static ReadOnlyClassToSerializerMap from(HashMap<TypeKey, JsonSerializer<Object>> map) {
        return new ReadOnlyClassToSerializerMap(map);
    }

    public int size() {
        return this.f43420b;
    }

    public JsonSerializer<Object> typedValueSerializer(JavaType javaType) {
        a aVar = this.f43419a[TypeKey.typedHash(javaType) & this.f43421c];
        if (aVar == null) {
            return null;
        }
        if (aVar.f43426e && javaType.equals(aVar.f43425d)) {
            return aVar.f43422a;
        }
        while (true) {
            aVar = aVar.f43423b;
            if (aVar == null) {
                return null;
            }
            if (aVar.f43426e && javaType.equals(aVar.f43425d)) {
                return aVar.f43422a;
            }
        }
    }

    public JsonSerializer<Object> untypedValueSerializer(JavaType javaType) {
        a aVar = this.f43419a[TypeKey.untypedHash(javaType) & this.f43421c];
        if (aVar == null) {
            return null;
        }
        if (!aVar.f43426e && javaType.equals(aVar.f43425d)) {
            return aVar.f43422a;
        }
        while (true) {
            aVar = aVar.f43423b;
            if (aVar == null) {
                return null;
            }
            if (!aVar.f43426e && javaType.equals(aVar.f43425d)) {
                return aVar.f43422a;
            }
        }
    }

    public JsonSerializer<Object> typedValueSerializer(Class<?> cls) {
        a aVar = this.f43419a[TypeKey.typedHash(cls) & this.f43421c];
        if (aVar == null) {
            return null;
        }
        if (aVar.f43424c == cls && aVar.f43426e) {
            return aVar.f43422a;
        }
        while (true) {
            aVar = aVar.f43423b;
            if (aVar == null) {
                return null;
            }
            if (aVar.f43424c == cls && aVar.f43426e) {
                return aVar.f43422a;
            }
        }
    }

    public JsonSerializer<Object> untypedValueSerializer(Class<?> cls) {
        a aVar = this.f43419a[TypeKey.untypedHash(cls) & this.f43421c];
        if (aVar == null) {
            return null;
        }
        if (aVar.f43424c == cls && !aVar.f43426e) {
            return aVar.f43422a;
        }
        while (true) {
            aVar = aVar.f43423b;
            if (aVar == null) {
                return null;
            }
            if (aVar.f43424c == cls && !aVar.f43426e) {
                return aVar.f43422a;
            }
        }
    }
}

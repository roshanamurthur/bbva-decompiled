package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PropertySerializerMap {
    protected final boolean _resetWhenFull;

    public static final class SerializerAndMapResult {
        public final PropertySerializerMap map;
        public final JsonSerializer<Object> serializer;

        public SerializerAndMapResult(JsonSerializer<Object> jsonSerializer, PropertySerializerMap propertySerializerMap) {
            this.serializer = jsonSerializer;
            this.map = propertySerializerMap;
        }
    }

    public static final class a extends PropertySerializerMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f43408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f43409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JsonSerializer<Object> f43410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final JsonSerializer<Object> f43411d;

        public a(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer, Class<?> cls2, JsonSerializer<Object> jsonSerializer2) {
            super(propertySerializerMap);
            this.f43408a = cls;
            this.f43410c = jsonSerializer;
            this.f43409b = cls2;
            this.f43411d = jsonSerializer2;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new c(this, new e[]{new e(this.f43408a, this.f43410c), new e(this.f43409b, this.f43411d), new e(cls, jsonSerializer)});
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this.f43408a) {
                return this.f43410c;
            }
            if (cls == this.f43409b) {
                return this.f43411d;
            }
            return null;
        }
    }

    public static final class b extends PropertySerializerMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43412a = new b(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f43413b = new b(true);

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new d(this, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final JsonSerializer<Object> serializerFor(Class<?> cls) {
            return null;
        }
    }

    public static final class c extends PropertySerializerMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e[] f43414a;

        public c(PropertySerializerMap propertySerializerMap, e[] eVarArr) {
            super(propertySerializerMap);
            this.f43414a = eVarArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            e[] eVarArr = this.f43414a;
            int length = eVarArr.length;
            if (length == 8) {
                return this._resetWhenFull ? new d(this, cls, jsonSerializer) : this;
            }
            e[] eVarArr2 = (e[]) Arrays.copyOf(eVarArr, length + 1);
            eVarArr2[length] = new e(cls, jsonSerializer);
            return new c(this, eVarArr2);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final JsonSerializer<Object> serializerFor(Class<?> cls) {
            for (e eVar : this.f43414a) {
                if (eVar.f43417a == cls) {
                    return eVar.f43418b;
                }
            }
            return null;
        }
    }

    public static final class d extends PropertySerializerMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f43415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JsonSerializer<Object> f43416b;

        public d(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            super(propertySerializerMap);
            this.f43415a = cls;
            this.f43416b = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new a(this, this.f43415a, this.f43416b, cls, jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public final JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this.f43415a) {
                return this.f43416b;
            }
            return null;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f43417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JsonSerializer<Object> f43418b;

        public e(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            this.f43417a = cls;
            this.f43418b = jsonSerializer;
        }
    }

    public PropertySerializerMap(boolean z10) {
        this._resetWhenFull = z10;
    }

    public static PropertySerializerMap emptyForProperties() {
        return b.f43412a;
    }

    public static PropertySerializerMap emptyForRootValues() {
        return b.f43413b;
    }

    @Deprecated
    public static PropertySerializerMap emptyMap() {
        return emptyForProperties();
    }

    public final SerializerAndMapResult addSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(cls, jsonSerializer));
    }

    public final SerializerAndMapResult findAndAddKeySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerFindKeySerializer = serializerProvider.findKeySerializer(cls, beanProperty);
        return new SerializerAndMapResult(jsonSerializerFindKeySerializer, newWith(cls, jsonSerializerFindKeySerializer));
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerFindPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(cls, beanProperty);
        return new SerializerAndMapResult(jsonSerializerFindPrimaryPropertySerializer, newWith(cls, jsonSerializerFindPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = serializerProvider.findTypedValueSerializer(cls, false, (BeanProperty) null);
        return new SerializerAndMapResult(jsonSerializerFindTypedValueSerializer, newWith(cls, jsonSerializerFindTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerFindValueSerializer = serializerProvider.findValueSerializer(cls, beanProperty);
        return new SerializerAndMapResult(jsonSerializerFindValueSerializer, newWith(cls, jsonSerializerFindValueSerializer));
    }

    public abstract PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer);

    public abstract JsonSerializer<Object> serializerFor(Class<?> cls);

    public final SerializerAndMapResult addSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        return new SerializerAndMapResult(jsonSerializer, newWith(javaType.getRawClass(), jsonSerializer));
    }

    public PropertySerializerMap(PropertySerializerMap propertySerializerMap) {
        this._resetWhenFull = propertySerializerMap._resetWhenFull;
    }

    public final SerializerAndMapResult findAndAddPrimarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerFindPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(javaType, beanProperty);
        return new SerializerAndMapResult(jsonSerializerFindPrimaryPropertySerializer, newWith(javaType.getRawClass(), jsonSerializerFindPrimaryPropertySerializer));
    }

    public final SerializerAndMapResult findAndAddRootValueSerializer(JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = serializerProvider.findTypedValueSerializer(javaType, false, (BeanProperty) null);
        return new SerializerAndMapResult(jsonSerializerFindTypedValueSerializer, newWith(javaType.getRawClass(), jsonSerializerFindTypedValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSecondarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializerFindValueSerializer = serializerProvider.findValueSerializer(javaType, beanProperty);
        return new SerializerAndMapResult(jsonSerializerFindValueSerializer, newWith(javaType.getRawClass(), jsonSerializerFindValueSerializer));
    }
}

package com.fasterxml.jackson.databind.ser;

import androidx.datastore.preferences.protobuf.e;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DefaultSerializerProvider extends SerializerProvider implements Serializable {
    protected transient JsonGenerator _generator;
    protected transient ArrayList<ObjectIdGenerator<?>> _objectIdGenerators;
    protected transient Map<Object, WritableObjectId> _seenObjectIds;

    public static final class Impl extends DefaultSerializerProvider {
        public Impl() {
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public DefaultSerializerProvider copy() {
            return new Impl(this);
        }

        public Impl(Impl impl) {
            super(impl);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public Impl createInstance(SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
            return new Impl(this, serializationConfig, serializerFactory);
        }

        public Impl(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
            super(serializerProvider, serializationConfig, serializerFactory);
        }
    }

    public DefaultSerializerProvider() {
    }

    public static IOException b(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strExceptionMessage = ClassUtil.exceptionMessage(exc);
        if (strExceptionMessage == null) {
            strExceptionMessage = "[no message for " + exc.getClass().getName() + Constant.BRACKET_CLOSE;
        }
        return new JsonMappingException(jsonGenerator, strExceptionMessage, exc);
    }

    public Map<Object, WritableObjectId> _createObjectIdMap() {
        return isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
    }

    public void _serializeNull(JsonGenerator jsonGenerator) throws IOException {
        try {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } catch (Exception e5) {
            throw b(jsonGenerator, e5);
        }
    }

    public final void a(JsonGenerator jsonGenerator, Object obj, JsonSerializer<Object> jsonSerializer, PropertyName propertyName) throws IOException {
        try {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(propertyName.simpleAsEncoded(this._config));
            jsonSerializer.serialize(obj, jsonGenerator, this);
            jsonGenerator.writeEndObject();
        } catch (Exception e5) {
            throw b(jsonGenerator, e5);
        }
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("A class must be provided");
        }
        jsonFormatVisitorWrapper.setProvider(this);
        findValueSerializer(javaType, (BeanProperty) null).acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType);
    }

    public int cachedSerializersCount() {
        return this._serializerCache.size();
    }

    public DefaultSerializerProvider copy() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationConfig, SerializerFactory serializerFactory);

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public WritableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        ObjectIdGenerator<?> objectIdGeneratorNewForSerialization;
        Map<Object, WritableObjectId> map = this._seenObjectIds;
        if (map == null) {
            this._seenObjectIds = _createObjectIdMap();
        } else {
            WritableObjectId writableObjectId = map.get(obj);
            if (writableObjectId != null) {
                return writableObjectId;
            }
        }
        ArrayList<ObjectIdGenerator<?>> arrayList = this._objectIdGenerators;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    objectIdGeneratorNewForSerialization = this._objectIdGenerators.get(i10);
                    if (objectIdGeneratorNewForSerialization.canUseFor(objectIdGenerator)) {
                        break;
                    }
                    i10++;
                }
            }
            if (objectIdGeneratorNewForSerialization == null) {
                objectIdGeneratorNewForSerialization = objectIdGenerator.newForSerialization(this);
                this._objectIdGenerators.add(objectIdGeneratorNewForSerialization);
            }
            WritableObjectId writableObjectId2 = new WritableObjectId(objectIdGeneratorNewForSerialization);
            this._seenObjectIds.put(obj, writableObjectId2);
            return writableObjectId2;
        }
        this._objectIdGenerators = new ArrayList<>(8);
        objectIdGeneratorNewForSerialization = null;
        if (objectIdGeneratorNewForSerialization == null) {
            objectIdGeneratorNewForSerialization = objectIdGenerator.newForSerialization(this);
            this._objectIdGenerators.add(objectIdGeneratorNewForSerialization);
        }
        WritableObjectId writableObjectId3 = new WritableObjectId(objectIdGeneratorNewForSerialization);
        this._seenObjectIds.put(obj, writableObjectId3);
        return writableObjectId3;
    }

    public void flushCachedSerializers() {
        this._serializerCache.flush();
    }

    @Deprecated
    public JsonSchema generateJsonSchema(Class<?> cls) throws JsonMappingException {
        JsonFormatVisitable jsonFormatVisitableFindValueSerializer = findValueSerializer(cls, (BeanProperty) null);
        JsonNode schema = jsonFormatVisitableFindValueSerializer instanceof SchemaAware ? ((SchemaAware) jsonFormatVisitableFindValueSerializer).getSchema(this, null) : JsonSchema.getDefaultSchemaNode();
        if (schema instanceof ObjectNode) {
            return new JsonSchema((ObjectNode) schema);
        }
        throw new IllegalArgumentException(e.e(cls, new StringBuilder("Class "), " would not be serialized as a JSON object and therefore has no schema"));
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public JsonGenerator getGenerator() {
        return this._generator;
    }

    public boolean hasSerializerFor(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls == Object.class && !this._config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            return true;
        }
        try {
            return _findExplicitUntypedSerializer(cls) != null;
        } catch (JsonMappingException e5) {
            if (atomicReference != null) {
                atomicReference.set(e5);
            }
            return false;
        } catch (RuntimeException e7) {
            if (atomicReference == null) {
                throw e7;
            }
            atomicReference.set(e7);
            return false;
        }
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public Object includeFilterInstance(BeanPropertyDefinition beanPropertyDefinition, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
        Object objIncludeFilterInstance = handlerInstantiator != null ? handlerInstantiator.includeFilterInstance(this._config, beanPropertyDefinition, cls) : null;
        return objIncludeFilterInstance == null ? ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : objIncludeFilterInstance;
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Throwable th2) {
            reportBadDefinition(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), th2.getClass().getName(), ClassUtil.exceptionMessage(th2)), th2);
            return false;
        }
    }

    public void serializePolymorphic(JsonGenerator jsonGenerator, Object obj, JavaType javaType, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer) throws IOException {
        boolean zIsEnabled;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (jsonSerializer == null) {
            jsonSerializer = (javaType == null || !javaType.isContainerType()) ? findValueSerializer(obj.getClass(), (BeanProperty) null) : findValueSerializer(javaType, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            zIsEnabled = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (zIsEnabled) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeFieldName(this._config.findRootName(obj.getClass()).simpleAsEncoded(this._config));
            }
        } else if (fullRootName.isEmpty()) {
            zIsEnabled = false;
        } else {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(fullRootName.getSimpleName());
            zIsEnabled = true;
        }
        try {
            jsonSerializer.serializeWithType(obj, jsonGenerator, this, typeSerializer);
            if (zIsEnabled) {
                jsonGenerator.writeEndObject();
            }
        } catch (Exception e5) {
            throw b(jsonGenerator, e5);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = findTypedValueSerializer(cls, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                a(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer, this._config.findRootName(cls));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            a(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer, fullRootName);
            return;
        }
        try {
            jsonSerializerFindTypedValueSerializer.serialize(obj, jsonGenerator, this);
        } catch (Exception e5) {
            throw b(jsonGenerator, e5);
        }
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public JsonSerializer<Object> serializerInstance(Annotated annotated, Object obj) throws JsonMappingException {
        JsonSerializer<?> jsonSerializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonSerializer) {
            jsonSerializer = (JsonSerializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                reportBadDefinition(annotated.getType(), "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == JsonSerializer.None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (!JsonSerializer.class.isAssignableFrom(cls)) {
                reportBadDefinition(annotated.getType(), "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
            JsonSerializer<?> jsonSerializerSerializerInstance = handlerInstantiator != null ? handlerInstantiator.serializerInstance(this._config, annotated, cls) : null;
            jsonSerializer = jsonSerializerSerializerInstance == null ? (JsonSerializer) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : jsonSerializerSerializerInstance;
        }
        return _handleResolvable(jsonSerializer);
    }

    public DefaultSerializerProvider(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
        super(serializerProvider, serializationConfig, serializerFactory);
    }

    public DefaultSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        super(defaultSerializerProvider);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (!javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                a(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer, this._config.findRootName(javaType));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            a(jsonGenerator, obj, jsonSerializerFindTypedValueSerializer, fullRootName);
            return;
        }
        try {
            jsonSerializerFindTypedValueSerializer.serialize(obj, jsonGenerator, this);
        } catch (Exception e5) {
            throw b(jsonGenerator, e5);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType, JsonSerializer<Object> jsonSerializer) throws IOException {
        PropertyName propertyNameFindRootName;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (jsonSerializer == null) {
            jsonSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    propertyNameFindRootName = this._config.findRootName(obj.getClass());
                } else {
                    propertyNameFindRootName = this._config.findRootName(javaType);
                }
                a(jsonGenerator, obj, jsonSerializer, propertyNameFindRootName);
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            a(jsonGenerator, obj, jsonSerializer, fullRootName);
            return;
        }
        try {
            jsonSerializer.serialize(obj, jsonGenerator, this);
        } catch (Exception e5) {
            throw b(jsonGenerator, e5);
        }
    }
}

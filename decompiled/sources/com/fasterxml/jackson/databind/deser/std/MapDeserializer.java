package com.fasterxml.jackson.databind.deser.std;

import androidx.collection.j;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@JacksonStdImpl
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements ContextualDeserializer, ResolvableDeserializer {
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected Set<String> _ignorableProperties;
    protected final KeyDeserializer _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    public static class a extends ReadableObjectId.Referring {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f43259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LinkedHashMap f43260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f43261e;

        public a(b bVar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.f43260d = new LinkedHashMap();
            this.f43259c = bVar;
            this.f43261e = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public final void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            b bVar = this.f43259c;
            Iterator it = bVar.f43264c.iterator();
            Map<Object, Object> map = bVar.f43263b;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                boolean zHasId = aVar.hasId(obj);
                LinkedHashMap linkedHashMap = aVar.f43260d;
                if (zHasId) {
                    it.remove();
                    map.put(aVar.f43261e, obj2);
                    map.putAll(linkedHashMap);
                    return;
                }
                map = linkedHashMap;
            }
            throw new IllegalArgumentException(j.b("Trying to resolve a forward reference with id [", obj, "] that wasn't previously seen as unresolved."));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f43262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<Object, Object> f43263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f43264c = new ArrayList();

        public b(Class<?> cls, Map<Object, Object> map) {
            this.f43262a = cls;
            this.f43263b = map;
        }

        public final void a(Object obj, Object obj2) {
            ArrayList arrayList = this.f43264c;
            if (arrayList.isEmpty()) {
                this.f43263b.put(obj, obj2);
            } else {
                ((a) androidx.appcompat.view.menu.b.b(arrayList, 1)).f43260d.put(obj, obj2);
            }
        }
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, keyDeserializer);
    }

    public Map<Object, Object> _deserializeUsingCreator(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String currentName;
        Object objDeserialize;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer propertyValueBufferStartBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            currentName = jsonParser.hasToken(JsonToken.FIELD_NAME) ? jsonParser.getCurrentName() : null;
        }
        while (currentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(currentName)) {
                SettableBeanProperty settableBeanPropertyFindCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
                if (settableBeanPropertyFindCreatorProperty == null) {
                    Object objDeserializeKey = this._keyDeserializer.deserializeKey(currentName, deserializationContext);
                    try {
                        if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                            objDeserialize = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        } else if (!this._skipNullValues) {
                            objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                        }
                        propertyValueBufferStartBuilding.bufferMapProperty(objDeserializeKey, objDeserialize);
                    } catch (Exception e5) {
                        wrapAndThrow(e5, this._containerType.getRawClass(), currentName);
                        return null;
                    }
                } else if (propertyValueBufferStartBuilding.assignParameter(settableBeanPropertyFindCreatorProperty, settableBeanPropertyFindCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.nextToken();
                    try {
                        Map<Object, Object> map = (Map) propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
                        _readAndBind(jsonParser, deserializationContext, map);
                        return map;
                    } catch (Exception e7) {
                        return (Map) wrapAndThrow(e7, this._containerType.getRawClass(), currentName);
                    }
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
        try {
            return (Map) propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
        } catch (Exception e10) {
            wrapAndThrow(e10, this._containerType.getRawClass(), currentName);
            return null;
        }
    }

    public final boolean _isStdKeyDeser(JavaType javaType, KeyDeserializer keyDeserializer) {
        JavaType keyType;
        if (keyDeserializer == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(keyDeserializer);
    }

    public final void _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String currentName;
        Object objDeserialize;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        boolean z10 = jsonDeserializer.getObjectIdReader() != null;
        b bVar = z10 ? new b(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (currentToken != jsonToken) {
                if (currentToken == JsonToken.END_OBJECT) {
                    return;
                } else {
                    deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                }
            }
            currentName = jsonParser.getCurrentName();
        }
        while (currentName != null) {
            Object objDeserializeKey = keyDeserializer.deserializeKey(currentName, deserializationContext);
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(currentName)) {
                try {
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                        objDeserialize = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!this._skipNullValues) {
                        objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                    }
                    if (z10) {
                        bVar.a(objDeserializeKey, objDeserialize);
                    } else {
                        map.put(objDeserializeKey, objDeserialize);
                    }
                } catch (UnresolvedForwardReference e5) {
                    a(deserializationContext, bVar, objDeserializeKey, e5);
                } catch (Exception e7) {
                    wrapAndThrow(e7, map, currentName);
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
    }

    public final void _readAndBindStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String currentName;
        Object objDeserialize;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        boolean z10 = jsonDeserializer.getObjectIdReader() != null;
        b bVar = z10 ? new b(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (currentToken != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            currentName = jsonParser.getCurrentName();
        }
        while (currentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(currentName)) {
                try {
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                        objDeserialize = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    } else if (!this._skipNullValues) {
                        objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                    }
                    if (z10) {
                        bVar.a(currentName, objDeserialize);
                    } else {
                        map.put(currentName, objDeserialize);
                    }
                } catch (UnresolvedForwardReference e5) {
                    a(deserializationContext, bVar, currentName, e5);
                } catch (Exception e7) {
                    wrapAndThrow(e7, map, currentName);
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
    }

    public final void _readAndUpdate(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String currentName;
        Object objDeserialize;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (currentToken != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            currentName = jsonParser.getCurrentName();
        }
        while (currentName != null) {
            Object objDeserializeKey = keyDeserializer.deserializeKey(currentName, deserializationContext);
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(currentName)) {
                try {
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                        Object obj = map.get(objDeserializeKey);
                        if (obj != null) {
                            objDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext, obj);
                        } else {
                            objDeserialize = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        }
                        if (objDeserialize != obj) {
                            map.put(objDeserializeKey, objDeserialize);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(objDeserializeKey, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e5) {
                    wrapAndThrow(e5, map, currentName);
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
    }

    public final void _readAndUpdateStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String currentName;
        Object objDeserialize;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (currentToken != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            currentName = jsonParser.getCurrentName();
        }
        while (currentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(currentName)) {
                try {
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                        Object obj = map.get(currentName);
                        if (obj != null) {
                            objDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext, obj);
                        } else {
                            objDeserialize = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        }
                        if (objDeserialize != obj) {
                            map.put(currentName, objDeserialize);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(currentName, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e5) {
                    wrapAndThrow(e5, map, currentName);
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
    }

    public final void a(DeserializationContext deserializationContext, b bVar, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        if (bVar == null) {
            deserializationContext.reportInputMismatch(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        }
        a aVar = new a(bVar, unresolvedForwardReference, bVar.f43262a, obj);
        bVar.f43264c.add(aVar);
        unresolvedForwardReference.getRoid().appendReferring(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.fasterxml.jackson.databind.KeyDeserializer] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.MapDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer] */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember member;
        JsonIgnoreProperties.Value valueFindPropertyIgnorals;
        Object objCreateContextual = this._keyDeserializer;
        if (objCreateContextual == null) {
            objCreateContextual = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        } else if (objCreateContextual instanceof ContextualKeyDeserializer) {
            objCreateContextual = ((ContextualKeyDeserializer) objCreateContextual).createContextual(deserializationContext, beanProperty);
        }
        ?? r3 = objCreateContextual;
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = this._valueDeserializer;
        if (beanProperty != null) {
            jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializerFindConvertingContentDeserializer);
        }
        JavaType contentType = this._containerType.getContentType();
        JsonDeserializer<?> jsonDeserializerFindContextualValueDeserializer = jsonDeserializerFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializerForProperty = this._valueTypeDeserializer;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        TypeDeserializer typeDeserializer = typeDeserializerForProperty;
        Set<String> hashSet = this._ignorableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (StdDeserializer._neitherNull(annotationIntrospector, beanProperty) && (member = beanProperty.getMember()) != null && (valueFindPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member)) != null) {
            Set<String> setFindIgnoredForDeserialization = valueFindPropertyIgnorals.findIgnoredForDeserialization();
            if (!setFindIgnoredForDeserialization.isEmpty()) {
                hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                Iterator<String> it = setFindIgnoredForDeserialization.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
        }
        return withResolved(r3, typeDeserializer, jsonDeserializerFindContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerFindContextualValueDeserializer), hashSet);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public final Class<?> getMapClass() {
        return this._containerType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this._standardStringKey = _isStdKeyDeser(this._containerType, this._keyDeserializer);
    }

    public void setIgnorableProperties(String[] strArr) {
        this._ignorableProperties = (strArr == null || strArr.length == 0) ? null : ArrayBuilders.arrayToSet(strArr);
    }

    public MapDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Set<String> set) {
        return (this._keyDeserializer == keyDeserializer && this._valueDeserializer == jsonDeserializer && this._valueTypeDeserializer == typeDeserializer && this._nullProvider == nullValueProvider && this._ignorableProperties == set) ? this : new MapDeserializer(this, keyDeserializer, jsonDeserializer, typeDeserializer, nullValueProvider, set);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (!this._hasDefaultCreator) {
            return (Map) deserializationContext.handleMissingInstantiator(getMapClass(), getValueInstantiator(), jsonParser, "no default constructor found", new Object[0]);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT && currentToken != JsonToken.FIELD_NAME && currentToken != JsonToken.END_OBJECT) {
            if (currentToken == JsonToken.VALUE_STRING) {
                return (Map) this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
            }
            return _deserializeFromEmpty(jsonParser, deserializationContext);
        }
        Map<Object, Object> map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._standardStringKey) {
            _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndBind(jsonParser, deserializationContext, map);
        return map;
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this._ignorableProperties = set;
    }

    public MapDeserializer(MapDeserializer mapDeserializer) {
        super(mapDeserializer);
        this._keyDeserializer = mapDeserializer._keyDeserializer;
        this._valueDeserializer = mapDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapDeserializer._valueTypeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = mapDeserializer._ignorableProperties;
        this._standardStringKey = mapDeserializer._standardStringKey;
    }

    public MapDeserializer(MapDeserializer mapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Set<String> set) {
        super(mapDeserializer, nullValueProvider, mapDeserializer._unwrapSingle);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._standardStringKey = _isStdKeyDeser(this._containerType, keyDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        jsonParser.setCurrentValue(map);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != JsonToken.START_OBJECT && currentToken != JsonToken.FIELD_NAME) {
            return (Map) deserializationContext.handleUnexpectedToken(getMapClass(), jsonParser);
        }
        if (this._standardStringKey) {
            _readAndUpdateStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndUpdate(jsonParser, deserializationContext, map);
        return map;
    }
}

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;

/* JADX INFO: compiled from: FactoryBasedEnumDeserializer.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends StdDeserializer<Object> implements ContextualDeserializer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final JavaType f43298p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f43299q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AnnotatedMethod f43300r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final JsonDeserializer<?> f43301s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ValueInstantiator f43302t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final SettableBeanProperty[] f43303u0;
    public transient PropertyBasedCreator v0;

    public b(Class<?> cls, AnnotatedMethod annotatedMethod, JavaType javaType, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this.f43300r0 = annotatedMethod;
        this.f43299q0 = true;
        this.f43298p0 = javaType.hasRawClass(String.class) ? null : javaType;
        this.f43301s0 = null;
        this.f43302t0 = valueInstantiator;
        this.f43303u0 = settableBeanPropertyArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public final JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JavaType javaType;
        return (this.f43301s0 == null && (javaType = this.f43298p0) != null && this.f43303u0 == null) ? new b(this, (JsonDeserializer<?>) deserializationContext.findContextualValueDeserializer(javaType, beanProperty)) : this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object text;
        AnnotatedMethod annotatedMethod = this.f43300r0;
        boolean z10 = true;
        JsonDeserializer<?> jsonDeserializer = this.f43301s0;
        if (jsonDeserializer != null) {
            text = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            if (!this.f43299q0) {
                jsonParser.skipChildren();
                try {
                    return annotatedMethod.call();
                } catch (Exception e5) {
                    return deserializationContext.handleInstantiationProblem(this._valueClass, null, ClassUtil.throwRootCauseIfIOE(e5));
                }
            }
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING || currentToken == JsonToken.FIELD_NAME) {
                text = jsonParser.getText();
            } else {
                SettableBeanProperty[] settableBeanPropertyArr = this.f43303u0;
                if (settableBeanPropertyArr != null && jsonParser.isExpectedStartObjectToken()) {
                    if (this.v0 == null) {
                        this.v0 = PropertyBasedCreator.construct(deserializationContext, this.f43302t0, settableBeanPropertyArr, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                    }
                    jsonParser.nextToken();
                    PropertyBasedCreator propertyBasedCreator = this.v0;
                    PropertyValueBuffer propertyValueBufferStartBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
                    JsonToken currentToken2 = jsonParser.getCurrentToken();
                    while (currentToken2 == JsonToken.FIELD_NAME) {
                        String currentName = jsonParser.getCurrentName();
                        jsonParser.nextToken();
                        SettableBeanProperty settableBeanPropertyFindCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
                        if (settableBeanPropertyFindCreatorProperty != null) {
                            try {
                                propertyValueBufferStartBuilding.assignParameter(settableBeanPropertyFindCreatorProperty, settableBeanPropertyFindCreatorProperty.deserialize(jsonParser, deserializationContext));
                            } catch (Exception e7) {
                                Class<?> clsHandledType = handledType();
                                String name = settableBeanPropertyFindCreatorProperty.getName();
                                Throwable rootCause = ClassUtil.getRootCause(e7);
                                ClassUtil.throwIfError(rootCause);
                                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                                    z10 = false;
                                }
                                if (rootCause instanceof IOException) {
                                    if (!z10 || !(rootCause instanceof JsonProcessingException)) {
                                        throw ((IOException) rootCause);
                                    }
                                } else if (!z10) {
                                    ClassUtil.throwIfRTE(rootCause);
                                }
                                throw JsonMappingException.wrapWithPath(rootCause, clsHandledType, name);
                            }
                        } else {
                            propertyValueBufferStartBuilding.readIdProperty(currentName);
                        }
                        currentToken2 = jsonParser.nextToken();
                    }
                    return propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
                }
                text = jsonParser.getValueAsString();
            }
        }
        try {
            return annotatedMethod.callOnWith(this._valueClass, text);
        } catch (Exception e10) {
            Throwable thThrowRootCauseIfIOE = ClassUtil.throwRootCauseIfIOE(e10);
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) && (thThrowRootCauseIfIOE instanceof IllegalArgumentException)) {
                return null;
            }
            return deserializationContext.handleInstantiationProblem(this._valueClass, text, thThrowRootCauseIfIOE);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return this.f43301s0 == null ? deserialize(jsonParser, deserializationContext) : typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public b(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this.f43300r0 = annotatedMethod;
        this.f43299q0 = false;
        this.f43298p0 = null;
        this.f43301s0 = null;
        this.f43302t0 = null;
        this.f43303u0 = null;
    }

    public b(b bVar, JsonDeserializer<?> jsonDeserializer) {
        super(bVar._valueClass);
        this.f43298p0 = bVar.f43298p0;
        this.f43300r0 = bVar.f43300r0;
        this.f43299q0 = bVar.f43299q0;
        this.f43302t0 = bVar.f43302t0;
        this.f43303u0 = bVar.f43303u0;
        this.f43301s0 = jsonDeserializer;
    }
}

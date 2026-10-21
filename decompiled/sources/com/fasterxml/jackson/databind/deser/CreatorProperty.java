package com.fasterxml.jackson.databind.deser;

import androidx.camera.core.impl.a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes9.dex */
public class CreatorProperty extends SettableBeanProperty {
    protected final AnnotatedParameter _annotated;
    protected final int _creatorIndex;
    protected SettableBeanProperty _fallbackSetter;
    protected boolean _ignorable;
    protected final Object _injectableValueId;

    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedParameter annotatedParameter, int i10, Object obj, PropertyMetadata propertyMetadata) {
        super(propertyName, javaType, propertyName2, typeDeserializer, annotations, propertyMetadata);
        this._annotated = annotatedParameter;
        this._creatorIndex = i10;
        this._injectableValueId = obj;
        this._fallbackSetter = null;
    }

    public final void a() throws IOException {
        if (this._fallbackSetter != null) {
            return;
        }
        throw InvalidDefinitionException.from((JsonParser) null, "No fallback setter/field defined for creator property '" + getName() + "'", getType());
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        a();
        this._fallbackSetter.set(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        a();
        return this._fallbackSetter.setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    public Object findInjectableValue(DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        if (this._injectableValueId == null) {
            deserializationContext.reportBadDefinition(ClassUtil.classOf(obj), String.format("Property '%s' (type %s) has no injectable value id configured", getName(), getClass().getName()));
        }
        return deserializationContext.findInjectableValue(this._injectableValueId, this, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._fallbackSetter;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedParameter annotatedParameter = this._annotated;
        if (annotatedParameter == null) {
            return null;
        }
        return (A) annotatedParameter.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int getCreatorIndex() {
        return this._creatorIndex;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object getInjectableValueId() {
        return this._injectableValueId;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public void inject(DeserializationContext deserializationContext, Object obj) throws IOException {
        set(obj, findInjectableValue(deserializationContext, obj));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public boolean isIgnorable() {
        return this._ignorable;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void markAsIgnorable() {
        this._ignorable = true;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        a();
        this._fallbackSetter.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        a();
        return this._fallbackSetter.setAndReturn(obj, obj2);
    }

    public void setFallbackSetter(SettableBeanProperty settableBeanProperty) {
        this._fallbackSetter = settableBeanProperty;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public String toString() {
        StringBuilder sb2 = new StringBuilder("[creator property, name '");
        sb2.append(getName());
        sb2.append("'; inject id '");
        return a.e(sb2, this._injectableValueId, "']");
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new CreatorProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new CreatorProperty(this, this._valueDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        JsonDeserializer<?> jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        NullValueProvider nullValueProvider = this._nullProvider;
        if (jsonDeserializer2 == nullValueProvider) {
            nullValueProvider = jsonDeserializer;
        }
        return new CreatorProperty(this, jsonDeserializer, nullValueProvider);
    }

    public CreatorProperty(CreatorProperty creatorProperty, PropertyName propertyName) {
        super(creatorProperty, propertyName);
        this._annotated = creatorProperty._annotated;
        this._injectableValueId = creatorProperty._injectableValueId;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }

    public CreatorProperty(CreatorProperty creatorProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(creatorProperty, jsonDeserializer, nullValueProvider);
        this._annotated = creatorProperty._annotated;
        this._injectableValueId = creatorProperty._injectableValueId;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }
}

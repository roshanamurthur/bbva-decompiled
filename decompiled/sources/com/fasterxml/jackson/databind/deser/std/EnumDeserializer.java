package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
@JacksonStdImpl
public class EnumDeserializer extends StdScalarDeserializer<Object> implements ContextualDeserializer {
    protected final Boolean _caseInsensitive;
    protected Object[] _enumsByIndex;
    protected final CompactStringObjectMap _lookupByName;
    protected CompactStringObjectMap _lookupByToString;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Enum<?> f43254p0;

    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        super(enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this.f43254p0 = enumResolver.getDefaultValue();
        this._caseInsensitive = bool;
    }

    @Deprecated
    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        return deserializerForCreator(deserializationConfig, cls, annotatedMethod, null, null);
    }

    public static JsonDeserializer<?> deserializerForNoArgsCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new b(cls, annotatedMethod);
    }

    public Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.hasToken(JsonToken.START_ARRAY) ? _deserializeFromArray(jsonParser, deserializationContext) : deserializationContext.handleUnexpectedToken(_enumClass(), jsonParser);
    }

    public Class<?> _enumClass() {
        return handledType();
    }

    public CompactStringObjectMap _getToStringLookup(DeserializationContext deserializationContext) {
        CompactStringObjectMap compactStringObjectMapConstructLookup = this._lookupByToString;
        if (compactStringObjectMapConstructLookup == null) {
            synchronized (this) {
                compactStringObjectMapConstructLookup = EnumResolver.constructUnsafeUsingToString(_enumClass(), deserializationContext.getAnnotationIntrospector()).constructLookup();
            }
            this._lookupByToString = compactStringObjectMapConstructLookup;
        }
        return compactStringObjectMapConstructLookup;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (boolFindFormatFeature == null) {
            boolFindFormatFeature = this._caseInsensitive;
        }
        return withResolved(boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        char cCharAt;
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        Object objHandleWeirdStringValue = null;
        Enum<?> r4 = this.f43254p0;
        if (currentToken != jsonToken && currentToken != JsonToken.FIELD_NAME) {
            if (currentToken != JsonToken.VALUE_NUMBER_INT) {
                return _deserializeOther(jsonParser, deserializationContext);
            }
            int intValue = jsonParser.getIntValue();
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(intValue), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            if (intValue >= 0) {
                Object[] objArr = this._enumsByIndex;
                if (intValue < objArr.length) {
                    return objArr[intValue];
                }
            }
            if (r4 != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return r4;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(intValue), "index value outside legal index range [0..%s]", Integer.valueOf(this._enumsByIndex.length - 1));
        }
        CompactStringObjectMap compactStringObjectMap_getToStringLookup = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringLookup(deserializationContext) : this._lookupByName;
        String text = jsonParser.getText();
        Object objFind = compactStringObjectMap_getToStringLookup.find(text);
        if (objFind != null) {
            return objFind;
        }
        String strTrim = text.trim();
        if (strTrim.length() == 0) {
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return getEmptyValue(deserializationContext);
            }
        } else if (Boolean.TRUE.equals(this._caseInsensitive)) {
            Object objFindCaseInsensitive = compactStringObjectMap_getToStringLookup.findCaseInsensitive(strTrim);
            if (objFindCaseInsensitive != null) {
                return objFindCaseInsensitive;
            }
        } else if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && (cCharAt = strTrim.charAt(0)) >= '0' && cCharAt <= '9') {
            try {
                int i10 = Integer.parseInt(strTrim);
                if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                    objHandleWeirdStringValue = deserializationContext.handleWeirdStringValue(_enumClass(), strTrim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                } else if (i10 >= 0) {
                    Object[] objArr2 = this._enumsByIndex;
                    if (i10 < objArr2.length) {
                        objHandleWeirdStringValue = objArr2[i10];
                    }
                }
                return objHandleWeirdStringValue;
            } catch (NumberFormatException unused) {
            }
        }
        if (r4 == null || !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            return !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) ? deserializationContext.handleWeirdStringValue(_enumClass(), strTrim, "value not one of declared Enum instance names: %s", compactStringObjectMap_getToStringLookup.keys()) : objHandleWeirdStringValue;
        }
        return r4;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    public EnumDeserializer withResolved(Boolean bool) {
        return this._caseInsensitive == bool ? this : new EnumDeserializer(this, bool);
    }

    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new b(cls, annotatedMethod, annotatedMethod.getParameterType(0), valueInstantiator, settableBeanPropertyArr);
    }

    public EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        super(enumDeserializer);
        this._lookupByName = enumDeserializer._lookupByName;
        this._enumsByIndex = enumDeserializer._enumsByIndex;
        this.f43254p0 = enumDeserializer.f43254p0;
        this._caseInsensitive = bool;
    }

    @Deprecated
    public EnumDeserializer(EnumResolver enumResolver) {
        this(enumResolver, (Boolean) null);
    }
}

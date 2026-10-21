package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
@JacksonStdImpl
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements ContextualDeserializer {
    protected JsonDeserializer<String> _elementDeserializer;
    protected final NullValueProvider _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String[] f43296p0 = new String[0];
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        int length;
        Object[] objArrResetAndStart;
        String strDeserialize;
        int i10;
        ObjectBuffer objectBufferLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        if (strArr == null) {
            objArrResetAndStart = objectBufferLeaseObjectBuffer.resetAndStart();
            length = 0;
        } else {
            length = strArr.length;
            objArrResetAndStart = objectBufferLeaseObjectBuffer.resetAndStart(strArr, length);
        }
        JsonDeserializer<String> jsonDeserializer = this._elementDeserializer;
        while (true) {
            try {
                try {
                    if (jsonParser.nextTextValue() == null) {
                        JsonToken currentToken = jsonParser.getCurrentToken();
                        if (currentToken == JsonToken.END_ARRAY) {
                            String[] strArr2 = (String[]) objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length, String.class);
                            deserializationContext.returnObjectBuffer(objectBufferLeaseObjectBuffer);
                            return strArr2;
                        }
                        if (currentToken != JsonToken.VALUE_NULL) {
                            strDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                        } else if (!this._skipNullValues) {
                            strDeserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        strDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    }
                    objArrResetAndStart[length] = strDeserialize;
                    length = i10;
                } catch (Exception e5) {
                    e = e5;
                    length = i10;
                    throw JsonMappingException.wrapWithPath(e, String.class, length);
                }
                if (length >= objArrResetAndStart.length) {
                    objArrResetAndStart = objectBufferLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                    length = 0;
                }
                i10 = length + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
    }

    public final String[] a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return new String[]{jsonParser.hasToken(JsonToken.VALUE_NULL) ? (String) this._nullProvider.getNullValue(deserializationContext) : _parseString(jsonParser, deserializationContext)};
        }
        if (jsonParser.hasToken(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
            return null;
        }
        return (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        JavaType javaTypeConstructType = deserializationContext.constructType(String.class);
        JsonDeserializer<?> jsonDeserializerFindContextualValueDeserializer = jsonDeserializerFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(javaTypeConstructType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, javaTypeConstructType);
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        NullValueProvider nullValueProviderFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerFindContextualValueDeserializer);
        if (jsonDeserializerFindContextualValueDeserializer != null && isDefaultDeserializer(jsonDeserializerFindContextualValueDeserializer)) {
            jsonDeserializerFindContextualValueDeserializer = null;
        }
        return (this._elementDeserializer == jsonDeserializerFindContextualValueDeserializer && this._unwrapSingle == boolFindFormatFeature && this._nullProvider == nullValueProviderFindContentNullProvider) ? this : new StringArrayDeserializer(jsonDeserializerFindContextualValueDeserializer, nullValueProviderFindContentNullProvider, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return f43296p0;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringArrayDeserializer(JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super((Class<?>) String[].class);
        this._elementDeserializer = jsonDeserializer;
        this._nullProvider = nullValueProvider;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i10;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return a(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, null);
        }
        ObjectBuffer objectBufferLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrResetAndStart = objectBufferLeaseObjectBuffer.resetAndStart();
        int i11 = 0;
        while (true) {
            try {
                String strNextTextValue = jsonParser.nextTextValue();
                try {
                    if (strNextTextValue == null) {
                        JsonToken currentToken = jsonParser.getCurrentToken();
                        if (currentToken == JsonToken.END_ARRAY) {
                            String[] strArr = (String[]) objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i11, String.class);
                            deserializationContext.returnObjectBuffer(objectBufferLeaseObjectBuffer);
                            return strArr;
                        }
                        if (currentToken == JsonToken.VALUE_NULL) {
                            if (!this._skipNullValues) {
                                strNextTextValue = (String) this._nullProvider.getNullValue(deserializationContext);
                            }
                        } else {
                            strNextTextValue = _parseString(jsonParser, deserializationContext);
                        }
                    }
                    objArrResetAndStart[i11] = strNextTextValue;
                    i11 = i10;
                } catch (Exception e5) {
                    e = e5;
                    i11 = i10;
                    throw JsonMappingException.wrapWithPath(e, objArrResetAndStart, objectBufferLeaseObjectBuffer.bufferedSize() + i11);
                }
                if (i11 >= objArrResetAndStart.length) {
                    objArrResetAndStart = objectBufferLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                    i11 = 0;
                }
                i10 = i11 + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        if (!jsonParser.isExpectedStartArrayToken()) {
            String[] strArrA = a(jsonParser, deserializationContext);
            if (strArrA == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrA.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrA, 0, strArr2, length, strArrA.length);
            return strArr2;
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, strArr);
        }
        ObjectBuffer objectBufferLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = strArr.length;
        Object[] objArrResetAndStart = objectBufferLeaseObjectBuffer.resetAndStart(strArr, length2);
        while (true) {
            try {
                String strNextTextValue = jsonParser.nextTextValue();
                if (strNextTextValue == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr3 = (String[]) objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length2, String.class);
                        deserializationContext.returnObjectBuffer(objectBufferLeaseObjectBuffer);
                        return strArr3;
                    }
                    if (currentToken == JsonToken.VALUE_NULL) {
                        if (this._skipNullValues) {
                            return f43296p0;
                        }
                        strNextTextValue = (String) this._nullProvider.getNullValue(deserializationContext);
                    } else {
                        strNextTextValue = _parseString(jsonParser, deserializationContext);
                    }
                    throw JsonMappingException.wrapWithPath(e, objArrResetAndStart, objectBufferLeaseObjectBuffer.bufferedSize() + length2);
                }
                if (length2 >= objArrResetAndStart.length) {
                    objArrResetAndStart = objectBufferLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                    length2 = 0;
                }
                int i10 = length2 + 1;
                try {
                    objArrResetAndStart[length2] = strNextTextValue;
                    length2 = i10;
                } catch (Exception e5) {
                    e = e5;
                    length2 = i10;
                }
            } catch (Exception e7) {
                e = e7;
            }
        }
    }
}

package com.fasterxml.jackson.databind.deser.std;

import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public class NumberDeserializers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f43265a = new HashSet<>();

    @JacksonStdImpl
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super((Class<?>) BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId != 6) {
                return (currentTokenId == 7 || currentTokenId == 8) ? jsonParser.getDecimalValue() : (BigDecimal) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.getText().trim();
            if (_isEmptyOrTextualNull(strTrim)) {
                _verifyNullForScalarCoercion(deserializationContext, strTrim);
                return getNullValue(deserializationContext);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                return new BigDecimal(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super((Class<?>) BigInteger.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 6) {
                String strTrim = jsonParser.getText().trim();
                if (_isEmptyOrTextualNull(strTrim)) {
                    _verifyNullForScalarCoercion(deserializationContext, strTrim);
                    return getNullValue(deserializationContext);
                }
                _verifyStringForScalarCoercion(deserializationContext, strTrim);
                try {
                    return new BigInteger(strTrim);
                } catch (IllegalArgumentException unused) {
                    return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
                }
            }
            if (currentTokenId == 7) {
                int i10 = a.f43282a[jsonParser.getNumberType().ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return jsonParser.getBigIntegerValue();
                }
            } else if (currentTokenId == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "java.math.BigInteger");
                }
                return jsonParser.getDecimalValue().toBigInteger();
            }
            return (BigInteger) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
    }

    @JacksonStdImpl
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final BooleanDeserializer f43266p0 = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final BooleanDeserializer f43267q0 = new BooleanDeserializer(Boolean.class, null);

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, bool, Boolean.FALSE);
        }

        public final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NULL) {
                return (Boolean) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (currentToken == JsonToken.START_ARRAY) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                return Boolean.valueOf(_parseBooleanFromInt(jsonParser, deserializationContext));
            }
            if (currentToken != JsonToken.VALUE_STRING) {
                if (currentToken == JsonToken.VALUE_TRUE) {
                    return Boolean.TRUE;
                }
                return currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : (Boolean) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.getText().trim();
            if ("true".equals(strTrim) || VDPhotoSelfieCapture.LOG_TAG_TRUE.equals(strTrim)) {
                _verifyStringForScalarCoercion(deserializationContext, strTrim);
                return Boolean.TRUE;
            }
            if ("false".equals(strTrim) || VDPhotoSelfieCapture.LOG_TAG_FALSE.equals(strTrim)) {
                _verifyStringForScalarCoercion(deserializationContext, strTrim);
                return Boolean.FALSE;
            }
            if (strTrim.length() == 0) {
                return (Boolean) _coerceEmptyString(deserializationContext, this._primitive);
            }
            return _hasTextualNull(strTrim) ? (Boolean) _coerceTextualNull(deserializationContext, this._primitive) : (Boolean) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            return currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : _parseBoolean(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            return currentToken == JsonToken.VALUE_FALSE ? Boolean.FALSE : _parseBoolean(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final ByteDeserializer f43268p0 = new ByteDeserializer(Byte.TYPE, (byte) 0);

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final ByteDeserializer f43269q0 = new ByteDeserializer(Byte.class, null);

        public ByteDeserializer(Class<Byte> cls, Byte b10) {
            super(cls, b10, (byte) 0);
        }

        public Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                String strTrim = jsonParser.getText().trim();
                if (_hasTextualNull(strTrim)) {
                    return (Byte) _coerceTextualNull(deserializationContext, this._primitive);
                }
                if (strTrim.length() == 0) {
                    return (Byte) _coerceEmptyString(deserializationContext, this._primitive);
                }
                _verifyStringForScalarCoercion(deserializationContext, strTrim);
                try {
                    int i10 = NumberInput.parseInt(strTrim);
                    return _byteOverflow(i10) ? (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) i10);
                } catch (IllegalArgumentException unused) {
                    return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Byte value", new Object[0]);
                }
            }
            if (currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Byte");
                }
                return Byte.valueOf(jsonParser.getByteValue());
            }
            if (currentToken == JsonToken.VALUE_NULL) {
                return (Byte) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (currentToken == JsonToken.START_ARRAY) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            return currentToken == JsonToken.VALUE_NUMBER_INT ? Byte.valueOf(jsonParser.getByteValue()) : (Byte) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? Byte.valueOf(jsonParser.getByteValue()) : _parseByte(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final CharacterDeserializer f43270p0 = new CharacterDeserializer(Character.TYPE, 0);

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final CharacterDeserializer f43271q0 = new CharacterDeserializer(Character.class, null);

        public CharacterDeserializer(Class<Character> cls, Character ch2) {
            super(cls, ch2, (char) 0);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 11) {
                return (Character) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (currentTokenId == 6) {
                String text = jsonParser.getText();
                if (text.length() == 1) {
                    return Character.valueOf(text.charAt(0));
                }
                if (text.length() == 0) {
                    return (Character) _coerceEmptyString(deserializationContext, this._primitive);
                }
            } else if (currentTokenId == 7) {
                _verifyNumberForScalarCoercion(deserializationContext, jsonParser);
                int intValue = jsonParser.getIntValue();
                if (intValue >= 0 && intValue <= 65535) {
                    return Character.valueOf((char) intValue);
                }
            }
            return (Character) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
    }

    @JacksonStdImpl
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final DoubleDeserializer f43272p0 = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final DoubleDeserializer f43273q0 = new DoubleDeserializer(Double.class, null);

        public DoubleDeserializer(Class<Double> cls, Double d2) {
            super(cls, d2, Double.valueOf(0.0d));
        }

        public final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                return Double.valueOf(jsonParser.getDoubleValue());
            }
            if (currentToken != JsonToken.VALUE_STRING) {
                if (currentToken == JsonToken.VALUE_NULL) {
                    return (Double) _coerceNullToken(deserializationContext, this._primitive);
                }
                return currentToken == JsonToken.START_ARRAY ? _deserializeFromArray(jsonParser, deserializationContext) : (Double) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.getText().trim();
            if (strTrim.length() == 0) {
                return (Double) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Double) _coerceTextualNull(deserializationContext, this._primitive);
            }
            char cCharAt = strTrim.charAt(0);
            if (cCharAt != '-') {
                if (cCharAt != 'I') {
                    if (cCharAt == 'N' && _isNaN(strTrim)) {
                        return Double.valueOf(Double.NaN);
                    }
                } else if (_isPosInf(strTrim)) {
                    return Double.valueOf(Double.POSITIVE_INFINITY);
                }
            } else if (_isNegInf(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                return Double.valueOf(StdDeserializer.parseDouble(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Double value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseDouble(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            return _parseDouble(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final FloatDeserializer f43274p0 = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final FloatDeserializer f43275q0 = new FloatDeserializer(Float.class, null);

        public FloatDeserializer(Class<Float> cls, Float f6) {
            super(cls, f6, Float.valueOf(0.0f));
        }

        public final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_FLOAT || currentToken == JsonToken.VALUE_NUMBER_INT) {
                return Float.valueOf(jsonParser.getFloatValue());
            }
            if (currentToken != JsonToken.VALUE_STRING) {
                if (currentToken == JsonToken.VALUE_NULL) {
                    return (Float) _coerceNullToken(deserializationContext, this._primitive);
                }
                return currentToken == JsonToken.START_ARRAY ? _deserializeFromArray(jsonParser, deserializationContext) : (Float) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.getText().trim();
            if (strTrim.length() == 0) {
                return (Float) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Float) _coerceTextualNull(deserializationContext, this._primitive);
            }
            char cCharAt = strTrim.charAt(0);
            if (cCharAt != '-') {
                if (cCharAt != 'I') {
                    if (cCharAt == 'N' && _isNaN(strTrim)) {
                        return Float.valueOf(Float.NaN);
                    }
                } else if (_isPosInf(strTrim)) {
                    return Float.valueOf(Float.POSITIVE_INFINITY);
                }
            } else if (_isNegInf(strTrim)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                return Float.valueOf(Float.parseFloat(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Float value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseFloat(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final IntegerDeserializer f43276p0 = new IntegerDeserializer(Integer.TYPE, 0);

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final IntegerDeserializer f43277q0 = new IntegerDeserializer(Integer.class, null);

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, num, 0);
        }

        public final Integer _parseInteger(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 11) {
                return (Integer) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (currentTokenId != 6) {
                if (currentTokenId == 7) {
                    return Integer.valueOf(jsonParser.getIntValue());
                }
                if (currentTokenId != 8) {
                    return (Integer) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Integer");
                }
                return Integer.valueOf(jsonParser.getValueAsInt());
            }
            String strTrim = jsonParser.getText().trim();
            int length = strTrim.length();
            if (length == 0) {
                return (Integer) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Integer) _coerceTextualNull(deserializationContext, this._primitive);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                if (length <= 9) {
                    return Integer.valueOf(NumberInput.parseInt(strTrim));
                }
                long j10 = Long.parseLong(strTrim);
                return _intOverflow(j10) ? (Integer) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, String.format("Overflow: numeric value (%s) out of range of Integer (%d - %d)", strTrim, Integer.MIN_VALUE, Integer.MAX_VALUE), new Object[0]) : Integer.valueOf((int) j10);
            } catch (IllegalArgumentException unused) {
                return (Integer) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Integer value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? Integer.valueOf(jsonParser.getIntValue()) : _parseInteger(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? Integer.valueOf(jsonParser.getIntValue()) : _parseInteger(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final LongDeserializer f43278p0 = new LongDeserializer(Long.TYPE, 0L);

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final LongDeserializer f43279q0 = new LongDeserializer(Long.class, null);

        public LongDeserializer(Class<Long> cls, Long l6) {
            super(cls, l6, 0L);
        }

        public final Long _parseLong(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId == 11) {
                return (Long) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (currentTokenId != 6) {
                if (currentTokenId == 7) {
                    return Long.valueOf(jsonParser.getLongValue());
                }
                if (currentTokenId != 8) {
                    return (Long) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Long");
                }
                return Long.valueOf(jsonParser.getValueAsLong());
            }
            String strTrim = jsonParser.getText().trim();
            if (strTrim.length() == 0) {
                return (Long) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Long) _coerceTextualNull(deserializationContext, this._primitive);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                return Long.valueOf(NumberInput.parseLong(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Long) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Long value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? Long.valueOf(jsonParser.getLongValue()) : _parseLong(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer instance = new NumberDeserializer();

        public NumberDeserializer() {
            super((Class<?>) Number.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int currentTokenId = jsonParser.getCurrentTokenId();
            if (currentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId != 6) {
                if (currentTokenId == 7) {
                    return deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
                }
                if (currentTokenId != 8) {
                    return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                return (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) || jsonParser.isNaN()) ? jsonParser.getNumberValue() : jsonParser.getDecimalValue();
            }
            String strTrim = jsonParser.getText().trim();
            if (strTrim.length() == 0) {
                return getNullValue(deserializationContext);
            }
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            if (_isPosInf(strTrim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (_isNegInf(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (_isNaN(strTrim)) {
                return Double.valueOf(Double.NaN);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                if (!_isIntNumber(strTrim)) {
                    return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? new BigDecimal(strTrim) : Double.valueOf(strTrim);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return new BigInteger(strTrim);
                }
                long j10 = Long.parseLong(strTrim);
                return (deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) || j10 > 2147483647L || j10 < -2147483648L) ? Long.valueOf(j10) : Integer.valueOf((int) j10);
            } catch (IllegalArgumentException unused) {
                return deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid number", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            int currentTokenId = jsonParser.getCurrentTokenId();
            return (currentTokenId == 6 || currentTokenId == 7 || currentTokenId == 8) ? deserialize(jsonParser, deserializationContext) : typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        protected final T _emptyValue;
        protected final T _nullValue;
        protected final boolean _primitive;

        public PrimitiveOrWrapperDeserializer(Class<T> cls, T t10, T t11) {
            super((Class<?>) cls);
            this._nullValue = t10;
            this._emptyValue = t11;
            this._primitive = cls.isPrimitive();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return this._emptyValue;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public AccessPattern getNullAccessPattern() {
            if (this._primitive) {
                return AccessPattern.DYNAMIC;
            }
            return this._nullValue == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public final T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", handledType().toString());
            }
            return this._nullValue;
        }
    }

    @JacksonStdImpl
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final ShortDeserializer f43280p0 = new ShortDeserializer(Short.TYPE, 0);

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final ShortDeserializer f43281q0 = new ShortDeserializer(Short.class, null);

        public ShortDeserializer(Class<Short> cls, Short sh2) {
            super(cls, sh2, (short) 0);
        }

        public Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                return Short.valueOf(jsonParser.getShortValue());
            }
            if (currentToken != JsonToken.VALUE_STRING) {
                if (currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                    if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                        _failDoubleToIntCoercion(jsonParser, deserializationContext, "Short");
                    }
                    return Short.valueOf(jsonParser.getShortValue());
                }
                if (currentToken == JsonToken.VALUE_NULL) {
                    return (Short) _coerceNullToken(deserializationContext, this._primitive);
                }
                return currentToken == JsonToken.START_ARRAY ? _deserializeFromArray(jsonParser, deserializationContext) : (Short) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.getText().trim();
            if (strTrim.length() == 0) {
                return (Short) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Short) _coerceTextualNull(deserializationContext, this._primitive);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                int i10 = NumberInput.parseInt(strTrim);
                return _shortOverflow(i10) ? (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) i10);
            } catch (IllegalArgumentException unused) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Short value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseShort(jsonParser, deserializationContext);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43282a;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            f43282a = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43282a[JsonParser.NumberType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43282a[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i10 = 0; i10 < 11; i10++) {
            f43265a.add(clsArr[i10].getName());
        }
    }

    public static JsonDeserializer<?> find(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.f43276p0;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.f43266p0;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.f43278p0;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.f43272p0;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.f43270p0;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.f43268p0;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.f43280p0;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.f43274p0;
            }
        } else {
            if (!f43265a.contains(str)) {
                return null;
            }
            if (cls == Integer.class) {
                return IntegerDeserializer.f43277q0;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.f43267q0;
            }
            if (cls == Long.class) {
                return LongDeserializer.f43279q0;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.f43273q0;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.f43271q0;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.f43269q0;
            }
            if (cls == Short.class) {
                return ShortDeserializer.f43281q0;
            }
            if (cls == Float.class) {
                return FloatDeserializer.f43275q0;
            }
            if (cls == Number.class) {
                return NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.instance;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for ".concat(cls.getName()));
    }
}

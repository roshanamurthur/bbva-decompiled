package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements ContextualDeserializer {
    protected final NullValueProvider _nuller;
    protected final Boolean _unwrapSingle;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient Object f43283p0;

    @JacksonStdImpl
    public static final class a extends PrimitiveArrayDeserializers<boolean[]> {
        public a() {
            super(boolean[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final boolean[] _concat(boolean[] zArr, boolean[] zArr2) {
            boolean[] zArr3 = zArr;
            boolean[] zArr4 = zArr2;
            int length = zArr3.length;
            int length2 = zArr4.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr3, length + length2);
            System.arraycopy(zArr4, 0, zArrCopyOf, length, length2);
            return zArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final boolean[] _constructEmpty() {
            return new boolean[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            boolean z_parseBooleanPrimitive;
            int i10;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.BooleanBuilder booleanBuilder = deserializationContext.getArrayBuilders().getBooleanBuilder();
            boolean[] zArrResetAndStart = booleanBuilder.resetAndStart();
            int i11 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                        return booleanBuilder.completeAndClearBuffer(zArrResetAndStart, i11);
                    }
                    try {
                        if (jsonTokenNextToken == JsonToken.VALUE_TRUE) {
                            z_parseBooleanPrimitive = true;
                        } else {
                            if (jsonTokenNextToken != JsonToken.VALUE_FALSE) {
                                if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                                    NullValueProvider nullValueProvider = this._nuller;
                                    if (nullValueProvider != null) {
                                        nullValueProvider.getNullValue(deserializationContext);
                                    } else {
                                        _verifyNullForPrimitive(deserializationContext);
                                    }
                                } else {
                                    z_parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                                }
                            }
                            z_parseBooleanPrimitive = false;
                        }
                        zArrResetAndStart[i11] = z_parseBooleanPrimitive;
                        i11 = i10;
                    } catch (Exception e5) {
                        e = e5;
                        i11 = i10;
                        throw JsonMappingException.wrapWithPath(e, zArrResetAndStart, booleanBuilder.bufferedSize() + i11);
                    }
                    if (i11 >= zArrResetAndStart.length) {
                        boolean[] zArrAppendCompletedChunk = booleanBuilder.appendCompletedChunk(zArrResetAndStart, i11);
                        i11 = 0;
                        zArrResetAndStart = zArrAppendCompletedChunk;
                    }
                    i10 = i11 + 1;
                } catch (Exception e7) {
                    e = e7;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final boolean[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new a(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class b extends PrimitiveArrayDeserializers<byte[]> {
        public b() {
            super(byte[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final byte[] _concat(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            int length = bArr3.length;
            int length2 = bArr4.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + length2);
            System.arraycopy(bArr4, 0, bArrCopyOf, length, length2);
            return bArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final byte[] _constructEmpty() {
            return new byte[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte byteValue;
            int i10;
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
                } catch (JsonParseException e5) {
                    String originalMessage = e5.getOriginalMessage();
                    if (originalMessage.contains("base64")) {
                        return (byte[]) deserializationContext.handleWeirdStringValue(byte[].class, jsonParser.getText(), originalMessage, new Object[0]);
                    }
                }
            }
            if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object embeddedObject = jsonParser.getEmbeddedObject();
                if (embeddedObject == null) {
                    return null;
                }
                if (embeddedObject instanceof byte[]) {
                    return (byte[]) embeddedObject;
                }
            }
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.ByteBuilder byteBuilder = deserializationContext.getArrayBuilders().getByteBuilder();
            byte[] bArrResetAndStart = byteBuilder.resetAndStart();
            int i11 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                        return byteBuilder.completeAndClearBuffer(bArrResetAndStart, i11);
                    }
                    try {
                        if (jsonTokenNextToken == JsonToken.VALUE_NUMBER_INT || jsonTokenNextToken == JsonToken.VALUE_NUMBER_FLOAT) {
                            byteValue = jsonParser.getByteValue();
                        } else if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this._nuller;
                            if (nullValueProvider != null) {
                                nullValueProvider.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                byteValue = 0;
                            }
                        } else {
                            byteValue = _parseBytePrimitive(jsonParser, deserializationContext);
                        }
                        bArrResetAndStart[i11] = byteValue;
                        i11 = i10;
                    } catch (Exception e7) {
                        e = e7;
                        i11 = i10;
                        throw JsonMappingException.wrapWithPath(e, bArrResetAndStart, byteBuilder.bufferedSize() + i11);
                    }
                    if (i11 >= bArrResetAndStart.length) {
                        byte[] bArrAppendCompletedChunk = byteBuilder.appendCompletedChunk(bArrResetAndStart, i11);
                        i11 = 0;
                        bArrResetAndStart = bArrAppendCompletedChunk;
                    }
                    i10 = i11 + 1;
                } catch (Exception e10) {
                    e = e10;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final byte[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte byteValue;
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_INT || currentToken == JsonToken.VALUE_NUMBER_FLOAT) {
                byteValue = jsonParser.getByteValue();
            } else {
                if (currentToken == JsonToken.VALUE_NULL) {
                    NullValueProvider nullValueProvider = this._nuller;
                    if (nullValueProvider != null) {
                        nullValueProvider.getNullValue(deserializationContext);
                        return (byte[]) getEmptyValue(deserializationContext);
                    }
                    _verifyNullForPrimitive(deserializationContext);
                    return null;
                }
                byteValue = ((Number) deserializationContext.handleUnexpectedToken(this._valueClass.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{byteValue};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new b(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class d extends PrimitiveArrayDeserializers<double[]> {
        public d() {
            super(double[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final double[] _concat(double[] dArr, double[] dArr2) {
            double[] dArr3 = dArr;
            double[] dArr4 = dArr2;
            int length = dArr3.length;
            int length2 = dArr4.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr3, length + length2);
            System.arraycopy(dArr4, 0, dArrCopyOf, length, length2);
            return dArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final double[] _constructEmpty() {
            return new double[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            NullValueProvider nullValueProvider;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.DoubleBuilder doubleBuilder = deserializationContext.getArrayBuilders().getDoubleBuilder();
            double[] dArr = (double[]) doubleBuilder.resetAndStart();
            int i10 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                        return (double[]) doubleBuilder.completeAndClearBuffer(dArr, i10);
                    }
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL || (nullValueProvider = this._nuller) == null) {
                        double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                        if (i10 >= dArr.length) {
                            double[] dArr2 = (double[]) doubleBuilder.appendCompletedChunk(dArr, i10);
                            i10 = 0;
                            dArr = dArr2;
                        }
                        int i11 = i10 + 1;
                        try {
                            dArr[i10] = d_parseDoublePrimitive;
                            i10 = i11;
                        } catch (Exception e5) {
                            e = e5;
                            i10 = i11;
                            throw JsonMappingException.wrapWithPath(e, dArr, doubleBuilder.bufferedSize() + i10);
                        }
                    } else {
                        nullValueProvider.getNullValue(deserializationContext);
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final double[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new d(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class e extends PrimitiveArrayDeserializers<float[]> {
        public e() {
            super(float[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final float[] _concat(float[] fArr, float[] fArr2) {
            float[] fArr3 = fArr;
            float[] fArr4 = fArr2;
            int length = fArr3.length;
            int length2 = fArr4.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr3, length + length2);
            System.arraycopy(fArr4, 0, fArrCopyOf, length, length2);
            return fArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final float[] _constructEmpty() {
            return new float[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            NullValueProvider nullValueProvider;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.FloatBuilder floatBuilder = deserializationContext.getArrayBuilders().getFloatBuilder();
            float[] fArr = (float[]) floatBuilder.resetAndStart();
            int i10 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                        return (float[]) floatBuilder.completeAndClearBuffer(fArr, i10);
                    }
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL || (nullValueProvider = this._nuller) == null) {
                        float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                        if (i10 >= fArr.length) {
                            float[] fArr2 = (float[]) floatBuilder.appendCompletedChunk(fArr, i10);
                            i10 = 0;
                            fArr = fArr2;
                        }
                        int i11 = i10 + 1;
                        try {
                            fArr[i10] = f_parseFloatPrimitive;
                            i10 = i11;
                        } catch (Exception e5) {
                            e = e5;
                            i10 = i11;
                            throw JsonMappingException.wrapWithPath(e, fArr, floatBuilder.bufferedSize() + i10);
                        }
                    } else {
                        nullValueProvider.getNullValue(deserializationContext);
                    }
                } catch (Exception e7) {
                    e = e7;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final float[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new e(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class f extends PrimitiveArrayDeserializers<int[]> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final f f43284q0 = new f();

        public f() {
            super(int[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final int[] _concat(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int length = iArr3.length;
            int length2 = iArr4.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr3, length + length2);
            System.arraycopy(iArr4, 0, iArrCopyOf, length, length2);
            return iArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final int[] _constructEmpty() {
            return new int[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int intValue;
            int i10;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.IntBuilder intBuilder = deserializationContext.getArrayBuilders().getIntBuilder();
            int[] iArr = (int[]) intBuilder.resetAndStart();
            int i11 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                        return (int[]) intBuilder.completeAndClearBuffer(iArr, i11);
                    }
                    try {
                        if (jsonTokenNextToken == JsonToken.VALUE_NUMBER_INT) {
                            intValue = jsonParser.getIntValue();
                        } else if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this._nuller;
                            if (nullValueProvider != null) {
                                nullValueProvider.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                intValue = 0;
                            }
                        } else {
                            intValue = _parseIntPrimitive(jsonParser, deserializationContext);
                        }
                        iArr[i11] = intValue;
                        i11 = i10;
                    } catch (Exception e5) {
                        e = e5;
                        i11 = i10;
                        throw JsonMappingException.wrapWithPath(e, iArr, intBuilder.bufferedSize() + i11);
                    }
                    if (i11 >= iArr.length) {
                        int[] iArr2 = (int[]) intBuilder.appendCompletedChunk(iArr, i11);
                        i11 = 0;
                        iArr = iArr2;
                    }
                    i10 = i11 + 1;
                } catch (Exception e7) {
                    e = e7;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final int[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new f(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class g extends PrimitiveArrayDeserializers<long[]> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final g f43285q0 = new g();

        public g() {
            super(long[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final long[] _concat(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int length = jArr3.length;
            int length2 = jArr4.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr3, length + length2);
            System.arraycopy(jArr4, 0, jArrCopyOf, length, length2);
            return jArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final long[] _constructEmpty() {
            return new long[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            long longValue;
            int i10;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.LongBuilder longBuilder = deserializationContext.getArrayBuilders().getLongBuilder();
            long[] jArr = (long[]) longBuilder.resetAndStart();
            int i11 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                        return (long[]) longBuilder.completeAndClearBuffer(jArr, i11);
                    }
                    try {
                        if (jsonTokenNextToken == JsonToken.VALUE_NUMBER_INT) {
                            longValue = jsonParser.getLongValue();
                        } else if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this._nuller;
                            if (nullValueProvider != null) {
                                nullValueProvider.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                longValue = 0;
                            }
                        } else {
                            longValue = _parseLongPrimitive(jsonParser, deserializationContext);
                        }
                        jArr[i11] = longValue;
                        i11 = i10;
                    } catch (Exception e5) {
                        e = e5;
                        i11 = i10;
                        throw JsonMappingException.wrapWithPath(e, jArr, longBuilder.bufferedSize() + i11);
                    }
                    if (i11 >= jArr.length) {
                        long[] jArr2 = (long[]) longBuilder.appendCompletedChunk(jArr, i11);
                        i11 = 0;
                        jArr = jArr2;
                    }
                    i10 = i11 + 1;
                } catch (Exception e7) {
                    e = e7;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final long[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new g(this, nullValueProvider, bool);
        }
    }

    @JacksonStdImpl
    public static final class h extends PrimitiveArrayDeserializers<short[]> {
        public h() {
            super(short[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final short[] _concat(short[] sArr, short[] sArr2) {
            short[] sArr3 = sArr;
            short[] sArr4 = sArr2;
            int length = sArr3.length;
            int length2 = sArr4.length;
            short[] sArrCopyOf = Arrays.copyOf(sArr3, length + length2);
            System.arraycopy(sArr4, 0, sArrCopyOf, length, length2);
            return sArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final short[] _constructEmpty() {
            return new short[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            short s_parseShortPrimitive;
            int i10;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.ShortBuilder shortBuilder = deserializationContext.getArrayBuilders().getShortBuilder();
            short[] sArrResetAndStart = shortBuilder.resetAndStart();
            int i11 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                        return shortBuilder.completeAndClearBuffer(sArrResetAndStart, i11);
                    }
                    try {
                        if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this._nuller;
                            if (nullValueProvider != null) {
                                nullValueProvider.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                s_parseShortPrimitive = 0;
                            }
                        } else {
                            s_parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                        }
                        sArrResetAndStart[i11] = s_parseShortPrimitive;
                        i11 = i10;
                    } catch (Exception e5) {
                        e = e5;
                        i11 = i10;
                        throw JsonMappingException.wrapWithPath(e, sArrResetAndStart, shortBuilder.bufferedSize() + i11);
                    }
                    if (i11 >= sArrResetAndStart.length) {
                        short[] sArrAppendCompletedChunk = shortBuilder.appendCompletedChunk(sArrResetAndStart, i11);
                        i11 = 0;
                        sArrResetAndStart = sArrAppendCompletedChunk;
                    }
                    i10 = i11 + 1;
                } catch (Exception e7) {
                    e = e7;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final short[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new h(this, nullValueProvider, bool);
        }
    }

    public PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    public static JsonDeserializer<?> forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return f.f43284q0;
        }
        if (cls == Long.TYPE) {
            return g.f43285q0;
        }
        if (cls == Byte.TYPE) {
            return new b();
        }
        if (cls == Short.TYPE) {
            return new h();
        }
        if (cls == Float.TYPE) {
            return new e();
        }
        if (cls == Double.TYPE) {
            return new d();
        }
        if (cls == Boolean.TYPE) {
            return new a();
        }
        if (cls == Character.TYPE) {
            return new c();
        }
        throw new IllegalStateException();
    }

    public abstract T _concat(T t10, T t11);

    public abstract T _constructEmpty();

    public void _failOnNull(DeserializationContext deserializationContext) throws IOException {
        throw InvalidNullException.from(deserializationContext, (PropertyName) null, deserializationContext.constructType(this._valueClass));
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        NullValueProvider nullValueProviderConstructForRootValue;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._valueClass, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Nulls nullsFindContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (nullsFindContentNullStyle == Nulls.SKIP) {
            nullValueProviderConstructForRootValue = NullsConstantProvider.skipper();
        } else if (nullsFindContentNullStyle == Nulls.FAIL) {
            nullValueProviderConstructForRootValue = beanProperty == null ? NullsFailProvider.constructForRootValue(deserializationContext.constructType(this._valueClass)) : NullsFailProvider.constructForProperty(beanProperty);
        } else {
            nullValueProviderConstructForRootValue = null;
        }
        return (boolFindFormatFeature == this._unwrapSingle && nullValueProviderConstructForRootValue == this._nuller) ? this : withResolved(nullValueProviderConstructForRootValue, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t10) throws IOException {
        T tDeserialize = deserialize(jsonParser, deserializationContext);
        return (t10 == null || Array.getLength(t10) == 0) ? tDeserialize : _concat(t10, tDeserialize);
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
        Object obj = this.f43283p0;
        if (obj != null) {
            return obj;
        }
        T t_constructEmpty = _constructEmpty();
        this.f43283p0 = t_constructEmpty;
        return t_constructEmpty;
    }

    public T handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
            return null;
        }
        Boolean bool = this._unwrapSingle;
        return (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) ? handleSingleElementUnwrapped(jsonParser, deserializationContext) : (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public abstract T handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool);

    public PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, NullValueProvider nullValueProvider, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
        this._nuller = nullValueProvider;
    }

    @JacksonStdImpl
    public static final class c extends PrimitiveArrayDeserializers<char[]> {
        public c() {
            super(char[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final char[] _concat(char[] cArr, char[] cArr2) {
            char[] cArr3 = cArr;
            char[] cArr4 = cArr2;
            int length = cArr3.length;
            int length2 = cArr4.length;
            char[] cArrCopyOf = Arrays.copyOf(cArr3, length + length2);
            System.arraycopy(cArr4, 0, cArrCopyOf, length, length2);
            return cArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final char[] _constructEmpty() {
            return new char[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String text;
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                char[] textCharacters = jsonParser.getTextCharacters();
                int textOffset = jsonParser.getTextOffset();
                int textLength = jsonParser.getTextLength();
                char[] cArr = new char[textLength];
                System.arraycopy(textCharacters, textOffset, cArr, 0, textLength);
                return cArr;
            }
            if (!jsonParser.isExpectedStartArrayToken()) {
                if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                    Object embeddedObject = jsonParser.getEmbeddedObject();
                    if (embeddedObject == null) {
                        return null;
                    }
                    if (embeddedObject instanceof char[]) {
                        return (char[]) embeddedObject;
                    }
                    if (embeddedObject instanceof String) {
                        return ((String) embeddedObject).toCharArray();
                    }
                    if (embeddedObject instanceof byte[]) {
                        return Base64Variants.getDefaultVariant().encode((byte[]) embeddedObject, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            StringBuilder sb2 = new StringBuilder(64);
            while (true) {
                JsonToken jsonTokenNextToken = jsonParser.nextToken();
                if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                    return sb2.toString().toCharArray();
                }
                if (jsonTokenNextToken == JsonToken.VALUE_STRING) {
                    text = jsonParser.getText();
                } else if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                    NullValueProvider nullValueProvider = this._nuller;
                    if (nullValueProvider != null) {
                        nullValueProvider.getNullValue(deserializationContext);
                    } else {
                        _verifyNullForPrimitive(deserializationContext);
                        text = "\u0000";
                    }
                } else {
                    text = ((CharSequence) deserializationContext.handleUnexpectedToken(Character.TYPE, jsonParser)).toString();
                }
                if (text.length() != 1) {
                    deserializationContext.reportInputMismatch(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(text.length()));
                }
                sb2.append(text.charAt(0));
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final char[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public final PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return this;
        }
    }
}

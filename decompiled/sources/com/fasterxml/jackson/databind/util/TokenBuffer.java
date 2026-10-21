package com.fasterxml.jackson.databind.util;

import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class TokenBuffer extends JsonGenerator {
    protected static final int DEFAULT_GENERATOR_FEATURES = JsonGenerator.Feature.collectDefaults();
    protected int _appendAt;
    protected boolean _closed;
    protected Segment _first;
    protected boolean _forceBigDecimal;
    protected int _generatorFeatures;
    protected boolean _hasNativeId;
    protected boolean _hasNativeObjectIds;
    protected boolean _hasNativeTypeIds;
    protected Segment _last;
    protected boolean _mayHaveNativeIds;
    protected ObjectCodec _objectCodec;
    protected Object _objectId;
    protected JsonStreamContext _parentContext;
    protected Object _typeId;
    protected JsonWriteContext _writeContext;

    public static final class Parser extends ParserMinimalBase {
        protected transient ByteArrayBuilder _byteBuilder;
        protected boolean _closed;
        protected ObjectCodec _codec;
        protected final boolean _hasNativeIds;
        protected final boolean _hasNativeObjectIds;
        protected final boolean _hasNativeTypeIds;
        protected JsonLocation _location;
        protected TokenBufferReadContext _parsingContext;
        protected Segment _segment;
        protected int _segmentPtr;

        @Deprecated
        public Parser(Segment segment, ObjectCodec objectCodec, boolean z10, boolean z11) {
            this(segment, objectCodec, z10, z11, null);
        }

        public final void _checkIsNumber() throws JsonParseException {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                throw _constructError("Current token (" + this._currToken + ") not numeric, cannot use numeric value accessors");
            }
        }

        public int _convertNumberToInt(Number number) throws IOException {
            if (number instanceof Long) {
                long jLongValue = number.longValue();
                int i10 = (int) jLongValue;
                if (i10 != jLongValue) {
                    reportOverflowInt();
                }
                return i10;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_INT.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(bigInteger) < 0) {
                    reportOverflowInt();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
                        reportOverflowInt();
                    }
                    return (int) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (ParserMinimalBase.BD_MIN_INT.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(bigDecimal) < 0) {
                        reportOverflowInt();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.intValue();
        }

        public long _convertNumberToLong(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_LONG.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(bigInteger) < 0) {
                    reportOverflowLong();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -9.223372036854776E18d || dDoubleValue > 9.223372036854776E18d) {
                        reportOverflowLong();
                    }
                    return (long) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (ParserMinimalBase.BD_MIN_LONG.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(bigDecimal) < 0) {
                        reportOverflowLong();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.longValue();
        }

        public final Object _currentObject() {
            return this._segment.get(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
        public void _handleEOF() throws JsonParseException {
            _throwInternal();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadObjectId() {
            return this._hasNativeObjectIds;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadTypeId() {
            return this._hasNativeTypeIds;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this._closed) {
                return;
            }
            this._closed = true;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigInteger getBigIntegerValue() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigInteger) {
                return (BigInteger) numberValue;
            }
            return getNumberType() == JsonParser.NumberType.BIG_DECIMAL ? ((BigDecimal) numberValue).toBigInteger() : BigInteger.valueOf(numberValue.longValue());
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object obj_currentObject = _currentObject();
                if (obj_currentObject instanceof byte[]) {
                    return (byte[]) obj_currentObject;
                }
            }
            if (this._currToken != JsonToken.VALUE_STRING) {
                throw _constructError("Current token (" + this._currToken + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String text = getText();
            if (text == null) {
                return null;
            }
            ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
            if (byteArrayBuilder == null) {
                byteArrayBuilder = new ByteArrayBuilder(100);
                this._byteBuilder = byteArrayBuilder;
            } else {
                byteArrayBuilder.reset();
            }
            _decodeBase64(text, byteArrayBuilder, base64Variant);
            return byteArrayBuilder.toByteArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public ObjectCodec getCodec() {
            return this._codec;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation getCurrentLocation() {
            JsonLocation jsonLocation = this._location;
            return jsonLocation == null ? JsonLocation.NA : jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public String getCurrentName() {
            JsonToken jsonToken = this._currToken;
            return (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) ? this._parsingContext.getParent().getCurrentName() : this._parsingContext.getCurrentName();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigDecimal getDecimalValue() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            int i10 = a.f43532b[getNumberType().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return new BigDecimal((BigInteger) numberValue);
                }
                if (i10 != 5) {
                    return BigDecimal.valueOf(numberValue.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberValue.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public double getDoubleValue() throws IOException {
            return getNumberValue().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getEmbeddedObject() {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return _currentObject();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public float getFloatValue() throws IOException {
            return getNumberValue().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getIntValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Integer) || (numberValue instanceof Short) || (numberValue instanceof Byte)) ? numberValue.intValue() : _convertNumberToInt(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public long getLongValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Long) || (numberValue instanceof Integer) || (numberValue instanceof Short) || (numberValue instanceof Byte)) ? numberValue.longValue() : _convertNumberToLong(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberType getNumberType() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberValue instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberValue instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberValue instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberValue instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberValue instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberValue instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number getNumberValue() throws IOException {
            _checkIsNumber();
            Object obj_currentObject = _currentObject();
            if (obj_currentObject instanceof Number) {
                return (Number) obj_currentObject;
            }
            if (obj_currentObject instanceof String) {
                String str = (String) obj_currentObject;
                return str.indexOf(46) >= 0 ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
            }
            if (obj_currentObject == null) {
                return null;
            }
            throw new IllegalStateException(androidx.emoji2.text.flatbuffer.a.c(obj_currentObject, "Internal error: entry should be a Number, but is of type "));
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getObjectId() {
            return Segment.a(this._segment, this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public String getText() {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object obj_currentObject = _currentObject();
                return obj_currentObject instanceof String ? (String) obj_currentObject : ClassUtil.nullOrToString(obj_currentObject);
            }
            if (jsonToken == null) {
                return null;
            }
            int i10 = a.f43531a[jsonToken.ordinal()];
            return (i10 == 7 || i10 == 8) ? ClassUtil.nullOrToString(_currentObject()) : this._currToken.asString();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public int getTextOffset() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation getTokenLocation() {
            return getCurrentLocation();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getTypeId() {
            Segment segment = this._segment;
            int i10 = this._segmentPtr;
            TreeMap<Integer, Object> treeMap = segment._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i10 + i10));
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public boolean hasTextCharacters() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public boolean isClosed() {
            return this._closed;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean isNaN() {
            if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object obj_currentObject = _currentObject();
            if (obj_currentObject instanceof Double) {
                Double d2 = (Double) obj_currentObject;
                return d2.isNaN() || d2.isInfinite();
            }
            if (!(obj_currentObject instanceof Float)) {
                return false;
            }
            Float f6 = (Float) obj_currentObject;
            return f6.isNaN() || f6.isInfinite();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String nextFieldName() throws IOException {
            Segment segment;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i10 = this._segmentPtr + 1;
            if (i10 < 16) {
                JsonToken jsonTokenType = segment.type(i10);
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (jsonTokenType == jsonToken) {
                    this._segmentPtr = i10;
                    this._currToken = jsonToken;
                    Object obj = this._segment.get(i10);
                    String string = obj instanceof String ? (String) obj : obj.toString();
                    this._parsingContext.setCurrentName(string);
                    return string;
                }
            }
            if (nextToken() == JsonToken.FIELD_NAME) {
                return getCurrentName();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public JsonToken nextToken() throws IOException {
            Segment segment;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i10 = this._segmentPtr + 1;
            this._segmentPtr = i10;
            if (i10 >= 16) {
                this._segmentPtr = 0;
                Segment next = segment.next();
                this._segment = next;
                if (next == null) {
                    return null;
                }
            }
            JsonToken jsonTokenType = this._segment.type(this._segmentPtr);
            this._currToken = jsonTokenType;
            if (jsonTokenType == JsonToken.FIELD_NAME) {
                Object obj_currentObject = _currentObject();
                this._parsingContext.setCurrentName(obj_currentObject instanceof String ? (String) obj_currentObject : obj_currentObject.toString());
            } else if (jsonTokenType == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext();
            } else if (jsonTokenType == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext();
            } else if (jsonTokenType == JsonToken.END_OBJECT || jsonTokenType == JsonToken.END_ARRAY) {
                this._parsingContext = this._parsingContext.parentOrCopy();
            }
            return this._currToken;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public void overrideCurrentName(String str) {
            JsonStreamContext parent = this._parsingContext;
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
                parent = parent.getParent();
            }
            if (parent instanceof TokenBufferReadContext) {
                try {
                    ((TokenBufferReadContext) parent).setCurrentName(str);
                } catch (IOException e5) {
                    throw new RuntimeException(e5);
                }
            }
        }

        public JsonToken peekNextToken() throws IOException {
            if (this._closed) {
                return null;
            }
            Segment next = this._segment;
            int i10 = this._segmentPtr + 1;
            if (i10 >= 16) {
                next = next == null ? null : next.next();
                i10 = 0;
            }
            if (next == null) {
                return null;
            }
            return next.type(i10);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] binaryValue = getBinaryValue(base64Variant);
            if (binaryValue == null) {
                return 0;
            }
            outputStream.write(binaryValue, 0, binaryValue.length);
            return binaryValue.length;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public void setCodec(ObjectCodec objectCodec) {
            this._codec = objectCodec;
        }

        public void setLocation(JsonLocation jsonLocation) {
            this._location = jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.Versioned
        public Version version() {
            return PackageVersion.VERSION;
        }

        public Parser(Segment segment, ObjectCodec objectCodec, boolean z10, boolean z11, JsonStreamContext jsonStreamContext) {
            super(0);
            this._location = null;
            this._segment = segment;
            this._segmentPtr = -1;
            this._codec = objectCodec;
            this._parsingContext = TokenBufferReadContext.createRootContext(jsonStreamContext);
            this._hasNativeTypeIds = z10;
            this._hasNativeObjectIds = z11;
            this._hasNativeIds = z10 | z11;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43532b;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            f43532b = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43532b[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43532b[JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43532b[JsonParser.NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43532b[JsonParser.NumberType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f43531a = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43531a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43531a[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43531a[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43531a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f43531a[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f43531a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f43531a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f43531a[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f43531a[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f43531a[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f43531a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public TokenBuffer(ObjectCodec objectCodec, boolean z10) {
        this._hasNativeId = false;
        this._objectCodec = objectCodec;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = z10;
        this._hasNativeObjectIds = z10;
        this._mayHaveNativeIds = z10 | z10;
    }

    public static TokenBuffer asCopyOfValue(JsonParser jsonParser) throws IOException {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser);
        tokenBuffer.copyCurrentStructure(jsonParser);
        return tokenBuffer;
    }

    public final void _append(JsonToken jsonToken) {
        Segment segmentAppend = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (segmentAppend == null) {
            this._appendAt++;
        } else {
            this._last = segmentAppend;
            this._appendAt = 1;
        }
    }

    public final void _appendValue(JsonToken jsonToken) {
        this._writeContext.writeValue();
        Segment segmentAppend = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (segmentAppend == null) {
            this._appendAt++;
        } else {
            this._last = segmentAppend;
            this._appendAt = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final void a(StringBuilder sb2) {
        Object objA = Segment.a(this._last, this._appendAt - 1);
        if (objA != null) {
            sb2.append("[objectId=");
            sb2.append(String.valueOf(objA));
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        Segment segment = this._last;
        int i10 = this._appendAt - 1;
        TreeMap<Integer, Object> treeMap = segment._nativeIds;
        Object obj = treeMap == null ? null : treeMap.get(Integer.valueOf(i10 + i10));
        if (obj != null) {
            sb2.append("[typeId=");
            sb2.append(String.valueOf(obj));
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
    }

    public TokenBuffer append(TokenBuffer tokenBuffer) throws IOException {
        if (!this._hasNativeTypeIds) {
            this._hasNativeTypeIds = tokenBuffer.canWriteTypeId();
        }
        if (!this._hasNativeObjectIds) {
            this._hasNativeObjectIds = tokenBuffer.canWriteObjectId();
        }
        this._mayHaveNativeIds = this._hasNativeTypeIds | this._hasNativeObjectIds;
        JsonParser jsonParserAsParser = tokenBuffer.asParser();
        while (jsonParserAsParser.nextToken() != null) {
            copyCurrentStructure(jsonParserAsParser);
        }
        return this;
    }

    public JsonParser asParser() {
        return asParser(this._objectCodec);
    }

    public JsonParser asParserOnFirstToken() throws IOException {
        JsonParser jsonParserAsParser = asParser(this._objectCodec);
        jsonParserAsParser.nextToken();
        return jsonParserAsParser;
    }

    public final void b(JsonParser jsonParser) throws IOException {
        Object typeId = jsonParser.getTypeId();
        this._typeId = typeId;
        if (typeId != null) {
            this._hasNativeId = true;
        }
        Object objectId = jsonParser.getObjectId();
        this._objectId = objectId;
        if (objectId != null) {
            this._hasNativeId = true;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteBinaryNatively() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteObjectId() {
        return this._hasNativeObjectIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteTypeId() {
        return this._hasNativeTypeIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._closed = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        if (this._mayHaveNativeIds) {
            b(jsonParser);
        }
        switch (a.f43531a[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                int i10 = a.f43532b[jsonParser.getNumberType().ordinal()];
                if (i10 == 1) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (i10 != 2) {
                    writeNumber(jsonParser.getLongValue());
                    return;
                } else {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                }
            case 8:
                if (this._forceBigDecimal) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                }
                int i11 = a.f43532b[jsonParser.getNumberType().ordinal()];
                if (i11 == 3) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (i11 != 4) {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                } else {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: should never end up through this code path");
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            if (this._mayHaveNativeIds) {
                b(jsonParser);
            }
            writeFieldName(jsonParser.getCurrentName());
            currentToken = jsonParser.nextToken();
        }
        if (this._mayHaveNativeIds) {
            b(jsonParser);
        }
        int i10 = a.f43531a[currentToken.ordinal()];
        if (i10 == 1) {
            writeStartObject();
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                copyCurrentStructure(jsonParser);
            }
            writeEndObject();
            return;
        }
        if (i10 != 3) {
            copyCurrentEvent(jsonParser);
            return;
        }
        writeStartArray();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            copyCurrentStructure(jsonParser);
        }
        writeEndArray();
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenNextToken;
        if (jsonParser.getCurrentTokenId() != JsonToken.FIELD_NAME.id()) {
            copyCurrentStructure(jsonParser);
            return this;
        }
        writeStartObject();
        do {
            copyCurrentStructure(jsonParser);
            jsonTokenNextToken = jsonParser.nextToken();
        } while (jsonTokenNextToken == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (jsonTokenNextToken != jsonToken) {
            deserializationContext.reportWrongTokenException(TokenBuffer.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + jsonTokenNextToken, new Object[0]);
        }
        writeEndObject();
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonToken firstToken() {
        return this._first.type(0);
    }

    public TokenBuffer forceUseOfBigDecimal(boolean z10) {
        this._forceBigDecimal = z10;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getFeatureMask() {
        return this._generatorFeatures;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isClosed() {
        return this._closed;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public TokenBuffer overrideParentContext(JsonStreamContext jsonStreamContext) {
        this._parentContext = jsonStreamContext;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i10, int i11) {
        this._generatorFeatures = (i10 & i11) | (getFeatureMask() & (~i11));
        return this;
    }

    public void serialize(JsonGenerator jsonGenerator) throws IOException {
        Segment next = this._first;
        boolean z10 = this._mayHaveNativeIds;
        boolean z11 = z10 && next.hasIds();
        int i10 = -1;
        while (true) {
            i10++;
            if (i10 >= 16) {
                next = next.next();
                if (next == null) {
                    return;
                }
                z11 = z10 && next.hasIds();
                i10 = 0;
            }
            JsonToken jsonTokenType = next.type(i10);
            if (jsonTokenType == null) {
                return;
            }
            if (z11) {
                Object objA = Segment.a(next, i10);
                if (objA != null) {
                    jsonGenerator.writeObjectId(objA);
                }
                TreeMap<Integer, Object> treeMap = next._nativeIds;
                Object obj = treeMap == null ? null : treeMap.get(Integer.valueOf(i10 + i10));
                if (obj != null) {
                    jsonGenerator.writeTypeId(obj);
                }
            }
            switch (a.f43531a[jsonTokenType.ordinal()]) {
                case 1:
                    jsonGenerator.writeStartObject();
                    break;
                case 2:
                    jsonGenerator.writeEndObject();
                    break;
                case 3:
                    jsonGenerator.writeStartArray();
                    break;
                case 4:
                    jsonGenerator.writeEndArray();
                    break;
                case 5:
                    Object obj2 = next.get(i10);
                    if (!(obj2 instanceof SerializableString)) {
                        jsonGenerator.writeFieldName((String) obj2);
                    } else {
                        jsonGenerator.writeFieldName((SerializableString) obj2);
                    }
                    break;
                case 6:
                    Object obj3 = next.get(i10);
                    if (!(obj3 instanceof SerializableString)) {
                        jsonGenerator.writeString((String) obj3);
                    } else {
                        jsonGenerator.writeString((SerializableString) obj3);
                    }
                    break;
                case 7:
                    Object obj4 = next.get(i10);
                    if (obj4 instanceof Integer) {
                        jsonGenerator.writeNumber(((Integer) obj4).intValue());
                    } else if (obj4 instanceof BigInteger) {
                        jsonGenerator.writeNumber((BigInteger) obj4);
                    } else if (obj4 instanceof Long) {
                        jsonGenerator.writeNumber(((Long) obj4).longValue());
                    } else if (!(obj4 instanceof Short)) {
                        jsonGenerator.writeNumber(((Number) obj4).intValue());
                    } else {
                        jsonGenerator.writeNumber(((Short) obj4).shortValue());
                    }
                    break;
                case 8:
                    Object obj5 = next.get(i10);
                    if (obj5 instanceof Double) {
                        jsonGenerator.writeNumber(((Double) obj5).doubleValue());
                    } else if (obj5 instanceof BigDecimal) {
                        jsonGenerator.writeNumber((BigDecimal) obj5);
                    } else if (obj5 instanceof Float) {
                        jsonGenerator.writeNumber(((Float) obj5).floatValue());
                    } else if (obj5 == null) {
                        jsonGenerator.writeNull();
                    } else {
                        if (!(obj5 instanceof String)) {
                            throw new JsonGenerationException(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", obj5.getClass().getName()), jsonGenerator);
                        }
                        jsonGenerator.writeNumber((String) obj5);
                    }
                    break;
                case 9:
                    jsonGenerator.writeBoolean(true);
                    break;
                case 10:
                    jsonGenerator.writeBoolean(false);
                    break;
                case 11:
                    jsonGenerator.writeNull();
                    break;
                case 12:
                    Object obj6 = next.get(i10);
                    if (obj6 instanceof RawValue) {
                        ((RawValue) obj6).serialize(jsonGenerator);
                    } else if (!(obj6 instanceof JsonSerializable)) {
                        jsonGenerator.writeEmbeddedObject(obj6);
                    } else {
                        jsonGenerator.writeObject(obj6);
                    }
                    break;
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator setFeatureMask(int i10) {
        this._generatorFeatures = i10;
        return this;
    }

    public String toString() {
        StringBuilder sbD = c.d("[TokenBuffer: ");
        JsonParser jsonParserAsParser = asParser();
        int i10 = 0;
        boolean z10 = this._hasNativeTypeIds || this._hasNativeObjectIds;
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParserAsParser.nextToken();
                if (jsonTokenNextToken == null) {
                    break;
                }
                if (z10) {
                    a(sbD);
                }
                if (i10 < 100) {
                    if (i10 > 0) {
                        sbD.append(", ");
                    }
                    sbD.append(jsonTokenNextToken.toString());
                    if (jsonTokenNextToken == JsonToken.FIELD_NAME) {
                        sbD.append(RootService.OPEN_BRACKET);
                        sbD.append(jsonParserAsParser.getCurrentName());
                        sbD.append(RootService.CLOSE_BRACKET);
                    }
                }
                i10++;
            } catch (IOException e5) {
                throw new IllegalStateException(e5);
            }
        }
        if (i10 >= 100) {
            sbD.append(" ... (truncated ");
            sbD.append(i10 - 100);
            sbD.append(" entries)");
        }
        sbD.append(AbstractJsonLexerKt.END_LIST);
        return sbD.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        writeObject(bArr2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z10) throws IOException {
        _appendValue(z10 ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEmbeddedObject(Object obj) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        _append(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        _append(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeFieldName(String str) throws IOException {
        this._writeContext.writeFieldName(str);
        _append(JsonToken.FIELD_NAME, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _appendValue(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s4) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s4));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            objectCodec.writeValue(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObjectId(Object obj) {
        this._objectId = obj;
        this._hasNativeId = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        this._writeContext.writeValue();
        _append(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        this._writeContext.writeValue();
        _append(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        if (str == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTree(TreeNode treeNode) throws IOException {
        if (treeNode == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, treeNode);
        } else {
            objectCodec.writeTree(this, treeNode);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTypeId(Object obj) {
        this._typeId = obj;
        this._hasNativeId = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        _reportUnsupportedOperation();
    }

    public JsonParser asParser(ObjectCodec objectCodec) {
        return new Parser(this._first, objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i10) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i10));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i10, int i11) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str, int i10, int i11) throws IOException {
        if (i10 > 0 || i11 != str.length()) {
            str = str.substring(i10, i11 + i10);
        }
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    public JsonParser asParser(JsonParser jsonParser) {
        Parser parser = new Parser(this._first, jsonParser.getCodec(), this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
        parser.setLocation(jsonParser.getTokenLocation());
        return parser;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        this._writeContext.writeFieldName(serializableString.getValue());
        _append(JsonToken.FIELD_NAME, serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j10) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j10));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i10, int i11) throws IOException {
        writeString(new String(cArr, i10, i11));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d2) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i10, int i11) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        this._writeContext.writeValue();
        _append(JsonToken.START_OBJECT);
        JsonWriteContext jsonWriteContextCreateChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = jsonWriteContextCreateChildObjectContext;
        if (obj != null) {
            jsonWriteContextCreateChildObjectContext.setCurrentValue(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        if (serializableString == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f6) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f6));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c10) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(char[] cArr, int i10, int i11) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new String(cArr, i10, i11));
    }

    public static final class Segment {
        public static final int TOKENS_PER_SEGMENT = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JsonToken[] f43530a;
        protected TreeMap<Integer, Object> _nativeIds;
        protected Segment _next;
        protected long _tokenTypes;
        protected final Object[] _tokens = new Object[16];

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            f43530a = jsonTokenArr;
            JsonToken[] jsonTokenArrValues = JsonToken.values();
            System.arraycopy(jsonTokenArrValues, 1, jsonTokenArr, 1, Math.min(15, jsonTokenArrValues.length - 1));
        }

        public static Object a(Segment segment, int i10) {
            TreeMap<Integer, Object> treeMap = segment._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i10 + i10 + 1));
        }

        public Segment append(int i10, JsonToken jsonToken) {
            if (i10 >= 16) {
                Segment segment = new Segment();
                this._next = segment;
                segment._tokenTypes = ((long) jsonToken.ordinal()) | segment._tokenTypes;
                return this._next;
            }
            long jOrdinal = jsonToken.ordinal();
            if (i10 > 0) {
                jOrdinal <<= i10 << 2;
            }
            this._tokenTypes |= jOrdinal;
            return null;
        }

        public final void b(int i10, Object obj, Object obj2) {
            if (this._nativeIds == null) {
                this._nativeIds = new TreeMap<>();
            }
            if (obj != null) {
                this._nativeIds.put(Integer.valueOf(i10 + i10 + 1), obj);
            }
            if (obj2 != null) {
                this._nativeIds.put(Integer.valueOf(i10 + i10), obj2);
            }
        }

        public Object get(int i10) {
            return this._tokens[i10];
        }

        public boolean hasIds() {
            return this._nativeIds != null;
        }

        public Segment next() {
            return this._next;
        }

        public int rawType(int i10) {
            long j10 = this._tokenTypes;
            if (i10 > 0) {
                j10 >>= i10 << 2;
            }
            return ((int) j10) & 15;
        }

        public JsonToken type(int i10) {
            long j10 = this._tokenTypes;
            if (i10 > 0) {
                j10 >>= i10 << 2;
            }
            return f43530a[((int) j10) & 15];
        }

        public Segment append(int i10, JsonToken jsonToken, Object obj, Object obj2) {
            if (i10 < 16) {
                long jOrdinal = jsonToken.ordinal();
                if (i10 > 0) {
                    jOrdinal <<= i10 << 2;
                }
                this._tokenTypes = jOrdinal | this._tokenTypes;
                b(i10, obj, obj2);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment._tokenTypes = ((long) jsonToken.ordinal()) | segment._tokenTypes;
            segment.b(0, obj, obj2);
            return this._next;
        }

        public Segment append(int i10, JsonToken jsonToken, Object obj) {
            if (i10 < 16) {
                this._tokens[i10] = obj;
                long jOrdinal = jsonToken.ordinal();
                if (i10 > 0) {
                    jOrdinal <<= i10 << 2;
                }
                this._tokenTypes |= jOrdinal;
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment._tokens[0] = obj;
            segment._tokenTypes = ((long) jsonToken.ordinal()) | segment._tokenTypes;
            return this._next;
        }

        public Segment append(int i10, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i10 < 16) {
                this._tokens[i10] = obj;
                long jOrdinal = jsonToken.ordinal();
                if (i10 > 0) {
                    jOrdinal <<= i10 << 2;
                }
                this._tokenTypes = jOrdinal | this._tokenTypes;
                b(i10, obj2, obj3);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment._tokens[0] = obj;
            segment._tokenTypes = ((long) jsonToken.ordinal()) | segment._tokenTypes;
            segment.b(0, obj2, obj3);
            return this._next;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public final void _append(JsonToken jsonToken, Object obj) {
        Segment segmentAppend;
        if (this._hasNativeId) {
            segmentAppend = this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId);
        } else {
            segmentAppend = this._last.append(this._appendAt, jsonToken, obj);
        }
        if (segmentAppend == null) {
            this._appendAt++;
        } else {
            this._last = segmentAppend;
            this._appendAt = 1;
        }
    }

    public final void _appendValue(JsonToken jsonToken, Object obj) {
        Segment segmentAppend;
        this._writeContext.writeValue();
        if (this._hasNativeId) {
            segmentAppend = this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId);
        } else {
            segmentAppend = this._last.append(this._appendAt, jsonToken, obj);
        }
        if (segmentAppend == null) {
            this._appendAt++;
        } else {
            this._last = segmentAppend;
            this._appendAt = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    public TokenBuffer(JsonParser jsonParser) {
        this(jsonParser, (DeserializationContext) null);
    }

    public TokenBuffer(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this._hasNativeId = false;
        this._objectCodec = jsonParser.getCodec();
        this._parentContext = jsonParser.getParsingContext();
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = jsonParser.canReadTypeId();
        boolean zCanReadObjectId = jsonParser.canReadObjectId();
        this._hasNativeObjectIds = zCanReadObjectId;
        this._mayHaveNativeIds = zCanReadObjectId | this._hasNativeTypeIds;
        this._forceBigDecimal = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator useDefaultPrettyPrinter() {
        return this;
    }
}

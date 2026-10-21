package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public abstract class JsonGenerator implements Closeable, Flushable, Versioned {
    protected PrettyPrinter _cfgPrettyPrinter;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        ESCAPE_NON_ASCII(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z10) {
            this._defaultState = z10;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i10) {
            return (i10 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43036a;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            f43036a = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43036a[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43036a[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43036a[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43036a[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public void _reportError(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Operation not supported by generator of type ".concat(getClass().getName()));
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public final void _verifyOffsets(int i10, int i11, int i12) {
        if (i11 < 0 || i11 + i12 > i10) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)));
        }
    }

    public void _writeSimpleObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long) {
                writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double) {
                writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                writeNumber(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                writeNumber(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                writeNumber(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                writeNumber((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                writeNumber((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                writeNumber(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                writeNumber(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            writeBoolean(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteFormattedNumbers() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public final JsonGenerator configure(Feature feature, boolean z10) {
        if (z10) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == null) {
            _reportError("No current event to copy");
        }
        switch (jsonTokenCurrentToken.id()) {
            case -1:
                _reportError("No current event to copy");
                break;
            case 0:
            default:
                _throwInternal();
                break;
            case 1:
                writeStartObject();
                break;
            case 2:
                writeEndObject();
                break;
            case 3:
                writeStartArray();
                break;
            case 4:
                writeEndArray();
                break;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                break;
            case 6:
                if (!jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getText());
                } else {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                }
                break;
            case 7:
                JsonParser.NumberType numberType = jsonParser.getNumberType();
                if (numberType == JsonParser.NumberType.INT) {
                    writeNumber(jsonParser.getIntValue());
                } else if (numberType != JsonParser.NumberType.BIG_INTEGER) {
                    writeNumber(jsonParser.getLongValue());
                } else {
                    writeNumber(jsonParser.getBigIntegerValue());
                }
                break;
            case 8:
                JsonParser.NumberType numberType2 = jsonParser.getNumberType();
                if (numberType2 == JsonParser.NumberType.BIG_DECIMAL) {
                    writeNumber(jsonParser.getDecimalValue());
                } else if (numberType2 != JsonParser.NumberType.FLOAT) {
                    writeNumber(jsonParser.getDoubleValue());
                } else {
                    writeNumber(jsonParser.getFloatValue());
                }
                break;
            case 9:
                writeBoolean(true);
                break;
            case 10:
                writeBoolean(false);
                break;
            case 11:
                writeNull();
                break;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                break;
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == null) {
            _reportError("No current event to copy");
        }
        int iId = jsonTokenCurrentToken.id();
        if (iId == 5) {
            writeFieldName(jsonParser.getCurrentName());
            iId = jsonParser.nextToken().id();
        }
        if (iId == 1) {
            writeStartObject();
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                copyCurrentStructure(jsonParser);
            }
            writeEndObject();
            return;
        }
        if (iId != 3) {
            copyCurrentEvent(jsonParser);
            return;
        }
        writeStartArray();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            copyCurrentStructure(jsonParser);
        }
        writeEndArray();
    }

    public abstract JsonGenerator disable(Feature feature);

    public abstract JsonGenerator enable(Feature feature);

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    public CharacterEscapes getCharacterEscapes() {
        return null;
    }

    public abstract ObjectCodec getCodec();

    public Object getCurrentValue() {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext == null) {
            return null;
        }
        return outputContext.getCurrentValue();
    }

    public abstract int getFeatureMask();

    public int getFormatFeatures() {
        return 0;
    }

    public int getHighestEscapedChar() {
        return 0;
    }

    public int getOutputBuffered() {
        return -1;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public FormatSchema getSchema() {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    public JsonGenerator overrideFormatFeatures(int i10, int i11) {
        throw new IllegalArgumentException("No FormatFeatures defined for generator of type ".concat(getClass().getName()));
    }

    public JsonGenerator overrideStdFeatures(int i10, int i11) {
        return setFeatureMask((i10 & i11) | (getFeatureMask() & (~i11)));
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectCodec);

    public void setCurrentValue(Object obj) {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public abstract JsonGenerator setFeatureMask(int i10);

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException("Generator of type " + getClass().getName() + " does not support schema of type '" + formatSchema.getSchemaType() + "'");
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    @Override // com.fasterxml.jackson.core.Versioned
    public abstract Version version();

    public void writeArray(int[] iArr, int i10, int i11) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(iArr.length, i10, i11);
        writeStartArray();
        int i12 = i11 + i10;
        while (i10 < i12) {
            writeNumber(iArr[i10]);
            i10++;
        }
        writeEndArray();
    }

    public final void writeArrayFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartArray();
    }

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) throws IOException;

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) throws IOException;

    public void writeBinary(byte[] bArr, int i10, int i11) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i10, i11);
    }

    public final void writeBinaryField(String str, byte[] bArr) throws IOException {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public abstract void writeBoolean(boolean z10) throws IOException;

    public final void writeBooleanField(String str, boolean z10) throws IOException {
        writeFieldName(str);
        writeBoolean(z10);
    }

    public void writeEmbeddedObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
        } else {
            if (!(obj instanceof byte[])) {
                throw new JsonGenerationException(androidx.emoji2.text.flatbuffer.a.c(obj, "No native support for writing embedded objects of type "), this);
            }
            writeBinary((byte[]) obj);
        }
    }

    public abstract void writeEndArray() throws IOException;

    public abstract void writeEndObject() throws IOException;

    public void writeFieldId(long j10) throws IOException {
        writeFieldName(Long.toString(j10));
    }

    public abstract void writeFieldName(SerializableString serializableString) throws IOException;

    public abstract void writeFieldName(String str) throws IOException;

    public abstract void writeNull() throws IOException;

    public final void writeNullField(String str) throws IOException {
        writeFieldName(str);
        writeNull();
    }

    public abstract void writeNumber(double d2) throws IOException;

    public abstract void writeNumber(float f6) throws IOException;

    public abstract void writeNumber(int i10) throws IOException;

    public abstract void writeNumber(long j10) throws IOException;

    public abstract void writeNumber(String str) throws IOException;

    public abstract void writeNumber(BigDecimal bigDecimal) throws IOException;

    public abstract void writeNumber(BigInteger bigInteger) throws IOException;

    public void writeNumber(short s4) throws IOException {
        writeNumber((int) s4);
    }

    public final void writeNumberField(String str, int i10) throws IOException {
        writeFieldName(str);
        writeNumber(i10);
    }

    public abstract void writeObject(Object obj) throws IOException;

    public final void writeObjectField(String str, Object obj) throws IOException {
        writeFieldName(str);
        writeObject(obj);
    }

    public final void writeObjectFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartObject();
    }

    public void writeObjectId(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public abstract void writeRaw(char c10) throws IOException;

    public void writeRaw(SerializableString serializableString) throws IOException {
        writeRaw(serializableString.getValue());
    }

    public abstract void writeRaw(String str) throws IOException;

    public abstract void writeRaw(String str, int i10, int i11) throws IOException;

    public abstract void writeRaw(char[] cArr, int i10, int i11) throws IOException;

    public abstract void writeRawUTF8String(byte[] bArr, int i10, int i11) throws IOException;

    public void writeRawValue(SerializableString serializableString) throws IOException {
        writeRawValue(serializableString.getValue());
    }

    public abstract void writeRawValue(String str) throws IOException;

    public abstract void writeRawValue(String str, int i10, int i11) throws IOException;

    public abstract void writeRawValue(char[] cArr, int i10, int i11) throws IOException;

    public abstract void writeStartArray() throws IOException;

    public void writeStartArray(int i10) throws IOException {
        writeStartArray();
    }

    public abstract void writeStartObject() throws IOException;

    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        setCurrentValue(obj);
    }

    public abstract void writeString(SerializableString serializableString) throws IOException;

    public void writeString(Reader reader, int i10) throws IOException {
        _reportUnsupportedOperation();
    }

    public abstract void writeString(String str) throws IOException;

    public abstract void writeString(char[] cArr, int i10, int i11) throws IOException;

    public void writeStringField(String str, String str2) throws IOException {
        writeFieldName(str);
        writeString(str2);
    }

    public abstract void writeTree(TreeNode treeNode) throws IOException;

    public void writeTypeId(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public WritableTypeId writeTypePrefix(WritableTypeId writableTypeId) throws IOException {
        Object obj = writableTypeId.id;
        JsonToken jsonToken = writableTypeId.valueShape;
        if (canWriteTypeId()) {
            writableTypeId.wrapperWritten = false;
            writeTypeId(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.wrapperWritten = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.include;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.include = inclusion;
            }
            int i10 = a.f43036a[inclusion.ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    writeStartObject(writableTypeId.forValue);
                    writeStringField(writableTypeId.asProperty, strValueOf);
                    return writableTypeId;
                }
                if (i10 != 4) {
                    writeStartArray();
                    writeString(strValueOf);
                } else {
                    writeStartObject();
                    writeFieldName(strValueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            writeStartObject(writableTypeId.forValue);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeStartArray();
        }
        return writableTypeId;
    }

    public WritableTypeId writeTypeSuffix(WritableTypeId writableTypeId) throws IOException {
        JsonToken jsonToken = writableTypeId.valueShape;
        if (jsonToken == JsonToken.START_OBJECT) {
            writeEndObject();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeEndArray();
        }
        if (writableTypeId.wrapperWritten) {
            int i10 = a.f43036a[writableTypeId.include.ordinal()];
            if (i10 == 1) {
                Object obj = writableTypeId.id;
                writeStringField(writableTypeId.asProperty, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i10 != 2 && i10 != 3) {
                if (i10 != 5) {
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        return writableTypeId;
    }

    public abstract void writeUTF8String(byte[] bArr, int i10, int i11) throws IOException;

    public void writeBinary(byte[] bArr) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public int writeBinary(InputStream inputStream, int i10) throws IOException {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i10);
    }

    public final void writeNumberField(String str, long j10) throws IOException {
        writeFieldName(str);
        writeNumber(j10);
    }

    public final void writeNumberField(String str, double d2) throws IOException {
        writeFieldName(str);
        writeNumber(d2);
    }

    public void writeArray(long[] jArr, int i10, int i11) throws IOException {
        if (jArr != null) {
            _verifyOffsets(jArr.length, i10, i11);
            writeStartArray();
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeNumber(jArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public final void writeNumberField(String str, float f6) throws IOException {
        writeFieldName(str);
        writeNumber(f6);
    }

    public final void writeNumberField(String str, BigDecimal bigDecimal) throws IOException {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public void writeArray(double[] dArr, int i10, int i11) throws IOException {
        if (dArr != null) {
            _verifyOffsets(dArr.length, i10, i11);
            writeStartArray();
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeNumber(dArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public JsonGenerator setHighestNonEscapedChar(int i10) {
        return this;
    }

    public void writeOmittedField(String str) throws IOException {
    }
}

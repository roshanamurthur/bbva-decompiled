package com.fasterxml.jackson.core.json;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class UTF8JsonGenerator extends JsonGeneratorImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final byte[] f43084p0 = CharTypes.copyHexBytes();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final byte[] f43085q0 = {110, 117, 108, 108};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final byte[] f43086r0 = {116, 114, 117, 101};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final byte[] f43087s0 = {102, Constants.DIRECTORY_ENTRY, 108, 115, 101};
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _entityBuffer;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar;

    public UTF8JsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, OutputStream outputStream) {
        super(iOContext, i10, objectCodec);
        this._quoteChar = (byte) 34;
        this._outputStream = outputStream;
        this._bufferRecyclable = true;
        byte[] bArrAllocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = bArrAllocWriteEncodingBuffer;
        int length = bArrAllocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = cArrAllocConcatBuffer;
        this._charBufferLength = cArrAllocConcatBuffer.length;
        if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    public static int c(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) throws IOException {
        int i13 = 0;
        while (i10 < i11) {
            bArr[i13] = bArr[i10];
            i13++;
            i10++;
        }
        int iMin = Math.min(i12, bArr.length);
        do {
            int i14 = iMin - i13;
            if (i14 == 0) {
                break;
            }
            int i15 = inputStream.read(bArr, i13, i14);
            if (i15 < 0) {
                return i13;
            }
            i13 += i15;
        } while (i13 < 3);
        return i13;
    }

    public final void _flushBuffer() throws IOException {
        int i10 = this._outputTail;
        if (i10 > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i10);
        }
    }

    public final void _outputSurrogates(int i10, int i11) throws IOException {
        int i_decodeSurrogate = _decodeSurrogate(i10, i11);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        bArr[i12] = (byte) ((i_decodeSurrogate >> 18) | 240);
        bArr[i12 + 1] = (byte) (((i_decodeSurrogate >> 12) & 63) | 128);
        bArr[i12 + 2] = (byte) (((i_decodeSurrogate >> 6) & 63) | 128);
        this._outputTail = i12 + 4;
        bArr[i12 + 3] = (byte) ((i_decodeSurrogate & 63) | 128);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) throws IOException {
        byte b10;
        int iWriteValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, iWriteValue);
            return;
        }
        if (iWriteValue == 1) {
            b10 = 44;
        } else {
            if (iWriteValue != 2) {
                if (iWriteValue != 3) {
                    if (iWriteValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                }
                SerializableString serializableString = this._rootValueSeparator;
                if (serializableString != null) {
                    byte[] bArrAsUnquotedUTF8 = serializableString.asUnquotedUTF8();
                    if (bArrAsUnquotedUTF8.length > 0) {
                        d(bArrAsUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b10 = 58;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = b10;
    }

    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) throws IOException {
        int iEncodeBase64Chunk;
        int i12 = i11 - 3;
        int i13 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i14 = maxLineLength >> 2;
            do {
                if (i10 > i12) {
                    break loop0;
                }
                if (this._outputTail > i13) {
                    _flushBuffer();
                }
                int i15 = i10 + 2;
                int i16 = ((bArr[i10 + 1] & 255) | (bArr[i10] << 8)) << 8;
                i10 += 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i16 | (bArr[i15] & 255), this._outputBuffer, this._outputTail);
                this._outputTail = iEncodeBase64Chunk;
                i14--;
            } while (i14 > 0);
            byte[] bArr2 = this._outputBuffer;
            bArr2[iEncodeBase64Chunk] = 92;
            this._outputTail = iEncodeBase64Chunk + 2;
            bArr2[iEncodeBase64Chunk + 1] = 110;
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i17 = i11 - i10;
        if (i17 > 0) {
            if (this._outputTail > i13) {
                _flushBuffer();
            }
            int i18 = i10 + 1;
            int i19 = bArr[i10] << 16;
            if (i17 == 2) {
                i19 |= (bArr[i18] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i19, i17, this._outputBuffer, this._outputTail);
        }
    }

    public final void _writePPFieldName(String str) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iWriteFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            q(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            q(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
        str.getChars(0, length, this._charBuffer, 0);
        if (length <= this._outputMaxContiguous) {
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
            }
            o(0, this._charBuffer, length);
        } else {
            p(0, this._charBuffer, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    public final int a(int i10, int i11) throws IOException {
        byte[] bArr = this._outputBuffer;
        if (i10 < 55296 || i10 > 57343) {
            bArr[i11] = (byte) ((i10 >> 12) | 224);
            int i12 = i11 + 2;
            bArr[i11 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            int i13 = i11 + 3;
            bArr[i12] = (byte) ((i10 & 63) | 128);
            return i13;
        }
        bArr[i11] = 92;
        bArr[i11 + 1] = 117;
        byte[] bArr2 = f43084p0;
        bArr[i11 + 2] = bArr2[(i10 >> 12) & 15];
        bArr[i11 + 3] = bArr2[(i10 >> 8) & 15];
        int i14 = i11 + 5;
        bArr[i11 + 4] = bArr2[(i10 >> 4) & 15];
        int i15 = i11 + 6;
        bArr[i14] = bArr2[i10 & 15];
        return i15;
    }

    public final int b(int i10, int i11, char[] cArr, int i12) throws IOException {
        if (i10 >= 55296 && i10 <= 57343) {
            if (i11 >= i12 || cArr == null) {
                _reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i10)));
            }
            _outputSurrogates(i10, cArr[i11]);
            return i11 + 1;
        }
        byte[] bArr = this._outputBuffer;
        int i13 = this._outputTail;
        bArr[i13] = (byte) ((i10 >> 12) | 224);
        bArr[i13 + 1] = (byte) (((i10 >> 6) & 63) | 128);
        this._outputTail = i13 + 3;
        bArr[i13 + 2] = (byte) ((i10 & 63) | 128);
        return i11;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    } else {
                        writeEndObject();
                    }
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputTail = 0;
        if (this._outputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._outputStream.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._outputStream.flush();
            }
        }
        _releaseBuffers();
    }

    public final void d(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > 512) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    public final int e(byte[] bArr, int i10, SerializableString serializableString, int i11) throws IOException {
        byte[] bArrAsUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = bArrAsUnquotedUTF8.length;
        if (length <= 6) {
            System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i10, length);
            return i10 + length;
        }
        int i12 = this._outputEnd;
        int length2 = bArrAsUnquotedUTF8.length;
        if (i10 + length2 > i12) {
            this._outputTail = i10;
            _flushBuffer();
            int i13 = this._outputTail;
            if (length2 > bArr.length) {
                this._outputStream.write(bArrAsUnquotedUTF8, 0, length2);
                return i13;
            }
            System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i13, length2);
            i10 = i13 + length2;
        }
        if ((i11 * 6) + i10 <= i12) {
            return i10;
        }
        _flushBuffer();
        return this._outputTail;
    }

    public final int f(int i10, int i11) throws IOException {
        int i12;
        byte[] bArr = this._outputBuffer;
        bArr[i11] = 92;
        int i13 = i11 + 2;
        bArr[i11 + 1] = 117;
        byte[] bArr2 = f43084p0;
        if (i10 > 255) {
            int i14 = i10 >> 8;
            int i15 = i11 + 3;
            bArr[i13] = bArr2[(i14 & 255) >> 4];
            i12 = i11 + 4;
            bArr[i15] = bArr2[i14 & 15];
            i10 &= 255;
        } else {
            int i16 = i11 + 3;
            bArr[i13] = 48;
            i12 = i11 + 4;
            bArr[i16] = 48;
        }
        int i17 = i12 + 1;
        bArr[i12] = bArr2[i10 >> 4];
        int i18 = i12 + 2;
        bArr[i17] = bArr2[i10 & 15];
        return i18;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._outputStream == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._outputStream.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getOutputBuffered() {
        return this._outputTail;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this._outputStream;
    }

    public final void l() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(f43085q0, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    public final void m(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    public final void n(int i10, int i11, String str) throws IOException {
        char cCharAt;
        int i12 = i11 + i10;
        int i13 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i12 && (cCharAt = str.charAt(i10)) <= 127 && iArr[cCharAt] == 0) {
            bArr[i13] = (byte) cCharAt;
            i10++;
            i13++;
        }
        this._outputTail = i13;
        if (i10 < i12) {
            if (this._characterEscapes != null) {
                if (((i12 - i10) * 6) + i13 > this._outputEnd) {
                    _flushBuffer();
                }
                int iA = this._outputTail;
                byte[] bArr2 = this._outputBuffer;
                int[] iArr2 = this._outputEscapes;
                int i14 = this._maximumNonEscapedChar;
                if (i14 <= 0) {
                    i14 = 65535;
                }
                CharacterEscapes characterEscapes = this._characterEscapes;
                while (i10 < i12) {
                    i10++;
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 <= 127) {
                        int i15 = iArr2[cCharAt2];
                        if (i15 == 0) {
                            bArr2[iA] = (byte) cCharAt2;
                            iA++;
                        } else if (i15 > 0) {
                            int i16 = iA + 1;
                            bArr2[iA] = 92;
                            iA += 2;
                            bArr2[i16] = (byte) i15;
                        } else if (i15 == -2) {
                            SerializableString escapeSequence = characterEscapes.getEscapeSequence(cCharAt2);
                            if (escapeSequence == null) {
                                _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt2) + ", although was supposed to have one");
                            }
                            iA = e(bArr2, iA, escapeSequence, i12 - i10);
                        } else {
                            iA = f(cCharAt2, iA);
                        }
                    } else if (cCharAt2 > i14) {
                        iA = f(cCharAt2, iA);
                    } else {
                        SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(cCharAt2);
                        if (escapeSequence2 != null) {
                            iA = e(bArr2, iA, escapeSequence2, i12 - i10);
                        } else if (cCharAt2 <= 2047) {
                            int i17 = iA + 1;
                            bArr2[iA] = (byte) ((cCharAt2 >> 6) | 192);
                            iA += 2;
                            bArr2[i17] = (byte) ((cCharAt2 & '?') | 128);
                        } else {
                            iA = a(cCharAt2, iA);
                        }
                    }
                }
                this._outputTail = iA;
                return;
            }
            if (this._maximumNonEscapedChar == 0) {
                if (((i12 - i10) * 6) + i13 > this._outputEnd) {
                    _flushBuffer();
                }
                int iA2 = this._outputTail;
                byte[] bArr3 = this._outputBuffer;
                int[] iArr3 = this._outputEscapes;
                while (i10 < i12) {
                    i10++;
                    char cCharAt3 = str.charAt(i10);
                    if (cCharAt3 <= 127) {
                        int i18 = iArr3[cCharAt3];
                        if (i18 == 0) {
                            bArr3[iA2] = (byte) cCharAt3;
                            iA2++;
                        } else if (i18 > 0) {
                            int i19 = iA2 + 1;
                            bArr3[iA2] = 92;
                            iA2 += 2;
                            bArr3[i19] = (byte) i18;
                        } else {
                            iA2 = f(cCharAt3, iA2);
                        }
                    } else if (cCharAt3 <= 2047) {
                        int i20 = iA2 + 1;
                        bArr3[iA2] = (byte) ((cCharAt3 >> 6) | 192);
                        iA2 += 2;
                        bArr3[i20] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        iA2 = a(cCharAt3, iA2);
                    }
                }
                this._outputTail = iA2;
                return;
            }
            if (((i12 - i10) * 6) + i13 > this._outputEnd) {
                _flushBuffer();
            }
            int iA3 = this._outputTail;
            byte[] bArr4 = this._outputBuffer;
            int[] iArr4 = this._outputEscapes;
            int i21 = this._maximumNonEscapedChar;
            while (i10 < i12) {
                i10++;
                char cCharAt4 = str.charAt(i10);
                if (cCharAt4 <= 127) {
                    int i22 = iArr4[cCharAt4];
                    if (i22 == 0) {
                        bArr4[iA3] = (byte) cCharAt4;
                        iA3++;
                    } else if (i22 > 0) {
                        int i23 = iA3 + 1;
                        bArr4[iA3] = 92;
                        iA3 += 2;
                        bArr4[i23] = (byte) i22;
                    } else {
                        iA3 = f(cCharAt4, iA3);
                    }
                } else if (cCharAt4 > i21) {
                    iA3 = f(cCharAt4, iA3);
                } else if (cCharAt4 <= 2047) {
                    int i24 = iA3 + 1;
                    bArr4[iA3] = (byte) ((cCharAt4 >> 6) | 192);
                    iA3 += 2;
                    bArr4[i24] = (byte) ((cCharAt4 & '?') | 128);
                } else {
                    iA3 = a(cCharAt4, iA3);
                }
            }
            this._outputTail = iA3;
        }
    }

    public final void o(int i10, char[] cArr, int i11) throws IOException {
        char c10;
        int i12 = i11 + i10;
        int i13 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i10 < i12 && (c10 = cArr[i10]) <= 127 && iArr[c10] == 0) {
            bArr[i13] = (byte) c10;
            i10++;
            i13++;
        }
        this._outputTail = i13;
        if (i10 < i12) {
            if (this._characterEscapes != null) {
                if (((i12 - i10) * 6) + i13 > this._outputEnd) {
                    _flushBuffer();
                }
                int iA = this._outputTail;
                byte[] bArr2 = this._outputBuffer;
                int[] iArr2 = this._outputEscapes;
                int i14 = this._maximumNonEscapedChar;
                if (i14 <= 0) {
                    i14 = 65535;
                }
                CharacterEscapes characterEscapes = this._characterEscapes;
                while (i10 < i12) {
                    i10++;
                    char c11 = cArr[i10];
                    if (c11 <= 127) {
                        int i15 = iArr2[c11];
                        if (i15 == 0) {
                            bArr2[iA] = (byte) c11;
                            iA++;
                        } else if (i15 > 0) {
                            int i16 = iA + 1;
                            bArr2[iA] = 92;
                            iA += 2;
                            bArr2[i16] = (byte) i15;
                        } else if (i15 == -2) {
                            SerializableString escapeSequence = characterEscapes.getEscapeSequence(c11);
                            if (escapeSequence == null) {
                                _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c11) + ", although was supposed to have one");
                            }
                            iA = e(bArr2, iA, escapeSequence, i12 - i10);
                        } else {
                            iA = f(c11, iA);
                        }
                    } else if (c11 > i14) {
                        iA = f(c11, iA);
                    } else {
                        SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(c11);
                        if (escapeSequence2 != null) {
                            iA = e(bArr2, iA, escapeSequence2, i12 - i10);
                        } else if (c11 <= 2047) {
                            int i17 = iA + 1;
                            bArr2[iA] = (byte) ((c11 >> 6) | 192);
                            iA += 2;
                            bArr2[i17] = (byte) ((c11 & '?') | 128);
                        } else {
                            iA = a(c11, iA);
                        }
                    }
                }
                this._outputTail = iA;
                return;
            }
            if (this._maximumNonEscapedChar == 0) {
                if (((i12 - i10) * 6) + i13 > this._outputEnd) {
                    _flushBuffer();
                }
                int iA2 = this._outputTail;
                byte[] bArr3 = this._outputBuffer;
                int[] iArr3 = this._outputEscapes;
                while (i10 < i12) {
                    i10++;
                    char c12 = cArr[i10];
                    if (c12 <= 127) {
                        int i18 = iArr3[c12];
                        if (i18 == 0) {
                            bArr3[iA2] = (byte) c12;
                            iA2++;
                        } else if (i18 > 0) {
                            int i19 = iA2 + 1;
                            bArr3[iA2] = 92;
                            iA2 += 2;
                            bArr3[i19] = (byte) i18;
                        } else {
                            iA2 = f(c12, iA2);
                        }
                    } else if (c12 <= 2047) {
                        int i20 = iA2 + 1;
                        bArr3[iA2] = (byte) ((c12 >> 6) | 192);
                        iA2 += 2;
                        bArr3[i20] = (byte) ((c12 & '?') | 128);
                    } else {
                        iA2 = a(c12, iA2);
                    }
                }
                this._outputTail = iA2;
                return;
            }
            if (((i12 - i10) * 6) + i13 > this._outputEnd) {
                _flushBuffer();
            }
            int iA3 = this._outputTail;
            byte[] bArr4 = this._outputBuffer;
            int[] iArr4 = this._outputEscapes;
            int i21 = this._maximumNonEscapedChar;
            while (i10 < i12) {
                i10++;
                char c13 = cArr[i10];
                if (c13 <= 127) {
                    int i22 = iArr4[c13];
                    if (i22 == 0) {
                        bArr4[iA3] = (byte) c13;
                        iA3++;
                    } else if (i22 > 0) {
                        int i23 = iA3 + 1;
                        bArr4[iA3] = 92;
                        iA3 += 2;
                        bArr4[i23] = (byte) i22;
                    } else {
                        iA3 = f(c13, iA3);
                    }
                } else if (c13 > i21) {
                    iA3 = f(c13, iA3);
                } else if (c13 <= 2047) {
                    int i24 = iA3 + 1;
                    bArr4[iA3] = (byte) ((c13 >> 6) | 192);
                    iA3 += 2;
                    bArr4[i24] = (byte) ((c13 & '?') | 128);
                } else {
                    iA3 = a(c13, iA3);
                }
            }
            this._outputTail = iA3;
        }
    }

    public final void p(int i10, char[] cArr, int i11) throws IOException {
        do {
            int iMin = Math.min(this._outputMaxContiguous, i11);
            if (this._outputTail + iMin > this._outputEnd) {
                _flushBuffer();
            }
            o(i10, cArr, iMin);
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    public final void q(String str, boolean z10) throws IOException {
        if (z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = this._quoteChar;
        }
        int length = str.length();
        int i11 = 0;
        while (length > 0) {
            int iMin = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + iMin > this._outputEnd) {
                _flushBuffer();
            }
            n(i11, iMin, str);
            i11 += iMin;
            length -= iMin;
        }
        if (z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i12 = this._outputTail;
            this._outputTail = i12 + 1;
            bArr2[i12] = this._quoteChar;
        }
    }

    public final void r(int i10, int i11, byte[] bArr) throws IOException {
        int i12;
        int[] iArr = this._outputEscapes;
        int i13 = i10 + i11;
        int i14 = i10;
        while (i14 < i13) {
            int i15 = i14 + 1;
            byte b10 = bArr[i14];
            if (b10 >= 0 && iArr[b10] != 0) {
                int iF = this._outputTail;
                if ((i11 * 6) + iF > this._outputEnd) {
                    _flushBuffer();
                    iF = this._outputTail;
                }
                byte[] bArr2 = this._outputBuffer;
                int[] iArr2 = this._outputEscapes;
                while (i10 < i13) {
                    i10++;
                    byte b11 = bArr[i10];
                    if (b11 < 0 || (i12 = iArr2[b11]) == 0) {
                        bArr2[iF] = b11;
                        iF++;
                    } else if (i12 > 0) {
                        int i16 = iF + 1;
                        bArr2[iF] = 92;
                        iF += 2;
                        bArr2[i16] = (byte) i12;
                    } else {
                        iF = f(b11, iF);
                    }
                }
                this._outputTail = iF;
                return;
            }
            i14 = i15;
        }
        if (this._outputTail + i11 > this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(bArr, i10, this._outputBuffer, this._outputTail, i11);
        this._outputTail += i11;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i10, i11 + i10);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z10) throws IOException {
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = z10 ? f43086r0 : f43087s0;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not Array but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = 93;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not Object but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = 125;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iWriteFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = 44;
        }
        int i11 = 0;
        if (this._cfgUnqNames) {
            q(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            q(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr2[i12] = this._quoteChar;
        if (length <= this._outputMaxContiguous) {
            if (i13 + length > this._outputEnd) {
                _flushBuffer();
            }
            n(0, length, str);
        } else {
            do {
                int iMin = Math.min(this._outputMaxContiguous, length);
                if (this._outputTail + iMin > this._outputEnd) {
                    _flushBuffer();
                }
                n(i11, iMin, str);
                i11 += iMin;
                length -= iMin;
            } while (length > 0);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        bArr3[i14] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        l();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s4) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (!this._cfgNumbersAsStrings) {
            this._outputTail = NumberOutput.outputInt(s4, this._outputBuffer, this._outputTail);
            return;
        }
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr[i10] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(s4, bArr, i11);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        bArr2[iOutputInt] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length > cArr.length) {
            writeRaw(str, 0, length);
        } else {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr2[i12] = this._quoteChar;
        if (i13 + i11 > this._outputEnd) {
            _flushBuffer();
            if (i11 > 512) {
                this._outputStream.write(bArr, i10, i11);
            } else {
                System.arraycopy(bArr, i10, this._outputBuffer, this._outputTail, i11);
                this._outputTail += i11;
            }
        } else {
            System.arraycopy(bArr, i10, this._outputBuffer, this._outputTail, i11);
            this._outputTail += i11;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        bArr3[i14] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a raw (unencoded) value");
        byte[] bArrAsUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (bArrAsUnquotedUTF8.length > 0) {
            d(bArrAsUnquotedUTF8);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            l();
            return;
        }
        int length = str.length();
        if (length > this._outputMaxContiguous) {
            q(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = this._quoteChar;
        n(0, length, str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr2[i11] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
        if (i11 <= this._outputMaxContiguous) {
            r(i10, i11, bArr);
        } else {
            do {
                int iMin = Math.min(this._outputMaxContiguous, i11);
                r(i10, iMin, bArr);
                i10 += iMin;
                i11 -= iMin;
            } while (i11 > 0);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i10, int i11) throws IOException {
        char c10;
        char c11;
        char[] cArr = this._charBuffer;
        int length = cArr.length;
        if (i11 <= length) {
            str.getChars(i10, i10 + i11, cArr, 0);
            writeRaw(cArr, 0, i11);
            return;
        }
        int i12 = this._outputEnd;
        int iMin = Math.min(length, (i12 >> 2) + (i12 >> 4));
        int i13 = iMin * 3;
        while (i11 > 0) {
            int iMin2 = Math.min(iMin, i11);
            str.getChars(i10, i10 + iMin2, cArr, 0);
            if (this._outputTail + i13 > this._outputEnd) {
                _flushBuffer();
            }
            if (iMin2 > 1 && (c11 = cArr[iMin2 - 1]) >= 55296 && c11 <= 56319) {
                iMin2--;
            }
            int iB = 0;
            while (iB < iMin2) {
                while (true) {
                    c10 = cArr[iB];
                    if (c10 > 127) {
                        break;
                    }
                    byte[] bArr = this._outputBuffer;
                    int i14 = this._outputTail;
                    this._outputTail = i14 + 1;
                    bArr[i14] = (byte) c10;
                    iB++;
                    if (iB >= iMin2) {
                        break;
                    }
                }
                iB++;
                if (c10 < 2048) {
                    byte[] bArr2 = this._outputBuffer;
                    int i15 = this._outputTail;
                    bArr2[i15] = (byte) ((c10 >> 6) | 192);
                    this._outputTail = i15 + 2;
                    bArr2[i15 + 1] = (byte) ((c10 & '?') | 128);
                } else {
                    iB = b(c10, iB, cArr, iMin2);
                }
            }
            i10 += iMin2;
            i11 -= iMin2;
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        JsonWriteContext jsonWriteContextCreateChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = jsonWriteContextCreateChildObjectContext;
        if (obj != null) {
            jsonWriteContextCreateChildObjectContext.setCurrentValue(obj);
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        bArr[i10] = 123;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        bArr[i11] = this._quoteChar;
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            if (i10 < 0) {
                i10 = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer);
            } else {
                int i_writeBinary = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer, i10);
                if (i_writeBinary > 0) {
                    _reportError("Too few bytes available: missing " + i_writeBinary + " bytes (out of " + i10 + ")");
                }
            }
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i12 = this._outputTail;
            this._outputTail = i12 + 1;
            bArr2[i12] = this._quoteChar;
            return i10;
        } catch (Throwable th2) {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            throw th2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i10) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            if (this._outputTail + 13 >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i11 = this._outputTail;
            int i12 = i11 + 1;
            this._outputTail = i12;
            bArr[i11] = this._quoteChar;
            int iOutputInt = NumberOutput.outputInt(i10, bArr, i12);
            byte[] bArr2 = this._outputBuffer;
            this._outputTail = iOutputInt + 1;
            bArr2[iOutputInt] = this._quoteChar;
            return;
        }
        this._outputTail = NumberOutput.outputInt(i10, this._outputBuffer, this._outputTail);
    }

    public UTF8JsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, OutputStream outputStream, byte[] bArr, int i11, boolean z10) {
        super(iOContext, i10, objectCodec);
        this._quoteChar = (byte) 34;
        this._outputStream = outputStream;
        this._bufferRecyclable = z10;
        this._outputTail = i11;
        this._outputBuffer = bArr;
        int length = bArr.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = cArrAllocConcatBuffer;
        this._charBufferLength = cArrAllocConcatBuffer.length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i10) throws IOException {
        _verifyValueWrite("write a string");
        if (reader == null) {
            _reportError("null reader");
        }
        int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
        char[] cArr = this._charBuffer;
        if (this._outputTail + i10 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr[i12] = this._quoteChar;
        while (i11 > 0) {
            int i13 = reader.read(cArr, 0, Math.min(i11, cArr.length));
            if (i13 <= 0) {
                break;
            }
            if (this._outputTail + i10 >= this._outputEnd) {
                _flushBuffer();
            }
            p(0, cArr, i13);
            i11 -= i13;
        }
        if (this._outputTail + i10 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        bArr2[i14] = this._quoteChar;
        if (i11 <= 0 || i10 < 0) {
            return;
        }
        _reportError("Didn't read enough from reader");
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i10) throws IOException {
        int iC;
        int i11 = this._outputEnd - 6;
        int i12 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i13 = -3;
        int i14 = 0;
        int iC2 = 0;
        while (i10 > 2) {
            if (i14 > i13) {
                iC2 = c(inputStream, bArr, i14, iC2, i10);
                if (iC2 < 3) {
                    i14 = 0;
                    break;
                }
                i13 = iC2 - 3;
                i14 = 0;
            }
            if (this._outputTail > i11) {
                _flushBuffer();
            }
            int i15 = i14 + 2;
            int i16 = ((bArr[i14 + 1] & 255) | (bArr[i14] << 8)) << 8;
            i14 += 3;
            i10 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((bArr[i15] & 255) | i16, this._outputBuffer, this._outputTail);
            this._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                bArr2[iEncodeBase64Chunk] = 92;
                this._outputTail = iEncodeBase64Chunk + 2;
                bArr2[iEncodeBase64Chunk + 1] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i10 <= 0 || (iC = c(inputStream, bArr, i14, iC2, i10)) <= 0) {
            return i10;
        }
        if (this._outputTail > i11) {
            _flushBuffer();
        }
        int i17 = bArr[0] << 16;
        if (1 < iC) {
            i17 |= (bArr[1] & 255) << 8;
        } else {
            i12 = 1;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i17, i12, this._outputBuffer, this._outputTail);
        return i10 - i12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j10) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            if (this._outputTail + 23 >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            int i11 = i10 + 1;
            this._outputTail = i11;
            bArr[i10] = this._quoteChar;
            int iOutputLong = NumberOutput.outputLong(j10, bArr, i11);
            byte[] bArr2 = this._outputBuffer;
            this._outputTail = iOutputLong + 1;
            bArr2[iOutputLong] = this._quoteChar;
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j10, this._outputBuffer, this._outputTail);
    }

    public final void _writePPFieldName(SerializableString serializableString) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iWriteFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean z10 = !this._cfgUnqNames;
        if (z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = this._quoteChar;
        }
        d(serializableString.asQuotedUTF8());
        if (z10) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i11 = this._outputTail;
            this._outputTail = i11 + 1;
            bArr2[i11] = this._quoteChar;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        byte[] bArrAsUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (bArrAsUnquotedUTF8.length > 0) {
            d(bArrAsUnquotedUTF8);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeRaw(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i11 + i11 + i11;
        int i13 = this._outputTail + i12;
        int i14 = this._outputEnd;
        if (i13 > i14) {
            if (i14 < i12) {
                byte[] bArr = this._outputBuffer;
                int i15 = i11 + i10;
                while (i10 < i15) {
                    do {
                        char c10 = cArr[i10];
                        if (c10 >= 128) {
                            if (this._outputTail + 3 >= this._outputEnd) {
                                _flushBuffer();
                            }
                            int i16 = i10 + 1;
                            char c11 = cArr[i10];
                            if (c11 < 2048) {
                                int i17 = this._outputTail;
                                bArr[i17] = (byte) ((c11 >> 6) | 192);
                                this._outputTail = i17 + 2;
                                bArr[i17 + 1] = (byte) ((c11 & '?') | 128);
                                i10 = i16;
                            } else {
                                i10 = b(c11, i16, cArr, i15);
                            }
                        } else {
                            if (this._outputTail >= i14) {
                                _flushBuffer();
                            }
                            int i18 = this._outputTail;
                            this._outputTail = i18 + 1;
                            bArr[i18] = (byte) c10;
                            i10++;
                        }
                    } while (i10 < i15);
                    return;
                }
                return;
            }
            _flushBuffer();
        }
        int i19 = i11 + i10;
        while (i10 < i19) {
            do {
                char c12 = cArr[i10];
                if (c12 > 127) {
                    i10++;
                    if (c12 < 2048) {
                        byte[] bArr2 = this._outputBuffer;
                        int i20 = this._outputTail;
                        bArr2[i20] = (byte) ((c12 >> 6) | 192);
                        this._outputTail = i20 + 2;
                        bArr2[i20 + 1] = (byte) ((c12 & '?') | 128);
                    } else {
                        i10 = b(c12, i10, cArr, i19);
                    }
                } else {
                    byte[] bArr3 = this._outputBuffer;
                    int i21 = this._outputTail;
                    this._outputTail = i21 + 1;
                    bArr3[i21] = (byte) c12;
                    i10++;
                }
            } while (i10 < i19);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (iWriteFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = 44;
        }
        if (this._cfgUnqNames) {
            int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
            if (iAppendQuotedUTF8 < 0) {
                d(serializableString.asQuotedUTF8());
                return;
            } else {
                this._outputTail += iAppendQuotedUTF8;
                return;
            }
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        bArr2[i11] = this._quoteChar;
        int iAppendQuotedUTF9 = serializableString.appendQuotedUTF8(bArr2, i12);
        if (iAppendQuotedUTF9 < 0) {
            d(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += iAppendQuotedUTF9;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        bArr3[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i12 = this._outputTail;
        int i13 = i12 + 1;
        this._outputTail = i13;
        bArr[i12] = this._quoteChar;
        if (i11 <= this._outputMaxContiguous) {
            if (i13 + i11 > this._outputEnd) {
                _flushBuffer();
            }
            o(i10, cArr, i11);
        } else {
            p(i10, cArr, i11);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        bArr2[i14] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            l();
        } else if (this._cfgNumbersAsStrings) {
            m(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this._outputEnd - 6;
        int i11 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i12 = -3;
        int i13 = 0;
        int iC = 0;
        int i14 = 0;
        while (true) {
            if (i13 > i12) {
                iC = c(inputStream, bArr, i13, iC, bArr.length);
                if (iC < 3) {
                    break;
                }
                i12 = iC - 3;
                i13 = 0;
            }
            if (this._outputTail > i10) {
                _flushBuffer();
            }
            int i15 = i13 + 2;
            int i16 = ((bArr[i13 + 1] & 255) | (bArr[i13] << 8)) << 8;
            i13 += 3;
            i14 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((bArr[i15] & 255) | i16, this._outputBuffer, this._outputTail);
            this._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                bArr2[iEncodeBase64Chunk] = 92;
                this._outputTail = iEncodeBase64Chunk + 2;
                bArr2[iEncodeBase64Chunk + 1] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (iC <= 0) {
            return i14;
        }
        if (this._outputTail > i10) {
            _flushBuffer();
        }
        int i17 = bArr[0] << 16;
        if (1 < iC) {
            i17 |= (bArr[1] & 255) << 8;
        } else {
            i11 = 1;
        }
        int i18 = i14 + i11;
        this._outputTail = base64Variant.encodeBase64Partial(i17, i11, this._outputBuffer, this._outputTail);
        return i18;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d2) throws IOException {
        if (!this._cfgNumbersAsStrings && ((!Double.isNaN(d2) && !Double.isInfinite(d2)) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(d2));
        } else {
            writeString(String.valueOf(d2));
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        bArr[i10] = this._quoteChar;
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i11);
        if (iAppendQuotedUTF8 < 0) {
            d(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += iAppendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        bArr2[i12] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f6) throws IOException {
        if (!this._cfgNumbersAsStrings && ((!Float.isNaN(f6) && !Float.isInfinite(f6)) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(f6));
        } else {
            writeString(String.valueOf(f6));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c10) throws IOException {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c10 <= 127) {
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            bArr[i10] = (byte) c10;
        } else {
            if (c10 < 2048) {
                int i11 = this._outputTail;
                bArr[i11] = (byte) ((c10 >> 6) | 192);
                this._outputTail = i11 + 2;
                bArr[i11 + 1] = (byte) ((c10 & '?') | 128);
                return;
            }
            b(c10, 0, null, 0);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            l();
        } else if (this._cfgNumbersAsStrings) {
            m(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            m(str);
        } else {
            writeRaw(str);
        }
    }
}

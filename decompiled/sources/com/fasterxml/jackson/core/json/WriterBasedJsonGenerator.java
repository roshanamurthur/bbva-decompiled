package com.fasterxml.jackson.core.json;

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
import com.nulabinc.zxcvbn.Guess;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    protected static final char[] HEX_CHARS = CharTypes.copyHexChars();
    protected static final int SHORT_WRITE = 32;
    protected char[] _charBuffer;
    protected SerializableString _currentEscape;
    protected char[] _entityBuffer;
    protected char[] _outputBuffer;
    protected int _outputEnd;
    protected int _outputHead;
    protected int _outputTail;
    protected char _quoteChar;
    protected final Writer _writer;

    public WriterBasedJsonGenerator(IOContext iOContext, int i10, ObjectCodec objectCodec, Writer writer) {
        super(iOContext, i10, objectCodec);
        this._quoteChar = '\"';
        this._writer = writer;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = cArrAllocConcatBuffer;
        this._outputEnd = cArrAllocConcatBuffer.length;
    }

    public static int f(InputStream inputStream, byte[] bArr, int i10, int i11, int i12) throws IOException {
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

    public void _flushBuffer() throws IOException {
        int i10 = this._outputTail;
        int i11 = this._outputHead;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i11, i12);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
        char[] cArr2 = this._charBuffer;
        if (cArr2 != null) {
            this._charBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr2);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) throws IOException {
        char c10;
        int iWriteValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, iWriteValue);
            return;
        }
        if (iWriteValue == 1) {
            c10 = AbstractJsonLexerKt.COMMA;
        } else {
            if (iWriteValue != 2) {
                if (iWriteValue != 3) {
                    if (iWriteValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                } else {
                    SerializableString serializableString = this._rootValueSeparator;
                    if (serializableString != null) {
                        writeRaw(serializableString.getValue());
                        return;
                    }
                    return;
                }
            }
            c10 = AbstractJsonLexerKt.COLON;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = c10;
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
            char[] cArr = this._outputBuffer;
            cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
            this._outputTail = iEncodeBase64Chunk + 2;
            cArr[iEncodeBase64Chunk + 1] = 'n';
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

    public final void _writeFieldName(String str, boolean z10) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z10);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z10) {
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.COMMA;
        }
        if (this._cfgUnqNames) {
            o(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
        o(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr3[i12] = this._quoteChar;
    }

    public final void _writePPFieldName(String str, boolean z10) throws IOException {
        if (z10) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            o(str);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        o(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    public final char[] b() {
        char[] cArr = {AbstractJsonLexerKt.STRING_ESC, 0, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, '0', '0', 0, 0, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        this._entityBuffer = cArr;
        return cArr;
    }

    public final void c(char c10, int i10) throws IOException {
        String value;
        int i11;
        if (i10 >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i12 = this._outputTail;
            cArr[i12] = AbstractJsonLexerKt.STRING_ESC;
            this._outputTail = i12 + 2;
            cArr[i12 + 1] = (char) i10;
            return;
        }
        if (i10 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c10).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(value);
                    return;
                }
            }
            value.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i13 = this._outputTail;
        char[] cArr2 = this._outputBuffer;
        cArr2[i13] = AbstractJsonLexerKt.STRING_ESC;
        int i14 = i13 + 2;
        cArr2[i13 + 1] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c10 > 255) {
            int i15 = c10 >> '\b';
            int i16 = i13 + 3;
            char[] cArr3 = HEX_CHARS;
            cArr2[i14] = cArr3[(i15 & 255) >> 4];
            i11 = i13 + 4;
            cArr2[i16] = cArr3[i15 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i17 = i13 + 3;
            cArr2[i14] = '0';
            i11 = i13 + 4;
            cArr2[i17] = '0';
        }
        char[] cArr4 = HEX_CHARS;
        cArr2[i11] = cArr4[c10 >> 4];
        cArr2[i11 + 1] = cArr4[c10 & 15];
        this._outputTail = i11 + 2;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteFormattedNumbers() {
        return true;
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
        this._outputHead = 0;
        this._outputTail = 0;
        if (this._writer != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._writer.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._writer.flush();
            }
        }
        _releaseBuffers();
    }

    public final int d(char[] cArr, int i10, int i11, char c10, int i12) throws IOException {
        String value;
        int i13;
        if (i12 >= 0) {
            if (i10 > 1 && i10 < i11) {
                int i14 = i10 - 2;
                cArr[i14] = AbstractJsonLexerKt.STRING_ESC;
                cArr[i10 - 1] = (char) i12;
                return i14;
            }
            char[] cArrB = this._entityBuffer;
            if (cArrB == null) {
                cArrB = b();
            }
            cArrB[1] = (char) i12;
            this._writer.write(cArrB, 0, 2);
            return i10;
        }
        if (i12 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c10).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (i10 < length || i10 >= i11) {
                this._writer.write(value);
                return i10;
            }
            int i15 = i10 - length;
            value.getChars(0, length, cArr, i15);
            return i15;
        }
        if (i10 <= 5 || i10 >= i11) {
            char[] cArrB2 = this._entityBuffer;
            if (cArrB2 == null) {
                cArrB2 = b();
            }
            this._outputHead = this._outputTail;
            if (c10 <= 255) {
                char[] cArr2 = HEX_CHARS;
                cArrB2[6] = cArr2[c10 >> 4];
                cArrB2[7] = cArr2[c10 & 15];
                this._writer.write(cArrB2, 2, 6);
                return i10;
            }
            int i16 = c10 >> '\b';
            char[] cArr3 = HEX_CHARS;
            cArrB2[10] = cArr3[(i16 & 255) >> 4];
            cArrB2[11] = cArr3[i16 & 15];
            cArrB2[12] = cArr3[(c10 & 255) >> 4];
            cArrB2[13] = cArr3[c10 & 15];
            this._writer.write(cArrB2, 8, 6);
            return i10;
        }
        cArr[i10 - 6] = AbstractJsonLexerKt.STRING_ESC;
        int i17 = i10 - 4;
        cArr[i10 - 5] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c10 > 255) {
            int i18 = c10 >> '\b';
            int i19 = i10 - 3;
            char[] cArr4 = HEX_CHARS;
            cArr[i17] = cArr4[(i18 & 255) >> 4];
            i13 = i10 - 2;
            cArr[i19] = cArr4[i18 & 15];
            c10 = (char) (c10 & 255);
        } else {
            int i20 = i10 - 3;
            cArr[i17] = '0';
            i13 = i10 - 2;
            cArr[i20] = '0';
        }
        char[] cArr5 = HEX_CHARS;
        cArr[i13] = cArr5[c10 >> 4];
        cArr[i13 + 1] = cArr5[c10 & 15];
        return i13 - 4;
    }

    public final void e(char c10, int i10) throws IOException {
        String value;
        int i11;
        if (i10 >= 0) {
            int i12 = this._outputTail;
            if (i12 >= 2) {
                int i13 = i12 - 2;
                this._outputHead = i13;
                char[] cArr = this._outputBuffer;
                cArr[i13] = AbstractJsonLexerKt.STRING_ESC;
                cArr[i12 - 1] = (char) i10;
                return;
            }
            char[] cArrB = this._entityBuffer;
            if (cArrB == null) {
                cArrB = b();
            }
            this._outputHead = this._outputTail;
            cArrB[1] = (char) i10;
            this._writer.write(cArrB, 0, 2);
            return;
        }
        if (i10 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c10).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            int i14 = this._outputTail;
            if (i14 < length) {
                this._outputHead = i14;
                this._writer.write(value);
                return;
            } else {
                int i15 = i14 - length;
                this._outputHead = i15;
                value.getChars(0, length, this._outputBuffer, i15);
                return;
            }
        }
        int i16 = this._outputTail;
        if (i16 < 6) {
            char[] cArrB2 = this._entityBuffer;
            if (cArrB2 == null) {
                cArrB2 = b();
            }
            this._outputHead = this._outputTail;
            if (c10 <= 255) {
                char[] cArr2 = HEX_CHARS;
                cArrB2[6] = cArr2[c10 >> 4];
                cArrB2[7] = cArr2[c10 & 15];
                this._writer.write(cArrB2, 2, 6);
                return;
            }
            int i17 = c10 >> '\b';
            char[] cArr3 = HEX_CHARS;
            cArrB2[10] = cArr3[(i17 & 255) >> 4];
            cArrB2[11] = cArr3[i17 & 15];
            cArrB2[12] = cArr3[(c10 & 255) >> 4];
            cArrB2[13] = cArr3[c10 & 15];
            this._writer.write(cArrB2, 8, 6);
            return;
        }
        char[] cArr4 = this._outputBuffer;
        int i18 = i16 - 6;
        this._outputHead = i18;
        cArr4[i18] = AbstractJsonLexerKt.STRING_ESC;
        cArr4[i16 - 5] = AbstractJsonLexerKt.UNICODE_ESC;
        if (c10 > 255) {
            int i19 = c10 >> '\b';
            char[] cArr5 = HEX_CHARS;
            cArr4[i16 - 4] = cArr5[(i19 & 255) >> 4];
            i11 = i16 - 3;
            cArr4[i11] = cArr5[i19 & 15];
            c10 = (char) (c10 & 255);
        } else {
            cArr4[i16 - 4] = '0';
            i11 = i16 - 3;
            cArr4[i11] = '0';
        }
        char[] cArr6 = HEX_CHARS;
        cArr4[i11 + 1] = cArr6[c10 >> 4];
        cArr4[i11 + 2] = cArr6[c10 & 15];
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._writer == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._writer.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getOutputBuffered() {
        return Math.max(0, this._outputTail - this._outputHead);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this._writer;
    }

    public final void l() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i10 = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i10] = 'n';
        cArr[i10 + 1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[i10 + 2] = 'l';
        cArr[i10 + 3] = 'l';
        this._outputTail = i10 + 4;
    }

    public final void m(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[PHI: r2
      0x0036: PHI (r2v17 int) = (r2v13 int), (r2v18 int) binds: [B:18:0x0032, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0087 A[PHI: r2
      0x0087: PHI (r2v10 int) = (r2v7 int), (r2v11 int) binds: [B:44:0x0083, B:42:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    public final void n(int i10, char[] cArr, int i11) throws IOException {
        char c10;
        char c11;
        int i12 = 0;
        if (this._characterEscapes != null) {
            int i13 = i11 + i10;
            int[] iArr = this._outputEscapes;
            int i14 = this._maximumNonEscapedChar;
            if (i14 < 1) {
                i14 = 65535;
            }
            int iMin = Math.min(iArr.length, i14 + 1);
            CharacterEscapes characterEscapes = this._characterEscapes;
            while (i10 < i13) {
                int i15 = i10;
                do {
                    c11 = cArr[i15];
                    if (c11 < iMin) {
                        i12 = iArr[c11];
                        if (i12 != 0) {
                            break;
                        } else {
                            i15++;
                        }
                    } else {
                        if (c11 > i14) {
                            i12 = -1;
                            break;
                        }
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c11);
                        this._currentEscape = escapeSequence;
                        if (escapeSequence != null) {
                            i12 = -2;
                            break;
                        }
                        i15++;
                    }
                } while (i15 < i13);
                int i16 = i15 - i10;
                if (i16 < 32) {
                    if (this._outputTail + i16 > this._outputEnd) {
                        _flushBuffer();
                    }
                    if (i16 > 0) {
                        System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i16);
                        this._outputTail += i16;
                    }
                } else {
                    _flushBuffer();
                    this._writer.write(cArr, i10, i16);
                }
                if (i15 >= i13) {
                    return;
                }
                i10 = i15 + 1;
                c(c11, i12);
            }
            return;
        }
        int i17 = this._maximumNonEscapedChar;
        if (i17 == 0) {
            int i18 = i11 + i10;
            int[] iArr2 = this._outputEscapes;
            int length = iArr2.length;
            while (i10 < i18) {
                int i19 = i10;
                do {
                    char c12 = cArr[i19];
                    if (c12 < length && iArr2[c12] != 0) {
                        break;
                    } else {
                        i19++;
                    }
                } while (i19 < i18);
                int i20 = i19 - i10;
                if (i20 < 32) {
                    if (this._outputTail + i20 > this._outputEnd) {
                        _flushBuffer();
                    }
                    if (i20 > 0) {
                        System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i20);
                        this._outputTail += i20;
                    }
                } else {
                    _flushBuffer();
                    this._writer.write(cArr, i10, i20);
                }
                if (i19 >= i18) {
                    return;
                }
                i10 = i19 + 1;
                char c13 = cArr[i19];
                c(c13, iArr2[c13]);
            }
            return;
        }
        int i21 = i11 + i10;
        int[] iArr3 = this._outputEscapes;
        int iMin2 = Math.min(iArr3.length, i17 + 1);
        while (i10 < i21) {
            int i22 = i10;
            do {
                c10 = cArr[i22];
                if (c10 < iMin2) {
                    i12 = iArr3[c10];
                    if (i12 != 0) {
                        break;
                    } else {
                        i22++;
                    }
                } else {
                    if (c10 > i17) {
                        i12 = -1;
                        break;
                    }
                    i22++;
                }
            } while (i22 < i21);
            int i23 = i22 - i10;
            if (i23 < 32) {
                if (this._outputTail + i23 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i23 > 0) {
                    System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i23);
                    this._outputTail += i23;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i10, i23);
            }
            if (i22 >= i21) {
                return;
            }
            i10 = i22 + 1;
            c(c10, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:164:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005f A[PHI: r16
      0x005f: PHI (r16v7 int) = (r16v3 int), (r16v8 int) binds: [B:24:0x005a, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x015e  */
    public final void o(String str) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        char[] cArr;
        char c10;
        char[] cArr2;
        char c11;
        int i19;
        char c12;
        int length = str.length();
        int i20 = this._outputEnd;
        int i21 = 1;
        if (length <= i20) {
            if (this._outputTail + length > i20) {
                _flushBuffer();
            }
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            if (this._characterEscapes != null) {
                int i22 = this._outputTail + length;
                int[] iArr = this._outputEscapes;
                int i23 = this._maximumNonEscapedChar;
                int i24 = i23 < 1 ? 65535 : i23;
                int iMin = Math.min(iArr.length, i24 + 1);
                CharacterEscapes characterEscapes = this._characterEscapes;
                while (this._outputTail < i22) {
                    do {
                        char c13 = this._outputBuffer[this._outputTail];
                        if (c13 < iMin) {
                            i15 = iArr[c13];
                            if (i15 != 0) {
                                int i25 = this._outputTail;
                                i16 = this._outputHead;
                                i17 = i25 - i16;
                                if (i17 > 0) {
                                    this._writer.write(this._outputBuffer, i16, i17);
                                }
                                this._outputTail++;
                                e(c13, i15);
                            }
                            i18 = this._outputTail + 1;
                            this._outputTail = i18;
                        } else {
                            if (c13 > i24) {
                                i15 = -1;
                            } else {
                                SerializableString escapeSequence = characterEscapes.getEscapeSequence(c13);
                                this._currentEscape = escapeSequence;
                                if (escapeSequence != null) {
                                    i15 = -2;
                                }
                                i18 = this._outputTail + 1;
                                this._outputTail = i18;
                            }
                            int i26 = this._outputTail;
                            i16 = this._outputHead;
                            i17 = i26 - i16;
                            if (i17 > 0) {
                                this._writer.write(this._outputBuffer, i16, i17);
                            }
                            this._outputTail++;
                            e(c13, i15);
                        }
                    } while (i18 < i22);
                    return;
                }
                return;
            }
            int i27 = this._maximumNonEscapedChar;
            if (i27 == 0) {
                int i28 = this._outputTail + length;
                int[] iArr2 = this._outputEscapes;
                int length2 = iArr2.length;
                while (this._outputTail < i28) {
                    do {
                        char[] cArr3 = this._outputBuffer;
                        int i29 = this._outputTail;
                        char c14 = cArr3[i29];
                        if (c14 >= length2 || iArr2[c14] == 0) {
                            i10 = i29 + 1;
                            this._outputTail = i10;
                        } else {
                            int i30 = this._outputHead;
                            int i31 = i29 - i30;
                            if (i31 > 0) {
                                this._writer.write(cArr3, i30, i31);
                            }
                            char[] cArr4 = this._outputBuffer;
                            int i32 = this._outputTail;
                            this._outputTail = i32 + 1;
                            char c15 = cArr4[i32];
                            e(c15, iArr2[c15]);
                        }
                    } while (i10 < i28);
                    return;
                }
                return;
            }
            int i33 = this._outputTail + length;
            int[] iArr3 = this._outputEscapes;
            int iMin2 = Math.min(iArr3.length, i27 + 1);
            while (this._outputTail < i33) {
                do {
                    char[] cArr5 = this._outputBuffer;
                    int i34 = this._outputTail;
                    char c16 = cArr5[i34];
                    if (c16 < iMin2) {
                        i11 = iArr3[c16];
                        if (i11 != 0) {
                            i12 = this._outputHead;
                            i13 = i34 - i12;
                            if (i13 > 0) {
                                this._writer.write(cArr5, i12, i13);
                            }
                            this._outputTail++;
                            e(c16, i11);
                        }
                        i14 = i34 + 1;
                        this._outputTail = i14;
                    } else {
                        if (c16 > i27) {
                            i11 = -1;
                            i12 = this._outputHead;
                            i13 = i34 - i12;
                            if (i13 > 0) {
                                this._writer.write(cArr5, i12, i13);
                            }
                            this._outputTail++;
                            e(c16, i11);
                        }
                        i14 = i34 + 1;
                        this._outputTail = i14;
                    }
                } while (i14 < i33);
                return;
            }
            return;
        }
        _flushBuffer();
        int length3 = str.length();
        int i35 = 0;
        while (true) {
            int i36 = this._outputEnd;
            if (i35 + i36 > length3) {
                i36 = length3 - i35;
            }
            int i37 = i36;
            int i38 = i35 + i37;
            str.getChars(i35, i38, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                int[] iArr4 = this._outputEscapes;
                int i39 = this._maximumNonEscapedChar;
                int i40 = i39 < i21 ? 65535 : i39;
                int iMin3 = Math.min(iArr4.length, i40 + 1);
                CharacterEscapes characterEscapes2 = this._characterEscapes;
                int i41 = 0;
                int iD = 0;
                int i42 = 0;
                while (i41 < i37) {
                    do {
                        c12 = this._outputBuffer[i41];
                        if (c12 < iMin3) {
                            i42 = iArr4[c12];
                            if (i42 != 0) {
                                break;
                            } else {
                                i41++;
                            }
                        } else {
                            if (c12 > i40) {
                                i42 = -1;
                                break;
                            }
                            SerializableString escapeSequence2 = characterEscapes2.getEscapeSequence(c12);
                            this._currentEscape = escapeSequence2;
                            if (escapeSequence2 != null) {
                                i42 = -2;
                                break;
                            }
                            i41++;
                        }
                    } while (i41 < i37);
                    int i43 = i41 - iD;
                    if (i43 > 0) {
                        this._writer.write(this._outputBuffer, iD, i43);
                        if (i41 >= i37) {
                            break;
                        }
                    }
                    int i44 = i41 + 1;
                    iD = d(this._outputBuffer, i44, i37, c12, i42);
                    iArr4 = iArr4;
                    i41 = i44;
                    characterEscapes2 = characterEscapes2;
                    iMin3 = iMin3;
                    i40 = i40;
                }
            } else {
                int i45 = this._maximumNonEscapedChar;
                if (i45 != 0) {
                    int[] iArr5 = this._outputEscapes;
                    int iMin4 = Math.min(iArr5.length, i45 + 1);
                    int i46 = 0;
                    int iD2 = 0;
                    int i47 = 0;
                    while (i46 < i37) {
                        while (true) {
                            cArr2 = this._outputBuffer;
                            c11 = cArr2[i46];
                            if (c11 >= iMin4) {
                                if (c11 > i45) {
                                    i19 = -1;
                                    break;
                                }
                            } else {
                                i47 = iArr5[c11];
                                if (i47 != 0) {
                                }
                                i19 = i47;
                                break;
                            }
                            i46++;
                            if (i46 >= i37) {
                                i19 = i47;
                                break;
                            }
                        }
                        int i48 = i46 - iD2;
                        if (i48 > 0) {
                            this._writer.write(cArr2, iD2, i48);
                            if (i46 >= i37) {
                                break;
                            }
                        }
                        int i49 = i46 + 1;
                        iD2 = d(this._outputBuffer, i49, i37, c11, i19);
                        i47 = i19;
                        i46 = i49;
                    }
                } else {
                    int[] iArr6 = this._outputEscapes;
                    int length4 = iArr6.length;
                    int i50 = 0;
                    int iD3 = 0;
                    while (i50 < i37) {
                        do {
                            cArr = this._outputBuffer;
                            c10 = cArr[i50];
                            if (c10 < length4 && iArr6[c10] != 0) {
                                break;
                            } else {
                                i50++;
                            }
                        } while (i50 < i37);
                        int i51 = i50 - iD3;
                        if (i51 > 0) {
                            this._writer.write(cArr, iD3, i51);
                            if (i50 >= i37) {
                                break;
                            }
                        }
                        int i52 = i50 + 1;
                        iD3 = d(this._outputBuffer, i52, i37, c10, iArr6[c10]);
                        i50 = i52;
                    }
                }
            }
            if (i38 >= length3) {
                return;
            }
            i35 = i38;
            i21 = 1;
        }
    }

    public final void p(String str) throws IOException {
        int i10 = this._outputEnd;
        int i11 = this._outputTail;
        int i12 = i10 - i11;
        str.getChars(0, i12, this._outputBuffer, i11);
        this._outputTail += i12;
        _flushBuffer();
        int length = str.length() - i12;
        while (true) {
            int i13 = this._outputEnd;
            if (length <= i13) {
                str.getChars(i12, i12 + length, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            } else {
                int i14 = i12 + i13;
                str.getChars(i12, i14, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = i13;
                _flushBuffer();
                length -= i13;
                i12 = i14;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr[i12] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i10, i11 + i10);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        cArr2[i13] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z10) throws IOException {
        int i10;
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i11 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z10) {
            cArr[i11] = 't';
            cArr[i11 + 1] = 'r';
            cArr[i11 + 2] = AbstractJsonLexerKt.UNICODE_ESC;
            i10 = i11 + 3;
            cArr[i10] = 'e';
        } else {
            cArr[i11] = 'f';
            cArr[i11 + 1] = 'a';
            cArr[i11 + 2] = 'l';
            cArr[i11 + 3] = 's';
            i10 = i11 + 4;
            cArr[i10] = 'e';
        }
        this._outputTail = i10 + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() throws IOException {
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
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.END_LIST;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() throws IOException {
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
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.END_OBJ;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(str, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        l();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s4) throws IOException {
        _verifyValueWrite("write a number");
        if (!this._cfgNumbersAsStrings) {
            if (this._outputTail + 6 >= this._outputEnd) {
                _flushBuffer();
            }
            this._outputTail = NumberOutput.outputInt(s4, this._outputBuffer, this._outputTail);
            return;
        }
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        int i11 = i10 + 1;
        this._outputTail = i11;
        cArr[i10] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(s4, cArr, i11);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        cArr2[iOutputInt] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i10 = this._outputEnd - this._outputTail;
        if (i10 == 0) {
            _flushBuffer();
            i10 = this._outputEnd - this._outputTail;
        }
        if (i10 < length) {
            p(str);
        } else {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() throws IOException {
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
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_LIST;
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
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_OBJ;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            l();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        o(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(serializableString, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i10, int i11) throws IOException {
        int i12 = this._outputEnd - this._outputTail;
        if (i12 < i11) {
            _flushBuffer();
            i12 = this._outputEnd - this._outputTail;
        }
        if (i12 >= i11) {
            str.getChars(i10, i10 + i11, this._outputBuffer, this._outputTail);
            this._outputTail += i11;
        } else {
            p(str.substring(i10, i11 + i10));
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr[i11] = this._quoteChar;
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
            char[] cArr2 = this._outputBuffer;
            int i12 = this._outputTail;
            this._outputTail = i12 + 1;
            cArr2[i12] = this._quoteChar;
            return i10;
        } catch (Throwable th2) {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            throw th2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() throws IOException {
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
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = AbstractJsonLexerKt.BEGIN_OBJ;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i10) throws IOException {
        _verifyValueWrite("write a string");
        if (reader == null) {
            _reportError("null reader");
        }
        int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
        if (this._charBuffer == null) {
            this._charBuffer = this._ioContext.allocNameCopyBuffer(Guess.REFERENCE_YEAR);
        }
        char[] cArr = this._charBuffer;
        if (this._outputTail + i10 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr2[i12] = this._quoteChar;
        while (i11 > 0) {
            int i13 = reader.read(cArr, 0, Math.min(i11, cArr.length));
            if (i13 <= 0) {
                break;
            }
            if (this._outputTail + i10 >= this._outputEnd) {
                _flushBuffer();
            }
            n(0, cArr, i13);
            i11 -= i13;
        }
        if (this._outputTail + i10 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        cArr3[i14] = this._quoteChar;
        if (i11 <= 0 || i10 < 0) {
            return;
        }
        _reportError("Didn't read enough from reader");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i10) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            if (this._outputTail + 13 >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i11 = this._outputTail;
            int i12 = i11 + 1;
            this._outputTail = i12;
            cArr[i11] = this._quoteChar;
            int iOutputInt = NumberOutput.outputInt(i10, cArr, i12);
            char[] cArr2 = this._outputBuffer;
            this._outputTail = iOutputInt + 1;
            cArr2[iOutputInt] = this._quoteChar;
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i10, this._outputBuffer, this._outputTail);
    }

    public final void _writePPFieldName(SerializableString serializableString, boolean z10) throws IOException {
        if (z10) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    public final void _writeFieldName(SerializableString serializableString, boolean z10) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z10);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z10) {
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            this._outputTail = i10 + 1;
            cArr[i10] = AbstractJsonLexerKt.COMMA;
        }
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        int i12 = i11 + 1;
        this._outputTail = i12;
        cArr2[i11] = this._quoteChar;
        int length = cArrAsQuotedChars.length;
        if (i12 + length + 1 >= this._outputEnd) {
            writeRaw(cArrAsQuotedChars, 0, length);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr3 = this._outputBuffer;
            int i13 = this._outputTail;
            this._outputTail = i13 + 1;
            cArr3[i13] = this._quoteChar;
            return;
        }
        System.arraycopy(cArrAsQuotedChars, 0, cArr2, i12, length);
        int i14 = this._outputTail + length;
        char[] cArr4 = this._outputBuffer;
        this._outputTail = i14 + 1;
        cArr4[i14] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        writeRaw(serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i10, int i11) throws IOException {
        if (i11 < 32) {
            if (i11 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i10, this._outputBuffer, this._outputTail, i11);
            this._outputTail += i11;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i10, i11);
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i10) throws IOException {
        int iF;
        int i11 = this._outputEnd - 6;
        int i12 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i13 = -3;
        int i14 = 0;
        int iF2 = 0;
        while (i10 > 2) {
            if (i14 > i13) {
                iF2 = f(inputStream, bArr, i14, iF2, i10);
                if (iF2 < 3) {
                    i14 = 0;
                    break;
                }
                i13 = iF2 - 3;
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
                char[] cArr = this._outputBuffer;
                cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
                this._outputTail = iEncodeBase64Chunk + 2;
                cArr[iEncodeBase64Chunk + 1] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i10 <= 0 || (iF = f(inputStream, bArr, i14, iF2, i10)) <= 0) {
            return i10;
        }
        if (this._outputTail > i11) {
            _flushBuffer();
        }
        int i17 = bArr[0] << 16;
        if (1 < iF) {
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
            char[] cArr = this._outputBuffer;
            int i10 = this._outputTail;
            int i11 = i10 + 1;
            this._outputTail = i11;
            cArr[i10] = this._quoteChar;
            int iOutputLong = NumberOutput.outputLong(j10, cArr, i11);
            char[] cArr2 = this._outputBuffer;
            this._outputTail = iOutputLong + 1;
            cArr2[iOutputLong] = this._quoteChar;
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j10, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c10) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i10, int i11) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i12 = this._outputTail;
        this._outputTail = i12 + 1;
        cArr2[i12] = this._quoteChar;
        n(i10, cArr, i11);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i13 = this._outputTail;
        this._outputTail = i13 + 1;
        cArr3[i13] = this._quoteChar;
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
        int iF = 0;
        int i14 = 0;
        while (true) {
            if (i13 > i12) {
                iF = f(inputStream, bArr, i13, iF, bArr.length);
                if (iF < 3) {
                    break;
                }
                i12 = iF - 3;
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
                char[] cArr = this._outputBuffer;
                cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
                this._outputTail = iEncodeBase64Chunk + 2;
                cArr[iEncodeBase64Chunk + 1] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (iF <= 0) {
            return i14;
        }
        if (this._outputTail > i10) {
            _flushBuffer();
        }
        int i17 = bArr[0] << 16;
        if (1 < iF) {
            i17 |= (bArr[1] & 255) << 8;
        } else {
            i11 = 1;
        }
        int i18 = i14 + i11;
        this._outputTail = base64Variant.encodeBase64Partial(i17, i11, this._outputBuffer, this._outputTail);
        return i18;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i10 = this._outputTail;
        this._outputTail = i10 + 1;
        cArr[i10] = this._quoteChar;
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArrAsQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(cArrAsQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i11 = this._outputTail;
        this._outputTail = i11 + 1;
        cArr2[i11] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d2) throws IOException {
        if (!this._cfgNumbersAsStrings && (!isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) || (!Double.isNaN(d2) && !Double.isInfinite(d2)))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(d2));
        } else {
            writeString(String.valueOf(d2));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f6) throws IOException {
        if (!this._cfgNumbersAsStrings && (!isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS) || (!Float.isNaN(f6) && !Float.isInfinite(f6)))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(f6));
        } else {
            writeString(String.valueOf(f6));
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

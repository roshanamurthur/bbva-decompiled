package com.fasterxml.jackson.core.json;

import androidx.appcompat.widget.a;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class UTF8StreamJsonParser extends ParserBase {
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected int[] _quadBuffer;
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f43089p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int[] f43088q0 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    protected static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    public UTF8StreamJsonParser(IOContext iOContext, int i10, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i11, int i12, boolean z10) {
        super(iOContext, i10);
        this._quadBuffer = new int[16];
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i11;
        this._inputEnd = i12;
        this._currInputRowStart = i11;
        this._currInputProcessed = -i11;
        this._bufferRecyclable = z10;
    }

    public static final int r(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | ((-1) << (i11 << 3));
    }

    public final void A() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b10 = bArr[i10];
        if ((b10 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b10 & 255, i11);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        byte b11 = bArr2[i12];
        if ((b11 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b11 & 255, i13);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        byte b12 = bArr3[i14];
        if ((b12 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b12 & 255, i15);
        }
    }

    public final int B() throws IOException {
        while (true) {
            int i10 = this._inputPtr;
            if (i10 >= this._inputEnd) {
                return C();
            }
            byte[] bArr = this._inputBuffer;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            int i12 = bArr[i10] & 255;
            if (i12 > 32) {
                if (i12 != 47 && i12 != 35) {
                    return i12;
                }
                this._inputPtr = i10;
                return C();
            }
            if (i12 != 32) {
                if (i12 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (i12 == 13) {
                    _skipCR();
                } else if (i12 != 9) {
                    _throwInvalidSpace(i12);
                }
            }
        }
    }

    public final int C() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            int i12 = bArr[i10] & 255;
            if (i12 > 32) {
                if (i12 == 47) {
                    w();
                } else {
                    if (i12 != 35 || !isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
                        return i12;
                    }
                    x();
                }
            } else if (i12 != 32) {
                if (i12 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (i12 == 13) {
                    _skipCR();
                } else if (i12 != 9) {
                    _throwInvalidSpace(i12);
                }
            }
        }
    }

    public final int D() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        int i12 = bArr[i10] & 255;
        if (i12 > 32) {
            if (i12 != 47 && i12 != 35) {
                return i12;
            }
            this._inputPtr = i10;
            return E();
        }
        if (i12 != 32) {
            if (i12 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i11;
            } else if (i12 == 13) {
                _skipCR();
            } else if (i12 != 9) {
                _throwInvalidSpace(i12);
            }
        }
        while (true) {
            int i13 = this._inputPtr;
            if (i13 >= this._inputEnd) {
                return E();
            }
            byte[] bArr2 = this._inputBuffer;
            int i14 = i13 + 1;
            this._inputPtr = i14;
            int i15 = bArr2[i13] & 255;
            if (i15 > 32) {
                if (i15 != 47 && i15 != 35) {
                    return i15;
                }
                this._inputPtr = i13;
                return E();
            }
            if (i15 != 32) {
                if (i15 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i14;
                } else if (i15 == 13) {
                    _skipCR();
                } else if (i15 != 9) {
                    _throwInvalidSpace(i15);
                }
            }
        }
    }

    public final int E() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            int i12 = bArr[i10] & 255;
            if (i12 > 32) {
                if (i12 == 47) {
                    w();
                } else {
                    if (i12 != 35 || !isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
                        return i12;
                    }
                    x();
                }
            } else if (i12 != 32) {
                if (i12 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (i12 == 13) {
                    _skipCR();
                } else if (i12 != 9) {
                    _throwInvalidSpace(i12);
                }
            }
        }
    }

    public final void F() {
        this._tokenInputRow = this._currInputRow;
        int i10 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i10);
        this._tokenInputCol = i10 - this._currInputRowStart;
    }

    public final int G() throws IOException {
        int i10;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (i10 = this._inputBuffer[this._inputPtr] & 255) < 48 || i10 > 57) {
            return 48;
        }
        if (!isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (i10 == 48) {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i11 = this._inputPtr;
                i10 = bArr[i11] & 255;
                if (i10 < 48 || i10 > 57) {
                    return 48;
                }
                this._inputPtr = i11 + 1;
            } while (i10 == 48);
        }
        return i10;
    }

    public final void H(int i10) throws IOException {
        int i11 = this._inputPtr + 1;
        this._inputPtr = i11;
        if (i10 != 9) {
            if (i10 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i11;
            } else if (i10 == 13) {
                _skipCR();
            } else if (i10 != 32) {
                _reportMissingRootWS(i10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9 A[PHI: r5 r14
      0x00b9: PHI (r5v17 int) = (r5v16 int), (r5v28 int) binds: [B:28:0x0082, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r14v6 int) = (r14v5 int), (r14v15 int) binds: [B:28:0x0082, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    public final String I(int i10, int i11, int[] iArr) throws JsonParseException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = ((i10 << 2) - 4) + i11;
        if (i11 < 4) {
            int i22 = i10 - 1;
            i12 = iArr[i22];
            iArr[i22] = i12 << ((4 - i11) << 3);
        } else {
            i12 = 0;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i23 = 0;
        int i24 = 0;
        while (i23 < i21) {
            int i25 = iArr[i23 >> 2] >> ((3 - (i23 & 3)) << 3);
            int i26 = i25 & 255;
            int i27 = i23 + 1;
            if (i26 > 127) {
                if ((i25 & 224) == 192) {
                    i13 = i25 & 31;
                } else {
                    if ((i25 & 240) == 224) {
                        i13 = i25 & 15;
                        i14 = 2;
                    } else if ((i25 & 248) == 240) {
                        i13 = i25 & 7;
                        i14 = 3;
                    } else {
                        _reportInvalidInitial(i26);
                        i13 = 1;
                    }
                    if (i27 + i14 > i21) {
                        _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                    }
                    i15 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                    i27 = i23 + 2;
                    if ((i15 & 192) != 128) {
                        _reportInvalidOther(i15);
                    }
                    i16 = (i13 << 6) | (i15 & 63);
                    if (i14 > 1) {
                        i18 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                        i27 = i23 + 3;
                        if ((i18 & 192) != 128) {
                            _reportInvalidOther(i18);
                        }
                        i19 = (i16 << 6) | (i18 & 63);
                        if (i14 > 2) {
                            i20 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                            i27 = i23 + 4;
                            if ((i20 & 192) != 128) {
                                _reportInvalidOther(i20 & 255);
                            }
                            i16 = (i19 << 6) | (i20 & 63);
                            i26 = i16;
                            i17 = 2;
                        } else {
                            i26 = i19;
                            i17 = 2;
                        }
                    } else {
                        i26 = i16;
                        i17 = 2;
                    }
                    if (i14 > i17) {
                        int i28 = i26 - 65536;
                        if (i24 >= cArrEmptyAndGetCurrentSegment.length) {
                            cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                        }
                        cArrEmptyAndGetCurrentSegment[i24] = (char) ((i28 >> 10) + GeneratorBase.SURR1_FIRST);
                        i26 = (i28 & 1023) | 56320;
                        i24++;
                    }
                }
                i14 = 1;
                if (i27 + i14 > i21) {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                }
                i15 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                i27 = i23 + 2;
                if ((i15 & 192) != 128) {
                    _reportInvalidOther(i15);
                }
                i16 = (i13 << 6) | (i15 & 63);
                if (i14 > 1) {
                    i18 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                    i27 = i23 + 3;
                    if ((i18 & 192) != 128) {
                        _reportInvalidOther(i18);
                    }
                    i19 = (i16 << 6) | (i18 & 63);
                    if (i14 > 2) {
                        i20 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                        i27 = i23 + 4;
                        if ((i20 & 192) != 128) {
                            _reportInvalidOther(i20 & 255);
                        }
                        i16 = (i19 << 6) | (i20 & 63);
                        i26 = i16;
                        i17 = 2;
                    } else {
                        i26 = i19;
                        i17 = 2;
                    }
                } else {
                    i26 = i16;
                    i17 = 2;
                }
                if (i14 > i17) {
                    int i29 = i26 - 65536;
                    if (i24 >= cArrEmptyAndGetCurrentSegment.length) {
                        cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                    }
                    cArrEmptyAndGetCurrentSegment[i24] = (char) ((i29 >> 10) + GeneratorBase.SURR1_FIRST);
                    i26 = (i29 & 1023) | 56320;
                    i24++;
                }
            }
            i23 = i27;
            if (i24 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
            }
            cArrEmptyAndGetCurrentSegment[i24] = (char) i26;
            i24++;
        }
        String str = new String(cArrEmptyAndGetCurrentSegment, 0, i24);
        if (i11 < 4) {
            iArr[i10 - 1] = i12;
        }
        return this._symbols.addName(str, iArr, i10);
    }

    public final String J(int i10, int i11) throws JsonParseException {
        int iR = r(i10, i11);
        String strFindName = this._symbols.findName(iR);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = iR;
        return I(1, i11, iArr);
    }

    public final String K(int i10, int i11, int i12) throws JsonParseException {
        int iR = r(i11, i12);
        String strFindName = this._symbols.findName(i10, iR);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        iArr[1] = iR;
        return I(2, i12, iArr);
    }

    public final String L(int i10, int i11, int i12, int i13) throws JsonParseException {
        int iR = r(i12, i13);
        String strFindName = this._symbols.findName(i10, i11, iR);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = r(iR, i13);
        return I(3, i13, iArr);
    }

    public final String M(int i10, int i11, int i12, int[] iArr) throws JsonParseException {
        if (i10 >= iArr.length) {
            iArr = ParserBase.growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = r(i11, i12);
        String strFindName = this._symbols.findName(iArr, i13);
        return strFindName == null ? I(i13, i12, iArr) : strFindName;
    }

    public final int N() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        return bArr[i10] & 255;
    }

    public final String O(int i10, int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        iArr[1] = i11;
        return parseEscapedName(iArr, 2, i12, i13, i14);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            int i11 = bArr[i10] & 255;
            if (i11 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i11);
                if (iDecodeBase64Char < 0) {
                    if (i11 == 34) {
                        return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, i11, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                int i13 = bArr2[i12] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i13);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i13, 1);
                }
                int i14 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                int i16 = bArr3[i15] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i16);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i16 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.append(i14 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i16, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i17 = this._inputPtr;
                        this._inputPtr = i17 + 1;
                        int i18 = bArr4[i17] & 255;
                        if (!base64Variant.usesPaddingChar(i18) && _decodeBase64Escape(base64Variant, i18, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i18, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        byteArrayBuilder_getByteArrayBuilder.append(i14 >> 4);
                    }
                }
                int i19 = (i14 << 6) | iDecodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i20 = this._inputPtr;
                this._inputPtr = i20 + 1;
                int i21 = bArr5[i20] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i21);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i21 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i19 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, i21, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i19 >> 2);
                    }
                }
                byteArrayBuilder_getByteArrayBuilder.appendThreeBytes((i19 << 6) | iDecodeBase64Char4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public int _decodeCharForError(int i10) throws IOException {
        char c10;
        int iN;
        int i11;
        int iN2;
        int i12;
        int iN3;
        int i13 = i10 & 255;
        if (i13 <= 127) {
            return i13;
        }
        if ((i10 & 224) != 192) {
            if ((i10 & 240) == 224) {
                i13 = i10 & 15;
                c10 = 2;
            } else if ((i10 & 248) == 240) {
                i13 = i10 & 7;
                c10 = 3;
            } else {
                _reportInvalidInitial(i10 & 255);
            }
            iN = N();
            if ((iN & 192) != 128) {
                _reportInvalidOther(iN & 255);
            }
            i11 = (i13 << 6) | (iN & 63);
            if (c10 > 1) {
                return i11;
            }
            iN2 = N();
            if ((iN2 & 192) != 128) {
                _reportInvalidOther(iN2 & 255);
            }
            i12 = (i11 << 6) | (iN2 & 63);
            if (c10 > 2) {
                return i12;
            }
            iN3 = N();
            if ((iN3 & 192) != 128) {
                _reportInvalidOther(iN3 & 255);
            }
            return (i12 << 6) | (iN3 & 63);
        }
        i13 = i10 & 31;
        c10 = 1;
        iN = N();
        if ((iN & 192) != 128) {
            _reportInvalidOther(iN & 255);
        }
        i11 = (i13 << 6) | (iN & 63);
        if (c10 > 1) {
            return i11;
        }
        iN2 = N();
        if ((iN2 & 192) != 128) {
            _reportInvalidOther(iN2 & 255);
        }
        i12 = (i11 << 6) | (iN2 & 63);
        if (c10 > 2) {
            return i12;
        }
        iN3 = N();
        if ((iN3 & 192) != 128) {
            _reportInvalidOther(iN3 & 255);
        }
        return (i12 << 6) | (iN3 & 63);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 == 34 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            byte b11 = bArr2[i13];
            int iCharToHex = CharTypes.charToHex(b11);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(b11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | iCharToHex;
        }
        return (char) i11;
    }

    public String _finishAndReturnString() throws IOException {
        int i10 = this._inputPtr;
        if (i10 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i10 = this._inputPtr;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i10);
        byte[] bArr = this._inputBuffer;
        int i11 = 0;
        while (i10 < iMin) {
            int i12 = bArr[i10] & 255;
            if (f43088q0[i12] != 0) {
                if (i12 != 34) {
                    break;
                }
                this._inputPtr = i10 + 1;
                return this._textBuffer.setCurrentAndReturn(i11);
            }
            i10++;
            cArrEmptyAndGetCurrentSegment[i11] = (char) i12;
            i11++;
        }
        this._inputPtr = i10;
        n(i11, cArrEmptyAndGetCurrentSegment);
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _finishString() throws IOException {
        int i10 = this._inputPtr;
        if (i10 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i10 = this._inputPtr;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i10);
        byte[] bArr = this._inputBuffer;
        int i11 = 0;
        while (i10 < iMin) {
            int i12 = bArr[i10] & 255;
            if (f43088q0[i12] != 0) {
                if (i12 != 34) {
                    break;
                }
                this._inputPtr = i10 + 1;
                this._textBuffer.setCurrentLength(i11);
                return;
            }
            i10++;
            cArrEmptyAndGetCurrentSegment[i11] = (char) i12;
            i11++;
        }
        this._inputPtr = i10;
        n(i11, cArrEmptyAndGetCurrentSegment);
    }

    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            return (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString();
        }
        return this._parsingContext.getCurrentName();
    }

    public JsonToken _handleApos() throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        byte[] bArr = this._inputBuffer;
        int i10 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i10 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            int i11 = this._inputEnd;
            int length = (cArrEmptyAndGetCurrentSegment.length - i10) + this._inputPtr;
            if (length < i11) {
                i11 = length;
            }
            while (true) {
                int i12 = this._inputPtr;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i12 + 1;
                this._inputPtr = i13;
                int i_decodeEscaped = bArr[i12] & 255;
                int[] iArr = f43088q0;
                if (i_decodeEscaped == 39 || iArr[i_decodeEscaped] != 0) {
                    if (i_decodeEscaped != 39) {
                        int i14 = iArr[i_decodeEscaped];
                        if (i14 == 1) {
                            i_decodeEscaped = _decodeEscaped();
                        } else if (i14 == 2) {
                            i_decodeEscaped = g(i_decodeEscaped);
                        } else if (i14 == 3) {
                            i_decodeEscaped = this._inputEnd - i13 >= 2 ? l(i_decodeEscaped) : k(i_decodeEscaped);
                        } else if (i14 != 4) {
                            if (i_decodeEscaped < 32) {
                                _throwUnquotedSpace(i_decodeEscaped, "string value");
                            }
                            _reportInvalidChar(i_decodeEscaped);
                        } else {
                            int iM = m(i_decodeEscaped);
                            int i15 = i10 + 1;
                            cArrEmptyAndGetCurrentSegment[i10] = (char) ((iM >> 10) | GeneratorBase.SURR1_FIRST);
                            if (i15 >= cArrEmptyAndGetCurrentSegment.length) {
                                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                i10 = 0;
                            } else {
                                i10 = i15;
                            }
                            i_decodeEscaped = 56320 | (iM & 1023);
                        }
                        if (i10 >= cArrEmptyAndGetCurrentSegment.length) {
                            cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i10 = 0;
                        }
                        cArrEmptyAndGetCurrentSegment[i10] = (char) i_decodeEscaped;
                        i10++;
                        break;
                    }
                    this._textBuffer.setCurrentLength(i10);
                    return JsonToken.VALUE_STRING;
                }
                cArrEmptyAndGetCurrentSegment[i10] = (char) i_decodeEscaped;
                i10++;
            }
        }
    }

    public JsonToken _handleInvalidNumberStart(int i10, boolean z10) throws IOException {
        String str;
        while (i10 == 73) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this._inputBuffer;
            int i11 = this._inputPtr;
            this._inputPtr = i11 + 1;
            i10 = bArr[i11];
            if (i10 != 78) {
                if (i10 != 110) {
                    break;
                }
                str = z10 ? "-Infinity" : "+Infinity";
            } else {
                str = z10 ? "-INF" : "+INF";
            }
            _matchToken(str, 3);
            if (isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                return resetAsNaN(str, z10 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        reportUnexpectedNumberChar(i10, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    public String _handleOddName(int i10) throws IOException {
        if (i10 == 39 && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar((char) _decodeCharForError(i10), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i10] != 0) {
            _reportUnexpectedChar(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrGrowArrayBy = this._quadBuffer;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i11 < 4) {
                i11++;
                i13 = i10 | (i13 << 8);
            } else {
                if (i12 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i12] = i13;
                i13 = i10;
                i12++;
                i11 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i14 = this._inputPtr;
            i10 = bArr[i14] & 255;
            if (inputCodeUtf8JsNames[i10] != 0) {
                break;
            }
            this._inputPtr = i14 + 1;
        }
        if (i11 > 0) {
            if (i12 >= iArrGrowArrayBy.length) {
                iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                this._quadBuffer = iArrGrowArrayBy;
            }
            iArrGrowArrayBy[i12] = i13;
            i12++;
        }
        String strFindName = this._symbols.findName(iArrGrowArrayBy, i12);
        return strFindName == null ? I(i12, i11, iArrGrowArrayBy) : strFindName;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L95
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L7b
            r0 = 78
            if (r4 == r0) goto L61
            r0 = 93
            if (r4 == r0) goto L42
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L5b
            r0 = 43
            if (r4 == r0) goto L1f
            r0 = 44
            if (r4 == r0) goto L4b
            goto La2
        L1f:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L30
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L30
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L30:
            byte[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L42:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L4b
            goto La2
        L4b:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L5b
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L5b:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L95
        L61:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L75
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L75:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto La2
        L7b:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L8f
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L8f:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto La2
        L95:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto La2
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        La2:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lbc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r0, r1)
        Lbc:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final boolean _loadMore() throws IOException {
        byte[] bArr;
        int length;
        int i10 = this._inputEnd;
        this._currInputProcessed += (long) i10;
        this._currInputRowStart -= i10;
        this._nameStartOffset -= i10;
        InputStream inputStream = this._inputStream;
        if (inputStream == null || (length = (bArr = this._inputBuffer).length) == 0) {
            return false;
        }
        int i11 = inputStream.read(bArr, 0, length);
        if (i11 > 0) {
            this._inputPtr = 0;
            this._inputEnd = i11;
            return true;
        }
        _closeInput();
        if (i11 == 0) {
            throw new IOException(a.c(new StringBuilder("InputStream.read() returned 0 characters when trying to read "), this._inputBuffer.length, " bytes"));
        }
        return false;
    }

    public void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    public final void _matchFalse() throws IOException {
        int i10;
        int i11 = this._inputPtr;
        if (i11 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i12 = i11 + 1;
            if (bArr[i11] == 97) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 115) {
                        int i15 = i11 + 4;
                        if (bArr[i14] == 101 && ((i10 = bArr[i15] & 255) < 48 || i10 == 93 || i10 == 125)) {
                            this._inputPtr = i15;
                            return;
                        }
                    }
                }
            }
        }
        o(1, "false");
    }

    public final void _matchNull() throws IOException {
        int i10;
        int i11 = this._inputPtr;
        if (i11 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i12 = i11 + 1;
            if (bArr[i11] == 117) {
                int i13 = i11 + 2;
                if (bArr[i12] == 108) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 108 && ((i10 = bArr[i14] & 255) < 48 || i10 == 93 || i10 == 125)) {
                        this._inputPtr = i14;
                        return;
                    }
                }
            }
        }
        o(1, AbstractJsonLexerKt.NULL);
    }

    public final void _matchToken(String str, int i10) throws IOException {
        int i11;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            o(i10, str);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i10)) {
                _reportInvalidToken(str.substring(0, i10));
            }
            i11 = this._inputPtr + 1;
            this._inputPtr = i11;
            i10++;
        } while (i10 < length);
        int i12 = this._inputBuffer[i11] & 255;
        if (i12 < 48 || i12 == 93 || i12 == 125 || !Character.isJavaIdentifierPart((char) _decodeCharForError(i12))) {
            return;
        }
        _reportInvalidToken(str.substring(0, i10));
    }

    public final void _matchTrue() throws IOException {
        int i10;
        int i11 = this._inputPtr;
        if (i11 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i12 = i11 + 1;
            if (bArr[i11] == 114) {
                int i13 = i11 + 2;
                if (bArr[i12] == 117) {
                    int i14 = i11 + 3;
                    if (bArr[i13] == 101 && ((i10 = bArr[i14] & 255) < 48 || i10 == 93 || i10 == 125)) {
                        this._inputPtr = i14;
                        return;
                    }
                }
            }
        }
        o(1, "true");
    }

    public String _parseAposName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        int i_decodeEscaped = bArr[i10] & 255;
        if (i_decodeEscaped == 39) {
            return "";
        }
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] iArr = _icLatin1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i_decodeEscaped != 39) {
            if (iArr[i_decodeEscaped] != 0 && i_decodeEscaped != 34) {
                if (i_decodeEscaped != 92) {
                    _throwUnquotedSpace(i_decodeEscaped, "name");
                } else {
                    i_decodeEscaped = _decodeEscaped();
                }
                if (i_decodeEscaped > 127) {
                    if (i11 >= 4) {
                        if (i12 >= iArrGrowArrayBy.length) {
                            iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                            this._quadBuffer = iArrGrowArrayBy;
                        }
                        iArrGrowArrayBy[i12] = i13;
                        i13 = 0;
                        i12++;
                        i11 = 0;
                    }
                    if (i_decodeEscaped < 2048) {
                        i13 = (i13 << 8) | (i_decodeEscaped >> 6) | 192;
                        i11++;
                    } else {
                        int i14 = (i13 << 8) | (i_decodeEscaped >> 12) | 224;
                        int i15 = i11 + 1;
                        if (i15 >= 4) {
                            if (i12 >= iArrGrowArrayBy.length) {
                                iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                                this._quadBuffer = iArrGrowArrayBy;
                            }
                            iArrGrowArrayBy[i12] = i14;
                            i14 = 0;
                            i12++;
                            i15 = 0;
                        }
                        i13 = (i14 << 8) | ((i_decodeEscaped >> 6) & 63) | 128;
                        i11 = i15 + 1;
                    }
                    i_decodeEscaped = (i_decodeEscaped & 63) | 128;
                }
            }
            if (i11 < 4) {
                i11++;
                i13 = i_decodeEscaped | (i13 << 8);
            } else {
                if (i12 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i12] = i13;
                i13 = i_decodeEscaped;
                i12++;
                i11 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i16 = this._inputPtr;
            this._inputPtr = i16 + 1;
            i_decodeEscaped = bArr2[i16] & 255;
        }
        if (i11 > 0) {
            if (i12 >= iArrGrowArrayBy.length) {
                iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                this._quadBuffer = iArrGrowArrayBy;
            }
            iArrGrowArrayBy[i12] = r(i13, i11);
            i12++;
        }
        String strFindName = this._symbols.findName(iArrGrowArrayBy, i12);
        return strFindName == null ? I(i12, i11, iArrGrowArrayBy) : strFindName;
    }

    public final String _parseName(int i10) throws IOException {
        if (i10 != 34) {
            return _handleOddName(i10);
        }
        int i11 = this._inputPtr;
        if (i11 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        int i13 = bArr[i11] & 255;
        if (iArr[i13] != 0) {
            return i13 == 34 ? "" : parseEscapedName(this._quadBuffer, 0, 0, i13, 0);
        }
        int i14 = i11 + 2;
        this._inputPtr = i14;
        int i15 = bArr[i12] & 255;
        if (iArr[i15] != 0) {
            return i15 == 34 ? J(i13, 1) : parseEscapedName(this._quadBuffer, 0, i13, i15, 1);
        }
        int i16 = i15 | (i13 << 8);
        int i17 = i11 + 3;
        this._inputPtr = i17;
        int i18 = bArr[i14] & 255;
        if (iArr[i18] != 0) {
            return i18 == 34 ? J(i16, 2) : parseEscapedName(this._quadBuffer, 0, i16, i18, 2);
        }
        int i19 = (i16 << 8) | i18;
        int i20 = i11 + 4;
        this._inputPtr = i20;
        int i21 = bArr[i17] & 255;
        if (iArr[i21] != 0) {
            return i21 == 34 ? J(i19, 3) : parseEscapedName(this._quadBuffer, 0, i19, i21, 3);
        }
        int i22 = (i19 << 8) | i21;
        this._inputPtr = i11 + 5;
        int i23 = bArr[i20] & 255;
        if (iArr[i23] != 0) {
            return i23 == 34 ? J(i22, 4) : parseEscapedName(this._quadBuffer, 0, i22, i23, 4);
        }
        this.f43089p0 = i22;
        return parseMediumName(i23);
    }

    public JsonToken _parseNegNumber() throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = '-';
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        int iG = bArr[i10] & 255;
        if (iG <= 48) {
            if (iG != 48) {
                return _handleInvalidNumberStart(iG, true);
            }
            iG = G();
        } else if (iG > 57) {
            return _handleInvalidNumberStart(iG, true);
        }
        cArrEmptyAndGetCurrentSegment[1] = (char) iG;
        int i11 = 2;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - 2);
        int i12 = 1;
        while (true) {
            int i13 = this._inputPtr;
            if (i13 >= iMin) {
                return t(cArrEmptyAndGetCurrentSegment, i11, i12, true);
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i13 + 1;
            int i14 = bArr2[i13] & 255;
            if (i14 < 48 || i14 > 57) {
                if (i14 == 46 || i14 == 101 || i14 == 69) {
                    return s(cArrEmptyAndGetCurrentSegment, i11, i14, true, i12);
                }
                this._inputPtr = i13;
                this._textBuffer.setCurrentLength(i11);
                if (this._parsingContext.inRoot()) {
                    H(i14);
                }
                return resetInt(true, i12);
            }
            i12++;
            cArrEmptyAndGetCurrentSegment[i11] = (char) i14;
            i11++;
        }
    }

    public JsonToken _parsePosNumber(int i10) throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i10 == 48) {
            i10 = G();
        }
        cArrEmptyAndGetCurrentSegment[0] = (char) i10;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - 1);
        int i11 = 1;
        int i12 = 1;
        while (true) {
            int i13 = this._inputPtr;
            if (i13 >= iMin) {
                return t(cArrEmptyAndGetCurrentSegment, i11, i12, false);
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i13 + 1;
            int i14 = bArr[i13] & 255;
            if (i14 < 48 || i14 > 57) {
                if (i14 == 46 || i14 == 101 || i14 == 69) {
                    return s(cArrEmptyAndGetCurrentSegment, i11, i14, false, i12);
                }
                this._inputPtr = i13;
                this._textBuffer.setCurrentLength(i11);
                if (this._parsingContext.inRoot()) {
                    H(i14);
                }
                return resetInt(false, i12);
            }
            i12++;
            cArrEmptyAndGetCurrentSegment[i11] = (char) i14;
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c A[DONT_INVERT, PHI: r10
      0x003c: PHI (r10v4 int) = (r10v3 int), (r10v24 int) binds: [B:9:0x002d, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[EDGE_INSN: B:56:0x0122->B:57:0x012a BREAK  A[LOOP:0: B:3:0x000e->B:77:0x000e]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x010f A[SYNTHETIC] */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i10;
        int i11;
        int iDecodeBase64Char;
        int i12;
        int i13;
        int iDecodeBase64Char2;
        int i14;
        int i15;
        int iDecodeBase64Char3;
        int i16;
        int i17 = 3;
        int length = bArr.length - 3;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i20 = this._inputPtr;
            this._inputPtr = i20 + 1;
            int i21 = bArr2[i20] & 255;
            if (i21 > 32) {
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i21);
                if (iDecodeBase64Char4 < 0) {
                    if (i21 == 34) {
                        break;
                    }
                    iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, i21, 0);
                    if (iDecodeBase64Char4 >= 0) {
                        if (i18 > length) {
                            i19 += i18;
                            outputStream.write(bArr, 0, i18);
                            i18 = 0;
                        }
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr3 = this._inputBuffer;
                        int i22 = this._inputPtr;
                        this._inputPtr = i22 + 1;
                        i11 = bArr3[i22] & 255;
                        iDecodeBase64Char = base64Variant.decodeBase64Char(i11);
                        if (iDecodeBase64Char < 0) {
                            iDecodeBase64Char = _decodeBase64Escape(base64Variant, i11, 1);
                        }
                        i12 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i23 = this._inputPtr;
                        this._inputPtr = i23 + 1;
                        i13 = bArr4[i23] & 255;
                        iDecodeBase64Char2 = base64Variant.decodeBase64Char(i13);
                        if (iDecodeBase64Char2 >= 0) {
                            if (iDecodeBase64Char2 != -2) {
                                if (i13 == 34) {
                                    int i24 = i18 + 1;
                                    bArr[i18] = (byte) (i12 >> 4);
                                    if (base64Variant.usesPadding()) {
                                        this._inputPtr--;
                                        _handleBase64MissingPadding(base64Variant);
                                    }
                                    i18 = i24;
                                    break;
                                }
                                iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i13, 2);
                            }
                            if (iDecodeBase64Char2 == -2) {
                                if (this._inputPtr >= this._inputEnd) {
                                    _loadMoreGuaranteed();
                                }
                                byte[] bArr5 = this._inputBuffer;
                                int i25 = this._inputPtr;
                                this._inputPtr = i25 + 1;
                                i16 = bArr5[i25] & 255;
                                if (base64Variant.usesPaddingChar(i16)) {
                                }
                                bArr[i18] = (byte) (i12 >> 4);
                                i18++;
                            }
                        }
                        i14 = (i12 << 6) | iDecodeBase64Char2;
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr6 = this._inputBuffer;
                        int i26 = this._inputPtr;
                        this._inputPtr = i26 + 1;
                        i15 = bArr6[i26] & 255;
                        iDecodeBase64Char3 = base64Variant.decodeBase64Char(i15);
                        if (iDecodeBase64Char3 < 0) {
                            if (iDecodeBase64Char3 != -2) {
                                i10 = 3;
                            } else {
                                if (i15 == 34) {
                                    int i27 = i18 + 1;
                                    bArr[i18] = (byte) (i14 >> 10);
                                    i18 += 2;
                                    bArr[i27] = (byte) (i14 >> 2);
                                    if (base64Variant.usesPadding()) {
                                        break;
                                    }
                                    this._inputPtr--;
                                    _handleBase64MissingPadding(base64Variant);
                                    break;
                                }
                                i10 = 3;
                                iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i15, 3);
                            }
                            if (iDecodeBase64Char3 == -2) {
                                int i28 = i18 + 1;
                                bArr[i18] = (byte) (i14 >> 10);
                                i18 += 2;
                                bArr[i28] = (byte) (i14 >> 2);
                            }
                            i17 = i10;
                        } else {
                            i10 = 3;
                        }
                        int i29 = (i14 << 6) | iDecodeBase64Char3;
                        bArr[i18] = (byte) (i29 >> 16);
                        int i30 = i18 + 2;
                        bArr[i18 + 1] = (byte) (i29 >> 8);
                        i18 += 3;
                        bArr[i30] = (byte) i29;
                        i17 = i10;
                    }
                } else {
                    if (i18 > length) {
                        i19 += i18;
                        outputStream.write(bArr, 0, i18);
                        i18 = 0;
                    }
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    byte[] bArr7 = this._inputBuffer;
                    int i210 = this._inputPtr;
                    this._inputPtr = i210 + 1;
                    i11 = bArr7[i210] & 255;
                    iDecodeBase64Char = base64Variant.decodeBase64Char(i11);
                    if (iDecodeBase64Char < 0) {
                        iDecodeBase64Char = _decodeBase64Escape(base64Variant, i11, 1);
                    }
                    i12 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    byte[] bArr8 = this._inputBuffer;
                    int i211 = this._inputPtr;
                    this._inputPtr = i211 + 1;
                    i13 = bArr8[i211] & 255;
                    iDecodeBase64Char2 = base64Variant.decodeBase64Char(i13);
                    if (iDecodeBase64Char2 >= 0) {
                        if (iDecodeBase64Char2 != -2) {
                            if (i13 == 34) {
                                int i212 = i18 + 1;
                                bArr[i18] = (byte) (i12 >> 4);
                                if (base64Variant.usesPadding()) {
                                    this._inputPtr--;
                                    _handleBase64MissingPadding(base64Variant);
                                }
                                i18 = i212;
                                break;
                            }
                            iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i13, 2);
                        }
                        if (iDecodeBase64Char2 == -2) {
                            if (this._inputPtr >= this._inputEnd) {
                                _loadMoreGuaranteed();
                            }
                            byte[] bArr9 = this._inputBuffer;
                            int i213 = this._inputPtr;
                            this._inputPtr = i213 + 1;
                            i16 = bArr9[i213] & 255;
                            if (base64Variant.usesPaddingChar(i16) && _decodeBase64Escape(base64Variant, i16, i17) != -2) {
                                throw reportInvalidBase64Char(base64Variant, i16, i17, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                            }
                            bArr[i18] = (byte) (i12 >> 4);
                            i18++;
                        }
                    }
                    i14 = (i12 << 6) | iDecodeBase64Char2;
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    byte[] bArr10 = this._inputBuffer;
                    int i214 = this._inputPtr;
                    this._inputPtr = i214 + 1;
                    i15 = bArr10[i214] & 255;
                    iDecodeBase64Char3 = base64Variant.decodeBase64Char(i15);
                    if (iDecodeBase64Char3 < 0) {
                        if (iDecodeBase64Char3 != -2) {
                            i10 = 3;
                        } else {
                            if (i15 == 34) {
                                int i215 = i18 + 1;
                                bArr[i18] = (byte) (i14 >> 10);
                                i18 += 2;
                                bArr[i215] = (byte) (i14 >> 2);
                                if (base64Variant.usesPadding()) {
                                    break;
                                }
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                                break;
                            }
                            i10 = 3;
                            iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i15, 3);
                        }
                        if (iDecodeBase64Char3 == -2) {
                            int i216 = i18 + 1;
                            bArr[i18] = (byte) (i14 >> 10);
                            i18 += 2;
                            bArr[i216] = (byte) (i14 >> 2);
                        }
                        i17 = i10;
                    } else {
                        i10 = 3;
                    }
                    int i217 = (i14 << 6) | iDecodeBase64Char3;
                    bArr[i18] = (byte) (i217 >> 16);
                    int i31 = i18 + 2;
                    bArr[i18 + 1] = (byte) (i217 >> 8);
                    i18 += 3;
                    bArr[i31] = (byte) i217;
                    i17 = i10;
                }
            }
            i10 = i17;
            i17 = i10;
        }
        this._tokenIncomplete = false;
        if (i18 <= 0) {
            return i19;
        }
        int i32 = i19 + i18;
        outputStream.write(bArr, 0, i18);
        return i32;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        byte[] bArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (bArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = ParserMinimalBase.NO_BYTES;
        this._ioContext.releaseReadIOBuffer(bArr);
    }

    public void _reportInvalidChar(int i10) throws JsonParseException {
        if (i10 < 32) {
            _throwInvalidSpace(i10);
        }
        _reportInvalidInitial(i10);
    }

    public void _reportInvalidInitial(int i10) throws JsonParseException {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i10));
    }

    public void _reportInvalidOther(int i10) throws JsonParseException {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
    }

    public void _reportInvalidToken(String str, int i10) throws IOException {
        this._inputPtr = i10;
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
    }

    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            if (bArr[i10] == 10) {
                this._inputPtr = i10 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public void _skipString() throws IOException {
        this._tokenIncomplete = false;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i10 = this._inputPtr;
            int i11 = this._inputEnd;
            if (i10 >= i11) {
                _loadMoreGuaranteed();
                i10 = this._inputPtr;
                i11 = this._inputEnd;
            }
            while (true) {
                if (i10 >= i11) {
                    this._inputPtr = i10;
                    break;
                }
                int i12 = i10 + 1;
                int i13 = bArr[i10] & 255;
                int i14 = f43088q0[i13];
                if (i14 != 0) {
                    this._inputPtr = i12;
                    if (i13 != 34) {
                        if (i14 == 1) {
                            _decodeEscaped();
                            break;
                        }
                        if (i14 == 2) {
                            y();
                            break;
                        }
                        if (i14 == 3) {
                            z();
                            break;
                        }
                        if (i14 == 4) {
                            A();
                            break;
                        } else if (i13 >= 32) {
                            _reportInvalidChar(i13);
                            break;
                        } else {
                            _throwUnquotedSpace(i13, "string value");
                            break;
                        }
                    }
                    return;
                }
                i10 = i12;
            }
        }
    }

    public final void b() throws JsonParseException {
        F();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, AbstractJsonLexerKt.END_OBJ);
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    public final void e() throws JsonParseException {
        F();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, AbstractJsonLexerKt.END_LIST);
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    public final JsonToken f(int i10) throws JsonParseException {
        if (i10 == 125) {
            e();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        b();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() throws IOException {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    public final int g(int i10) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b10 = bArr[i11];
        if ((b10 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b10 & 255, i12);
        }
        return ((i10 & 31) << 6) | (b10 & 63);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e5) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e5.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
            this._binaryValue = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) this._inputPtr), -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._inputStream;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            if (iId != 6) {
                if (iId != 7 && iId != 8) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (iId != 6) {
            if (iId != 7 && iId != 8) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getTextOffset() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_getSourceReference(), this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) (this._nameStartOffset - 1)), -1L, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        int i10 = this._numTypesValid;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return _parseIntValue();
            }
            if ((i10 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    public final int k(int i10) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i11 = i10 & 15;
        byte[] bArr = this._inputBuffer;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        byte b10 = bArr[i12];
        if ((b10 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b10 & 255, i13);
        }
        int i14 = (i11 << 6) | (b10 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i15 = this._inputPtr;
        int i16 = i15 + 1;
        this._inputPtr = i16;
        byte b11 = bArr2[i15];
        if ((b11 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b11 & 255, i16);
        }
        return (i14 << 6) | (b11 & 63);
    }

    public final int l(int i10) throws IOException {
        int i11 = i10 & 15;
        byte[] bArr = this._inputBuffer;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        byte b10 = bArr[i12];
        if ((b10 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b10 & 255, i13);
        }
        int i14 = (i11 << 6) | (b10 & 63);
        byte[] bArr2 = this._inputBuffer;
        int i15 = this._inputPtr;
        int i16 = i15 + 1;
        this._inputPtr = i16;
        byte b11 = bArr2[i15];
        if ((b11 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b11 & 255, i16);
        }
        return (i14 << 6) | (b11 & 63);
    }

    public final int m(int i10) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b10 = bArr[i11];
        if ((b10 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b10 & 255, i12);
        }
        int i13 = ((i10 & 7) << 6) | (b10 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        byte b11 = bArr2[i14];
        if ((b11 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b11 & 255, i15);
        }
        int i16 = (i13 << 6) | (b11 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i17 = this._inputPtr;
        int i18 = i17 + 1;
        this._inputPtr = i18;
        byte b12 = bArr3[i17];
        if ((b12 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b12 & 255, i18);
        }
        return ((i16 << 6) | (b12 & 63)) - 65536;
    }

    public final void n(int i10, char[] cArr) throws IOException {
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i11 = this._inputPtr;
            }
            int i12 = 0;
            if (i10 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            int iMin = Math.min(this._inputEnd, (cArr.length - i10) + i11);
            while (true) {
                if (i11 >= iMin) {
                    this._inputPtr = i11;
                    break;
                }
                int i13 = i11 + 1;
                int i_decodeEscaped = bArr[i11] & 255;
                int i14 = f43088q0[i_decodeEscaped];
                if (i14 != 0) {
                    this._inputPtr = i13;
                    if (i_decodeEscaped != 34) {
                        if (i14 == 1) {
                            i_decodeEscaped = _decodeEscaped();
                        } else if (i14 == 2) {
                            i_decodeEscaped = g(i_decodeEscaped);
                        } else if (i14 == 3) {
                            i_decodeEscaped = this._inputEnd - i13 >= 2 ? l(i_decodeEscaped) : k(i_decodeEscaped);
                        } else if (i14 == 4) {
                            int iM = m(i_decodeEscaped);
                            int i15 = i10 + 1;
                            cArr[i10] = (char) ((iM >> 10) | GeneratorBase.SURR1_FIRST);
                            if (i15 >= cArr.length) {
                                cArr = this._textBuffer.finishCurrentSegment();
                                i10 = 0;
                            } else {
                                i10 = i15;
                            }
                            i_decodeEscaped = (iM & 1023) | 56320;
                        } else if (i_decodeEscaped < 32) {
                            _throwUnquotedSpace(i_decodeEscaped, "string value");
                        } else {
                            _reportInvalidChar(i_decodeEscaped);
                        }
                        if (i10 >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                        } else {
                            i12 = i10;
                        }
                        i10 = i12 + 1;
                        cArr[i12] = (char) i_decodeEscaped;
                        break;
                    }
                    this._textBuffer.setCurrentLength(i10);
                    return;
                }
                cArr[i10] = (char) i_decodeEscaped;
                i11 = i13;
                i10++;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Boolean nextBooleanValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            JsonToken jsonTokenNextToken = nextToken();
            if (jsonTokenNextToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonTokenNextToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (jsonToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f2 A[PHI: r1
      0x00f2: PHI (r1v22 int) = (r1v21 int), (r1v20 int), (r1v20 int), (r1v20 int) binds: [B:58:0x00f1, B:52:0x00e2, B:48:0x00d9, B:49:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0124 A[PHI: r1
      0x0124: PHI (r1v5 int) = (r1v4 int), (r1v3 int), (r1v3 int), (r1v3 int) binds: [B:76:0x0123, B:70:0x0114, B:66:0x010b, B:67:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        JsonToken jsonToken_parseNegNumber;
        int iV;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            p();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int iD = D();
        if (iD < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (iD == 93) {
            b();
            this._currToken = JsonToken.END_ARRAY;
            return false;
        }
        if (iD == 125) {
            e();
            this._currToken = JsonToken.END_OBJECT;
            return false;
        }
        if (this._parsingContext.expectComma()) {
            if (iD != 44) {
                _reportUnexpectedChar(iD, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            iD = B();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (iD == 93 || iD == 125)) {
                f(iD);
                return false;
            }
        }
        if (!this._parsingContext.inObject()) {
            F();
            q(iD);
            return false;
        }
        this._nameStartRow = this._currInputRow;
        int i10 = this._inputPtr;
        this._nameStartOffset = i10;
        this._nameStartCol = i10 - this._currInputRowStart;
        if (iD == 34) {
            byte[] bArrAsQuotedUTF8 = serializableString.asQuotedUTF8();
            int length = bArrAsQuotedUTF8.length;
            int i11 = this._inputPtr;
            int i12 = length + i11;
            if (i12 + 4 < this._inputEnd && this._inputBuffer[i12] == 34) {
                int i13 = 0;
                while (true) {
                    if (i11 == i12) {
                        this._parsingContext.setCurrentName(serializableString.getValue());
                        byte[] bArr = this._inputBuffer;
                        int i14 = i11 + 2;
                        byte b10 = bArr[i11 + 1];
                        if (b10 == 58) {
                            int i15 = i11 + 3;
                            iV = bArr[i14];
                            if (iV > 32) {
                                if (iV == 47 || iV == 35) {
                                    this._inputPtr = i15 - 1;
                                    iV = v(true);
                                } else {
                                    this._inputPtr = i15;
                                }
                            } else if (iV == 32 || iV == 9) {
                                int i16 = i11 + 4;
                                iV = bArr[i15];
                                if (iV <= 32 || iV == 47 || iV == 35) {
                                    i15 = i16;
                                    this._inputPtr = i15 - 1;
                                    iV = v(true);
                                } else {
                                    this._inputPtr = i16;
                                }
                            } else {
                                this._inputPtr = i15 - 1;
                                iV = v(true);
                            }
                        } else {
                            if (b10 == 32 || b10 == 9) {
                                b10 = bArr[i14];
                                i14 = i11 + 3;
                            }
                            if (b10 == 58) {
                                int i17 = i14 + 1;
                                iV = bArr[i14];
                                if (iV > 32) {
                                    if (iV == 47 || iV == 35) {
                                        this._inputPtr = i17 - 1;
                                        iV = v(true);
                                    } else {
                                        this._inputPtr = i17;
                                    }
                                } else if (iV == 32 || iV == 9) {
                                    int i18 = i14 + 2;
                                    iV = bArr[i17];
                                    if (iV <= 32 || iV == 47 || iV == 35) {
                                        i17 = i18;
                                        this._inputPtr = i17 - 1;
                                        iV = v(true);
                                    } else {
                                        this._inputPtr = i18;
                                    }
                                } else {
                                    this._inputPtr = i17 - 1;
                                    iV = v(true);
                                }
                            } else {
                                this._inputPtr = i14 - 1;
                                iV = v(false);
                            }
                        }
                        this._currToken = JsonToken.FIELD_NAME;
                        F();
                        if (iV == 34) {
                            this._tokenIncomplete = true;
                            this._nextToken = JsonToken.VALUE_STRING;
                        } else if (iV == 45) {
                            this._nextToken = _parseNegNumber();
                        } else if (iV == 91) {
                            this._nextToken = JsonToken.START_ARRAY;
                        } else if (iV == 102) {
                            _matchFalse();
                            this._nextToken = JsonToken.VALUE_FALSE;
                        } else if (iV == 110) {
                            _matchNull();
                            this._nextToken = JsonToken.VALUE_NULL;
                        } else if (iV == 116) {
                            _matchTrue();
                            this._nextToken = JsonToken.VALUE_TRUE;
                        } else if (iV != 123) {
                            switch (iV) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                    this._nextToken = _parsePosNumber(iV);
                                    break;
                                default:
                                    this._nextToken = _handleUnexpectedValue(iV);
                                    break;
                            }
                        } else {
                            this._nextToken = JsonToken.START_OBJECT;
                        }
                        return true;
                    }
                    if (bArrAsQuotedUTF8[i13] != this._inputBuffer[i11]) {
                        break;
                    }
                    i13++;
                    i11++;
                }
            }
        }
        String str_parseName = _parseName(iD);
        this._parsingContext.setCurrentName(str_parseName);
        boolean zEquals = str_parseName.equals(serializableString.getValue());
        this._currToken = JsonToken.FIELD_NAME;
        int iU = u();
        F();
        if (iU == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
        } else {
            if (iU == 45) {
                jsonToken_parseNegNumber = _parseNegNumber();
            } else if (iU == 91) {
                jsonToken_parseNegNumber = JsonToken.START_ARRAY;
            } else if (iU == 102) {
                _matchFalse();
                jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
            } else if (iU == 110) {
                _matchNull();
                jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
            } else if (iU == 116) {
                _matchTrue();
                jsonToken_parseNegNumber = JsonToken.VALUE_TRUE;
            } else if (iU != 123) {
                switch (iU) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken_parseNegNumber = _parsePosNumber(iU);
                        break;
                    default:
                        jsonToken_parseNegNumber = _handleUnexpectedValue(iU);
                        break;
                }
            } else {
                jsonToken_parseNegNumber = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken_parseNegNumber;
        }
        return zEquals;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int nextIntValue(int i10) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i10;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return i10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long nextLongValue(long j10) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j10;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return j10;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            if (nextToken() == JsonToken.VALUE_STRING) {
                return getText();
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken jsonToken_parseNegNumber;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return p();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int iD = D();
        if (iD < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (iD == 93) {
            b();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (iD == 125) {
            e();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (this._parsingContext.expectComma()) {
            if (iD != 44) {
                _reportUnexpectedChar(iD, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            iD = B();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (iD == 93 || iD == 125)) {
                return f(iD);
            }
        }
        if (!this._parsingContext.inObject()) {
            F();
            return q(iD);
        }
        this._nameStartRow = this._currInputRow;
        int i10 = this._inputPtr;
        this._nameStartOffset = i10;
        this._nameStartCol = i10 - this._currInputRowStart;
        this._parsingContext.setCurrentName(_parseName(iD));
        this._currToken = jsonToken2;
        int iU = u();
        F();
        if (iU == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (iU == 45) {
            jsonToken_parseNegNumber = _parseNegNumber();
        } else if (iU == 91) {
            jsonToken_parseNegNumber = JsonToken.START_ARRAY;
        } else if (iU == 102) {
            _matchFalse();
            jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (iU == 110) {
            _matchNull();
            jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
        } else if (iU == 116) {
            _matchTrue();
            jsonToken_parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (iU != 123) {
            switch (iU) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken_parseNegNumber = _parsePosNumber(iU);
                    break;
                default:
                    jsonToken_parseNegNumber = _handleUnexpectedValue(iU);
                    break;
            }
        } else {
            jsonToken_parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken_parseNegNumber;
        return this._currToken;
    }

    public final void o(int i10, String str) throws IOException {
        int i11;
        int i12;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i10)) {
                _reportInvalidToken(str.substring(0, i10));
            }
            i11 = this._inputPtr + 1;
            this._inputPtr = i11;
            i10++;
        } while (i10 < length);
        if ((i11 < this._inputEnd || _loadMore()) && (i12 = this._inputBuffer[this._inputPtr] & 255) >= 48 && i12 != 93 && i12 != 125 && Character.isJavaIdentifierPart((char) _decodeCharForError(i12))) {
            _reportInvalidToken(str.substring(0, i10));
        }
    }

    public final JsonToken p() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final String parseEscapedName(int[] iArr, int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i12] != 0) {
                if (i12 == 34) {
                    break;
                }
                if (i12 != 92) {
                    _throwUnquotedSpace(i12, "name");
                } else {
                    i12 = _decodeEscaped();
                }
                if (i12 > 127) {
                    int i14 = 0;
                    if (i13 >= 4) {
                        if (i10 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i10] = i11;
                        i10++;
                        i11 = 0;
                        i13 = 0;
                    }
                    if (i12 < 2048) {
                        i11 = (i11 << 8) | (i12 >> 6) | 192;
                        i13++;
                    } else {
                        int i15 = (i11 << 8) | (i12 >> 12) | 224;
                        int i16 = i13 + 1;
                        if (i16 >= 4) {
                            if (i10 >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i10] = i15;
                            i10++;
                            i16 = 0;
                        } else {
                            i14 = i15;
                        }
                        i11 = (i14 << 8) | ((i12 >> 6) & 63) | 128;
                        i13 = i16 + 1;
                    }
                    i12 = (i12 & 63) | 128;
                }
            }
            if (i13 < 4) {
                i13++;
                i11 = (i11 << 8) | i12;
            } else {
                if (i10 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i10] = i11;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i17 = this._inputPtr;
            this._inputPtr = i17 + 1;
            i12 = bArr[i17] & 255;
        }
        if (i13 > 0) {
            if (i10 >= iArr.length) {
                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i10] = r(i11, i13);
            i10++;
        }
        String strFindName = this._symbols.findName(iArr, i10);
        return strFindName == null ? I(i10, i13, iArr) : strFindName;
    }

    public final String parseLongName(int i10, int i11, int i12) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this.f43089p0;
        iArr[1] = i11;
        iArr[2] = i12;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        int i13 = i10;
        int i14 = 3;
        while (true) {
            int i15 = this._inputPtr;
            if (i15 + 4 > this._inputEnd) {
                return parseEscapedName(this._quadBuffer, i14, 0, i13, 0);
            }
            int i16 = i15 + 1;
            this._inputPtr = i16;
            int i17 = bArr[i15] & 255;
            if (iArr2[i17] != 0) {
                return i17 == 34 ? M(i14, i13, 1, this._quadBuffer) : parseEscapedName(this._quadBuffer, i14, i13, i17, 1);
            }
            int i18 = (i13 << 8) | i17;
            int i19 = i15 + 2;
            this._inputPtr = i19;
            int i20 = bArr[i16] & 255;
            if (iArr2[i20] != 0) {
                return i20 == 34 ? M(i14, i18, 2, this._quadBuffer) : parseEscapedName(this._quadBuffer, i14, i18, i20, 2);
            }
            int i21 = (i18 << 8) | i20;
            int i22 = i15 + 3;
            this._inputPtr = i22;
            int i23 = bArr[i19] & 255;
            if (iArr2[i23] != 0) {
                return i23 == 34 ? M(i14, i21, 3, this._quadBuffer) : parseEscapedName(this._quadBuffer, i14, i21, i23, 3);
            }
            int i24 = (i21 << 8) | i23;
            this._inputPtr = i15 + 4;
            int i25 = bArr[i22] & 255;
            if (iArr2[i25] != 0) {
                return i25 == 34 ? M(i14, i24, 4, this._quadBuffer) : parseEscapedName(this._quadBuffer, i14, i24, i25, 4);
            }
            int[] iArr3 = this._quadBuffer;
            if (i14 >= iArr3.length) {
                this._quadBuffer = ParserBase.growArrayBy(iArr3, i14);
            }
            this._quadBuffer[i14] = i24;
            i13 = i25;
            i14++;
        }
    }

    public final String parseMediumName(int i10) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        int i13 = bArr[i11] & 255;
        if (iArr[i13] != 0) {
            if (i13 == 34) {
                return K(this.f43089p0, i10, 1);
            }
            int i14 = this.f43089p0;
            int[] iArr2 = this._quadBuffer;
            iArr2[0] = i14;
            return parseEscapedName(iArr2, 1, i10, i13, 1);
        }
        int i15 = (i10 << 8) | i13;
        int i16 = i11 + 2;
        this._inputPtr = i16;
        int i17 = bArr[i12] & 255;
        if (iArr[i17] != 0) {
            if (i17 == 34) {
                return K(this.f43089p0, i15, 2);
            }
            int i18 = this.f43089p0;
            int[] iArr3 = this._quadBuffer;
            iArr3[0] = i18;
            return parseEscapedName(iArr3, 1, i15, i17, 2);
        }
        int i19 = (i15 << 8) | i17;
        int i20 = i11 + 3;
        this._inputPtr = i20;
        int i21 = bArr[i16] & 255;
        if (iArr[i21] != 0) {
            if (i21 == 34) {
                return K(this.f43089p0, i19, 3);
            }
            int i22 = this.f43089p0;
            int[] iArr4 = this._quadBuffer;
            iArr4[0] = i22;
            return parseEscapedName(iArr4, 1, i19, i21, 3);
        }
        int i23 = (i19 << 8) | i21;
        this._inputPtr = i11 + 4;
        int i24 = bArr[i20] & 255;
        if (iArr[i24] == 0) {
            return parseMediumName2(i24, i23);
        }
        if (i24 == 34) {
            return K(this.f43089p0, i23, 4);
        }
        int i25 = this.f43089p0;
        int[] iArr5 = this._quadBuffer;
        iArr5[0] = i25;
        return parseEscapedName(iArr5, 1, i23, i24, 4);
    }

    public final String parseMediumName2(int i10, int i11) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        int i14 = bArr[i12] & 255;
        if (iArr[i14] != 0) {
            return i14 == 34 ? L(this.f43089p0, i11, i10, 1) : O(this.f43089p0, i11, i10, i14, 1);
        }
        int i15 = (i10 << 8) | i14;
        int i16 = i12 + 2;
        this._inputPtr = i16;
        int i17 = bArr[i13] & 255;
        if (iArr[i17] != 0) {
            return i17 == 34 ? L(this.f43089p0, i11, i15, 2) : O(this.f43089p0, i11, i15, i17, 2);
        }
        int i18 = (i15 << 8) | i17;
        int i19 = i12 + 3;
        this._inputPtr = i19;
        int i20 = bArr[i16] & 255;
        if (iArr[i20] != 0) {
            return i20 == 34 ? L(this.f43089p0, i11, i18, 3) : O(this.f43089p0, i11, i18, i20, 3);
        }
        int i21 = (i18 << 8) | i20;
        this._inputPtr = i12 + 4;
        int i22 = bArr[i19] & 255;
        if (iArr[i22] != 0) {
            return i22 == 34 ? L(this.f43089p0, i11, i21, 4) : O(this.f43089p0, i11, i21, i22, 4);
        }
        return parseLongName(i22, i11, i21);
    }

    public final JsonToken q(int i10) throws IOException {
        if (i10 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i10 == 45) {
            JsonToken jsonToken_parseNegNumber = _parseNegNumber();
            this._currToken = jsonToken_parseNegNumber;
            return jsonToken_parseNegNumber;
        }
        if (i10 == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i10 == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i10 == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i10 == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        }
        if (i10 == 123) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
        switch (i10) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                JsonToken jsonToken_parsePosNumber = _parsePosNumber(i10);
                this._currToken = jsonToken_parsePosNumber;
                return jsonToken_parsePosNumber;
            default:
                JsonToken jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i10);
                this._currToken = jsonToken_handleUnexpectedValue;
                return jsonToken_handleUnexpectedValue;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, bArrAllocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i10 = this._inputEnd;
        int i11 = this._inputPtr;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        outputStream.write(this._inputBuffer, i11, i12);
        return i12;
    }

    public final JsonToken s(char[] cArr, int i10, int i11, boolean z10, int i12) throws IOException {
        int i13;
        boolean z11;
        int i14 = 0;
        if (i11 == 46) {
            if (i10 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            cArr[i10] = (char) i11;
            i10++;
            i13 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z11 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                i11 = bArr[i15] & 255;
                if (i11 < 48 || i11 > 57) {
                    z11 = false;
                    break;
                }
                i13++;
                if (i10 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i10 = 0;
                }
                cArr[i10] = (char) i11;
                i10++;
            }
            if (i13 == 0) {
                reportUnexpectedNumberChar(i11, "Decimal point not followed by a digit");
            }
        } else {
            i13 = 0;
            z11 = false;
        }
        if (i11 == 101 || i11 == 69) {
            if (i10 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            int i16 = i10 + 1;
            cArr[i10] = (char) i11;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i17 = this._inputPtr;
            this._inputPtr = i17 + 1;
            int i18 = bArr2[i17] & 255;
            if (i18 == 45 || i18 == 43) {
                if (i16 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i16 = 0;
                }
                int i19 = i16 + 1;
                cArr[i16] = (char) i18;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i20 = this._inputPtr;
                this._inputPtr = i20 + 1;
                i18 = bArr3[i20] & 255;
                i16 = i19;
            }
            i11 = i18;
            int i21 = 0;
            while (true) {
                if (i11 >= 48 && i11 <= 57) {
                    i21++;
                    if (i16 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        i16 = 0;
                    }
                    int i22 = i16 + 1;
                    cArr[i16] = (char) i11;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i14 = i21;
                        z11 = true;
                        i10 = i22;
                        break;
                    }
                    byte[] bArr4 = this._inputBuffer;
                    int i23 = this._inputPtr;
                    this._inputPtr = i23 + 1;
                    i11 = bArr4[i23] & 255;
                    i16 = i22;
                } else {
                    i14 = i21;
                    i10 = i16;
                    break;
                }
            }
            if (i14 == 0) {
                reportUnexpectedNumberChar(i11, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                H(i11);
            }
        }
        this._textBuffer.setCurrentLength(i10);
        return resetFloat(z10, i12, i13, i14);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    public String slowParseName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        int i11 = bArr[i10] & 255;
        return i11 == 34 ? "" : parseEscapedName(this._quadBuffer, 0, 0, i11, 0);
    }

    public final JsonToken t(char[] cArr, int i10, int i11, boolean z10) throws IOException {
        char[] cArrFinishCurrentSegment = cArr;
        int i12 = i10;
        int i13 = i11;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                this._textBuffer.setCurrentLength(i12);
                return resetInt(z10, i13);
            }
            byte[] bArr = this._inputBuffer;
            int i14 = this._inputPtr;
            this._inputPtr = i14 + 1;
            int i15 = bArr[i14] & 255;
            if (i15 > 57 || i15 < 48) {
                if (i15 == 46 || i15 == 101 || i15 == 69) {
                    return s(cArrFinishCurrentSegment, i12, i15, z10, i13);
                }
                this._inputPtr = i14;
                this._textBuffer.setCurrentLength(i12);
                if (this._parsingContext.inRoot()) {
                    H(this._inputBuffer[this._inputPtr] & 255);
                }
                return resetInt(z10, i13);
            }
            if (i12 >= cArrFinishCurrentSegment.length) {
                i12 = 0;
                cArrFinishCurrentSegment = this._textBuffer.finishCurrentSegment();
            }
            cArrFinishCurrentSegment[i12] = (char) i15;
            i13++;
            i12++;
        }
    }

    public final int u() throws IOException {
        int i10 = this._inputPtr;
        if (i10 + 4 >= this._inputEnd) {
            return v(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b10 = bArr[i10];
        if (b10 == 58) {
            int i11 = i10 + 1;
            this._inputPtr = i11;
            byte b11 = bArr[i11];
            if (b11 > 32) {
                if (b11 == 47 || b11 == 35) {
                    return v(true);
                }
                this._inputPtr = i10 + 2;
                return b11;
            }
            if (b11 == 32 || b11 == 9) {
                int i12 = i10 + 2;
                this._inputPtr = i12;
                byte b12 = bArr[i12];
                if (b12 > 32) {
                    if (b12 == 47 || b12 == 35) {
                        return v(true);
                    }
                    this._inputPtr = i10 + 3;
                    return b12;
                }
            }
            return v(true);
        }
        if (b10 == 32 || b10 == 9) {
            int i13 = i10 + 1;
            this._inputPtr = i13;
            b10 = bArr[i13];
        }
        if (b10 != 58) {
            return v(false);
        }
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        byte b13 = bArr[i15];
        if (b13 > 32) {
            if (b13 == 47 || b13 == 35) {
                return v(true);
            }
            this._inputPtr = i14 + 2;
            return b13;
        }
        if (b13 == 32 || b13 == 9) {
            int i16 = i14 + 2;
            this._inputPtr = i16;
            byte b14 = bArr[i16];
            if (b14 > 32) {
                if (b14 == 47 || b14 == 35) {
                    return v(true);
                }
                this._inputPtr = i14 + 3;
                return b14;
            }
        }
        return v(true);
    }

    public final int v(boolean z10) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            int i12 = bArr[i10] & 255;
            if (i12 > 32) {
                if (i12 == 47) {
                    w();
                } else if (i12 == 35 && isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
                    x();
                } else {
                    if (z10) {
                        return i12;
                    }
                    if (i12 != 58) {
                        _reportUnexpectedChar(i12, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (i12 != 32) {
                if (i12 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (i12 == 13) {
                    _skipCR();
                } else if (i12 != 9) {
                    _throwInvalidSpace(i12);
                }
            }
        }
    }

    public final void w() throws IOException {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        int i11 = bArr[i10] & 255;
        if (i11 == 47) {
            x();
            return;
        }
        if (i11 != 42) {
            _reportUnexpectedChar(i11, "was expecting either '*' or '/' for a comment");
            return;
        }
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr2 = this._inputBuffer;
            int i12 = this._inputPtr;
            int i13 = i12 + 1;
            this._inputPtr = i13;
            int i14 = bArr2[i12] & 255;
            int i15 = inputCodeComment[i14];
            if (i15 != 0) {
                if (i15 == 2) {
                    y();
                } else if (i15 == 3) {
                    z();
                } else if (i15 == 4) {
                    A();
                } else if (i15 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i13;
                } else if (i15 == 13) {
                    _skipCR();
                } else if (i15 == 42) {
                    if (i13 >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    byte[] bArr3 = this._inputBuffer;
                    int i16 = this._inputPtr;
                    if (bArr3[i16] == 47) {
                        this._inputPtr = i16 + 1;
                        return;
                    }
                } else {
                    _reportInvalidChar(i14);
                }
            }
        }
        _reportInvalidEOF(" in a comment", null);
    }

    public final void x() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            byte[] bArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            int i12 = bArr[i10] & 255;
            int i13 = inputCodeComment[i12];
            if (i13 != 0) {
                if (i13 == 2) {
                    y();
                } else if (i13 == 3) {
                    z();
                } else if (i13 == 4) {
                    A();
                } else if (i13 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                    return;
                } else if (i13 == 13) {
                    _skipCR();
                    return;
                } else if (i13 != 42 && i13 < 0) {
                    _reportInvalidChar(i12);
                }
            }
        }
    }

    public final void y() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b10 = bArr[i10];
        if ((b10 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b10 & 255, i11);
        }
    }

    public final void z() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        byte b10 = bArr[i10];
        if ((b10 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b10 & 255, i11);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i12 = this._inputPtr;
        int i13 = i12 + 1;
        this._inputPtr = i13;
        byte b11 = bArr2[i12];
        if ((b11 & Constants.CVR_B2b87_11_RFU) != 128) {
            _reportInvalidOther(b11 & 255, i13);
        }
    }

    public void _reportInvalidOther(int i10, int i11) throws JsonParseException {
        this._inputPtr = i11;
        _reportInvalidOther(i10);
    }

    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
    }

    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        do {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                char c_decodeCharForError = (char) _decodeCharForError(bArr[i10]);
                if (Character.isJavaIdentifierPart(c_decodeCharForError)) {
                    sb2.append(c_decodeCharForError);
                }
            }
            _reportError("Unrecognized token '%s': was expecting %s", sb2, str2);
        } while (sb2.length() < 256);
        sb2.append("...");
        _reportError("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsToWriter(writer);
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (jsonToken == null) {
            return 0;
        }
        if (jsonToken.isNumeric()) {
            return this._textBuffer.contentsToWriter(writer);
        }
        char[] cArrAsCharArray = jsonToken.asCharArray();
        writer.write(cArrAsCharArray);
        return cArrAsCharArray.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i10) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i10);
        }
        int i11 = this._numTypesValid;
        if ((i11 & 1) == 0) {
            if (i11 == 0) {
                return _parseIntValue();
            }
            if ((i11 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken jsonToken_parseNegNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            p();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int iD = D();
        if (iD < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (iD == 93) {
            b();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (iD == 125) {
            e();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (iD != 44) {
                _reportUnexpectedChar(iD, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            iD = B();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (iD == 93 || iD == 125)) {
                f(iD);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            F();
            q(iD);
            return null;
        }
        this._nameStartRow = this._currInputRow;
        int i10 = this._inputPtr;
        this._nameStartOffset = i10;
        this._nameStartCol = i10 - this._currInputRowStart;
        String str_parseName = _parseName(iD);
        this._parsingContext.setCurrentName(str_parseName);
        this._currToken = jsonToken2;
        int iU = u();
        F();
        if (iU == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str_parseName;
        }
        if (iU == 45) {
            jsonToken_parseNegNumber = _parseNegNumber();
        } else if (iU == 91) {
            jsonToken_parseNegNumber = JsonToken.START_ARRAY;
        } else if (iU == 102) {
            _matchFalse();
            jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (iU == 110) {
            _matchNull();
            jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
        } else if (iU == 116) {
            _matchTrue();
            jsonToken_parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (iU != 123) {
            switch (iU) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken_parseNegNumber = _parsePosNumber(iU);
                    break;
                default:
                    jsonToken_parseNegNumber = _handleUnexpectedValue(iU);
                    break;
            }
        } else {
            jsonToken_parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken_parseNegNumber;
        return str_parseName;
    }
}

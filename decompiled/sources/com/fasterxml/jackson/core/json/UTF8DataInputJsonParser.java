package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class UTF8DataInputJsonParser extends ParserBase {
    protected DataInput _inputData;
    protected int _nextByte;
    protected ObjectCodec _objectCodec;
    protected int[] _quadBuffer;
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f43083p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int[] f43082q0 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public UTF8DataInputJsonParser(IOContext iOContext, int i10, DataInput dataInput, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, int i11) {
        super(iOContext, i10);
        this._quadBuffer = new int[16];
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputData = dataInput;
        this._nextByte = i11;
    }

    public static final int H(int i10, int i11) {
        return i11 == 4 ? i10 : i10 | ((-1) << (i11 << 3));
    }

    public static int[] g(int i10, int[] iArr) {
        return iArr == null ? new int[i10] : Arrays.copyOf(iArr, iArr.length + i10);
    }

    public final int A(int i10) throws IOException {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    u();
                } else {
                    if (i10 != 35) {
                        return i10;
                    }
                    if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
                        return i10;
                    }
                    v();
                }
            } else if (i10 == 13 || i10 == 10) {
                this._currInputRow++;
            }
            i10 = this._inputData.readUnsignedByte();
        }
    }

    public final void B() throws IOException {
        int i10 = this._nextByte;
        if (i10 > 32) {
            _reportMissingRootWS(i10);
            return;
        }
        this._nextByte = -1;
        if (i10 == 13 || i10 == 10) {
            this._currInputRow++;
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
    public final String C(int i10, int i11, int[] iArr) throws JsonParseException {
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
                        p(i15);
                    }
                    i16 = (i13 << 6) | (i15 & 63);
                    if (i14 > 1) {
                        i18 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                        i27 = i23 + 3;
                        if ((i18 & 192) != 128) {
                            p(i18);
                        }
                        i19 = (i16 << 6) | (i18 & 63);
                        if (i14 > 2) {
                            i20 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                            i27 = i23 + 4;
                            if ((i20 & 192) != 128) {
                                p(i20 & 255);
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
                    p(i15);
                }
                i16 = (i13 << 6) | (i15 & 63);
                if (i14 > 1) {
                    i18 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                    i27 = i23 + 3;
                    if ((i18 & 192) != 128) {
                        p(i18);
                    }
                    i19 = (i16 << 6) | (i18 & 63);
                    if (i14 > 2) {
                        i20 = iArr[i27 >> 2] >> ((3 - (i27 & 3)) << 3);
                        i27 = i23 + 4;
                        if ((i20 & 192) != 128) {
                            p(i20 & 255);
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

    public final String D(int i10, int i11) throws JsonParseException {
        int iH = H(i10, i11);
        String strFindName = this._symbols.findName(iH);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = iH;
        return C(1, i11, iArr);
    }

    public final String E(int i10, int i11, int i12) throws JsonParseException {
        int iH = H(i11, i12);
        String strFindName = this._symbols.findName(i10, iH);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        iArr[1] = iH;
        return C(2, i12, iArr);
    }

    public final String F(int i10, int i11, int i12, int i13) throws JsonParseException {
        int iH = H(i12, i13);
        String strFindName = this._symbols.findName(i10, i11, iH);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = H(iH, i13);
        return C(3, i13, iArr);
    }

    public final String G(int i10, int i11, int i12, int[] iArr) throws JsonParseException {
        if (i10 >= iArr.length) {
            iArr = g(iArr.length, iArr);
            this._quadBuffer = iArr;
        }
        int i13 = i10 + 1;
        iArr[i10] = H(i11, i12);
        String strFindName = this._symbols.findName(iArr, i13);
        return strFindName == null ? C(i13, i12, iArr) : strFindName;
    }

    public final String I(int i10, int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i10;
        iArr[1] = i11;
        return parseEscapedName(iArr, 2, i12, i13, i14);
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            if (unsignedByte > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(unsignedByte);
                if (iDecodeBase64Char < 0) {
                    if (unsignedByte == 34) {
                        return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, unsignedByte, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                int unsignedByte2 = this._inputData.readUnsignedByte();
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(unsignedByte2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, unsignedByte2, 1);
                }
                int i10 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                int unsignedByte3 = this._inputData.readUnsignedByte();
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(unsignedByte3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (unsignedByte3 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.append(i10 >> 4);
                            if (base64Variant.usesPadding()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, unsignedByte3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        int unsignedByte4 = this._inputData.readUnsignedByte();
                        if (!base64Variant.usesPaddingChar(unsignedByte4) && (unsignedByte4 != 92 || _decodeBase64Escape(base64Variant, unsignedByte4, 3) != -2)) {
                            throw reportInvalidBase64Char(base64Variant, unsignedByte4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        byteArrayBuilder_getByteArrayBuilder.append(i10 >> 4);
                    }
                }
                int i11 = (i10 << 6) | iDecodeBase64Char3;
                int unsignedByte5 = this._inputData.readUnsignedByte();
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(unsignedByte5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (unsignedByte5 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                            if (base64Variant.usesPadding()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, unsignedByte5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                    }
                }
                byteArrayBuilder_getByteArrayBuilder.appendThreeBytes((i11 << 6) | iDecodeBase64Char4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public int _decodeCharForError(int i10) throws IOException {
        char c10;
        int unsignedByte;
        int i11;
        int unsignedByte2;
        int i12;
        int unsignedByte3;
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
            unsignedByte = this._inputData.readUnsignedByte();
            if ((unsignedByte & 192) != 128) {
                p(unsignedByte & 255);
            }
            i11 = (i13 << 6) | (unsignedByte & 63);
            if (c10 > 1) {
                return i11;
            }
            unsignedByte2 = this._inputData.readUnsignedByte();
            if ((unsignedByte2 & 192) != 128) {
                p(unsignedByte2 & 255);
            }
            i12 = (i11 << 6) | (unsignedByte2 & 63);
            if (c10 > 2) {
                return i12;
            }
            unsignedByte3 = this._inputData.readUnsignedByte();
            if ((unsignedByte3 & 192) != 128) {
                p(unsignedByte3 & 255);
            }
            return (i12 << 6) | (unsignedByte3 & 63);
        }
        i13 = i10 & 31;
        c10 = 1;
        unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            p(unsignedByte & 255);
        }
        i11 = (i13 << 6) | (unsignedByte & 63);
        if (c10 > 1) {
            return i11;
        }
        unsignedByte2 = this._inputData.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            p(unsignedByte2 & 255);
        }
        i12 = (i11 << 6) | (unsignedByte2 & 63);
        if (c10 > 2) {
            return i12;
        }
        unsignedByte3 = this._inputData.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            p(unsignedByte3 & 255);
        }
        return (i12 << 6) | (unsignedByte3 & 63);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if (unsignedByte == 34 || unsignedByte == 47 || unsignedByte == 92) {
            return (char) unsignedByte;
        }
        if (unsignedByte == 98) {
            return '\b';
        }
        if (unsignedByte == 102) {
            return '\f';
        }
        if (unsignedByte == 110) {
            return '\n';
        }
        if (unsignedByte == 114) {
            return '\r';
        }
        if (unsignedByte == 116) {
            return '\t';
        }
        if (unsignedByte != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(unsignedByte));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int unsignedByte2 = this._inputData.readUnsignedByte();
            int iCharToHex = CharTypes.charToHex(unsignedByte2);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(unsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i10 = (i10 << 4) | iCharToHex;
        }
        return (char) i10;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _finishString() throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int length = cArrEmptyAndGetCurrentSegment.length;
        int i10 = 0;
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            if (f43082q0[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    this._textBuffer.setCurrentLength(i10);
                    return;
                } else {
                    f(i10, cArrEmptyAndGetCurrentSegment, unsignedByte);
                    return;
                }
            }
            int i11 = i10 + 1;
            cArrEmptyAndGetCurrentSegment[i10] = (char) unsignedByte;
            if (i11 >= length) {
                f(i11, cArrEmptyAndGetCurrentSegment, this._inputData.readUnsignedByte());
                return;
            }
            i10 = i11;
        }
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
        int i10;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i11 = 0;
        while (true) {
            int length = cArrEmptyAndGetCurrentSegment.length;
            if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                length = cArrEmptyAndGetCurrentSegment.length;
                i11 = 0;
            }
            do {
                int unsignedByte = this._inputData.readUnsignedByte();
                if (unsignedByte == 39) {
                    this._textBuffer.setCurrentLength(i11);
                    return JsonToken.VALUE_STRING;
                }
                int i12 = f43082q0[unsignedByte];
                if (i12 != 0) {
                    if (i12 == 1) {
                        unsignedByte = _decodeEscaped();
                    } else if (i12 == 2) {
                        unsignedByte = b(unsignedByte);
                    } else if (i12 == 3) {
                        unsignedByte = c(unsignedByte);
                    } else if (i12 != 4) {
                        if (unsignedByte < 32) {
                            _throwUnquotedSpace(unsignedByte, "string value");
                        }
                        _reportInvalidChar(unsignedByte);
                    } else {
                        int iD = d(unsignedByte);
                        int i13 = i11 + 1;
                        cArrEmptyAndGetCurrentSegment[i11] = (char) ((iD >> 10) | GeneratorBase.SURR1_FIRST);
                        if (i13 >= cArrEmptyAndGetCurrentSegment.length) {
                            cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i11 = 0;
                        } else {
                            i11 = i13;
                        }
                        unsignedByte = 56320 | (iD & 1023);
                    }
                    if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                        cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i11 = 0;
                    }
                    cArrEmptyAndGetCurrentSegment[i11] = (char) unsignedByte;
                    i11++;
                    break;
                }
                i10 = i11 + 1;
                cArrEmptyAndGetCurrentSegment[i11] = (char) unsignedByte;
                i11 = i10;
            } while (i10 < length);
        }
    }

    public JsonToken _handleInvalidNumberStart(int i10, boolean z10) throws IOException {
        String str;
        while (i10 == 73) {
            i10 = this._inputData.readUnsignedByte();
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
            _reportError("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
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
        int[] iArrG = this._quadBuffer;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        do {
            if (i11 < 4) {
                i11++;
                i13 = i10 | (i13 << 8);
            } else {
                if (i12 >= iArrG.length) {
                    iArrG = g(iArrG.length, iArrG);
                    this._quadBuffer = iArrG;
                }
                iArrG[i12] = i13;
                i13 = i10;
                i12++;
                i11 = 1;
            }
            i10 = this._inputData.readUnsignedByte();
        } while (inputCodeUtf8JsNames[i10] == 0);
        this._nextByte = i10;
        if (i11 > 0) {
            if (i12 >= iArrG.length) {
                iArrG = g(iArrG.length, iArrG);
                this._quadBuffer = iArrG;
            }
            iArrG[i12] = i13;
            i12++;
        }
        String strFindName = this._symbols.findName(iArrG, i12);
        return strFindName == null ? C(i12, i11, iArrG) : strFindName;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        r3._nextByte = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
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
            if (r4 == r0) goto L7a
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L60
            r0 = 78
            if (r4 == r0) goto L46
            r0 = 93
            if (r4 == r0) goto L2a
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L40
            r0 = 43
            if (r4 == r0) goto L1e
            r0 = 44
            if (r4 == r0) goto L33
            goto L87
        L1e:
            java.io.DataInput r4 = r3._inputData
            int r4 = r4.readUnsignedByte()
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L2a:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L33
            goto L87
        L33:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L40
            r3._nextByte = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L40:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L7a
        L46:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L5a
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L5a:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L87
        L60:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L74
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L74:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L87
        L7a:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L87
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L87:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto La1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r4, r0, r1)
        La1:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final void _matchToken(String str, int i10) throws IOException {
        int length = str.length();
        do {
            int unsignedByte = this._inputData.readUnsignedByte();
            if (unsignedByte != str.charAt(i10)) {
                _reportInvalidToken(unsignedByte, str.substring(0, i10));
            }
            i10++;
        } while (i10 < length);
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if (unsignedByte2 >= 48 && unsignedByte2 != 93 && unsignedByte2 != 125) {
            char c_decodeCharForError = (char) _decodeCharForError(unsignedByte2);
            if (Character.isJavaIdentifierPart(c_decodeCharForError)) {
                _reportInvalidToken(c_decodeCharForError, str.substring(0, i10));
            }
        }
        this._nextByte = unsignedByte2;
    }

    public String _parseAposName() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if (unsignedByte == 39) {
            return "";
        }
        int[] iArrG = this._quadBuffer;
        int[] iArr = _icLatin1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (unsignedByte != 39) {
            if (unsignedByte != 34 && iArr[unsignedByte] != 0) {
                if (unsignedByte != 92) {
                    _throwUnquotedSpace(unsignedByte, "name");
                } else {
                    unsignedByte = _decodeEscaped();
                }
                if (unsignedByte > 127) {
                    if (i10 >= 4) {
                        if (i11 >= iArrG.length) {
                            iArrG = g(iArrG.length, iArrG);
                            this._quadBuffer = iArrG;
                        }
                        iArrG[i11] = i12;
                        i12 = 0;
                        i11++;
                        i10 = 0;
                    }
                    if (unsignedByte < 2048) {
                        i12 = (i12 << 8) | (unsignedByte >> 6) | 192;
                        i10++;
                    } else {
                        int i13 = (i12 << 8) | (unsignedByte >> 12) | 224;
                        int i14 = i10 + 1;
                        if (i14 >= 4) {
                            if (i11 >= iArrG.length) {
                                iArrG = g(iArrG.length, iArrG);
                                this._quadBuffer = iArrG;
                            }
                            iArrG[i11] = i13;
                            i13 = 0;
                            i11++;
                            i14 = 0;
                        }
                        i12 = (i13 << 8) | ((unsignedByte >> 6) & 63) | 128;
                        i10 = i14 + 1;
                    }
                    unsignedByte = (unsignedByte & 63) | 128;
                }
            }
            if (i10 < 4) {
                i10++;
                i12 = unsignedByte | (i12 << 8);
            } else {
                if (i11 >= iArrG.length) {
                    iArrG = g(iArrG.length, iArrG);
                    this._quadBuffer = iArrG;
                }
                iArrG[i11] = i12;
                i12 = unsignedByte;
                i11++;
                i10 = 1;
            }
            unsignedByte = this._inputData.readUnsignedByte();
        }
        if (i10 > 0) {
            if (i11 >= iArrG.length) {
                iArrG = g(iArrG.length, iArrG);
                this._quadBuffer = iArrG;
            }
            iArrG[i11] = H(i12, i10);
            i11++;
        }
        String strFindName = this._symbols.findName(iArrG, i11);
        return strFindName == null ? C(i11, i10, iArrG) : strFindName;
    }

    public final String _parseName(int i10) throws IOException {
        if (i10 != 34) {
            return _handleOddName(i10);
        }
        int[] iArr = _icLatin1;
        int unsignedByte = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? "" : parseEscapedName(this._quadBuffer, 0, 0, unsignedByte, 0);
        }
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? D(unsignedByte, 1) : parseEscapedName(this._quadBuffer, 0, unsignedByte, unsignedByte2, 1);
        }
        int i11 = (unsignedByte << 8) | unsignedByte2;
        int unsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? D(i11, 2) : parseEscapedName(this._quadBuffer, 0, i11, unsignedByte3, 2);
        }
        int i12 = (i11 << 8) | unsignedByte3;
        int unsignedByte4 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? D(i12, 3) : parseEscapedName(this._quadBuffer, 0, i12, unsignedByte4, 3);
        }
        int i13 = (i12 << 8) | unsignedByte4;
        int unsignedByte5 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte5] != 0) {
            return unsignedByte5 == 34 ? D(i13, 4) : parseEscapedName(this._quadBuffer, 0, i13, unsignedByte5, 4);
        }
        this.f43083p0 = i13;
        int unsignedByte6 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte6] != 0) {
            if (unsignedByte6 == 34) {
                return E(this.f43083p0, unsignedByte5, 1);
            }
            int i14 = this.f43083p0;
            int[] iArr2 = this._quadBuffer;
            iArr2[0] = i14;
            return parseEscapedName(iArr2, 1, unsignedByte5, unsignedByte6, 1);
        }
        int i15 = (unsignedByte5 << 8) | unsignedByte6;
        int unsignedByte7 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte7] != 0) {
            if (unsignedByte7 == 34) {
                return E(this.f43083p0, i15, 2);
            }
            int i16 = this.f43083p0;
            int[] iArr3 = this._quadBuffer;
            iArr3[0] = i16;
            return parseEscapedName(iArr3, 1, i15, unsignedByte7, 2);
        }
        int i17 = (i15 << 8) | unsignedByte7;
        int unsignedByte8 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte8] != 0) {
            if (unsignedByte8 == 34) {
                return E(this.f43083p0, i17, 3);
            }
            int i18 = this.f43083p0;
            int[] iArr4 = this._quadBuffer;
            iArr4[0] = i18;
            return parseEscapedName(iArr4, 1, i17, unsignedByte8, 3);
        }
        int i19 = (i17 << 8) | unsignedByte8;
        int unsignedByte9 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte9] != 0) {
            if (unsignedByte9 == 34) {
                return E(this.f43083p0, i19, 4);
            }
            int i20 = this.f43083p0;
            int[] iArr5 = this._quadBuffer;
            iArr5[0] = i20;
            return parseEscapedName(iArr5, 1, i19, unsignedByte9, 4);
        }
        int unsignedByte10 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte10] != 0) {
            return unsignedByte10 == 34 ? F(this.f43083p0, i19, unsignedByte9, 1) : I(this.f43083p0, i19, unsignedByte9, unsignedByte10, 1);
        }
        int i21 = (unsignedByte9 << 8) | unsignedByte10;
        int unsignedByte11 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte11] != 0) {
            return unsignedByte11 == 34 ? F(this.f43083p0, i19, i21, 2) : I(this.f43083p0, i19, i21, unsignedByte11, 2);
        }
        int i22 = (i21 << 8) | unsignedByte11;
        int unsignedByte12 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte12] != 0) {
            return unsignedByte12 == 34 ? F(this.f43083p0, i19, i22, 3) : I(this.f43083p0, i19, i22, unsignedByte12, 3);
        }
        int i23 = (i22 << 8) | unsignedByte12;
        int unsignedByte13 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte13] != 0) {
            return unsignedByte13 == 34 ? F(this.f43083p0, i19, i23, 4) : I(this.f43083p0, i19, i23, unsignedByte13, 4);
        }
        int[] iArr6 = this._quadBuffer;
        iArr6[0] = this.f43083p0;
        iArr6[1] = i19;
        iArr6[2] = i23;
        int i24 = 3;
        int i25 = unsignedByte13;
        while (true) {
            int unsignedByte14 = this._inputData.readUnsignedByte();
            if (iArr[unsignedByte14] != 0) {
                return unsignedByte14 == 34 ? G(i24, i25, 1, this._quadBuffer) : parseEscapedName(this._quadBuffer, i24, i25, unsignedByte14, 1);
            }
            int i26 = (i25 << 8) | unsignedByte14;
            int unsignedByte15 = this._inputData.readUnsignedByte();
            if (iArr[unsignedByte15] != 0) {
                return unsignedByte15 == 34 ? G(i24, i26, 2, this._quadBuffer) : parseEscapedName(this._quadBuffer, i24, i26, unsignedByte15, 2);
            }
            int i27 = (i26 << 8) | unsignedByte15;
            int unsignedByte16 = this._inputData.readUnsignedByte();
            if (iArr[unsignedByte16] != 0) {
                return unsignedByte16 == 34 ? G(i24, i27, 3, this._quadBuffer) : parseEscapedName(this._quadBuffer, i24, i27, unsignedByte16, 3);
            }
            int i28 = (i27 << 8) | unsignedByte16;
            int unsignedByte17 = this._inputData.readUnsignedByte();
            if (iArr[unsignedByte17] != 0) {
                return unsignedByte17 == 34 ? G(i24, i28, 4, this._quadBuffer) : parseEscapedName(this._quadBuffer, i24, i28, unsignedByte17, 4);
            }
            int[] iArr7 = this._quadBuffer;
            if (i24 >= iArr7.length) {
                this._quadBuffer = g(i24, iArr7);
            }
            this._quadBuffer[i24] = i28;
            i25 = unsignedByte17;
            i24++;
        }
    }

    public JsonToken _parseNegNumber() throws IOException {
        int unsignedByte;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = '-';
        int unsignedByte2 = this._inputData.readUnsignedByte();
        cArrEmptyAndGetCurrentSegment[1] = (char) unsignedByte2;
        if (unsignedByte2 <= 48) {
            if (unsignedByte2 != 48) {
                return _handleInvalidNumberStart(unsignedByte2, true);
            }
            unsignedByte = l();
        } else {
            if (unsignedByte2 > 57) {
                return _handleInvalidNumberStart(unsignedByte2, true);
            }
            unsignedByte = this._inputData.readUnsignedByte();
        }
        int i10 = 2;
        int i11 = 1;
        while (unsignedByte <= 57 && unsignedByte >= 48) {
            i11++;
            cArrEmptyAndGetCurrentSegment[i10] = (char) unsignedByte;
            unsignedByte = this._inputData.readUnsignedByte();
            i10++;
        }
        if (unsignedByte == 46 || unsignedByte == 101 || unsignedByte == 69) {
            return o(cArrEmptyAndGetCurrentSegment, i10, unsignedByte, true, i11);
        }
        this._textBuffer.setCurrentLength(i10);
        this._nextByte = unsignedByte;
        if (this._parsingContext.inRoot()) {
            B();
        }
        return resetInt(true, i11);
    }

    public JsonToken _parsePosNumber(int i10) throws IOException {
        int unsignedByte;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i11 = 1;
        if (i10 == 48) {
            unsignedByte = l();
            if (unsignedByte > 57 || unsignedByte < 48) {
                cArrEmptyAndGetCurrentSegment[0] = '0';
            } else {
                i11 = 0;
            }
        } else {
            cArrEmptyAndGetCurrentSegment[0] = (char) i10;
            unsignedByte = this._inputData.readUnsignedByte();
        }
        int unsignedByte2 = unsignedByte;
        int i12 = i11;
        int i13 = i12;
        while (unsignedByte2 <= 57 && unsignedByte2 >= 48) {
            i13++;
            cArrEmptyAndGetCurrentSegment[i12] = (char) unsignedByte2;
            unsignedByte2 = this._inputData.readUnsignedByte();
            i12++;
        }
        if (unsignedByte2 == 46 || unsignedByte2 == 101 || unsignedByte2 == 69) {
            return o(cArrEmptyAndGetCurrentSegment, i12, unsignedByte2, false, i13);
        }
        this._textBuffer.setCurrentLength(i12);
        if (this._parsingContext.inRoot()) {
            B();
        } else {
            this._nextByte = unsignedByte2;
        }
        return resetInt(false, i13);
    }

    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            if (unsignedByte > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(unsignedByte);
                if (iDecodeBase64Char < 0) {
                    if (unsignedByte == 34) {
                        break;
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, unsignedByte, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i10 > length) {
                    i11 += i10;
                    outputStream.write(bArr, 0, i10);
                    i10 = 0;
                }
                int unsignedByte2 = this._inputData.readUnsignedByte();
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(unsignedByte2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, unsignedByte2, 1);
                }
                int i12 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                int unsignedByte3 = this._inputData.readUnsignedByte();
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(unsignedByte3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (unsignedByte3 == 34) {
                            int i13 = i10 + 1;
                            bArr[i10] = (byte) (i12 >> 4);
                            if (base64Variant.usesPadding()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i10 = i13;
                            break;
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, unsignedByte3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        int unsignedByte4 = this._inputData.readUnsignedByte();
                        if (!base64Variant.usesPaddingChar(unsignedByte4) && (unsignedByte4 != 92 || _decodeBase64Escape(base64Variant, unsignedByte4, 3) != -2)) {
                            throw reportInvalidBase64Char(base64Variant, unsignedByte4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i10] = (byte) (i12 >> 4);
                        i10++;
                    }
                }
                int i14 = (i12 << 6) | iDecodeBase64Char3;
                int unsignedByte5 = this._inputData.readUnsignedByte();
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(unsignedByte5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (unsignedByte5 == 34) {
                            int i15 = i10 + 1;
                            bArr[i10] = (byte) (i14 >> 10);
                            i10 += 2;
                            bArr[i15] = (byte) (i14 >> 2);
                            if (!base64Variant.usesPadding()) {
                                break;
                            }
                            _handleBase64MissingPadding(base64Variant);
                            break;
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, unsignedByte5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        int i16 = i10 + 1;
                        bArr[i10] = (byte) (i14 >> 10);
                        i10 += 2;
                        bArr[i16] = (byte) (i14 >> 2);
                    }
                }
                int i17 = (i14 << 6) | iDecodeBase64Char4;
                bArr[i10] = (byte) (i17 >> 16);
                int i18 = i10 + 2;
                bArr[i10 + 1] = (byte) (i17 >> 8);
                i10 += 3;
                bArr[i18] = (byte) i17;
            }
        }
        this._tokenIncomplete = false;
        if (i10 <= 0) {
            return i11;
        }
        int i19 = i11 + i10;
        outputStream.write(bArr, 0, i10);
        return i19;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        super._releaseBuffers();
        this._symbols.release();
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

    public void _reportInvalidToken(int i10, String str) throws IOException {
        _reportInvalidToken(i10, str, "'null', 'true', 'false' or NaN");
    }

    public void _skipString() throws IOException {
        this._tokenIncomplete = false;
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            int i10 = f43082q0[unsignedByte];
            if (i10 != 0) {
                if (unsignedByte == 34) {
                    return;
                }
                if (i10 == 1) {
                    _decodeEscaped();
                } else if (i10 == 2) {
                    w();
                } else if (i10 == 3) {
                    x();
                } else if (i10 == 4) {
                    y();
                } else if (unsignedByte < 32) {
                    _throwUnquotedSpace(unsignedByte, "string value");
                } else {
                    _reportInvalidChar(unsignedByte);
                }
            }
        }
    }

    public final void a(int i10) throws JsonParseException {
        if (i10 == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i10, AbstractJsonLexerKt.END_OBJ);
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i10 == 125) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i10, AbstractJsonLexerKt.END_LIST);
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    public final int b(int i10) throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            p(unsignedByte & 255);
        }
        return ((i10 & 31) << 6) | (unsignedByte & 63);
    }

    public final int c(int i10) throws IOException {
        int i11 = i10 & 15;
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            p(unsignedByte & 255);
        }
        int i12 = (i11 << 6) | (unsignedByte & 63);
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            p(unsignedByte2 & 255);
        }
        return (i12 << 6) | (unsignedByte2 & 63);
    }

    public final int d(int i10) throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            p(unsignedByte & 255);
        }
        int i11 = ((i10 & 7) << 6) | (unsignedByte & 63);
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            p(unsignedByte2 & 255);
        }
        int i12 = (i11 << 6) | (unsignedByte2 & 63);
        int unsignedByte3 = this._inputData.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            p(unsignedByte3 & 255);
        }
        return ((i12 << 6) | (unsignedByte3 & 63)) - 65536;
    }

    public final String e() throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int length = cArrEmptyAndGetCurrentSegment.length;
        int i10 = 0;
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            if (f43082q0[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return this._textBuffer.setCurrentAndReturn(i10);
                }
                f(i10, cArrEmptyAndGetCurrentSegment, unsignedByte);
                return this._textBuffer.contentsAsString();
            }
            int i11 = i10 + 1;
            cArrEmptyAndGetCurrentSegment[i10] = (char) unsignedByte;
            if (i11 >= length) {
                f(i11, cArrEmptyAndGetCurrentSegment, this._inputData.readUnsignedByte());
                return this._textBuffer.contentsAsString();
            }
            i10 = i11;
        }
    }

    public final void f(int i10, char[] cArr, int i11) throws IOException {
        int length = cArr.length;
        while (true) {
            int i12 = f43082q0[i11];
            int i13 = 0;
            if (i12 == 0) {
                if (i10 >= length) {
                    char[] cArrFinishCurrentSegment = this._textBuffer.finishCurrentSegment();
                    length = cArrFinishCurrentSegment.length;
                    cArr = cArrFinishCurrentSegment;
                    i10 = 0;
                }
                cArr[i10] = (char) i11;
                i11 = this._inputData.readUnsignedByte();
                i10++;
            } else {
                if (i11 == 34) {
                    this._textBuffer.setCurrentLength(i10);
                    return;
                }
                if (i12 == 1) {
                    i11 = _decodeEscaped();
                } else if (i12 == 2) {
                    i11 = b(i11);
                } else if (i12 == 3) {
                    i11 = c(i11);
                } else if (i12 == 4) {
                    int iD = d(i11);
                    int i14 = i10 + 1;
                    cArr[i10] = (char) ((iD >> 10) | GeneratorBase.SURR1_FIRST);
                    if (i14 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        length = cArr.length;
                        i10 = 0;
                    } else {
                        i10 = i14;
                    }
                    i11 = (iD & 1023) | 56320;
                } else if (i11 < 32) {
                    _throwUnquotedSpace(i11, "string value");
                } else {
                    _reportInvalidChar(i11);
                }
                if (i10 >= cArr.length) {
                    char[] cArrFinishCurrentSegment2 = this._textBuffer.finishCurrentSegment();
                    length = cArrFinishCurrentSegment2.length;
                    cArr = cArrFinishCurrentSegment2;
                } else {
                    i13 = i10;
                }
                i10 = i13 + 1;
                cArr[i13] = (char) i11;
                i11 = this._inputData.readUnsignedByte();
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() throws IOException {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
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
        return new JsonLocation(_getSourceReference(), -1L, -1L, this._currInputRow, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._inputData;
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
        return e();
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
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._parsingContext.getCurrentName().length();
        }
        if (jsonToken != null) {
            return jsonToken.isNumeric() ? this._textBuffer.size() : this._currToken.asCharArray().length;
        }
        return 0;
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return new JsonLocation(_getSourceReference(), -1L, -1L, this._tokenInputRow, -1);
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
        return e();
    }

    public final int l() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if (unsignedByte >= 48 && unsignedByte <= 57) {
            if (!isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            while (unsignedByte == 48) {
                unsignedByte = this._inputData.readUnsignedByte();
            }
        }
        return unsignedByte;
    }

    public final JsonToken m() {
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

    public final JsonToken n(int i10) throws IOException {
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
            _matchToken("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i10 == 110) {
            _matchToken(AbstractJsonLexerKt.NULL, 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i10 == 116) {
            _matchToken("true", 1);
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

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken jsonToken_parseNegNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            m();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int iZ = z();
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if (iZ == 93 || iZ == 125) {
            a(iZ);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (iZ != 44) {
                _reportUnexpectedChar(iZ, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            iZ = z();
            if (JsonParser.Feature.ALLOW_TRAILING_COMMA.enabledIn(this._features) && (iZ == 93 || iZ == 125)) {
                a(iZ);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            n(iZ);
            return null;
        }
        String str_parseName = _parseName(iZ);
        this._parsingContext.setCurrentName(str_parseName);
        this._currToken = jsonToken2;
        int iQ = q();
        if (iQ == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str_parseName;
        }
        if (iQ == 45) {
            jsonToken_parseNegNumber = _parseNegNumber();
        } else if (iQ == 91) {
            jsonToken_parseNegNumber = JsonToken.START_ARRAY;
        } else if (iQ == 102) {
            _matchToken("false", 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (iQ == 110) {
            _matchToken(AbstractJsonLexerKt.NULL, 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
        } else if (iQ == 116) {
            _matchToken("true", 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (iQ != 123) {
            switch (iQ) {
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
                    jsonToken_parseNegNumber = _parsePosNumber(iQ);
                    break;
                default:
                    jsonToken_parseNegNumber = _handleUnexpectedValue(iQ);
                    break;
            }
        } else {
            jsonToken_parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken_parseNegNumber;
        return str_parseName;
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
            return e();
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
        if (this._closed) {
            return null;
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return m();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_eofAsNextChar = this._nextByte;
        if (i_eofAsNextChar < 0) {
            try {
                i_eofAsNextChar = this._inputData.readUnsignedByte();
            } catch (EOFException unused) {
                i_eofAsNextChar = _eofAsNextChar();
            }
        } else {
            this._nextByte = -1;
        }
        while (i_eofAsNextChar <= 32) {
            if (i_eofAsNextChar == 13 || i_eofAsNextChar == 10) {
                this._currInputRow++;
            }
            try {
                i_eofAsNextChar = this._inputData.readUnsignedByte();
            } catch (EOFException unused2) {
                i_eofAsNextChar = _eofAsNextChar();
            }
        }
        if (i_eofAsNextChar == 47 || i_eofAsNextChar == 35) {
            i_eofAsNextChar = A(i_eofAsNextChar);
        }
        if (i_eofAsNextChar < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if (i_eofAsNextChar == 93 || i_eofAsNextChar == 125) {
            a(i_eofAsNextChar);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            if (i_eofAsNextChar != 44) {
                _reportUnexpectedChar(i_eofAsNextChar, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_eofAsNextChar = z();
            if (JsonParser.Feature.ALLOW_TRAILING_COMMA.enabledIn(this._features) && (i_eofAsNextChar == 93 || i_eofAsNextChar == 125)) {
                a(i_eofAsNextChar);
                return this._currToken;
            }
        }
        if (!this._parsingContext.inObject()) {
            return n(i_eofAsNextChar);
        }
        this._parsingContext.setCurrentName(_parseName(i_eofAsNextChar));
        this._currToken = JsonToken.FIELD_NAME;
        int iQ = q();
        if (iQ == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (iQ == 45) {
            jsonToken_parseNegNumber = _parseNegNumber();
        } else if (iQ == 91) {
            jsonToken_parseNegNumber = JsonToken.START_ARRAY;
        } else if (iQ == 102) {
            _matchToken("false", 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (iQ == 110) {
            _matchToken(AbstractJsonLexerKt.NULL, 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
        } else if (iQ == 116) {
            _matchToken("true", 1);
            jsonToken_parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (iQ != 123) {
            switch (iQ) {
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
                    jsonToken_parseNegNumber = _parsePosNumber(iQ);
                    break;
                default:
                    jsonToken_parseNegNumber = _handleUnexpectedValue(iQ);
                    break;
            }
        } else {
            jsonToken_parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken_parseNegNumber;
        return this._currToken;
    }

    public final JsonToken o(char[] cArr, int i10, int i11, boolean z10, int i12) throws IOException {
        int i13;
        int unsignedByte;
        int i14 = 0;
        if (i11 == 46) {
            cArr[i10] = (char) i11;
            i10++;
            int i15 = 0;
            while (true) {
                unsignedByte = this._inputData.readUnsignedByte();
                if (unsignedByte < 48 || unsignedByte > 57) {
                    break;
                }
                i15++;
                if (i10 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i10 = 0;
                }
                cArr[i10] = (char) unsignedByte;
                i10++;
            }
            if (i15 == 0) {
                reportUnexpectedNumberChar(unsignedByte, "Decimal point not followed by a digit");
            }
            i13 = i15;
            i11 = unsignedByte;
        } else {
            i13 = 0;
        }
        if (i11 == 101 || i11 == 69) {
            if (i10 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i10 = 0;
            }
            int i16 = i10 + 1;
            cArr[i10] = (char) i11;
            int unsignedByte2 = this._inputData.readUnsignedByte();
            if (unsignedByte2 == 45 || unsignedByte2 == 43) {
                if (i16 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i16 = 0;
                }
                cArr[i16] = (char) unsignedByte2;
                i11 = this._inputData.readUnsignedByte();
                i10 = i16 + 1;
            } else {
                i11 = unsignedByte2;
                i10 = i16;
            }
            while (i11 <= 57 && i11 >= 48) {
                i14++;
                if (i10 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i10 = 0;
                }
                cArr[i10] = (char) i11;
                i11 = this._inputData.readUnsignedByte();
                i10++;
            }
            if (i14 == 0) {
                reportUnexpectedNumberChar(i11, "Exponent indicator not followed by a digit");
            }
            i14 = i14;
        }
        this._nextByte = i11;
        if (this._parsingContext.inRoot()) {
            B();
        }
        this._textBuffer.setCurrentLength(i10);
        return resetFloat(z10, i12, i13, i14);
    }

    public final void p(int i10) throws JsonParseException {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i10));
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
                            iArr = g(iArr.length, iArr);
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
                                iArr = g(iArr.length, iArr);
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
                    iArr = g(iArr.length, iArr);
                    this._quadBuffer = iArr;
                }
                iArr[i10] = i11;
                i11 = i12;
                i10++;
                i13 = 1;
            }
            i12 = this._inputData.readUnsignedByte();
        }
        if (i13 > 0) {
            if (i10 >= iArr.length) {
                iArr = g(iArr.length, iArr);
                this._quadBuffer = iArr;
            }
            iArr[i10] = H(i11, i13);
            i10++;
        }
        String strFindName = this._symbols.findName(iArr, i10);
        return strFindName == null ? C(i10, i13, iArr) : strFindName;
    }

    public final int q() throws IOException {
        int unsignedByte = this._nextByte;
        if (unsignedByte < 0) {
            unsignedByte = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        if (unsignedByte == 58) {
            int unsignedByte2 = this._inputData.readUnsignedByte();
            if (unsignedByte2 > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? r(unsignedByte2, true) : unsignedByte2;
            }
            if ((unsignedByte2 == 32 || unsignedByte2 == 9) && (unsignedByte2 = this._inputData.readUnsignedByte()) > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? r(unsignedByte2, true) : unsignedByte2;
            }
            return r(unsignedByte2, true);
        }
        if (unsignedByte == 32 || unsignedByte == 9) {
            unsignedByte = this._inputData.readUnsignedByte();
        }
        if (unsignedByte != 58) {
            return r(unsignedByte, false);
        }
        int unsignedByte3 = this._inputData.readUnsignedByte();
        if (unsignedByte3 > 32) {
            return (unsignedByte3 == 47 || unsignedByte3 == 35) ? r(unsignedByte3, true) : unsignedByte3;
        }
        if ((unsignedByte3 == 32 || unsignedByte3 == 9) && (unsignedByte3 = this._inputData.readUnsignedByte()) > 32) {
            return (unsignedByte3 == 47 || unsignedByte3 == 35) ? r(unsignedByte3, true) : unsignedByte3;
        }
        return r(unsignedByte3, true);
    }

    public final int r(int i10, boolean z10) throws IOException {
        while (true) {
            if (i10 > 32) {
                if (i10 == 47) {
                    u();
                } else if (i10 == 35 && isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
                    v();
                } else {
                    if (z10) {
                        return i10;
                    }
                    if (i10 != 58) {
                        _reportUnexpectedChar(i10, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (i10 == 13 || i10 == 10) {
                this._currInputRow++;
            }
            i10 = this._inputData.readUnsignedByte();
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
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    public final void u() throws IOException {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int unsignedByte = this._inputData.readUnsignedByte();
        if (unsignedByte == 47) {
            v();
            return;
        }
        if (unsignedByte != 42) {
            _reportUnexpectedChar(unsignedByte, "was expecting either '*' or '/' for a comment");
            return;
        }
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        int unsignedByte2 = this._inputData.readUnsignedByte();
        while (true) {
            int i10 = inputCodeComment[unsignedByte2];
            if (i10 != 0) {
                if (i10 == 2) {
                    w();
                } else if (i10 == 3) {
                    x();
                } else if (i10 == 4) {
                    y();
                } else if (i10 == 10 || i10 == 13) {
                    this._currInputRow++;
                } else if (i10 != 42) {
                    _reportInvalidChar(unsignedByte2);
                } else {
                    unsignedByte2 = this._inputData.readUnsignedByte();
                    if (unsignedByte2 == 47) {
                        return;
                    }
                }
            }
            unsignedByte2 = this._inputData.readUnsignedByte();
        }
    }

    public final void v() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            int i10 = inputCodeComment[unsignedByte];
            if (i10 != 0) {
                if (i10 == 2) {
                    w();
                } else if (i10 == 3) {
                    x();
                } else if (i10 == 4) {
                    y();
                } else if (i10 == 10 || i10 == 13) {
                    break;
                } else if (i10 != 42 && i10 < 0) {
                    _reportInvalidChar(unsignedByte);
                }
            }
        }
        this._currInputRow++;
    }

    public final void w() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            p(unsignedByte & 255);
        }
    }

    public final void x() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            p(unsignedByte & 255);
        }
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            p(unsignedByte2 & 255);
        }
    }

    public final void y() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            p(unsignedByte & 255);
        }
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            p(unsignedByte2 & 255);
        }
        int unsignedByte3 = this._inputData.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            p(unsignedByte3 & 255);
        }
    }

    public final int z() throws IOException {
        int unsignedByte = this._nextByte;
        if (unsignedByte < 0) {
            unsignedByte = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this._currInputRow++;
            }
            unsignedByte = this._inputData.readUnsignedByte();
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? A(unsignedByte) : unsignedByte;
    }

    public void _reportInvalidToken(int i10, String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        while (true) {
            char c_decodeCharForError = (char) _decodeCharForError(i10);
            if (!Character.isJavaIdentifierPart(c_decodeCharForError)) {
                _reportError("Unrecognized token '" + sb2.toString() + "': was expecting " + str2);
                return;
            }
            sb2.append(c_decodeCharForError);
            i10 = this._inputData.readUnsignedByte();
        }
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
                return e();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
    }
}

package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ReaderBasedJsonParser extends ParserBase {
    protected static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public ReaderBasedJsonParser(IOContext iOContext, int i10, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i11, int i12, boolean z10) {
        super(iOContext, i10);
        this._reader = reader;
        this._inputBuffer = cArr;
        this._inputPtr = i11;
        this._inputEnd = i12;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z10;
    }

    public final int A() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    x();
                } else {
                    if (c10 != '#' || !isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
                        return c10;
                    }
                    y();
                }
            } else if (c10 != ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
    }

    public final void B() {
        int i10 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i10);
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i10 - this._currInputRowStart;
    }

    public final void C(int i10) throws IOException {
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

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    public byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(c10);
                if (iDecodeBase64Char < 0) {
                    if (c10 == '\"') {
                        return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, c10, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                char c11 = cArr2[i11];
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(c11);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, c11, 1);
                }
                int i12 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i13 = this._inputPtr;
                this._inputPtr = i13 + 1;
                char c12 = cArr3[i13];
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(c12);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c12 == '\"') {
                            byteArrayBuilder_getByteArrayBuilder.append(i12 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, c12, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i14 = this._inputPtr;
                        this._inputPtr = i14 + 1;
                        char c13 = cArr4[i14];
                        if (!base64Variant.usesPaddingChar(c13) && _decodeBase64Escape(base64Variant, c13, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c13, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        byteArrayBuilder_getByteArrayBuilder.append(i12 >> 4);
                    }
                }
                int i15 = (i12 << 6) | iDecodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                char c14 = cArr5[i16];
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c14);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c14 == '\"') {
                            byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i15 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, c14, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i15 >> 2);
                    }
                }
                byteArrayBuilder_getByteArrayBuilder.appendThreeBytes((i15 << 6) | iDecodeBase64Char4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '\"' || c10 == '/' || c10 == '\\') {
            return c10;
        }
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 == 't') {
            return '\t';
        }
        if (c10 != 'u') {
            return _handleUnrecognizedCharacterEscape(c10);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            char c11 = cArr2[i13];
            int iCharToHex = CharTypes.charToHex(c11);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(c11, "expected a hex-digit for character escape sequence");
            }
            i11 = (i11 << 4) | iCharToHex;
        }
        return (char) i11;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void _finishString() throws IOException {
        int i10 = this._inputPtr;
        int i11 = this._inputEnd;
        if (i10 < i11) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i10];
                if (c10 < length && iArr[c10] != 0) {
                    if (c10 != '\"') {
                        break;
                    }
                    TextBuffer textBuffer = this._textBuffer;
                    int i12 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i12, i10 - i12);
                    this._inputPtr = i10 + 1;
                    return;
                }
                i10++;
            } while (i10 < i11);
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i13 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i13, i10 - i13);
        this._inputPtr = i10;
        _finishString2();
    }

    public void _finishString2() throws IOException {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char c_decodeEscaped = cArr[i10];
            if (c_decodeEscaped < length && iArr[c_decodeEscaped] != 0) {
                if (c_decodeEscaped == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped < ' ') {
                    _throwUnquotedSpace(c_decodeEscaped, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = c_decodeEscaped;
            currentSegmentSize++;
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
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            this._inputPtr = i10 + 1;
            char c_decodeEscaped = cArr[i10];
            if (c_decodeEscaped <= '\\') {
                if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped <= '\'') {
                    if (c_decodeEscaped == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    }
                    if (c_decodeEscaped < ' ') {
                        _throwUnquotedSpace(c_decodeEscaped, "string value");
                    }
                }
            }
            if (currentSegmentSize >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            cArrEmptyAndGetCurrentSegment[currentSegmentSize] = c_decodeEscaped;
            currentSegmentSize++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Code duplicated, block: B:59:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9 A[SYNTHETIC] */
    public String _handleOddName(int i10) throws IOException {
        int i11;
        if (i10 == 39 && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar(i10, "was expecting double-quote to start field name");
        }
        int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
        int length = inputCodeLatin1JsNames.length;
        if (i10 >= length ? !Character.isJavaIdentifierPart((char) i10) : inputCodeLatin1JsNames[i10] != 0) {
            _reportUnexpectedChar(i10, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i12 = this._inputPtr;
        int i13 = this._hashSeed;
        int i14 = this._inputEnd;
        if (i12 < i14) {
            do {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i12];
                if (c10 < length) {
                    if (inputCodeLatin1JsNames[c10] != 0) {
                        int i15 = this._inputPtr - 1;
                        this._inputPtr = i12;
                        return this._symbols.findSymbol(cArr, i15, i12 - i15, i13);
                    }
                } else if (!Character.isJavaIdentifierPart(c10)) {
                    int i16 = this._inputPtr - 1;
                    this._inputPtr = i12;
                    return this._symbols.findSymbol(this._inputBuffer, i16, i12 - i16, i13);
                }
                i13 = (i13 * 33) + c10;
                i12++;
            } while (i12 < i14);
        }
        int i17 = this._inputPtr - 1;
        this._inputPtr = i12;
        this._textBuffer.resetWithShared(this._inputBuffer, i17, i12 - i17);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int length2 = inputCodeLatin1JsNames.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c11 = this._inputBuffer[this._inputPtr];
            if (c11 < length2) {
                if (inputCodeLatin1JsNames[c11] != 0) {
                    break;
                }
                this._inputPtr++;
                i13 = (i13 * 33) + c11;
                i11 = currentSegmentSize + 1;
                currentSegment[currentSegmentSize] = c11;
                if (i11 >= currentSegment.length) {
                    currentSegment = this._textBuffer.finishCurrentSegment();
                    currentSegmentSize = 0;
                } else {
                    currentSegmentSize = i11;
                }
            } else {
                if (!Character.isJavaIdentifierPart(c11)) {
                    break;
                }
                this._inputPtr++;
                i13 = (i13 * 33) + c11;
                i11 = currentSegmentSize + 1;
                currentSegment[currentSegmentSize] = c11;
                if (i11 >= currentSegment.length) {
                    currentSegment = this._textBuffer.finishCurrentSegment();
                    currentSegmentSize = 0;
                } else {
                    currentSegmentSize = i11;
                }
            }
        }
        this._textBuffer.setCurrentLength(currentSegmentSize);
        TextBuffer textBuffer = this._textBuffer;
        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i13);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    public JsonToken _handleOddValue(int i10) throws IOException {
        if (i10 != 39) {
            if (i10 == 73) {
                _matchToken("Infinity", 1);
                if (isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return resetAsNaN("Infinity", Double.POSITIVE_INFINITY);
                }
                _reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i10 == 78) {
                _matchToken("NaN", 1);
                if (isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return resetAsNaN("NaN", Double.NaN);
                }
                _reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i10 != 93) {
                if (i10 == 43) {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
                    }
                    char[] cArr = this._inputBuffer;
                    int i11 = this._inputPtr;
                    this._inputPtr = i11 + 1;
                    return _handleInvalidNumberStart(cArr[i11], false);
                }
                if (i10 == 44) {
                    if (isEnabled(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                        this._inputPtr--;
                        return JsonToken.VALUE_NULL;
                    }
                }
            } else if (this._parsingContext.inArray()) {
                if (isEnabled(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                    this._inputPtr--;
                    return JsonToken.VALUE_NULL;
                }
            }
        } else if (isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return _handleApos();
        }
        if (Character.isJavaIdentifierStart(i10)) {
            _reportInvalidToken("" + ((char) i10), "('true', 'false' or 'null')");
        }
        _reportUnexpectedChar(i10, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    public boolean _isNextTokenNameMaybe(int i10, String str) throws IOException {
        JsonToken jsonToken_parseNegNumber;
        String str_parseName = i10 == 34 ? _parseName() : _handleOddName(i10);
        this._parsingContext.setCurrentName(str_parseName);
        this._currToken = JsonToken.FIELD_NAME;
        int iU = u();
        B();
        if (iU == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str.equals(str_parseName);
        }
        if (iU == 45) {
            jsonToken_parseNegNumber = _parseNegNumber();
        } else if (iU == 91) {
            jsonToken_parseNegNumber = JsonToken.START_ARRAY;
        } else if (iU == 102) {
            b();
            jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (iU == 110) {
            e();
            jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
        } else if (iU == 116) {
            l();
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
                    jsonToken_parseNegNumber = _handleOddValue(iU);
                    break;
            }
        } else {
            jsonToken_parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken_parseNegNumber;
        return str.equals(str_parseName);
    }

    public boolean _loadMore() throws IOException {
        int i10 = this._inputEnd;
        long j10 = i10;
        this._currInputProcessed += j10;
        this._currInputRowStart -= i10;
        this._nameStartOffset -= j10;
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int i11 = reader.read(cArr, 0, cArr.length);
            if (i11 > 0) {
                this._inputPtr = 0;
                this._inputEnd = i11;
                return true;
            }
            _closeInput();
            if (i11 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this._inputEnd);
            }
        }
        return false;
    }

    public void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    public final void _matchToken(String str, int i10) throws IOException {
        int i11;
        int i12;
        char c10;
        int length = str.length();
        if (this._inputPtr + length < this._inputEnd) {
            do {
                if (this._inputBuffer[this._inputPtr] != str.charAt(i10)) {
                    _reportInvalidToken(str.substring(0, i10));
                }
                i11 = this._inputPtr + 1;
                this._inputPtr = i11;
                i10++;
            } while (i10 < length);
            char c11 = this._inputBuffer[i11];
            if (c11 < '0' || c11 == ']' || c11 == '}' || !Character.isJavaIdentifierPart(c11)) {
                return;
            }
            _reportInvalidToken(str.substring(0, i10));
            return;
        }
        int length2 = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i10)) {
                _reportInvalidToken(str.substring(0, i10));
            }
            i12 = this._inputPtr + 1;
            this._inputPtr = i12;
            i10++;
        } while (i10 < length2);
        if ((i12 < this._inputEnd || _loadMore()) && (c10 = this._inputBuffer[this._inputPtr]) >= '0' && c10 != ']' && c10 != '}' && Character.isJavaIdentifierPart(c10)) {
            _reportInvalidToken(str.substring(0, i10));
        }
    }

    public String _parseAposName() throws IOException {
        int i10 = this._inputPtr;
        int i11 = this._hashSeed;
        int i12 = this._inputEnd;
        if (i10 < i12) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c10 = cArr[i10];
                if (c10 != '\'') {
                    if (c10 < length && iArr[c10] != 0) {
                        break;
                    }
                    i11 = (i11 * 33) + c10;
                    i10++;
                } else {
                    int i13 = this._inputPtr;
                    this._inputPtr = i10 + 1;
                    return this._symbols.findSymbol(cArr, i13, i10 - i13, i11);
                }
            } while (i10 < i12);
        }
        int i14 = this._inputPtr;
        this._inputPtr = i10;
        return p(i14, i11, 39);
    }

    public final String _parseName() throws IOException {
        int i10 = this._inputPtr;
        int i11 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (i10 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            char c10 = cArr[i10];
            if (c10 < iArr.length && iArr[c10] != 0) {
                if (c10 != '\"') {
                    break;
                }
                int i12 = this._inputPtr;
                this._inputPtr = i10 + 1;
                return this._symbols.findSymbol(cArr, i12, i10 - i12, i11);
            }
            i11 = (i11 * 33) + c10;
            i10++;
        }
        int i13 = this._inputPtr;
        this._inputPtr = i10;
        return p(i13, i11, 34);
    }

    public final JsonToken _parseNegNumber() throws IOException {
        int i10 = this._inputPtr;
        int i11 = i10 - 1;
        int i12 = this._inputEnd;
        if (i10 >= i12) {
            return q(i11, true);
        }
        int i13 = i10 + 1;
        char c10 = this._inputBuffer[i10];
        if (c10 > '9' || c10 < '0') {
            this._inputPtr = i13;
            return _handleInvalidNumberStart(c10, true);
        }
        if (c10 == '0') {
            return q(i11, true);
        }
        int i14 = 1;
        while (i13 < i12) {
            int i15 = i13 + 1;
            char c11 = this._inputBuffer[i13];
            if (c11 < '0' || c11 > '9') {
                if (c11 == '.' || c11 == 'e' || c11 == 'E') {
                    this._inputPtr = i15;
                    return o(c11, i11, i15, i14, true);
                }
                this._inputPtr = i13;
                if (this._parsingContext.inRoot()) {
                    C(c11);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i11, i13 - i11);
                return resetInt(true, i14);
            }
            i14++;
            i13 = i15;
        }
        return q(i11, true);
    }

    public final JsonToken _parsePosNumber(int i10) throws IOException {
        int i11 = this._inputPtr;
        int i12 = i11 - 1;
        int i13 = this._inputEnd;
        if (i10 == 48) {
            return q(i12, false);
        }
        int i14 = 1;
        while (i11 < i13) {
            int i15 = i11 + 1;
            char c10 = this._inputBuffer[i11];
            if (c10 < '0' || c10 > '9') {
                if (c10 == '.' || c10 == 'e' || c10 == 'E') {
                    this._inputPtr = i15;
                    return o(c10, i12, i15, i14, false);
                }
                this._inputPtr = i11;
                if (this._parsingContext.inRoot()) {
                    C(c10);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i12, i11 - i12);
                return resetInt(false, i14);
            }
            i14++;
            i11 = i15;
        }
        this._inputPtr = i12;
        return q(i12, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a A[DONT_INVERT, PHI: r10
      0x003a: PHI (r10v4 int) = (r10v3 int), (r10v22 int) binds: [B:9:0x002b, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0118 A[EDGE_INSN: B:56:0x0118->B:57:0x0120 BREAK  A[LOOP:0: B:3:0x000e->B:77:0x000e]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0105 A[SYNTHETIC] */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i10;
        char c10;
        int iDecodeBase64Char;
        int i11;
        char c11;
        int iDecodeBase64Char2;
        int i12;
        char c12;
        int iDecodeBase64Char3;
        char c13;
        int i13 = 3;
        int length = bArr.length - 3;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i16 = this._inputPtr;
            this._inputPtr = i16 + 1;
            char c14 = cArr[i16];
            if (c14 > ' ') {
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c14);
                if (iDecodeBase64Char4 < 0) {
                    if (c14 == '\"') {
                        break;
                    }
                    iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, c14, 0);
                    if (iDecodeBase64Char4 >= 0) {
                        if (i14 > length) {
                            i15 += i14;
                            outputStream.write(bArr, 0, i14);
                            i14 = 0;
                        }
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr2 = this._inputBuffer;
                        int i17 = this._inputPtr;
                        this._inputPtr = i17 + 1;
                        c10 = cArr2[i17];
                        iDecodeBase64Char = base64Variant.decodeBase64Char(c10);
                        if (iDecodeBase64Char < 0) {
                            iDecodeBase64Char = _decodeBase64Escape(base64Variant, c10, 1);
                        }
                        i11 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr3 = this._inputBuffer;
                        int i18 = this._inputPtr;
                        this._inputPtr = i18 + 1;
                        c11 = cArr3[i18];
                        iDecodeBase64Char2 = base64Variant.decodeBase64Char(c11);
                        if (iDecodeBase64Char2 >= 0) {
                            if (iDecodeBase64Char2 != -2) {
                                if (c11 == '\"') {
                                    int i19 = i14 + 1;
                                    bArr[i14] = (byte) (i11 >> 4);
                                    if (base64Variant.usesPadding()) {
                                        this._inputPtr--;
                                        _handleBase64MissingPadding(base64Variant);
                                    }
                                    i14 = i19;
                                    break;
                                }
                                iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, c11, 2);
                            }
                            if (iDecodeBase64Char2 == -2) {
                                if (this._inputPtr >= this._inputEnd) {
                                    _loadMoreGuaranteed();
                                }
                                char[] cArr4 = this._inputBuffer;
                                int i20 = this._inputPtr;
                                this._inputPtr = i20 + 1;
                                c13 = cArr4[i20];
                                if (base64Variant.usesPaddingChar(c13)) {
                                }
                                bArr[i14] = (byte) (i11 >> 4);
                                i14++;
                            }
                        }
                        i12 = (i11 << 6) | iDecodeBase64Char2;
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr5 = this._inputBuffer;
                        int i21 = this._inputPtr;
                        this._inputPtr = i21 + 1;
                        c12 = cArr5[i21];
                        iDecodeBase64Char3 = base64Variant.decodeBase64Char(c12);
                        if (iDecodeBase64Char3 < 0) {
                            if (iDecodeBase64Char3 != -2) {
                                i10 = 3;
                            } else {
                                if (c12 == '\"') {
                                    int i22 = i14 + 1;
                                    bArr[i14] = (byte) (i12 >> 10);
                                    i14 += 2;
                                    bArr[i22] = (byte) (i12 >> 2);
                                    if (base64Variant.usesPadding()) {
                                        break;
                                    }
                                    this._inputPtr--;
                                    _handleBase64MissingPadding(base64Variant);
                                    break;
                                }
                                i10 = 3;
                                iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, c12, 3);
                            }
                            if (iDecodeBase64Char3 == -2) {
                                int i23 = i14 + 1;
                                bArr[i14] = (byte) (i12 >> 10);
                                i14 += 2;
                                bArr[i23] = (byte) (i12 >> 2);
                            }
                            i13 = i10;
                        } else {
                            i10 = 3;
                        }
                        int i24 = (i12 << 6) | iDecodeBase64Char3;
                        bArr[i14] = (byte) (i24 >> 16);
                        int i25 = i14 + 2;
                        bArr[i14 + 1] = (byte) (i24 >> 8);
                        i14 += 3;
                        bArr[i25] = (byte) i24;
                        i13 = i10;
                    }
                } else {
                    if (i14 > length) {
                        i15 += i14;
                        outputStream.write(bArr, 0, i14);
                        i14 = 0;
                    }
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    char[] cArr6 = this._inputBuffer;
                    int i110 = this._inputPtr;
                    this._inputPtr = i110 + 1;
                    c10 = cArr6[i110];
                    iDecodeBase64Char = base64Variant.decodeBase64Char(c10);
                    if (iDecodeBase64Char < 0) {
                        iDecodeBase64Char = _decodeBase64Escape(base64Variant, c10, 1);
                    }
                    i11 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    char[] cArr7 = this._inputBuffer;
                    int i111 = this._inputPtr;
                    this._inputPtr = i111 + 1;
                    c11 = cArr7[i111];
                    iDecodeBase64Char2 = base64Variant.decodeBase64Char(c11);
                    if (iDecodeBase64Char2 >= 0) {
                        if (iDecodeBase64Char2 != -2) {
                            if (c11 == '\"') {
                                int i112 = i14 + 1;
                                bArr[i14] = (byte) (i11 >> 4);
                                if (base64Variant.usesPadding()) {
                                    this._inputPtr--;
                                    _handleBase64MissingPadding(base64Variant);
                                }
                                i14 = i112;
                                break;
                            }
                            iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, c11, 2);
                        }
                        if (iDecodeBase64Char2 == -2) {
                            if (this._inputPtr >= this._inputEnd) {
                                _loadMoreGuaranteed();
                            }
                            char[] cArr8 = this._inputBuffer;
                            int i26 = this._inputPtr;
                            this._inputPtr = i26 + 1;
                            c13 = cArr8[i26];
                            if (base64Variant.usesPaddingChar(c13) && _decodeBase64Escape(base64Variant, c13, i13) != -2) {
                                throw reportInvalidBase64Char(base64Variant, c13, i13, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                            }
                            bArr[i14] = (byte) (i11 >> 4);
                            i14++;
                        }
                    }
                    i12 = (i11 << 6) | iDecodeBase64Char2;
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    char[] cArr9 = this._inputBuffer;
                    int i27 = this._inputPtr;
                    this._inputPtr = i27 + 1;
                    c12 = cArr9[i27];
                    iDecodeBase64Char3 = base64Variant.decodeBase64Char(c12);
                    if (iDecodeBase64Char3 < 0) {
                        if (iDecodeBase64Char3 != -2) {
                            i10 = 3;
                        } else {
                            if (c12 == '\"') {
                                int i28 = i14 + 1;
                                bArr[i14] = (byte) (i12 >> 10);
                                i14 += 2;
                                bArr[i28] = (byte) (i12 >> 2);
                                if (base64Variant.usesPadding()) {
                                    break;
                                }
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                                break;
                            }
                            i10 = 3;
                            iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, c12, 3);
                        }
                        if (iDecodeBase64Char3 == -2) {
                            int i29 = i14 + 1;
                            bArr[i14] = (byte) (i12 >> 10);
                            i14 += 2;
                            bArr[i29] = (byte) (i12 >> 2);
                        }
                        i13 = i10;
                    } else {
                        i10 = 3;
                    }
                    int i210 = (i12 << 6) | iDecodeBase64Char3;
                    bArr[i14] = (byte) (i210 >> 16);
                    int i211 = i14 + 2;
                    bArr[i14 + 1] = (byte) (i210 >> 8);
                    i14 += 3;
                    bArr[i211] = (byte) i210;
                    i13 = i10;
                }
            }
            i10 = i13;
            i13 = i10;
        }
        this._tokenIncomplete = false;
        if (i14 <= 0) {
            return i15;
        }
        int i30 = i15 + i14;
        outputStream.write(bArr, 0, i14);
        return i30;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (cArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = null;
        this._ioContext.releaseTokenBuffer(cArr);
    }

    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
    }

    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            if (cArr[i10] == '\n') {
                this._inputPtr = i10 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public final void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int i10 = this._inputPtr;
        int i11 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i10 >= i11) {
                this._inputPtr = i10;
                if (!_loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i10 = this._inputPtr;
                i11 = this._inputEnd;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 <= '\\') {
                if (c10 == '\\') {
                    this._inputPtr = i12;
                    _decodeEscaped();
                    i10 = this._inputPtr;
                    i11 = this._inputEnd;
                } else if (c10 <= '\"') {
                    if (c10 == '\"') {
                        this._inputPtr = i12;
                        return;
                    } else if (c10 < ' ') {
                        this._inputPtr = i12;
                        _throwUnquotedSpace(c10, "string value");
                    }
                }
            }
            i10 = i12;
        }
    }

    public final void a(int i10) throws JsonParseException {
        if (i10 == 93) {
            B();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i10, AbstractJsonLexerKt.END_OBJ);
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i10 == 125) {
            B();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i10, AbstractJsonLexerKt.END_LIST);
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    public final void b() throws IOException {
        int i10;
        char c10;
        int i11 = this._inputPtr;
        if (i11 + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i11] == 'a' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 's' && cArr[i11 + 3] == 'e' && ((c10 = cArr[(i10 = i11 + 4)]) < '0' || c10 == ']' || c10 == '}')) {
                this._inputPtr = i10;
                return;
            }
        }
        _matchToken("false", 1);
    }

    public final void e() throws IOException {
        int i10;
        char c10;
        int i11 = this._inputPtr;
        if (i11 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i11] == 'u' && cArr[i11 + 1] == 'l' && cArr[i11 + 2] == 'l' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this._inputPtr = i10;
                return;
            }
        }
        _matchToken(AbstractJsonLexerKt.NULL, 1);
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
        byte[] bArr;
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this._binaryValue) != null) {
            return bArr;
        }
        if (jsonToken != JsonToken.VALUE_STRING) {
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
        return new JsonLocation(_getSourceReference(), -1L, this._currInputProcessed + ((long) this._inputPtr), this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._reader;
    }

    @Deprecated
    public char getNextChar(String str) throws IOException {
        return getNextChar(str, null);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final char[] getTextCharacters() throws IOException {
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
    public final int getTextLength() throws IOException {
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
    public final int getTextOffset() throws java.io.IOException {
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_getSourceReference(), -1L, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_getSourceReference(), -1L, (this._nameStartOffset - 1) + this._currInputProcessed, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    public final void l() throws IOException {
        int i10;
        char c10;
        int i11 = this._inputPtr;
        if (i11 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i11] == 'r' && cArr[i11 + 1] == 'u' && cArr[i11 + 2] == 'e' && ((c10 = cArr[(i10 = i11 + 3)]) < '0' || c10 == ']' || c10 == '}')) {
                this._inputPtr = i10;
                return;
            }
        }
        _matchToken("true", 1);
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

    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    public final void n(int i10) throws IOException {
        if (i10 == 34) {
            this._tokenIncomplete = true;
            this._currToken = JsonToken.VALUE_STRING;
            return;
        }
        if (i10 == 44) {
            if (isEnabled(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                this._inputPtr--;
                this._currToken = JsonToken.VALUE_NULL;
                return;
            }
        } else {
            if (i10 == 45) {
                this._currToken = _parseNegNumber();
                return;
            }
            if (i10 == 91) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                this._currToken = JsonToken.START_ARRAY;
                return;
            }
            if (i10 != 93) {
                if (i10 == 102) {
                    _matchToken("false", 1);
                    this._currToken = JsonToken.VALUE_FALSE;
                    return;
                }
                if (i10 == 110) {
                    _matchToken(AbstractJsonLexerKt.NULL, 1);
                    this._currToken = JsonToken.VALUE_NULL;
                    return;
                }
                if (i10 == 116) {
                    _matchToken("true", 1);
                    this._currToken = JsonToken.VALUE_TRUE;
                    return;
                } else if (i10 == 123) {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    this._currToken = JsonToken.START_OBJECT;
                    return;
                } else {
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
                            this._currToken = _parsePosNumber(i10);
                            break;
                    }
                    return;
                }
            }
            if (isEnabled(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
                this._inputPtr--;
                this._currToken = JsonToken.VALUE_NULL;
                return;
            }
        }
        this._currToken = _handleOddValue(i10);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final Boolean nextBooleanValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            JsonToken jsonTokenNextToken = nextToken();
            if (jsonTokenNextToken != null) {
                int iId = jsonTokenNextToken.id();
                if (iId == 9) {
                    return Boolean.TRUE;
                }
                if (iId == 10) {
                    return Boolean.FALSE;
                }
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

    /* JADX WARN: Code duplicated, block: B:53:0x00bd A[PHI: r12
      0x00bd: PHI (r12v31 int) = (r12v30 int), (r12v29 int), (r12v29 int), (r12v29 int) binds: [B:52:0x00bc, B:46:0x00ad, B:42:0x00a4, B:43:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        int iV;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            m();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int iZ = z();
        if (iZ < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (iZ == 93 || iZ == 125) {
            a(iZ);
            return false;
        }
        if (this._parsingContext.expectComma()) {
            iZ = w(iZ);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (iZ == 93 || iZ == 125)) {
                a(iZ);
                return false;
            }
        }
        if (!this._parsingContext.inObject()) {
            B();
            n(iZ);
            return false;
        }
        int i10 = this._inputPtr;
        this._nameStartOffset = i10;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i10 - this._currInputRowStart;
        if (iZ == 34) {
            char[] cArrAsQuotedChars = serializableString.asQuotedChars();
            int length = cArrAsQuotedChars.length;
            int i11 = this._inputPtr;
            int i12 = length + i11;
            if (i12 + 4 < this._inputEnd && this._inputBuffer[i12] == '\"') {
                int i13 = 0;
                while (i11 != i12) {
                    if (cArrAsQuotedChars[i13] == this._inputBuffer[i11]) {
                        i13++;
                        i11++;
                    }
                }
                this._parsingContext.setCurrentName(serializableString.getValue());
                char[] cArr = this._inputBuffer;
                int i14 = i11 + 2;
                char c10 = cArr[i11 + 1];
                if (c10 == ':') {
                    int i15 = i11 + 3;
                    char c11 = cArr[i14];
                    if (c11 > ' ') {
                        if (c11 == '/' || c11 == '#') {
                            this._inputPtr = i15 - 1;
                            iV = v(true);
                        } else {
                            this._inputPtr = i15;
                            iV = c11;
                        }
                    } else if (c11 == ' ' || c11 == '\t') {
                        int i16 = i11 + 4;
                        char c12 = cArr[i15];
                        if (c12 <= ' ' || c12 == '/' || c12 == '#') {
                            i15 = i16;
                            this._inputPtr = i15 - 1;
                            iV = v(true);
                        } else {
                            this._inputPtr = i16;
                            iV = c12;
                        }
                    } else {
                        this._inputPtr = i15 - 1;
                        iV = v(true);
                    }
                } else {
                    if (c10 == ' ' || c10 == '\t') {
                        c10 = cArr[i14];
                        i14 = i11 + 3;
                    }
                    boolean z10 = c10 == ':';
                    if (z10) {
                        int i17 = i14 + 1;
                        char c13 = cArr[i14];
                        if (c13 <= ' ') {
                            if (c13 == ' ' || c13 == '\t') {
                                i14 += 2;
                                char c14 = cArr[i17];
                                if (c14 > ' ' && c14 != '/' && c14 != '#') {
                                    this._inputPtr = i14;
                                    iV = c14;
                                }
                            } else {
                                i14 = i17;
                            }
                            this._inputPtr = i14 - 1;
                            iV = v(z10);
                        } else if (c13 == '/' || c13 == '#') {
                            i14 = i17;
                            this._inputPtr = i14 - 1;
                            iV = v(z10);
                        } else {
                            this._inputPtr = i17;
                            iV = c13;
                        }
                    } else {
                        this._inputPtr = i14 - 1;
                        iV = v(z10);
                    }
                }
                this._currToken = JsonToken.FIELD_NAME;
                B();
                if (iV == 34) {
                    this._tokenIncomplete = true;
                    this._nextToken = JsonToken.VALUE_STRING;
                } else if (iV == 45) {
                    this._nextToken = _parseNegNumber();
                } else if (iV == 91) {
                    this._nextToken = JsonToken.START_ARRAY;
                } else if (iV == 102) {
                    _matchToken("false", 1);
                    this._nextToken = JsonToken.VALUE_FALSE;
                } else if (iV == 110) {
                    _matchToken(AbstractJsonLexerKt.NULL, 1);
                    this._nextToken = JsonToken.VALUE_NULL;
                } else if (iV == 116) {
                    _matchToken("true", 1);
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
                            this._nextToken = _handleOddValue(iV);
                            break;
                    }
                } else {
                    this._nextToken = JsonToken.START_OBJECT;
                }
                return true;
            }
        }
        return _isNextTokenNameMaybe(iZ, serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int nextIntValue(int i10) throws IOException {
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
    public final long nextLongValue(long j10) throws IOException {
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
    public final String nextTextValue() throws IOException {
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
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonToken nextToken() throws IOException {
        JsonToken jsonToken_parseNegNumber;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return m();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int iZ = z();
        if (iZ < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (iZ == 93 || iZ == 125) {
            a(iZ);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            iZ = w(iZ);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (iZ == 93 || iZ == 125)) {
                a(iZ);
                return this._currToken;
            }
        }
        boolean zInObject = this._parsingContext.inObject();
        if (zInObject) {
            int i10 = this._inputPtr;
            this._nameStartOffset = i10;
            this._nameStartRow = this._currInputRow;
            this._nameStartCol = i10 - this._currInputRowStart;
            this._parsingContext.setCurrentName(iZ == 34 ? _parseName() : _handleOddName(iZ));
            this._currToken = jsonToken2;
            iZ = u();
        }
        B();
        if (iZ == 34) {
            this._tokenIncomplete = true;
            jsonToken_parseNegNumber = JsonToken.VALUE_STRING;
        } else if (iZ == 45) {
            jsonToken_parseNegNumber = _parseNegNumber();
        } else if (iZ == 91) {
            if (!zInObject) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken_parseNegNumber = JsonToken.START_ARRAY;
        } else if (iZ == 102) {
            b();
            jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (iZ == 110) {
            e();
            jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
        } else if (iZ == 116) {
            l();
            jsonToken_parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (iZ == 123) {
            if (!zInObject) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken_parseNegNumber = JsonToken.START_OBJECT;
        } else if (iZ != 125) {
            switch (iZ) {
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
                    jsonToken_parseNegNumber = _parsePosNumber(iZ);
                    break;
                default:
                    jsonToken_parseNegNumber = _handleOddValue(iZ);
                    break;
            }
        } else {
            _reportUnexpectedChar(iZ, "expected a value");
            l();
            jsonToken_parseNegNumber = JsonToken.VALUE_TRUE;
        }
        if (zInObject) {
            this._nextToken = jsonToken_parseNegNumber;
            return this._currToken;
        }
        this._currToken = jsonToken_parseNegNumber;
        return jsonToken_parseNegNumber;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken o(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final String p(int i10, int i11, int i12) throws IOException {
        this._textBuffer.resetWithShared(this._inputBuffer, i10, this._inputPtr - i10);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i13 = this._inputPtr;
            this._inputPtr = i13 + 1;
            char c_decodeEscaped = cArr[i13];
            if (c_decodeEscaped <= '\\') {
                if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped <= i12) {
                    if (c_decodeEscaped == i12) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i11);
                    }
                    if (c_decodeEscaped < ' ') {
                        _throwUnquotedSpace(c_decodeEscaped, "name");
                    }
                }
            }
            i11 = (i11 * 33) + c_decodeEscaped;
            int i14 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c_decodeEscaped;
            if (i14 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i14;
            }
        }
    }

    public final JsonToken q(int i10, boolean z10) throws IOException {
        int i11;
        char nextChar;
        boolean z11;
        int i12;
        char nextChar2;
        char c10;
        if (z10) {
            i10++;
        }
        this._inputPtr = i10;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i13 = 0;
        if (z10) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = this._inputPtr;
        if (i14 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i14 + 1;
            nextChar = cArr[i14];
        } else {
            nextChar = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (nextChar == '0') {
            int i15 = this._inputPtr;
            int i16 = this._inputEnd;
            if ((i15 < i16 && ((c10 = this._inputBuffer[i15]) < '0' || c10 > '9')) || ((i15 >= i16 && !_loadMore()) || (nextChar = this._inputBuffer[this._inputPtr]) < '0' || nextChar > '9')) {
                nextChar = '0';
                break;
            }
            if (!isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            this._inputPtr++;
            if (nextChar == '0') {
                do {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr2 = this._inputBuffer;
                    int i17 = this._inputPtr;
                    nextChar = cArr2[i17];
                    if (nextChar < '0' || nextChar > '9') {
                        nextChar = '0';
                        break;
                    }
                    this._inputPtr = i17 + 1;
                } while (nextChar == '0');
            }
        }
        int i18 = 0;
        while (true) {
            if (nextChar >= '0' && nextChar <= '9') {
                i18++;
                if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                int i19 = i11 + 1;
                cArrEmptyAndGetCurrentSegment[i11] = nextChar;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    nextChar = 0;
                    i11 = i19;
                    z11 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i20 = this._inputPtr;
                this._inputPtr = i20 + 1;
                nextChar = cArr3[i20];
                i11 = i19;
            } else {
                z11 = false;
                break;
            }
        }
        if (i18 == 0) {
            return _handleInvalidNumberStart(nextChar, z10);
        }
        if (nextChar == '.') {
            if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i11 = 0;
            }
            cArrEmptyAndGetCurrentSegment[i11] = nextChar;
            i11++;
            i12 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z11 = true;
                    break;
                }
                char[] cArr4 = this._inputBuffer;
                int i21 = this._inputPtr;
                this._inputPtr = i21 + 1;
                nextChar = cArr4[i21];
                if (nextChar < '0' || nextChar > '9') {
                    break;
                }
                i12++;
                if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                cArrEmptyAndGetCurrentSegment[i11] = nextChar;
                i11++;
            }
            if (i12 == 0) {
                reportUnexpectedNumberChar(nextChar, "Decimal point not followed by a digit");
            }
        } else {
            i12 = 0;
        }
        if (nextChar == 'e' || nextChar == 'E') {
            if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i11 = 0;
            }
            int i22 = i11 + 1;
            cArrEmptyAndGetCurrentSegment[i11] = nextChar;
            int i23 = this._inputPtr;
            if (i23 < this._inputEnd) {
                char[] cArr5 = this._inputBuffer;
                this._inputPtr = i23 + 1;
                nextChar2 = cArr5[i23];
            } else {
                nextChar2 = getNextChar("expected a digit for number exponent");
            }
            if (nextChar2 == '-' || nextChar2 == '+') {
                if (i22 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i22 = 0;
                }
                int i24 = i22 + 1;
                cArrEmptyAndGetCurrentSegment[i22] = nextChar2;
                int i25 = this._inputPtr;
                if (i25 < this._inputEnd) {
                    char[] cArr6 = this._inputBuffer;
                    this._inputPtr = i25 + 1;
                    nextChar2 = cArr6[i25];
                } else {
                    nextChar2 = getNextChar("expected a digit for number exponent");
                }
                i22 = i24;
            }
            int i26 = 0;
            nextChar = nextChar2;
            while (true) {
                if (nextChar <= '9' && nextChar >= '0') {
                    i26++;
                    if (i22 >= cArrEmptyAndGetCurrentSegment.length) {
                        cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i22 = 0;
                    }
                    i11 = i22 + 1;
                    cArrEmptyAndGetCurrentSegment[i22] = nextChar;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i13 = i26;
                        z11 = true;
                        break;
                    }
                    char[] cArr7 = this._inputBuffer;
                    int i27 = this._inputPtr;
                    this._inputPtr = i27 + 1;
                    nextChar = cArr7[i27];
                    i22 = i11;
                } else {
                    i13 = i26;
                    i11 = i22;
                    break;
                }
            }
            if (i13 == 0) {
                reportUnexpectedNumberChar(nextChar, "Exponent indicator not followed by a digit");
            }
        }
        if (!z11) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                C(nextChar);
            }
        }
        this._textBuffer.setCurrentLength(i11);
        return reset(z10, i18, i12, i13);
    }

    public final int r() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    x();
                } else {
                    if (c10 != '#' || !isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
                        return c10;
                    }
                    y();
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
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
    public int releaseBuffered(Writer writer) throws IOException {
        int i10 = this._inputEnd;
        int i11 = this._inputPtr;
        int i12 = i10 - i11;
        if (i12 < 1) {
            return 0;
        }
        writer.write(this._inputBuffer, i11, i12);
        return i12;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    public final int u() throws IOException {
        int i10 = this._inputPtr;
        if (i10 + 4 >= this._inputEnd) {
            return v(false);
        }
        char[] cArr = this._inputBuffer;
        char c10 = cArr[i10];
        if (c10 == ':') {
            int i11 = i10 + 1;
            this._inputPtr = i11;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 == '/' || c11 == '#') {
                    return v(true);
                }
                this._inputPtr = i10 + 2;
                return c11;
            }
            if (c11 == ' ' || c11 == '\t') {
                int i12 = i10 + 2;
                this._inputPtr = i12;
                char c12 = cArr[i12];
                if (c12 > ' ') {
                    if (c12 == '/' || c12 == '#') {
                        return v(true);
                    }
                    this._inputPtr = i10 + 3;
                    return c12;
                }
            }
            return v(true);
        }
        if (c10 == ' ' || c10 == '\t') {
            int i13 = i10 + 1;
            this._inputPtr = i13;
            c10 = cArr[i13];
        }
        if (c10 != ':') {
            return v(false);
        }
        int i14 = this._inputPtr;
        int i15 = i14 + 1;
        this._inputPtr = i15;
        char c13 = cArr[i15];
        if (c13 > ' ') {
            if (c13 == '/' || c13 == '#') {
                return v(true);
            }
            this._inputPtr = i14 + 2;
            return c13;
        }
        if (c13 == ' ' || c13 == '\t') {
            int i16 = i14 + 2;
            this._inputPtr = i16;
            char c14 = cArr[i16];
            if (c14 > ' ') {
                if (c14 == '/' || c14 == '#') {
                    return v(true);
                }
                this._inputPtr = i14 + 3;
                return c14;
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
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            char c10 = cArr[i10];
            if (c10 > ' ') {
                if (c10 == '/') {
                    x();
                } else if (c10 == '#' && isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
                    y();
                } else {
                    if (z10) {
                        return c10;
                    }
                    if (c10 != ':') {
                        _reportUnexpectedChar(c10, "was expecting a colon to separate field name and value");
                    }
                    z10 = true;
                }
            } else if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
    }

    public final int w(int i10) throws IOException {
        if (i10 != 44) {
            _reportUnexpectedChar(i10, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        while (true) {
            int i11 = this._inputPtr;
            if (i11 >= this._inputEnd) {
                return r();
            }
            char[] cArr = this._inputBuffer;
            int i12 = i11 + 1;
            this._inputPtr = i12;
            char c10 = cArr[i11];
            if (c10 > ' ') {
                if (c10 != '/' && c10 != '#') {
                    return c10;
                }
                this._inputPtr = i11;
                return r();
            }
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i12;
                } else if (c10 == '\r') {
                    _skipCR();
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
    }

    public final void x() throws IOException {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '/') {
            y();
            return;
        }
        if (c10 != '*') {
            _reportUnexpectedChar(c10, "was expecting either '*' or '/' for a comment");
            return;
        }
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char[] cArr2 = this._inputBuffer;
            int i11 = this._inputPtr;
            int i12 = i11 + 1;
            this._inputPtr = i12;
            char c11 = cArr2[i11];
            if (c11 <= '*') {
                if (c11 == '*') {
                    if (i12 >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr3 = this._inputBuffer;
                    int i13 = this._inputPtr;
                    if (cArr3[i13] == '/') {
                        this._inputPtr = i13 + 1;
                        return;
                    }
                } else if (c11 < ' ') {
                    if (c11 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i12;
                    } else if (c11 == '\r') {
                        _skipCR();
                    } else if (c11 != '\t') {
                        _throwInvalidSpace(c11);
                    }
                }
            }
        }
        _reportInvalidEOF(" in a comment", null);
    }

    public final void y() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            char[] cArr = this._inputBuffer;
            int i10 = this._inputPtr;
            int i11 = i10 + 1;
            this._inputPtr = i11;
            char c10 = cArr[i10];
            if (c10 < ' ') {
                if (c10 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i11;
                    return;
                } else if (c10 == '\r') {
                    _skipCR();
                    return;
                } else if (c10 != '\t') {
                    _throwInvalidSpace(c10);
                }
            }
        }
    }

    public final int z() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        int i11 = i10 + 1;
        this._inputPtr = i11;
        char c10 = cArr[i10];
        if (c10 > ' ') {
            if (c10 != '/' && c10 != '#') {
                return c10;
            }
            this._inputPtr = i10;
            return A();
        }
        if (c10 != ' ') {
            if (c10 == '\n') {
                this._currInputRow++;
                this._currInputRowStart = i11;
            } else if (c10 == '\r') {
                _skipCR();
            } else if (c10 != '\t') {
                _throwInvalidSpace(c10);
            }
        }
        while (true) {
            int i12 = this._inputPtr;
            if (i12 >= this._inputEnd) {
                return A();
            }
            char[] cArr2 = this._inputBuffer;
            int i13 = i12 + 1;
            this._inputPtr = i13;
            char c11 = cArr2[i12];
            if (c11 > ' ') {
                if (c11 != '/' && c11 != '#') {
                    return c11;
                }
                this._inputPtr = i12;
                return A();
            }
            if (c11 != ' ') {
                if (c11 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i13;
                } else if (c11 == '\r') {
                    _skipCR();
                } else if (c11 != '\t') {
                    _throwInvalidSpace(c11);
                }
            }
        }
    }

    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        do {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char c10 = this._inputBuffer[this._inputPtr];
                if (Character.isJavaIdentifierPart(c10)) {
                    this._inputPtr++;
                    sb2.append(c10);
                }
            }
            _reportError("Unrecognized token '%s': was expecting %s", sb2, str2);
        } while (sb2.length() < 256);
        sb2.append("...");
        _reportError("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    public char getNextChar(String str, JsonToken jsonToken) throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i10 = this._inputPtr;
        this._inputPtr = i10 + 1;
        return cArr[i10];
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
    public final String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i10, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i10);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
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
        if (iZ < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (iZ != 93 && iZ != 125) {
            if (this._parsingContext.expectComma()) {
                iZ = w(iZ);
                if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (iZ == 93 || iZ == 125)) {
                    a(iZ);
                    return null;
                }
            }
            if (!this._parsingContext.inObject()) {
                B();
                n(iZ);
                return null;
            }
            int i10 = this._inputPtr;
            this._nameStartOffset = i10;
            this._nameStartRow = this._currInputRow;
            this._nameStartCol = i10 - this._currInputRowStart;
            String str_parseName = iZ == 34 ? _parseName() : _handleOddName(iZ);
            this._parsingContext.setCurrentName(str_parseName);
            this._currToken = jsonToken2;
            int iU = u();
            B();
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
                b();
                jsonToken_parseNegNumber = JsonToken.VALUE_FALSE;
            } else if (iU == 110) {
                e();
                jsonToken_parseNegNumber = JsonToken.VALUE_NULL;
            } else if (iU == 116) {
                l();
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
                        jsonToken_parseNegNumber = _handleOddValue(iU);
                        break;
                }
            } else {
                jsonToken_parseNegNumber = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken_parseNegNumber;
            return str_parseName;
        }
        a(iZ);
        return null;
    }
}

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonStringEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f43053a = CharTypes.copyHexChars();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f43054b = CharTypes.copyHexBytes();
    protected ByteArrayBuilder _bytes;
    protected final char[] _qbuf = {AbstractJsonLexerKt.STRING_ESC, 0, '0', '0', 0, 0};
    protected TextBuffer _text;

    public static int a(int i10, int i11) {
        if (i11 >= 56320 && i11 <= 57343) {
            return (i11 - 56320) + ((i10 - GeneratorBase.SURR1_FIRST) << 10) + 65536;
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i10) + ", second 0x" + Integer.toHexString(i11) + "; illegal combination");
    }

    public static void b(int i10) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i10));
    }

    @Deprecated
    public static JsonStringEncoder getInstance() {
        return BufferRecyclers.getJsonStringEncoder();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0 A[SYNTHETIC] */
    public byte[] encodeAsUTF8(String str) {
        int i10;
        int i11;
        ByteArrayBuilder byteArrayBuilder = this._bytes;
        if (byteArrayBuilder == null) {
            byteArrayBuilder = new ByteArrayBuilder((BufferRecycler) null);
            this._bytes = byteArrayBuilder;
        }
        int length = str.length();
        byte[] bArrResetAndGetFirstSegment = byteArrayBuilder.resetAndGetFirstSegment();
        int length2 = bArrResetAndGetFirstSegment.length;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i12 < length) {
            int i14 = i12 + 1;
            char cCharAt = str.charAt(i12);
            while (cCharAt <= 127) {
                if (i13 >= length2) {
                    bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                    length2 = bArrResetAndGetFirstSegment.length;
                    i13 = 0;
                }
                int i15 = i13 + 1;
                bArrResetAndGetFirstSegment[i13] = (byte) cCharAt;
                if (i14 >= length) {
                    i13 = i15;
                    break loop0;
                }
                char cCharAt2 = str.charAt(i14);
                i14++;
                cCharAt = cCharAt2;
                i13 = i15;
            }
            if (i13 >= length2) {
                bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                length2 = bArrResetAndGetFirstSegment.length;
                i13 = 0;
            }
            if (cCharAt < 2048) {
                i10 = i13 + 1;
                bArrResetAndGetFirstSegment[i13] = (byte) ((cCharAt >> 6) | 192);
            } else {
                if (cCharAt < 55296 || cCharAt > 57343) {
                    int i16 = i13 + 1;
                    bArrResetAndGetFirstSegment[i13] = (byte) ((cCharAt >> '\f') | 224);
                    if (i16 >= length2) {
                        bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                        length2 = bArrResetAndGetFirstSegment.length;
                        i16 = 0;
                    }
                    bArrResetAndGetFirstSegment[i16] = (byte) (((cCharAt >> 6) & 63) | 128);
                    i10 = i16 + 1;
                } else {
                    if (cCharAt > 56319) {
                        b(cCharAt);
                        throw null;
                    }
                    if (i14 >= length) {
                        b(cCharAt);
                        throw null;
                    }
                    int i17 = i14 + 1;
                    int iA = a(cCharAt, str.charAt(i14));
                    if (iA > 1114111) {
                        b(iA);
                        throw null;
                    }
                    int i18 = i13 + 1;
                    bArrResetAndGetFirstSegment[i13] = (byte) ((iA >> 18) | 240);
                    if (i18 >= length2) {
                        bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                        length2 = bArrResetAndGetFirstSegment.length;
                        i18 = 0;
                    }
                    int i19 = i18 + 1;
                    bArrResetAndGetFirstSegment[i18] = (byte) (((iA >> 12) & 63) | 128);
                    if (i19 >= length2) {
                        bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                        length2 = bArrResetAndGetFirstSegment.length;
                        i19 = 0;
                    }
                    int i20 = i19 + 1;
                    bArrResetAndGetFirstSegment[i19] = (byte) (((iA >> 6) & 63) | 128);
                    i11 = iA;
                    i12 = i17;
                    i10 = i20;
                }
                if (i10 >= length2) {
                    bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                    length2 = bArrResetAndGetFirstSegment.length;
                    i10 = 0;
                }
                bArrResetAndGetFirstSegment[i10] = (byte) ((i11 & 63) | 128);
                i13 = i10 + 1;
            }
            i11 = cCharAt;
            i12 = i14;
            if (i10 >= length2) {
                bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                length2 = bArrResetAndGetFirstSegment.length;
                i10 = 0;
            }
            bArrResetAndGetFirstSegment[i10] = (byte) ((i11 & 63) | 128);
            i13 = i10 + 1;
        }
        return this._bytes.completeAndCoalesce(i13);
    }

    public char[] quoteAsString(String str) {
        int i10;
        TextBuffer textBuffer = this._text;
        if (textBuffer == null) {
            textBuffer = new TextBuffer(null);
            this._text = textBuffer;
        }
        char[] cArrEmptyAndGetCurrentSegment = textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length = iArr.length;
        int length2 = str.length();
        int i11 = 0;
        int i12 = 0;
        loop0: while (i11 < length2) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt >= length || iArr[cCharAt] == 0) {
                    if (i12 >= cArrEmptyAndGetCurrentSegment.length) {
                        cArrEmptyAndGetCurrentSegment = textBuffer.finishCurrentSegment();
                        i12 = 0;
                    }
                    int i13 = i12 + 1;
                    cArrEmptyAndGetCurrentSegment[i12] = cCharAt;
                    i11++;
                    if (i11 >= length2) {
                        i12 = i13;
                        break loop0;
                    }
                    i12 = i13;
                }
            }
            int i14 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            int i15 = iArr[cCharAt2];
            if (i15 < 0) {
                char[] cArr = this._qbuf;
                cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
                char[] cArr2 = f43053a;
                cArr[4] = cArr2[cCharAt2 >> 4];
                cArr[5] = cArr2[cCharAt2 & 15];
                i10 = 6;
            } else {
                this._qbuf[1] = (char) i15;
                i10 = 2;
            }
            int i16 = i12 + i10;
            if (i16 > cArrEmptyAndGetCurrentSegment.length) {
                int length3 = cArrEmptyAndGetCurrentSegment.length - i12;
                if (length3 > 0) {
                    System.arraycopy(this._qbuf, 0, cArrEmptyAndGetCurrentSegment, i12, length3);
                }
                cArrEmptyAndGetCurrentSegment = textBuffer.finishCurrentSegment();
                int i17 = i10 - length3;
                System.arraycopy(this._qbuf, length3, cArrEmptyAndGetCurrentSegment, 0, i17);
                i12 = i17;
            } else {
                System.arraycopy(this._qbuf, 0, cArrEmptyAndGetCurrentSegment, i12, i10);
                i12 = i16;
            }
            i11 = i14;
        }
        textBuffer.setCurrentLength(i12);
        return textBuffer.contentsAsArray();
    }

    public byte[] quoteAsUTF8(String str) {
        int i10;
        int i11;
        int i12;
        ByteArrayBuilder byteArrayBuilder = this._bytes;
        if (byteArrayBuilder == null) {
            byteArrayBuilder = new ByteArrayBuilder((BufferRecycler) null);
            this._bytes = byteArrayBuilder;
        }
        int length = str.length();
        byte[] bArrResetAndGetFirstSegment = byteArrayBuilder.resetAndGetFirstSegment();
        int i13 = 0;
        int currentSegmentLength = 0;
        loop0: while (i13 < length) {
            int[] iArr = CharTypes.get7BitOutputEscapes();
            while (true) {
                char cCharAt = str.charAt(i13);
                if (cCharAt > 127 || iArr[cCharAt] != 0) {
                    break;
                }
                if (currentSegmentLength >= bArrResetAndGetFirstSegment.length) {
                    bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                    currentSegmentLength = 0;
                }
                int i14 = currentSegmentLength + 1;
                bArrResetAndGetFirstSegment[currentSegmentLength] = (byte) cCharAt;
                i13++;
                if (i13 >= length) {
                    currentSegmentLength = i14;
                    break loop0;
                }
                currentSegmentLength = i14;
            }
            if (currentSegmentLength >= bArrResetAndGetFirstSegment.length) {
                bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                currentSegmentLength = 0;
            }
            int i15 = i13 + 1;
            int iCharAt = str.charAt(i13);
            if (iCharAt <= 127) {
                int i16 = iArr[iCharAt];
                byteArrayBuilder.setCurrentSegmentLength(currentSegmentLength);
                byteArrayBuilder.append(92);
                if (i16 < 0) {
                    byteArrayBuilder.append(117);
                    byte[] bArr = f43054b;
                    if (iCharAt > 255) {
                        byteArrayBuilder.append(bArr[iCharAt >> 12]);
                        byteArrayBuilder.append(bArr[(iCharAt >> 8) & 15]);
                        iCharAt &= 255;
                    } else {
                        byteArrayBuilder.append(48);
                        byteArrayBuilder.append(48);
                    }
                    byteArrayBuilder.append(bArr[iCharAt >> 4]);
                    byteArrayBuilder.append(bArr[iCharAt & 15]);
                } else {
                    byteArrayBuilder.append((byte) i16);
                }
                currentSegmentLength = byteArrayBuilder.getCurrentSegmentLength();
                bArrResetAndGetFirstSegment = byteArrayBuilder.getCurrentSegment();
            } else {
                if (iCharAt <= 2047) {
                    i12 = currentSegmentLength + 1;
                    bArrResetAndGetFirstSegment[currentSegmentLength] = (byte) ((iCharAt >> 6) | 192);
                    i11 = (iCharAt & 63) | 128;
                } else {
                    if (iCharAt < 55296 || iCharAt > 57343) {
                        int i17 = currentSegmentLength + 1;
                        bArrResetAndGetFirstSegment[currentSegmentLength] = (byte) ((iCharAt >> 12) | 224);
                        if (i17 >= bArrResetAndGetFirstSegment.length) {
                            bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                            i17 = 0;
                        }
                        bArrResetAndGetFirstSegment[i17] = (byte) (((iCharAt >> 6) & 63) | 128);
                        i10 = i17 + 1;
                        i11 = (iCharAt & 63) | 128;
                    } else {
                        if (iCharAt > 56319) {
                            b(iCharAt);
                            throw null;
                        }
                        if (i15 >= length) {
                            b(iCharAt);
                            throw null;
                        }
                        int i18 = i13 + 2;
                        int iA = a(iCharAt, str.charAt(i15));
                        if (iA > 1114111) {
                            b(iA);
                            throw null;
                        }
                        int i19 = currentSegmentLength + 1;
                        bArrResetAndGetFirstSegment[currentSegmentLength] = (byte) ((iA >> 18) | 240);
                        if (i19 >= bArrResetAndGetFirstSegment.length) {
                            bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                            i19 = 0;
                        }
                        int i20 = i19 + 1;
                        bArrResetAndGetFirstSegment[i19] = (byte) (((iA >> 12) & 63) | 128);
                        if (i20 >= bArrResetAndGetFirstSegment.length) {
                            bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                            i20 = 0;
                        }
                        int i21 = i20 + 1;
                        bArrResetAndGetFirstSegment[i20] = (byte) (((iA >> 6) & 63) | 128);
                        i11 = (iA & 63) | 128;
                        i10 = i21;
                        i15 = i18;
                    }
                    i12 = i10;
                }
                if (i12 >= bArrResetAndGetFirstSegment.length) {
                    bArrResetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                    i12 = 0;
                }
                bArrResetAndGetFirstSegment[i12] = (byte) i11;
                currentSegmentLength = i12 + 1;
            }
            i13 = i15;
        }
        return this._bytes.completeAndCoalesce(currentSegmentLength);
    }

    public void quoteAsString(CharSequence charSequence, StringBuilder sb2) {
        int i10;
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length = iArr.length;
        int length2 = charSequence.length();
        int i11 = 0;
        while (i11 < length2) {
            do {
                char cCharAt = charSequence.charAt(i11);
                if (cCharAt < length && iArr[cCharAt] != 0) {
                    int i12 = i11 + 1;
                    char cCharAt2 = charSequence.charAt(i11);
                    int i13 = iArr[cCharAt2];
                    if (i13 < 0) {
                        char[] cArr = this._qbuf;
                        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
                        char[] cArr2 = f43053a;
                        cArr[4] = cArr2[cCharAt2 >> 4];
                        cArr[5] = cArr2[cCharAt2 & 15];
                        i10 = 6;
                    } else {
                        this._qbuf[1] = (char) i13;
                        i10 = 2;
                    }
                    sb2.append(this._qbuf, 0, i10);
                    i11 = i12;
                } else {
                    sb2.append(cCharAt);
                    i11++;
                }
            } while (i11 < length2);
            return;
        }
    }
}

package androidx.emoji2.text.flatbuffer;

import androidx.camera.camera2.internal.n1;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Utf8Safe extends Utf8 {

    public static class a extends IllegalArgumentException {
        public a(int i10, int i11) {
            super(n1.e("Unpaired surrogate at index ", i10, " of ", i11));
        }
    }

    public static String decodeUtf8Array(byte[] bArr, int i10, int i11) {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!Utf8.a.e(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (Utf8.a.e(b11)) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                while (i15 < i12) {
                    byte b12 = bArr[i15];
                    if (!Utf8.a.e(b12)) {
                        break;
                    }
                    i15++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i10 = i15;
            } else {
                if (b11 < -32) {
                    if (i15 >= i12) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i10 += 2;
                    Utf8.a.c(b11, bArr[i15], cArr, i14);
                    i14++;
                } else if (b11 < -16) {
                    if (i15 >= i12 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    Utf8.a.b(b11, bArr[i15], bArr[i17], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b13 = bArr[i15];
                    int i18 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    Utf8.a.a(b11, b13, b14, bArr[i18], cArr, i14);
                    i14 += 2;
                }
            }
        }
        return new String(cArr, 0, i14);
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i10, int i11) {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (!Utf8.a.e(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (Utf8.a.e(b11)) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                while (i15 < i12) {
                    byte b12 = byteBuffer.get(i15);
                    if (!Utf8.a.e(b12)) {
                        break;
                    }
                    i15++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i10 = i15;
            } else {
                if (b11 < -32) {
                    if (i15 >= i12) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    i10 += 2;
                    Utf8.a.c(b11, byteBuffer.get(i15), cArr, i14);
                    i14++;
                } else if (b11 < -16) {
                    if (i15 >= i12 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    Utf8.a.b(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    byte b13 = byteBuffer.get(i15);
                    int i18 = i10 + 3;
                    byte b14 = byteBuffer.get(i10 + 2);
                    i10 += 4;
                    Utf8.a.a(b11, b13, b14, byteBuffer.get(i18), cArr, i14);
                    i14 += 2;
                }
            }
        }
        return new String(cArr, 0, i14);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i10, int i11) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11) : decodeUtf8Buffer(byteBuffer, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        int i11;
        char cCharAt;
        char c10 = 57343;
        char c11 = 2048;
        int i12 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            while (i12 < length) {
                try {
                    char cCharAt2 = charSequence.charAt(i12);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i12, (byte) cCharAt2);
                    i12++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i12 == length) {
                byteBuffer.position(iPosition + i12);
                return;
            }
            iPosition += i12;
            while (i12 < length) {
                char cCharAt3 = charSequence.charAt(i12);
                if (cCharAt3 >= 128) {
                    if (cCharAt3 < 2048) {
                        int i13 = iPosition + 1;
                        try {
                            byteBuffer.put(iPosition, (byte) ((cCharAt3 >>> 6) | 192));
                            byteBuffer.put(i13, (byte) ((cCharAt3 & '?') | 128));
                            iPosition = i13;
                        } catch (IndexOutOfBoundsException unused2) {
                            iPosition = i13;
                        }
                    } else {
                        if (cCharAt3 >= 55296 && 57343 >= cCharAt3) {
                            int i14 = i12 + 1;
                            if (i14 != length) {
                                try {
                                    char cCharAt4 = charSequence.charAt(i14);
                                    if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                        int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                        int i15 = iPosition + 1;
                                        try {
                                            byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                            int i16 = iPosition + 2;
                                            try {
                                                byteBuffer.put(i15, (byte) (((codePoint >>> 12) & 63) | 128));
                                                iPosition += 3;
                                                byteBuffer.put(i16, (byte) (((codePoint >>> 6) & 63) | 128));
                                                byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                                i12 = i14;
                                                i12++;
                                                iPosition++;
                                            } catch (IndexOutOfBoundsException unused3) {
                                                i12 = i14;
                                                iPosition = i16;
                                            }
                                        } catch (IndexOutOfBoundsException unused4) {
                                            iPosition = i15;
                                            i12 = i14;
                                        }
                                    } else {
                                        i12 = i14;
                                    }
                                } catch (IndexOutOfBoundsException unused5) {
                                }
                                i12 = i14;
                            }
                            throw new a(i12, length);
                        }
                        int i17 = iPosition + 1;
                        try {
                            byteBuffer.put(iPosition, (byte) ((cCharAt3 >>> '\f') | 224));
                            iPosition += 2;
                            byteBuffer.put(i17, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            byteBuffer.put(iPosition, (byte) ((cCharAt3 & '?') | 128));
                            i12++;
                            iPosition++;
                        } catch (IndexOutOfBoundsException unused6) {
                            iPosition = i17;
                        }
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i12) + " at index " + (Math.max(i12, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
                byteBuffer.put(iPosition, (byte) cCharAt3);
                i12++;
                iPosition++;
            }
            byteBuffer.position(iPosition);
            return;
        }
        int iArrayOffset = byteBuffer.arrayOffset();
        byte[] bArrArray = byteBuffer.array();
        int iPosition2 = byteBuffer.position() + iArrayOffset;
        int iRemaining = byteBuffer.remaining();
        int length2 = charSequence.length();
        int i18 = iRemaining + iPosition2;
        while (i12 < length2) {
            int i19 = i12 + iPosition2;
            if (i19 >= i18 || (cCharAt = charSequence.charAt(i12)) >= 128) {
                break;
            }
            bArrArray[i19] = (byte) cCharAt;
            i12++;
        }
        if (i12 == length2) {
            i10 = iPosition2 + length2;
        } else {
            i10 = iPosition2 + i12;
            while (i12 < length2) {
                char cCharAt5 = charSequence.charAt(i12);
                if (cCharAt5 < 128 && i10 < i18) {
                    bArrArray[i10] = (byte) cCharAt5;
                    i10++;
                } else if (cCharAt5 < c11 && i10 <= i18 - 2) {
                    int i20 = i10 + 1;
                    bArrArray[i10] = (byte) ((cCharAt5 >>> 6) | 960);
                    i10 += 2;
                    bArrArray[i20] = (byte) ((cCharAt5 & '?') | 128);
                } else {
                    if ((cCharAt5 >= 55296 && c10 >= cCharAt5) || i10 > i18 - 3) {
                        if (i10 > i18 - 4) {
                            if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i11 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt5, charSequence.charAt(i11)))) {
                                throw new a(i12, length2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + i10);
                        }
                        int i21 = i12 + 1;
                        if (i21 != charSequence.length()) {
                            char cCharAt6 = charSequence.charAt(i21);
                            if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                bArrArray[i10] = (byte) ((codePoint2 >>> 18) | 240);
                                bArrArray[i10 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                int i22 = i10 + 3;
                                bArrArray[i10 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                i10 += 4;
                                bArrArray[i22] = (byte) ((codePoint2 & 63) | 128);
                                i12 = i21;
                            } else {
                                i12 = i21;
                            }
                        }
                        throw new a(i12 - 1, length2);
                    }
                    bArrArray[i10] = (byte) ((cCharAt5 >>> '\f') | 480);
                    int i23 = i10 + 2;
                    bArrArray[i10 + 1] = (byte) (((cCharAt5 >>> 6) & 63) | 128);
                    i10 += 3;
                    bArrArray[i23] = (byte) ((cCharAt5 & '?') | 128);
                }
                i12++;
                c10 = 57343;
                c11 = 2048;
            }
        }
        byteBuffer.position(i10 - iArrayOffset);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new a(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + SvgConstantsKt.SPECIFIED_SOLID_OPACITY));
    }
}

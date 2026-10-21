package com.fasterxml.jackson.core.io;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class CharTypes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f43043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f43044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f43045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f43046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f43047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f43048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f43049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f43050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f43051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f43052j;

    static {
        int i10;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f43043a = charArray;
        int length = charArray.length;
        f43044b = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            f43044b[i11] = (byte) f43043a[i11];
        }
        int[] iArr = new int[256];
        for (int i12 = 0; i12 < 32; i12++) {
            iArr[i12] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f43045c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i13 = 128; i13 < 256; i13++) {
            if ((i13 & 224) == 192) {
                i10 = 2;
            } else if ((i13 & 240) == 224) {
                i10 = 3;
            } else {
                i10 = (i13 & 248) == 240 ? 4 : -1;
            }
            iArr2[i13] = i10;
        }
        f43046d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i14 = 33; i14 < 256; i14++) {
            if (Character.isJavaIdentifierPart((char) i14)) {
                iArr3[i14] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f43047e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f43048f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f43046d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f43049g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f43050h = iArr7;
        int[] iArr8 = new int[128];
        for (int i15 = 0; i15 < 32; i15++) {
            iArr8[i15] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f43051i = iArr8;
        int[] iArr9 = new int[128];
        f43052j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i16 = 0; i16 < 10; i16++) {
            f43052j[i16 + 48] = i16;
        }
        for (int i17 = 0; i17 < 6; i17++) {
            int[] iArr10 = f43052j;
            int i18 = i17 + 10;
            iArr10[i17 + 97] = i18;
            iArr10[i17 + 65] = i18;
        }
    }

    public static void appendQuoted(StringBuilder sb2, String str) {
        int[] iArr = f43051i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb2.append(cCharAt);
            } else {
                sb2.append(AbstractJsonLexerKt.STRING_ESC);
                int i11 = iArr[cCharAt];
                if (i11 < 0) {
                    sb2.append(AbstractJsonLexerKt.UNICODE_ESC);
                    sb2.append('0');
                    sb2.append('0');
                    char[] cArr = f43043a;
                    sb2.append(cArr[cCharAt >> 4]);
                    sb2.append(cArr[cCharAt & 15]);
                } else {
                    sb2.append((char) i11);
                }
            }
        }
    }

    public static int charToHex(int i10) {
        if (i10 > 127) {
            return -1;
        }
        return f43052j[i10];
    }

    public static byte[] copyHexBytes() {
        return (byte[]) f43044b.clone();
    }

    public static char[] copyHexChars() {
        return (char[]) f43043a.clone();
    }

    public static int[] get7BitOutputEscapes() {
        return f43051i;
    }

    public static int[] getInputCodeComment() {
        return f43049g;
    }

    public static int[] getInputCodeLatin1() {
        return f43045c;
    }

    public static int[] getInputCodeLatin1JsNames() {
        return f43047e;
    }

    public static int[] getInputCodeUtf8() {
        return f43046d;
    }

    public static int[] getInputCodeUtf8JsNames() {
        return f43048f;
    }

    public static int[] getInputCodeWS() {
        return f43050h;
    }
}

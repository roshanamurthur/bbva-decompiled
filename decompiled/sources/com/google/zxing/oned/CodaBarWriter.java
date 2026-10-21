package com.google.zxing.oned;

import com.fasterxml.jackson.core.JsonPointer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public final class CodaBarWriter extends OneDimensionalCodeWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f49912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f49913b = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f49914c = {JsonPointer.SEPARATOR, AbstractJsonLexerKt.COLON, '+', '.'};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f49915d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f49912a = cArr;
        f49915d = cArr[0];
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int i10;
        int length = str.length();
        char c10 = f49915d;
        if (length < 2) {
            str = c10 + str + c10;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f49912a;
            boolean zB = CodaBarReader.b(cArr, upperCase);
            boolean zB2 = CodaBarReader.b(cArr, upperCase2);
            char[] cArr2 = f49913b;
            boolean zB3 = CodaBarReader.b(cArr2, upperCase);
            boolean zB4 = CodaBarReader.b(cArr2, upperCase2);
            if (zB) {
                if (!zB2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zB3) {
                if (zB2 || zB4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                str = c10 + str + c10;
            } else if (!zB4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (Character.isDigit(str.charAt(i12)) || str.charAt(i12) == '-' || str.charAt(i12) == '$') {
                i11 += 9;
            } else {
                if (!CodaBarReader.b(f49914c, str.charAt(i12))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
                }
                i11 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i11];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.f49906d;
                if (i15 >= cArr3.length) {
                    i10 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i15]) {
                    i10 = CodaBarReader.f49907e[i15];
                    break;
                }
                i15++;
            }
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < 7) {
                zArr[i13] = z10;
                i13++;
                if (((i10 >> (6 - i16)) & 1) == 0 || i17 == 1) {
                    z10 = !z10;
                    i16++;
                    i17 = 0;
                } else {
                    i17++;
                }
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }
}

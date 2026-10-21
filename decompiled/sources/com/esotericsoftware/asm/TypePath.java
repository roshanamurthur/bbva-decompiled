package com.esotericsoftware.asm;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class TypePath {
    public static final int ARRAY_ELEMENT = 0;
    public static final int INNER_TYPE = 1;
    public static final int TYPE_ARGUMENT = 3;
    public static final int WILDCARD_BOUND = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f39937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39938b;

    public TypePath(byte[] bArr, int i10) {
        this.f39937a = bArr;
        this.f39938b = i10;
    }

    public static TypePath fromString(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        ByteVector byteVector = new ByteVector(length);
        byteVector.putByte(0);
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt == '[') {
                byteVector.b(0, 0);
            } else if (cCharAt == '.') {
                byteVector.b(1, 0);
            } else if (cCharAt == '*') {
                byteVector.b(2, 0);
            } else if (cCharAt >= '0' && cCharAt <= '9') {
                int i12 = cCharAt - '0';
                while (i11 < length) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i12 = ((i12 * 10) + cCharAt2) - 48;
                    i11++;
                }
                if (i11 < length && str.charAt(i11) == ';') {
                    i11++;
                }
                byteVector.b(3, i12);
            }
            i10 = i11;
        }
        byte[] bArr = byteVector.f39886a;
        bArr[0] = (byte) (byteVector.f39887b / 2);
        return new TypePath(bArr, 0);
    }

    public int getLength() {
        return this.f39937a[this.f39938b];
    }

    public int getStep(int i10) {
        return this.f39937a[(i10 * 2) + this.f39938b + 1];
    }

    public int getStepArgument(int i10) {
        return this.f39937a[(i10 * 2) + this.f39938b + 2];
    }

    public String toString() {
        char c10;
        int length = getLength();
        StringBuffer stringBuffer = new StringBuffer(length * 2);
        for (int i10 = 0; i10 < length; i10++) {
            int step = getStep(i10);
            if (step == 0) {
                c10 = AbstractJsonLexerKt.BEGIN_LIST;
            } else if (step == 1) {
                c10 = '.';
            } else if (step == 2) {
                c10 = '*';
            } else if (step != 3) {
                c10 = '_';
            } else {
                stringBuffer.append(getStepArgument(i10));
                c10 = ';';
            }
            stringBuffer.append(c10);
        }
        return stringBuffer.toString();
    }
}

package com.nulabinc.zxcvbn;

import androidx.camera.core.impl.utils.b;
import java.nio.CharBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class WipeableString implements CharSequence {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public char[] f63649p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f63650q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f63651r0 = false;

    public WipeableString(CharSequence charSequence) {
        int i10 = 0;
        this.f63649p0 = new char[charSequence.length()];
        while (true) {
            char[] cArr = this.f63649p0;
            if (i10 >= cArr.length) {
                return;
            }
            cArr[i10] = charSequence.charAt(i10);
            i10++;
        }
    }

    public static WipeableString copy(CharSequence charSequence, int i10, int i11) {
        return new WipeableString(charSequence.subSequence(i10, i11));
    }

    public static WipeableString lowerCase(CharSequence charSequence) {
        char[] cArr = new char[charSequence.length()];
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            cArr[i10] = Character.toLowerCase(charSequence.charAt(i10));
        }
        return new WipeableString(cArr);
    }

    public static int parseInt(CharSequence charSequence, int i10) throws NumberFormatException {
        boolean z10;
        if (charSequence == null) {
            throw new NumberFormatException(AbstractJsonLexerKt.NULL);
        }
        int i11 = 1;
        int i12 = 0;
        if (Character.isWhitespace(charSequence.charAt(charSequence.length() - 1))) {
            int length = charSequence.length();
            while (length > 0 && Character.isWhitespace(charSequence.charAt(length - 1))) {
                length--;
            }
            charSequence = copy(charSequence, 0, length);
        }
        if (i10 < 2) {
            throw new NumberFormatException(b.a("radix ", i10, " less than Character.MIN_RADIX"));
        }
        if (i10 > 36) {
            throw new NumberFormatException(b.a("radix ", i10, " greater than Character.MAX_RADIX"));
        }
        int length2 = charSequence.length();
        if (length2 <= 0) {
            throw new NumberFormatException("For input string: \"" + ((Object) charSequence) + "\"");
        }
        char cCharAt = charSequence.charAt(0);
        int i13 = -2147483647;
        if (cCharAt < '0') {
            if (cCharAt == '-') {
                i13 = Integer.MIN_VALUE;
                z10 = true;
            } else {
                if (cCharAt != '+') {
                    throw new NumberFormatException("For input string: \"" + ((Object) charSequence) + "\"");
                }
                z10 = false;
            }
            if (length2 == 1) {
                throw new NumberFormatException("For input string: \"" + ((Object) charSequence) + "\"");
            }
        } else {
            i11 = 0;
            z10 = false;
        }
        int i14 = i13 / i10;
        while (i11 < length2) {
            int i15 = i11 + 1;
            int iDigit = Character.digit(charSequence.charAt(i11), i10);
            if (iDigit < 0) {
                throw new NumberFormatException("For input string: \"" + ((Object) charSequence) + "\"");
            }
            if (i12 < i14) {
                throw new NumberFormatException("For input string: \"" + ((Object) charSequence) + "\"");
            }
            int i16 = i12 * i10;
            if (i16 < i13 + iDigit) {
                throw new NumberFormatException("For input string: \"" + ((Object) charSequence) + "\"");
            }
            i12 = i16 - iDigit;
            i11 = i15;
        }
        return z10 ? i12 : -i12;
    }

    public static WipeableString reversed(CharSequence charSequence) {
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            cArr[i10] = charSequence.charAt((length - i10) - 1);
        }
        return new WipeableString(cArr);
    }

    public static void wipeIfPossible(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        if (charSequence instanceof WipeableString) {
            ((WipeableString) charSequence).wipe();
            return;
        }
        if (charSequence instanceof StringBuilder) {
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                ((StringBuilder) charSequence).setCharAt(i10, ' ');
            }
            ((StringBuilder) charSequence).setLength(0);
            return;
        }
        if (charSequence instanceof StringBuffer) {
            for (int i11 = 0; i11 < charSequence.length(); i11++) {
                ((StringBuffer) charSequence).setCharAt(i11, ' ');
            }
            ((StringBuffer) charSequence).setLength(0);
            return;
        }
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (charBuffer.isReadOnly()) {
                return;
            }
            for (int i12 = 0; i12 < charSequence.length(); i12++) {
                charBuffer.put(i12, ' ');
            }
        }
    }

    public char[] charArray() {
        char[] cArr = this.f63649p0;
        return Arrays.copyOf(cArr, cArr.length);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f63649p0[i10];
    }

    public int codePointAt(int i10) {
        if (i10 >= 0) {
            char[] cArr = this.f63649p0;
            if (i10 < cArr.length) {
                return Character.codePointAt(cArr, i10, cArr.length);
            }
        }
        throw new StringIndexOutOfBoundsException(i10);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence.length() != length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (charAt(i10) != charSequence.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = this.f63650q0;
        if (i10 == 0) {
            char[] cArr = this.f63649p0;
            if (cArr.length > 0) {
                for (int i11 = 0; i11 < this.f63649p0.length; i11++) {
                    i10 = (i10 * 31) + cArr[i11];
                }
                this.f63650q0 = i10;
            }
        }
        return i10;
    }

    public int indexOf(char c10) {
        int i10 = 0;
        while (true) {
            char[] cArr = this.f63649p0;
            if (i10 >= cArr.length) {
                return -1;
            }
            if (cArr[i10] == c10) {
                return i10;
            }
            i10++;
        }
    }

    public boolean isWiped() {
        return this.f63651r0;
    }

    @Override // java.lang.CharSequence
    public int length() {
        char[] cArr = this.f63649p0;
        if (cArr == null) {
            return 0;
        }
        return cArr.length;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return new String(this.f63649p0);
    }

    public void wipe() {
        Arrays.fill(this.f63649p0, ' ');
        this.f63650q0 = 0;
        this.f63649p0 = new char[0];
        this.f63651r0 = true;
    }

    @Override // java.lang.CharSequence
    public WipeableString subSequence(int i10, int i11) {
        return new WipeableString(Arrays.copyOfRange(this.f63649p0, i10, i11));
    }

    public WipeableString(char[] cArr) {
        this.f63649p0 = Arrays.copyOf(cArr, cArr.length);
    }

    public static int parseInt(CharSequence charSequence) throws NumberFormatException {
        return parseInt(charSequence, 10);
    }
}

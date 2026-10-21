package br.com.opencs.bincodec;

import c2.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class Base2NCodec extends AbstractCodec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alphabet f25268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final char[] f25273f;
    public static final char[] IGNORE_SPACES = " \t\n\r".toCharArray();
    public static final char[] IGNORE_NONE = new char[0];

    public Base2NCodec(Alphabet alphabet) {
        this(alphabet, 0, 0, null);
    }

    @Override // br.com.opencs.bincodec.AbstractCodec, br.com.opencs.bincodec.Codec
    public int decode(CharSequence charSequence, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i10;
        int i14 = i13 + i11;
        boolean z10 = i13 >= i14;
        int i15 = i12;
        char c10 = 0;
        int i16 = 0;
        int value = 0;
        int i17 = 0;
        while (!z10) {
            char cCharAt = charSequence.charAt(i13);
            i13++;
            boolean z11 = i13 == i14;
            if (!isIgnored(cCharAt)) {
                i16++;
                if (isPadding(cCharAt)) {
                    z10 = true;
                    c10 = 1;
                } else {
                    int i18 = this.f25269b;
                    value = (value << i18) | this.f25268a.getValue(cCharAt);
                    i17 += i18;
                    while (i17 >= 8) {
                        i17 -= 8;
                        bArr[i15] = (byte) ((value >> i17) & 255);
                        i15++;
                    }
                }
            }
            z10 = z11;
        }
        if (usesPadding()) {
            if (c10 > 0) {
                boolean z12 = i13 == i14;
                while (!z12) {
                    char cCharAt2 = charSequence.charAt(i13);
                    i13++;
                    boolean z13 = i13 == i14;
                    if (!isIgnored(cCharAt2)) {
                        i16++;
                        if (!isPadding(cCharAt2)) {
                            throw new IllegalArgumentException("Invalid padding.");
                        }
                    }
                    z12 = z13;
                }
            }
            if (i16 % this.f25272e != 0) {
                throw new IllegalArgumentException("The input is not properly padded.");
            }
        }
        return i15 - i12;
    }

    @Override // br.com.opencs.bincodec.AbstractCodec, br.com.opencs.bincodec.Codec
    public int encode(byte[] bArr, int i10, int i11, Appendable appendable) throws IOException {
        int i12;
        Alphabet alphabet;
        int i13;
        int i14 = i11 + i10;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i12 = this.f25270c;
            alphabet = this.f25268a;
            i13 = this.f25269b;
            if (i10 >= i14) {
                break;
            }
            i16 = (i16 << 8) | (bArr[i10] & 255);
            i10++;
            i15 += 8;
            while (i15 >= i13) {
                i15 -= i13;
                appendable.append((char) alphabet.getCharacter((i16 >> i15) & i12));
                i17++;
            }
        }
        if (i15 > 0) {
            appendable.append((char) alphabet.getCharacter((i16 << (i13 - i15)) & i12));
            i17++;
        }
        int paddingSize = getPaddingSize(i17);
        int i18 = i17 + paddingSize;
        while (paddingSize > 0) {
            appendable.append((char) this.f25271d);
            paddingSize--;
        }
        return i18;
    }

    @Override // br.com.opencs.bincodec.AbstractCodec, br.com.opencs.bincodec.Codec
    public int getDecodedSize(int i10) {
        return (i10 * this.f25269b) / 8;
    }

    @Override // br.com.opencs.bincodec.AbstractCodec, br.com.opencs.bincodec.Codec
    public int getEncodedSize(int i10) {
        int i11 = this.f25269b;
        int iA = b.a(i10 * 8, i11, 1, i11);
        return getPaddingSize(iA) + iA;
    }

    public int getPaddingSize(int i10) {
        if (!usesPadding()) {
            return 0;
        }
        int i11 = this.f25272e;
        return (i11 - (i10 % i11)) % i11;
    }

    public boolean isIgnored(int i10) {
        int i11 = 0;
        while (true) {
            char[] cArr = this.f25273f;
            if (i11 >= cArr.length) {
                return false;
            }
            if (i10 == cArr[i11]) {
                return true;
            }
            i11++;
        }
    }

    public boolean isPadding(int i10) {
        return usesPadding() && i10 == this.f25271d;
    }

    public boolean usesPadding() {
        return this.f25272e >= 2;
    }

    public Base2NCodec(Alphabet alphabet, int i10, int i11) {
        this(alphabet, i10, i11, null);
    }

    public Base2NCodec(Alphabet alphabet, int i10, int i11, char[] cArr) {
        this.f25268a = alphabet;
        this.f25272e = i11;
        if (i11 != 0) {
            this.f25271d = i10;
        } else {
            this.f25271d = 0;
        }
        int size = alphabet.size();
        int i12 = 2;
        if (size == 2) {
            i12 = 1;
        } else if (size != 4) {
            if (size == 8) {
                i12 = 3;
            } else if (size == 16) {
                i12 = 4;
            } else if (size == 32) {
                i12 = 5;
            } else if (size == 64) {
                i12 = 6;
            } else {
                if (size != 126) {
                    throw new IllegalArgumentException("Invalid alphabet.");
                }
                i12 = 7;
            }
        }
        this.f25269b = i12;
        this.f25270c = (1 << i12) - 1;
        if (cArr != null) {
            this.f25273f = (char[]) cArr.clone();
        } else {
            this.f25273f = IGNORE_NONE;
        }
    }
}

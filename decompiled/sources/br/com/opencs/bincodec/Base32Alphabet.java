package br.com.opencs.bincodec;

/* JADX INFO: loaded from: classes2.dex */
public class Base32Alphabet extends ArrayAlphabet {
    public Base32Alphabet() {
        this(false);
    }

    @Override // br.com.opencs.bincodec.ArrayAlphabet, br.com.opencs.bincodec.Alphabet
    public int getValue(int i10) throws IllegalArgumentException {
        if (i10 >= 97 && i10 <= 122) {
            return i10 - 97;
        }
        if (i10 >= 65 && i10 <= 90) {
            return i10 - 65;
        }
        if (i10 < 50 || i10 > 55) {
            throw new IllegalArgumentException("Invalid Base 32 character.");
        }
        return i10 - 24;
    }

    public Base32Alphabet(boolean z10) {
        super(z10 ? "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toLowerCase() : "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
    }
}

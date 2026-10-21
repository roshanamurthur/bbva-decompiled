package br.com.opencs.bincodec;

/* JADX INFO: loaded from: classes2.dex */
public class HexadecimalAlphabet extends ArrayAlphabet {
    public HexadecimalAlphabet() {
        this(false);
    }

    @Override // br.com.opencs.bincodec.ArrayAlphabet, br.com.opencs.bincodec.Alphabet
    public int getValue(int i10) throws IllegalArgumentException {
        if (i10 >= 48 && i10 <= 57) {
            return i10 - 48;
        }
        if (i10 >= 97 && i10 <= 102) {
            return i10 - 87;
        }
        if (i10 < 65 || i10 > 70) {
            throw new IllegalArgumentException("Invalid hexadecimal character.");
        }
        return i10 - 55;
    }

    public HexadecimalAlphabet(boolean z10) {
        super(z10 ? "0123456789ABCDEF".toLowerCase() : "0123456789ABCDEF");
    }
}

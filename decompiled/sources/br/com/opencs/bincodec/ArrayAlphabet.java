package br.com.opencs.bincodec;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayAlphabet implements Alphabet {
    protected final char[] alphabet;

    public ArrayAlphabet(char[] cArr) {
        this.alphabet = (char[]) cArr.clone();
    }

    @Override // br.com.opencs.bincodec.Alphabet
    public int getCharacter(int i10) {
        return this.alphabet[i10];
    }

    @Override // br.com.opencs.bincodec.Alphabet
    public int getValue(int i10) throws IllegalArgumentException {
        int i11 = 0;
        while (true) {
            char[] cArr = this.alphabet;
            if (i11 >= cArr.length) {
                throw new IllegalArgumentException("Invalid character.");
            }
            if (i10 == cArr[i11]) {
                return i11;
            }
            i11++;
        }
    }

    @Override // br.com.opencs.bincodec.Alphabet
    public int size() {
        return this.alphabet.length;
    }

    public ArrayAlphabet(String str) {
        this.alphabet = str.toCharArray();
    }
}

package br.com.opencs.bincodec;

/* JADX INFO: loaded from: classes2.dex */
public class BinaryAlphabet implements Alphabet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25277b;

    public BinaryAlphabet() {
        this('0', '1');
    }

    @Override // br.com.opencs.bincodec.Alphabet
    public int getCharacter(int i10) {
        return i10 == 0 ? this.f25276a : this.f25277b;
    }

    public int getOne() {
        return this.f25277b;
    }

    @Override // br.com.opencs.bincodec.Alphabet
    public int getValue(int i10) throws IllegalArgumentException {
        if (i10 == this.f25276a) {
            return 0;
        }
        if (i10 == this.f25277b) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid character.");
    }

    public int getZero() {
        return this.f25276a;
    }

    @Override // br.com.opencs.bincodec.Alphabet
    public int size() {
        return 2;
    }

    public BinaryAlphabet(char c10, char c11) {
        if (c10 == c11) {
            throw new IllegalArgumentException("One must not be equal to zero.");
        }
        this.f25276a = c10;
        this.f25277b = c11;
    }
}

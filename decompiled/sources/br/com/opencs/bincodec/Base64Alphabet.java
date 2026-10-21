package br.com.opencs.bincodec;

/* JADX INFO: loaded from: classes2.dex */
public class Base64Alphabet extends ArrayAlphabet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25275b;

    public Base64Alphabet() {
        this(false);
    }

    @Override // br.com.opencs.bincodec.ArrayAlphabet, br.com.opencs.bincodec.Alphabet
    public int getValue(int i10) throws IllegalArgumentException {
        if (i10 >= 65 && i10 <= 90) {
            return i10 - 65;
        }
        if (i10 >= 97 && i10 <= 122) {
            return i10 - 71;
        }
        if (i10 >= 48 && i10 <= 57) {
            return i10 + 4;
        }
        if (i10 == this.f25274a) {
            return 62;
        }
        if (i10 == this.f25275b) {
            return 63;
        }
        throw new IllegalArgumentException("Invalid Base64 character.");
    }

    public Base64Alphabet(boolean z10) {
        super("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".concat(z10 ? "-_" : "+/"));
        if (z10) {
            this.f25274a = 45;
            this.f25275b = 95;
        } else {
            this.f25274a = 43;
            this.f25275b = 47;
        }
    }
}

package com.nimbusds.jose.shaded.json.parser;

import java.io.IOException;

/* JADX INFO: compiled from: JSONParserMemory.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends JSONParserBase {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f62810w;

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void g(boolean[] zArr) throws IOException {
        int i10 = this.f62794g;
        o(zArr);
        r(i10, this.f62794g);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final Object i(boolean[] zArr) throws ParseException, IOException {
        int i10 = this.f62794g;
        e();
        n();
        char c10 = this.f62788a;
        boolean z10 = this.f62797j;
        if (c10 != '.' && c10 != 'E' && c10 != 'e') {
            p();
            char c11 = this.f62788a;
            if (c11 < 0 || c11 >= '~' || zArr[c11] || c11 == 26) {
                r(i10, this.f62794g);
                return d(this.f62793f);
            }
            o(zArr);
            r(i10, this.f62794g);
            if (z10) {
                return this.f62793f;
            }
            throw new ParseException(this.f62794g, 1, this.f62793f);
        }
        if (c10 == '.') {
            e();
            n();
        }
        char c12 = this.f62788a;
        if (c12 != 'E' && c12 != 'e') {
            p();
            char c13 = this.f62788a;
            if (c13 < 0 || c13 >= '~' || zArr[c13] || c13 == 26) {
                r(i10, this.f62794g);
                return b();
            }
            o(zArr);
            r(i10, this.f62794g);
            if (z10) {
                return this.f62793f;
            }
            throw new ParseException(this.f62794g, 1, this.f62793f);
        }
        JSONParserBase.MSB msb = this.f62791d;
        msb.append('E');
        e();
        char c14 = this.f62788a;
        if (c14 != '+' && c14 != '-' && (c14 < '0' || c14 > '9')) {
            o(zArr);
            r(i10, this.f62794g);
            if (!z10) {
                throw new ParseException(this.f62794g, 1, this.f62793f);
            }
            if (!this.f62795h) {
                a();
            }
            return this.f62793f;
        }
        msb.append(c14);
        e();
        n();
        p();
        char c15 = this.f62788a;
        if (c15 < 0 || c15 >= '~' || zArr[c15] || c15 == 26) {
            r(i10, this.f62794g);
            return b();
        }
        o(zArr);
        r(i10, this.f62794g);
        if (z10) {
            return this.f62793f;
        }
        throw new ParseException(this.f62794g, 1, this.f62793f);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void k() throws ParseException, IOException {
        if (!this.f62798k && this.f62788a == '\'') {
            if (!this.f62797j) {
                throw new ParseException(this.f62794g, 0, Character.valueOf(this.f62788a));
            }
            g(JSONParserBase.f62783r);
            return;
        }
        int iS = s(this.f62788a, this.f62794g + 1);
        if (iS == -1) {
            throw new ParseException(this.f62810w, 3, null);
        }
        q(this.f62794g + 1, iS);
        if (this.f62793f.indexOf(92) != -1) {
            this.f62791d.clear();
            l();
            return;
        }
        if (!this.f62801o) {
            int length = this.f62793f.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = this.f62793f.charAt(i10);
                if (cCharAt >= 0) {
                    if (cCharAt <= 31) {
                        throw new ParseException(this.f62794g + i10, 0, Character.valueOf(cCharAt));
                    }
                    if (cCharAt == 127) {
                        throw new ParseException(this.f62794g + i10, 0, Character.valueOf(cCharAt));
                    }
                }
            }
        }
        this.f62794g = iS;
        e();
    }

    public abstract void q(int i10, int i11);

    public final void r(int i10, int i11) {
        q(i10, i11);
        this.f62793f = this.f62793f.trim();
    }

    public abstract int s(char c10, int i10);
}

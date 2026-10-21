package net.minidev.json.parser;

import java.io.IOException;

/* JADX INFO: compiled from: JSONParserMemory.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b extends JSONParserBase {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f85213w;

    @Override // net.minidev.json.parser.JSONParserBase
    public final void g(boolean[] zArr) throws IOException {
        int i10 = this.f85197g;
        o(zArr);
        r(i10, this.f85197g);
    }

    @Override // net.minidev.json.parser.JSONParserBase
    public final Object i(boolean[] zArr) throws ParseException, IOException {
        int i10 = this.f85197g;
        e();
        n();
        char c10 = this.f85191a;
        boolean z10 = this.f85200j;
        if (c10 != '.' && c10 != 'E' && c10 != 'e') {
            p();
            char c11 = this.f85191a;
            if (c11 < 0 || c11 >= '~' || zArr[c11] || c11 == 26) {
                r(i10, this.f85197g);
                return d(this.f85196f);
            }
            o(zArr);
            r(i10, this.f85197g);
            if (z10) {
                return this.f85196f;
            }
            throw new ParseException(this.f85197g, 1, this.f85196f);
        }
        if (c10 == '.') {
            e();
            n();
        }
        char c12 = this.f85191a;
        if (c12 != 'E' && c12 != 'e') {
            p();
            char c13 = this.f85191a;
            if (c13 < 0 || c13 >= '~' || zArr[c13] || c13 == 26) {
                r(i10, this.f85197g);
                return b();
            }
            o(zArr);
            r(i10, this.f85197g);
            if (z10) {
                return this.f85196f;
            }
            throw new ParseException(this.f85197g, 1, this.f85196f);
        }
        JSONParserBase.MSB msb = this.f85194d;
        msb.append('E');
        e();
        char c14 = this.f85191a;
        if (c14 != '+' && c14 != '-' && (c14 < '0' || c14 > '9')) {
            o(zArr);
            r(i10, this.f85197g);
            if (!z10) {
                throw new ParseException(this.f85197g, 1, this.f85196f);
            }
            if (!this.f85198h) {
                a();
            }
            return this.f85196f;
        }
        msb.append(c14);
        e();
        n();
        p();
        char c15 = this.f85191a;
        if (c15 < 0 || c15 >= '~' || zArr[c15] || c15 == 26) {
            r(i10, this.f85197g);
            return b();
        }
        o(zArr);
        r(i10, this.f85197g);
        if (z10) {
            return this.f85196f;
        }
        throw new ParseException(this.f85197g, 1, this.f85196f);
    }

    @Override // net.minidev.json.parser.JSONParserBase
    public final void k() throws ParseException, IOException {
        if (!this.f85201k && this.f85191a == '\'') {
            if (!this.f85200j) {
                throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
            }
            g(JSONParserBase.f85186r);
            return;
        }
        int iS = s(this.f85191a, this.f85197g + 1);
        if (iS == -1) {
            throw new ParseException(this.f85213w, 3, null);
        }
        q(this.f85197g + 1, iS);
        if (this.f85196f.indexOf(92) != -1) {
            this.f85194d.clear();
            l();
            return;
        }
        if (!this.f85204o) {
            int length = this.f85196f.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = this.f85196f.charAt(i10);
                if (cCharAt >= 0) {
                    if (cCharAt <= 31) {
                        throw new ParseException(this.f85197g + i10, 0, Character.valueOf(cCharAt));
                    }
                    if (cCharAt == 127) {
                        throw new ParseException(this.f85197g + i10, 0, Character.valueOf(cCharAt));
                    }
                }
            }
        }
        this.f85197g = iS;
        e();
    }

    public abstract void q(int i10, int i11);

    public final void r(int i10, int i11) {
        q(i10, i11);
        this.f85196f = this.f85196f.trim();
    }

    public abstract int s(char c10, int i10);
}

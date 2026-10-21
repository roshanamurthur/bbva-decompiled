package net.minidev.json.parser;

import java.io.IOException;

/* JADX INFO: compiled from: JSONParserStream.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class d extends JSONParserBase {
    @Override // net.minidev.json.parser.JSONParserBase
    public final void g(boolean[] zArr) throws IOException {
        JSONParserBase.MSB msb = this.f85194d;
        msb.clear();
        o(zArr);
        this.f85196f = msb.toString().trim();
    }

    @Override // net.minidev.json.parser.JSONParserBase
    public final Object i(boolean[] zArr) throws ParseException, IOException {
        JSONParserBase.MSB msb = this.f85194d;
        msb.clear();
        msb.append(this.f85191a);
        e();
        n();
        char c10 = this.f85191a;
        boolean z10 = this.f85200j;
        if (c10 != '.' && c10 != 'E' && c10 != 'e') {
            p();
            char c11 = this.f85191a;
            if (c11 < 0 || c11 >= '~' || zArr[c11] || c11 == 26) {
                String strTrim = msb.toString().trim();
                this.f85196f = strTrim;
                return d(strTrim);
            }
            o(zArr);
            String strTrim2 = msb.toString().trim();
            this.f85196f = strTrim2;
            if (z10) {
                return strTrim2;
            }
            throw new ParseException(this.f85197g, 1, this.f85196f);
        }
        if (c10 == '.') {
            msb.append(c10);
            e();
            n();
        }
        char c12 = this.f85191a;
        if (c12 != 'E' && c12 != 'e') {
            p();
            char c13 = this.f85191a;
            if (c13 < 0 || c13 >= '~' || zArr[c13] || c13 == 26) {
                this.f85196f = msb.toString().trim();
                return b();
            }
            o(zArr);
            String strTrim3 = msb.toString().trim();
            this.f85196f = strTrim3;
            if (z10) {
                return strTrim3;
            }
            throw new ParseException(this.f85197g, 1, this.f85196f);
        }
        msb.append('E');
        e();
        char c14 = this.f85191a;
        if (c14 != '+' && c14 != '-' && (c14 < '0' || c14 > '9')) {
            o(zArr);
            this.f85196f = msb.toString().trim();
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
            this.f85196f = msb.toString().trim();
            return b();
        }
        o(zArr);
        String strTrim4 = msb.toString().trim();
        this.f85196f = strTrim4;
        if (z10) {
            return strTrim4;
        }
        throw new ParseException(this.f85197g, 1, this.f85196f);
    }

    @Override // net.minidev.json.parser.JSONParserBase
    public final void k() throws ParseException, IOException {
        if (this.f85201k || this.f85191a != '\'') {
            this.f85194d.clear();
            l();
        } else {
            if (!this.f85200j) {
                throw new ParseException(this.f85197g, 0, Character.valueOf(this.f85191a));
            }
            g(JSONParserBase.f85186r);
        }
    }
}

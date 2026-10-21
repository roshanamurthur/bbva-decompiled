package com.nimbusds.jose.shaded.json.parser;

import java.io.IOException;

/* JADX INFO: compiled from: JSONParserStream.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d extends JSONParserBase {
    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void g(boolean[] zArr) throws IOException {
        JSONParserBase.MSB msb = this.f62791d;
        msb.clear();
        o(zArr);
        this.f62793f = msb.toString().trim();
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final Object i(boolean[] zArr) throws ParseException, IOException {
        JSONParserBase.MSB msb = this.f62791d;
        msb.clear();
        msb.append(this.f62788a);
        e();
        n();
        char c10 = this.f62788a;
        boolean z10 = this.f62797j;
        if (c10 != '.' && c10 != 'E' && c10 != 'e') {
            p();
            char c11 = this.f62788a;
            if (c11 < 0 || c11 >= '~' || zArr[c11] || c11 == 26) {
                String strTrim = msb.toString().trim();
                this.f62793f = strTrim;
                return d(strTrim);
            }
            o(zArr);
            String strTrim2 = msb.toString().trim();
            this.f62793f = strTrim2;
            if (z10) {
                return strTrim2;
            }
            throw new ParseException(this.f62794g, 1, this.f62793f);
        }
        if (c10 == '.') {
            msb.append(c10);
            e();
            n();
        }
        char c12 = this.f62788a;
        if (c12 != 'E' && c12 != 'e') {
            p();
            char c13 = this.f62788a;
            if (c13 < 0 || c13 >= '~' || zArr[c13] || c13 == 26) {
                this.f62793f = msb.toString().trim();
                return b();
            }
            o(zArr);
            String strTrim3 = msb.toString().trim();
            this.f62793f = strTrim3;
            if (z10) {
                return strTrim3;
            }
            throw new ParseException(this.f62794g, 1, this.f62793f);
        }
        msb.append('E');
        e();
        char c14 = this.f62788a;
        if (c14 != '+' && c14 != '-' && (c14 < '0' || c14 > '9')) {
            o(zArr);
            this.f62793f = msb.toString().trim();
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
            this.f62793f = msb.toString().trim();
            return b();
        }
        o(zArr);
        String strTrim4 = msb.toString().trim();
        this.f62793f = strTrim4;
        if (z10) {
            return strTrim4;
        }
        throw new ParseException(this.f62794g, 1, this.f62793f);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void k() throws ParseException, IOException {
        if (this.f62798k || this.f62788a != '\'') {
            this.f62791d.clear();
            l();
        } else {
            if (!this.f62797j) {
                throw new ParseException(this.f62794g, 0, Character.valueOf(this.f62788a));
            }
            g(JSONParserBase.f62783r);
        }
    }
}

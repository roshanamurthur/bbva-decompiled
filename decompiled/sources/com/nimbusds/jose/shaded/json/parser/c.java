package com.nimbusds.jose.shaded.json.parser;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: JSONParserReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Reader f62811w;

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void e() throws IOException {
        int i10 = this.f62811w.read();
        this.f62788a = i10 == -1 ? (char) 26 : (char) i10;
        this.f62794g++;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void h() throws ParseException, IOException {
        int i10 = this.f62811w.read();
        if (i10 == -1) {
            throw new ParseException(this.f62794g - 1, 3, "EOF");
        }
        this.f62788a = (char) i10;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void j() throws IOException {
        this.f62791d.append(this.f62788a);
        int i10 = this.f62811w.read();
        if (i10 == -1) {
            this.f62788a = (char) 26;
        } else {
            this.f62788a = (char) i10;
            this.f62794g++;
        }
    }
}

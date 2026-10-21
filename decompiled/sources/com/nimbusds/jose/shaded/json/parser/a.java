package com.nimbusds.jose.shaded.json.parser;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: JSONParserInputStream.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InputStream f62809w;

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void e() throws IOException {
        int i10 = this.f62809w.read();
        this.f62788a = i10 == -1 ? (char) 26 : (char) i10;
        this.f62794g++;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void h() throws ParseException, IOException {
        int i10 = this.f62809w.read();
        if (i10 == -1) {
            throw new ParseException(this.f62794g - 1, 3, "EOF");
        }
        this.f62788a = (char) i10;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void j() throws IOException {
        this.f62791d.append(this.f62788a);
        int i10 = this.f62809w.read();
        if (i10 == -1) {
            this.f62788a = (char) 26;
        } else {
            this.f62788a = (char) i10;
            this.f62794g++;
        }
    }
}

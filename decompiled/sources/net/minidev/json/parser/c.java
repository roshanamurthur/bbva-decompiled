package net.minidev.json.parser;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: JSONParserReader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Reader f85214w;

    @Override // net.minidev.json.parser.JSONParserBase
    public final void e() throws IOException {
        int i10 = this.f85214w.read();
        this.f85191a = i10 == -1 ? (char) 26 : (char) i10;
        this.f85197g++;
    }

    @Override // net.minidev.json.parser.JSONParserBase
    public final void h() throws ParseException, IOException {
        int i10 = this.f85214w.read();
        if (i10 == -1) {
            throw new ParseException(this.f85197g - 1, 3, "EOF");
        }
        this.f85191a = (char) i10;
    }

    @Override // net.minidev.json.parser.JSONParserBase
    public final void j() throws IOException {
        this.f85194d.append(this.f85191a);
        int i10 = this.f85214w.read();
        if (i10 == -1) {
            this.f85191a = (char) 26;
        } else {
            this.f85191a = (char) i10;
            this.f85197g++;
        }
    }
}

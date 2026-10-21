package yl;

import net.minidev.json.parser.ParseException;

/* JADX INFO: compiled from: JSONParserString.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends net.minidev.json.parser.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f94873x;

    @Override // net.minidev.json.parser.JSONParserBase
    public final void e() {
        int i10 = this.f85197g + 1;
        this.f85197g = i10;
        if (i10 >= this.f85213w) {
            this.f85191a = (char) 26;
        } else {
            this.f85191a = this.f94873x.charAt(i10);
        }
    }

    @Override // net.minidev.json.parser.JSONParserBase
    public final void h() throws ParseException {
        int i10 = this.f85197g + 1;
        this.f85197g = i10;
        if (i10 < this.f85213w) {
            this.f85191a = this.f94873x.charAt(i10);
        } else {
            this.f85191a = (char) 26;
            throw new ParseException(this.f85197g - 1, 3, "EOF");
        }
    }

    @Override // net.minidev.json.parser.JSONParserBase
    public final void j() {
        int i10 = this.f85197g + 1;
        this.f85197g = i10;
        if (i10 >= this.f85213w) {
            this.f85191a = (char) 26;
        } else {
            this.f85191a = this.f94873x.charAt(i10);
        }
    }

    @Override // net.minidev.json.parser.b
    public final void q(int i10, int i11) {
        this.f85196f = this.f94873x.substring(i10, i11);
    }

    @Override // net.minidev.json.parser.b
    public final int s(char c10, int i10) {
        return this.f94873x.indexOf(c10, i10);
    }
}

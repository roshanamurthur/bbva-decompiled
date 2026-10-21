package yl;

import net.minidev.json.parser.ParseException;

/* JADX INFO: compiled from: JSONParserByteArray.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends net.minidev.json.parser.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte[] f94872x;

    @Override // net.minidev.json.parser.JSONParserBase
    public final void e() {
        int i10 = this.f85197g + 1;
        this.f85197g = i10;
        if (i10 >= this.f85213w) {
            this.f85191a = (char) 26;
        } else {
            this.f85191a = (char) this.f94872x[i10];
        }
    }

    @Override // net.minidev.json.parser.JSONParserBase
    public final void h() throws ParseException {
        int i10 = this.f85197g + 1;
        this.f85197g = i10;
        if (i10 < this.f85213w) {
            this.f85191a = (char) this.f94872x[i10];
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
            this.f85191a = (char) this.f94872x[i10];
        }
    }

    @Override // net.minidev.json.parser.b
    public final void q(int i10, int i11) {
        this.f85196f = new String(this.f94872x, i10, i11 - i10);
    }

    @Override // net.minidev.json.parser.b
    public final int s(char c10, int i10) {
        int i11 = i10;
        while (i10 < this.f85213w) {
            if (this.f94872x[i11] == ((byte) c10)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }
}

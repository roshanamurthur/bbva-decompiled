package ki;

import com.nimbusds.jose.shaded.json.parser.ParseException;

/* JADX INFO: compiled from: JSONParserByteArray.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends com.nimbusds.jose.shaded.json.parser.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte[] f79332x;

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void e() {
        int i10 = this.f62794g + 1;
        this.f62794g = i10;
        if (i10 >= this.f62810w) {
            this.f62788a = (char) 26;
        } else {
            this.f62788a = (char) this.f79332x[i10];
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void h() throws ParseException {
        int i10 = this.f62794g + 1;
        this.f62794g = i10;
        if (i10 < this.f62810w) {
            this.f62788a = (char) this.f79332x[i10];
        } else {
            this.f62788a = (char) 26;
            throw new ParseException(this.f62794g - 1, 3, "EOF");
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void j() {
        int i10 = this.f62794g + 1;
        this.f62794g = i10;
        if (i10 >= this.f62810w) {
            this.f62788a = (char) 26;
        } else {
            this.f62788a = (char) this.f79332x[i10];
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.b
    public final void q(int i10, int i11) {
        this.f62793f = new String(this.f79332x, i10, i11 - i10);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.b
    public final int s(char c10, int i10) {
        int i11 = i10;
        while (i10 < this.f62810w) {
            if (this.f79332x[i11] == ((byte) c10)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }
}

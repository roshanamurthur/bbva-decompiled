package ki;

import com.nimbusds.jose.shaded.json.parser.ParseException;

/* JADX INFO: compiled from: JSONParserString.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends com.nimbusds.jose.shaded.json.parser.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f79333x;

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void e() {
        int i10 = this.f62794g + 1;
        this.f62794g = i10;
        if (i10 >= this.f62810w) {
            this.f62788a = (char) 26;
        } else {
            this.f62788a = this.f79333x.charAt(i10);
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.JSONParserBase
    public final void h() throws ParseException {
        int i10 = this.f62794g + 1;
        this.f62794g = i10;
        if (i10 < this.f62810w) {
            this.f62788a = this.f79333x.charAt(i10);
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
            this.f62788a = this.f79333x.charAt(i10);
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.b
    public final void q(int i10, int i11) {
        this.f62793f = this.f79333x.substring(i10, i11);
    }

    @Override // com.nimbusds.jose.shaded.json.parser.b
    public final int s(char c10, int i10) {
        return this.f79333x.indexOf(c10, i10);
    }
}

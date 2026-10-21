package javax.mail.internet;

import ad.d;
import androidx.camera.core.processing.f;

/* JADX INFO: loaded from: classes12.dex */
public class AddressException extends ParseException {
    protected int pos;
    protected String ref;

    public AddressException() {
        this.ref = null;
        this.pos = -1;
    }

    public int getPos() {
        return this.pos;
    }

    public String getRef() {
        return this.ref;
    }

    @Override // javax.mail.MessagingException, java.lang.Throwable
    public String toString() {
        String string = super.toString();
        if (this.ref == null) {
            return string;
        }
        String strF = d.f(f.e(string, " in string ``"), this.ref, "''");
        if (this.pos < 0) {
            return strF;
        }
        StringBuilder sbE = f.e(strF, " at position ");
        sbE.append(this.pos);
        return sbE.toString();
    }

    public AddressException(String str) {
        super(str);
        this.ref = null;
        this.pos = -1;
    }

    public AddressException(String str, String str2) {
        super(str);
        this.pos = -1;
        this.ref = str2;
    }

    public AddressException(String str, String str2, int i10) {
        super(str);
        this.ref = str2;
        this.pos = i10;
    }
}

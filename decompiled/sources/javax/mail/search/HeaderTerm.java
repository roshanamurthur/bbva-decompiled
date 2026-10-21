package javax.mail.search;

import java.util.Locale;
import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public final class HeaderTerm extends StringTerm {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f79043p0;

    public HeaderTerm(String str, String str2) {
        super(str2);
        this.f79043p0 = str;
    }

    @Override // javax.mail.search.StringTerm
    public boolean equals(Object obj) {
        if (!(obj instanceof HeaderTerm)) {
            return false;
        }
        HeaderTerm headerTerm = (HeaderTerm) obj;
        return headerTerm.f79043p0.equalsIgnoreCase(this.f79043p0) && super.equals(headerTerm);
    }

    public String getHeaderName() {
        return this.f79043p0;
    }

    @Override // javax.mail.search.StringTerm
    public int hashCode() {
        return this.f79043p0.toLowerCase(Locale.ENGLISH).hashCode() + super.hashCode();
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            String[] header = message.getHeader(this.f79043p0);
            if (header == null) {
                return false;
            }
            for (String str : header) {
                if (super.match(str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }
}

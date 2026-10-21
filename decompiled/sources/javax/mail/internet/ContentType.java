package javax.mail.internet;

import androidx.webkit.ProxyConfig;
import com.fasterxml.jackson.core.JsonPointer;

/* JADX INFO: loaded from: classes12.dex */
public class ContentType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f78954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ParameterList f78955c;

    public ContentType() {
    }

    public ContentType(String str, String str2, ParameterList parameterList) {
        this.f78953a = str;
        this.f78954b = str2;
        this.f78955c = parameterList;
    }

    public String getBaseType() {
        if (this.f78953a == null || this.f78954b == null) {
            return "";
        }
        return this.f78953a + JsonPointer.SEPARATOR + this.f78954b;
    }

    public String getParameter(String str) {
        ParameterList parameterList = this.f78955c;
        if (parameterList == null) {
            return null;
        }
        return parameterList.get(str);
    }

    public ParameterList getParameterList() {
        return this.f78955c;
    }

    public String getPrimaryType() {
        return this.f78953a;
    }

    public String getSubType() {
        return this.f78954b;
    }

    public boolean match(ContentType contentType) {
        String str;
        if (!(this.f78953a == null && contentType.getPrimaryType() == null) && ((str = this.f78953a) == null || !str.equalsIgnoreCase(contentType.getPrimaryType()))) {
            return false;
        }
        String subType = contentType.getSubType();
        String str2 = this.f78954b;
        if ((str2 != null && str2.startsWith(ProxyConfig.MATCH_ALL_SCHEMES)) || (subType != null && subType.startsWith(ProxyConfig.MATCH_ALL_SCHEMES))) {
            return true;
        }
        String str3 = this.f78954b;
        return (str3 == null && subType == null) || (str3 != null && str3.equalsIgnoreCase(subType));
    }

    public void setParameter(String str, String str2) {
        if (this.f78955c == null) {
            this.f78955c = new ParameterList();
        }
        this.f78955c.set(str, str2);
    }

    public void setParameterList(ParameterList parameterList) {
        this.f78955c = parameterList;
    }

    public void setPrimaryType(String str) {
        this.f78953a = str;
    }

    public void setSubType(String str) {
        this.f78954b = str;
    }

    public String toString() {
        if (this.f78953a == null || this.f78954b == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f78953a);
        sb2.append(JsonPointer.SEPARATOR);
        sb2.append(this.f78954b);
        ParameterList parameterList = this.f78955c;
        if (parameterList != null) {
            sb2.append(parameterList.toString(sb2.length() + 14));
        }
        return sb2.toString();
    }

    public ContentType(String str) throws ParseException {
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(str, HeaderTokenizer.MIME);
        HeaderTokenizer.Token next = headerTokenizer.next();
        if (next.getType() == -1) {
            this.f78953a = next.getValue();
            HeaderTokenizer.Token next2 = headerTokenizer.next();
            if (((char) next2.getType()) == '/') {
                HeaderTokenizer.Token next3 = headerTokenizer.next();
                if (next3.getType() == -1) {
                    this.f78954b = next3.getValue();
                    String remainder = headerTokenizer.getRemainder();
                    if (remainder != null) {
                        this.f78955c = new ParameterList(remainder);
                        return;
                    }
                    return;
                }
                StringBuilder sbD = ci.a.d("In Content-Type string <", str, ">, expected MIME subtype, got ");
                sbD.append(next3.getValue());
                throw new ParseException(sbD.toString());
            }
            StringBuilder sbD2 = ci.a.d("In Content-Type string <", str, ">, expected '/', got ");
            sbD2.append(next2.getValue());
            throw new ParseException(sbD2.toString());
        }
        StringBuilder sbD3 = ci.a.d("In Content-Type string <", str, ">, expected MIME type, got ");
        sbD3.append(next.getValue());
        throw new ParseException(sbD3.toString());
    }

    public boolean match(String str) {
        try {
            return match(new ContentType(str));
        } catch (ParseException unused) {
            return false;
        }
    }
}

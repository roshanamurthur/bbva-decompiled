package javax.mail.internet;

import com.sun.mail.util.PropUtil;

/* JADX INFO: loaded from: classes12.dex */
public class ContentDisposition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f78950c = PropUtil.getBooleanSystemProperty("mail.mime.contentdisposition.strict", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParameterList f78952b;

    public ContentDisposition() {
    }

    public ContentDisposition(String str, ParameterList parameterList) {
        this.f78951a = str;
        this.f78952b = parameterList;
    }

    public String getDisposition() {
        return this.f78951a;
    }

    public String getParameter(String str) {
        ParameterList parameterList = this.f78952b;
        if (parameterList == null) {
            return null;
        }
        return parameterList.get(str);
    }

    public ParameterList getParameterList() {
        return this.f78952b;
    }

    public void setDisposition(String str) {
        this.f78951a = str;
    }

    public void setParameter(String str, String str2) {
        if (this.f78952b == null) {
            this.f78952b = new ParameterList();
        }
        this.f78952b.set(str, str2);
    }

    public void setParameterList(ParameterList parameterList) {
        this.f78952b = parameterList;
    }

    public String toString() {
        String str = this.f78951a;
        if (str == null) {
            return "";
        }
        if (this.f78952b == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(this.f78952b.toString(sb2.length() + 21));
        return sb2.toString();
    }

    public ContentDisposition(String str) throws ParseException {
        HeaderTokenizer headerTokenizer = new HeaderTokenizer(str, HeaderTokenizer.MIME);
        HeaderTokenizer.Token next = headerTokenizer.next();
        int type = next.getType();
        boolean z10 = f78950c;
        if (type == -1) {
            this.f78951a = next.getValue();
        } else if (z10) {
            throw new ParseException("Expected disposition, got " + next.getValue());
        }
        String remainder = headerTokenizer.getRemainder();
        if (remainder != null) {
            try {
                this.f78952b = new ParameterList(remainder);
            } catch (ParseException e5) {
                if (z10) {
                    throw e5;
                }
            }
        }
    }
}

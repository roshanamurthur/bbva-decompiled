package org.bouncycastle.i18n.filter;

/* JADX INFO: loaded from: classes5.dex */
public class HTMLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i10;
        String str2;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i11 = 0;
        while (i11 < stringBuffer.length()) {
            char cCharAt = stringBuffer.charAt(i11);
            if (cCharAt == '\"') {
                i10 = i11 + 1;
                str2 = "&#34";
            } else if (cCharAt == '#') {
                i10 = i11 + 1;
                str2 = "&#35";
            } else if (cCharAt == '+') {
                i10 = i11 + 1;
                str2 = "&#43";
            } else if (cCharAt == '-') {
                i10 = i11 + 1;
                str2 = "&#45";
            } else if (cCharAt == '>') {
                i10 = i11 + 1;
                str2 = "&#62";
            } else if (cCharAt == ';') {
                i10 = i11 + 1;
                str2 = "&#59";
            } else if (cCharAt != '<') {
                switch (cCharAt) {
                    case '%':
                        i10 = i11 + 1;
                        str2 = "&#37";
                        break;
                    case '&':
                        i10 = i11 + 1;
                        str2 = "&#38";
                        break;
                    case '\'':
                        i10 = i11 + 1;
                        str2 = "&#39";
                        break;
                    case '(':
                        i10 = i11 + 1;
                        str2 = "&#40";
                        break;
                    case ')':
                        i10 = i11 + 1;
                        str2 = "&#41";
                        break;
                    default:
                        i11 -= 3;
                        continue;
                        i11 += 4;
                        break;
                }
            } else {
                i10 = i11 + 1;
                str2 = "&#60";
            }
            stringBuffer.replace(i11, i10, str2);
            i11 += 4;
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}

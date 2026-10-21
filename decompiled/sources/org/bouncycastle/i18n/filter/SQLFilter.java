package org.bouncycastle.i18n.filter;

/* JADX INFO: loaded from: classes5.dex */
public class SQLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i10;
        String str2;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i11 = 0;
        while (i11 < stringBuffer.length()) {
            char cCharAt = stringBuffer.charAt(i11);
            if (cCharAt == '\n') {
                i10 = i11 + 1;
                str2 = "\\n";
            } else if (cCharAt == '\r') {
                i10 = i11 + 1;
                str2 = "\\r";
            } else if (cCharAt == '\"') {
                i10 = i11 + 1;
                str2 = "\\\"";
            } else if (cCharAt == '\'') {
                i10 = i11 + 1;
                str2 = "\\'";
            } else if (cCharAt == '-') {
                i10 = i11 + 1;
                str2 = "\\-";
            } else if (cCharAt == '/') {
                i10 = i11 + 1;
                str2 = "\\/";
            } else if (cCharAt == ';') {
                i10 = i11 + 1;
                str2 = "\\;";
            } else if (cCharAt != '=') {
                if (cCharAt == '\\') {
                    i10 = i11 + 1;
                    str2 = "\\\\";
                }
                i11++;
            } else {
                i10 = i11 + 1;
                str2 = "\\=";
            }
            stringBuffer.replace(i11, i10, str2);
            i11 = i10;
            i11++;
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}

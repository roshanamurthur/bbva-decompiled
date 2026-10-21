package com.facetec.sdk;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes9.dex */
public final class ly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko f42368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42369b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42370e;

    private ly(ko koVar, int i10, String str) {
        this.f42368a = koVar;
        this.f42370e = i10;
        this.f42369b = str;
    }

    public static ly e(String str) throws IOException {
        ko koVar;
        int i10;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                koVar = ko.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                koVar = ko.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            koVar = ko.HTTP_1_0;
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i12 = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i10 + 4);
            }
            return new ly(koVar, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42368a == ko.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f42370e);
        if (this.f42369b != null) {
            sb2.append(' ');
            sb2.append(this.f42369b);
        }
        return sb2.toString();
    }
}

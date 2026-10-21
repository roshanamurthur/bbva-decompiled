package org.bouncycastle.asn1.x500.style;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public class X500NameTokenizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f87558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuffer f87559d;

    public X500NameTokenizer(String str) {
        this(str, AbstractJsonLexerKt.COMMA);
    }

    public boolean hasMoreTokens() {
        return this.f87557b != this.f87556a.length();
    }

    public String nextToken() {
        int i10 = this.f87557b;
        String str = this.f87556a;
        if (i10 == str.length()) {
            return null;
        }
        int i11 = this.f87557b + 1;
        StringBuffer stringBuffer = this.f87559d;
        stringBuffer.setLength(0);
        boolean z10 = false;
        boolean z11 = false;
        while (i11 != str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '\"') {
                if (!z10 && !z11) {
                    if (cCharAt == '\\') {
                        stringBuffer.append(cCharAt);
                        z10 = true;
                    } else {
                        if (cCharAt == this.f87558c) {
                            break;
                        }
                        stringBuffer.append(cCharAt);
                    }
                }
                i11++;
            } else if (!z10) {
                z11 = !z11;
            }
            stringBuffer.append(cCharAt);
            z10 = false;
            i11++;
        }
        this.f87557b = i11;
        return stringBuffer.toString();
    }

    public X500NameTokenizer(String str, char c10) {
        this.f87559d = new StringBuffer();
        this.f87556a = str;
        this.f87557b = -1;
        this.f87558c = c10;
    }
}

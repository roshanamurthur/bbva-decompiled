package org.bouncycastle.asn1.x509;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public class X509NameTokenizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f87784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuffer f87785d;

    public X509NameTokenizer(String str) {
        this(str, AbstractJsonLexerKt.COMMA);
    }

    public boolean hasMoreTokens() {
        return this.f87783b != this.f87782a.length();
    }

    public String nextToken() {
        int i10 = this.f87783b;
        String str = this.f87782a;
        if (i10 == str.length()) {
            return null;
        }
        int i11 = this.f87783b + 1;
        StringBuffer stringBuffer = this.f87785d;
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
                        if (cCharAt == this.f87784c) {
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
        this.f87783b = i11;
        return stringBuffer.toString();
    }

    public X509NameTokenizer(String str, char c10) {
        this.f87785d = new StringBuffer();
        this.f87782a = str;
        this.f87783b = -1;
        this.f87784c = c10;
    }
}

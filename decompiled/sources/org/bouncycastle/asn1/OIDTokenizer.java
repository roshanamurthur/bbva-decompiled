package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes12.dex */
public class OIDTokenizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86589b = 0;

    public OIDTokenizer(String str) {
        this.f86588a = str;
    }

    public boolean hasMoreTokens() {
        return this.f86589b != -1;
    }

    public String nextToken() {
        int i10 = this.f86589b;
        if (i10 == -1) {
            return null;
        }
        String str = this.f86588a;
        int iIndexOf = str.indexOf(46, i10);
        if (iIndexOf == -1) {
            String strSubstring = str.substring(this.f86589b);
            this.f86589b = -1;
            return strSubstring;
        }
        String strSubstring2 = str.substring(this.f86589b, iIndexOf);
        this.f86589b = iIndexOf + 1;
        return strSubstring2;
    }
}

package com.vasco.digipass.sdk.utils.utilities.obfuscated;

/* JADX INFO: loaded from: classes9.dex */
public class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f66036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f66037b = 0;

    public f4(String str) {
        this.f66036a = str;
    }

    public boolean a() {
        return this.f66037b != -1;
    }

    public String b() {
        int i10 = this.f66037b;
        if (i10 == -1) {
            return null;
        }
        int iIndexOf = this.f66036a.indexOf(46, i10);
        if (iIndexOf == -1) {
            String strSubstring = this.f66036a.substring(this.f66037b);
            this.f66037b = -1;
            return strSubstring;
        }
        String strSubstring2 = this.f66036a.substring(this.f66037b, iIndexOf);
        this.f66037b = iIndexOf + 1;
        return strSubstring2;
    }
}

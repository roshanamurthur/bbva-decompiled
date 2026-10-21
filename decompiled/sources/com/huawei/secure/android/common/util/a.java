package com.huawei.secure.android.common.util;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Character f50684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Character f50685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50686d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50687e = 0;

    public a(String str) {
        this.f50683a = str;
    }

    public static boolean c(Character ch2) {
        char cCharValue;
        return ch2 != null && (cCharValue = ch2.charValue()) >= '0' && cCharValue <= '7';
    }

    public void a(Character ch2) {
        this.f50684b = ch2;
    }

    public int b() {
        return this.f50686d;
    }

    public Character d() {
        Character ch2 = this.f50684b;
        if (ch2 != null) {
            this.f50684b = null;
            return ch2;
        }
        String str = this.f50683a;
        if (str == null || str.length() == 0 || this.f50686d >= this.f50683a.length()) {
            return null;
        }
        String str2 = this.f50683a;
        int i10 = this.f50686d;
        this.f50686d = i10 + 1;
        return Character.valueOf(str2.charAt(i10));
    }

    public Character e() {
        Character chD = d();
        if (chD != null && b(chD)) {
            return chD;
        }
        return null;
    }

    public Character f() {
        Character chD = d();
        if (chD != null && c(chD)) {
            return chD;
        }
        return null;
    }

    public Character g() {
        Character ch2 = this.f50684b;
        if (ch2 != null) {
            return ch2;
        }
        String str = this.f50683a;
        if (str == null || str.length() == 0 || this.f50686d >= this.f50683a.length()) {
            return null;
        }
        return Character.valueOf(this.f50683a.charAt(this.f50686d));
    }

    public String h() {
        String strSubstring = this.f50683a.substring(this.f50686d);
        if (this.f50684b == null) {
            return strSubstring;
        }
        return this.f50684b + strSubstring;
    }

    public void i() {
        this.f50684b = this.f50685c;
        this.f50686d = this.f50687e;
    }

    public static boolean b(Character ch2) {
        if (ch2 == null) {
            return false;
        }
        char cCharValue = ch2.charValue();
        return (cCharValue >= '0' && cCharValue <= '9') || (cCharValue >= 'a' && cCharValue <= 'f') || (cCharValue >= 'A' && cCharValue <= 'F');
    }

    public boolean a() {
        if (this.f50684b != null) {
            return true;
        }
        String str = this.f50683a;
        return (str == null || str.length() == 0 || this.f50686d >= this.f50683a.length()) ? false : true;
    }

    public void c() {
        this.f50685c = this.f50684b;
        this.f50687e = this.f50686d;
    }

    public boolean a(char c10) {
        Character ch2 = this.f50684b;
        if (ch2 != null && ch2.charValue() == c10) {
            return true;
        }
        String str = this.f50683a;
        return str != null && str.length() != 0 && this.f50686d < this.f50683a.length() && this.f50683a.charAt(this.f50686d) == c10;
    }
}

package com.bbva.proguarded.android.sslpinning;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static l f36155a = new l(-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l f36156b = new l(100);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36157c;

    public l(int i10) {
        this.f36157c = -1;
        if (i10 < 0) {
            this.f36157c = -1;
        } else if (i10 >= 100) {
            this.f36157c = 100;
        } else {
            this.f36157c = i10;
        }
    }

    public final boolean a() {
        return this.f36157c == 100;
    }

    public final boolean b() {
        int i10 = this.f36157c;
        return i10 >= 0 && i10 < 100;
    }

    public final boolean a(l lVar) {
        return this.f36157c > lVar.f36157c;
    }
}

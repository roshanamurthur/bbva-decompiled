package com.huawei.appgallery.serviceverifykit.d.d;

import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f50131b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50132a;

    private b() {
        try {
            Class.forName("com.huawei.appgallery.log.LogAdaptor");
            this.f50132a = true;
        } catch (ClassNotFoundException unused) {
            this.f50132a = false;
        }
    }

    public void a(String str, String str2) {
        if (this.f50132a) {
            a.f50130a.e(str, str2);
        }
    }

    public void b(String str, String str2) {
        if (this.f50132a) {
            a.f50130a.i(str, str2);
        }
    }

    public void c(String str, String str2) {
        if (this.f50132a) {
            a.f50130a.w(str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    public void a(String str, String str2, Throwable th2) {
        if (this.f50132a) {
            a.f50130a.e(str, str2, th2);
        }
    }
}

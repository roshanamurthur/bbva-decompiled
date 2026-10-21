package com.facetec.sdk;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes9.dex */
public final class mg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f42548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nj f42549g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nj f42550j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nj f42545d = nj.c(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nj f42544c = nj.c(Header.RESPONSE_STATUS_UTF8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nj f42546e = nj.c(Header.TARGET_METHOD_UTF8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nj f42542a = nj.c(Header.TARGET_PATH_UTF8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nj f42543b = nj.c(Header.TARGET_SCHEME_UTF8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nj f42547h = nj.c(Header.TARGET_AUTHORITY_UTF8);

    public interface e {
    }

    public mg(String str, String str2) {
        this(nj.c(str), nj.c(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mg) {
            mg mgVar = (mg) obj;
            if (this.f42550j.equals(mgVar.f42550j) && this.f42549g.equals(mgVar.f42549g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42549g.hashCode() + ((this.f42550j.hashCode() + 527) * 31);
    }

    public final String toString() {
        return kz.e("%s: %s", this.f42550j.b(), this.f42549g.b());
    }

    public mg(nj njVar, String str) {
        this(njVar, nj.c(str));
    }

    public mg(nj njVar, nj njVar2) {
        this.f42550j = njVar;
        this.f42549g = njVar2;
        this.f42548f = njVar2.g() + njVar.g() + 32;
    }
}

package com.facetec.sdk;

import com.bbva.network.constant.ConstantsKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public final class ki extends kp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kn f42032b = kn.a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f42033a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f42034c;

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f42035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f42036b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Charset f42037d;

        public c() {
            this((byte) 0);
        }

        public final c b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException(ConstantsKt.NAME_NULL);
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f42035a.add(kk.e(str, HttpUrl.FORM_ENCODE_SET, this.f42037d));
            this.f42036b.add(kk.e(str2, HttpUrl.FORM_ENCODE_SET, this.f42037d));
            return this;
        }

        public final ki d() {
            return new ki(this.f42035a, this.f42036b);
        }

        private c(byte b10) {
            this.f42035a = new ArrayList();
            this.f42036b = new ArrayList();
            this.f42037d = null;
        }
    }

    public ki(List<String> list, List<String> list2) {
        this.f42034c = kz.d(list);
        this.f42033a = kz.d(list2);
    }

    @Override // com.facetec.sdk.kp
    public final kn b() {
        return f42032b;
    }

    @Override // com.facetec.sdk.kp
    public final long d() {
        return d((ni) null, true);
    }

    private long d(@Nullable ni niVar, boolean z10) {
        nb nbVar = z10 ? new nb() : niVar.d();
        int size = this.f42034c.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                nbVar.h(38);
            }
            nbVar.e(this.f42034c.get(i10));
            nbVar.h(61);
            nbVar.e(this.f42033a.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long jB = nbVar.b();
        nbVar.p();
        return jB;
    }

    @Override // com.facetec.sdk.kp
    public final void b(ni niVar) throws IOException {
        d(niVar, false);
    }
}

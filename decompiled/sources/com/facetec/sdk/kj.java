package com.facetec.sdk;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.network.constant.ConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class kj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f42038c;

    public kj(d dVar) {
        List<String> list = dVar.f42039c;
        this.f42038c = (String[]) list.toArray(new String[list.size()]);
    }

    public final int a() {
        return this.f42038c.length / 2;
    }

    @Nullable
    public final String b(String str) {
        String[] strArr = this.f42038c;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String c(int i10) {
        return this.f42038c[(i10 << 1) + 1];
    }

    public final String e(int i10) {
        return this.f42038c[i10 << 1];
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof kj) && Arrays.equals(((kj) obj).f42038c, this.f42038c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42038c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int iA = a();
        for (int i10 = 0; i10 < iA; i10++) {
            sb2.append(e(i10));
            sb2.append(": ");
            sb2.append(c(i10));
            sb2.append(RootService.LINE_BREAK);
        }
        return sb2.toString();
    }

    public static void a(String str) {
        if (str == null) {
            throw new NullPointerException(ConstantsKt.NAME_NULL);
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                throw new IllegalArgumentException(kz.e("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str));
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<String> f42039c = new ArrayList(20);

        public final d b(String str) {
            int i10 = 0;
            while (i10 < this.f42039c.size()) {
                if (str.equalsIgnoreCase(this.f42039c.get(i10))) {
                    this.f42039c.remove(i10);
                    this.f42039c.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final d c(String str, String str2) {
            this.f42039c.add(str);
            this.f42039c.add(str2.trim());
            return this;
        }

        public final d d(String str, String str2) {
            kj.a(str);
            kj.a(str2, str);
            b(str);
            c(str, str2);
            return this;
        }

        public final d e(String str, String str2) {
            kj.a(str);
            kj.a(str2, str);
            return c(str, str2);
        }

        public final kj d() {
            return new kj(this);
        }
    }

    public final d b() {
        d dVar = new d();
        Collections.addAll(dVar.f42039c, this.f42038c);
        return dVar;
    }

    public static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    throw new IllegalArgumentException(kz.e("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("value for name ");
        sb2.append(str2);
        sb2.append(" == null");
        throw new NullPointerException(sb2.toString());
    }
}

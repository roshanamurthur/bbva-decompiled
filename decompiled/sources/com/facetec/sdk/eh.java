package com.facetec.sdk;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class eh extends ec {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fd<String, ec> f41466e = new fd<>();

    public final void a(String str, String str2) {
        b(str, str2 == null ? ef.f41465b : new ei(str2));
    }

    public final void b(String str, ec ecVar) {
        fd<String, ec> fdVar = this.f41466e;
        if (ecVar == null) {
            ecVar = ef.f41465b;
        }
        fdVar.put(str, ecVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof eh) && ((eh) obj).f41466e.equals(this.f41466e);
        }
        return true;
    }

    public final int hashCode() {
        return this.f41466e.hashCode();
    }

    public final Set<Map.Entry<String, ec>> o() {
        return this.f41466e.entrySet();
    }

    public final void a(String str, Number number) {
        b(str, number == null ? ef.f41465b : new ei(number));
    }
}

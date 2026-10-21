package com.akamai.botman;

/* JADX INFO: loaded from: classes2.dex */
public final class aq<A, B, C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f26311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f26312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f26313c;

    public aq(A a10, B b10, C c10) {
        this.f26311a = a10;
        this.f26312b = b10;
        this.f26313c = c10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return aqVar.f26311a.equals(this.f26311a) && aqVar.f26312b.equals(this.f26312b) && aqVar.f26313c.equals(this.f26313c);
    }

    public final int hashCode() {
        A a10 = this.f26311a;
        int iHashCode = a10 == null ? 0 : a10.hashCode();
        B b10 = this.f26312b;
        int iHashCode2 = iHashCode ^ (b10 == null ? 0 : b10.hashCode());
        C c10 = this.f26313c;
        return iHashCode2 ^ (c10 != null ? c10.hashCode() : 0);
    }
}

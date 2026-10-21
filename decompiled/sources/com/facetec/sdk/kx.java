package com.facetec.sdk;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class kx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jr f42203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InetSocketAddress f42204c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Proxy f42205e;

    public kx(jr jrVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (jrVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f42203b = jrVar;
        this.f42205e = proxy;
        this.f42204c = inetSocketAddress;
    }

    public final jr a() {
        return this.f42203b;
    }

    public final InetSocketAddress b() {
        return this.f42204c;
    }

    public final boolean c() {
        return this.f42203b.f41901c != null && this.f42205e.type() == Proxy.Type.HTTP;
    }

    public final Proxy e() {
        return this.f42205e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj;
        return kxVar.f42203b.equals(this.f42203b) && kxVar.f42205e.equals(this.f42205e) && kxVar.f42204c.equals(this.f42204c);
    }

    public final int hashCode() {
        return this.f42204c.hashCode() + ((this.f42205e.hashCode() + ((this.f42203b.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Route{");
        sb2.append(this.f42204c);
        sb2.append("}");
        return sb2.toString();
    }
}

package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Serializable, Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public XMSSNode f91428p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f91429q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f91430r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f91431s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f91432t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f91433u0 = false;

    public a(int i10) {
        this.f91429q0 = i10;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        a aVar = new a(this.f91429q0);
        aVar.f91428p0 = this.f91428p0;
        aVar.f91430r0 = this.f91430r0;
        aVar.f91431s0 = this.f91431s0;
        aVar.f91432t0 = this.f91432t0;
        aVar.f91433u0 = this.f91433u0;
        return aVar;
    }

    public final int b() {
        if (!this.f91432t0 || this.f91433u0) {
            return Integer.MAX_VALUE;
        }
        return this.f91430r0;
    }
}

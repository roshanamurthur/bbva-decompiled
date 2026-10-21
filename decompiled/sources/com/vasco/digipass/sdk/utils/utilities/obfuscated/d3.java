package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
class d3 implements n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final y2 f66003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final m4 f66004b;

    public d3(y2 y2Var, m4 m4Var) {
        this.f66003a = y2Var;
        this.f66004b = m4Var;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.n4
    public m4 a() {
        return this.f66004b;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.y2
    public int b() {
        return this.f66004b.a() * this.f66003a.b();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.y2
    public BigInteger c() {
        return this.f66003a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.f66003a.equals(d3Var.f66003a) && this.f66004b.equals(d3Var.f66004b);
    }

    public int hashCode() {
        return this.f66003a.hashCode() ^ i3.a(this.f66004b.hashCode(), 16);
    }
}

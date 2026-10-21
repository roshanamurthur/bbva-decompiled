package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z extends u implements g3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    int f66499p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    boolean f66500q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    boolean f66501r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    g f66502s0;

    public z(boolean z10, int i10, g gVar) {
        this.f66501r0 = true;
        this.f66502s0 = null;
        if (gVar instanceof f) {
            this.f66501r0 = true;
        } else {
            this.f66501r0 = z10;
        }
        this.f66499p0 = i10;
        if (this.f66501r0) {
            this.f66502s0 = gVar;
        } else {
            boolean z11 = gVar.toASN1Primitive() instanceof x;
            this.f66502s0 = gVar;
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (!(uVar instanceof z)) {
            return false;
        }
        z zVar = (z) uVar;
        if (this.f66499p0 != zVar.f66499p0 || this.f66500q0 != zVar.f66500q0 || this.f66501r0 != zVar.f66501r0) {
            return false;
        }
        g gVar = this.f66502s0;
        if (gVar == null) {
            return zVar.f66502s0 == null;
        }
        return gVar.toASN1Primitive().equals(zVar.f66502s0.toASN1Primitive());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u e() {
        return new n1(this.f66501r0, this.f66499p0, this.f66502s0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u f() {
        return new d2(this.f66501r0, this.f66499p0, this.f66502s0);
    }

    public u g() {
        g gVar = this.f66502s0;
        if (gVar != null) {
            return gVar.toASN1Primitive();
        }
        return null;
    }

    public int h() {
        return this.f66499p0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        int i10 = this.f66499p0;
        g gVar = this.f66502s0;
        return gVar != null ? i10 ^ gVar.hashCode() : i10;
    }

    public boolean i() {
        return this.f66501r0;
    }

    public String toString() {
        return Constant.BRACKET_OPEN + this.f66499p0 + Constant.BRACKET_CLOSE + this.f66502s0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() {
        return toASN1Primitive();
    }
}

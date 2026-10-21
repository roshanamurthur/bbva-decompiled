package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes9.dex */
public class s1 extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u1 f66330b;

    public s1(boolean z10, u1 u1Var) {
        super(z10);
        this.f66330b = u1Var;
    }

    public u1 a() {
        return this.f66330b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        u1 u1Var = this.f66330b;
        if (u1Var == null) {
            return s1Var.a() == null;
        }
        return u1Var.equals(s1Var.a());
    }

    public int hashCode() {
        int i10 = !isPrivate() ? 1 : 0;
        u1 u1Var = this.f66330b;
        return u1Var != null ? i10 ^ u1Var.hashCode() : i10;
    }
}

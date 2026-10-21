package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes9.dex */
public class q2 extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f66266b;

    public q2(boolean z10, s2 s2Var) {
        super(z10);
        this.f66266b = s2Var;
    }

    public s2 a() {
        return this.f66266b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        s2 s2Var = this.f66266b;
        if (s2Var == null) {
            return q2Var.a() == null;
        }
        return s2Var.equals(q2Var.a());
    }

    public int hashCode() {
        s2 s2Var = this.f66266b;
        if (s2Var != null) {
            return s2Var.hashCode();
        }
        return 0;
    }
}

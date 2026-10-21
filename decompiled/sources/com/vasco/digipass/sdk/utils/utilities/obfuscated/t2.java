package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class t2 extends q2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f66376c;

    public t2(BigInteger bigInteger, s2 s2Var) {
        super(true, s2Var);
        this.f66376c = bigInteger;
    }

    public BigInteger b() {
        return this.f66376c;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.q2
    public boolean equals(Object obj) {
        if ((obj instanceof t2) && ((t2) obj).b().equals(this.f66376c)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.q2
    public int hashCode() {
        return b().hashCode();
    }
}

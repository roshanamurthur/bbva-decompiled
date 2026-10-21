package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class u2 extends q2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f66389c;

    public u2(BigInteger bigInteger, s2 s2Var) {
        super(false, s2Var);
        this.f66389c = bigInteger;
    }

    public BigInteger b() {
        return this.f66389c;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.q2
    public boolean equals(Object obj) {
        return (obj instanceof u2) && ((u2) obj).b().equals(this.f66389c) && super.equals(obj);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.q2
    public int hashCode() {
        return this.f66389c.hashCode() ^ super.hashCode();
    }
}

package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class v1 extends s1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f66400c;

    public v1(BigInteger bigInteger, u1 u1Var) {
        super(true, u1Var);
        this.f66400c = bigInteger;
    }

    public BigInteger b() {
        return this.f66400c;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.s1
    public boolean equals(Object obj) {
        return (obj instanceof v1) && ((v1) obj).b().equals(this.f66400c) && super.equals(obj);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.s1
    public int hashCode() {
        return this.f66400c.hashCode() ^ super.hashCode();
    }
}

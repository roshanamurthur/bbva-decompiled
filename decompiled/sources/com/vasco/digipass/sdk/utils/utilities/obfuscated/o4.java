package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
class o4 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final BigInteger f66242a;

    public o4(BigInteger bigInteger) {
        this.f66242a = bigInteger;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.y2
    public int b() {
        return 1;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.y2
    public BigInteger c() {
        return this.f66242a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o4) {
            return this.f66242a.equals(((o4) obj).f66242a);
        }
        return false;
    }

    public int hashCode() {
        return this.f66242a.hashCode();
    }
}

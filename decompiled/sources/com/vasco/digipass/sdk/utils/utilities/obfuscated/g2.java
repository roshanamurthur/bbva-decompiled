package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CipherParameters;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class g2 implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f66044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f66045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f66046c;

    public g2(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f66044a = bigInteger3;
        this.f66046c = bigInteger;
        this.f66045b = bigInteger2;
    }

    public BigInteger a() {
        return this.f66044a;
    }

    public BigInteger b() {
        return this.f66046c;
    }

    public BigInteger c() {
        return this.f66045b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return g2Var.b().equals(this.f66046c) && g2Var.c().equals(this.f66045b) && g2Var.a().equals(this.f66044a);
    }

    public int hashCode() {
        return (b().hashCode() ^ c().hashCode()) ^ a().hashCode();
    }
}

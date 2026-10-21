package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CipherParameters;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class s2 implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f66331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f66332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f66333c;

    public s2(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public BigInteger a() {
        return this.f66331a;
    }

    public int b() {
        return this.f66333c;
    }

    public BigInteger c() {
        return this.f66332b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return s2Var.c().equals(this.f66332b) && s2Var.a().equals(this.f66331a) && s2Var.b() == this.f66333c;
    }

    public int hashCode() {
        return (c().hashCode() ^ a().hashCode()) + this.f66333c;
    }

    public s2(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f66331a = bigInteger2;
        this.f66332b = bigInteger;
        this.f66333c = i10;
    }
}

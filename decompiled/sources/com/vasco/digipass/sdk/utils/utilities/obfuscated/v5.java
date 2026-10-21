package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class v5 extends o {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static x5 f66410q0 = new x5();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected ECFieldElement f66411p0;

    public v5(ECFieldElement eCFieldElement) {
        this.f66411p0 = eCFieldElement;
    }

    public ECFieldElement c() {
        return this.f66411p0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        return new e1(f66410q0.a(this.f66411p0.toBigInteger(), f66410q0.a(this.f66411p0)));
    }

    public v5(BigInteger bigInteger, q qVar) {
        this(new ECFieldElement.Fp(bigInteger, new BigInteger(1, qVar.g())));
    }

    public v5(int i10, int i11, int i12, int i13, q qVar) {
        this(new ECFieldElement.F2m(i10, i11, i12, i13, new BigInteger(1, qVar.g())));
    }
}

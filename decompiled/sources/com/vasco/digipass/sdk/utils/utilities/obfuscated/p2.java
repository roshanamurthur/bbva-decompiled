package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class p2 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private v f66250p0;

    private p2(v vVar) {
        this.f66250p0 = vVar;
    }

    public static p2 a(Object obj) {
        if (obj instanceof p2) {
            return (p2) obj;
        }
        if (obj != null) {
            return new p2(v.a(obj));
        }
        return null;
    }

    public BigInteger c() {
        return new BigInteger(1, ((q) this.f66250p0.a(1)).g());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        return this.f66250p0;
    }
}

package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class w1 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private m f66417p0;

    private w1(m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("'y' cannot be null");
        }
        this.f66417p0 = mVar;
    }

    public static w1 a(Object obj) {
        if (obj == null || (obj instanceof w1)) {
            return (w1) obj;
        }
        if (obj instanceof m) {
            return new w1((m) obj);
        }
        throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "Invalid DHPublicKey: "));
    }

    public BigInteger c() {
        return this.f66417p0.g();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        return this.f66417p0;
    }
}

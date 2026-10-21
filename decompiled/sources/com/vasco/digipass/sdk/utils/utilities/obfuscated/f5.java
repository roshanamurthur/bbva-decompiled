package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.Digest;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected BigInteger f66038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected BigInteger f66039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Digest f66040c;

    public void a(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f66038a = bigInteger;
        this.f66039b = bigInteger2;
        this.f66040c = digest;
    }

    public BigInteger a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f66039b.modPow(e5.calculateX(this.f66040c, this.f66038a, bArr, bArr2, bArr3), this.f66038a);
    }
}

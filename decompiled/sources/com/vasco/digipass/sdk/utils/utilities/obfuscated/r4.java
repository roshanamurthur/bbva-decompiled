package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CipherParameters;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class r4 implements c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BigInteger f66297d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s4 f66298a = new s4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t4 f66299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SecureRandom f66300c;

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c0
    public int a() {
        return this.f66298a.a();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c0
    public int b() {
        return this.f66298a.b();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c0
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f66298a.a(z10, cipherParameters);
        if (!(cipherParameters instanceof l4)) {
            this.f66299b = (t4) cipherParameters;
            this.f66300c = new SecureRandom();
        } else {
            l4 l4Var = (l4) cipherParameters;
            this.f66299b = (t4) l4Var.a();
            this.f66300c = l4Var.b();
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c0
    public byte[] a(byte[] bArr, int i10, int i11) {
        BigInteger bigIntegerB;
        u4 u4Var;
        BigInteger bigIntegerF;
        if (this.f66299b == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        BigInteger bigIntegerA = this.f66298a.a(bArr, i10, i11);
        t4 t4Var = this.f66299b;
        if (!(t4Var instanceof u4) || (bigIntegerF = (u4Var = (u4) t4Var).f()) == null) {
            bigIntegerB = this.f66298a.b(bigIntegerA);
        } else {
            BigInteger bigIntegerB2 = u4Var.b();
            BigInteger bigInteger = f66297d;
            BigInteger bigIntegerA2 = o0.a(bigInteger, bigIntegerB2.subtract(bigInteger), this.f66300c);
            bigIntegerB = this.f66298a.b(bigIntegerA2.modPow(bigIntegerF, bigIntegerB2).multiply(bigIntegerA).mod(bigIntegerB2)).multiply(bigIntegerA2.modInverse(bigIntegerB2)).mod(bigIntegerB2);
            if (!bigIntegerA.equals(bigIntegerB.modPow(bigIntegerF, bigIntegerB2))) {
                throw new IllegalStateException("RSA engine faulty decryption/signing detected");
            }
        }
        return this.f66298a.a(bigIntegerB);
    }
}

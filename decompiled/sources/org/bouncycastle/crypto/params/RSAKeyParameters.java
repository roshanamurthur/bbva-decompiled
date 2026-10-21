package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
public class RSAKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final BigInteger f89366s0 = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final BigInteger f89367t0 = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f89368q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89369r0;

    public RSAKeyParameters(boolean z10, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z10);
        if (!z10 && (bigInteger2.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA publicExponent is even");
        }
        if ((bigInteger.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA modulus is even");
        }
        if (!Properties.isOverrideSet("org.bouncycastle.rsa.allow_unsafe_mod") && !bigInteger.gcd(f89366s0).equals(f89367t0)) {
            throw new IllegalArgumentException("RSA modulus has a small prime factor");
        }
        this.f89368q0 = bigInteger;
        this.f89369r0 = bigInteger2;
    }

    public BigInteger getExponent() {
        return this.f89369r0;
    }

    public BigInteger getModulus() {
        return this.f89368q0;
    }
}

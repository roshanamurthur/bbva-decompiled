package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class t4 extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BigInteger f66377d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f66378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f66379c;

    public t4(boolean z10, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z10);
        if (!z10 && (bigInteger2.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA publicExponent is even");
        }
        this.f66378b = a(bigInteger);
        this.f66379c = bigInteger2;
    }

    private BigInteger a(BigInteger bigInteger) {
        if ((bigInteger.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA modulus is even");
        }
        if (bigInteger.gcd(new BigInteger("1451887755777639901511587432083070202422614380984889313550570919659315177065956574359078912654149167643992684236991305777574330831666511589145701059710742276692757882915756220901998212975756543223550490431013061082131040808010565293748926901442915057819663730454818359472391642885328171302299245556663073719855")).equals(f66377d)) {
            return bigInteger;
        }
        throw new IllegalArgumentException("RSA modulus has a small prime factor");
    }

    public BigInteger b() {
        return this.f66378b;
    }

    public BigInteger a() {
        return this.f66379c;
    }
}

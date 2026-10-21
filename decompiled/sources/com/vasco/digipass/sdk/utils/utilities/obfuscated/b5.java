package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CryptoException;
import bc.org.bouncycastle.crypto.Digest;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected BigInteger f65943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected BigInteger f65944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected BigInteger f65945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected BigInteger f65946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected BigInteger f65947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected BigInteger f65948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected BigInteger f65949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected BigInteger f65950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected BigInteger f65951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected BigInteger f65952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected BigInteger f65953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Digest f65954l;
    protected SecureRandom m;

    private BigInteger a() {
        BigInteger bigIntegerCalculateK = e5.calculateK(this.f65954l, this.f65943a, this.f65944b);
        return this.f65947e.subtract(this.f65944b.modPow(this.f65948f, this.f65943a).multiply(bigIntegerCalculateK).mod(this.f65943a)).mod(this.f65943a).modPow(this.f65949g.multiply(this.f65948f).add(this.f65945c), this.f65943a);
    }

    public BigInteger b() {
        return e5.generatePrivateValue(this.f65954l, this.f65943a, this.f65944b, this.m);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f65946d;
        if (bigInteger3 == null || (bigInteger = this.f65947e) == null || (bigInteger2 = this.f65950h) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger bigIntegerCalculateM1 = e5.calculateM1(this.f65954l, this.f65943a, bigInteger3, bigInteger, bigInteger2);
        this.f65951i = bigIntegerCalculateM1;
        return bigIntegerCalculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = e5.validatePublicValue(this.f65943a, bigInteger);
        this.f65947e = bigIntegerValidatePublicValue;
        this.f65949g = e5.calculateU(this.f65954l, this.f65943a, this.f65946d, bigIntegerValidatePublicValue);
        BigInteger bigIntegerA = a();
        this.f65950h = bigIntegerA;
        return bigIntegerA;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f65950h;
        if (bigInteger == null || this.f65951i == null || this.f65952j == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = e5.calculateKey(this.f65954l, this.f65943a, bigInteger);
        this.f65953k = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f65948f = e5.calculateX(this.f65954l, this.f65943a, bArr, bArr2, bArr3);
        BigInteger bigIntegerB = b();
        this.f65945c = bigIntegerB;
        BigInteger bigIntegerModPow = this.f65944b.modPow(bigIntegerB, this.f65943a);
        this.f65946d = bigIntegerModPow;
        return bigIntegerModPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f65943a = bigInteger;
        this.f65944b = bigInteger2;
        this.f65954l = digest;
        this.m = secureRandom;
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f65946d;
        if (bigInteger4 == null || (bigInteger2 = this.f65951i) == null || (bigInteger3 = this.f65950h) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!e5.calculateM2(this.f65954l, this.f65943a, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f65952j = bigInteger;
        return true;
    }

    public void init(c5 c5Var, Digest digest, SecureRandom secureRandom) {
        throw null;
    }
}

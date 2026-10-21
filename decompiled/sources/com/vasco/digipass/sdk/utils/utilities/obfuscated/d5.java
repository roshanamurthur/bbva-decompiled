package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CryptoException;
import bc.org.bouncycastle.crypto.Digest;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected BigInteger f66005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected BigInteger f66006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected BigInteger f66007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected SecureRandom f66008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Digest f66009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected BigInteger f66010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected BigInteger f66011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected BigInteger f66012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected BigInteger f66013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected BigInteger f66014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected BigInteger f66015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected BigInteger f66016l;
    protected BigInteger m;

    public BigInteger a() {
        return this.f66007c.modPow(this.f66013i, this.f66005a).multiply(this.f66010f).mod(this.f66005a).modPow(this.f66011g, this.f66005a);
    }

    public BigInteger b() {
        return e5.generatePrivateValue(this.f66009e, this.f66005a, this.f66006b, this.f66008d);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = e5.validatePublicValue(this.f66005a, bigInteger);
        this.f66010f = bigIntegerValidatePublicValue;
        this.f66013i = e5.calculateU(this.f66009e, this.f66005a, bigIntegerValidatePublicValue, this.f66012h);
        BigInteger bigIntegerA = a();
        this.f66014j = bigIntegerA;
        return bigIntegerA;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f66010f;
        if (bigInteger3 == null || (bigInteger = this.f66015k) == null || (bigInteger2 = this.f66014j) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger bigIntegerCalculateM2 = e5.calculateM2(this.f66009e, this.f66005a, bigInteger3, bigInteger, bigInteger2);
        this.f66016l = bigIntegerCalculateM2;
        return bigIntegerCalculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f66014j;
        if (bigInteger == null || this.f66015k == null || this.f66016l == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = e5.calculateKey(this.f66009e, this.f66005a, bigInteger);
        this.m = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateServerCredentials() throws Exception {
        BigInteger bigIntegerCalculateK = e5.calculateK(this.f66009e, this.f66005a, this.f66006b);
        this.f66011g = b();
        BigInteger bigIntegerMod = bigIntegerCalculateK.multiply(this.f66007c).mod(this.f66005a).add(this.f66006b.modPow(this.f66011g, this.f66005a)).mod(this.f66005a);
        this.f66012h = bigIntegerMod;
        return bigIntegerMod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f66005a = bigInteger;
        this.f66006b = bigInteger2;
        this.f66007c = bigInteger3;
        this.f66008d = secureRandom;
        this.f66009e = digest;
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f66010f;
        if (bigInteger4 == null || (bigInteger2 = this.f66012h) == null || (bigInteger3 = this.f66014j) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!e5.calculateM1(this.f66009e, this.f66005a, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f66015k = bigInteger;
        return true;
    }

    public void init(c5 c5Var, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        throw null;
    }
}

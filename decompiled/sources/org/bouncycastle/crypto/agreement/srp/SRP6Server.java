package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes2.dex */
public class SRP6Server {
    protected BigInteger A;
    protected BigInteger B;
    protected BigInteger Key;
    protected BigInteger M1;
    protected BigInteger M2;
    protected BigInteger N;
    protected BigInteger S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected BigInteger f87964b;
    protected Digest digest;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected BigInteger f87965g;
    protected SecureRandom random;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected BigInteger f87966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected BigInteger f87967v;

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.N, bigInteger);
        this.A = bigIntegerValidatePublicValue;
        BigInteger bigIntegerCalculateU = SRP6Util.calculateU(this.digest, this.N, bigIntegerValidatePublicValue, this.B);
        this.f87966u = bigIntegerCalculateU;
        BigInteger bigIntegerModPow = this.f87967v.modPow(bigIntegerCalculateU, this.N).multiply(this.A).mod(this.N).modPow(this.f87964b, this.N);
        this.S = bigIntegerModPow;
        return bigIntegerModPow;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.A;
        if (bigInteger3 == null || (bigInteger = this.M1) == null || (bigInteger2 = this.S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger bigIntegerCalculateM2 = SRP6Util.calculateM2(this.digest, this.N, bigInteger3, bigInteger, bigInteger2);
        this.M2 = bigIntegerCalculateM2;
        return bigIntegerCalculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.S;
        if (bigInteger == null || this.M1 == null || this.M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.N, this.f87965g);
        this.f87964b = selectPrivateValue();
        BigInteger bigIntegerMod = bigIntegerCalculateK.multiply(this.f87967v).mod(this.N).add(this.f87965g.modPow(this.f87964b, this.N)).mod(this.N);
        this.B = bigIntegerMod;
        return bigIntegerMod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.N = bigInteger;
        this.f87965g = bigInteger2;
        this.f87967v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.N, this.f87965g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.A;
        if (bigInteger4 == null || (bigInteger2 = this.B) == null || (bigInteger3 = this.S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.M1 = bigInteger;
        return true;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }
}

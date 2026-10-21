package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.DHMQVPrivateParameters;
import org.bouncycastle.crypto.params.DHMQVPublicParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

/* JADX INFO: loaded from: classes2.dex */
public class MQVBasicAgreement implements BasicAgreement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f87890b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DHMQVPrivateParameters f87891a;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        DHMQVPublicParameters dHMQVPublicParameters = (DHMQVPublicParameters) cipherParameters;
        DHPrivateKeyParameters staticPrivateKey = this.f87891a.getStaticPrivateKey();
        if (!this.f87891a.getStaticPrivateKey().getParameters().equals(dHMQVPublicParameters.getStaticPublicKey().getParameters())) {
            throw new IllegalStateException("MQV public key components have wrong domain parameters");
        }
        if (this.f87891a.getStaticPrivateKey().getParameters().getQ() == null) {
            throw new IllegalStateException("MQV key domain parameters do not have Q set");
        }
        DHParameters parameters = staticPrivateKey.getParameters();
        DHPublicKeyParameters staticPublicKey = dHMQVPublicParameters.getStaticPublicKey();
        DHPrivateKeyParameters ephemeralPrivateKey = this.f87891a.getEphemeralPrivateKey();
        DHPublicKeyParameters ephemeralPublicKey = this.f87891a.getEphemeralPublicKey();
        DHPublicKeyParameters ephemeralPublicKey2 = dHMQVPublicParameters.getEphemeralPublicKey();
        BigInteger q10 = parameters.getQ();
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow((q10.bitLength() + 1) / 2);
        BigInteger bigIntegerModPow = ephemeralPublicKey2.getY().multiply(staticPublicKey.getY().modPow(ephemeralPublicKey2.getY().mod(bigIntegerPow).add(bigIntegerPow), parameters.getP())).modPow(ephemeralPrivateKey.getX().add(ephemeralPublicKey.getY().mod(bigIntegerPow).add(bigIntegerPow).multiply(staticPrivateKey.getX())).mod(q10), parameters.getP());
        if (bigIntegerModPow.equals(f87890b)) {
            throw new IllegalStateException("1 is not a valid agreement value for MQV");
        }
        return bigIntegerModPow;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.f87891a.getStaticPrivateKey().getParameters().getP().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        this.f87891a = (DHMQVPrivateParameters) cipherParameters;
    }
}

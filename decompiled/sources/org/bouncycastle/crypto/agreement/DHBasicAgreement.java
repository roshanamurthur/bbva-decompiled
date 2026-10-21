package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes2.dex */
public class DHBasicAgreement implements BasicAgreement {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f87877c = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DHPrivateKeyParameters f87878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DHParameters f87879b;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        DHPublicKeyParameters dHPublicKeyParameters = (DHPublicKeyParameters) cipherParameters;
        if (!dHPublicKeyParameters.getParameters().equals(this.f87879b)) {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
        BigInteger p4 = this.f87879b.getP();
        BigInteger y7 = dHPublicKeyParameters.getY();
        if (y7 != null) {
            BigInteger bigInteger = f87877c;
            if (y7.compareTo(bigInteger) > 0 && y7.compareTo(p4.subtract(bigInteger)) < 0) {
                BigInteger bigIntegerModPow = y7.modPow(this.f87878a.getX(), p4);
                if (bigIntegerModPow.equals(bigInteger)) {
                    throw new IllegalStateException("Shared key can't be 1");
                }
                return bigIntegerModPow;
            }
        }
        throw new IllegalArgumentException("Diffie-Hellman public key is weak");
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.f87878a.getParameters().getP().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        AsymmetricKeyParameter asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
        if (!(asymmetricKeyParameter instanceof DHPrivateKeyParameters)) {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        DHPrivateKeyParameters dHPrivateKeyParameters = (DHPrivateKeyParameters) asymmetricKeyParameter;
        this.f87878a = dHPrivateKeyParameters;
        this.f87879b = dHPrivateKeyParameters.getParameters();
    }
}

package org.bouncycastle.crypto.agreement;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes2.dex */
public class DHAgreement {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f87872e = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DHPrivateKeyParameters f87873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DHParameters f87874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BigInteger f87875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f87876d;

    public BigInteger calculateAgreement(DHPublicKeyParameters dHPublicKeyParameters, BigInteger bigInteger) {
        if (!dHPublicKeyParameters.getParameters().equals(this.f87874b)) {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
        BigInteger p4 = this.f87874b.getP();
        BigInteger y7 = dHPublicKeyParameters.getY();
        if (y7 != null) {
            BigInteger bigInteger2 = f87872e;
            if (y7.compareTo(bigInteger2) > 0 && y7.compareTo(p4.subtract(bigInteger2)) < 0) {
                BigInteger bigIntegerModPow = y7.modPow(this.f87875c, p4);
                if (bigIntegerModPow.equals(bigInteger2)) {
                    throw new IllegalStateException("Shared key can't be 1");
                }
                return bigInteger.modPow(this.f87873a.getX(), p4).multiply(bigIntegerModPow).mod(p4);
            }
        }
        throw new IllegalArgumentException("Diffie-Hellman public key is weak");
    }

    public BigInteger calculateMessage() {
        DHKeyPairGenerator dHKeyPairGenerator = new DHKeyPairGenerator();
        dHKeyPairGenerator.init(new DHKeyGenerationParameters(this.f87876d, this.f87874b));
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = dHKeyPairGenerator.generateKeyPair();
        this.f87875c = ((DHPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()).getX();
        return ((DHPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()).getY();
    }

    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f87876d = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.f87876d = CryptoServicesRegistrar.getSecureRandom();
        }
        AsymmetricKeyParameter asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
        if (!(asymmetricKeyParameter instanceof DHPrivateKeyParameters)) {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        DHPrivateKeyParameters dHPrivateKeyParameters = (DHPrivateKeyParameters) asymmetricKeyParameter;
        this.f87873a = dHPrivateKeyParameters;
        this.f87874b = dHPrivateKeyParameters.getParameters();
    }
}

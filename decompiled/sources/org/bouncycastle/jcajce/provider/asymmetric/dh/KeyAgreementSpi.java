package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.agreement.DHUnifiedAgreement;
import org.bouncycastle.crypto.agreement.MQVBasicAgreement;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.agreement.kdf.DHKEKGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.DHMQVPrivateParameters;
import org.bouncycastle.crypto.params.DHMQVPublicParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DHUPrivateParameters;
import org.bouncycastle.crypto.params.DHUPublicParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;

/* JADX INFO: loaded from: classes8.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    public static final BigInteger m = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BigInteger f89769n = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DHUnifiedAgreement f89770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BasicAgreement f89771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DHUParameterSpec f89772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MQVParameterSpec f89773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BigInteger f89774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BigInteger f89775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BigInteger f89776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f89777l;

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("DHUwithSHA1CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("DHUwithSHA1KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("DHUwithSHA224CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("DHUwithSHA224KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("DHUwithSHA256CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("DHUwithSHA256KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("DHUwithSHA384CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("DHUwithSHA384KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("DHUwithSHA512CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("DHUwithSHA512KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new DHKEKGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("DHwithSHA1CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("DHwithSHA1CKDF", new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA224CKDF extends KeyAgreementSpi {
        public DHwithSHA224CKDF() {
            super("DHwithSHA224CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHwithSHA224KDF extends KeyAgreementSpi {
        public DHwithSHA224KDF() {
            super("DHwithSHA224CKDF", new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("DHwithSHA256CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA256KDF extends KeyAgreementSpi {
        public DHwithSHA256KDF() {
            super("DHwithSHA256CKDF", new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("DHwithSHA384CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA384KDF extends KeyAgreementSpi {
        public DHwithSHA384KDF() {
            super("DHwithSHA384KDF", new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("DHwithSHA512CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHwithSHA512KDF extends KeyAgreementSpi {
        public DHwithSHA512KDF() {
            super("DHwithSHA512KDF", new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("MQVwithSHA1CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("MQVwithSHA1KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("MQVwithSHA224CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("MQVwithSHA224KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("MQVwithSHA256CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("MQVwithSHA256KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("MQVwithSHA384CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("MQVwithSHA384KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("MQVwithSHA512CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("MQVwithSHA512KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public KeyAgreementSpi() {
        this("Diffie-Hellman", null);
    }

    public static DHPrivateKeyParameters b(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("private key not a DHPrivateKey");
        }
        if (!(privateKey instanceof BCDHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            DHParameterSpec params = dHPrivateKey.getParams();
            return new DHPrivateKeyParameters(dHPrivateKey.getX(), new DHParameters(params.getP(), params.getG(), null, params.getL()));
        }
        BCDHPrivateKey bCDHPrivateKey = (BCDHPrivateKey) privateKey;
        DHPrivateKeyParameters dHPrivateKeyParameters = bCDHPrivateKey.f89753s0;
        if (dHPrivateKeyParameters != null) {
            return dHPrivateKeyParameters;
        }
        DHParameterSpec dHParameterSpec = bCDHPrivateKey.f89751q0;
        boolean z10 = dHParameterSpec instanceof DHDomainParameterSpec;
        BigInteger bigInteger = bCDHPrivateKey.f89750p0;
        return z10 ? new DHPrivateKeyParameters(bigInteger, ((DHDomainParameterSpec) dHParameterSpec).getDomainParameters()) : new DHPrivateKeyParameters(bigInteger, new DHParameters(dHParameterSpec.getP(), bCDHPrivateKey.f89751q0.getG(), null, bCDHPrivateKey.f89751q0.getL()));
    }

    public static DHPublicKeyParameters c(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("public key not a DHPublicKey");
        }
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).engineGetKeyParameters();
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        DHParameterSpec params = dHPublicKey.getParams();
        return params instanceof DHDomainParameterSpec ? new DHPublicKeyParameters(dHPublicKey.getY(), ((DHDomainParameterSpec) params).getDomainParameters()) : new DHPublicKeyParameters(dHPublicKey.getY(), new DHParameters(params.getP(), params.getG(), null, params.getL()));
    }

    public byte[] bigIntToBytes(BigInteger bigInteger) {
        int iBitLength = (this.f89775j.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == iBitLength) {
            return byteArray;
        }
        if (byteArray[0] != 0 || byteArray.length != iBitLength + 1) {
            byte[] bArr = new byte[iBitLength];
            System.arraycopy(byteArray, 0, bArr, iBitLength - byteArray.length, byteArray.length);
            return bArr;
        }
        int length = byteArray.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(byteArray, 1, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return this.f89777l;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z10) throws IllegalStateException, InvalidKeyException {
        if (this.f89774i == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        if (!(key instanceof DHPublicKey)) {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        if (!dHPublicKey.getParams().getG().equals(this.f89776k) || !dHPublicKey.getParams().getP().equals(this.f89775j)) {
            throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
        }
        BigInteger y7 = dHPublicKey.getY();
        if (y7 != null && y7.compareTo(f89769n) >= 0) {
            BigInteger bigInteger = this.f89775j;
            BigInteger bigInteger2 = m;
            if (y7.compareTo(bigInteger.subtract(bigInteger2)) < 0) {
                DHUnifiedAgreement dHUnifiedAgreement = this.f89770e;
                if (dHUnifiedAgreement != null) {
                    if (!z10) {
                        throw new IllegalStateException("unified Diffie-Hellman can use only two key pairs");
                    }
                    this.f89777l = dHUnifiedAgreement.calculateAgreement(new DHUPublicParameters(c((PublicKey) key), c(this.f89772g.getOtherPartyEphemeralKey())));
                    return null;
                }
                BasicAgreement basicAgreement = this.f89771f;
                if (basicAgreement != null) {
                    if (!z10) {
                        throw new IllegalStateException("MQV Diffie-Hellman can use only two key pairs");
                    }
                    this.f89777l = bigIntToBytes(basicAgreement.calculateAgreement(new DHMQVPublicParameters(c((PublicKey) key), c(this.f89773h.getOtherPartyEphemeralKey()))));
                    return null;
                }
                BigInteger bigIntegerModPow = y7.modPow(this.f89774i, this.f89775j);
                if (bigIntegerModPow.compareTo(bigInteger2) == 0) {
                    throw new InvalidKeyException("Shared key can't be 1");
                }
                this.f89777l = bigIntToBytes(bigIntegerModPow);
                if (z10) {
                    return null;
                }
                DHParameterSpec params = dHPublicKey.getParams();
                BCDHPublicKey bCDHPublicKey = new BCDHPublicKey();
                bCDHPublicKey.f89755p0 = bigIntegerModPow;
                bCDHPublicKey.f89757r0 = params;
                bCDHPublicKey.f89756q0 = params instanceof DHDomainParameterSpec ? new DHPublicKeyParameters(bigIntegerModPow, ((DHDomainParameterSpec) params).getDomainParameters()) : new DHPublicKeyParameters(bigIntegerModPow, new DHParameters(params.getP(), params.getG()));
                return bCDHPublicKey;
            }
        }
        throw new InvalidKeyException("Invalid DH PublicKey");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i10) throws IllegalStateException, ShortBufferException {
        if (this.f89774i != null) {
            return super.engineGenerateSecret(bArr, i10);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        this.f89775j = dHPrivateKey.getParams().getP();
        this.f89776k = dHPrivateKey.getParams().getG();
        BigInteger x4 = dHPrivateKey.getX();
        this.f89774i = x4;
        this.f89777l = bigIntToBytes(x4);
    }

    public KeyAgreementSpi(String str, BasicAgreement basicAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.f89770e = null;
        this.f89771f = basicAgreement;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        if (this.f89774i != null) {
            return str.equals("TlsPremasterSecret") ? new SecretKeySpec(BaseAgreementSpi.trimZeroes(this.f89777l), str) : super.engineGenerateSecret(str);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        if (algorithmParameterSpec == null) {
            this.f89775j = dHPrivateKey.getParams().getP();
            this.f89776k = dHPrivateKey.getParams().getG();
        } else if (algorithmParameterSpec instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.f89775j = dHParameterSpec.getP();
            this.f89776k = dHParameterSpec.getG();
            this.f89772g = null;
            this.ukmParameters = null;
        } else if (algorithmParameterSpec instanceof DHUParameterSpec) {
            DHUnifiedAgreement dHUnifiedAgreement = this.f89770e;
            if (dHUnifiedAgreement == null) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            this.f89775j = dHPrivateKey.getParams().getP();
            this.f89776k = dHPrivateKey.getParams().getG();
            DHUParameterSpec dHUParameterSpec = (DHUParameterSpec) algorithmParameterSpec;
            this.f89772g = dHUParameterSpec;
            this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
            dHUnifiedAgreement.init(this.f89772g.getEphemeralPublicKey() != null ? new DHUPrivateParameters(b(dHPrivateKey), b(this.f89772g.getEphemeralPrivateKey()), c(this.f89772g.getEphemeralPublicKey())) : new DHUPrivateParameters(b(dHPrivateKey), b(this.f89772g.getEphemeralPrivateKey())));
        } else if (algorithmParameterSpec instanceof MQVParameterSpec) {
            BasicAgreement basicAgreement = this.f89771f;
            if (basicAgreement == null) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not MQV based");
            }
            this.f89775j = dHPrivateKey.getParams().getP();
            this.f89776k = dHPrivateKey.getParams().getG();
            MQVParameterSpec mQVParameterSpec = (MQVParameterSpec) algorithmParameterSpec;
            this.f89773h = mQVParameterSpec;
            this.ukmParameters = mQVParameterSpec.getUserKeyingMaterial();
            basicAgreement.init(this.f89773h.getEphemeralPublicKey() != null ? new DHMQVPrivateParameters(b(dHPrivateKey), b(this.f89773h.getEphemeralPrivateKey()), c(this.f89773h.getEphemeralPublicKey())) : new DHMQVPrivateParameters(b(dHPrivateKey), b(this.f89773h.getEphemeralPrivateKey())));
        } else {
            if (!(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            }
            if (this.kdf == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.f89775j = dHPrivateKey.getParams().getP();
            this.f89776k = dHPrivateKey.getParams().getG();
            this.f89772g = null;
            this.ukmParameters = ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial();
        }
        BigInteger x4 = dHPrivateKey.getX();
        this.f89774i = x4;
        this.f89777l = bigIntToBytes(x4);
    }

    public KeyAgreementSpi(String str, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.f89770e = null;
        this.f89771f = null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.f89774i != null) {
            return super.engineGenerateSecret();
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    public KeyAgreementSpi(String str, DHUnifiedAgreement dHUnifiedAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.f89770e = dHUnifiedAgreement;
        this.f89771f = null;
    }
}

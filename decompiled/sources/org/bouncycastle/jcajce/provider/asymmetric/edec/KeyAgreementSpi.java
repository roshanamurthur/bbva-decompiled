package org.bouncycastle.jcajce.provider.asymmetric.edec;

import ad.d;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.agreement.X25519Agreement;
import org.bouncycastle.crypto.agreement.X448Agreement;
import org.bouncycastle.crypto.agreement.XDHUnifiedAgreement;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.XDHUPrivateParameters;
import org.bouncycastle.crypto.params.XDHUPublicParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RawAgreement f89930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DHUParameterSpec f89931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f89932g;

    public static final class X25519 extends KeyAgreementSpi {
        public X25519() {
            super(XDHParameterSpec.X25519, null);
        }
    }

    public static class X25519UwithSHA256CKDF extends KeyAgreementSpi {
        public X25519UwithSHA256CKDF() {
            super("X25519UwithSHA256CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class X25519UwithSHA256KDF extends KeyAgreementSpi {
        public X25519UwithSHA256KDF() {
            super("X25519UwithSHA256KDF", new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static final class X25519withSHA256CKDF extends KeyAgreementSpi {
        public X25519withSHA256CKDF() {
            super("X25519withSHA256CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static final class X25519withSHA256KDF extends KeyAgreementSpi {
        public X25519withSHA256KDF() {
            super("X25519withSHA256KDF", new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class X25519withSHA384CKDF extends KeyAgreementSpi {
        public X25519withSHA384CKDF() {
            super("X25519withSHA384CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class X25519withSHA512CKDF extends KeyAgreementSpi {
        public X25519withSHA512CKDF() {
            super("X25519withSHA512CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static final class X448 extends KeyAgreementSpi {
        public X448() {
            super(XDHParameterSpec.X448, null);
        }
    }

    public static class X448UwithSHA512CKDF extends KeyAgreementSpi {
        public X448UwithSHA512CKDF() {
            super("X448UwithSHA512CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class X448UwithSHA512KDF extends KeyAgreementSpi {
        public X448UwithSHA512KDF() {
            super("X448UwithSHA512KDF", new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static final class X448withSHA256CKDF extends KeyAgreementSpi {
        public X448withSHA256CKDF() {
            super("X448withSHA256CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class X448withSHA384CKDF extends KeyAgreementSpi {
        public X448withSHA384CKDF() {
            super("X448withSHA384CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static final class X448withSHA512CKDF extends KeyAgreementSpi {
        public X448withSHA512CKDF() {
            super("X448withSHA512CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static final class X448withSHA512KDF extends KeyAgreementSpi {
        public X448withSHA512KDF() {
            super("X448withSHA512KDF", new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static final class XDH extends KeyAgreementSpi {
        public XDH() {
            super("XDH", null);
        }
    }

    public final RawAgreement b(String str) throws InvalidKeyException {
        if (!this.kaAlgorithm.equals("XDH") && !this.kaAlgorithm.startsWith(str)) {
            throw new InvalidKeyException("inappropriate key for " + this.kaAlgorithm);
        }
        int iIndexOf = this.kaAlgorithm.indexOf(85);
        boolean zStartsWith = str.startsWith(XDHParameterSpec.X448);
        if (iIndexOf > 0) {
            return zStartsWith ? new XDHUnifiedAgreement(new X448Agreement()) : new XDHUnifiedAgreement(new X25519Agreement());
        }
        return zStartsWith ? new X448Agreement() : new X25519Agreement();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return this.f89932g;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z10) throws IllegalStateException, InvalidKeyException {
        RawAgreement rawAgreement = this.f89930e;
        if (rawAgreement == null) {
            throw new IllegalStateException(d.f(new StringBuilder(), this.kaAlgorithm, " not initialised."));
        }
        if (!z10) {
            throw new IllegalStateException(d.f(new StringBuilder(), this.kaAlgorithm, " can only be between two parties."));
        }
        if (!(key instanceof BCXDHPublicKey)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        AsymmetricKeyParameter asymmetricKeyParameter = ((BCXDHPublicKey) key).xdhPublicKey;
        byte[] bArr = new byte[rawAgreement.getAgreementSize()];
        this.f89932g = bArr;
        DHUParameterSpec dHUParameterSpec = this.f89931f;
        if (dHUParameterSpec != null) {
            this.f89930e.calculateAgreement(new XDHUPublicParameters(asymmetricKeyParameter, ((BCXDHPublicKey) dHUParameterSpec.getOtherPartyEphemeralKey()).xdhPublicKey), this.f89932g, 0);
            return null;
        }
        this.f89930e.calculateAgreement(asymmetricKeyParameter, bArr, 0);
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof BCXDHPrivateKey)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        AsymmetricKeyParameter asymmetricKeyParameter = ((BCXDHPrivateKey) key).xdhPrivateKey;
        this.f89930e = b(asymmetricKeyParameter instanceof X448PrivateKeyParameters ? XDHParameterSpec.X448 : XDHParameterSpec.X25519);
        this.f89930e.init(asymmetricKeyParameter);
        if (this.kdf != null) {
            this.ukmParameters = new byte[0];
        } else {
            this.ukmParameters = null;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof BCXDHPrivateKey)) {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
        AsymmetricKeyParameter asymmetricKeyParameter = ((BCXDHPrivateKey) key).xdhPrivateKey;
        this.f89930e = b(asymmetricKeyParameter instanceof X448PrivateKeyParameters ? XDHParameterSpec.X448 : XDHParameterSpec.X25519);
        this.ukmParameters = null;
        if (!(algorithmParameterSpec instanceof DHUParameterSpec)) {
            this.f89930e.init(asymmetricKeyParameter);
            if (!(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("unknown ParameterSpec");
            }
            if (this.kdf == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.ukmParameters = ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial();
        } else {
            if (this.kaAlgorithm.indexOf(85) < 0) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            DHUParameterSpec dHUParameterSpec = (DHUParameterSpec) algorithmParameterSpec;
            this.f89931f = dHUParameterSpec;
            this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
            this.f89930e.init(new XDHUPrivateParameters(asymmetricKeyParameter, ((BCXDHPrivateKey) this.f89931f.getEphemeralPrivateKey()).xdhPrivateKey, ((BCXDHPublicKey) this.f89931f.getEphemeralPublicKey()).xdhPublicKey));
        }
        if (this.kdf == null || this.ukmParameters != null) {
            return;
        }
        this.ukmParameters = new byte[0];
    }
}

package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.crypto.signers.Ed448Signer;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class SignatureSpi extends java.security.SignatureSpi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f89943c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Signer f89945b;

    public static final class Ed25519 extends SignatureSpi {
        public Ed25519() {
            super(EdDSAParameterSpec.Ed25519);
        }
    }

    public static final class Ed448 extends SignatureSpi {
        public Ed448() {
            super(EdDSAParameterSpec.Ed448);
        }
    }

    public static final class EdDSA extends SignatureSpi {
        public EdDSA() {
            super(null);
        }
    }

    public SignatureSpi(String str) {
        this.f89944a = str;
    }

    public final Signer a(String str) throws InvalidKeyException {
        String str2 = this.f89944a;
        if (str2 == null || str.equals(str2)) {
            return str.equals(EdDSAParameterSpec.Ed448) ? new Ed448Signer(f89943c) : new Ed25519Signer();
        }
        throw new InvalidKeyException("inappropriate key for ".concat(str2));
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCEdDSAPrivateKey)) {
            throw new InvalidKeyException("cannot identify EdDSA private key");
        }
        AsymmetricKeyParameter asymmetricKeyParameter = ((BCEdDSAPrivateKey) privateKey).f89924p0;
        this.f89945b = a(asymmetricKeyParameter instanceof Ed448PrivateKeyParameters ? EdDSAParameterSpec.Ed448 : EdDSAParameterSpec.Ed25519);
        this.f89945b.init(true, asymmetricKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCEdDSAPublicKey)) {
            throw new InvalidKeyException("cannot identify EdDSA public key");
        }
        AsymmetricKeyParameter asymmetricKeyParameter = ((BCEdDSAPublicKey) publicKey).f89927p0;
        this.f89945b = a(asymmetricKeyParameter instanceof Ed448PublicKeyParameters ? EdDSAParameterSpec.Ed448 : EdDSAParameterSpec.Ed25519);
        this.f89945b.init(false, asymmetricKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.f89945b.generateSignature();
        } catch (CryptoException e5) {
            throw new SignatureException(e5.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f89945b.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.f89945b.verifySignature(bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f89945b.update(bArr, i10, i11);
    }
}

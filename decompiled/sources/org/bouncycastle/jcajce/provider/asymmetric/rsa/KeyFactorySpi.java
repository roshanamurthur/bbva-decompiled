package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import androidx.appcompat.view.menu.b;
import androidx.camera.core.impl.a;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec;
import org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(PrivateKeyInfo.getInstance(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e5) {
                try {
                    return new BCRSAPrivateCrtKey(RSAPrivateKey.getInstance(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                } catch (Exception unused) {
                    throw new ExtendedInvalidKeySpecException(b.c(e5, new StringBuilder("unable to process key spec: ")), e5);
                }
            }
        }
        if (keySpec instanceof RSAPrivateCrtKeySpec) {
            RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec = (RSAPrivateCrtKeySpec) keySpec;
            BCRSAPrivateCrtKey bCRSAPrivateCrtKey = new BCRSAPrivateCrtKey(new RSAPrivateCrtKeyParameters(rSAPrivateCrtKeySpec.getModulus(), rSAPrivateCrtKeySpec.getPublicExponent(), rSAPrivateCrtKeySpec.getPrivateExponent(), rSAPrivateCrtKeySpec.getPrimeP(), rSAPrivateCrtKeySpec.getPrimeQ(), rSAPrivateCrtKeySpec.getPrimeExponentP(), rSAPrivateCrtKeySpec.getPrimeExponentQ(), rSAPrivateCrtKeySpec.getCrtCoefficient()));
            bCRSAPrivateCrtKey.modulus = rSAPrivateCrtKeySpec.getModulus();
            bCRSAPrivateCrtKey.f89978q0 = rSAPrivateCrtKeySpec.getPublicExponent();
            bCRSAPrivateCrtKey.privateExponent = rSAPrivateCrtKeySpec.getPrivateExponent();
            bCRSAPrivateCrtKey.f89979r0 = rSAPrivateCrtKeySpec.getPrimeP();
            bCRSAPrivateCrtKey.f89980s0 = rSAPrivateCrtKeySpec.getPrimeQ();
            bCRSAPrivateCrtKey.f89981t0 = rSAPrivateCrtKeySpec.getPrimeExponentP();
            bCRSAPrivateCrtKey.f89982u0 = rSAPrivateCrtKeySpec.getPrimeExponentQ();
            bCRSAPrivateCrtKey.v0 = rSAPrivateCrtKeySpec.getCrtCoefficient();
            return bCRSAPrivateCrtKey;
        }
        if (keySpec instanceof RSAPrivateKeySpec) {
            RSAPrivateKeySpec rSAPrivateKeySpec = (RSAPrivateKeySpec) keySpec;
            BCRSAPrivateKey bCRSAPrivateKey = new BCRSAPrivateKey();
            bCRSAPrivateKey.algorithmIdentifier = BCRSAPublicKey.f89984t0;
            bCRSAPrivateKey.attrCarrier = new PKCS12BagAttributeCarrierImpl();
            bCRSAPrivateKey.modulus = rSAPrivateKeySpec.getModulus();
            bCRSAPrivateKey.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
            bCRSAPrivateKey.rsaPrivateKey = new RSAKeyParameters(true, bCRSAPrivateKey.modulus, bCRSAPrivateKey.privateExponent);
            return bCRSAPrivateKey;
        }
        if (!(keySpec instanceof OpenSSHPrivateKeySpec)) {
            throw new InvalidKeySpecException("unknown KeySpec type: ".concat(keySpec.getClass().getName()));
        }
        AsymmetricKeyParameter privateKeyBlob = OpenSSHPrivateKeyUtil.parsePrivateKeyBlob(((OpenSSHPrivateKeySpec) keySpec).getEncoded());
        if (!(privateKeyBlob instanceof RSAPrivateCrtKeyParameters)) {
            throw new InvalidKeySpecException("open SSH public key is not RSA private key");
        }
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) privateKeyBlob;
        BCRSAPrivateCrtKey bCRSAPrivateCrtKey2 = new BCRSAPrivateCrtKey(rSAPrivateCrtKeyParameters);
        bCRSAPrivateCrtKey2.f89978q0 = rSAPrivateCrtKeyParameters.getPublicExponent();
        bCRSAPrivateCrtKey2.f89979r0 = rSAPrivateCrtKeyParameters.getP();
        bCRSAPrivateCrtKey2.f89980s0 = rSAPrivateCrtKeyParameters.getQ();
        bCRSAPrivateCrtKey2.f89981t0 = rSAPrivateCrtKeyParameters.getDP();
        bCRSAPrivateCrtKey2.f89982u0 = rSAPrivateCrtKeyParameters.getDQ();
        bCRSAPrivateCrtKey2.v0 = rSAPrivateCrtKeyParameters.getQInv();
        return bCRSAPrivateCrtKey2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof RSAPublicKeySpec) {
            RSAPublicKeySpec rSAPublicKeySpec = (RSAPublicKeySpec) keySpec;
            BCRSAPublicKey bCRSAPublicKey = new BCRSAPublicKey();
            bCRSAPublicKey.f89987r0 = BCRSAPublicKey.f89984t0;
            bCRSAPublicKey.f89985p0 = rSAPublicKeySpec.getModulus();
            bCRSAPublicKey.f89986q0 = rSAPublicKeySpec.getPublicExponent();
            bCRSAPublicKey.f89988s0 = new RSAKeyParameters(false, bCRSAPublicKey.f89985p0, bCRSAPublicKey.f89986q0);
            return bCRSAPublicKey;
        }
        if (!(keySpec instanceof OpenSSHPublicKeySpec)) {
            return super.engineGeneratePublic(keySpec);
        }
        AsymmetricKeyParameter publicKey = OpenSSHPublicKeyUtil.parsePublicKey(((OpenSSHPublicKeySpec) keySpec).getEncoded());
        if (!(publicKey instanceof RSAKeyParameters)) {
            throw new InvalidKeySpecException("Open SSH public key is not RSA public key");
        }
        return new BCRSAPublicKey(BCRSAPublicKey.f89984t0, (RSAKeyParameters) publicKey);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(RSAPublicKeySpec.class) && (key instanceof RSAPublicKey)) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
            return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        if (cls.isAssignableFrom(RSAPrivateKeySpec.class) && (key instanceof java.security.interfaces.RSAPrivateKey)) {
            java.security.interfaces.RSAPrivateKey rSAPrivateKey = (java.security.interfaces.RSAPrivateKey) key;
            return new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        if (cls.isAssignableFrom(RSAPrivateCrtKeySpec.class) && (key instanceof RSAPrivateCrtKey)) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        if (cls.isAssignableFrom(OpenSSHPublicKeySpec.class) && (key instanceof RSAPublicKey)) {
            try {
                return new OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new RSAKeyParameters(false, ((RSAPublicKey) key).getModulus(), ((RSAPublicKey) key).getPublicExponent())));
            } catch (IOException e5) {
                throw new IllegalArgumentException(a.d(e5, new StringBuilder("unable to produce encoding: ")));
            }
        }
        if (cls.isAssignableFrom(OpenSSHPrivateKeySpec.class) && (key instanceof RSAPrivateCrtKey)) {
            try {
                return new OpenSSHPrivateKeySpec(OpenSSHPrivateKeyUtil.encodePrivateKey(new RSAPrivateCrtKeyParameters(((RSAPrivateCrtKey) key).getModulus(), ((RSAPrivateCrtKey) key).getPublicExponent(), ((RSAPrivateCrtKey) key).getPrivateExponent(), ((RSAPrivateCrtKey) key).getPrimeP(), ((RSAPrivateCrtKey) key).getPrimeQ(), ((RSAPrivateCrtKey) key).getPrimeExponentP(), ((RSAPrivateCrtKey) key).getPrimeExponentQ(), ((RSAPrivateCrtKey) key).getCrtCoefficient())));
            } catch (IOException e7) {
                throw new IllegalArgumentException(a.d(e7, new StringBuilder("unable to produce encoding: ")));
            }
        }
        if (cls.isAssignableFrom(org.bouncycastle.jce.spec.OpenSSHPublicKeySpec.class) && (key instanceof RSAPublicKey)) {
            try {
                return new org.bouncycastle.jce.spec.OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new RSAKeyParameters(false, ((RSAPublicKey) key).getModulus(), ((RSAPublicKey) key).getPublicExponent())));
            } catch (IOException e10) {
                throw new IllegalArgumentException(a.d(e10, new StringBuilder("unable to produce encoding: ")));
            }
        }
        if (!cls.isAssignableFrom(org.bouncycastle.jce.spec.OpenSSHPrivateKeySpec.class) || !(key instanceof RSAPrivateCrtKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        try {
            return new org.bouncycastle.jce.spec.OpenSSHPrivateKeySpec(OpenSSHPrivateKeyUtil.encodePrivateKey(new RSAPrivateCrtKeyParameters(((RSAPrivateCrtKey) key).getModulus(), ((RSAPrivateCrtKey) key).getPublicExponent(), ((RSAPrivateCrtKey) key).getPrivateExponent(), ((RSAPrivateCrtKey) key).getPrimeP(), ((RSAPrivateCrtKey) key).getPrimeQ(), ((RSAPrivateCrtKey) key).getPrimeExponentP(), ((RSAPrivateCrtKey) key).getPrimeExponentQ(), ((RSAPrivateCrtKey) key).getCrtCoefficient())));
        } catch (IOException e11) {
            throw new IllegalArgumentException(a.d(e11, new StringBuilder("unable to produce encoding: ")));
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
            BCRSAPublicKey bCRSAPublicKey = new BCRSAPublicKey();
            bCRSAPublicKey.f89987r0 = BCRSAPublicKey.f89984t0;
            bCRSAPublicKey.f89985p0 = rSAPublicKey.getModulus();
            bCRSAPublicKey.f89986q0 = rSAPublicKey.getPublicExponent();
            bCRSAPublicKey.f89988s0 = new RSAKeyParameters(false, bCRSAPublicKey.f89985p0, bCRSAPublicKey.f89986q0);
            return bCRSAPublicKey;
        }
        if (!(key instanceof RSAPrivateCrtKey)) {
            if (!(key instanceof java.security.interfaces.RSAPrivateKey)) {
                throw new InvalidKeyException("key type unknown");
            }
            java.security.interfaces.RSAPrivateKey rSAPrivateKey = (java.security.interfaces.RSAPrivateKey) key;
            BCRSAPrivateKey bCRSAPrivateKey = new BCRSAPrivateKey();
            bCRSAPrivateKey.algorithmIdentifier = BCRSAPublicKey.f89984t0;
            bCRSAPrivateKey.attrCarrier = new PKCS12BagAttributeCarrierImpl();
            bCRSAPrivateKey.modulus = rSAPrivateKey.getModulus();
            bCRSAPrivateKey.privateExponent = rSAPrivateKey.getPrivateExponent();
            bCRSAPrivateKey.rsaPrivateKey = new RSAKeyParameters(true, bCRSAPrivateKey.modulus, bCRSAPrivateKey.privateExponent);
            return bCRSAPrivateKey;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
        BCRSAPrivateCrtKey bCRSAPrivateCrtKey = new BCRSAPrivateCrtKey(new RSAPrivateCrtKeyParameters(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient()));
        bCRSAPrivateCrtKey.modulus = rSAPrivateCrtKey.getModulus();
        bCRSAPrivateCrtKey.f89978q0 = rSAPrivateCrtKey.getPublicExponent();
        bCRSAPrivateCrtKey.privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        bCRSAPrivateCrtKey.f89979r0 = rSAPrivateCrtKey.getPrimeP();
        bCRSAPrivateCrtKey.f89980s0 = rSAPrivateCrtKey.getPrimeQ();
        bCRSAPrivateCrtKey.f89981t0 = rSAPrivateCrtKey.getPrimeExponentP();
        bCRSAPrivateCrtKey.f89982u0 = rSAPrivateCrtKey.getPrimeExponentQ();
        bCRSAPrivateCrtKey.v0 = rSAPrivateCrtKey.getCrtCoefficient();
        return bCRSAPrivateCrtKey;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (!RSAUtil.isRsaOid(algorithm)) {
            throw new IOException(androidx.constraintlayout.core.parser.a.b("algorithm identifier ", algorithm, " in key not recognised"));
        }
        RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
        if (rSAPrivateKey.getCoefficient().intValue() != 0) {
            BCRSAPrivateCrtKey bCRSAPrivateCrtKey = new BCRSAPrivateCrtKey(RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey()));
            bCRSAPrivateCrtKey.algorithmIdentifier = privateKeyInfo.getPrivateKeyAlgorithm();
            return bCRSAPrivateCrtKey;
        }
        AlgorithmIdentifier privateKeyAlgorithm = privateKeyInfo.getPrivateKeyAlgorithm();
        BCRSAPrivateKey bCRSAPrivateKey = new BCRSAPrivateKey();
        bCRSAPrivateKey.algorithmIdentifier = BCRSAPublicKey.f89984t0;
        bCRSAPrivateKey.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        bCRSAPrivateKey.algorithmIdentifier = privateKeyAlgorithm;
        bCRSAPrivateKey.modulus = rSAPrivateKey.getModulus();
        bCRSAPrivateKey.privateExponent = rSAPrivateKey.getPrivateExponent();
        bCRSAPrivateKey.rsaPrivateKey = new RSAKeyParameters(true, bCRSAPrivateKey.modulus, bCRSAPrivateKey.privateExponent);
        return bCRSAPrivateKey;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (!RSAUtil.isRsaOid(algorithm)) {
            throw new IOException(androidx.constraintlayout.core.parser.a.b("algorithm identifier ", algorithm, " in key not recognised"));
        }
        BCRSAPublicKey bCRSAPublicKey = new BCRSAPublicKey();
        try {
            org.bouncycastle.asn1.pkcs.RSAPublicKey rSAPublicKey = org.bouncycastle.asn1.pkcs.RSAPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
            bCRSAPublicKey.f89987r0 = subjectPublicKeyInfo.getAlgorithm();
            bCRSAPublicKey.f89985p0 = rSAPublicKey.getModulus();
            bCRSAPublicKey.f89986q0 = rSAPublicKey.getPublicExponent();
            bCRSAPublicKey.f89988s0 = new RSAKeyParameters(false, bCRSAPublicKey.f89985p0, bCRSAPublicKey.f89986q0);
            return bCRSAPublicKey;
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }
}

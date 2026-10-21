package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.util.OpenSSHPrivateKeyUtil;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec;
import org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {

    public class a extends InvalidKeySpecException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Exception f89797p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Exception exc) {
            super(str);
            this.f89797p0 = exc;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.f89797p0;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DSAPrivateKeySpec) {
            DSAPrivateKeySpec dSAPrivateKeySpec = (DSAPrivateKeySpec) keySpec;
            BCDSAPrivateKey bCDSAPrivateKey = new BCDSAPrivateKey();
            bCDSAPrivateKey.f89788r0 = new PKCS12BagAttributeCarrierImpl();
            bCDSAPrivateKey.f89786p0 = dSAPrivateKeySpec.getX();
            bCDSAPrivateKey.f89787q0 = new DSAParameterSpec(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
            return bCDSAPrivateKey;
        }
        if (!(keySpec instanceof OpenSSHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        AsymmetricKeyParameter privateKeyBlob = OpenSSHPrivateKeyUtil.parsePrivateKeyBlob(((OpenSSHPrivateKeySpec) keySpec).getEncoded());
        if (!(privateKeyBlob instanceof DSAPrivateKeyParameters)) {
            throw new IllegalArgumentException("openssh private key is not dsa privare key");
        }
        DSAPrivateKeyParameters dSAPrivateKeyParameters = (DSAPrivateKeyParameters) privateKeyBlob;
        return engineGeneratePrivate(new DSAPrivateKeySpec(dSAPrivateKeyParameters.getX(), dSAPrivateKeyParameters.getParameters().getP(), dSAPrivateKeyParameters.getParameters().getQ(), dSAPrivateKeyParameters.getParameters().getG()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof DSAPublicKeySpec)) {
            if (!(keySpec instanceof OpenSSHPublicKeySpec)) {
                return super.engineGeneratePublic(keySpec);
            }
            AsymmetricKeyParameter publicKey = OpenSSHPublicKeyUtil.parsePublicKey(((OpenSSHPublicKeySpec) keySpec).getEncoded());
            if (!(publicKey instanceof DSAPublicKeyParameters)) {
                throw new IllegalArgumentException("openssh public key is not dsa public key");
            }
            DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) publicKey;
            return engineGeneratePublic(new DSAPublicKeySpec(dSAPublicKeyParameters.getY(), dSAPublicKeyParameters.getParameters().getP(), dSAPublicKeyParameters.getParameters().getQ(), dSAPublicKeyParameters.getParameters().getG()));
        }
        try {
            DSAPublicKeySpec dSAPublicKeySpec = (DSAPublicKeySpec) keySpec;
            BCDSAPublicKey bCDSAPublicKey = new BCDSAPublicKey();
            BigInteger y7 = dSAPublicKeySpec.getY();
            bCDSAPublicKey.f89790p0 = y7;
            bCDSAPublicKey.f89792r0 = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
            bCDSAPublicKey.f89791q0 = new DSAPublicKeyParameters(y7, DSAUtil.b(bCDSAPublicKey.f89792r0));
            return bCDSAPublicKey;
        } catch (Exception e5) {
            throw new a(ci.a.b(e5, new StringBuilder("invalid KeySpec: ")), e5);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        }
        if (cls.isAssignableFrom(DSAPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        }
        if (cls.isAssignableFrom(OpenSSHPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) key;
            try {
                return new OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new DSAPublicKeyParameters(dSAPublicKey2.getY(), new DSAParameters(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (IOException e5) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("unable to produce encoding: ")));
            }
        }
        if (cls.isAssignableFrom(OpenSSHPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey2 = (DSAPrivateKey) key;
            try {
                return new OpenSSHPrivateKeySpec(OpenSSHPrivateKeyUtil.encodePrivateKey(new DSAPrivateKeyParameters(dSAPrivateKey2.getX(), new DSAParameters(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
            } catch (IOException e7) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e7, new StringBuilder("unable to produce encoding: ")));
            }
        }
        if (cls.isAssignableFrom(org.bouncycastle.jce.spec.OpenSSHPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey3 = (DSAPublicKey) key;
            try {
                return new org.bouncycastle.jce.spec.OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new DSAPublicKeyParameters(dSAPublicKey3.getY(), new DSAParameters(dSAPublicKey3.getParams().getP(), dSAPublicKey3.getParams().getQ(), dSAPublicKey3.getParams().getG()))));
            } catch (IOException e10) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e10, new StringBuilder("unable to produce encoding: ")));
            }
        }
        if (!cls.isAssignableFrom(org.bouncycastle.jce.spec.OpenSSHPrivateKeySpec.class) || !(key instanceof DSAPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        DSAPrivateKey dSAPrivateKey3 = (DSAPrivateKey) key;
        try {
            return new org.bouncycastle.jce.spec.OpenSSHPrivateKeySpec(OpenSSHPrivateKeyUtil.encodePrivateKey(new DSAPrivateKeyParameters(dSAPrivateKey3.getX(), new DSAParameters(dSAPrivateKey3.getParams().getP(), dSAPrivateKey3.getParams().getQ(), dSAPrivateKey3.getParams().getG()))));
        } catch (IOException e11) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e11, new StringBuilder("unable to produce encoding: ")));
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (!(key instanceof DSAPrivateKey)) {
            throw new InvalidKeyException("key type unknown");
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
        BCDSAPrivateKey bCDSAPrivateKey = new BCDSAPrivateKey();
        bCDSAPrivateKey.f89788r0 = new PKCS12BagAttributeCarrierImpl();
        bCDSAPrivateKey.f89786p0 = dSAPrivateKey.getX();
        bCDSAPrivateKey.f89787q0 = dSAPrivateKey.getParams();
        return bCDSAPrivateKey;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (DSAUtil.isDsaOid(algorithm)) {
            return new BCDSAPrivateKey(privateKeyInfo);
        }
        throw new IOException(androidx.constraintlayout.core.parser.a.b("algorithm identifier ", algorithm, " in key not recognised"));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (DSAUtil.isDsaOid(algorithm)) {
            return new BCDSAPublicKey(subjectPublicKeyInfo);
        }
        throw new IOException(androidx.constraintlayout.core.parser.a.b("algorithm identifier ", algorithm, " in key not recognised"));
    }
}

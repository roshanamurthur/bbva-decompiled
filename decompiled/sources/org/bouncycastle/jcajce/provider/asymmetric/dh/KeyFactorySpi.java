package org.bouncycastle.jcajce.provider.asymmetric.dh;

import androidx.constraintlayout.core.parser.a;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes8.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof DHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        DHPrivateKeySpec dHPrivateKeySpec = (DHPrivateKeySpec) keySpec;
        BCDHPrivateKey bCDHPrivateKey = new BCDHPrivateKey();
        bCDHPrivateKey.f89754t0 = new PKCS12BagAttributeCarrierImpl();
        bCDHPrivateKey.f89750p0 = dHPrivateKeySpec.getX();
        bCDHPrivateKey.f89751q0 = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
        return bCDHPrivateKey;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof DHPublicKeySpec)) {
            return super.engineGeneratePublic(keySpec);
        }
        try {
            return new BCDHPublicKey((DHPublicKeySpec) keySpec);
        } catch (IllegalArgumentException e5) {
            throw new ExtendedInvalidKeySpecException(e5.getMessage(), e5);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        }
        if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            BCDHPublicKey bCDHPublicKey = new BCDHPublicKey();
            BigInteger y7 = dHPublicKey.getY();
            bCDHPublicKey.f89755p0 = y7;
            bCDHPublicKey.f89757r0 = dHPublicKey.getParams();
            bCDHPublicKey.f89756q0 = new DHPublicKeyParameters(y7, new DHParameters(bCDHPublicKey.f89757r0.getP(), bCDHPublicKey.f89757r0.getG()));
            return bCDHPublicKey;
        }
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("key type unknown");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        BCDHPrivateKey bCDHPrivateKey = new BCDHPrivateKey();
        bCDHPrivateKey.f89754t0 = new PKCS12BagAttributeCarrierImpl();
        bCDHPrivateKey.f89750p0 = dHPrivateKey.getX();
        bCDHPrivateKey.f89751q0 = dHPrivateKey.getParams();
        return bCDHPrivateKey;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.dhKeyAgreement)) {
            return new BCDHPrivateKey(privateKeyInfo);
        }
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.dhpublicnumber)) {
            return new BCDHPrivateKey(privateKeyInfo);
        }
        throw new IOException(a.b("algorithm identifier ", algorithm, " in key not recognised"));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.dhKeyAgreement)) {
            return new BCDHPublicKey(subjectPublicKeyInfo);
        }
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.dhpublicnumber)) {
            return new BCDHPublicKey(subjectPublicKeyInfo);
        }
        throw new IOException(a.b("algorithm identifier ", algorithm, " in key not recognised"));
    }
}

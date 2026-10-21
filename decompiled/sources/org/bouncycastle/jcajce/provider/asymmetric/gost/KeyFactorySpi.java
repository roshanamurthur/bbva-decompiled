package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PrivateKeySpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof GOST3410PrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        GOST3410PrivateKeySpec gOST3410PrivateKeySpec = (GOST3410PrivateKeySpec) keySpec;
        BCGOST3410PrivateKey bCGOST3410PrivateKey = new BCGOST3410PrivateKey();
        bCGOST3410PrivateKey.f89966r0 = new PKCS12BagAttributeCarrierImpl();
        bCGOST3410PrivateKey.f89964p0 = gOST3410PrivateKeySpec.getX();
        bCGOST3410PrivateKey.f89965q0 = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(gOST3410PrivateKeySpec.getP(), gOST3410PrivateKeySpec.getQ(), gOST3410PrivateKeySpec.getA()));
        return bCGOST3410PrivateKey;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof GOST3410PublicKeySpec)) {
            return super.engineGeneratePublic(keySpec);
        }
        GOST3410PublicKeySpec gOST3410PublicKeySpec = (GOST3410PublicKeySpec) keySpec;
        BCGOST3410PublicKey bCGOST3410PublicKey = new BCGOST3410PublicKey();
        bCGOST3410PublicKey.f89967p0 = gOST3410PublicKeySpec.getY();
        bCGOST3410PublicKey.f89968q0 = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(gOST3410PublicKeySpec.getP(), gOST3410PublicKeySpec.getQ(), gOST3410PublicKeySpec.getA()));
        return bCGOST3410PublicKey;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(GOST3410PublicKeySpec.class) && (key instanceof GOST3410PublicKey)) {
            GOST3410PublicKey gOST3410PublicKey = (GOST3410PublicKey) key;
            GOST3410PublicKeyParameterSetSpec publicKeyParameters = gOST3410PublicKey.getParameters().getPublicKeyParameters();
            return new GOST3410PublicKeySpec(gOST3410PublicKey.getY(), publicKeyParameters.getP(), publicKeyParameters.getQ(), publicKeyParameters.getA());
        }
        if (!cls.isAssignableFrom(GOST3410PrivateKeySpec.class) || !(key instanceof GOST3410PrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) key;
        GOST3410PublicKeyParameterSetSpec publicKeyParameters2 = gOST3410PrivateKey.getParameters().getPublicKeyParameters();
        return new GOST3410PrivateKeySpec(gOST3410PrivateKey.getX(), publicKeyParameters2.getP(), publicKeyParameters2.getQ(), publicKeyParameters2.getA());
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof GOST3410PublicKey) {
            GOST3410PublicKey gOST3410PublicKey = (GOST3410PublicKey) key;
            BCGOST3410PublicKey bCGOST3410PublicKey = new BCGOST3410PublicKey();
            bCGOST3410PublicKey.f89967p0 = gOST3410PublicKey.getY();
            bCGOST3410PublicKey.f89968q0 = gOST3410PublicKey.getParameters();
            return bCGOST3410PublicKey;
        }
        if (!(key instanceof GOST3410PrivateKey)) {
            throw new InvalidKeyException("key type unknown");
        }
        GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) key;
        BCGOST3410PrivateKey bCGOST3410PrivateKey = new BCGOST3410PrivateKey();
        bCGOST3410PrivateKey.f89966r0 = new PKCS12BagAttributeCarrierImpl();
        bCGOST3410PrivateKey.f89964p0 = gOST3410PrivateKey.getX();
        bCGOST3410PrivateKey.f89965q0 = gOST3410PrivateKey.getParameters();
        return bCGOST3410PrivateKey;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        BigInteger bigInteger;
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (!algorithm.equals((ASN1Primitive) CryptoProObjectIdentifiers.gostR3410_94)) {
            throw new IOException(androidx.constraintlayout.core.parser.a.b("algorithm identifier ", algorithm, " in key not recognised"));
        }
        BCGOST3410PrivateKey bCGOST3410PrivateKey = new BCGOST3410PrivateKey();
        bCGOST3410PrivateKey.f89966r0 = new PKCS12BagAttributeCarrierImpl();
        GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        ASN1Encodable privateKey = privateKeyInfo.parsePrivateKey();
        if (privateKey instanceof ASN1Integer) {
            bigInteger = ASN1Integer.getInstance(privateKey).getPositiveValue();
        } else {
            byte[] octets = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            byte[] bArr = new byte[octets.length];
            for (int i10 = 0; i10 != octets.length; i10++) {
                bArr[i10] = octets[(octets.length - 1) - i10];
            }
            bigInteger = new BigInteger(1, bArr);
        }
        bCGOST3410PrivateKey.f89964p0 = bigInteger;
        bCGOST3410PrivateKey.f89965q0 = GOST3410ParameterSpec.fromPublicKeyAlg(gOST3410PublicKeyAlgParameters);
        return bCGOST3410PrivateKey;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (!algorithm.equals((ASN1Primitive) CryptoProObjectIdentifiers.gostR3410_94)) {
            throw new IOException(androidx.constraintlayout.core.parser.a.b("algorithm identifier ", algorithm, " in key not recognised"));
        }
        BCGOST3410PublicKey bCGOST3410PublicKey = new BCGOST3410PublicKey();
        GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
        try {
            byte[] octets = ((DEROctetString) subjectPublicKeyInfo.parsePublicKey()).getOctets();
            byte[] bArr = new byte[octets.length];
            for (int i10 = 0; i10 != octets.length; i10++) {
                bArr[i10] = octets[(octets.length - 1) - i10];
            }
            bCGOST3410PublicKey.f89967p0 = new BigInteger(1, bArr);
            bCGOST3410PublicKey.f89968q0 = GOST3410ParameterSpec.fromPublicKeyAlg(gOST3410PublicKeyAlgParameters);
            return bCGOST3410PublicKey;
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }
}

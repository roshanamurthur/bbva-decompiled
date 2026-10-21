package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import androidx.constraintlayout.core.parser.a;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.ElGamalPublicKey;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.ElGamalPrivateKeySpec;
import org.bouncycastle.jce.spec.ElGamalPublicKeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof ElGamalPrivateKeySpec) {
            ElGamalPrivateKeySpec elGamalPrivateKeySpec = (ElGamalPrivateKeySpec) keySpec;
            BCElGamalPrivateKey bCElGamalPrivateKey = new BCElGamalPrivateKey();
            bCElGamalPrivateKey.f89950r0 = new PKCS12BagAttributeCarrierImpl();
            bCElGamalPrivateKey.f89948p0 = elGamalPrivateKeySpec.getX();
            bCElGamalPrivateKey.f89949q0 = new ElGamalParameterSpec(elGamalPrivateKeySpec.getParams().getP(), elGamalPrivateKeySpec.getParams().getG());
            return bCElGamalPrivateKey;
        }
        if (!(keySpec instanceof DHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        DHPrivateKeySpec dHPrivateKeySpec = (DHPrivateKeySpec) keySpec;
        BCElGamalPrivateKey bCElGamalPrivateKey2 = new BCElGamalPrivateKey();
        bCElGamalPrivateKey2.f89950r0 = new PKCS12BagAttributeCarrierImpl();
        bCElGamalPrivateKey2.f89948p0 = dHPrivateKeySpec.getX();
        bCElGamalPrivateKey2.f89949q0 = new ElGamalParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
        return bCElGamalPrivateKey2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof ElGamalPublicKeySpec) {
            ElGamalPublicKeySpec elGamalPublicKeySpec = (ElGamalPublicKeySpec) keySpec;
            BCElGamalPublicKey bCElGamalPublicKey = new BCElGamalPublicKey();
            bCElGamalPublicKey.f89951p0 = elGamalPublicKeySpec.getY();
            bCElGamalPublicKey.f89952q0 = new ElGamalParameterSpec(elGamalPublicKeySpec.getParams().getP(), elGamalPublicKeySpec.getParams().getG());
            return bCElGamalPublicKey;
        }
        if (!(keySpec instanceof DHPublicKeySpec)) {
            return super.engineGeneratePublic(keySpec);
        }
        DHPublicKeySpec dHPublicKeySpec = (DHPublicKeySpec) keySpec;
        BCElGamalPublicKey bCElGamalPublicKey2 = new BCElGamalPublicKey();
        bCElGamalPublicKey2.f89951p0 = dHPublicKeySpec.getY();
        bCElGamalPublicKey2.f89952q0 = new ElGamalParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        return bCElGamalPublicKey2;
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
            BCElGamalPublicKey bCElGamalPublicKey = new BCElGamalPublicKey();
            bCElGamalPublicKey.f89951p0 = dHPublicKey.getY();
            bCElGamalPublicKey.f89952q0 = new ElGamalParameterSpec(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
            return bCElGamalPublicKey;
        }
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            BCElGamalPrivateKey bCElGamalPrivateKey = new BCElGamalPrivateKey();
            bCElGamalPrivateKey.f89950r0 = new PKCS12BagAttributeCarrierImpl();
            bCElGamalPrivateKey.f89948p0 = dHPrivateKey.getX();
            bCElGamalPrivateKey.f89949q0 = new ElGamalParameterSpec(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
            return bCElGamalPrivateKey;
        }
        if (key instanceof ElGamalPublicKey) {
            ElGamalPublicKey elGamalPublicKey = (ElGamalPublicKey) key;
            BCElGamalPublicKey bCElGamalPublicKey2 = new BCElGamalPublicKey();
            bCElGamalPublicKey2.f89951p0 = elGamalPublicKey.getY();
            bCElGamalPublicKey2.f89952q0 = elGamalPublicKey.getParameters();
            return bCElGamalPublicKey2;
        }
        if (!(key instanceof ElGamalPrivateKey)) {
            throw new InvalidKeyException("key type unknown");
        }
        ElGamalPrivateKey elGamalPrivateKey = (ElGamalPrivateKey) key;
        BCElGamalPrivateKey bCElGamalPrivateKey2 = new BCElGamalPrivateKey();
        bCElGamalPrivateKey2.f89950r0 = new PKCS12BagAttributeCarrierImpl();
        bCElGamalPrivateKey2.f89948p0 = elGamalPrivateKey.getX();
        bCElGamalPrivateKey2.f89949q0 = elGamalPrivateKey.getParameters();
        return bCElGamalPrivateKey2;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.dhKeyAgreement)) {
            return new BCElGamalPrivateKey(privateKeyInfo);
        }
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.dhpublicnumber)) {
            return new BCElGamalPrivateKey(privateKeyInfo);
        }
        if (algorithm.equals((ASN1Primitive) OIWObjectIdentifiers.elGamalAlgorithm)) {
            return new BCElGamalPrivateKey(privateKeyInfo);
        }
        throw new IOException(a.b("algorithm identifier ", algorithm, " in key not recognised"));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.dhKeyAgreement)) {
            return new BCElGamalPublicKey(subjectPublicKeyInfo);
        }
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.dhpublicnumber)) {
            return new BCElGamalPublicKey(subjectPublicKeyInfo);
        }
        if (algorithm.equals((ASN1Primitive) OIWObjectIdentifiers.elGamalAlgorithm)) {
            return new BCElGamalPublicKey(subjectPublicKeyInfo);
        }
        throw new IOException(a.b("algorithm identifier ", algorithm, " in key not recognised"));
    }
}

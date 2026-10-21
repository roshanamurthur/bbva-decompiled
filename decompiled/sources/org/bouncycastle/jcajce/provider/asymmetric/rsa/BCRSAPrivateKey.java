package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BCRSAPrivateKey implements RSAPrivateKey, PKCS12BagAttributeCarrier {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final BigInteger f89983p0 = BigInteger.valueOf(0);
    protected transient AlgorithmIdentifier algorithmIdentifier = BCRSAPublicKey.f89984t0;
    protected transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    protected BigInteger modulus;
    protected BigInteger privateExponent;
    protected transient RSAKeyParameters rsaPrivateKey;

    public BCRSAPrivateKey(RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters) {
        this.modulus = rSAPrivateCrtKeyParameters.getModulus();
        this.privateExponent = rSAPrivateCrtKeyParameters.getExponent();
        this.rsaPrivateKey = rSAPrivateCrtKeyParameters;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new RSAKeyParameters(true, this.modulus, this.privateExponent);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS) ? "RSASSA-PSS" : "RSA";
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        AlgorithmIdentifier algorithmIdentifier = this.algorithmIdentifier;
        BigInteger modulus = getModulus();
        BigInteger bigInteger = f89983p0;
        return KeyUtil.getEncodedPrivateKeyInfo(algorithmIdentifier, new org.bouncycastle.asn1.pkcs.RSAPrivateKey(modulus, bigInteger, getPrivateExponent(), bigInteger, bigInteger, bigInteger, bigInteger, bigInteger));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RSA Private Key [");
        String strLineSeparator = Strings.lineSeparator();
        BigInteger modulus = getModulus();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = RSAUtil.rsaOids;
        stringBuffer.append(new Fingerprint(modulus.toByteArray()).toString());
        stringBuffer.append("],[]");
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }
}

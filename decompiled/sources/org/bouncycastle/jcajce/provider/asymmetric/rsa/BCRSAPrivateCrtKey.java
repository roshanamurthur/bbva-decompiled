package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BCRSAPrivateCrtKey extends BCRSAPrivateKey implements RSAPrivateCrtKey {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f89978q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f89979r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BigInteger f89980s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public BigInteger f89981t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public BigInteger f89982u0;
    public BigInteger v0;

    public BCRSAPrivateCrtKey(RSAPrivateKey rSAPrivateKey) {
        super(new RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient()));
        this.modulus = rSAPrivateKey.getModulus();
        this.f89978q0 = rSAPrivateKey.getPublicExponent();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.f89979r0 = rSAPrivateKey.getPrime1();
        this.f89980s0 = rSAPrivateKey.getPrime2();
        this.f89981t0 = rSAPrivateKey.getExponent1();
        this.f89982u0 = rSAPrivateKey.getExponent2();
        this.v0 = rSAPrivateKey.getCoefficient();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new RSAPrivateCrtKeyParameters(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPrivateCrtKey)) {
            return false;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
        return getModulus().equals(rSAPrivateCrtKey.getModulus()) && getPublicExponent().equals(rSAPrivateCrtKey.getPublicExponent()) && getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) && getPrimeP().equals(rSAPrivateCrtKey.getPrimeP()) && getPrimeQ().equals(rSAPrivateCrtKey.getPrimeQ()) && getPrimeExponentP().equals(rSAPrivateCrtKey.getPrimeExponentP()) && getPrimeExponentQ().equals(rSAPrivateCrtKey.getPrimeExponentQ()) && getCrtCoefficient().equals(rSAPrivateCrtKey.getCrtCoefficient());
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getCrtCoefficient() {
        return this.v0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedPrivateKeyInfo(this.algorithmIdentifier, new RSAPrivateKey(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey, java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentP() {
        return this.f89981t0;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeExponentQ() {
        return this.f89982u0;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeP() {
        return this.f89979r0;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPrimeQ() {
        return this.f89980s0;
    }

    @Override // java.security.interfaces.RSAPrivateCrtKey
    public BigInteger getPublicExponent() {
        return this.f89978q0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public int hashCode() {
        return (getModulus().hashCode() ^ getPublicExponent().hashCode()) ^ getPrivateExponent().hashCode();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("RSA Private CRT Key [");
        String strLineSeparator = Strings.lineSeparator();
        BigInteger modulus = getModulus();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = RSAUtil.rsaOids;
        stringBuffer.append(new Fingerprint(modulus.toByteArray()).toString());
        stringBuffer.append("],[");
        stringBuffer.append(new Fingerprint(getPublicExponent().toByteArray(), 32).toString());
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("             modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("     public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }
}

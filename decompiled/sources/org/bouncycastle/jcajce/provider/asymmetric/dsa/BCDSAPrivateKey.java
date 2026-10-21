package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.util.Enumeration;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BCDSAPrivateKey implements DSAPrivateKey, PKCS12BagAttributeCarrier {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f89786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient DSAParams f89787q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient PKCS12BagAttributeCarrierImpl f89788r0 = new PKCS12BagAttributeCarrierImpl();

    public BCDSAPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f89787q0 = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.f89788r0 = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f89787q0.getP());
        objectOutputStream.writeObject(this.f89787q0.getQ());
        objectOutputStream.writeObject(this.f89787q0.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPrivateKey)) {
            return false;
        }
        DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) obj;
        return getX().equals(dSAPrivateKey.getX()) && getParams().getG().equals(dSAPrivateKey.getParams().getG()) && getParams().getP().equals(dSAPrivateKey.getParams().getP()) && getParams().getQ().equals(dSAPrivateKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.f89788r0.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.f89788r0.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedPrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, new DSAParameter(this.f89787q0.getP(), this.f89787q0.getQ(), this.f89787q0.getG()).toASN1Primitive()), new ASN1Integer(getX()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.f89787q0;
    }

    @Override // java.security.interfaces.DSAPrivateKey
    public BigInteger getX() {
        return this.f89786p0;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f89788r0.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DSA Private Key [");
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigIntegerModPow = getParams().getG().modPow(this.f89786p0, getParams().getP());
        stringBuffer.append(DSAUtil.a(bigIntegerModPow, getParams()));
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("            Y: ");
        stringBuffer.append(bigIntegerModPow.toString(16));
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public BCDSAPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        DSAParameter dSAParameter = DSAParameter.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        this.f89786p0 = ((ASN1Integer) privateKeyInfo.parsePrivateKey()).getValue();
        this.f89787q0 = new DSAParameterSpec(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
    }
}

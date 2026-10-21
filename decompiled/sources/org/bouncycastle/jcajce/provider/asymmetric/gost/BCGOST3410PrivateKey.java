package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.GOST3410Params;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

/* JADX INFO: loaded from: classes8.dex */
public class BCGOST3410PrivateKey implements GOST3410PrivateKey, PKCS12BagAttributeCarrier {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f89964p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient GOST3410Params f89965q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient PKCS12BagAttributeCarrierImpl f89966r0 = new PKCS12BagAttributeCarrierImpl();

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.f89965q0 = new GOST3410ParameterSpec(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.f89965q0 = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.f89966r0 = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object a10;
        objectOutputStream.defaultWriteObject();
        if (this.f89965q0.getPublicKeyParamSetOID() != null) {
            a10 = this.f89965q0.getPublicKeyParamSetOID();
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.f89965q0.getPublicKeyParameters().getP());
            objectOutputStream.writeObject(this.f89965q0.getPublicKeyParameters().getQ());
            a10 = this.f89965q0.getPublicKeyParameters().getA();
        }
        objectOutputStream.writeObject(a10);
        objectOutputStream.writeObject(this.f89965q0.getDigestParamSetOID());
        objectOutputStream.writeObject(this.f89965q0.getEncryptionParamSetOID());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410PrivateKey)) {
            return false;
        }
        GOST3410PrivateKey gOST3410PrivateKey = (GOST3410PrivateKey) obj;
        if (!getX().equals(gOST3410PrivateKey.getX()) || !getParameters().getPublicKeyParameters().equals(gOST3410PrivateKey.getParameters().getPublicKeyParameters()) || !getParameters().getDigestParamSetOID().equals(gOST3410PrivateKey.getParameters().getDigestParamSetOID())) {
            return false;
        }
        String encryptionParamSetOID = getParameters().getEncryptionParamSetOID();
        String encryptionParamSetOID2 = gOST3410PrivateKey.getParameters().getEncryptionParamSetOID();
        return encryptionParamSetOID == encryptionParamSetOID2 || (encryptionParamSetOID != null && encryptionParamSetOID.equals(encryptionParamSetOID2));
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.f89966r0.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.f89966r0.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = byteArray[(byteArray.length - 1) - i10];
        }
        try {
            return (this.f89965q0 instanceof GOST3410ParameterSpec ? new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94, new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(this.f89965q0.getPublicKeyParamSetOID()), new ASN1ObjectIdentifier(this.f89965q0.getDigestParamSetOID()))), new DEROctetString(bArr)) : new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_94), new DEROctetString(bArr))).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410Key
    public GOST3410Params getParameters() {
        return this.f89965q0;
    }

    @Override // org.bouncycastle.jce.interfaces.GOST3410PrivateKey
    public BigInteger getX() {
        return this.f89964p0;
    }

    public int hashCode() {
        return getX().hashCode() ^ this.f89965q0.hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f89966r0.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public String toString() {
        try {
            return a.a(this.f89964p0, ((GOST3410PrivateKeyParameters) GOST3410Util.generatePrivateKeyParameter(this)).getParameters());
        } catch (InvalidKeyException e5) {
            throw new IllegalStateException(e5.getMessage());
        }
    }
}

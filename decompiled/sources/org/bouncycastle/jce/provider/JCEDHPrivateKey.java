package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

/* JADX INFO: loaded from: classes8.dex */
public class JCEDHPrivateKey implements DHPrivateKey, PKCS12BagAttributeCarrier {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f90395p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DHParameterSpec f90396q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PKCS12BagAttributeCarrierImpl f90397r0 = new PKCS12BagAttributeCarrierImpl();

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f90395p0 = (BigInteger) objectInputStream.readObject();
        this.f90396q0 = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.f90396q0.getP());
        objectOutputStream.writeObject(this.f90396q0.getG());
        objectOutputStream.writeInt(this.f90396q0.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.f90397r0.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.f90397r0.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.dhKeyAgreement, new DHParameter(this.f90396q0.getP(), this.f90396q0.getG(), this.f90396q0.getL())), new ASN1Integer(getX())).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.f90396q0;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.f90395p0;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f90397r0.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }
}

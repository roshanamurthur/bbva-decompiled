package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

/* JADX INFO: loaded from: classes8.dex */
public class PKCS12BagAttributeCarrierImpl implements PKCS12BagAttributeCarrier {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Hashtable f90033p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Vector f90034q0;

    public PKCS12BagAttributeCarrierImpl() {
        Hashtable hashtable = new Hashtable();
        Vector vector = new Vector();
        this.f90033p0 = hashtable;
        this.f90034q0 = vector;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (ASN1Encodable) this.f90033p0.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.f90034q0.elements();
    }

    public void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object object = objectInputStream.readObject();
        if (object instanceof Hashtable) {
            this.f90033p0 = (Hashtable) object;
            this.f90034q0 = (Vector) objectInputStream.readObject();
        } else {
            ASN1InputStream aSN1InputStream = new ASN1InputStream((byte[]) object);
            while (true) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1InputStream.readObject();
                if (aSN1ObjectIdentifier == null) {
                    return;
                } else {
                    setBagAttribute(aSN1ObjectIdentifier, aSN1InputStream.readObject());
                }
            }
        }
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        if (this.f90033p0.containsKey(aSN1ObjectIdentifier)) {
            this.f90033p0.put(aSN1ObjectIdentifier, aSN1Encodable);
        } else {
            this.f90033p0.put(aSN1ObjectIdentifier, aSN1Encodable);
            this.f90034q0.addElement(aSN1ObjectIdentifier);
        }
    }

    public void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.f90034q0.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(bagAttributeKeys.nextElement());
            aSN1OutputStreamCreate.writeObject((ASN1Primitive) aSN1ObjectIdentifier);
            aSN1OutputStreamCreate.writeObject((ASN1Encodable) this.f90033p0.get(aSN1ObjectIdentifier));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }
}

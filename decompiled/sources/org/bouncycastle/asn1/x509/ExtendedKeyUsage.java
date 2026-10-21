package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ExtendedKeyUsage extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Hashtable f87616p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87617q0;

    public ExtendedKeyUsage(Vector vector) {
        this.f87616p0 = new Hashtable();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(vector.size());
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            KeyPurposeId keyPurposeId = KeyPurposeId.getInstance(enumerationElements.nextElement());
            aSN1EncodableVector.add(keyPurposeId);
            this.f87616p0.put(keyPurposeId, keyPurposeId);
        }
        this.f87617q0 = new DERSequence(aSN1EncodableVector);
    }

    public static ExtendedKeyUsage fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.extendedKeyUsage));
    }

    public static ExtendedKeyUsage getInstance(Object obj) {
        if (obj instanceof ExtendedKeyUsage) {
            return (ExtendedKeyUsage) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ExtendedKeyUsage extendedKeyUsage = new ExtendedKeyUsage();
        extendedKeyUsage.f87616p0 = new Hashtable();
        extendedKeyUsage.f87617q0 = aSN1Sequence;
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
            if (!(aSN1Encodable.toASN1Primitive() instanceof ASN1ObjectIdentifier)) {
                throw new IllegalArgumentException("Only ASN1ObjectIdentifiers allowed in ExtendedKeyUsage.");
            }
            extendedKeyUsage.f87616p0.put(aSN1Encodable, aSN1Encodable);
        }
        return extendedKeyUsage;
    }

    public KeyPurposeId[] getUsages() {
        ASN1Sequence aSN1Sequence = this.f87617q0;
        KeyPurposeId[] keyPurposeIdArr = new KeyPurposeId[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            keyPurposeIdArr[i10] = KeyPurposeId.getInstance(objects.nextElement());
            i10++;
        }
        return keyPurposeIdArr;
    }

    public boolean hasKeyPurposeId(KeyPurposeId keyPurposeId) {
        return this.f87616p0.get(keyPurposeId) != null;
    }

    public int size() {
        return this.f87616p0.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87617q0;
    }

    public ExtendedKeyUsage(KeyPurposeId keyPurposeId) {
        Hashtable hashtable = new Hashtable();
        this.f87616p0 = hashtable;
        this.f87617q0 = new DERSequence(keyPurposeId);
        hashtable.put(keyPurposeId, keyPurposeId);
    }

    public static ExtendedKeyUsage getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public ExtendedKeyUsage(KeyPurposeId[] keyPurposeIdArr) {
        this.f87616p0 = new Hashtable();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(keyPurposeIdArr.length);
        for (int i10 = 0; i10 != keyPurposeIdArr.length; i10++) {
            aSN1EncodableVector.add(keyPurposeIdArr[i10]);
            Hashtable hashtable = this.f87616p0;
            KeyPurposeId keyPurposeId = keyPurposeIdArr[i10];
            hashtable.put(keyPurposeId, keyPurposeId);
        }
        this.f87617q0 = new DERSequence(aSN1EncodableVector);
    }
}

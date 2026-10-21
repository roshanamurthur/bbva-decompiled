package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class SubjectDirectoryAttributes extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Vector f87686p0 = new Vector();

    public SubjectDirectoryAttributes(Vector vector) {
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            this.f87686p0.addElement(enumerationElements.nextElement());
        }
    }

    public static SubjectDirectoryAttributes getInstance(Object obj) {
        if (obj instanceof SubjectDirectoryAttributes) {
            return (SubjectDirectoryAttributes) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SubjectDirectoryAttributes subjectDirectoryAttributes = new SubjectDirectoryAttributes();
        subjectDirectoryAttributes.f87686p0 = new Vector();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            subjectDirectoryAttributes.f87686p0.addElement(Attribute.getInstance(ASN1Sequence.getInstance(objects.nextElement())));
        }
        return subjectDirectoryAttributes;
    }

    public Vector getAttributes() {
        return this.f87686p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        Vector vector = this.f87686p0;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(vector.size());
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            aSN1EncodableVector.add((Attribute) enumerationElements.nextElement());
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

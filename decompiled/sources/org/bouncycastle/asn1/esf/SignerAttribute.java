package org.bouncycastle.asn1.esf;

import androidx.camera.core.impl.utils.b;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.AttributeCertificate;

/* JADX INFO: loaded from: classes12.dex */
public class SignerAttribute extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Object[] f87236p0;

    public SignerAttribute(AttributeCertificate attributeCertificate) {
        this.f87236p0 = new Object[]{attributeCertificate};
    }

    public static SignerAttribute getInstance(Object obj) {
        if (obj instanceof SignerAttribute) {
            return (SignerAttribute) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SignerAttribute signerAttribute = new SignerAttribute();
        signerAttribute.f87236p0 = new Object[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            Object[] objArr = signerAttribute.f87236p0;
            if (tagNo == 0) {
                ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1TaggedObject, true);
                int size = aSN1Sequence2.size();
                Attribute[] attributeArr = new Attribute[size];
                for (int i11 = 0; i11 != size; i11++) {
                    attributeArr[i11] = Attribute.getInstance(aSN1Sequence2.getObjectAt(i11));
                }
                objArr[i10] = attributeArr;
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("illegal tag: ")));
                }
                objArr[i10] = AttributeCertificate.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
            }
            i10++;
        }
        return signerAttribute;
    }

    public Object[] getValues() {
        Object[] objArr = this.f87236p0;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        Object[] objArr = this.f87236p0;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(objArr.length);
        for (int i10 = 0; i10 != objArr.length; i10++) {
            Object obj = objArr[i10];
            aSN1EncodableVector.add(obj instanceof Attribute[] ? new DERTaggedObject(0, new DERSequence((Attribute[]) obj)) : new DERTaggedObject(1, (AttributeCertificate) obj));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SignerAttribute(Attribute[] attributeArr) {
        this.f87236p0 = new Object[]{attributeArr};
    }
}

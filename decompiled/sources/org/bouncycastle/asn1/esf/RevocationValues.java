package org.bouncycastle.asn1.esf;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes12.dex */
public class RevocationValues extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87222p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87223q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public OtherRevVals f87224r0;

    public RevocationValues(CertificateList[] certificateListArr, BasicOCSPResponse[] basicOCSPResponseArr, OtherRevVals otherRevVals) {
        if (certificateListArr != null) {
            this.f87222p0 = new DERSequence(certificateListArr);
        }
        if (basicOCSPResponseArr != null) {
            this.f87223q0 = new DERSequence(basicOCSPResponseArr);
        }
        this.f87224r0 = otherRevVals;
    }

    public static RevocationValues getInstance(Object obj) {
        if (obj instanceof RevocationValues) {
            return (RevocationValues) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RevocationValues revocationValues = new RevocationValues();
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1TaggedObject.getObject();
                Enumeration objects2 = aSN1Sequence2.getObjects();
                while (objects2.hasMoreElements()) {
                    CertificateList.getInstance(objects2.nextElement());
                }
                revocationValues.f87222p0 = aSN1Sequence2;
            } else if (tagNo == 1) {
                ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1TaggedObject.getObject();
                Enumeration objects3 = aSN1Sequence3.getObjects();
                while (objects3.hasMoreElements()) {
                    BasicOCSPResponse.getInstance(objects3.nextElement());
                }
                revocationValues.f87223q0 = aSN1Sequence3;
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("invalid tag: ")));
                }
                revocationValues.f87224r0 = OtherRevVals.getInstance(aSN1TaggedObject.getObject());
            }
        }
        return revocationValues;
    }

    public CertificateList[] getCrlVals() {
        ASN1Sequence aSN1Sequence = this.f87222p0;
        if (aSN1Sequence == null) {
            return new CertificateList[0];
        }
        int size = aSN1Sequence.size();
        CertificateList[] certificateListArr = new CertificateList[size];
        for (int i10 = 0; i10 < size; i10++) {
            certificateListArr[i10] = CertificateList.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certificateListArr;
    }

    public BasicOCSPResponse[] getOcspVals() {
        ASN1Sequence aSN1Sequence = this.f87223q0;
        if (aSN1Sequence == null) {
            return new BasicOCSPResponse[0];
        }
        int size = aSN1Sequence.size();
        BasicOCSPResponse[] basicOCSPResponseArr = new BasicOCSPResponse[size];
        for (int i10 = 0; i10 < size; i10++) {
            basicOCSPResponseArr[i10] = BasicOCSPResponse.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return basicOCSPResponseArr;
    }

    public OtherRevVals getOtherRevVals() {
        return this.f87224r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        ASN1Sequence aSN1Sequence = this.f87222p0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Sequence));
        }
        ASN1Sequence aSN1Sequence2 = this.f87223q0;
        if (aSN1Sequence2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, aSN1Sequence2));
        }
        OtherRevVals otherRevVals = this.f87224r0;
        if (otherRevVals != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, otherRevVals.toASN1Primitive()));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

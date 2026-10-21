package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class PKIMessage extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public PKIHeader f86807p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public PKIBody f86808q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DERBitString f86809r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Sequence f86810s0;

    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody) {
        this(pKIHeader, pKIBody, null, null);
    }

    public static PKIMessage getInstance(Object obj) {
        if (obj instanceof PKIMessage) {
            return (PKIMessage) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PKIMessage pKIMessage = new PKIMessage();
        Enumeration objects = aSN1Sequence.getObjects();
        pKIMessage.f86807p0 = PKIHeader.getInstance(objects.nextElement());
        pKIMessage.f86808q0 = PKIBody.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            if (aSN1TaggedObject.getTagNo() == 0) {
                pKIMessage.f86809r0 = DERBitString.getInstance(aSN1TaggedObject, true);
            } else {
                pKIMessage.f86810s0 = ASN1Sequence.getInstance(aSN1TaggedObject, true);
            }
        }
        return pKIMessage;
    }

    public PKIBody getBody() {
        return this.f86808q0;
    }

    public CMPCertificate[] getExtraCerts() {
        ASN1Sequence aSN1Sequence = this.f86810s0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        CMPCertificate[] cMPCertificateArr = new CMPCertificate[size];
        for (int i10 = 0; i10 < size; i10++) {
            cMPCertificateArr[i10] = CMPCertificate.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return cMPCertificateArr;
    }

    public PKIHeader getHeader() {
        return this.f86807p0;
    }

    public DERBitString getProtection() {
        return this.f86809r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86807p0);
        aSN1EncodableVector.add(this.f86808q0);
        DERBitString dERBitString = this.f86809r0;
        if (dERBitString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, dERBitString));
        }
        ASN1Sequence aSN1Sequence = this.f86810s0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, aSN1Sequence));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody, DERBitString dERBitString) {
        this(pKIHeader, pKIBody, dERBitString, null);
    }

    public PKIMessage(PKIHeader pKIHeader, PKIBody pKIBody, DERBitString dERBitString, CMPCertificate[] cMPCertificateArr) {
        this.f86807p0 = pKIHeader;
        this.f86808q0 = pKIBody;
        this.f86809r0 = dERBitString;
        if (cMPCertificateArr != null) {
            this.f86810s0 = new DERSequence(cMPCertificateArr);
        }
    }
}

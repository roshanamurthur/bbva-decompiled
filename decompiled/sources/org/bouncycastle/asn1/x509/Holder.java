package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class Holder extends ASN1Object {
    public static final int V1_CERTIFICATE_HOLDER = 0;
    public static final int V2_CERTIFICATE_HOLDER = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public IssuerSerial f87633p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GeneralNames f87634q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ObjectDigestInfo f87635r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f87636s0;

    public Holder(GeneralNames generalNames) {
        this(generalNames, 1);
    }

    public static Holder getInstance(Object obj) {
        if (obj instanceof Holder) {
            return (Holder) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(obj);
            Holder holder = new Holder();
            holder.f87636s0 = 1;
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                holder.f87633p0 = IssuerSerial.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 1) {
                    throw new IllegalArgumentException("unknown tag in Holder");
                }
                holder.f87634q0 = GeneralNames.getInstance(aSN1TaggedObject, true);
            }
            holder.f87636s0 = 0;
            return holder;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Holder holder2 = new Holder();
        holder2.f87636s0 = 1;
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            ASN1TaggedObject aSN1TaggedObject2 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i10));
            int tagNo2 = aSN1TaggedObject2.getTagNo();
            if (tagNo2 == 0) {
                holder2.f87633p0 = IssuerSerial.getInstance(aSN1TaggedObject2, false);
            } else if (tagNo2 == 1) {
                holder2.f87634q0 = GeneralNames.getInstance(aSN1TaggedObject2, false);
            } else {
                if (tagNo2 != 2) {
                    throw new IllegalArgumentException("unknown tag in Holder");
                }
                holder2.f87635r0 = ObjectDigestInfo.getInstance(aSN1TaggedObject2, false);
            }
        }
        holder2.f87636s0 = 1;
        return holder2;
    }

    public IssuerSerial getBaseCertificateID() {
        return this.f87633p0;
    }

    public GeneralNames getEntityName() {
        return this.f87634q0;
    }

    public ObjectDigestInfo getObjectDigestInfo() {
        return this.f87635r0;
    }

    public int getVersion() {
        return this.f87636s0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        GeneralNames generalNames = this.f87634q0;
        IssuerSerial issuerSerial = this.f87633p0;
        if (this.f87636s0 != 1) {
            return generalNames != null ? new DERTaggedObject(true, 1, generalNames) : new DERTaggedObject(true, 0, issuerSerial);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        if (issuerSerial != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, issuerSerial));
        }
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, generalNames));
        }
        ObjectDigestInfo objectDigestInfo = this.f87635r0;
        if (objectDigestInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, objectDigestInfo));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Holder(GeneralNames generalNames, int i10) {
        this.f87634q0 = generalNames;
        this.f87636s0 = i10;
    }

    public Holder(IssuerSerial issuerSerial) {
        this(issuerSerial, 1);
    }

    public Holder(IssuerSerial issuerSerial, int i10) {
        this.f87633p0 = issuerSerial;
        this.f87636s0 = i10;
    }

    public Holder(ObjectDigestInfo objectDigestInfo) {
        this.f87636s0 = 1;
        this.f87635r0 = objectDigestInfo;
    }
}

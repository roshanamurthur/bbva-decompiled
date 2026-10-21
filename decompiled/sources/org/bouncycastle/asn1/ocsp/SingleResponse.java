package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes12.dex */
public class SingleResponse extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CertID f87362p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CertStatus f87363q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1GeneralizedTime f87364r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1GeneralizedTime f87365s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Extensions f87366t0;

    public SingleResponse(CertID certID, CertStatus certStatus, ASN1GeneralizedTime aSN1GeneralizedTime, ASN1GeneralizedTime aSN1GeneralizedTime2, Extensions extensions) {
        this.f87362p0 = certID;
        this.f87363q0 = certStatus;
        this.f87364r0 = aSN1GeneralizedTime;
        this.f87365s0 = aSN1GeneralizedTime2;
        this.f87366t0 = extensions;
    }

    public static SingleResponse getInstance(Object obj) {
        ASN1TaggedObject aSN1TaggedObject;
        if (obj instanceof SingleResponse) {
            return (SingleResponse) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SingleResponse singleResponse = new SingleResponse();
        singleResponse.f87362p0 = CertID.getInstance(aSN1Sequence.getObjectAt(0));
        singleResponse.f87363q0 = CertStatus.getInstance(aSN1Sequence.getObjectAt(1));
        singleResponse.f87364r0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(2));
        if (aSN1Sequence.size() <= 4) {
            if (aSN1Sequence.size() > 3) {
                aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(3);
                if (aSN1TaggedObject.getTagNo() == 0) {
                    singleResponse.f87365s0 = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, true);
                }
            }
            return singleResponse;
        }
        singleResponse.f87365s0 = ASN1GeneralizedTime.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(3), true);
        aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(4);
        singleResponse.f87366t0 = Extensions.getInstance(aSN1TaggedObject, true);
        return singleResponse;
    }

    public CertID getCertID() {
        return this.f87362p0;
    }

    public CertStatus getCertStatus() {
        return this.f87363q0;
    }

    public ASN1GeneralizedTime getNextUpdate() {
        return this.f87365s0;
    }

    public Extensions getSingleExtensions() {
        return this.f87366t0;
    }

    public ASN1GeneralizedTime getThisUpdate() {
        return this.f87364r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f87362p0);
        aSN1EncodableVector.add(this.f87363q0);
        aSN1EncodableVector.add(this.f87364r0);
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f87365s0;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1GeneralizedTime));
        }
        Extensions extensions = this.f87366t0;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SingleResponse(CertID certID, CertStatus certStatus, ASN1GeneralizedTime aSN1GeneralizedTime, ASN1GeneralizedTime aSN1GeneralizedTime2, X509Extensions x509Extensions) {
        this(certID, certStatus, aSN1GeneralizedTime, aSN1GeneralizedTime2, Extensions.getInstance(x509Extensions));
    }

    public static SingleResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

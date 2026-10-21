package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.ReasonFlags;

/* JADX INFO: loaded from: classes12.dex */
public class GetCRL extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final X500Name f86688p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GeneralName f86689q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1GeneralizedTime f86690r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ReasonFlags f86691s0;

    public GetCRL(ASN1Sequence aSN1Sequence) {
        int i10 = 1;
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 4) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86688p0 = X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1 && (aSN1Sequence.getObjectAt(1).toASN1Primitive() instanceof ASN1TaggedObject)) {
            this.f86689q0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
            i10 = 2;
        }
        if (aSN1Sequence.size() > i10 && (aSN1Sequence.getObjectAt(i10).toASN1Primitive() instanceof ASN1GeneralizedTime)) {
            this.f86690r0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(i10));
            i10++;
        }
        if (aSN1Sequence.size() <= i10 || !(aSN1Sequence.getObjectAt(i10).toASN1Primitive() instanceof DERBitString)) {
            return;
        }
        this.f86691s0 = new ReasonFlags(DERBitString.getInstance(aSN1Sequence.getObjectAt(i10)));
    }

    public static GetCRL getInstance(Object obj) {
        if (obj instanceof GetCRL) {
            return (GetCRL) obj;
        }
        if (obj != null) {
            return new GetCRL(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X500Name getIssuerName() {
        return this.f86688p0;
    }

    public ReasonFlags getReasons() {
        return this.f86691s0;
    }

    public ASN1GeneralizedTime getTime() {
        return this.f86690r0;
    }

    public GeneralName getcRLName() {
        return this.f86689q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86688p0);
        GeneralName generalName = this.f86689q0;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f86690r0;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        ReasonFlags reasonFlags = this.f86691s0;
        if (reasonFlags != null) {
            aSN1EncodableVector.add(reasonFlags);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public GetCRL(X500Name x500Name, GeneralName generalName, ASN1GeneralizedTime aSN1GeneralizedTime, ReasonFlags reasonFlags) {
        this.f86688p0 = x500Name;
        this.f86689q0 = generalName;
        this.f86690r0 = aSN1GeneralizedTime;
        this.f86691s0 = reasonFlags;
    }
}

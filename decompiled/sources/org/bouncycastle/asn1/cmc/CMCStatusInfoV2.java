package org.bouncycastle.asn1.cmc;

import af.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes12.dex */
public class CMCStatusInfoV2 extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CMCStatus f86657p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Sequence f86658q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DERUTF8String f86659r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final OtherStatusInfo f86660s0;

    public CMCStatusInfoV2(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        if (aSN1Sequence.size() < 2 || aSN1Sequence.size() > 4) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86657p0 = CMCStatus.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86658q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            if (aSN1Sequence.size() == 4) {
                this.f86659r0 = DERUTF8String.getInstance(aSN1Sequence.getObjectAt(2));
                objectAt = aSN1Sequence.getObjectAt(3);
            } else if (aSN1Sequence.getObjectAt(2) instanceof DERUTF8String) {
                this.f86659r0 = DERUTF8String.getInstance(aSN1Sequence.getObjectAt(2));
            } else {
                this.f86659r0 = null;
                objectAt = aSN1Sequence.getObjectAt(2);
            }
            this.f86660s0 = OtherStatusInfo.getInstance(objectAt);
            return;
        }
        this.f86659r0 = null;
        this.f86660s0 = null;
    }

    public static CMCStatusInfoV2 getInstance(Object obj) {
        if (obj instanceof CMCStatusInfoV2) {
            return (CMCStatusInfoV2) obj;
        }
        if (obj != null) {
            return new CMCStatusInfoV2(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartID[] getBodyList() {
        return c.c(this.f86658q0);
    }

    public OtherStatusInfo getOtherStatusInfo() {
        return this.f86660s0;
    }

    public DERUTF8String getStatusString() {
        return this.f86659r0;
    }

    public CMCStatus getcMCStatus() {
        return this.f86657p0;
    }

    public boolean hasOtherInfo() {
        return this.f86660s0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86657p0);
        aSN1EncodableVector.add(this.f86658q0);
        DERUTF8String dERUTF8String = this.f86659r0;
        if (dERUTF8String != null) {
            aSN1EncodableVector.add(dERUTF8String);
        }
        OtherStatusInfo otherStatusInfo = this.f86660s0;
        if (otherStatusInfo != null) {
            aSN1EncodableVector.add(otherStatusInfo);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCStatusInfoV2(CMCStatus cMCStatus, DERSequence dERSequence, DERUTF8String dERUTF8String, OtherStatusInfo otherStatusInfo) {
        this.f86657p0 = cMCStatus;
        this.f86658q0 = dERSequence;
        this.f86659r0 = dERUTF8String;
        this.f86660s0 = otherStatusInfo;
    }
}

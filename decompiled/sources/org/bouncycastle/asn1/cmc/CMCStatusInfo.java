package org.bouncycastle.asn1.cmc;

import af.c;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes12.dex */
public class CMCStatusInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CMCStatus f86647p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Sequence f86648q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DERUTF8String f86649r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final OtherInfo f86650s0;

    public static class OtherInfo extends ASN1Object implements ASN1Choice {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CMCFailInfo f86651p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final PendInfo f86652q0;

        public OtherInfo(CMCFailInfo cMCFailInfo, PendInfo pendInfo) {
            this.f86651p0 = cMCFailInfo;
            this.f86652q0 = pendInfo;
        }

        public static OtherInfo a(ASN1Encodable aSN1Encodable) {
            if (aSN1Encodable instanceof OtherInfo) {
                return (OtherInfo) aSN1Encodable;
            }
            if (aSN1Encodable instanceof ASN1Encodable) {
                ASN1Primitive aSN1Primitive = aSN1Encodable.toASN1Primitive();
                if (aSN1Primitive instanceof ASN1Integer) {
                    return new OtherInfo(CMCFailInfo.getInstance(aSN1Primitive), null);
                }
                if (aSN1Primitive instanceof ASN1Sequence) {
                    return new OtherInfo(null, PendInfo.getInstance(aSN1Primitive));
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance(): ".concat(aSN1Encodable.getClass().getName()));
        }

        public boolean isFailInfo() {
            return this.f86651p0 != null;
        }

        @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
        public ASN1Primitive toASN1Primitive() {
            PendInfo pendInfo = this.f86652q0;
            return pendInfo != null ? pendInfo.toASN1Primitive() : this.f86651p0.toASN1Primitive();
        }
    }

    public CMCStatusInfo(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        if (aSN1Sequence.size() < 2 || aSN1Sequence.size() > 4) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86647p0 = CMCStatus.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86648q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() <= 3) {
            if (aSN1Sequence.size() <= 2) {
                this.f86649r0 = null;
            } else if (aSN1Sequence.getObjectAt(2) instanceof DERUTF8String) {
                this.f86649r0 = DERUTF8String.getInstance(aSN1Sequence.getObjectAt(2));
            } else {
                this.f86649r0 = null;
                objectAt = aSN1Sequence.getObjectAt(2);
            }
            this.f86650s0 = null;
            return;
        }
        this.f86649r0 = DERUTF8String.getInstance(aSN1Sequence.getObjectAt(2));
        objectAt = aSN1Sequence.getObjectAt(3);
        this.f86650s0 = OtherInfo.a(objectAt);
    }

    public static CMCStatusInfo getInstance(Object obj) {
        if (obj instanceof CMCStatusInfo) {
            return (CMCStatusInfo) obj;
        }
        if (obj != null) {
            return new CMCStatusInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartID[] getBodyList() {
        return c.c(this.f86648q0);
    }

    public CMCStatus getCMCStatus() {
        return this.f86647p0;
    }

    public OtherInfo getOtherInfo() {
        return this.f86650s0;
    }

    public DERUTF8String getStatusString() {
        return this.f86649r0;
    }

    public boolean hasOtherInfo() {
        return this.f86650s0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86647p0);
        aSN1EncodableVector.add(this.f86648q0);
        DERUTF8String dERUTF8String = this.f86649r0;
        if (dERUTF8String != null) {
            aSN1EncodableVector.add(dERUTF8String);
        }
        OtherInfo otherInfo = this.f86650s0;
        if (otherInfo != null) {
            aSN1EncodableVector.add(otherInfo);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCStatusInfo(CMCStatus cMCStatus, DERSequence dERSequence, DERUTF8String dERUTF8String, OtherInfo otherInfo) {
        this.f86647p0 = cMCStatus;
        this.f86648q0 = dERSequence;
        this.f86649r0 = dERUTF8String;
        this.f86650s0 = otherInfo;
    }
}

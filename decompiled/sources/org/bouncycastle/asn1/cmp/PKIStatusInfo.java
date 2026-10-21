package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PKIStatusInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86813p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public PKIFreeText f86814q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DERBitString f86815r0;

    public PKIStatusInfo(PKIStatus pKIStatus) {
        this.f86813p0 = ASN1Integer.getInstance(pKIStatus.toASN1Primitive());
    }

    public static PKIStatusInfo getInstance(Object obj) {
        ASN1Encodable objectAt;
        if (obj instanceof PKIStatusInfo) {
            return (PKIStatusInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PKIStatusInfo pKIStatusInfo = new PKIStatusInfo();
        pKIStatusInfo.f86813p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        pKIStatusInfo.f86814q0 = null;
        pKIStatusInfo.f86815r0 = null;
        if (aSN1Sequence.size() <= 2) {
            if (aSN1Sequence.size() > 1) {
                objectAt = aSN1Sequence.getObjectAt(1);
                if (!(objectAt instanceof DERBitString)) {
                    pKIStatusInfo.f86814q0 = PKIFreeText.getInstance(objectAt);
                }
            }
            return pKIStatusInfo;
        }
        pKIStatusInfo.f86814q0 = PKIFreeText.getInstance(aSN1Sequence.getObjectAt(1));
        objectAt = aSN1Sequence.getObjectAt(2);
        pKIStatusInfo.f86815r0 = DERBitString.getInstance(objectAt);
        return pKIStatusInfo;
    }

    public DERBitString getFailInfo() {
        return this.f86815r0;
    }

    public BigInteger getStatus() {
        return this.f86813p0.getValue();
    }

    public PKIFreeText getStatusString() {
        return this.f86814q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86813p0);
        PKIFreeText pKIFreeText = this.f86814q0;
        if (pKIFreeText != null) {
            aSN1EncodableVector.add(pKIFreeText);
        }
        DERBitString dERBitString = this.f86815r0;
        if (dERBitString != null) {
            aSN1EncodableVector.add(dERBitString);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public PKIStatusInfo(PKIStatus pKIStatus, PKIFreeText pKIFreeText) {
        this.f86813p0 = ASN1Integer.getInstance(pKIStatus.toASN1Primitive());
        this.f86814q0 = pKIFreeText;
    }

    public static PKIStatusInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public PKIStatusInfo(PKIStatus pKIStatus, PKIFreeText pKIFreeText, PKIFailureInfo pKIFailureInfo) {
        this.f86813p0 = ASN1Integer.getInstance(pKIStatus.toASN1Primitive());
        this.f86814q0 = pKIFreeText;
        this.f86815r0 = pKIFailureInfo;
    }
}

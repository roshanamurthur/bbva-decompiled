package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CertResponse extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86751p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public PKIStatusInfo f86752q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CertifiedKeyPair f86753r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1OctetString f86754s0;

    public CertResponse(ASN1Integer aSN1Integer, PKIStatusInfo pKIStatusInfo) {
        this(aSN1Integer, pKIStatusInfo, null, null);
    }

    public static CertResponse getInstance(Object obj) {
        ASN1Encodable objectAt;
        if (obj instanceof CertResponse) {
            return (CertResponse) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertResponse certResponse = new CertResponse();
        certResponse.f86751p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        certResponse.f86752q0 = PKIStatusInfo.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() >= 3) {
            if (aSN1Sequence.size() == 3) {
                objectAt = aSN1Sequence.getObjectAt(2);
                if (!(objectAt instanceof ASN1OctetString)) {
                    certResponse.f86753r0 = CertifiedKeyPair.getInstance(objectAt);
                }
            } else {
                certResponse.f86753r0 = CertifiedKeyPair.getInstance(aSN1Sequence.getObjectAt(2));
                objectAt = aSN1Sequence.getObjectAt(3);
            }
            certResponse.f86754s0 = ASN1OctetString.getInstance(objectAt);
        }
        return certResponse;
    }

    public ASN1Integer getCertReqId() {
        return this.f86751p0;
    }

    public CertifiedKeyPair getCertifiedKeyPair() {
        return this.f86753r0;
    }

    public PKIStatusInfo getStatus() {
        return this.f86752q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86751p0);
        aSN1EncodableVector.add(this.f86752q0);
        CertifiedKeyPair certifiedKeyPair = this.f86753r0;
        if (certifiedKeyPair != null) {
            aSN1EncodableVector.add(certifiedKeyPair);
        }
        ASN1OctetString aSN1OctetString = this.f86754s0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertResponse(ASN1Integer aSN1Integer, PKIStatusInfo pKIStatusInfo, CertifiedKeyPair certifiedKeyPair, ASN1OctetString aSN1OctetString) {
        if (aSN1Integer == null) {
            throw new IllegalArgumentException("'certReqId' cannot be null");
        }
        if (pKIStatusInfo == null) {
            throw new IllegalArgumentException("'status' cannot be null");
        }
        this.f86751p0 = aSN1Integer;
        this.f86752q0 = pKIStatusInfo;
        this.f86753r0 = certifiedKeyPair;
        this.f86754s0 = aSN1OctetString;
    }
}

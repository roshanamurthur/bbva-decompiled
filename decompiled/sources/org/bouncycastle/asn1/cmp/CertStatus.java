package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CertStatus extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1OctetString f86755p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f86756q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PKIStatusInfo f86757r0;

    public CertStatus(byte[] bArr, BigInteger bigInteger) {
        this.f86755p0 = new DEROctetString(bArr);
        this.f86756q0 = new ASN1Integer(bigInteger);
    }

    public static CertStatus getInstance(Object obj) {
        if (obj instanceof CertStatus) {
            return (CertStatus) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CertStatus certStatus = new CertStatus();
        certStatus.f86755p0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        certStatus.f86756q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            certStatus.f86757r0 = PKIStatusInfo.getInstance(aSN1Sequence.getObjectAt(2));
        }
        return certStatus;
    }

    public ASN1OctetString getCertHash() {
        return this.f86755p0;
    }

    public ASN1Integer getCertReqId() {
        return this.f86756q0;
    }

    public PKIStatusInfo getStatusInfo() {
        return this.f86757r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86755p0);
        aSN1EncodableVector.add(this.f86756q0);
        PKIStatusInfo pKIStatusInfo = this.f86757r0;
        if (pKIStatusInfo != null) {
            aSN1EncodableVector.add(pKIStatusInfo);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CertStatus(byte[] bArr, BigInteger bigInteger, PKIStatusInfo pKIStatusInfo) {
        this.f86755p0 = new DEROctetString(bArr);
        this.f86756q0 = new ASN1Integer(bigInteger);
        this.f86757r0 = pKIStatusInfo;
    }
}

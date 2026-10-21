package org.bouncycastle.asn1.ess;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.IssuerSerial;

/* JADX INFO: loaded from: classes12.dex */
public class ESSCertID extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1OctetString f87243p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public IssuerSerial f87244q0;

    public ESSCertID(byte[] bArr) {
        this.f87243p0 = new DEROctetString(bArr);
    }

    public static ESSCertID getInstance(Object obj) {
        if (obj instanceof ESSCertID) {
            return (ESSCertID) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ESSCertID eSSCertID = new ESSCertID();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        eSSCertID.f87243p0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            eSSCertID.f87244q0 = IssuerSerial.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return eSSCertID;
    }

    public byte[] getCertHash() {
        return this.f87243p0.getOctets();
    }

    public IssuerSerial getIssuerSerial() {
        return this.f87244q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87243p0);
        IssuerSerial issuerSerial = this.f87244q0;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(issuerSerial);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ESSCertID(byte[] bArr, IssuerSerial issuerSerial) {
        this.f87243p0 = new DEROctetString(bArr);
        this.f87244q0 = issuerSerial;
    }
}

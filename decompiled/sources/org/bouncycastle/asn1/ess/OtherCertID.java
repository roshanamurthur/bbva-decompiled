package org.bouncycastle.asn1.ess;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.IssuerSerial;

/* JADX INFO: loaded from: classes12.dex */
public class OtherCertID extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Object f87249p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public IssuerSerial f87250q0;

    public OtherCertID(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f87249p0 = new DigestInfo(algorithmIdentifier, bArr);
    }

    public static OtherCertID getInstance(Object obj) {
        if (obj instanceof OtherCertID) {
            return (OtherCertID) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OtherCertID otherCertID = new OtherCertID();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        boolean z10 = aSN1Sequence.getObjectAt(0).toASN1Primitive() instanceof ASN1OctetString;
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        otherCertID.f87249p0 = z10 ? ASN1OctetString.getInstance(objectAt) : DigestInfo.getInstance(objectAt);
        if (aSN1Sequence.size() > 1) {
            otherCertID.f87250q0 = IssuerSerial.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return otherCertID;
    }

    public AlgorithmIdentifier getAlgorithmHash() {
        ASN1Object aSN1Object = this.f87249p0;
        return aSN1Object.toASN1Primitive() instanceof ASN1OctetString ? new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1) : DigestInfo.getInstance(aSN1Object).getAlgorithmId();
    }

    public byte[] getCertHash() {
        ASN1Object aSN1Object = this.f87249p0;
        return aSN1Object.toASN1Primitive() instanceof ASN1OctetString ? ((ASN1OctetString) aSN1Object.toASN1Primitive()).getOctets() : DigestInfo.getInstance(aSN1Object).getDigest();
    }

    public IssuerSerial getIssuerSerial() {
        return this.f87250q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87249p0);
        IssuerSerial issuerSerial = this.f87250q0;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(issuerSerial);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public OtherCertID(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, IssuerSerial issuerSerial) {
        this.f87249p0 = new DigestInfo(algorithmIdentifier, bArr);
        this.f87250q0 = issuerSerial;
    }
}

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class DhSigStatic extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final IssuerAndSerialNumber f87030p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1OctetString f87031q0;

    public DhSigStatic(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        if (aSN1Sequence.size() == 1) {
            this.f87030p0 = null;
            objectAt = aSN1Sequence.getObjectAt(0);
        } else {
            if (aSN1Sequence.size() != 2) {
                throw new IllegalArgumentException("sequence wrong length for DhSigStatic");
            }
            this.f87030p0 = IssuerAndSerialNumber.getInstance(aSN1Sequence.getObjectAt(0));
            objectAt = aSN1Sequence.getObjectAt(1);
        }
        this.f87031q0 = ASN1OctetString.getInstance(objectAt);
    }

    public static DhSigStatic getInstance(Object obj) {
        if (obj instanceof DhSigStatic) {
            return (DhSigStatic) obj;
        }
        if (obj != null) {
            return new DhSigStatic(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHashValue() {
        return Arrays.clone(this.f87031q0.getOctets());
    }

    public IssuerAndSerialNumber getIssuerAndSerial() {
        return this.f87030p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        IssuerAndSerialNumber issuerAndSerialNumber = this.f87030p0;
        if (issuerAndSerialNumber != null) {
            aSN1EncodableVector.add(issuerAndSerialNumber);
        }
        aSN1EncodableVector.add(this.f87031q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public DhSigStatic(IssuerAndSerialNumber issuerAndSerialNumber, byte[] bArr) {
        this.f87030p0 = issuerAndSerialNumber;
        this.f87031q0 = new DEROctetString(Arrays.clone(bArr));
    }

    public DhSigStatic(byte[] bArr) {
        this(null, bArr);
    }
}

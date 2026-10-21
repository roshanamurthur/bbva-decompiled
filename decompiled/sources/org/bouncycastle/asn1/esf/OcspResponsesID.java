package org.bouncycastle.asn1.esf;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class OcspResponsesID extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public OcspIdentifier f87212p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OtherHash f87213q0;

    public OcspResponsesID(OcspIdentifier ocspIdentifier) {
        this(ocspIdentifier, null);
    }

    public static OcspResponsesID getInstance(Object obj) {
        if (obj instanceof OcspResponsesID) {
            return (OcspResponsesID) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OcspResponsesID ocspResponsesID = new OcspResponsesID();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        ocspResponsesID.f87212p0 = OcspIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            ocspResponsesID.f87213q0 = OtherHash.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return ocspResponsesID;
    }

    public OcspIdentifier getOcspIdentifier() {
        return this.f87212p0;
    }

    public OtherHash getOcspRepHash() {
        return this.f87213q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87212p0);
        OtherHash otherHash = this.f87213q0;
        if (otherHash != null) {
            aSN1EncodableVector.add(otherHash);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public OcspResponsesID(OcspIdentifier ocspIdentifier, OtherHash otherHash) {
        this.f87212p0 = ocspIdentifier;
        this.f87213q0 = otherHash;
    }
}

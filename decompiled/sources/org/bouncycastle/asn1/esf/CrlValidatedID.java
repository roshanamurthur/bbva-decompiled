package org.bouncycastle.asn1.esf;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CrlValidatedID extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public OtherHash f87207p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CrlIdentifier f87208q0;

    public CrlValidatedID(OtherHash otherHash) {
        this(otherHash, null);
    }

    public static CrlValidatedID getInstance(Object obj) {
        if (obj instanceof CrlValidatedID) {
            return (CrlValidatedID) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CrlValidatedID crlValidatedID = new CrlValidatedID();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        crlValidatedID.f87207p0 = OtherHash.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            crlValidatedID.f87208q0 = CrlIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return crlValidatedID;
    }

    public OtherHash getCrlHash() {
        return this.f87207p0;
    }

    public CrlIdentifier getCrlIdentifier() {
        return this.f87208q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87207p0.toASN1Primitive());
        CrlIdentifier crlIdentifier = this.f87208q0;
        if (crlIdentifier != null) {
            aSN1EncodableVector.add(crlIdentifier.toASN1Primitive());
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CrlValidatedID(OtherHash otherHash, CrlIdentifier crlIdentifier) {
        this.f87207p0 = otherHash;
        this.f87208q0 = crlIdentifier;
    }
}

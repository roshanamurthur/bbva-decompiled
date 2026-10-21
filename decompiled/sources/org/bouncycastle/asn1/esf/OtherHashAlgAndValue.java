package org.bouncycastle.asn1.esf;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class OtherHashAlgAndValue extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87216p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87217q0;

    public OtherHashAlgAndValue(AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
        this.f87216p0 = algorithmIdentifier;
        this.f87217q0 = aSN1OctetString;
    }

    public static OtherHashAlgAndValue getInstance(Object obj) {
        if (obj instanceof OtherHashAlgAndValue) {
            return (OtherHashAlgAndValue) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OtherHashAlgAndValue otherHashAlgAndValue = new OtherHashAlgAndValue();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        otherHashAlgAndValue.f87216p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        otherHashAlgAndValue.f87217q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        return otherHashAlgAndValue;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.f87216p0;
    }

    public ASN1OctetString getHashValue() {
        return this.f87217q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87216p0);
        aSN1EncodableVector.add(this.f87217q0);
        return new DERSequence(aSN1EncodableVector);
    }
}

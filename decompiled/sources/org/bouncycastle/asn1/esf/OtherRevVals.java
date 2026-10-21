package org.bouncycastle.asn1.esf;

import androidx.databinding.c;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class OtherRevVals extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87220p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87221q0;

    public OtherRevVals(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87220p0 = aSN1ObjectIdentifier;
        this.f87221q0 = aSN1Encodable;
    }

    public static OtherRevVals getInstance(Object obj) {
        if (obj instanceof OtherRevVals) {
            return (OtherRevVals) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OtherRevVals otherRevVals = new OtherRevVals();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        otherRevVals.f87220p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        try {
            otherRevVals.f87221q0 = ASN1Primitive.fromByteArray(aSN1Sequence.getObjectAt(1).toASN1Primitive().getEncoded(ASN1Encoding.DER));
            return otherRevVals;
        } catch (IOException unused) {
            throw new IllegalStateException();
        }
    }

    public ASN1ObjectIdentifier getOtherRevValType() {
        return this.f87220p0;
    }

    public ASN1Encodable getOtherRevVals() {
        return this.f87221q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87220p0);
        aSN1EncodableVector.add(this.f87221q0);
        return new DERSequence(aSN1EncodableVector);
    }
}

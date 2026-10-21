package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class InfoTypeAndValue extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f86769p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f86770q0;

    public InfoTypeAndValue(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f86769p0 = aSN1ObjectIdentifier;
        this.f86770q0 = null;
    }

    public static InfoTypeAndValue getInstance(Object obj) {
        if (obj instanceof InfoTypeAndValue) {
            return (InfoTypeAndValue) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        InfoTypeAndValue infoTypeAndValue = new InfoTypeAndValue();
        infoTypeAndValue.f86769p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            infoTypeAndValue.f86770q0 = aSN1Sequence.getObjectAt(1);
        }
        return infoTypeAndValue;
    }

    public ASN1ObjectIdentifier getInfoType() {
        return this.f86769p0;
    }

    public ASN1Encodable getInfoValue() {
        return this.f86770q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86769p0);
        ASN1Encodable aSN1Encodable = this.f86770q0;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public InfoTypeAndValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f86769p0 = aSN1ObjectIdentifier;
        this.f86770q0 = aSN1Encodable;
    }
}

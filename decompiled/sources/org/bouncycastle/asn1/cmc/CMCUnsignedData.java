package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CMCUnsignedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BodyPartPath f86665p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f86666q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Encodable f86667r0;

    public CMCUnsignedData(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86665p0 = BodyPartPath.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86666q0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86667r0 = aSN1Sequence.getObjectAt(2);
    }

    public static CMCUnsignedData getInstance(Object obj) {
        if (obj instanceof CMCUnsignedData) {
            return (CMCUnsignedData) obj;
        }
        if (obj != null) {
            return new CMCUnsignedData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartPath getBodyPartPath() {
        return this.f86665p0;
    }

    public ASN1Encodable getContent() {
        return this.f86667r0;
    }

    public ASN1ObjectIdentifier getIdentifier() {
        return this.f86666q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86665p0);
        aSN1EncodableVector.add(this.f86666q0);
        aSN1EncodableVector.add(this.f86667r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCUnsignedData(BodyPartPath bodyPartPath, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f86665p0 = bodyPartPath;
        this.f86666q0 = aSN1ObjectIdentifier;
        this.f86667r0 = aSN1Encodable;
    }
}

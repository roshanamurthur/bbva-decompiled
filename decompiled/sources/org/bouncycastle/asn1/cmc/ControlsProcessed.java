package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ControlsProcessed extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Sequence f86676p0;

    public ControlsProcessed(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86676p0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
    }

    public static ControlsProcessed getInstance(Object obj) {
        if (obj instanceof ControlsProcessed) {
            return (ControlsProcessed) obj;
        }
        if (obj != null) {
            return new ControlsProcessed(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartReference[] getBodyList() {
        ASN1Sequence aSN1Sequence = this.f86676p0;
        BodyPartReference[] bodyPartReferenceArr = new BodyPartReference[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            bodyPartReferenceArr[i10] = BodyPartReference.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return bodyPartReferenceArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f86676p0);
    }

    public ControlsProcessed(BodyPartReference bodyPartReference) {
        this.f86676p0 = new DERSequence(bodyPartReference);
    }

    public ControlsProcessed(BodyPartReference[] bodyPartReferenceArr) {
        this.f86676p0 = new DERSequence(bodyPartReferenceArr);
    }
}

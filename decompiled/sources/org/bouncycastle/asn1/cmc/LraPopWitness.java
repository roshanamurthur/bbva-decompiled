package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class LraPopWitness extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BodyPartID f86697p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Sequence f86698q0;

    public LraPopWitness(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86697p0 = BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86698q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static LraPopWitness getInstance(Object obj) {
        if (obj instanceof LraPopWitness) {
            return (LraPopWitness) obj;
        }
        if (obj != null) {
            return new LraPopWitness(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartID[] getBodyIds() {
        ASN1Sequence aSN1Sequence = this.f86698q0;
        BodyPartID[] bodyPartIDArr = new BodyPartID[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            bodyPartIDArr[i10] = BodyPartID.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return bodyPartIDArr;
    }

    public BodyPartID getPkiDataBodyid() {
        return this.f86697p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86697p0);
        aSN1EncodableVector.add(this.f86698q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public LraPopWitness(BodyPartID bodyPartID, ASN1Sequence aSN1Sequence) {
        this.f86697p0 = bodyPartID;
        this.f86698q0 = aSN1Sequence;
    }
}

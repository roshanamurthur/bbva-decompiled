package org.bouncycastle.asn1.cmc;

import af.c;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class BodyPartList extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BodyPartID[] f86636p0;

    public BodyPartList(ASN1Sequence aSN1Sequence) {
        this.f86636p0 = c.c(aSN1Sequence);
    }

    public static BodyPartList getInstance(Object obj) {
        if (obj instanceof BodyPartList) {
            return (BodyPartList) obj;
        }
        if (obj != null) {
            return new BodyPartList(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartID[] getBodyPartIDs() {
        BodyPartID[] bodyPartIDArr = this.f86636p0;
        BodyPartID[] bodyPartIDArr2 = new BodyPartID[bodyPartIDArr.length];
        System.arraycopy(bodyPartIDArr, 0, bodyPartIDArr2, 0, bodyPartIDArr.length);
        return bodyPartIDArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f86636p0);
    }

    public BodyPartList(BodyPartID bodyPartID) {
        this.f86636p0 = new BodyPartID[]{bodyPartID};
    }

    public static BodyPartList getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public BodyPartList(BodyPartID[] bodyPartIDArr) {
        BodyPartID[] bodyPartIDArr2 = new BodyPartID[bodyPartIDArr.length];
        System.arraycopy(bodyPartIDArr, 0, bodyPartIDArr2, 0, bodyPartIDArr.length);
        this.f86636p0 = bodyPartIDArr2;
    }
}

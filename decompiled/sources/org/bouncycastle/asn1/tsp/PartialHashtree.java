package org.bouncycastle.asn1.tsp;

import androidx.camera.core.impl.utils.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class PartialHashtree extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87498p0;

    public PartialHashtree(byte[] bArr) {
        this(new byte[][]{bArr});
    }

    public static PartialHashtree getInstance(Object obj) {
        if (obj instanceof PartialHashtree) {
            return (PartialHashtree) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PartialHashtree partialHashtree = new PartialHashtree();
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            if (!(aSN1Sequence.getObjectAt(i10) instanceof DEROctetString)) {
                throw new IllegalArgumentException("unknown object in constructor: ".concat(aSN1Sequence.getObjectAt(i10).getClass().getName()));
            }
        }
        partialHashtree.f87498p0 = aSN1Sequence;
        return partialHashtree;
    }

    public byte[][] getValues() {
        ASN1Sequence aSN1Sequence = this.f87498p0;
        int size = aSN1Sequence.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 != size; i10++) {
            bArr[i10] = a.c(aSN1Sequence, i10);
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87498p0;
    }

    public PartialHashtree(byte[][] bArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(bArr.length);
        for (int i10 = 0; i10 != bArr.length; i10++) {
            aSN1EncodableVector.add(new DEROctetString(Arrays.clone(bArr[i10])));
        }
        this.f87498p0 = new DERSequence(aSN1EncodableVector);
    }
}

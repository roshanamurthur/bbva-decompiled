package org.bouncycastle.asn1.bc;

import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Iterable;

/* JADX INFO: loaded from: classes12.dex */
public class ObjectDataSequence extends ASN1Object implements Iterable<ASN1Encodable> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Encodable[] f86614p0;

    public ObjectDataSequence(ASN1Sequence aSN1Sequence) {
        this.f86614p0 = new ASN1Encodable[aSN1Sequence.size()];
        int i10 = 0;
        while (true) {
            ASN1Encodable[] aSN1EncodableArr = this.f86614p0;
            if (i10 == aSN1EncodableArr.length) {
                return;
            }
            aSN1EncodableArr[i10] = ObjectData.getInstance(aSN1Sequence.getObjectAt(i10));
            i10++;
        }
    }

    public static ObjectDataSequence getInstance(Object obj) {
        if (obj instanceof ObjectDataSequence) {
            return (ObjectDataSequence) obj;
        }
        if (obj != null) {
            return new ObjectDataSequence(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        return new Arrays.Iterator(this.f86614p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f86614p0);
    }

    public ObjectDataSequence(ObjectData[] objectDataArr) {
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[objectDataArr.length];
        this.f86614p0 = aSN1EncodableArr;
        System.arraycopy(objectDataArr, 0, aSN1EncodableArr, 0, objectDataArr.length);
    }
}

package org.bouncycastle.pqc.asn1;

import androidx.appcompat.widget.g0;
import androidx.databinding.c;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class ParSet extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f90913p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int[] f90914q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int[] f90915r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int[] f90916s0;

    static {
        BigInteger.valueOf(0L);
    }

    public ParSet(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f90913p0 = i10;
        this.f90914q0 = iArr;
        this.f90915r0 = iArr2;
        this.f90916s0 = iArr3;
    }

    public static int a(ASN1Encodable aSN1Encodable) {
        int iIntValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (iIntValueExact > 0) {
            return iIntValueExact;
        }
        throw new IllegalArgumentException(g0.c("BigInteger not in Range: ", iIntValueExact));
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ParSet parSet = new ParSet();
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("sie of seqOfParams = ")));
        }
        int iA = a(aSN1Sequence.getObjectAt(0));
        parSet.f90913p0 = iA;
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != iA || aSN1Sequence3.size() != iA || aSN1Sequence4.size() != iA) {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        parSet.f90914q0 = new int[aSN1Sequence2.size()];
        parSet.f90915r0 = new int[aSN1Sequence3.size()];
        parSet.f90916s0 = new int[aSN1Sequence4.size()];
        for (int i10 = 0; i10 < parSet.f90913p0; i10++) {
            parSet.f90914q0[i10] = a(aSN1Sequence2.getObjectAt(i10));
            parSet.f90915r0[i10] = a(aSN1Sequence3.getObjectAt(i10));
            parSet.f90916s0[i10] = a(aSN1Sequence4.getObjectAt(i10));
        }
        return parSet;
    }

    public int[] getH() {
        return Arrays.clone(this.f90914q0);
    }

    public int[] getK() {
        return Arrays.clone(this.f90916s0);
    }

    public int getT() {
        return this.f90913p0;
    }

    public int[] getW() {
        return Arrays.clone(this.f90915r0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f90914q0;
            if (i10 >= iArr.length) {
                ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                aSN1EncodableVector4.add(new ASN1Integer(this.f90913p0));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
                return new DERSequence(aSN1EncodableVector4);
            }
            aSN1EncodableVector.add(new ASN1Integer(iArr[i10]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f90915r0[i10]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f90916s0[i10]));
            i10++;
        }
    }
}

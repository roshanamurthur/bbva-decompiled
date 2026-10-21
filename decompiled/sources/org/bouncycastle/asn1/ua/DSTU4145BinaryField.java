package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f87516p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f87517q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f87518r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f87519s0;

    public DSTU4145BinaryField(int i10, int i11) {
        this(i10, i11, 0, 0);
    }

    public static DSTU4145BinaryField getInstance(Object obj) {
        if (obj instanceof DSTU4145BinaryField) {
            return (DSTU4145BinaryField) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DSTU4145BinaryField dSTU4145BinaryField = new DSTU4145BinaryField();
        dSTU4145BinaryField.f87516p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intPositiveValueExact();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            dSTU4145BinaryField.f87517q0 = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intPositiveValueExact();
        } else {
            if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
                throw new IllegalArgumentException("object parse error");
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            dSTU4145BinaryField.f87517q0 = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).intPositiveValueExact();
            dSTU4145BinaryField.f87518r0 = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).intPositiveValueExact();
            dSTU4145BinaryField.f87519s0 = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).intPositiveValueExact();
        }
        return dSTU4145BinaryField;
    }

    public int getK1() {
        return this.f87517q0;
    }

    public int getK2() {
        return this.f87518r0;
    }

    public int getK3() {
        return this.f87519s0;
    }

    public int getM() {
        return this.f87516p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(this.f87516p0));
        int i10 = this.f87517q0;
        int i11 = this.f87518r0;
        if (i11 == 0) {
            aSN1EncodableVector.add(new ASN1Integer(i10));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(new ASN1Integer(i10));
            aSN1EncodableVector2.add(new ASN1Integer(i11));
            aSN1EncodableVector2.add(new ASN1Integer(this.f87519s0));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i10, int i11, int i12, int i13) {
        this.f87516p0 = i10;
        this.f87517q0 = i11;
        this.f87518r0 = i12;
        this.f87519s0 = i13;
    }
}

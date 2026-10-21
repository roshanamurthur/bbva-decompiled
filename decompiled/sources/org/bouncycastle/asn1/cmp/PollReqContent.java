package org.bouncycastle.asn1.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PollReqContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Sequence f86821p0;

    public PollReqContent(BigInteger bigInteger) {
        this(new ASN1Integer(bigInteger));
    }

    public static PollReqContent getInstance(Object obj) {
        if (obj instanceof PollReqContent) {
            return (PollReqContent) obj;
        }
        if (obj != null) {
            return new PollReqContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger[] getCertReqIdValues() {
        ASN1Sequence aSN1Sequence = this.f86821p0;
        int size = aSN1Sequence.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 != size; i10++) {
            bigIntegerArr[i10] = ASN1Integer.getInstance(ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i10)).getObjectAt(0)).getValue();
        }
        return bigIntegerArr;
    }

    public ASN1Integer[][] getCertReqIds() {
        ASN1Sequence aSN1Sequence = this.f86821p0;
        int size = aSN1Sequence.size();
        ASN1Integer[][] aSN1IntegerArr = new ASN1Integer[size][];
        for (int i10 = 0; i10 != size; i10++) {
            ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(i10);
            int size2 = aSN1Sequence2.size();
            ASN1Integer[] aSN1IntegerArr2 = new ASN1Integer[size2];
            for (int i11 = 0; i11 != size2; i11++) {
                aSN1IntegerArr2[i11] = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(i11));
            }
            aSN1IntegerArr[i10] = aSN1IntegerArr2;
        }
        return aSN1IntegerArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86821p0;
    }

    public PollReqContent(ASN1Integer aSN1Integer) {
        this(new DERSequence(new DERSequence(aSN1Integer)));
    }

    public PollReqContent(ASN1Sequence aSN1Sequence) {
        this.f86821p0 = aSN1Sequence;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PollReqContent(BigInteger[] bigIntegerArr) {
        int length = bigIntegerArr.length;
        ASN1Integer[] aSN1IntegerArr = new ASN1Integer[length];
        for (int i10 = 0; i10 != length; i10++) {
            aSN1IntegerArr[i10] = new ASN1Integer(bigIntegerArr[i10]);
        }
        this(aSN1IntegerArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PollReqContent(ASN1Integer[] aSN1IntegerArr) {
        int length = aSN1IntegerArr.length;
        DERSequence[] dERSequenceArr = new DERSequence[length];
        for (int i10 = 0; i10 != length; i10++) {
            dERSequenceArr[i10] = new DERSequence(aSN1IntegerArr[i10]);
        }
        this(new DERSequence(dERSequenceArr));
    }
}

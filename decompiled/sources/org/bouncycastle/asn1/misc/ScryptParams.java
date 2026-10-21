package org.bouncycastle.asn1.misc;

import androidx.camera.core.impl.utils.a;
import androidx.databinding.c;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class ScryptParams extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f87314p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f87315q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f87316r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BigInteger f87317s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final BigInteger f87318t0;

    public ScryptParams(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4 && aSN1Sequence.size() != 5) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("invalid sequence: size = ")));
        }
        this.f87314p0 = a.c(aSN1Sequence, 0);
        this.f87315q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
        this.f87316r0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2)).getValue();
        this.f87317s0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(3)).getValue();
        this.f87318t0 = aSN1Sequence.size() == 5 ? ASN1Integer.getInstance(aSN1Sequence.getObjectAt(4)).getValue() : null;
    }

    public static ScryptParams getInstance(Object obj) {
        if (obj instanceof ScryptParams) {
            return (ScryptParams) obj;
        }
        if (obj != null) {
            return new ScryptParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getBlockSize() {
        return this.f87316r0;
    }

    public BigInteger getCostParameter() {
        return this.f87315q0;
    }

    public BigInteger getKeyLength() {
        return this.f87318t0;
    }

    public BigInteger getParallelizationParameter() {
        return this.f87317s0;
    }

    public byte[] getSalt() {
        return Arrays.clone(this.f87314p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(new DEROctetString(this.f87314p0));
        aSN1EncodableVector.add(new ASN1Integer(this.f87315q0));
        aSN1EncodableVector.add(new ASN1Integer(this.f87316r0));
        aSN1EncodableVector.add(new ASN1Integer(this.f87317s0));
        BigInteger bigInteger = this.f87318t0;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ScryptParams(byte[] bArr, int i10, int i11, int i12) {
        this(bArr, BigInteger.valueOf(i10), BigInteger.valueOf(i11), BigInteger.valueOf(i12), (BigInteger) null);
    }

    public ScryptParams(byte[] bArr, int i10, int i11, int i12, int i13) {
        this(bArr, BigInteger.valueOf(i10), BigInteger.valueOf(i11), BigInteger.valueOf(i12), BigInteger.valueOf(i13));
    }

    public ScryptParams(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f87314p0 = Arrays.clone(bArr);
        this.f87315q0 = bigInteger;
        this.f87316r0 = bigInteger2;
        this.f87317s0 = bigInteger3;
        this.f87318t0 = bigInteger4;
    }
}

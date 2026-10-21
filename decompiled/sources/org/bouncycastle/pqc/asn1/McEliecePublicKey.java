package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes13.dex */
public class McEliecePublicKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f90910p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f90911q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final GF2Matrix f90912r0;

    public McEliecePublicKey(int i10, int i11, GF2Matrix gF2Matrix) {
        this.f90910p0 = i10;
        this.f90911q0 = i11;
        this.f90912r0 = new GF2Matrix(gF2Matrix);
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f90912r0);
    }

    public int getN() {
        return this.f90910p0;
    }

    public int getT() {
        return this.f90911q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f90910p0));
        aSN1EncodableVector.add(new ASN1Integer(this.f90911q0));
        aSN1EncodableVector.add(new DEROctetString(this.f90912r0.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }

    public McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f90910p0 = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.f90911q0 = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f90912r0 = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }
}

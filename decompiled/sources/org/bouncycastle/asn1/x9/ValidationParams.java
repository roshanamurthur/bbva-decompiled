package org.bouncycastle.asn1.x9;

import androidx.databinding.c;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ValidationParams extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DERBitString f87826p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87827q0;

    public ValidationParams(DERBitString dERBitString, ASN1Integer aSN1Integer) {
        if (dERBitString == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        if (aSN1Integer == null) {
            throw new IllegalArgumentException("'pgenCounter' cannot be null");
        }
        this.f87826p0 = dERBitString;
        this.f87827q0 = aSN1Integer;
    }

    public static ValidationParams getInstance(Object obj) {
        if (obj instanceof ValidationParams) {
            return (ValidationParams) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ValidationParams validationParams = new ValidationParams();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        validationParams.f87826p0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(0));
        validationParams.f87827q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        return validationParams;
    }

    public BigInteger getPgenCounter() {
        return this.f87827q0.getPositiveValue();
    }

    public byte[] getSeed() {
        return this.f87826p0.getBytes();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87826p0);
        aSN1EncodableVector.add(this.f87827q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public ValidationParams(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        this.f87826p0 = new DERBitString(bArr);
        this.f87827q0 = new ASN1Integer(i10);
    }

    public static ValidationParams getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

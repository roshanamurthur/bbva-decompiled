package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class X9FieldID extends ASN1Object implements X9ObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87847p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Primitive f87848q0;

    public X9FieldID(int i10, int i11) {
        this(i10, i11, 0, 0);
    }

    public static X9FieldID getInstance(Object obj) {
        if (obj instanceof X9FieldID) {
            return (X9FieldID) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        X9FieldID x9FieldID = new X9FieldID();
        x9FieldID.f87847p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        x9FieldID.f87848q0 = aSN1Sequence.getObjectAt(1).toASN1Primitive();
        return x9FieldID;
    }

    public ASN1ObjectIdentifier getIdentifier() {
        return this.f87847p0;
    }

    public ASN1Primitive getParameters() {
        return this.f87848q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87847p0);
        aSN1EncodableVector.add(this.f87848q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public X9FieldID(int i10, int i11, int i12, int i13) {
        this.f87847p0 = X9ObjectIdentifiers.characteristic_two_field;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(new ASN1Integer(i10));
        if (i12 == 0) {
            if (i13 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            aSN1EncodableVector.add(X9ObjectIdentifiers.tpBasis);
            aSN1EncodableVector.add(new ASN1Integer(i11));
        } else {
            if (i12 <= i11 || i13 <= i12) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            aSN1EncodableVector.add(X9ObjectIdentifiers.ppBasis);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(new ASN1Integer(i11));
            aSN1EncodableVector2.add(new ASN1Integer(i12));
            aSN1EncodableVector2.add(new ASN1Integer(i13));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        this.f87848q0 = new DERSequence(aSN1EncodableVector);
    }

    public X9FieldID(BigInteger bigInteger) {
        this.f87847p0 = X9ObjectIdentifiers.prime_field;
        this.f87848q0 = new ASN1Integer(bigInteger);
    }
}

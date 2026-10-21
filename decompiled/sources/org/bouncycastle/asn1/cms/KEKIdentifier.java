package org.bouncycastle.asn1.cms;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class KEKIdentifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1OctetString f86911p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1GeneralizedTime f86912q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public OtherKeyAttribute f86913r0;

    public KEKIdentifier(byte[] bArr, ASN1GeneralizedTime aSN1GeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
        this.f86911p0 = new DEROctetString(bArr);
        this.f86912q0 = aSN1GeneralizedTime;
        this.f86913r0 = otherKeyAttribute;
    }

    public static KEKIdentifier getInstance(Object obj) {
        ASN1Encodable objectAt;
        if (obj == null || (obj instanceof KEKIdentifier)) {
            return (KEKIdentifier) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "Invalid KEKIdentifier: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        KEKIdentifier kEKIdentifier = new KEKIdentifier();
        kEKIdentifier.f86911p0 = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size == 2) {
                boolean z10 = aSN1Sequence.getObjectAt(1) instanceof ASN1GeneralizedTime;
                objectAt = aSN1Sequence.getObjectAt(1);
                if (z10) {
                    kEKIdentifier.f86912q0 = (ASN1GeneralizedTime) objectAt;
                }
            } else {
                if (size != 3) {
                    throw new IllegalArgumentException("Invalid KEKIdentifier");
                }
                kEKIdentifier.f86912q0 = (ASN1GeneralizedTime) aSN1Sequence.getObjectAt(1);
                objectAt = aSN1Sequence.getObjectAt(2);
            }
            kEKIdentifier.f86913r0 = OtherKeyAttribute.getInstance(objectAt);
        }
        return kEKIdentifier;
    }

    public ASN1GeneralizedTime getDate() {
        return this.f86912q0;
    }

    public ASN1OctetString getKeyIdentifier() {
        return this.f86911p0;
    }

    public OtherKeyAttribute getOther() {
        return this.f86913r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86911p0);
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f86912q0;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        OtherKeyAttribute otherKeyAttribute = this.f86913r0;
        if (otherKeyAttribute != null) {
            aSN1EncodableVector.add(otherKeyAttribute);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static KEKIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

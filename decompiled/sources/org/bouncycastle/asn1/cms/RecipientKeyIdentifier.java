package org.bouncycastle.asn1.cms;

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
public class RecipientKeyIdentifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1OctetString f86952p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1GeneralizedTime f86953q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final OtherKeyAttribute f86954r0;

    public RecipientKeyIdentifier(ASN1OctetString aSN1OctetString, ASN1GeneralizedTime aSN1GeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
        this.f86952p0 = aSN1OctetString;
        this.f86953q0 = aSN1GeneralizedTime;
        this.f86954r0 = otherKeyAttribute;
    }

    public static RecipientKeyIdentifier getInstance(Object obj) {
        if (obj instanceof RecipientKeyIdentifier) {
            return (RecipientKeyIdentifier) obj;
        }
        if (obj != null) {
            return new RecipientKeyIdentifier(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1GeneralizedTime getDate() {
        return this.f86953q0;
    }

    public OtherKeyAttribute getOtherKeyAttribute() {
        return this.f86954r0;
    }

    public ASN1OctetString getSubjectKeyIdentifier() {
        return this.f86952p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86952p0);
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f86953q0;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        OtherKeyAttribute otherKeyAttribute = this.f86954r0;
        if (otherKeyAttribute != null) {
            aSN1EncodableVector.add(otherKeyAttribute);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public RecipientKeyIdentifier(ASN1Sequence aSN1Sequence) {
        this.f86952p0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    throw new IllegalArgumentException("Invalid RecipientKeyIdentifier");
                }
                this.f86953q0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
            } else if (aSN1Sequence.getObjectAt(1) instanceof ASN1GeneralizedTime) {
                this.f86953q0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
                return;
            }
            this.f86954r0 = OtherKeyAttribute.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }

    public static RecipientKeyIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public RecipientKeyIdentifier(byte[] bArr) {
        this(bArr, (ASN1GeneralizedTime) null, (OtherKeyAttribute) null);
    }

    public RecipientKeyIdentifier(byte[] bArr, ASN1GeneralizedTime aSN1GeneralizedTime, OtherKeyAttribute otherKeyAttribute) {
        this.f86952p0 = new DEROctetString(bArr);
        this.f86953q0 = aSN1GeneralizedTime;
        this.f86954r0 = otherKeyAttribute;
    }
}

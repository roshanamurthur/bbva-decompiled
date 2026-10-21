package org.bouncycastle.asn1.crmf;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedValue extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87036p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f87037q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DERBitString f87038r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AlgorithmIdentifier f87039s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1OctetString f87040t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public DERBitString f87041u0;

    public EncryptedValue(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, DERBitString dERBitString, AlgorithmIdentifier algorithmIdentifier3, ASN1OctetString aSN1OctetString, DERBitString dERBitString2) {
        if (dERBitString2 == null) {
            throw new IllegalArgumentException("'encValue' cannot be null");
        }
        this.f87036p0 = algorithmIdentifier;
        this.f87037q0 = algorithmIdentifier2;
        this.f87038r0 = dERBitString;
        this.f87039s0 = algorithmIdentifier3;
        this.f87040t0 = aSN1OctetString;
        this.f87041u0 = dERBitString2;
    }

    public static void a(ASN1EncodableVector aSN1EncodableVector, int i10, ASN1Object aSN1Object) {
        if (aSN1Object != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, i10, aSN1Object));
        }
    }

    public static EncryptedValue getInstance(Object obj) {
        if (obj instanceof EncryptedValue) {
            return (EncryptedValue) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        EncryptedValue encryptedValue = new EncryptedValue();
        int i10 = 0;
        while (aSN1Sequence.getObjectAt(i10) instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i10);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                encryptedValue.f87036p0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 1) {
                encryptedValue.f87037q0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                encryptedValue.f87038r0 = DERBitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 3) {
                encryptedValue.f87039s0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 4) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown tag encountered: ")));
                }
                encryptedValue.f87040t0 = ASN1OctetString.getInstance(aSN1TaggedObject, false);
            }
            i10++;
        }
        encryptedValue.f87041u0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(i10));
        return encryptedValue;
    }

    public DERBitString getEncSymmKey() {
        return this.f87038r0;
    }

    public DERBitString getEncValue() {
        return this.f87041u0;
    }

    public AlgorithmIdentifier getIntendedAlg() {
        return this.f87036p0;
    }

    public AlgorithmIdentifier getKeyAlg() {
        return this.f87039s0;
    }

    public AlgorithmIdentifier getSymmAlg() {
        return this.f87037q0;
    }

    public ASN1OctetString getValueHint() {
        return this.f87040t0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        a(aSN1EncodableVector, 0, this.f87036p0);
        a(aSN1EncodableVector, 1, this.f87037q0);
        a(aSN1EncodableVector, 2, this.f87038r0);
        a(aSN1EncodableVector, 3, this.f87039s0);
        a(aSN1EncodableVector, 4, this.f87040t0);
        aSN1EncodableVector.add(this.f87041u0);
        return new DERSequence(aSN1EncodableVector);
    }
}

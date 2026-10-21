package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class EncKeyWithID extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PrivateKeyInfo f87032p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Encodable f87033q0;

    public EncKeyWithID(ASN1Sequence aSN1Sequence) {
        ASN1Encodable objectAt;
        this.f87032p0 = PrivateKeyInfo.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            boolean z10 = aSN1Sequence.getObjectAt(1) instanceof DERUTF8String;
            objectAt = aSN1Sequence.getObjectAt(1);
            if (!z10) {
                objectAt = GeneralName.getInstance(objectAt);
            }
        } else {
            objectAt = null;
        }
        this.f87033q0 = objectAt;
    }

    public static EncKeyWithID getInstance(Object obj) {
        if (obj instanceof EncKeyWithID) {
            return (EncKeyWithID) obj;
        }
        if (obj != null) {
            return new EncKeyWithID(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Encodable getIdentifier() {
        return this.f87033q0;
    }

    public PrivateKeyInfo getPrivateKey() {
        return this.f87032p0;
    }

    public boolean hasIdentifier() {
        return this.f87033q0 != null;
    }

    public boolean isIdentifierUTF8String() {
        return this.f87033q0 instanceof DERUTF8String;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87032p0);
        ASN1Encodable aSN1Encodable = this.f87033q0;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public EncKeyWithID(PrivateKeyInfo privateKeyInfo) {
        this.f87032p0 = privateKeyInfo;
        this.f87033q0 = null;
    }

    public EncKeyWithID(PrivateKeyInfo privateKeyInfo, DERUTF8String dERUTF8String) {
        this.f87032p0 = privateKeyInfo;
        this.f87033q0 = dERUTF8String;
    }

    public EncKeyWithID(PrivateKeyInfo privateKeyInfo, GeneralName generalName) {
        this.f87032p0 = privateKeyInfo;
        this.f87033q0 = generalName;
    }
}

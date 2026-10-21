package org.bouncycastle.asn1.crmf;

import androidx.camera.core.impl.utils.b;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes12.dex */
public class POPOSigningKeyInput extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GeneralName f87054p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public PKMACValue f87055q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SubjectPublicKeyInfo f87056r0;

    public POPOSigningKeyInput(PKMACValue pKMACValue, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.f87055q0 = pKMACValue;
        this.f87056r0 = subjectPublicKeyInfo;
    }

    public static POPOSigningKeyInput getInstance(Object obj) {
        if (obj instanceof POPOSigningKeyInput) {
            return (POPOSigningKeyInput) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        POPOSigningKeyInput pOPOSigningKeyInput = new POPOSigningKeyInput();
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        if (objectAt instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objectAt;
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown authInfo tag: ")));
            }
            pOPOSigningKeyInput.f87054p0 = GeneralName.getInstance(aSN1TaggedObject.getObject());
        } else {
            pOPOSigningKeyInput.f87055q0 = PKMACValue.getInstance(objectAt);
        }
        pOPOSigningKeyInput.f87056r0 = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(1));
        return pOPOSigningKeyInput;
    }

    public SubjectPublicKeyInfo getPublicKey() {
        return this.f87056r0;
    }

    public PKMACValue getPublicKeyMAC() {
        return this.f87055q0;
    }

    public GeneralName getSender() {
        return this.f87054p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        GeneralName generalName = this.f87054p0;
        if (generalName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, generalName));
        } else {
            aSN1EncodableVector.add(this.f87055q0);
        }
        aSN1EncodableVector.add(this.f87056r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public POPOSigningKeyInput(GeneralName generalName, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.f87054p0 = generalName;
        this.f87056r0 = subjectPublicKeyInfo;
    }
}

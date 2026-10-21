package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class SafeBag extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87451p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87452q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Set f87453r0;

    public SafeBag(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87451p0 = aSN1ObjectIdentifier;
        this.f87452q0 = aSN1Encodable;
        this.f87453r0 = null;
    }

    public static SafeBag getInstance(Object obj) {
        if (obj instanceof SafeBag) {
            return (SafeBag) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SafeBag safeBag = new SafeBag();
        safeBag.f87451p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        safeBag.f87452q0 = ((ASN1TaggedObject) aSN1Sequence.getObjectAt(1)).getObject();
        if (aSN1Sequence.size() == 3) {
            safeBag.f87453r0 = (ASN1Set) aSN1Sequence.getObjectAt(2);
        }
        return safeBag;
    }

    public ASN1Set getBagAttributes() {
        return this.f87453r0;
    }

    public ASN1ObjectIdentifier getBagId() {
        return this.f87451p0;
    }

    public ASN1Encodable getBagValue() {
        return this.f87452q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87451p0);
        aSN1EncodableVector.add(new DLTaggedObject(true, 0, this.f87452q0));
        ASN1Set aSN1Set = this.f87453r0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(aSN1Set);
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public SafeBag(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable, ASN1Set aSN1Set) {
        this.f87451p0 = aSN1ObjectIdentifier;
        this.f87452q0 = aSN1Encodable;
        this.f87453r0 = aSN1Set;
    }
}

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DLSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ContentInfo extends ASN1Object implements PKCSObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87387p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87388q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f87389r0 = true;

    public ContentInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87387p0 = aSN1ObjectIdentifier;
        this.f87388q0 = aSN1Encodable;
    }

    public static ContentInfo getInstance(Object obj) {
        if (obj instanceof ContentInfo) {
            return (ContentInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ContentInfo contentInfo = new ContentInfo();
        contentInfo.f87389r0 = true;
        Enumeration objects = aSN1Sequence.getObjects();
        contentInfo.f87387p0 = (ASN1ObjectIdentifier) objects.nextElement();
        if (objects.hasMoreElements()) {
            contentInfo.f87388q0 = ((ASN1TaggedObject) objects.nextElement()).getObject();
        }
        contentInfo.f87389r0 = aSN1Sequence instanceof BERSequence;
        return contentInfo;
    }

    public ASN1Encodable getContent() {
        return this.f87388q0;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.f87387p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87387p0);
        ASN1Encodable aSN1Encodable = this.f87388q0;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new BERTaggedObject(true, 0, aSN1Encodable));
        }
        return this.f87389r0 ? new BERSequence(aSN1EncodableVector) : new DLSequence(aSN1EncodableVector);
    }
}

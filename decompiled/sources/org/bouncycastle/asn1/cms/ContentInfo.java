package org.bouncycastle.asn1.cms;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class ContentInfo extends ASN1Object implements CMSObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f86876p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Encodable f86877q0;

    public ContentInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f86876p0 = aSN1ObjectIdentifier;
        this.f86877q0 = aSN1Encodable;
    }

    public static ContentInfo getInstance(Object obj) {
        if (obj instanceof ContentInfo) {
            return (ContentInfo) obj;
        }
        if (obj != null) {
            return new ContentInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Encodable getContent() {
        return this.f86877q0;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.f86876p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86876p0);
        ASN1Encodable aSN1Encodable = this.f86877q0;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new BERTaggedObject(0, aSN1Encodable));
        }
        return new BERSequence(aSN1EncodableVector);
    }

    public ContentInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        this.f86876p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(1);
            if (!aSN1TaggedObject.isExplicit() || aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException("Bad tag for 'content'");
            }
            this.f86877q0 = aSN1TaggedObject.getObject();
        }
    }

    public static ContentInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

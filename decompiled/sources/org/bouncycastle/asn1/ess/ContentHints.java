package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes12.dex */
public class ContentHints extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DERUTF8String f87240p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87241q0;

    public ContentHints(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87241q0 = aSN1ObjectIdentifier;
        this.f87240p0 = null;
    }

    public static ContentHints getInstance(Object obj) {
        if (obj instanceof ContentHints) {
            return (ContentHints) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ContentHints contentHints = new ContentHints();
        int i10 = 0;
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        if (objectAt.toASN1Primitive() instanceof DERUTF8String) {
            contentHints.f87240p0 = DERUTF8String.getInstance(objectAt);
            i10 = 1;
        }
        contentHints.f87241q0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(i10));
        return contentHints;
    }

    public DERUTF8String getContentDescription() {
        return this.f87240p0;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.f87241q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        DERUTF8String dERUTF8String = this.f87240p0;
        if (dERUTF8String != null) {
            aSN1EncodableVector.add(dERUTF8String);
        }
        aSN1EncodableVector.add(this.f87241q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public ContentHints(ASN1ObjectIdentifier aSN1ObjectIdentifier, DERUTF8String dERUTF8String) {
        this.f87241q0 = aSN1ObjectIdentifier;
        this.f87240p0 = dERUTF8String;
    }
}

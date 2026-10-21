package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedContentInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f86884p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f86885q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1OctetString f86886r0;

    public EncryptedContentInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
        this.f86884p0 = aSN1ObjectIdentifier;
        this.f86885q0 = algorithmIdentifier;
        this.f86886r0 = aSN1OctetString;
    }

    public static EncryptedContentInfo getInstance(Object obj) {
        if (obj instanceof EncryptedContentInfo) {
            return (EncryptedContentInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        EncryptedContentInfo encryptedContentInfo = new EncryptedContentInfo();
        if (aSN1Sequence.size() < 2) {
            throw new IllegalArgumentException("Truncated Sequence Found");
        }
        encryptedContentInfo.f86884p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        encryptedContentInfo.f86885q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            encryptedContentInfo.f86886r0 = ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(2), false);
        }
        return encryptedContentInfo;
    }

    public AlgorithmIdentifier getContentEncryptionAlgorithm() {
        return this.f86885q0;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.f86884p0;
    }

    public ASN1OctetString getEncryptedContent() {
        return this.f86886r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86884p0);
        aSN1EncodableVector.add(this.f86885q0);
        ASN1OctetString aSN1OctetString = this.f86886r0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new BERTaggedObject(false, 0, aSN1OctetString));
        }
        return new BERSequence(aSN1EncodableVector);
    }
}

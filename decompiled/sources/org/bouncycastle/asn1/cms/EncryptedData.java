package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86890p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public EncryptedContentInfo f86891q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Set f86892r0;

    public EncryptedData(EncryptedContentInfo encryptedContentInfo) {
        this(encryptedContentInfo, null);
    }

    public static EncryptedData getInstance(Object obj) {
        if (obj instanceof EncryptedData) {
            return (EncryptedData) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        EncryptedData encryptedData = new EncryptedData();
        encryptedData.f86890p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        encryptedData.f86891q0 = EncryptedContentInfo.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 3) {
            encryptedData.f86892r0 = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(2), false);
        }
        return encryptedData;
    }

    public EncryptedContentInfo getEncryptedContentInfo() {
        return this.f86891q0;
    }

    public ASN1Set getUnprotectedAttrs() {
        return this.f86892r0;
    }

    public ASN1Integer getVersion() {
        return this.f86890p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86890p0);
        aSN1EncodableVector.add(this.f86891q0);
        ASN1Set aSN1Set = this.f86892r0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new BERTaggedObject(false, 1, aSN1Set));
        }
        return new BERSequence(aSN1EncodableVector);
    }

    public EncryptedData(EncryptedContentInfo encryptedContentInfo, ASN1Set aSN1Set) {
        this.f86890p0 = new ASN1Integer(aSN1Set == null ? 0L : 2L);
        this.f86891q0 = encryptedContentInfo;
        this.f86892r0 = aSN1Set;
    }
}

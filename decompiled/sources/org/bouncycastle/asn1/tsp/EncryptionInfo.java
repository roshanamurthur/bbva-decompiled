package org.bouncycastle.asn1.tsp;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DLSequence;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptionInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87488p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87489q0;

    public EncryptionInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87488p0 = aSN1ObjectIdentifier;
        this.f87489q0 = aSN1Encodable;
    }

    public static EncryptionInfo getInstance(ASN1Object aSN1Object) {
        if (aSN1Object instanceof EncryptionInfo) {
            return (EncryptionInfo) aSN1Object;
        }
        if (aSN1Object == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Object);
        EncryptionInfo encryptionInfo = new EncryptionInfo();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("wrong sequence size in constructor: ")));
        }
        encryptionInfo.f87488p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        encryptionInfo.f87489q0 = aSN1Sequence.getObjectAt(1);
        return encryptionInfo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87488p0);
        aSN1EncodableVector.add(this.f87489q0);
        return new DLSequence(aSN1EncodableVector);
    }

    public static EncryptionInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

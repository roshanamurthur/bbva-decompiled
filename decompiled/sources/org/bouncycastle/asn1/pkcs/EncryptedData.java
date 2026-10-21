package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
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
public class EncryptedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87393p0;

    public EncryptedData(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        aSN1EncodableVector.add(algorithmIdentifier.toASN1Primitive());
        aSN1EncodableVector.add(new BERTaggedObject(false, 0, aSN1Encodable));
        this.f87393p0 = new BERSequence(aSN1EncodableVector);
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
        if (((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact() != 0) {
            throw new IllegalArgumentException("sequence not version 0");
        }
        encryptedData.f87393p0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        return encryptedData;
    }

    public ASN1OctetString getContent() {
        ASN1Sequence aSN1Sequence = this.f87393p0;
        if (aSN1Sequence.size() == 3) {
            return ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2)), false);
        }
        return null;
    }

    public ASN1ObjectIdentifier getContentType() {
        return ASN1ObjectIdentifier.getInstance(this.f87393p0.getObjectAt(0));
    }

    public AlgorithmIdentifier getEncryptionAlgorithm() {
        return AlgorithmIdentifier.getInstance(this.f87393p0.getObjectAt(1));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(0L));
        aSN1EncodableVector.add(this.f87393p0);
        return new BERSequence(aSN1EncodableVector);
    }
}

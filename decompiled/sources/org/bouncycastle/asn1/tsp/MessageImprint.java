package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class MessageImprint extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87496p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f87497q0;

    public MessageImprint(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f87496p0 = algorithmIdentifier;
        this.f87497q0 = Arrays.clone(bArr);
    }

    public static MessageImprint getInstance(Object obj) {
        if (obj instanceof MessageImprint) {
            return (MessageImprint) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        MessageImprint messageImprint = new MessageImprint();
        messageImprint.f87496p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        messageImprint.f87497q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        return messageImprint;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.f87496p0;
    }

    public byte[] getHashedMessage() {
        return Arrays.clone(this.f87497q0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87496p0);
        aSN1EncodableVector.add(new DEROctetString(this.f87497q0));
        return new DERSequence(aSN1EncodableVector);
    }
}

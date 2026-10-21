package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class Challenge extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f86761p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f86762q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1OctetString f86763r0;

    public Challenge(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2) {
        this.f86761p0 = algorithmIdentifier;
        this.f86762q0 = new DEROctetString(bArr);
        this.f86763r0 = new DEROctetString(bArr2);
    }

    public static Challenge getInstance(Object obj) {
        if (obj instanceof Challenge) {
            return (Challenge) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Challenge challenge = new Challenge();
        int i10 = 0;
        if (aSN1Sequence.size() == 3) {
            challenge.f86761p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            i10 = 1;
        }
        challenge.f86762q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10));
        challenge.f86763r0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        return challenge;
    }

    public byte[] getChallenge() {
        return this.f86763r0.getOctets();
    }

    public AlgorithmIdentifier getOwf() {
        return this.f86761p0;
    }

    public byte[] getWitness() {
        return this.f86762q0.getOctets();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        AlgorithmIdentifier algorithmIdentifier = this.f86761p0;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(algorithmIdentifier);
        }
        aSN1EncodableVector.add(this.f86762q0);
        aSN1EncodableVector.add(this.f86763r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public Challenge(byte[] bArr, byte[] bArr2) {
        this(null, bArr, bArr2);
    }
}

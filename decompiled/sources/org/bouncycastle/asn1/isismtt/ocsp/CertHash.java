package org.bouncycastle.asn1.isismtt.ocsp;

import androidx.databinding.c;
import androidx.emoji2.text.flatbuffer.a;
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
public class CertHash extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87282p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f87283q0;

    public CertHash(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f87282p0 = algorithmIdentifier;
        byte[] bArr2 = new byte[bArr.length];
        this.f87283q0 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public static CertHash getInstance(Object obj) {
        if (obj == null || (obj instanceof CertHash)) {
            return (CertHash) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        CertHash certHash = new CertHash();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        certHash.f87282p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        certHash.f87283q0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        return certHash;
    }

    public byte[] getCertificateHash() {
        return Arrays.clone(this.f87283q0);
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.f87282p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87282p0);
        aSN1EncodableVector.add(new DEROctetString(this.f87283q0));
        return new DERSequence(aSN1EncodableVector);
    }
}

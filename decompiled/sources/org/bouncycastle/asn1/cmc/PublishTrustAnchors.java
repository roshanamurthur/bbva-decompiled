package org.bouncycastle.asn1.cmc;

import androidx.camera.core.impl.utils.a;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class PublishTrustAnchors extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f86721p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f86722q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Sequence f86723r0;

    public PublishTrustAnchors(BigInteger bigInteger, AlgorithmIdentifier algorithmIdentifier, byte[][] bArr) {
        this.f86721p0 = new ASN1Integer(bigInteger);
        this.f86722q0 = algorithmIdentifier;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(bArr.length);
        for (int i10 = 0; i10 != bArr.length; i10++) {
            aSN1EncodableVector.add(new DEROctetString(Arrays.clone(bArr[i10])));
        }
        this.f86723r0 = new DERSequence(aSN1EncodableVector);
    }

    public static PublishTrustAnchors getInstance(Object obj) {
        if (obj instanceof PublishTrustAnchors) {
            return (PublishTrustAnchors) obj;
        }
        if (obj != null) {
            return new PublishTrustAnchors(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[][] getAnchorHashes() {
        ASN1Sequence aSN1Sequence = this.f86723r0;
        int size = aSN1Sequence.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 != size; i10++) {
            bArr[i10] = a.c(aSN1Sequence, i10);
        }
        return bArr;
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.f86722q0;
    }

    public BigInteger getSeqNumber() {
        return this.f86721p0.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86721p0);
        aSN1EncodableVector.add(this.f86722q0);
        aSN1EncodableVector.add(this.f86723r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public PublishTrustAnchors(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86721p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86722q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86723r0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
    }
}

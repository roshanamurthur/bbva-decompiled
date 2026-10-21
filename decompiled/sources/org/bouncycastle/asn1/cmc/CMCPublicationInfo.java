package org.bouncycastle.asn1.cmc;

import androidx.camera.core.impl.utils.a;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.PKIPublicationInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class CMCPublicationInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86642p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Sequence f86643q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PKIPublicationInfo f86644r0;

    public CMCPublicationInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86642p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86643q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86644r0 = PKIPublicationInfo.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static CMCPublicationInfo getInstance(Object obj) {
        if (obj instanceof CMCPublicationInfo) {
            return (CMCPublicationInfo) obj;
        }
        if (obj != null) {
            return new CMCPublicationInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[][] getCertHashes() {
        ASN1Sequence aSN1Sequence = this.f86643q0;
        int size = aSN1Sequence.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 != size; i10++) {
            bArr[i10] = a.c(aSN1Sequence, i10);
        }
        return bArr;
    }

    public AlgorithmIdentifier getHashAlg() {
        return this.f86642p0;
    }

    public PKIPublicationInfo getPubInfo() {
        return this.f86644r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86642p0);
        aSN1EncodableVector.add(this.f86643q0);
        aSN1EncodableVector.add(this.f86644r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCPublicationInfo(AlgorithmIdentifier algorithmIdentifier, byte[][] bArr, PKIPublicationInfo pKIPublicationInfo) {
        this.f86642p0 = algorithmIdentifier;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(bArr.length);
        for (int i10 = 0; i10 != bArr.length; i10++) {
            aSN1EncodableVector.add(new DEROctetString(Arrays.clone(bArr[i10])));
        }
        this.f86643q0 = new DERSequence(aSN1EncodableVector);
        this.f86644r0 = pKIPublicationInfo;
    }
}

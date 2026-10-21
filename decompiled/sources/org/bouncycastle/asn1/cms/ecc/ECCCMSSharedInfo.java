package org.bouncycastle.asn1.cms.ecc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class ECCCMSSharedInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86994p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f86995q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f86996r0;

    public ECCCMSSharedInfo(ASN1Sequence aSN1Sequence) {
        this.f86994p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.f86995q0 = null;
            this.f86996r0 = ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true).getOctets();
        } else {
            this.f86995q0 = ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true).getOctets();
            this.f86996r0 = ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(2), true).getOctets();
        }
    }

    public static ECCCMSSharedInfo getInstance(Object obj) {
        if (obj instanceof ECCCMSSharedInfo) {
            return (ECCCMSSharedInfo) obj;
        }
        if (obj != null) {
            return new ECCCMSSharedInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86994p0);
        byte[] bArr = this.f86995q0;
        if (bArr != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, new DEROctetString(bArr)));
        }
        aSN1EncodableVector.add(new DERTaggedObject(true, 2, new DEROctetString(this.f86996r0)));
        return new DERSequence(aSN1EncodableVector);
    }

    public ECCCMSSharedInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f86994p0 = algorithmIdentifier;
        this.f86995q0 = null;
        this.f86996r0 = Arrays.clone(bArr);
    }

    public static ECCCMSSharedInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public ECCCMSSharedInfo(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2) {
        this.f86994p0 = algorithmIdentifier;
        this.f86995q0 = Arrays.clone(bArr);
        this.f86996r0 = Arrays.clone(bArr2);
    }
}

package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ObjectDigestInfo extends ASN1Object {
    public static final int otherObjectDigest = 2;
    public static final int publicKey = 0;
    public static final int publicKeyCert = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Enumerated f87655p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87656q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AlgorithmIdentifier f87657r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public DERBitString f87658s0;

    public ObjectDigestInfo(int i10, ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.f87655p0 = new ASN1Enumerated(i10);
        if (i10 == 2) {
            this.f87656q0 = aSN1ObjectIdentifier;
        }
        this.f87657r0 = algorithmIdentifier;
        this.f87658s0 = new DERBitString(bArr);
    }

    public static ObjectDigestInfo getInstance(Object obj) {
        if (obj instanceof ObjectDigestInfo) {
            return (ObjectDigestInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ObjectDigestInfo objectDigestInfo = new ObjectDigestInfo();
        if (aSN1Sequence.size() > 4 || aSN1Sequence.size() < 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        int i10 = 0;
        objectDigestInfo.f87655p0 = ASN1Enumerated.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 4) {
            i10 = 1;
            objectDigestInfo.f87656q0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        }
        objectDigestInfo.f87657r0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        objectDigestInfo.f87658s0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(i10 + 2));
        return objectDigestInfo;
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.f87657r0;
    }

    public ASN1Enumerated getDigestedObjectType() {
        return this.f87655p0;
    }

    public DERBitString getObjectDigest() {
        return this.f87658s0;
    }

    public ASN1ObjectIdentifier getOtherObjectTypeID() {
        return this.f87656q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f87655p0);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f87656q0;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        aSN1EncodableVector.add(this.f87657r0);
        aSN1EncodableVector.add(this.f87658s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ObjectDigestInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

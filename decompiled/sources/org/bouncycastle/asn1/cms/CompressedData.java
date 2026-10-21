package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class CompressedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86870p0 = new ASN1Integer(0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f86871q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ContentInfo f86872r0;

    public CompressedData(AlgorithmIdentifier algorithmIdentifier, ContentInfo contentInfo) {
        this.f86871q0 = algorithmIdentifier;
        this.f86872r0 = contentInfo;
    }

    public static CompressedData getInstance(Object obj) {
        if (obj instanceof CompressedData) {
            return (CompressedData) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CompressedData compressedData = new CompressedData();
        compressedData.f86870p0 = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        compressedData.f86871q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        compressedData.f86872r0 = ContentInfo.getInstance(aSN1Sequence.getObjectAt(2));
        return compressedData;
    }

    public AlgorithmIdentifier getCompressionAlgorithmIdentifier() {
        return this.f86871q0;
    }

    public ContentInfo getEncapContentInfo() {
        return this.f86872r0;
    }

    public ASN1Integer getVersion() {
        return this.f86870p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86870p0);
        aSN1EncodableVector.add(this.f86871q0);
        aSN1EncodableVector.add(this.f86872r0);
        return new BERSequence(aSN1EncodableVector);
    }

    public static CompressedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

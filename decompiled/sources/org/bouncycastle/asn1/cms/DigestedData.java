package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class DigestedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86880p0 = new ASN1Integer(0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f86881q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ContentInfo f86882r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1OctetString f86883s0;

    public DigestedData(AlgorithmIdentifier algorithmIdentifier, ContentInfo contentInfo, byte[] bArr) {
        this.f86881q0 = algorithmIdentifier;
        this.f86882r0 = contentInfo;
        this.f86883s0 = new DEROctetString(bArr);
    }

    public static DigestedData getInstance(Object obj) {
        if (obj instanceof DigestedData) {
            return (DigestedData) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DigestedData digestedData = new DigestedData();
        digestedData.f86880p0 = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        digestedData.f86881q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        digestedData.f86882r0 = ContentInfo.getInstance(aSN1Sequence.getObjectAt(2));
        digestedData.f86883s0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3));
        return digestedData;
    }

    public byte[] getDigest() {
        return this.f86883s0.getOctets();
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.f86881q0;
    }

    public ContentInfo getEncapContentInfo() {
        return this.f86882r0;
    }

    public ASN1Integer getVersion() {
        return this.f86880p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86880p0);
        aSN1EncodableVector.add(this.f86881q0);
        aSN1EncodableVector.add(this.f86882r0);
        aSN1EncodableVector.add(this.f86883s0);
        return new BERSequence(aSN1EncodableVector);
    }

    public static DigestedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

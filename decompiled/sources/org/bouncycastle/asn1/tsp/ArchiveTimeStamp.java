package org.bouncycastle.asn1.tsp;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.Attributes;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class ArchiveTimeStamp extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f87481p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Attributes f87482q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f87483r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ContentInfo f87484s0;

    public ArchiveTimeStamp(ContentInfo contentInfo) {
        this.f87484s0 = contentInfo;
    }

    public static ArchiveTimeStamp getInstance(Object obj) {
        if (obj instanceof ArchiveTimeStamp) {
            return (ArchiveTimeStamp) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ArchiveTimeStamp archiveTimeStamp = new ArchiveTimeStamp();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 4) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("wrong sequence size in constructor: ")));
        }
        for (int i10 = 0; i10 < aSN1Sequence.size() - 1; i10++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i10);
            if (objectAt instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    archiveTimeStamp.f87481p0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 1) {
                    archiveTimeStamp.f87482q0 = Attributes.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 2) {
                        throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("invalid tag no in constructor: ")));
                    }
                    archiveTimeStamp.f87483r0 = ASN1Sequence.getInstance(aSN1TaggedObject, false);
                }
            }
        }
        archiveTimeStamp.f87484s0 = ContentInfo.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1));
        return archiveTimeStamp;
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.f87481p0;
    }

    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        AlgorithmIdentifier algorithmIdentifier = this.f87481p0;
        if (algorithmIdentifier != null) {
            return algorithmIdentifier;
        }
        ContentInfo contentInfo = this.f87484s0;
        if (!contentInfo.getContentType().equals((ASN1Primitive) CMSObjectIdentifiers.signedData)) {
            throw new IllegalStateException("cannot identify algorithm identifier for digest");
        }
        SignedData signedData = SignedData.getInstance(contentInfo.getContent());
        if (signedData.getEncapContentInfo().getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.id_ct_TSTInfo)) {
            return TSTInfo.getInstance(signedData.getEncapContentInfo()).getMessageImprint().getHashAlgorithm();
        }
        throw new IllegalStateException("cannot parse time stamp");
    }

    public PartialHashtree[] getReducedHashTree() {
        ASN1Sequence aSN1Sequence = this.f87483r0;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        PartialHashtree[] partialHashtreeArr = new PartialHashtree[size];
        for (int i10 = 0; i10 != size; i10++) {
            partialHashtreeArr[i10] = PartialHashtree.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return partialHashtreeArr;
    }

    public ContentInfo getTimeStamp() {
        return this.f87484s0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        AlgorithmIdentifier algorithmIdentifier = this.f87481p0;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, algorithmIdentifier));
        }
        Attributes attributes = this.f87482q0;
        if (attributes != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, attributes));
        }
        ASN1Sequence aSN1Sequence = this.f87483r0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, aSN1Sequence));
        }
        aSN1EncodableVector.add(this.f87484s0);
        return new DERSequence(aSN1EncodableVector);
    }

    public ArchiveTimeStamp(AlgorithmIdentifier algorithmIdentifier, Attributes attributes, PartialHashtree[] partialHashtreeArr, ContentInfo contentInfo) {
        this.f87481p0 = algorithmIdentifier;
        this.f87482q0 = attributes;
        this.f87483r0 = new DERSequence(partialHashtreeArr);
        this.f87484s0 = contentInfo;
    }

    public ArchiveTimeStamp(AlgorithmIdentifier algorithmIdentifier, PartialHashtree[] partialHashtreeArr, ContentInfo contentInfo) {
        this.f87481p0 = algorithmIdentifier;
        this.f87483r0 = new DERSequence(partialHashtreeArr);
        this.f87484s0 = contentInfo;
    }
}

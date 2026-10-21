package org.bouncycastle.asn1.tsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ArchiveTimeStampSequence extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DERSequence f87486p0;

    public ArchiveTimeStampSequence(ASN1Sequence aSN1Sequence) throws IllegalArgumentException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(aSN1Sequence.size());
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            aSN1EncodableVector.add(ArchiveTimeStampChain.getInstance(objects.nextElement()));
        }
        this.f87486p0 = new DERSequence(aSN1EncodableVector);
    }

    public static ArchiveTimeStampSequence getInstance(Object obj) {
        if (obj instanceof ArchiveTimeStampChain) {
            return (ArchiveTimeStampSequence) obj;
        }
        if (obj != null) {
            return new ArchiveTimeStampSequence(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ArchiveTimeStampSequence append(ArchiveTimeStampChain archiveTimeStampChain) {
        DERSequence dERSequence = this.f87486p0;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(dERSequence.size() + 1);
        for (int i10 = 0; i10 != dERSequence.size(); i10++) {
            aSN1EncodableVector.add(dERSequence.getObjectAt(i10));
        }
        aSN1EncodableVector.add(archiveTimeStampChain);
        return new ArchiveTimeStampSequence(new DERSequence(aSN1EncodableVector));
    }

    public ArchiveTimeStampChain[] getArchiveTimeStampChains() {
        DERSequence dERSequence = this.f87486p0;
        int size = dERSequence.size();
        ArchiveTimeStampChain[] archiveTimeStampChainArr = new ArchiveTimeStampChain[size];
        for (int i10 = 0; i10 != size; i10++) {
            archiveTimeStampChainArr[i10] = ArchiveTimeStampChain.getInstance(dERSequence.getObjectAt(i10));
        }
        return archiveTimeStampChainArr;
    }

    public int size() {
        return this.f87486p0.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87486p0;
    }

    public ArchiveTimeStampSequence(ArchiveTimeStampChain archiveTimeStampChain) {
        this.f87486p0 = new DERSequence(archiveTimeStampChain);
    }

    public ArchiveTimeStampSequence(ArchiveTimeStampChain[] archiveTimeStampChainArr) {
        this.f87486p0 = new DERSequence(archiveTimeStampChainArr);
    }
}

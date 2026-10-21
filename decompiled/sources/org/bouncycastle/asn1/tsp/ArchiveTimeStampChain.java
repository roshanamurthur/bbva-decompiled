package org.bouncycastle.asn1.tsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ArchiveTimeStampChain extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DERSequence f87485p0;

    public ArchiveTimeStampChain(ASN1Sequence aSN1Sequence) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(aSN1Sequence.size());
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            aSN1EncodableVector.add(ArchiveTimeStamp.getInstance(objects.nextElement()));
        }
        this.f87485p0 = new DERSequence(aSN1EncodableVector);
    }

    public static ArchiveTimeStampChain getInstance(Object obj) {
        if (obj instanceof ArchiveTimeStampChain) {
            return (ArchiveTimeStampChain) obj;
        }
        if (obj != null) {
            return new ArchiveTimeStampChain(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ArchiveTimeStampChain append(ArchiveTimeStamp archiveTimeStamp) {
        DERSequence dERSequence = this.f87485p0;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(dERSequence.size() + 1);
        for (int i10 = 0; i10 != dERSequence.size(); i10++) {
            aSN1EncodableVector.add(dERSequence.getObjectAt(i10));
        }
        aSN1EncodableVector.add(archiveTimeStamp);
        return new ArchiveTimeStampChain(new DERSequence(aSN1EncodableVector));
    }

    public ArchiveTimeStamp[] getArchiveTimestamps() {
        DERSequence dERSequence = this.f87485p0;
        int size = dERSequence.size();
        ArchiveTimeStamp[] archiveTimeStampArr = new ArchiveTimeStamp[size];
        for (int i10 = 0; i10 != size; i10++) {
            archiveTimeStampArr[i10] = ArchiveTimeStamp.getInstance(dERSequence.getObjectAt(i10));
        }
        return archiveTimeStampArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87485p0;
    }

    public ArchiveTimeStampChain(ArchiveTimeStamp archiveTimeStamp) {
        this.f87485p0 = new DERSequence(archiveTimeStamp);
    }

    public ArchiveTimeStampChain(ArchiveTimeStamp[] archiveTimeStampArr) {
        this.f87485p0 = new DERSequence(archiveTimeStampArr);
    }
}

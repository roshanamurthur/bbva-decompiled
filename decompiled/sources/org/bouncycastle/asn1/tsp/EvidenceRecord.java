package org.bouncycastle.asn1.tsp;

import androidx.camera.core.impl.utils.b;
import androidx.databinding.c;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class EvidenceRecord extends ASN1Object {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f87490u0 = new ASN1ObjectIdentifier("1.3.6.1.5.5.11.0.2.1");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87491p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87492q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CryptoInfos f87493r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public EncryptionInfo f87494s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ArchiveTimeStampSequence f87495t0;

    public EvidenceRecord(EvidenceRecord evidenceRecord, ArchiveTimeStampSequence archiveTimeStampSequence, ArchiveTimeStamp archiveTimeStamp) {
        ASN1Sequence dERSequence;
        AlgorithmIdentifier algorithmIdentifier;
        this.f87491p0 = new ASN1Integer(1L);
        this.f87491p0 = evidenceRecord.f87491p0;
        if (archiveTimeStamp != null) {
            AlgorithmIdentifier digestAlgorithmIdentifier = archiveTimeStamp.getDigestAlgorithmIdentifier();
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            Enumeration objects = evidenceRecord.f87492q0.getObjects();
            do {
                if (objects.hasMoreElements()) {
                    algorithmIdentifier = AlgorithmIdentifier.getInstance(objects.nextElement());
                    aSN1EncodableVector.add(algorithmIdentifier);
                } else {
                    aSN1EncodableVector.add(digestAlgorithmIdentifier);
                    dERSequence = new DERSequence(aSN1EncodableVector);
                }
            } while (!algorithmIdentifier.equals(digestAlgorithmIdentifier));
            dERSequence = evidenceRecord.f87492q0;
        } else {
            dERSequence = evidenceRecord.f87492q0;
        }
        this.f87492q0 = dERSequence;
        this.f87493r0 = evidenceRecord.f87493r0;
        this.f87494s0 = evidenceRecord.f87494s0;
        this.f87495t0 = archiveTimeStampSequence;
    }

    public static EvidenceRecord getInstance(Object obj) {
        if (obj instanceof EvidenceRecord) {
            return (EvidenceRecord) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        EvidenceRecord evidenceRecord = new EvidenceRecord();
        evidenceRecord.f87491p0 = new ASN1Integer(1L);
        if (aSN1Sequence.size() < 3 && aSN1Sequence.size() > 5) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("wrong sequence size in constructor: ")));
        }
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Integer.intValueExact() != 1) {
            throw new IllegalArgumentException("incompatible version");
        }
        evidenceRecord.f87491p0 = aSN1Integer;
        evidenceRecord.f87492q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        for (int i10 = 2; i10 != aSN1Sequence.size() - 1; i10++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i10);
            if (!(objectAt instanceof ASN1TaggedObject)) {
                throw new IllegalArgumentException("unknown object in getInstance: ".concat(objectAt.getClass().getName()));
            }
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objectAt;
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                evidenceRecord.f87493r0 = CryptoInfos.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 1) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag in getInstance: ")));
                }
                evidenceRecord.f87494s0 = EncryptionInfo.getInstance(aSN1TaggedObject, false);
            }
        }
        evidenceRecord.f87495t0 = ArchiveTimeStampSequence.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1));
        return evidenceRecord;
    }

    public EvidenceRecord addArchiveTimeStamp(ArchiveTimeStamp archiveTimeStamp, boolean z10) {
        ArchiveTimeStampSequence archiveTimeStampSequence = this.f87495t0;
        if (z10) {
            return new EvidenceRecord(this, archiveTimeStampSequence.append(new ArchiveTimeStampChain(archiveTimeStamp)), archiveTimeStamp);
        }
        ArchiveTimeStampChain[] archiveTimeStampChains = archiveTimeStampSequence.getArchiveTimeStampChains();
        archiveTimeStampChains[archiveTimeStampChains.length - 1] = archiveTimeStampChains[archiveTimeStampChains.length - 1].append(archiveTimeStamp);
        return new EvidenceRecord(this, new ArchiveTimeStampSequence(archiveTimeStampChains), null);
    }

    public ArchiveTimeStampSequence getArchiveTimeStampSequence() {
        return this.f87495t0;
    }

    public AlgorithmIdentifier[] getDigestAlgorithms() {
        ASN1Sequence aSN1Sequence = this.f87492q0;
        int size = aSN1Sequence.size();
        AlgorithmIdentifier[] algorithmIdentifierArr = new AlgorithmIdentifier[size];
        for (int i10 = 0; i10 != size; i10++) {
            algorithmIdentifierArr[i10] = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return algorithmIdentifierArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f87491p0);
        aSN1EncodableVector.add(this.f87492q0);
        CryptoInfos cryptoInfos = this.f87493r0;
        if (cryptoInfos != null) {
            aSN1EncodableVector.add(cryptoInfos);
        }
        EncryptionInfo encryptionInfo = this.f87494s0;
        if (encryptionInfo != null) {
            aSN1EncodableVector.add(encryptionInfo);
        }
        aSN1EncodableVector.add(this.f87495t0);
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        return "EvidenceRecord: Oid(" + f87490u0 + ")";
    }

    public EvidenceRecord(AlgorithmIdentifier[] algorithmIdentifierArr, CryptoInfos cryptoInfos, EncryptionInfo encryptionInfo, ArchiveTimeStampSequence archiveTimeStampSequence) {
        this.f87491p0 = new ASN1Integer(1L);
        this.f87492q0 = new DERSequence(algorithmIdentifierArr);
        this.f87493r0 = cryptoInfos;
        this.f87494s0 = encryptionInfo;
        this.f87495t0 = archiveTimeStampSequence;
    }

    public static EvidenceRecord getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

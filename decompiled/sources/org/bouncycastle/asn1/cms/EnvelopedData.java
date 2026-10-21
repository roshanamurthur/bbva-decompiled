package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class EnvelopedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f86893p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final OriginatorInfo f86894q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Set f86895r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final EncryptedContentInfo f86896s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ASN1Set f86897t0;

    public EnvelopedData(ASN1Sequence aSN1Sequence) {
        this.f86893p0 = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
        int i10 = 2;
        if (objectAt instanceof ASN1TaggedObject) {
            this.f86894q0 = OriginatorInfo.getInstance((ASN1TaggedObject) objectAt, false);
            objectAt = aSN1Sequence.getObjectAt(2);
            i10 = 3;
        }
        this.f86895r0 = ASN1Set.getInstance(objectAt);
        int i11 = i10 + 1;
        this.f86896s0 = EncryptedContentInfo.getInstance(aSN1Sequence.getObjectAt(i10));
        if (aSN1Sequence.size() > i11) {
            this.f86897t0 = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i11), false);
        }
    }

    public static int calculateVersion(OriginatorInfo originatorInfo, ASN1Set aSN1Set, ASN1Set aSN1Set2) {
        if (originatorInfo != null || aSN1Set2 != null) {
            return 2;
        }
        Enumeration objects = aSN1Set.getObjects();
        while (objects.hasMoreElements()) {
            if (RecipientInfo.getInstance(objects.nextElement()).getVersion().intValueExact() != 0) {
                return 2;
            }
        }
        return 0;
    }

    public static EnvelopedData getInstance(Object obj) {
        if (obj instanceof EnvelopedData) {
            return (EnvelopedData) obj;
        }
        if (obj != null) {
            return new EnvelopedData(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncryptedContentInfo getEncryptedContentInfo() {
        return this.f86896s0;
    }

    public OriginatorInfo getOriginatorInfo() {
        return this.f86894q0;
    }

    public ASN1Set getRecipientInfos() {
        return this.f86895r0;
    }

    public ASN1Set getUnprotectedAttrs() {
        return this.f86897t0;
    }

    public ASN1Integer getVersion() {
        return this.f86893p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f86893p0);
        OriginatorInfo originatorInfo = this.f86894q0;
        if (originatorInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, originatorInfo));
        }
        aSN1EncodableVector.add(this.f86895r0);
        aSN1EncodableVector.add(this.f86896s0);
        ASN1Set aSN1Set = this.f86897t0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, aSN1Set));
        }
        return new BERSequence(aSN1EncodableVector);
    }

    public EnvelopedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, EncryptedContentInfo encryptedContentInfo, ASN1Set aSN1Set2) {
        this.f86893p0 = new ASN1Integer(calculateVersion(originatorInfo, aSN1Set, aSN1Set2));
        this.f86894q0 = originatorInfo;
        this.f86895r0 = aSN1Set;
        this.f86896s0 = encryptedContentInfo;
        this.f86897t0 = aSN1Set2;
    }

    public static EnvelopedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public EnvelopedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, EncryptedContentInfo encryptedContentInfo, Attributes attributes) {
        this.f86893p0 = new ASN1Integer(calculateVersion(originatorInfo, aSN1Set, ASN1Set.getInstance(attributes)));
        this.f86894q0 = originatorInfo;
        this.f86895r0 = aSN1Set;
        this.f86896s0 = encryptedContentInfo;
        this.f86897t0 = ASN1Set.getInstance(attributes);
    }
}

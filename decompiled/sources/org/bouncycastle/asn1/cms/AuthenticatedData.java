package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class AuthenticatedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86853p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OriginatorInfo f86854q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Set f86855r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AlgorithmIdentifier f86856s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public AlgorithmIdentifier f86857t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ContentInfo f86858u0;
    public ASN1Set v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ASN1OctetString f86859w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ASN1Set f86860x0;

    public AuthenticatedData(OriginatorInfo originatorInfo, ASN1Set aSN1Set, AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, ContentInfo contentInfo, ASN1Set aSN1Set2, ASN1OctetString aSN1OctetString, ASN1Set aSN1Set3) {
        if (!(algorithmIdentifier2 == null && aSN1Set2 == null) && (algorithmIdentifier2 == null || aSN1Set2 == null)) {
            throw new IllegalArgumentException("digestAlgorithm and authAttrs must be set together");
        }
        this.f86853p0 = new ASN1Integer(calculateVersion(originatorInfo));
        this.f86854q0 = originatorInfo;
        this.f86856s0 = algorithmIdentifier;
        this.f86857t0 = algorithmIdentifier2;
        this.f86855r0 = aSN1Set;
        this.f86858u0 = contentInfo;
        this.v0 = aSN1Set2;
        this.f86859w0 = aSN1OctetString;
        this.f86860x0 = aSN1Set3;
    }

    public static int calculateVersion(OriginatorInfo originatorInfo) {
        int i10 = 0;
        if (originatorInfo == null) {
            return 0;
        }
        Enumeration objects = originatorInfo.getCertificates().getObjects();
        while (objects.hasMoreElements()) {
            Object objNextElement = objects.nextElement();
            if (objNextElement instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objNextElement;
                if (aSN1TaggedObject.getTagNo() == 2) {
                    i10 = 1;
                } else if (aSN1TaggedObject.getTagNo() == 3) {
                    i10 = 3;
                    break;
                }
            }
        }
        if (originatorInfo.getCRLs() != null) {
            Enumeration objects2 = originatorInfo.getCRLs().getObjects();
            while (objects2.hasMoreElements()) {
                Object objNextElement2 = objects2.nextElement();
                if ((objNextElement2 instanceof ASN1TaggedObject) && ((ASN1TaggedObject) objNextElement2).getTagNo() == 1) {
                    return 3;
                }
            }
        }
        return i10;
    }

    public static AuthenticatedData getInstance(Object obj) {
        int i10;
        if (obj instanceof AuthenticatedData) {
            return (AuthenticatedData) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        AuthenticatedData authenticatedData = new AuthenticatedData();
        authenticatedData.f86853p0 = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
        if (objectAt instanceof ASN1TaggedObject) {
            authenticatedData.f86854q0 = OriginatorInfo.getInstance((ASN1TaggedObject) objectAt, false);
            objectAt = aSN1Sequence.getObjectAt(2);
            i10 = 3;
        } else {
            i10 = 2;
        }
        authenticatedData.f86855r0 = ASN1Set.getInstance(objectAt);
        authenticatedData.f86856s0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10));
        int i11 = i10 + 2;
        ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i10 + 1);
        if (objectAt2 instanceof ASN1TaggedObject) {
            authenticatedData.f86857t0 = AlgorithmIdentifier.getInstance((ASN1TaggedObject) objectAt2, false);
            objectAt2 = aSN1Sequence.getObjectAt(i11);
            i11 = i10 + 3;
        }
        authenticatedData.f86858u0 = ContentInfo.getInstance(objectAt2);
        int i12 = i11 + 1;
        ASN1Encodable objectAt3 = aSN1Sequence.getObjectAt(i11);
        if (objectAt3 instanceof ASN1TaggedObject) {
            authenticatedData.v0 = ASN1Set.getInstance((ASN1TaggedObject) objectAt3, false);
            objectAt3 = aSN1Sequence.getObjectAt(i12);
            i12 = i11 + 2;
        }
        authenticatedData.f86859w0 = ASN1OctetString.getInstance(objectAt3);
        if (aSN1Sequence.size() > i12) {
            authenticatedData.f86860x0 = ASN1Set.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(i12), false);
        }
        return authenticatedData;
    }

    public ASN1Set getAuthAttrs() {
        return this.v0;
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.f86857t0;
    }

    public ContentInfo getEncapsulatedContentInfo() {
        return this.f86858u0;
    }

    public ASN1OctetString getMac() {
        return this.f86859w0;
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.f86856s0;
    }

    public OriginatorInfo getOriginatorInfo() {
        return this.f86854q0;
    }

    public ASN1Set getRecipientInfos() {
        return this.f86855r0;
    }

    public ASN1Set getUnauthAttrs() {
        return this.f86860x0;
    }

    public ASN1Integer getVersion() {
        return this.f86853p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(9);
        aSN1EncodableVector.add(this.f86853p0);
        OriginatorInfo originatorInfo = this.f86854q0;
        if (originatorInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, originatorInfo));
        }
        aSN1EncodableVector.add(this.f86855r0);
        aSN1EncodableVector.add(this.f86856s0);
        AlgorithmIdentifier algorithmIdentifier = this.f86857t0;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, algorithmIdentifier));
        }
        aSN1EncodableVector.add(this.f86858u0);
        ASN1Set aSN1Set = this.v0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, aSN1Set));
        }
        aSN1EncodableVector.add(this.f86859w0);
        ASN1Set aSN1Set2 = this.f86860x0;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, aSN1Set2));
        }
        return new BERSequence(aSN1EncodableVector);
    }

    public static AuthenticatedData getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}

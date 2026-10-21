package org.bouncycastle.asn1.cms;

import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.utils.b;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class CMSAlgorithmProtection extends ASN1Object {
    public static final int MAC = 2;
    public static final int SIGNATURE = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AlgorithmIdentifier f86867p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f86868q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AlgorithmIdentifier f86869r0;

    public CMSAlgorithmProtection(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("Sequence wrong size: One of signatureAlgorithm or macAlgorithm must be present");
        }
        this.f86867p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1TaggedObject.getTagNo() == 1) {
            this.f86868q0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            this.f86869r0 = null;
        } else {
            if (aSN1TaggedObject.getTagNo() != 2) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown tag found: ")));
            }
            this.f86868q0 = null;
            this.f86869r0 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
        }
    }

    public static CMSAlgorithmProtection getInstance(Object obj) {
        if (obj instanceof CMSAlgorithmProtection) {
            return (CMSAlgorithmProtection) obj;
        }
        if (obj != null) {
            return new CMSAlgorithmProtection(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.f86867p0;
    }

    public AlgorithmIdentifier getMacAlgorithm() {
        return this.f86869r0;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.f86868q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86867p0);
        AlgorithmIdentifier algorithmIdentifier = this.f86868q0;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, algorithmIdentifier));
        }
        AlgorithmIdentifier algorithmIdentifier2 = this.f86869r0;
        if (algorithmIdentifier2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, algorithmIdentifier2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CMSAlgorithmProtection(AlgorithmIdentifier algorithmIdentifier, int i10, AlgorithmIdentifier algorithmIdentifier2) {
        if (algorithmIdentifier == null || algorithmIdentifier2 == null) {
            throw new NullPointerException("AlgorithmIdentifiers cannot be null");
        }
        this.f86867p0 = algorithmIdentifier;
        if (i10 == 1) {
            this.f86868q0 = algorithmIdentifier2;
            this.f86869r0 = null;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(g0.c("Unknown type: ", i10));
            }
            this.f86868q0 = null;
            this.f86869r0 = algorithmIdentifier2;
        }
    }
}

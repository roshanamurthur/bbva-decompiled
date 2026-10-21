package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class SignerInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Integer f86974p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SignerIdentifier f86975q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AlgorithmIdentifier f86976r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ASN1Set f86977s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AlgorithmIdentifier f86978t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ASN1OctetString f86979u0;
    public final ASN1Set v0;

    public SignerInfo(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f86974p0 = (ASN1Integer) objects.nextElement();
        this.f86975q0 = SignerIdentifier.getInstance(objects.nextElement());
        this.f86976r0 = AlgorithmIdentifier.getInstance(objects.nextElement());
        Object objNextElement = objects.nextElement();
        if (objNextElement instanceof ASN1TaggedObject) {
            this.f86977s0 = ASN1Set.getInstance((ASN1TaggedObject) objNextElement, false);
            objNextElement = objects.nextElement();
        } else {
            this.f86977s0 = null;
        }
        this.f86978t0 = AlgorithmIdentifier.getInstance(objNextElement);
        this.f86979u0 = ASN1OctetString.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.v0 = ASN1Set.getInstance((ASN1TaggedObject) objects.nextElement(), false);
        } else {
            this.v0 = null;
        }
    }

    public static SignerInfo getInstance(Object obj) throws IllegalArgumentException {
        if (obj instanceof SignerInfo) {
            return (SignerInfo) obj;
        }
        if (obj != null) {
            return new SignerInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Set getAuthenticatedAttributes() {
        return this.f86977s0;
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.f86976r0;
    }

    public AlgorithmIdentifier getDigestEncryptionAlgorithm() {
        return this.f86978t0;
    }

    public ASN1OctetString getEncryptedDigest() {
        return this.f86979u0;
    }

    public SignerIdentifier getSID() {
        return this.f86975q0;
    }

    public ASN1Set getUnauthenticatedAttributes() {
        return this.v0;
    }

    public ASN1Integer getVersion() {
        return this.f86974p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.f86974p0);
        aSN1EncodableVector.add(this.f86975q0);
        aSN1EncodableVector.add(this.f86976r0);
        ASN1Set aSN1Set = this.f86977s0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, aSN1Set));
        }
        aSN1EncodableVector.add(this.f86978t0);
        aSN1EncodableVector.add(this.f86979u0);
        ASN1Set aSN1Set2 = this.v0;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, aSN1Set2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SignerInfo(SignerIdentifier signerIdentifier, AlgorithmIdentifier algorithmIdentifier, ASN1Set aSN1Set, AlgorithmIdentifier algorithmIdentifier2, ASN1OctetString aSN1OctetString, ASN1Set aSN1Set2) {
        this.f86974p0 = signerIdentifier.isTagged() ? new ASN1Integer(3L) : new ASN1Integer(1L);
        this.f86975q0 = signerIdentifier;
        this.f86976r0 = algorithmIdentifier;
        this.f86977s0 = aSN1Set;
        this.f86978t0 = algorithmIdentifier2;
        this.f86979u0 = aSN1OctetString;
        this.v0 = aSN1Set2;
    }

    public SignerInfo(SignerIdentifier signerIdentifier, AlgorithmIdentifier algorithmIdentifier, Attributes attributes, AlgorithmIdentifier algorithmIdentifier2, ASN1OctetString aSN1OctetString, Attributes attributes2) {
        this.f86974p0 = signerIdentifier.isTagged() ? new ASN1Integer(3L) : new ASN1Integer(1L);
        this.f86975q0 = signerIdentifier;
        this.f86976r0 = algorithmIdentifier;
        this.f86977s0 = ASN1Set.getInstance(attributes);
        this.f86978t0 = algorithmIdentifier2;
        this.f86979u0 = aSN1OctetString;
        this.v0 = ASN1Set.getInstance(attributes2);
    }
}

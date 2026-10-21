package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class TaggedAttribute extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BodyPartID f86730p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f86731q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Set f86732r0;

    public TaggedAttribute(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86730p0 = BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86731q0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86732r0 = ASN1Set.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static TaggedAttribute getInstance(Object obj) {
        if (obj instanceof TaggedAttribute) {
            return (TaggedAttribute) obj;
        }
        if (obj != null) {
            return new TaggedAttribute(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getAttrType() {
        return this.f86731q0;
    }

    public ASN1Set getAttrValues() {
        return this.f86732r0;
    }

    public BodyPartID getBodyPartID() {
        return this.f86730p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f86730p0, this.f86731q0, this.f86732r0});
    }

    public TaggedAttribute(BodyPartID bodyPartID, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Set aSN1Set) {
        this.f86730p0 = bodyPartID;
        this.f86731q0 = aSN1ObjectIdentifier;
        this.f86732r0 = aSN1Set;
    }
}

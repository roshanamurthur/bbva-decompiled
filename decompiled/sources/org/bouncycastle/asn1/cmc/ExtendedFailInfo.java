package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ExtendedFailInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f86685p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Encodable f86686q0;

    public ExtendedFailInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f86685p0 = aSN1ObjectIdentifier;
        this.f86686q0 = aSN1Encodable;
    }

    public static ExtendedFailInfo getInstance(Object obj) {
        if (obj instanceof ExtendedFailInfo) {
            return (ExtendedFailInfo) obj;
        }
        if (!(obj instanceof ASN1Encodable)) {
            if (obj instanceof byte[]) {
                return getInstance(ASN1Sequence.getInstance(obj));
            }
            return null;
        }
        ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        if (aSN1Primitive instanceof ASN1Sequence) {
            return new ExtendedFailInfo((ASN1Sequence) aSN1Primitive);
        }
        return null;
    }

    public ASN1ObjectIdentifier getFailInfoOID() {
        return this.f86685p0;
    }

    public ASN1Encodable getFailInfoValue() {
        return this.f86686q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f86685p0, this.f86686q0});
    }

    public ExtendedFailInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("Sequence must be 2 elements.");
        }
        this.f86685p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86686q0 = aSN1Sequence.getObjectAt(1);
    }
}

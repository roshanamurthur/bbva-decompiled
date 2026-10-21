package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;

/* JADX INFO: loaded from: classes12.dex */
public class ServiceLocator extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final X500Name f87357p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AuthorityInformationAccess f87358q0;

    public ServiceLocator(ASN1Sequence aSN1Sequence) {
        this.f87357p0 = X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        this.f87358q0 = aSN1Sequence.size() == 2 ? AuthorityInformationAccess.getInstance(aSN1Sequence.getObjectAt(1)) : null;
    }

    public static ServiceLocator getInstance(Object obj) {
        if (obj instanceof ServiceLocator) {
            return (ServiceLocator) obj;
        }
        if (obj != null) {
            return new ServiceLocator(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X500Name getIssuer() {
        return this.f87357p0;
    }

    public AuthorityInformationAccess getLocator() {
        return this.f87358q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87357p0);
        AuthorityInformationAccess authorityInformationAccess = this.f87358q0;
        if (authorityInformationAccess != null) {
            aSN1EncodableVector.add(authorityInformationAccess);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}

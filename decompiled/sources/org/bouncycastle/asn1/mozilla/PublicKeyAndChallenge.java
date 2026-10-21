package org.bouncycastle.asn1.mozilla;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes12.dex */
public class PublicKeyAndChallenge extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87319p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SubjectPublicKeyInfo f87320q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DERIA5String f87321r0;

    public static PublicKeyAndChallenge getInstance(Object obj) {
        if (obj instanceof PublicKeyAndChallenge) {
            return (PublicKeyAndChallenge) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PublicKeyAndChallenge publicKeyAndChallenge = new PublicKeyAndChallenge();
        publicKeyAndChallenge.f87319p0 = aSN1Sequence;
        publicKeyAndChallenge.f87320q0 = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(0));
        publicKeyAndChallenge.f87321r0 = DERIA5String.getInstance(aSN1Sequence.getObjectAt(1));
        return publicKeyAndChallenge;
    }

    public DERIA5String getChallenge() {
        return this.f87321r0;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.f87320q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87319p0;
    }
}

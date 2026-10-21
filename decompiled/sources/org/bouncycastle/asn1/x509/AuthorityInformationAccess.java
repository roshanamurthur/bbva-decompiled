package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class AuthorityInformationAccess extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AccessDescription[] f87581p0;

    public AuthorityInformationAccess(ASN1ObjectIdentifier aSN1ObjectIdentifier, GeneralName generalName) {
        this(new AccessDescription(aSN1ObjectIdentifier, generalName));
    }

    public static AuthorityInformationAccess fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.authorityInfoAccess));
    }

    public static AuthorityInformationAccess getInstance(Object obj) {
        if (obj instanceof AuthorityInformationAccess) {
            return (AuthorityInformationAccess) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        AuthorityInformationAccess authorityInformationAccess = new AuthorityInformationAccess();
        if (aSN1Sequence.size() < 1) {
            throw new IllegalArgumentException("sequence may not be empty");
        }
        authorityInformationAccess.f87581p0 = new AccessDescription[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            authorityInformationAccess.f87581p0[i10] = AccessDescription.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return authorityInformationAccess;
    }

    public AccessDescription[] getAccessDescriptions() {
        AccessDescription[] accessDescriptionArr = this.f87581p0;
        AccessDescription[] accessDescriptionArr2 = new AccessDescription[accessDescriptionArr.length];
        System.arraycopy(accessDescriptionArr, 0, accessDescriptionArr2, 0, accessDescriptionArr.length);
        return accessDescriptionArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f87581p0);
    }

    public String toString() {
        return "AuthorityInformationAccess: Oid(" + this.f87581p0[0].getAccessMethod().getId() + ")";
    }

    public AuthorityInformationAccess(AccessDescription accessDescription) {
        this.f87581p0 = new AccessDescription[]{accessDescription};
    }

    public AuthorityInformationAccess(AccessDescription[] accessDescriptionArr) {
        AccessDescription[] accessDescriptionArr2 = new AccessDescription[accessDescriptionArr.length];
        System.arraycopy(accessDescriptionArr, 0, accessDescriptionArr2, 0, accessDescriptionArr.length);
        this.f87581p0 = accessDescriptionArr2;
    }
}

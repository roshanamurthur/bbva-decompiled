package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes12.dex */
public class AdditionalInformationSyntax extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DirectoryString f87287p0;

    public AdditionalInformationSyntax(String str) {
        this(new DirectoryString(str));
    }

    public static AdditionalInformationSyntax getInstance(Object obj) {
        if (obj instanceof AdditionalInformationSyntax) {
            return (AdditionalInformationSyntax) obj;
        }
        if (obj != null) {
            return new AdditionalInformationSyntax(DirectoryString.getInstance(obj));
        }
        return null;
    }

    public DirectoryString getInformation() {
        return this.f87287p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87287p0.toASN1Primitive();
    }

    public AdditionalInformationSyntax(DirectoryString directoryString) {
        this.f87287p0 = directoryString;
    }
}

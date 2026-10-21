package org.bouncycastle.asn1.dvcs;

import androidx.appcompat.widget.g0;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.ess.ESSCertID;
import org.bouncycastle.asn1.ocsp.CertID;
import org.bouncycastle.asn1.ocsp.CertStatus;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.smime.SMIMECapabilities;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;

/* JADX INFO: loaded from: classes12.dex */
public class CertEtcToken extends ASN1Object implements ASN1Choice {
    public static final int TAG_ASSERTION = 3;
    public static final int TAG_CAPABILITIES = 8;
    public static final int TAG_CERTIFICATE = 0;
    public static final int TAG_CRL = 4;
    public static final int TAG_ESSCERTID = 1;
    public static final int TAG_OCSPCERTID = 6;
    public static final int TAG_OCSPCERTSTATUS = 5;
    public static final int TAG_OCSPRESPONSE = 7;
    public static final int TAG_PKISTATUS = 2;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final boolean[] f87094s0 = {false, true, false, true, false, true, false, false, true};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f87095p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87096q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Extension f87097r0;

    public CertEtcToken(int i10, ASN1Encodable aSN1Encodable) {
        this.f87095p0 = i10;
        this.f87096q0 = aSN1Encodable;
    }

    public static CertEtcToken[] arrayFromSequence(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        CertEtcToken[] certEtcTokenArr = new CertEtcToken[size];
        for (int i10 = 0; i10 != size; i10++) {
            certEtcTokenArr[i10] = getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return certEtcTokenArr;
    }

    public static CertEtcToken getInstance(Object obj) {
        ASN1Encodable certificate;
        if (obj instanceof CertEtcToken) {
            return (CertEtcToken) obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            if (obj != null) {
                return new CertEtcToken(Extension.getInstance(obj));
            }
            return null;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        CertEtcToken certEtcToken = new CertEtcToken();
        int tagNo = aSN1TaggedObject.getTagNo();
        certEtcToken.f87095p0 = tagNo;
        switch (tagNo) {
            case 0:
                certificate = Certificate.getInstance(aSN1TaggedObject, false);
                break;
            case 1:
                certificate = ESSCertID.getInstance(aSN1TaggedObject.getObject());
                break;
            case 2:
                certificate = PKIStatusInfo.getInstance(aSN1TaggedObject, false);
                break;
            case 3:
                certificate = ContentInfo.getInstance(aSN1TaggedObject.getObject());
                break;
            case 4:
                certificate = CertificateList.getInstance(aSN1TaggedObject, false);
                break;
            case 5:
                certificate = CertStatus.getInstance(aSN1TaggedObject.getObject());
                break;
            case 6:
                certificate = CertID.getInstance(aSN1TaggedObject, false);
                break;
            case 7:
                certificate = OCSPResponse.getInstance(aSN1TaggedObject, false);
                break;
            case 8:
                certificate = SMIMECapabilities.getInstance(aSN1TaggedObject.getObject());
                break;
            default:
                throw new IllegalArgumentException(g0.c("Unknown tag: ", tagNo));
        }
        certEtcToken.f87096q0 = certificate;
        return certEtcToken;
    }

    public Extension getExtension() {
        return this.f87097r0;
    }

    public int getTagNo() {
        return this.f87095p0;
    }

    public ASN1Encodable getValue() {
        return this.f87096q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        Extension extension = this.f87097r0;
        if (extension != null) {
            return extension.toASN1Primitive();
        }
        boolean[] zArr = f87094s0;
        int i10 = this.f87095p0;
        return new DERTaggedObject(zArr[i10], i10, this.f87096q0);
    }

    public String toString() {
        return "CertEtcToken {\n" + this.f87096q0 + "}\n";
    }

    public CertEtcToken(Extension extension) {
        this.f87095p0 = -1;
        this.f87097r0 = extension;
    }
}

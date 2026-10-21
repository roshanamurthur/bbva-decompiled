package org.bouncycastle.asn1.eac;

import androidx.camera.core.impl.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: classes12.dex */
public class CertificateBody extends ASN1Object {
    public static final int profileType = 127;
    public static final int requestType = 13;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ApplicationSpecific f87166p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1ApplicationSpecific f87167q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PublicKeyDataObject f87168r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1ApplicationSpecific f87169s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CertificateHolderAuthorization f87170t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ASN1ApplicationSpecific f87171u0;
    public ASN1ApplicationSpecific v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f87172w0;

    public CertificateBody(ASN1ApplicationSpecific aSN1ApplicationSpecific, CertificationAuthorityReference certificationAuthorityReference, PublicKeyDataObject publicKeyDataObject, CertificateHolderReference certificateHolderReference, CertificateHolderAuthorization certificateHolderAuthorization, PackedDate packedDate, PackedDate packedDate2) {
        this.f87172w0 = 0;
        c(aSN1ApplicationSpecific);
        DERApplicationSpecific dERApplicationSpecific = new DERApplicationSpecific(2, certificationAuthorityReference.getEncoded());
        if (dERApplicationSpecific.getApplicationTag() != 2) {
            throw new IllegalArgumentException("Not an Iso7816Tags.ISSUER_IDENTIFICATION_NUMBER tag");
        }
        this.f87167q0 = dERApplicationSpecific;
        this.f87172w0 |= 2;
        this.f87168r0 = PublicKeyDataObject.getInstance(publicKeyDataObject);
        this.f87172w0 |= 4;
        DERApplicationSpecific dERApplicationSpecific2 = new DERApplicationSpecific(32, certificateHolderReference.getEncoded());
        if (dERApplicationSpecific2.getApplicationTag() != 32) {
            throw new IllegalArgumentException("Not an Iso7816Tags.CARDHOLDER_NAME tag");
        }
        this.f87169s0 = dERApplicationSpecific2;
        int i10 = this.f87172w0;
        this.f87170t0 = certificateHolderAuthorization;
        this.f87172w0 = i10 | 24;
        try {
            b(new DERApplicationSpecific(false, 37, new DEROctetString(packedDate.getEncoding())));
            DERApplicationSpecific dERApplicationSpecific3 = new DERApplicationSpecific(false, 36, new DEROctetString(packedDate2.getEncoding()));
            if (dERApplicationSpecific3.getApplicationTag() != 36) {
                throw new IllegalArgumentException("Not an Iso7816Tags.APPLICATION_EXPIRATION_DATE tag");
            }
            this.v0 = dERApplicationSpecific3;
            this.f87172w0 |= 64;
        } catch (IOException e5) {
            throw new IllegalArgumentException(a.d(e5, new StringBuilder("unable to encode dates: ")));
        }
    }

    public static CertificateBody getInstance(Object obj) throws IOException {
        if (obj instanceof CertificateBody) {
            return (CertificateBody) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1ApplicationSpecific aSN1ApplicationSpecific = ASN1ApplicationSpecific.getInstance(obj);
        CertificateBody certificateBody = new CertificateBody();
        certificateBody.f87172w0 = 0;
        if (aSN1ApplicationSpecific.getApplicationTag() != 78) {
            throw new IOException("Bad tag : not an iso7816 CERTIFICATE_CONTENT_TEMPLATE");
        }
        ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1ApplicationSpecific.getContents());
        while (true) {
            ASN1Primitive object = aSN1InputStream.readObject();
            if (object == null) {
                aSN1InputStream.close();
                return certificateBody;
            }
            if (!(object instanceof ASN1ApplicationSpecific)) {
                throw new IOException("Not a valid iso7816 content : not a ASN1ApplicationSpecific Object :" + EACTags.encodeTag(aSN1ApplicationSpecific) + object.getClass());
            }
            ASN1ApplicationSpecific aSN1ApplicationSpecific2 = (ASN1ApplicationSpecific) object;
            int applicationTag = aSN1ApplicationSpecific2.getApplicationTag();
            if (applicationTag != 2) {
                if (applicationTag != 32) {
                    if (applicationTag == 41) {
                        certificateBody.c(aSN1ApplicationSpecific2);
                    } else if (applicationTag == 73) {
                        certificateBody.f87168r0 = PublicKeyDataObject.getInstance(PublicKeyDataObject.getInstance(aSN1ApplicationSpecific2.getObject(16)));
                        certificateBody.f87172w0 |= 4;
                    } else if (applicationTag == 76) {
                        certificateBody.f87170t0 = new CertificateHolderAuthorization(aSN1ApplicationSpecific2);
                        certificateBody.f87172w0 |= 16;
                    } else if (applicationTag != 36) {
                        if (applicationTag != 37) {
                            certificateBody.f87172w0 = 0;
                            throw new IOException("Not a valid iso7816 ASN1ApplicationSpecific tag " + aSN1ApplicationSpecific2.getApplicationTag());
                        }
                        certificateBody.b(aSN1ApplicationSpecific2);
                    } else {
                        if (aSN1ApplicationSpecific2.getApplicationTag() != 36) {
                            throw new IllegalArgumentException("Not an Iso7816Tags.APPLICATION_EXPIRATION_DATE tag");
                        }
                        certificateBody.v0 = aSN1ApplicationSpecific2;
                        certificateBody.f87172w0 |= 64;
                    }
                } else {
                    if (aSN1ApplicationSpecific2.getApplicationTag() != 32) {
                        throw new IllegalArgumentException("Not an Iso7816Tags.CARDHOLDER_NAME tag");
                    }
                    certificateBody.f87169s0 = aSN1ApplicationSpecific2;
                    certificateBody.f87172w0 |= 8;
                }
            } else {
                if (aSN1ApplicationSpecific2.getApplicationTag() != 2) {
                    throw new IllegalArgumentException("Not an Iso7816Tags.ISSUER_IDENTIFICATION_NUMBER tag");
                }
                certificateBody.f87167q0 = aSN1ApplicationSpecific2;
                certificateBody.f87172w0 |= 2;
            }
        }
    }

    public final DERApplicationSpecific a() throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        aSN1EncodableVector.add(this.f87166p0);
        aSN1EncodableVector.add(this.f87167q0);
        aSN1EncodableVector.add(new DERApplicationSpecific(false, 73, this.f87168r0));
        aSN1EncodableVector.add(this.f87169s0);
        aSN1EncodableVector.add(this.f87170t0);
        aSN1EncodableVector.add(this.f87171u0);
        aSN1EncodableVector.add(this.v0);
        return new DERApplicationSpecific(78, aSN1EncodableVector);
    }

    public final void b(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IllegalArgumentException {
        if (aSN1ApplicationSpecific.getApplicationTag() == 37) {
            this.f87171u0 = aSN1ApplicationSpecific;
            this.f87172w0 |= 32;
        } else {
            throw new IllegalArgumentException("Not an Iso7816Tags.APPLICATION_EFFECTIVE_DATE tag :" + EACTags.encodeTag(aSN1ApplicationSpecific));
        }
    }

    public final void c(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IllegalArgumentException {
        if (aSN1ApplicationSpecific.getApplicationTag() == 41) {
            this.f87166p0 = aSN1ApplicationSpecific;
            this.f87172w0 |= 1;
        } else {
            throw new IllegalArgumentException("Not an Iso7816Tags.INTERCHANGE_PROFILE tag :" + EACTags.encodeTag(aSN1ApplicationSpecific));
        }
    }

    public PackedDate getCertificateEffectiveDate() {
        if ((this.f87172w0 & 32) == 32) {
            return new PackedDate(this.f87171u0.getContents());
        }
        return null;
    }

    public PackedDate getCertificateExpirationDate() throws IOException {
        if ((this.f87172w0 & 64) == 64) {
            return new PackedDate(this.v0.getContents());
        }
        throw new IOException("certificate Expiration Date not set");
    }

    public CertificateHolderAuthorization getCertificateHolderAuthorization() throws IOException {
        if ((this.f87172w0 & 16) == 16) {
            return this.f87170t0;
        }
        throw new IOException("Certificate Holder Authorisation not set");
    }

    public CertificateHolderReference getCertificateHolderReference() {
        return new CertificateHolderReference(this.f87169s0.getContents());
    }

    public ASN1ApplicationSpecific getCertificateProfileIdentifier() {
        return this.f87166p0;
    }

    public int getCertificateType() {
        return this.f87172w0;
    }

    public CertificationAuthorityReference getCertificationAuthorityReference() throws IOException {
        if ((this.f87172w0 & 2) == 2) {
            return new CertificationAuthorityReference(this.f87167q0.getContents());
        }
        throw new IOException("Certification authority reference not set");
    }

    public PublicKeyDataObject getPublicKey() {
        return this.f87168r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            int i10 = this.f87172w0;
            if (i10 == 127) {
                return a();
            }
            if (i10 == 13) {
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
                aSN1EncodableVector.add(this.f87166p0);
                aSN1EncodableVector.add(new DERApplicationSpecific(false, 73, this.f87168r0));
                aSN1EncodableVector.add(this.f87169s0);
                return new DERApplicationSpecific(78, aSN1EncodableVector);
            }
            return null;
        } catch (IOException unused) {
        }
    }
}

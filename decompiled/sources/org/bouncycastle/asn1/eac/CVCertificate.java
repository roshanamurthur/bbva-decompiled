package org.bouncycastle.asn1.eac;

import androidx.camera.core.impl.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class CVCertificate extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CertificateBody f87159p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f87160q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f87161r0;

    public CVCertificate(ASN1InputStream aSN1InputStream) throws IOException {
        while (true) {
            ASN1Primitive object = aSN1InputStream.readObject();
            if (object == null) {
                return;
            }
            if (!(object instanceof ASN1ApplicationSpecific)) {
                throw new IOException("Invalid Input Stream for creating an Iso7816CertificateStructure");
            }
            a((ASN1ApplicationSpecific) object);
        }
    }

    public static CVCertificate getInstance(Object obj) {
        if (obj instanceof CVCertificate) {
            return (CVCertificate) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            ASN1ApplicationSpecific aSN1ApplicationSpecific = ASN1ApplicationSpecific.getInstance(obj);
            CVCertificate cVCertificate = new CVCertificate();
            cVCertificate.a(aSN1ApplicationSpecific);
            return cVCertificate;
        } catch (IOException e5) {
            throw new ASN1ParsingException(a.d(e5, new StringBuilder("unable to parse data: ")), e5);
        }
    }

    public final void a(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        int i10;
        this.f87161r0 = 0;
        if (aSN1ApplicationSpecific.getApplicationTag() != 33) {
            throw new IOException("not a CARDHOLDER_CERTIFICATE :" + aSN1ApplicationSpecific.getApplicationTag());
        }
        ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1ApplicationSpecific.getContents());
        while (true) {
            ASN1Primitive object = aSN1InputStream.readObject();
            if (object == null) {
                aSN1InputStream.close();
                if (this.f87161r0 == 3) {
                    return;
                }
                throw new IOException("invalid CARDHOLDER_CERTIFICATE :" + aSN1ApplicationSpecific.getApplicationTag());
            }
            if (!(object instanceof ASN1ApplicationSpecific)) {
                throw new IOException("Invalid Object, not an Iso7816CertificateStructure");
            }
            ASN1ApplicationSpecific aSN1ApplicationSpecific2 = (ASN1ApplicationSpecific) object;
            int applicationTag = aSN1ApplicationSpecific2.getApplicationTag();
            if (applicationTag == 55) {
                this.f87160q0 = aSN1ApplicationSpecific2.getContents();
                i10 = this.f87161r0 | 2;
            } else {
                if (applicationTag != 78) {
                    throw new IOException("Invalid tag, not an Iso7816CertificateStructure :" + aSN1ApplicationSpecific2.getApplicationTag());
                }
                this.f87159p0 = CertificateBody.getInstance(aSN1ApplicationSpecific2);
                i10 = this.f87161r0 | 1;
            }
            this.f87161r0 = i10;
        }
    }

    public CertificationAuthorityReference getAuthorityReference() throws IOException {
        return this.f87159p0.getCertificationAuthorityReference();
    }

    public CertificateBody getBody() {
        return this.f87159p0;
    }

    public int getCertificateType() {
        return this.f87159p0.getCertificateType();
    }

    public PackedDate getEffectiveDate() throws IOException {
        return this.f87159p0.getCertificateEffectiveDate();
    }

    public PackedDate getExpirationDate() throws IOException {
        return this.f87159p0.getCertificateExpirationDate();
    }

    public ASN1ObjectIdentifier getHolderAuthorization() throws IOException {
        return this.f87159p0.getCertificateHolderAuthorization().getOid();
    }

    public Flags getHolderAuthorizationRights() throws IOException {
        return new Flags(this.f87159p0.getCertificateHolderAuthorization().getAccessRights() & 31);
    }

    public int getHolderAuthorizationRole() throws IOException {
        return this.f87159p0.getCertificateHolderAuthorization().getAccessRights() & 192;
    }

    public CertificateHolderReference getHolderReference() throws IOException {
        return this.f87159p0.getCertificateHolderReference();
    }

    public int getRole() throws IOException {
        return this.f87159p0.getCertificateHolderAuthorization().getAccessRights();
    }

    public byte[] getSignature() {
        return Arrays.clone(this.f87160q0);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87159p0);
        try {
            aSN1EncodableVector.add(new DERApplicationSpecific(false, 55, new DEROctetString(this.f87160q0)));
            return new DERApplicationSpecific(33, aSN1EncodableVector);
        } catch (IOException unused) {
            throw new IllegalStateException("unable to convert signature!");
        }
    }

    public CVCertificate(CertificateBody certificateBody, byte[] bArr) throws IOException {
        this.f87159p0 = certificateBody;
        this.f87160q0 = Arrays.clone(bArr);
        this.f87161r0 |= 3;
    }
}

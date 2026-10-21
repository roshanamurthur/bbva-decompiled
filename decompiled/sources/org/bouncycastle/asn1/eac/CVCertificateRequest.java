package org.bouncycastle.asn1.eac;

import androidx.camera.core.impl.a;
import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class CVCertificateRequest extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ApplicationSpecific f87162p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CertificateBody f87163q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f87164r0 = null;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f87165s0;

    public CVCertificateRequest(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        this.f87165s0 = null;
        this.f87162p0 = aSN1ApplicationSpecific;
        if (!aSN1ApplicationSpecific.isConstructed() || aSN1ApplicationSpecific.getApplicationTag() != 7) {
            a(aSN1ApplicationSpecific);
            return;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1ApplicationSpecific.getObject(16));
        a(ASN1ApplicationSpecific.getInstance(aSN1Sequence.getObjectAt(0)));
        this.f87165s0 = ASN1ApplicationSpecific.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1)).getContents();
    }

    public static CVCertificateRequest getInstance(Object obj) {
        if (obj instanceof CVCertificateRequest) {
            return (CVCertificateRequest) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return new CVCertificateRequest(ASN1ApplicationSpecific.getInstance(obj));
        } catch (IOException e5) {
            throw new ASN1ParsingException(a.d(e5, new StringBuilder("unable to parse data: ")), e5);
        }
    }

    public final void a(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        if (aSN1ApplicationSpecific.getApplicationTag() != 33) {
            throw new IOException("not a CARDHOLDER_CERTIFICATE in request:" + aSN1ApplicationSpecific.getApplicationTag());
        }
        Enumeration objects = ASN1Sequence.getInstance(aSN1ApplicationSpecific.getObject(16)).getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            ASN1ApplicationSpecific aSN1ApplicationSpecific2 = ASN1ApplicationSpecific.getInstance(objects.nextElement());
            int applicationTag = aSN1ApplicationSpecific2.getApplicationTag();
            if (applicationTag == 55) {
                this.f87164r0 = aSN1ApplicationSpecific2.getContents();
                i10 |= 2;
            } else {
                if (applicationTag != 78) {
                    throw new IOException("Invalid tag, not an CV Certificate Request element:" + aSN1ApplicationSpecific2.getApplicationTag());
                }
                this.f87163q0 = CertificateBody.getInstance(aSN1ApplicationSpecific2);
                i10 |= 1;
            }
        }
        if ((i10 & 3) != 0) {
            return;
        }
        throw new IOException("Invalid CARDHOLDER_CERTIFICATE in request:" + aSN1ApplicationSpecific.getApplicationTag());
    }

    public CertificateBody getCertificateBody() {
        return this.f87163q0;
    }

    public byte[] getInnerSignature() {
        return Arrays.clone(this.f87164r0);
    }

    public byte[] getOuterSignature() {
        return Arrays.clone(this.f87165s0);
    }

    public PublicKeyDataObject getPublicKey() {
        return this.f87163q0.getPublicKey();
    }

    public boolean hasOuterSignature() {
        return this.f87165s0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1ApplicationSpecific aSN1ApplicationSpecific = this.f87162p0;
        if (aSN1ApplicationSpecific != null) {
            return aSN1ApplicationSpecific;
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87163q0);
        try {
            aSN1EncodableVector.add(new DERApplicationSpecific(false, 55, new DEROctetString(this.f87164r0)));
            return new DERApplicationSpecific(33, aSN1EncodableVector);
        } catch (IOException unused) {
            throw new IllegalStateException("unable to convert signature!");
        }
    }
}

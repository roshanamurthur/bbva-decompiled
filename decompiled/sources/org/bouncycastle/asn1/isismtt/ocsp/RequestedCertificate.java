package org.bouncycastle.asn1.isismtt.ocsp;

import ad.e;
import androidx.camera.core.impl.utils.b;
import androidx.emoji2.text.flatbuffer.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class RequestedCertificate extends ASN1Object implements ASN1Choice {
    public static final int attributeCertificate = 1;
    public static final int certificate = -1;
    public static final int publicKeyCertificate = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Certificate f87284p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f87285q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f87286r0;

    public RequestedCertificate(int i10, byte[] bArr) {
        this(new DERTaggedObject(i10, new DEROctetString(bArr)));
    }

    public static RequestedCertificate getInstance(Object obj) {
        if (obj == null || (obj instanceof RequestedCertificate)) {
            return (RequestedCertificate) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new RequestedCertificate(Certificate.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            return new RequestedCertificate((ASN1TaggedObject) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "illegal object in getInstance: "));
    }

    public byte[] getCertificateBytes() {
        Certificate certificate2 = this.f87284p0;
        if (certificate2 == null) {
            byte[] bArr = this.f87285q0;
            return bArr != null ? Arrays.clone(bArr) : Arrays.clone(this.f87286r0);
        }
        try {
            return certificate2.getEncoded();
        } catch (IOException e5) {
            throw new IllegalStateException(e.d("can't decode certificate: ", e5));
        }
    }

    public int getType() {
        if (this.f87284p0 != null) {
            return -1;
        }
        return this.f87285q0 != null ? 0 : 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        byte[] bArr = this.f87285q0;
        if (bArr != null) {
            return new DERTaggedObject(0, new DEROctetString(bArr));
        }
        byte[] bArr2 = this.f87286r0;
        return bArr2 != null ? new DERTaggedObject(1, new DEROctetString(bArr2)) : this.f87284p0.toASN1Primitive();
    }

    public RequestedCertificate(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() == 0) {
            this.f87285q0 = ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        } else {
            if (aSN1TaggedObject.getTagNo() != 1) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag number: ")));
            }
            this.f87286r0 = ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        }
    }

    public static RequestedCertificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        if (z10) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        throw new IllegalArgumentException("choice item must be explicitly tagged");
    }

    public RequestedCertificate(Certificate certificate2) {
        this.f87284p0 = certificate2;
    }
}

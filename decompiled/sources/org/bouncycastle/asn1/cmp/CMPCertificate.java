package org.bouncycastle.asn1.cmp;

import androidx.emoji2.text.flatbuffer.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;

/* JADX INFO: loaded from: classes12.dex */
public class CMPCertificate extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Certificate f86742p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f86743q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Object f86744r0;

    public CMPCertificate(int i10, ASN1Object aSN1Object) {
        this.f86743q0 = i10;
        this.f86744r0 = aSN1Object;
    }

    public static CMPCertificate getInstance(Object obj) {
        if (obj == null || (obj instanceof CMPCertificate)) {
            return (CMPCertificate) obj;
        }
        if (obj instanceof byte[]) {
            try {
                obj = ASN1Primitive.fromByteArray((byte[]) obj);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Invalid encoding in CMPCertificate");
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new CMPCertificate(Certificate.getInstance(obj));
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(a.c(obj, "Invalid object: "));
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        return new CMPCertificate(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getObject());
    }

    public ASN1Object getOtherCert() {
        return this.f86744r0;
    }

    public int getOtherCertTag() {
        return this.f86743q0;
    }

    public AttributeCertificate getX509v2AttrCert() {
        return AttributeCertificate.getInstance(this.f86744r0);
    }

    public Certificate getX509v3PKCert() {
        return this.f86742p0;
    }

    public boolean isX509v3PKCert() {
        return this.f86742p0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1Object aSN1Object = this.f86744r0;
        return aSN1Object != null ? new DERTaggedObject(true, this.f86743q0, aSN1Object) : this.f86742p0.toASN1Primitive();
    }

    public CMPCertificate(AttributeCertificate attributeCertificate) {
        this(1, attributeCertificate);
    }

    public CMPCertificate(Certificate certificate) {
        if (certificate.getVersionNumber() != 3) {
            throw new IllegalArgumentException("only version 3 certificates allowed");
        }
        this.f86742p0 = certificate;
    }
}

package org.bouncycastle.asn1.x509;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class AttCertIssuer extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Object f87564p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Primitive f87565q0;

    public AttCertIssuer(GeneralNames generalNames) {
        this.f87564p0 = generalNames;
        this.f87565q0 = generalNames.toASN1Primitive();
    }

    public static AttCertIssuer getInstance(Object obj) {
        if (obj == null || (obj instanceof AttCertIssuer)) {
            return (AttCertIssuer) obj;
        }
        if (obj instanceof V2Form) {
            return new AttCertIssuer(V2Form.getInstance(obj));
        }
        if (obj instanceof GeneralNames) {
            return new AttCertIssuer((GeneralNames) obj);
        }
        if (obj instanceof ASN1TaggedObject) {
            return new AttCertIssuer(V2Form.getInstance((ASN1TaggedObject) obj, false));
        }
        if (obj instanceof ASN1Sequence) {
            return new AttCertIssuer(GeneralNames.getInstance(obj));
        }
        throw new IllegalArgumentException(a.c(obj, "unknown object in factory: "));
    }

    public ASN1Encodable getIssuer() {
        return this.f87564p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87565q0;
    }

    public AttCertIssuer(V2Form v2Form) {
        this.f87564p0 = v2Form;
        this.f87565q0 = new DERTaggedObject(false, 0, v2Form);
    }

    public static AttCertIssuer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}

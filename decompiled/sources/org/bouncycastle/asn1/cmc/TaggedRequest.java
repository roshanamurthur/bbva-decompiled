package org.bouncycastle.asn1.cmc;

import androidx.camera.core.impl.utils.b;
import androidx.emoji2.text.flatbuffer.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.crmf.CertReqMsg;

/* JADX INFO: loaded from: classes12.dex */
public class TaggedRequest extends ASN1Object implements ASN1Choice {
    public static final int CRM = 1;
    public static final int ORM = 2;
    public static final int TCR = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f86737p0 = 2;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Object f86738q0;

    public TaggedRequest(ASN1Sequence aSN1Sequence) {
        this.f86738q0 = aSN1Sequence;
    }

    public static TaggedRequest getInstance(Object obj) {
        if (obj instanceof TaggedRequest) {
            return (TaggedRequest) obj;
        }
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof ASN1Encodable)) {
            if (!(obj instanceof byte[])) {
                throw new IllegalArgumentException(a.c(obj, "unknown object in getInstance(): "));
            }
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unknown encoding in getInstance()");
            }
        }
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(((ASN1Encodable) obj).toASN1Primitive());
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return new TaggedRequest(TaggedCertificationRequest.getInstance(aSN1TaggedObject, false));
        }
        if (tagNo == 1) {
            return new TaggedRequest(CertReqMsg.getInstance(aSN1TaggedObject, false));
        }
        if (tagNo == 2) {
            return new TaggedRequest(ASN1Sequence.getInstance(aSN1TaggedObject, false));
        }
        throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("unknown tag in getInstance(): ")));
    }

    public int getTagNo() {
        return this.f86737p0;
    }

    public ASN1Encodable getValue() {
        return this.f86738q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.f86737p0, this.f86738q0);
    }

    public TaggedRequest(TaggedCertificationRequest taggedCertificationRequest) {
        this.f86738q0 = taggedCertificationRequest;
    }

    public TaggedRequest(CertReqMsg certReqMsg) {
        this.f86738q0 = certReqMsg;
    }
}

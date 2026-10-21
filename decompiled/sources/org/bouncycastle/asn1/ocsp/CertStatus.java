package org.bouncycastle.asn1.ocsp;

import androidx.camera.core.impl.utils.b;
import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class CertStatus extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f87334p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87335q0;

    public CertStatus() {
        this.f87334p0 = 0;
        this.f87335q0 = DERNull.INSTANCE;
    }

    public static CertStatus getInstance(Object obj) {
        ASN1Encodable revokedInfo;
        if (obj == null || (obj instanceof CertStatus)) {
            return (CertStatus) obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(a.c(obj, "unknown object in factory: "));
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        CertStatus certStatus = new CertStatus();
        certStatus.f87334p0 = aSN1TaggedObject.getTagNo();
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            revokedInfo = DERNull.INSTANCE;
        } else if (tagNo != 1) {
            if (tagNo != 2) {
                throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown tag encountered: ")));
            }
            revokedInfo = DERNull.INSTANCE;
        } else {
            revokedInfo = RevokedInfo.getInstance(aSN1TaggedObject, false);
        }
        certStatus.f87335q0 = revokedInfo;
        return certStatus;
    }

    public ASN1Encodable getStatus() {
        return this.f87335q0;
    }

    public int getTagNo() {
        return this.f87334p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.f87334p0, this.f87335q0);
    }

    public CertStatus(int i10, ASN1Encodable aSN1Encodable) {
        this.f87334p0 = i10;
        this.f87335q0 = aSN1Encodable;
    }

    public CertStatus(RevokedInfo revokedInfo) {
        this.f87334p0 = 1;
        this.f87335q0 = revokedInfo;
    }

    public static CertStatus getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}

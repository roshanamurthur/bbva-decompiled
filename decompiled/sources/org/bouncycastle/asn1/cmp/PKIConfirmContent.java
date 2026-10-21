package org.bouncycastle.asn1.cmp;

import androidx.emoji2.text.flatbuffer.a;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;

/* JADX INFO: loaded from: classes12.dex */
public class PKIConfirmContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Null f86784p0 = DERNull.INSTANCE;

    public static PKIConfirmContent getInstance(Object obj) {
        if (obj == null || (obj instanceof PKIConfirmContent)) {
            return (PKIConfirmContent) obj;
        }
        if (!(obj instanceof ASN1Null)) {
            throw new IllegalArgumentException(a.c(obj, "Invalid object: "));
        }
        PKIConfirmContent pKIConfirmContent = new PKIConfirmContent();
        pKIConfirmContent.f86784p0 = (ASN1Null) obj;
        return pKIConfirmContent;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86784p0;
    }
}

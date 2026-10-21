package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: classes12.dex */
public class ContentIdentifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1OctetString f87242p0;

    public ContentIdentifier(ASN1OctetString aSN1OctetString) {
        this.f87242p0 = aSN1OctetString;
    }

    public static ContentIdentifier getInstance(Object obj) {
        if (obj instanceof ContentIdentifier) {
            return (ContentIdentifier) obj;
        }
        if (obj != null) {
            return new ContentIdentifier(ASN1OctetString.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getValue() {
        return this.f87242p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87242p0;
    }

    public ContentIdentifier(byte[] bArr) {
        this(new DEROctetString(bArr));
    }
}

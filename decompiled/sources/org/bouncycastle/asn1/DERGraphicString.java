package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class DERGraphicString extends ASN1Primitive implements ASN1String {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86568p0;

    public DERGraphicString(byte[] bArr) {
        this.f86568p0 = Arrays.clone(bArr);
    }

    public static DERGraphicString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERGraphicString)) {
            return (DERGraphicString) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (DERGraphicString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 25, this.f86568p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERGraphicString) {
            return Arrays.areEqual(this.f86568p0, ((DERGraphicString) aSN1Primitive).f86568p0);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        byte[] bArr = this.f86568p0;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    public byte[] getOctets() {
        return Arrays.clone(this.f86568p0);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return Strings.fromByteArray(this.f86568p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86568p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public static DERGraphicString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof DERGraphicString)) ? getInstance(object) : new DERGraphicString(ASN1OctetString.getInstance(object).getOctets());
    }
}

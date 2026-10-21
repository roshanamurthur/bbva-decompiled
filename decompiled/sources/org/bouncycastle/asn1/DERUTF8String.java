package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class DERUTF8String extends ASN1Primitive implements ASN1String {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86581p0;

    public DERUTF8String(String str) {
        this.f86581p0 = Strings.toUTF8ByteArray(str);
    }

    public static DERUTF8String getInstance(Object obj) {
        if (obj == null || (obj instanceof DERUTF8String)) {
            return (DERUTF8String) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (DERUTF8String) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 12, this.f86581p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERUTF8String) {
            return Arrays.areEqual(this.f86581p0, ((DERUTF8String) aSN1Primitive).f86581p0);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() throws IOException {
        byte[] bArr = this.f86581p0;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return Strings.fromUTF8ByteArray(this.f86581p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86581p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    public DERUTF8String(byte[] bArr) {
        this.f86581p0 = bArr;
    }

    public static DERUTF8String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof DERUTF8String)) ? getInstance(object) : new DERUTF8String(ASN1OctetString.getInstance(object).getOctets());
    }
}

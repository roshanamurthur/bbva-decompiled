package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class DERVisibleString extends ASN1Primitive implements ASN1String {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86585p0;

    public DERVisibleString(String str) {
        this.f86585p0 = Strings.toByteArray(str);
    }

    public static DERVisibleString getInstance(Object obj) {
        if (obj == null || (obj instanceof DERVisibleString)) {
            return (DERVisibleString) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (DERVisibleString) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 26, this.f86585p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof DERVisibleString)) {
            return false;
        }
        return Arrays.areEqual(this.f86585p0, ((DERVisibleString) aSN1Primitive).f86585p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        byte[] bArr = this.f86585p0;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    public byte[] getOctets() {
        return Arrays.clone(this.f86585p0);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return Strings.fromByteArray(this.f86585p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86585p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    public DERVisibleString(byte[] bArr) {
        this.f86585p0 = bArr;
    }

    public static DERVisibleString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof DERVisibleString)) ? getInstance(object) : new DERVisibleString(ASN1OctetString.getInstance(object).getOctets());
    }
}

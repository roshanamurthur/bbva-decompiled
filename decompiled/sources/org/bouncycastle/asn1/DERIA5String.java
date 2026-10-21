package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class DERIA5String extends ASN1Primitive implements ASN1String {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f86569p0;

    public DERIA5String(String str) {
        this(str, false);
    }

    public static DERIA5String getInstance(Object obj) {
        if (obj == null || (obj instanceof DERIA5String)) {
            return (DERIA5String) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
        }
        try {
            return (DERIA5String) ASN1Primitive.fromByteArray((byte[]) obj);
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static boolean isIA5String(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 22, this.f86569p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERIA5String) {
            return Arrays.areEqual(this.f86569p0, ((DERIA5String) aSN1Primitive).f86569p0);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        byte[] bArr = this.f86569p0;
        return j.a(bArr.length) + 1 + bArr.length;
    }

    public byte[] getOctets() {
        return Arrays.clone(this.f86569p0);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        return Strings.fromByteArray(this.f86569p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.f86569p0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    public DERIA5String(String str, boolean z10) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        if (z10 && !isIA5String(str)) {
            throw new IllegalArgumentException("'string' contains illegal characters");
        }
        this.f86569p0 = Strings.toByteArray(str);
    }

    public DERIA5String(byte[] bArr) {
        this.f86569p0 = bArr;
    }

    public static DERIA5String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z10 || (object instanceof DERIA5String)) ? getInstance(object) : new DERIA5String(ASN1OctetString.getInstance(object).getOctets());
    }
}
